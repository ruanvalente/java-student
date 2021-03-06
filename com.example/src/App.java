import domain.Car;
import example.domain.Varargs;

public class App {
    public static void main(String[] args) throws Exception {
        Car ford = new Car();
        Car fiat = new Car();

        ford.setName("Ford");
        ford.setModel("EcoSport");
        ford.setYear(2022);

        fiat.setName("Fiat");
        fiat.setModel("Uno");
        fiat.setYear(2019);

        System.out.println("Fiat: " + fiat);
        System.out.println("Ford: " + ford);

        Varargs varargs = new Varargs();
        varargs.sumAllNumbers(1,2,3,4,5);
    }
}
