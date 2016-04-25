package main.couple;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public List<Employee> employees;
    public List<Couple> couples;
    public Boss() {
        employees = new ArrayList<>();
        couples = new ArrayList<>();
    }
}
