package com.driver;

public class Main {
public static void main(String args[]){
    RWOnly obj=new RWOnly();
   //name has private access
    obj.setName("deepanshi");
    System.out.println(obj.getName());
}
}