package br.dev.brunorsch.maria.utils;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String input() {
        return input(null);
    }

    public static String input(String prompt) {
        System.out.print((prompt == null ? "" : prompt.trim()) + " ");
        try {
            return SCANNER.nextLine();
        } catch (NoSuchElementException e) {
            return "";
        } catch (IllegalStateException e) {
            return "";
        }
    }
}
