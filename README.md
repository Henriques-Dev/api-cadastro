
# 🧾 Cadastro de Usuários - CRUD com Spring Boot

### 🔧 Tecnologias Utilizadas

<p align="left"> 
<img src="https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white" title="Java"/> 
<img src="https://img.shields.io/badge/Spring%20Boot-3.5.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" title="Spring Boot"/> 
<img src="https://img.shields.io/badge/Spring%20Data%20JPA-JPA-59666C?style=for-the-badge&logo=spring&logoColor=white" title="Spring Data JPA"/> 
<img src="https://img.shields.io/badge/H2-Database-blue?style=for-the-badge" title="H2 Database"/> 
</p>

---

## 📖 Descrição

Este projeto é uma **API REST simples** de cadastro de usuários desenvolvida com Java 17 e Spring Boot 3.5.2.
O principal objetivo é demonstrar a criação de um CRUD básico utilizando **Spring Web**, **Spring Data JPA** e banco de dados **em memória (H2)**.

O projeto foi desenvolvido com fins **educacionais** e para **exercitar boas práticas** no desenvolvimento de APIs RESTful.

---

## ✅ Funcionalidades

* Criar usuários
* Listar todos os usuários
* Buscar usuário por ID
* Atualizar dados de um usuário
* Deletar um usuário

---

## 🚀 Como rodar o projeto localmente

### ✅ Pré-requisitos

* Java 17 instalado
* Maven instalado (ou utilizar o wrapper `./mvnw`)

### 📦 Etapas

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Navegue até o diretório do projeto
cd nome-do-projeto

# Execute a aplicação
./mvnw spring-boot:run
```

---
## 🌐 Como usar

1. Acesse `http://localhost:8080/h2-console` para visualizar o banco em memória (H2).
2. Utilize ferramentas como **Insomnia** ou **Postman** para testar os endpoints REST da API:

    * `POST /api/usuarios`
    * `GET /api/usuarios`
    * `GET /api/usuarios/{id}`
    * `PUT /api/usuarios/{id}`
    * `DELETE /api/usuarios/{id}`

---

## 📄 Licença

Este projeto é disponibilizado apenas para **fins educacionais** ou como **fonte de inspiração**.
Não deve ser utilizado em produção sem as devidas adaptações e garantias de segurança.
