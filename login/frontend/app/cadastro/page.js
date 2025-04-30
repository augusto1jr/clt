'use client';
import Link from "next/link";
import { useState } from 'react';

export default function Cadastro() {
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');

  const handleCadastro = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch('http://localhost:8080/api/cadastro', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ email, senha }),
      });

      if (response.ok) {
        window.alert('Usuário cadastrado com sucesso!');
        console.log('Usuário cadastrado com sucesso!');
        // Redirecionar ou mostrar mensagem
      } else {
        window.alert('Erro ao cadastrar usuário');
        console.error('Erro ao cadastrar usuário');
      }
    } catch (error) {
        window.alert('Erro na requisição');
        console.error('Erro na requisição:', error);
    }
  };

  return (
    <main id="cadastro">
      <section id="login">
        <div id="img">
          {/* Imagem de fundo já aplicada via CSS */}
        </div>
        <div id="form">
          <h1>Cadastro</h1>
          <form onSubmit={handleCadastro}>
            <div className="campo">
              <label htmlFor="email">Email:</label><br />
              <input
                type="email"
                id="email"
                name="email"
                placeholder="Digite seu email"
                value={email}
                onChange={e => setEmail(e.target.value)}
                required
              />
            </div>

            <div className="campo">
              <label htmlFor="senha">Senha:</label><br />
              <input
                type="password"
                id="senha"
                name="senha"
                placeholder="Digite sua senha"
                value={senha}
                onChange={e => setSenha(e.target.value)}
                required
              />
            </div>

            <div id="btn_cadastro">
              <button type="submit">Cadastrar</button>
            </div>

            <div id="btn_forgot">
              <Link href="/">Já tem uma conta? Faça login</Link>
            </div>
          </form>
        </div>
      </section>
    </main>
  );
}
