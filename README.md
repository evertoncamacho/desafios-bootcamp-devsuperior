# Desafios Bootcamp DevSuperior
> Repositório com os desafios desenvolvidos durante o bootcamp promovido pela DevSuperior.
---
## Desafio do Capítulo 01
<p>Este desafio consiste no desenvolvimento de um projeto Spring Boot 2.4.4 contendo um CRUD completo de web services REST para acessar um recurso de clientes. As cinco operações desenvolvidas foram: 

- [x] Busca paginada de recursos
- [x] Busca de recurso por id
- [x] Inserir novo recurso
- [x] Atualizar recurso
- [x] Deletar recurso
  
### Tecnologias

Neste projeto foram utilizadas as seguintes tecnologias:

- Java 11
- Spring Boot 2.4.4
- Spring Data JPA
- H2DB
- Maven
  
### Endpoints

| Verbo HTTP |                       Resource path                        |                          Descrição |
| ---------- | :--------------------------------------------------------: | ---------------------------------: |
| GET        | /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name  |         Busca paginada de clientes |
| GET        | /clients/1                                                 |         Busca de cliente por id    |
| POST       | /clients                                                   |         Inserção de novo cliente   |
| PUT        | /clients/1                                                 |         Atualização de cliente     |
| DELETE     | /clients/1                                                 |         Deleção de cliente         |
