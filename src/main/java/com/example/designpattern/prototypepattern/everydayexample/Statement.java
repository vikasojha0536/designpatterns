package com.example.designpattern.prototypepattern.everydayexample;

import java.util.List;

public class Statement implements Cloneable{

    private String sql;
    private List<String> parameters;

    private Records record;

    public Statement(String sql, List<String> parameters, Records record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try {
            Statement statement = (Statement) super.clone();
            statement.setRecord(this.record.clone());
            return statement;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Records getRecord() {
        return record;
    }

    public Statement setSql(String sql) {
        this.sql = sql;
        return this;
    }

    public Statement setParameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Statement setRecord(Records record) {
        this.record = record;
        return this;
    }
}
