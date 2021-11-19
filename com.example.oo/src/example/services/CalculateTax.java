package example.services;

import example.domain.Product;

public class CalculateTax {
    public static void calculateTax(Product product) {
        System.out.println("Relatório de imposto do computador");
        System.out.println("-------------xxxxxxxx--------------");

        double tax = product.CalculateProductTax();

        System.out.println("Nome do produto: " + product.getName());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Valor do imposto: " + product.getValue());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Imposto a ser pago: " + tax);
    }
}
