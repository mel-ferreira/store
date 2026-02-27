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

DOMAIN MODEL 🖇️
  <img width="1361" height="663" alt="image" src="https://github.com/user-attachments/assets/624382a0-5866-4758-af38-0a72608f8970" />
  <img width="1227" height="725" alt="image" src="https://github.com/user-attachments/assets/ef678ada-e986-415c-980c-4a1a4f2ec601" />
  <img width="1082" height="637" alt="image" src="https://github.com/user-attachments/assets/6ce2e8d7-c7d5-495c-8bdc-550ad083239d" />


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

- POST /products
- GET /products
- GET /products/{id}
- PUT /products/{id}
- DELETE /products/{id}

📈 Melhorias futuras
- Deixar código totalmente em inglês ou português
- Refatorar código (Aplicar dependência Lombok)
- Implementar autenticação com JWT
- Dockerizar
- Deploy em nuvem
