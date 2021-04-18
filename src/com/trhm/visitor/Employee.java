package com.trhm.visitor;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private EmployeeType employeeType;
    private BigDecimal salary;

    public Employee(String name, EmployeeType employeeType, BigDecimal salary) {
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeType=" + employeeType +
                ", salary=" + salary +
                '}';
    }
}
