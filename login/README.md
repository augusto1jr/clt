# 💪 Sistema de Login – Projeto Full Stack

Este projeto é uma aplicação de cadastro e login simples, feita com **Java + Spring Boot** no backend e **Next.js** no frontend.

---

## 🧰 Tecnologias utilizadas

- ⚙️ Backend: Java 17, Spring Boot, MySQL
- 🖥️ Frontend: Next.js, React
- 🗄️ Banco de Dados: MySQL

---

## 🚀 Como rodar o projeto

### 1️⃣ Criar o banco de dados

Abra o **MySQL Workbench** e execute o script abaixo para criar o banco e as tabelas:

```sql
login_script.sql
```

---

### 2️⃣ Backend (Java + Spring Boot)

#### ✅ Pré-requisitos:
- Java 17 ou superior
- Maven instalado
- MySQL rodando localmente

#### ▶️ Rodando o backend:

```bash
cd backend
```

1. Instale as dependências (se necessário):

```bash
mvn clean install
```

2. Inicie a aplicação:

- **Via terminal**:

```bash
mvn spring-boot:run
```

- **Ou via IDE (ex: IntelliJ/Eclipse)**:  
Abra e execute o arquivo:

```
src/main/java/com/login/LoginApplication.java
```

📡 O backend ficará disponível em: `http://localhost:8080/`

---

### 3️⃣ Frontend (Next.js)

#### ✅ Pré-requisitos:
- Node.js 18 ou superior

#### ▶️ Rodando o frontend:

```bash
cd frontend
```

1. Instale as dependências:

```bash
npm install
```

2. Inicie a aplicação:

```bash
npm run dev
```

🌐 A aplicação estará disponível em: [http://localhost:3000](http://localhost:3000)

---

## 🧪 Como usar

1. Acesse [http://localhost:3000](http://localhost:3000)
2. Cadastre-se com um email e senha
3. Faça login com as credenciais cadastradas

---

## 🏁 Fim

Projeto finalizado com sucesso. Obrigado por conferir! 🙌

---