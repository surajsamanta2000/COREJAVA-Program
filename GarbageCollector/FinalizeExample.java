package com.Suraj.GarbageCollector;
/*
 This shows a custom class with overridden finalize() that gets
 called when the object is destroyed (pre-Java 9; deprecated in later versions).
 */

public class FinalizeExample {
    String name;

    FinalizeExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        FinalizeExample obj1 = new FinalizeExample("Object-A");
        FinalizeExample obj2 = new FinalizeExample("Object-B");

        obj1 = null;
        obj2 = null;

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected");
    }
}

