package com.example.designpattern.adapter;

public class EmployeeCSVAdapter implements Employee {

    private EmployeeCSV employeeCSV;
    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName()    ;
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }
}
