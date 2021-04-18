package com.trhm.visitor;

import java.util.List;

public class PrintInformation implements Visitor{
    @Override
    public void visit(List<Employee> employees, Operation operation) {
        employees.forEach(System.out::println);
    }
}
