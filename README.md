# Projeto: Sistema de Controle de Produção e Estoque para Fonte de Águas Minerais

## Descrição
Este projeto consiste em um estudo de caso focado na otimização do processo de produção e gerenciamento de estoque para a empresa Águas Mineral Sublime, que produz um único produto em cada uma de suas fontes. O objetivo é desenvolver um programa que atenda às necessidades dos diferentes perfis de usuário, incluindo gerentes de produção e estoquistas.

## Passos do Projeto
1. **Análise da Classe:**
   - **Nome da Classe:** ProdutoFonte
   - **Atributos:** Descrição (string), Preço de Custo (decimal), Código do Produto (numérico), Estoque (inteiro)
   - **Métodos:** 
     - Construtor para inicialização dos atributos durante o cadastro do produto
     - Métodos para registrar produção de unidades
     - Método para registrar saída de unidades do estoque

2. **Representação Gráfica:**
   - Usando a notação UML, criamos um diagrama de classe que ilustra a estrutura da classe ProdutoFonte, destacando seus atributos e métodos.

3. **Implementação da Classe:**
   - Desenvolvemos o código da classe ProdutoFonte com os atributos e métodos identificados, garantindo que o estoque seja atualizado corretamente a cada entrada ou saída de produtos.

4. **Desenvolvimento da Aplicação:**
   - Criamos uma aplicação que permite realizar as seguintes ações:
     a) Cadastrar os dados de um novo produto, incluindo descrição, preço de custo e código do produto. O estoque é automaticamente registrado como 0.
     b) Registrar a produção de 1000 unidades do produto, atualizando o estoque.
     c) Registrar a produção de 2000 unidades do produto, também atualizando o estoque.
     d) Registrar a saída de 2500 unidades do produto, garantindo que o estoque não fique negativo.
     e) Registrar a saída de 1000 unidades do produto, novamente atualizando o estoque.

## Requisitos Específicos
- O cadastro de produtos exige descrição, preço de custo e um código numérico.
- Durante o cadastro, o estoque é inicializado como 0.
- A produção e a saída de produtos são registradas de acordo com as quantidades especificadas, mantendo o estoque atualizado e evitando valores negativos.

Com a conclusão deste projeto, a Águas Mineral Sublime terá um sistema eficiente para gerenciar sua produção e estoque, atendendo às necessidades dos gerentes de produção e dos estoquistas, além de garantir a integridade dos dados e a precisão das informações.
