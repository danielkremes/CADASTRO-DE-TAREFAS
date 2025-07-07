# API de cadastro de tarefas

# Desafio sistema de gerenciamento de tarefas (To-Do List)

Projeto em ação versão atualizada com docker compose [nesse video](https://youtu.be/h1xlF-xYn68) 

Projeto em ação [nesse vídeo](https://youtu.be/jQhEwjofTnU).

## Descrição
- Desenvolva uma aplicação web utilizando uma linguagem de programação e um framework de sua escolha. A aplicação deve consistir em um sistema de gerenciamento de tarefas, 
onde os usuários podem
- criar
- visualizar
- editar
- excluir tarefas

## Requisitos
- Usar banco de dados
- Campos mínimos da entidade de tarefa
    - Nome
    - Descrição
    - Realizado
    - Prioridade

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
