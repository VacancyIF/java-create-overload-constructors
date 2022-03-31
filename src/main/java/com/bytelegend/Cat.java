package com.bytelegend;

public class Cat {
    public static String name;

    Cat (String name) {
        this.name = name;
    }
    
    Cat () {
        new Cat("");
    }

    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
