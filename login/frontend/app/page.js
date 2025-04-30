'use client';
import './globals.css';
import Link from "next/link";
import { useState } from 'react';

export default function Login() {
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch('http://localhost:8080/api/login', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ email, senha }),
      });

      if (response.ok) {
        const resposta = await response.text();
        if (resposta.includes("sucesso")) {
          window.alert("Login realizado com sucesso!");
        } else {
          window.alert("Email ou senha incorretos");
        }
      } else {
        window.alert('Usuário ou senha incorretos');
        console.error('Falha no login');
      }
    } catch (error) {
      window.alert('Erro na requisição');
      console.error('Erro na requisição:', error);
    }
  };

  return (
    <main>
      <section id="login">
        <div id="img">
          {/* Imagem aplicada via CSS */}
        </div>

        <div id="form">
          <h1>Login</h1>
          <form onSubmit={handleLogin} autoComplete="on">
            {/* Campo de Email */}
            <div id="email">
              <span className="material-symbols-outlined" id="person"></span>
              <label htmlFor="id_email">Email:</label><br />
              <input
                type="email"
                name="email"
                id="id_email"
                autoComplete="email"
                value={email}
                onChange={e => setEmail(e.target.value)}
                required
                placeholder="exemplo@email.com"
              />
            </div>

            {/* Campo de Senha */}
            <div id="password">
              <span className="material-symbols-outlined" id="lock"></span>
              <label htmlFor="id_senha">Senha:</label><br />
              <input
                type="password"
                name="senha"
                id="id_senha"
                autoComplete="current-password"
                value={senha}
                onChange={e => setSenha(e.target.value)}
                required
                placeholder="********"
              />
            </div>

            {/* Botão de Login */}
            <div id="btn_login">
              <button type="submit">Login</button>
            </div>

            {/* Botão de Cadastro */}
            <div id="btn_cadastro">
              <Link href="/cadastro">
                <button type="button">Cadastrar</button>
              </Link>
            </div>

            {/* Link para Recuperar Senha */}
            <div id="btn_forgot">
              <a href="#">Esqueceu a senha?</a>
            </div>
          </form>
        </div>
      </section>
    </main>
  );
}
