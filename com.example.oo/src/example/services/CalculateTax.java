package example.services;

import example.domain.Computer;

public class CalculateTax {
    public static void calculateTaxComputer(Computer computer) {
        System.out.println("Relatório de imposto do computador");
        System.out.println("-------------xxxxxxxx--------------");

        double tax = computer.CalculateProductTax();

        System.out.println("Nome do produto: " + computer.getName());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Valor do imposto: " + computer.getValue());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Imposto a ser pago: " + tax);
    }
}
