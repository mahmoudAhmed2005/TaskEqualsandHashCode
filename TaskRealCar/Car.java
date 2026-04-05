package TaskRealCar;

import java.util.Objects;

public class Car {
    private int id;
    private String color;

    public Car(){

    }

    public Car(int id, String color) {
        this.id = id;
        this.color = color;
    }


    public int getId() {
        return id;
    }

    public void setIde(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color);
    }
}
