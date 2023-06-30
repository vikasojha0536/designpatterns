package com.example.designpattern.prototypepattern.everydayexample;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeEverDayDemo {

    public static void main(String[] args) {
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Stars war");
        Records record = new Records();
        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());
        System.out.println(firstStatement.getSql());

        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
        System.out.println(secondStatement.getSql());
    }

}
