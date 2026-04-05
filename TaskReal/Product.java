package TaskReal;

import java.util.Objects;

public class Product {
    private int price;
    private String name;

    public Product(){

    }

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return this.name == product.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}



