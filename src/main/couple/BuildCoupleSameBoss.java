package main.couple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildCoupleSameBoss {
    public Map<Employee, Boss> employeeListMap = new HashMap<>();

    public void add(Employee e) {
        if (e.boss != null) {
            if (employeeListMap.containsKey(e.boss)) {
                Boss boss = employeeListMap.get(e.boss);
                for (Employee employee : boss.employees) {
                    Couple couple = new Couple();
                    couple.a = e;
                    couple.b = employee;
                    boss.couples.add(couple);
                }
                boss.employees.add(e);
            } else {
                Boss bb = new Boss();
                bb.employees.add(e);
                employeeListMap.put(e.boss, bb);
            }
        }
    }
}

