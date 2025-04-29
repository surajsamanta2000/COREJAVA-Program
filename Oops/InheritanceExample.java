package com.Suraj.Oops;


//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }
}

public class InheritanceExample {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.sound(); // Inherited method
     d.bark();  // Dog's own method
 }
}

