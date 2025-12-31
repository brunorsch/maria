package br.dev.brunorsch.maria;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        scanner.close();

        System.out.println("Outros exercicios e exemplos estão disponíveis nos subpacotes!");

        final AtomicBoolean rodando = new AtomicBoolean(true);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nFinalizando a aplicação...");
            rodando.set(false);
        }));

        while (rodando.get()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}