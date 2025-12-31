package br.dev.brunorsch.maria.exercicios;

import static br.dev.brunorsch.maria.utils.Input.input;

public class PythonNoJava {
    // Copia do exercicio de input do vídeo #4 da série do Guanabara
    public static void main(String[] args) {
        var nome = input("Qual é o seu nome?");
        var idade = input("Quantos anos vc tem?");
        var peso = input("Qual é o seu peso?");

        // Ver sobre o printf em: https://www.baeldung.com/java-printstream-printf
        System.out.printf("%s %s %s%n", nome, idade, peso);
    }
}
