package domain;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String name;
    private String model;
    private Integer year;

    public Car() {};

    public Car(String name, String model, Integer year) {
        super();
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, year);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }

}
