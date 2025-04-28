CREATE DATABASE login;

USE login;

-- Criação da tabela 'user'
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL
);

-- Inserção de 5 usuários
INSERT INTO usuario (email, senha) VALUES 
('usuario1@example.com', 'senha123'),
('usuario2@example.com', 'senha456'),
('usuario3@example.com', 'senha789'),
('usuario4@example.com', 'senhaabc'),
('usuario5@example.com', 'senhadef');
