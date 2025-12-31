package br.dev.brunorsch.maria.exercicios.primeiro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Completar os testes unitários para a classe Calculadora.
 * NÃO PODE alterar a classe de teste, nem nenhum dos códigos de teste.
 * Apenas implementar os métodos faltantes que estão quebrando.
 */
class CalculadoraTest {
    @Test
    void deveSomarDoisNumeros() {
        //Arrange
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.somar(2, 3);

        //Assert
        assertEquals(5, resultado);
    }

    @Test
    void deveSubtrairUmNumeroDoOutro() {
        //Arrange
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.subtrair(10, 7);

        //Assert
        assertEquals(3, resultado);
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        //Arrange
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.multiplicar(4, 5);

        //Assert
        assertEquals(20, resultado);
    }

    @Test
    void deveDividirUmNumeroPeloOutro() {
        //Arrange
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.dividir(20, 4);

        //Assert
        assertEquals(5, resultado);
    }

    @Test
    void deveCalcularOQuadradoDeUmNumero() {
        //Arrange
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.quadrado(12);

        //Assert
        assertEquals(144, resultado);
    }

    @Test
    void deveCalcularARaizQuadradaDeUmNumero() {
        //Arrange
        Calculadora calculadora = new Calculadora();

        //Act
        int resultado = calculadora.raizQuadrada(169);

        //Assert
        assertEquals(13, resultado);
    }
}
