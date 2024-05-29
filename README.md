# CRUD de Clientes

Este projeto é um CRUD completo de web services REST para gerenciar um recurso de clientes, desenvolvido como parte do módulo de Back End da Formação Desenvolvedor Moderno. O projeto utiliza Spring Boot, Maven e Java, e está configurado para usar o banco de dados H2 em ambiente de testes.

## Funcionalidades

O projeto inclui as cinco operações básicas de um CRUD:
1. **Busca paginada de recursos**
2. **Busca de recurso por id**
3. **Inserção de novo recurso**
4. **Atualização de recurso**
5. **Deleção de recurso**

## Especificações da Entidade

A entidade `Client` possui os seguintes atributos:
- `id` (Long)
- `name` (String)
- `cpf` (String)
- `income` (Double)
- `birthDate` (LocalDate)
- `children` (Integer)

## Regras de Validação

- **Nome**: Não pode ser vazio.
- **Data de nascimento**: Não pode ser uma data futura (use `@PastOrPresent`).

## Tratamento de Exceções

- **Id não encontrado**: Retorna código 404 para GET por id, PUT e DELETE.
- **Erro de validação**: Retorna código 422 e mensagens customizadas para cada campo inválido.

## Requisitos do Projeto

1. **Ambiente de Testes**: Configurado para acessar o banco de dados H2.
2. **Maven**: Utilizado como gerenciador de dependências.
3. **Java**: Linguagem de programação utilizada.
4. **Seed de Dados**: Projeto deve conter pelo menos 10 clientes com dados significativos.

## Endpoints

### Busca de Cliente por Id

GET /clients/{id}

- Retorna cliente existente.
- Retorna 404 para cliente inexistente.

### Busca Paginada de Clientes

GET /clients?page=0&size=6&sort=name

- Retorna listagem paginada corretamente.

### Inserção de Novo Cliente

POST /clients
{
"name": "Maria Silva",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}

- Insere cliente com dados válidos.
- Retorna 422 e mensagens customizadas com dados inválidos.

### Atualização de Cliente

PUT /clients/{id}
{
"name": "Maria Silvaaa",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}

- Atualiza cliente com dados válidos.
- Retorna 404 para cliente inexistente.
- Retorna 422 e mensagens customizadas com dados inválidos.

### Deleção de Cliente

DELETE /clients/{id}

- Deleta cliente existente.
- Retorna 404 para cliente inexistente.

## Importação do Projeto

O projeto pode ser clonado do GitHub e importado na IDE sem necessidade de qualquer configuração especial.

## Testes Manuais

Os seguintes testes podem ser realizados manualmente usando o Postman:

1. **Busca por Id**:

GET /clients/1


2. **Busca Paginada**:

GET /clients?page=0&size=6&sort=name


3. **Inserção de Cliente**:

POST /clients
{
"name": "Maria Silva",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}


4. **Atualização de Cliente**:

PUT /clients/1
{
"name": "Maria Silvaaa",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}


5. **Deleção de Cliente**:

DELETE /clients/1


## Checklist de Testes

1. Busca por id retorna cliente existente.
2. Busca por id retorna 404 para cliente inexistente.
3. Busca paginada retorna listagem paginada corretamente.
4. Inserção de cliente insere cliente com dados válidos.
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos.
6. Atualização de cliente atualiza cliente com dados válidos.
7. Atualização de cliente retorna 404 para cliente inexistente.
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos.
9. Deleção de cliente deleta cliente existente.
10. Deleção de cliente retorna 404 para cliente inexistente.

## Contribuição

Sinta-se à vontade para abrir issues e enviar pull requests. Todas as contribuições são bem-vindas!

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais informações.

---

Projeto desenvolvido como parte do módulo de Back End da Formação Desenvolvedor Moderno da [DevSuperior](https://devsuperior.com.br).
