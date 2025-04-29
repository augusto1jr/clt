export default function Cadastro() {
    return (
      <main>
        <section id="cadastro">
          <h1>Cadastro</h1>
          <form>
            <div>
              <label htmlFor="email">Email:</label><br />
              <input type="email" id="email" name="email" required />
            </div>
            <div>
              <label htmlFor="senha">Senha:</label><br />
              <input type="password" id="senha" name="senha" required />
            </div>
            <div>
              <input type="submit" value="Cadastrar" />
            </div>
          </form>
        </section>
      </main>
    );
  }
  