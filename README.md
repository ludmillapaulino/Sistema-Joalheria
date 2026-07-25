# Sistema de Joalheria

## Sobre o Projeto:

O Sistema de Joalheria é uma aplicação desenvolvida em Java como atividade da disciplina de Programação Orientada a Objetos (POO).

O sistema possibilita o cadastro, a pesquisa, a remoção e o gerenciamento de joias. Para cada joia são registrados seu nome, material de fabricação e preço.

A aplicação foi desenvolvida utilizando a biblioteca Java Swing para a construção da interface gráfica. Além disso, o projeto utiliza a coleção `Map` para armazenar as informações em memória, Streams para realizar pesquisas e serialização de objetos para permitir que os dados sejam salvos em arquivo e recuperados posteriormente, garantindo a persistência das informações entre diferentes execuções do sistema.

---

## Funcionalidades:

O sistema oferece as seguintes funcionalidades:

- Cadastro de joias;
- Pesquisa de joia pelo nome;
- Pesquisa de joias por material;
- Pesquisa de joias com preço superior ao valor informado;
- Pesquisa da joia mais cara cadastrada;
- Pesquisa da joia mais barata cadastrada;
- Contagem de joias por material;
- Remoção de joias;
- Salvamento dos dados em arquivo;
- Recuperação dos dados previamente salvos.

---

## Tecnologias Utilizadas:

- Java
- Java Swing
- Maven
- JUnit 5
- Collections (Map)
- Java Streams
- Serialização de Objetos (`ObjectInputStream` e `ObjectOutputStream`)

---

## Estrutura do Projeto:

O projeto está organizado em pacotes.

```
src
├── main
│   └── java
│       └── br.ufpb.dcx.joalheria
│           ├── controller
│           ├── gui
│           ├── GravadorDeDados.java
│           ├── Joia.java
│           ├── MATERIAL.java
│           ├── ProgramaPrincipal.java
│           ├── SistemaJoalheria.java
│           └── SistemaJoalheriaInterface.java
│
└── test
    └── java
        └── br.ufpb.dcx.joalheria
            └── SistemaJoalheriaTest.java
```

---

## Interface Gráfica:

A interface gráfica foi desenvolvida utilizando Java Swing e possui:

- Janela principal;
- Barra de menu;
- Botões para as principais funcionalidades;
- Cadastro de joias;
- Pesquisa de joias;
- Remoção de joias;
- Salvamento e recuperação dos dados;
- Ícones ilustrativos;
- Imagem representativa da joalheria;
- Caixas de diálogo para interação com o usuário.

---

## Persistência dos Dados:

Os dados cadastrados são armazenados em arquivo utilizando serialização de objetos por meio das classes `ObjectOutputStream` e `ObjectInputStream`. Dessa forma, as informações permanecem disponíveis mesmo após o encerramento da aplicação.

---

## Testes:

O projeto possui testes desenvolvidos com JUnit para verificar o funcionamento das principais funcionalidades do sistema, incluindo:

- Cadastro de joias;
- Pesquisa por nome;
- Remoção de joias;
- Pesquisa por material;
- Contagem de joias por material.

---

## Discentes:
**Jezrel Gomes de Oliveira**

**José Vitor do Nascimento Rodrigues**

**Leonardo Lucena Bizerril de Brito**

**Ludmilla Paulino Correia**

---

## Disciplina e docente: 

**Programação Orientada a Objetos**

**Ayla Débora Dantas de Souza Rebouças**