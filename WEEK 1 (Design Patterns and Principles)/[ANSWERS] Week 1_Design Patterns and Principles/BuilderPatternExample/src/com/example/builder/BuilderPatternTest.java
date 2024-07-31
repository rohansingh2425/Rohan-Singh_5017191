package com.example.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("Integrated")
                .setPowerSupply("500W")
                .setMotherboard("Gigabyte B450")
                .build();


        System.out.println("\nOffice Computer: ");
        System.out.println("CPU: " + officeComputer.getCPU());
        System.out.println("RAM: " + officeComputer.getRAM());
        System.out.println("Storage: " + officeComputer.getStorage());
        System.out.println("GPU: " + officeComputer.getGPU());
        System.out.println("Power Supply: " + officeComputer.getPowerSupply());
        System.out.println("Motherboard: " + officeComputer.getMotherboard());
    }
}
