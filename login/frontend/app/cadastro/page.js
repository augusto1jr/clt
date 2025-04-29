export default function Cadastro() {
    return (
      <main id="cadastro">
        <section id="login">
          <div id="img">
            {/* Imagem de fundo já aplicada via CSS */}
          </div>
          <div id="form">
            <h1>Cadastro</h1>
            <form>
              <div className="campo">
                <label htmlFor="email">Email:</label><br />
                <input
                  type="email"
                  id="email"
                  name="email"
                  placeholder="Digite seu email"
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
                  required
                />
              </div>
  
              <div id="btn_cadastro">
                <button type="submit">Cadastrar</button>
              </div>
  
              <div id="btn_forgot">
                <a href="/">Já tem uma conta? Faça login</a>
              </div>
            </form>
          </div>
        </section>
      </main>
    );
  }
  