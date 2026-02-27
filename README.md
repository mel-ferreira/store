# 🛒 Store API

API REST para gerenciamento de produtos e pedidos de uma loja.

---

## 📌 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos de:

- Programação Orientada a Objetos
- Arquitetura em camadas
- JPA / Hibernate
- Boas práticas 
- Tratamento de exceções
- Relacionamentos 1:N e N:N

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2/Hibernate
- Maven

---

## 🏗️ Arquitetura

O projeto segue arquitetura em camadas:

controller → service → repository → entity

Separação entre:

- Entity (modelo do banco)
- Controllers (Resource do projeto)
- Test (Testar banco de dados H2)
- Repository (acesso a dados)
- Service (regras de negócio)

---

## ⚙️ Como rodar o projeto

- Clone o repositório
- Configure o banco no application.properties
- Rode a aplicação
- A API estará disponível em: http://localhost:8080

📬 Principais endpoints
📦 Produto

POST /products
GET /products
GET /products/{id}
PUT /products/{id}
DELETE /products/{id}

📈 Melhorias futuras
Deixar código totalmente em inglês ou português
Refatorar código (Aplicar dependência Lombok)
Implementar autenticação com JWT
Dockerizar
Deploy em nuvem
