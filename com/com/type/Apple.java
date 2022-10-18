package com.type;

public class Apple extends Fruit{

    //继承，重写父类的方法
    @Override
    public void eat(){
        System.out.println("eat apple");
    }

    public static void main(String args[]) {
       Fruit fruit =new Apple();
       //父类调用子类的方法
       fruit.eat();
    }
}
