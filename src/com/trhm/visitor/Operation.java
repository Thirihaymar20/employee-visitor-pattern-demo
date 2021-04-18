package com.trhm.visitor;

import java.util.List;

public interface Operation {
    void operate(List<Employee> employees, Visitor visitor);
}
