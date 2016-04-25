package test;

import main.couple.BuildCoupleSameBoss;
import main.couple.Couple;
import main.couple.Employee;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class CoupleTest {
    List<Employee> employees = new ArrayList<>();
    @Before
    public void prepare() {
        Employee e1 = new Employee("toan", 1);

        Employee e2 = new Employee("do", 2);
        e2.boss = e1;
        Employee e3 = new Employee("minh", 3);
        e3.boss = e1;
        Employee e4 = new Employee("handsome", 4);
        e4.boss = e1;

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
    }

    @org.junit.Test
    public void testListEmployee() {
        Assert.assertEquals(employees.size(), 4);

        BuildCoupleSameBoss buildCoupleSameBoss = new BuildCoupleSameBoss();
        for (Employee e : employees) {
            buildCoupleSameBoss.add(e);
        }

        Assert.assertEquals(buildCoupleSameBoss.employeeListMap.size(), 1);

        List<Employee> es = buildCoupleSameBoss.employeeListMap.get(employees.get(0)).employees;
        List<Couple> cc = buildCoupleSameBoss.employeeListMap.get(employees.get(0)).couples;
        Assert.assertEquals(cc.size(), 3);
    }
}
