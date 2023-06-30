package com.example.designpattern.builderpattern;

public class Computer {

    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbc;
    private boolean hasGigabitwifi;

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean isHasUsbc() {
        return hasUsbc;
    }

    public boolean isHasGigabitwifi() {
        return hasGigabitwifi;
    }

    private Computer(ComputerBuilder builder) {
        this.hasGigabitwifi = builder.hasGigabitwifi;
        this.hasUsbc = builder.hasUsbc;
        this.ramSize = builder.ramSize;
        this.diskSize = builder.diskSize;
    }

    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbc;
        private boolean hasGigabitwifi;

        ComputerBuilder() {

        }

        public ComputerBuilder addRam(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder addHDD(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder hasUsbc(boolean hasUsbc) {
            this.hasUsbc = hasUsbc;
            return this;
        }

        public ComputerBuilder hasGigabitwifi(boolean hasGigabitwifi) {
            this.hasGigabitwifi = hasGigabitwifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }



}
