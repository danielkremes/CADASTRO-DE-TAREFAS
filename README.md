# API de cadastro de tarefas

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

Projeto em ação versão atualizada com docker compose [nesse video](https://youtu.be/h1xlF-xYn68) 

Projeto em ação [nesse vídeo](https://youtu.be/jQhEwjofTnU).

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Docker Compose](https://spring.io/blog/2023/06/21/docker-compose-support-in-spring-boot-3-1)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Variáveis de ambiente para garantir segurança de credencias do banco de dados
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080/v1/api_tasks/).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [postman](https://www.postman.com/):

- Criar Tarefa 
```
{
    "name": "Desc Todo 1",
    "description": "teste",
    "realized": true,
    "priority": "LOW"
}
```
- Listar Tarefas
```
{
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
}
```
- Atualizar Tarefa
```
{
    "name": "Desc Todo 1",
    "description": "teste",
    "realized": true,
    "priority": "LOW"
}
```

- Remover Tarefa
```
localhost:8080/v1/api_tasks/1
[ ]
```