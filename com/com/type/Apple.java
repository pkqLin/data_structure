package com.type;

public class Apple extends Fruit{

    @Override
    public void eat(){
        System.out.println("eat apple");
    }

    public static void main(String args[]) {
       Fruit fruit =new Apple();
       fruit.eat();
    }
}
