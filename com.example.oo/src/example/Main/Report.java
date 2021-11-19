package example.Main;

import example.domain.Computer;
import example.services.CalculateTax;

public class Report {
    public static void main(String[] args) {
        Computer computer  = new Computer("Dell Inspirion 14r-3435", 4500);

        CalculateTax.calculateTaxComputer(computer);
    }
}
