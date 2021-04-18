package com.trhm.visitor;

import java.util.List;

public class EmployeeOperation implements Operation {
    @Override
    public void operate(List<Employee> employees, Visitor visitor) {
        visitor.visit(employees, this);
    }
}
