# Documentação dos Testes

## JUnit 5 (Testes Baseados em Exemplos)

Os seguintes casos de teste foram implementados usando JUnit 5:

* **`testIsSquare_withPerfectSquare()`**: Verifica se o método retorna `true` para um quadrado perfeito (ex: 81).
* **`testIsSquare_withNonSquareNumber()`**: Verifica se o método retorna `false` para um número que não é um quadrado perfeito (ex: 80).
* **`testIsSquare_withZero()`**: Verifica se o método retorna `true` para o número 0.
* **`testIsSquare_withNegativeNumber()`**: Verifica se o método retorna `false` para um número negativo (ex: -1).
* **`testIsSquare_withOne()`**: Verifica se o método retorna `true` para o número 1.

## jqwik (Testes Baseados em Propriedades)

As seguintes propriedades foram verificadas usando jqwik:

* **`isSquareOfSquareShouldBeTrue(int n)`**: Para qualquer inteiro `n`, o resultado de `isSquare(n*n)` deve ser sempre `true`.
* **`isSquareForNegativeShouldBeFalse(int n)`**: Para qualquer inteiro negativo `n`, o resultado de `isSquare(n)` deve ser sempre `false`.