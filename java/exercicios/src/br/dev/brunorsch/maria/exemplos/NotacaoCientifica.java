package br.dev.brunorsch.maria.exemplos;

import java.text.DecimalFormat;

public class NotacaoCientifica {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###########");
        double largeNumber = 6e23;
        System.out.println("Large Number: " + df.format(largeNumber));
        double smallNumber = 0.0000046d;
        System.out.println("Small Number: " + df.format(smallNumber));
    }
}
