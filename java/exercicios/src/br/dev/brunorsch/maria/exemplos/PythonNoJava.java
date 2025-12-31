package br.dev.brunorsch.maria.exemplos;

import static br.dev.brunorsch.maria.utils.Input.input;

import java.util.Scanner;

public class PythonNoJava {
    public static void main(String[] args) {
        System.out.println("Usando o clone do Python:");
        cloneDoPython();
        System.out.println("\nUsando java Puro:");
        javaPuro();
    }

    // Copia do exercicio de input do vídeo #4 da série do Guanabara
    static void cloneDoPython() {
        var nome = input("Qual é o seu nome?");
        var idade = input("Quantos anos vc tem?");
        var peso = input("Qual é o seu peso?");

        // Ver sobre o printf em: https://www.baeldung.com/java-printstream-printf
        System.out.printf("%s %s %s%n", nome, idade, peso);
    }

    static void javaPuro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Quantos anos vc tem? ");
        int idade = scanner.nextInt();

        System.out.print("Qual é o seu peso? ");
        double peso = scanner.nextDouble();

        System.out.printf("%s %s %s%n", nome, idade, peso);
    }
}
