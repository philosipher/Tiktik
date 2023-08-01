# PublicPlay

Este é um projeto CRUD (Create, Read, Update, Delete) utilizando Spring framework.
Esta aplicação utiliza RESTful API endpoints para gerenciar dados em um MYSQL database.

## Tabela de Conteúdos
- [Introdução](#Introdução)
- [Preview](#Preview)
- [Tecnologias](#Tecnologias)
- [Configuração](#Configuração)
- [API](#api-routes)
- [Autor](#author)

## Introdução
O projeto a seguir visa cadastrar um usuário e armazenar seus dados
em um banco de dados fazendo uma linkagem com outros usuários com dados semelhantes.

## Preview
O aplicativo da web inclui os seguintes recursos:

### Server
- Estrutura de um projeto Spring
- Modelo de Usuário
- Modelo de Controller
- Modelo de Repository
- Propriedades do Servidor
- Dependências do Servidor
- Banco de dados com MYSQL
- Gerenciamento e consulta MYSQL

## Tecnologias
O projeto utiliza as seguintes tecnologias:

- Backend: Spring Boot
- Database: MySQL

## Configuração
...

### Web
Ainda sem atualização web.

## API
As seguintes rotas da API estão disponíveis:

- [POST] Create User: /play
- [PUT] Update User: /play/Important{ID}
- [PUT] Update User: /play/Default{ID}
- [GET] Get User: /{ID}
- [GET] Get All Users: /play
- [DELETE] Delete User: /play/{ID}

## Autor
Esse projeto foi desenvolvido por [Diogo Vilela](https://diogovilela12.github.io/Portfolio/)
