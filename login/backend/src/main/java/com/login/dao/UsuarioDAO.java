package com.login.dao;

import com.login.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

    // Método para buscar um usuário pelo email
    Usuario findByEmail(String email);
}
