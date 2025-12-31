package br.dev.brunorsch.maria.exercicios.segundo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveCriarPessoaComNomeEIdade() {
        Pessoa pessoa = new Pessoa("Bruno", 25);

        assertEquals("Bruno", pessoa.getNome());
        assertEquals(25, pessoa.getIdade());
    }

    @Test
    void deveFazerAniversario() {
        Pessoa pessoa = new Pessoa("Maria", 18);

        pessoa.fazerAniversario();

        assertEquals(19, pessoa.getIdade());
    }

    @Test
    void deveSerMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Carlos", 18);

        assertTrue(pessoa.isMaiorDeIdade());
    }

    @Test
    void naoDeveSerMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", 17);

        assertFalse(pessoa.isMaiorDeIdade());
    }

    // Aprender sobre exceptions para fazer esse
    @Test
    void naoDevePermitirIdadeNegativa() {
        assertThrows(IllegalArgumentException.class,
            () -> new Pessoa("Pessoa com erro", -1));
    }
}