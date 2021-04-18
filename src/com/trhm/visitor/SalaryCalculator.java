package com.trhm.visitor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryCalculator implements Visitor {
    @Override
    public void visit(List<Employee> employees, Operation operation) {
        BigDecimal salary = BigDecimal.ZERO;
        for (Employee employee : employees) {
            salary = salary.add(employee.getSalary());
        }
        System.out.println("Total Salary = "+ salary);
    }
}
