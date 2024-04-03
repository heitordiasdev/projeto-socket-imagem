# Sistema Cliente-Servidor com Sockets para Transferência de Imagens

## Descrição do Projeto

Este é um mini projeto com arquitetura simples para estudos que envolve a criação de um sistema cliente-servidor utilizando sockets. O objetivo é permitir que um cliente envie uma imagem para o servidor, que por sua vez deve salvar a imagem no disco e retornar o caminho onde a imagem foi armazenada.

## Como Funciona

O cliente lê uma imagem de um arquivo e a envia para o servidor através de um socket. O servidor recebe a imagem, salva-a em um arquivo no disco e envia de volta ao cliente o caminho do arquivo onde a imagem foi salva.

## Tecnologias Utilizadas

- Java: A linguagem de programação utilizada para desenvolver o sistema.

## Como Executar

1. Compile e execute o servidor.
2. Compile e execute o cliente, certificando-se de que a imagem que você deseja enviar esteja no diretório correto.
3. Verifique a resposta do servidor para encontrar o caminho do arquivo onde a imagem foi salva.

## Licença

Este projeto está licenciado sob a licença MIT.
