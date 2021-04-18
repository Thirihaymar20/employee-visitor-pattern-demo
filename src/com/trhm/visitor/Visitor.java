package com.trhm.visitor;

import java.util.List;

public interface Visitor {
    void visit(List<Employee> employees, Operation operation);
}
