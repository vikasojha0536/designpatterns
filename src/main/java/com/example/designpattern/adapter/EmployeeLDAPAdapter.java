package com.example.designpattern.adapter;

public class EmployeeLDAPAdapter implements Employee {

    private EmployeeLDAP employeeLDAP;
    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getSurname();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }


    public String toString() {
        return "ID: " + employeeLDAP.getCn();
    }
}
