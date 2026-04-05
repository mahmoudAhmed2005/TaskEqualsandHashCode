package TaskRealPerson;

import TaskReal.Product;

import java.util.Objects;

public class Person {
    private int id;
    private String email;

    public Person(){

    }

    public Person(int id, String email) {
        this.id = id;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setIde(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }






    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && this.email==person.email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
