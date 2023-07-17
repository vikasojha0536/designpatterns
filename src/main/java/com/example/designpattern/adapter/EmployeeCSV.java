package com.example.designpattern.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;

    private String firstName;

    private String lastName;

    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer st = new StringTokenizer(values, ",");
        if(st.hasMoreTokens()) {
            id = Integer.parseInt(st.nextToken());
        }
        if(st.hasMoreTokens()) {
            firstName = st.nextToken();
        }
        if(st.hasMoreTokens()) {
            lastName = st.nextToken();
        }
        if(st.hasMoreTokens()) {
            emailAddress = st.nextToken();
        }

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
