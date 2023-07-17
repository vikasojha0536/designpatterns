package com.example.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeDB = new EmployeeDB("1234", "xyz", "tyx", "hhh");
        employees.add(employeeDB);
        EmployeeLDAP employeeLDAP = new EmployeeLDAP("1234", "xyz", "tyx", "hhh");
        employees.add(new EmployeeLDAPAdapter(employeeLDAP));
        EmployeeCSV employeeCSV = new EmployeeCSV("1234,xyz,tyx,hhh");
        employees.add(new EmployeeCSVAdapter(employeeCSV));
        return employees;
    }
}
