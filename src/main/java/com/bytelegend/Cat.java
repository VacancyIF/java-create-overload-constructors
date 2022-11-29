package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat(""));
        System.out.println(new Cat("White"));
    }
    
       public  Cat(){
         new Cat("");
    } 
    
    public Cat(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
