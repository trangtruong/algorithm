package main.couple;

public class Employee {
    public String name;
    public int id;
    public Employee boss;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + id;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (e != null) {
            return e.name.equals(this.name) && e.id == this.id;
        }
        return false;
    }
}
