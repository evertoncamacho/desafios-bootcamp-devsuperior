## Desafio do Capítulo 03
>Trata-se de um desafio de validação e segurança cujo objetivo é a implementação de determinadas funcionalidades para contemplar os testes existentes. 
---
### Especificações

<p>Apenas as rotas de leitura (GET) de eventos e cidades são públicas. Usuário com role CLIENT podem também inserir (POST) novos eventos. 
Os demais acessos são permitidos apenas a usuários com role ADMIN.</p>

#### Validações de City:

- Nome não pode ser vazio

#### Validações de Event:

- Nome não pode ser vazio
- Data não pode ser passada
- Cidade não pode ser nula

### Tecnologias

<p>Neste projeto foram utilizadas as seguintes tecnologias:</p>

- Java 11
- Spring Boot 2.4.4
- Spring Data JPA
- H2DB
- Maven
- Bean Validation