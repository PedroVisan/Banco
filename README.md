🏦 Banco - Sistema Bancário em Java

Simulação de sistema bancário desenvolvido em Java, aplicando conceitos de Programação Orientada a Objetos (POO) como encapsulamento, reutilização de métodos e separação de responsabilidades.

A aplicação funciona via terminal, permitindo interação do usuário através de um menu com operações bancárias básicas.

🚀 Funcionalidades

✅ Consultar saldo

✅ Consultar limite do cheque especial

✅ Consultar valor utilizado do cheque especial

✅ Realizar saque

✅ Realizar depósito

✅ Pagar boleto

✅ Validação de operações

✅ Menu interativo via terminal

🧠 Conceitos de POO aplicados

Encapsulamento

Reaproveitamento de métodos

Separação entre regra de negócio e interface

Uso de construtor para definição de estado inicial

Retorno boolean para controle de operações

💰 Regras do Sistema

Contas com saldo inicial até R$ 500 possuem limite de cheque especial de R$ 50.

Contas com saldo acima de R$ 500 possuem limite de 50% do saldo inicial.

Ao utilizar o cheque especial, uma taxa de 20% é aplicada sobre o valor utilizado no momento do depósito.

Operações inválidas são tratadas pelo sistema.

🛠 Tecnologias utilizadas

Java

Scanner (entrada de dados via terminal)

Como executar

Clone o repositório:

git clone https://github.com/seu-usuario/banco.git


Compile:

javac App.java


Execute:

java App

📈 Possíveis melhorias futuras

Implementar herança (ContaCorrente / ContaPoupanca)

Criar sistema de extrato

Permitir múltiplas contas

Persistência de dados em arquivo

Interface gráfica

👨‍💻 Autor: Pedro Viana Santos

Desenvolvido como prática de Programação Orientada a Objetos em Java.
