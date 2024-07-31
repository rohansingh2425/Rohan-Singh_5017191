package com.example.proxypattern;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image1.jpg");
        Image image2 = new ProxyImage("test_image2.jpg");


        image1.display();
        System.out.println(" ");


        image1.display();
        System.out.println(" ");


        image2.display();
        System.out.println(" ");


        image2.display();
    }
}
