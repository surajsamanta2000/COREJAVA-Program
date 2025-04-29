package com.Suraj.Oops;


//Java program to demonstrate Encapsulation
class Person {
 private String name; // private = restricted access

 // Getter
 public String getName() {
     return name;
 }

 // Setter
 public void setName(String name) {
     this.name = name;
 }
}

public class EncapsulationExample {
 public static void main(String[] args) {
     Person p = new Person();
     p.setName("Suraj"); // setting value
     System.out.println(p.getName()); // getting value
 }
}

