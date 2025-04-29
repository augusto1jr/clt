'use client';
import './globals.css';

export default function LoginPage() {
  return (
    <main>
      <section id="login">
        <div id="img">
          {/* Adicione uma imagem, se necessário */}
        </div>

        <div id="form">
          <h1>Login</h1>
          <form action="login.js" method="post" autoComplete="on">
            {/* Campo de Email */}
            <div id="email">
              <span className="material-symbols-outlined" id="person"></span>
              <label htmlFor="id_email">Email:</label> <br />
              <input
                type="email"
                name="email"
                id="id_email"
                autoComplete="email"
                required
                size="30"
                placeholder="exemplo@email.com"
              />
            </div>

            {/* Campo de Senha */}
            <div id="password">
              <span className="material-symbols-outlined" id="lock"></span>
              <label htmlFor="id_senha">Senha:</label> <br />
              <input
                type="password"
                name="senha"
                id="id_senha"
                autoComplete="current-password"
                required
                minLength="8"
                maxLength="20"
                size="30"
                placeholder="********"
              />
            </div>

            {/* Botão de Login */}
            <div id="btn_login">
              <input type="submit" value="Login" />
            </div>

            {/* Botão de Cadastro */}
            <div id="btn_cadastro">
              <input type="submit" value="Cadastrar-se" />
            </div>

            {/* Link para Recuperar Senha */}
            <div id="btn_forgot">
              <a href="">Esqueceu a senha?</a>
            </div>
          </form>
        </div>
      </section>
    </main>
  );
}
