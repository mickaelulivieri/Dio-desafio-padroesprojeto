Projeto Controle de Estoque
Este projeto foi criado para um desafio da plataforma DIO (Digital Innovation One), que pediu para a gente usar um padrão de projeto para organizar o código.

Eu escolhi trabalhar com a arquitetura de camadas, que ajuda a deixar o código mais organizado e fácil de entender. A aplicação está dividida em partes claras:

Model: onde ficam as entidades (os dados que a gente salva).

Repository: que cuida de conversar com o banco de dados.

Service: onde fica a lógica do sistema, as regras do negócio.

Controller: que recebe os pedidos da API e responde para quem está usando.

Usei o banco H2 no modo persistente, assim os dados ficam salvos enquanto o projeto está rodando, facilitando os testes.

Esse projeto é um exemplo simples, mas prático, de como usar arquitetura de camadas para construir uma API REST de controle de estoque.