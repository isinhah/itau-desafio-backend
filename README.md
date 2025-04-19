# Desafio Back-end Itaú Unibanco
API REST que recebe Transações e retorna Estatísticas sobre essas transações. 

Link do desafio: [itau-desafio-backend](https://github.com/feltex/desafio-itau-backend/tree/main)

### Tecnologias utilizadas
- Java
- Spring Boot
- DevTools
- Lombok

### Endpoints

`POST /transacao`

Este endpoint irá receber as transações, cada transação consiste de um `valor` e uma `dataHora` de quando ela aconteceu.

```json
{
    "valor": 123.45,
    "dataHora": "2020-08-07T12:34:56.789-03:00"
}
```

`GET /estatistica`

Este endpoint retorna estatísticas das transações que **aconteceram nos últimos 60 segundos (1 minuto)**.

```json
{
    "count": 10,
    "sum": 1234.56,
    "avg": 123.456,
    "min": 12.34,
    "max": 123.56
}
```


### Requisitos

- Todos os commits **DEVEM** ser feitos pelo mesmo usuário que criou o projeto
- **DEVE** seguir exatamente os _endpoints_ descritos a seguir
  - Por exemplo, `/transacao` não é a mesma coisa que `/transacoes`
- **DEVE** aceitar e responder com objetos exatamente como descritos a seguir
  - Por exemplo, `dataHora` não é a mesma coisa que `data-hora` ou `dtTransacao`
- **NÃO DEVE** utilizar quaisquer sistemas de banco de dados (como H2, MySQL, PostgreSQL, ...) ou cache (como Redis, Memcached, Infinispan, ...)
- **DEVE** armazenar todos os dados **em memória**
- **DEVE** aceitar e responder apenas com [JSON](https://www.json.org/json-pt.html)

### Configuração e Execução
Pré-requisitos: Java 17 e Maven

1. clone o repositório
2. acesse o diretório do projeto

```bash
# instale as dependências do Maven
mvn clean install

# execute a aplicação
mvn spring-boot:run

# pressione (ctrl + c) para encerrar a aplicação
```

### Autor

- Projeto desenvolvido por [Isabel Henrique](https://www.linkedin.com/in/isabel-henrique/)
- Fique à vontade para contribuir!
