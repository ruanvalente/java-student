package example.domain;

public class Computer extends Product{
    public final double IMPOSTO_POR_CENTO = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double CalculateProductTax() {
        return this.value * IMPOSTO_POR_CENTO;
    }
}
