# CRUD EM JAVA E MYSQL

Este projeto e um crud feito em linguagem JAVA com banco de dados em MySQL.
O objetivo deste projeto e estruturar um crud simples, conectando a aplicacao com um banco de dados local.

## Pacotes e classes do projeto:
Pacote db:
```
Possui classes vinculadas a configuraçoes do banco de dados.
Classe DbException: utilizada para criar 
Classe DB: utilizada para gerenciar a conexao com o banco de dados.
Classe DbIntegrityException: excessao personalizada para a classe Delete. 
```

Pacote Application
```
Possui as classes de aplicaçao do sistema. Todas as classes criam conexao com o banco de dados.
Classe Get: realiza a consulta dos dados de tabelas. 
Classe Insert: realiza a inserçao de dados em tabelas.
Classe Update: realiza a atualizaçao de dados de acordo com um parametro estabelecido.
Classe Delete: realiza a exclusao de dados. Nesta classe foi criado uma excessao personalizada "DbIntegrityException" para quando ocorre erros na exclusao.
``` 
