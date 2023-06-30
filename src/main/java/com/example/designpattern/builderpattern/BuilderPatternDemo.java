package com.example.designpattern.builderpattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder();
        Computer computer = computerBuilder.hasGigabitwifi(true).addHDD(HDD.MAX).addRam(RAM.UPGRADED).build();
        System.out.println(computer.getDiskSize());
    }

}
