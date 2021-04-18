package com.trhm.visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sam", EmployeeType.FIX, BigDecimal.valueOf(1000)));
        employees.add(new Employee("Grace", EmployeeType.COM, BigDecimal.valueOf(2000)));
        employees.add(new Employee("Kelvin", EmployeeType.MIX, BigDecimal.valueOf(1500)));

        Operation operation = new EmployeeOperation();
        operation.operate(employees, new SalaryCalculator());
        operation.operate(employees, new PrintInformation());
    }
}
