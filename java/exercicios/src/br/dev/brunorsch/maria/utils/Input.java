package br.dev.brunorsch.maria.utils;

import java.util.Scanner;

public class Input {
    public static String input(String prompt) {
        System.out.print(prompt.trim() + " ");
        try(Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
