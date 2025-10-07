# Trabalho 1 - Verificação e Validação de Software

> Enzo Tonatto, Lucas Fraga e Pedro Guimarães 

[![Tests](.github/badges/tests.svg)](#) [![Coverage](.github/badges/jacoco.svg)](target/site/jacoco/index.html)

Este projeto contém uma classe Java simples `Square` com um método `isSquare(int n)` que verifica se um número é um quadrado perfeito.

## Testes

O projeto utiliza duas técnicas de teste:

* **JUnit 5:** Para testes baseados em exemplos, cobrindo casos de teste específicos e conhecidos.
* **jqwik:** Para testes baseados em propriedades, que geram uma grande quantidade de dados de teste aleatórios para verificar as propriedades do código.

A documentação detalhada dos casos de teste pode ser encontrada em `tests.md`.

## Coverage

O projeto utiliza o JaCoCo para medir o nível de cobertura de código. A cobertura de código é uma métrica que indica a porcentagem de código que foi executada durante os testes.

A cobertura de código pode ser visualizada no arquivo `target/site/jacoco/index.html`.

## Como executar os testes e gerar o relatório de cobertura de código

1. Clone este repositório: `git clone https://github.com/enzotonatto/t1-verival.git`
2. Navegue até o diretório do projeto: `cd t1-verival`
3. Compile o projeto: `mvn compile`
4. Execute os testes: `mvn test`
5. Gere o relatório de cobertura de código: `mvn jacoco:report`
6. Abra o relatório de cobertura de código no navegador: `target/site/jacoco/index.html`