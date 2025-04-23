package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TesteHibernate {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Augusto");
        p.setIdade(25);

        savePessoa(p);

        Pessoa encontrada = getPessoaById(1L);
        if (encontrada != null) {
            System.out.println("Pessoa encontrada: " + encontrada.getNome() + ", " + encontrada.getIdade() + " anos");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
        
        deletePessoaById(2L);
        
        updatePessoa(3L, "Augusto Júnior", 26);
    }
    

    public static void savePessoa(Pessoa p) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
        session.persist(p);
        session.getTransaction().commit();

        session.close();
        factory.close();

        System.out.println("Pessoa salva com sucesso!");
    }
    

    public static Pessoa getPessoaById(Long id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Pessoa pessoa = session.get(Pessoa.class, id);

        session.close();
        factory.close();

        return pessoa;
    }
    
    
    public static void deletePessoaById(Long id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Pessoa pessoa = session.get(Pessoa.class, id);
        if (pessoa != null) {
            session.beginTransaction();
            session.remove(pessoa);
            session.getTransaction().commit();
            System.out.println("Pessoa deletada com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada.");
        }

        session.close();
        factory.close();
    }
    
    
    public static void updatePessoa(Long id, String novoNome, int novaIdade) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Pessoa pessoa = session.get(Pessoa.class, id);
        if (pessoa != null) {
            session.beginTransaction();
            pessoa.setNome(novoNome);
            pessoa.setIdade(novaIdade);
            session.getTransaction().commit();
            System.out.println("Pessoa atualizada com sucesso!");
            System.out.println("Novos dados -> Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada.");
        }

        session.close();
        factory.close();
    }
}
