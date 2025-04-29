package com.Suraj.Oops;

public class Constructor {
    
    // Static variable to count the number of objects
    static int objectCount = 0;

    // Constructor
    public Constructor() {
        objectCount++;
        System.out.println("Object created. Total objects: " + objectCount);
    }

    public static void main(String[] args) {
        // Creating objects
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor();
        Constructor obj3 = new Constructor();

        // Final count
        System.out.println("Final number of objects created: " + Constructor.objectCount);
    }
}

