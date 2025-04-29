package com.Suraj.GarbageCollector;

/*
 An object with no reference is created. It becomes eligible for GC immediately after creation.
 */


public class GCAnonymous {
    public static void main(String[] args) {
        new GCAnonymous(); // No reference — eligible for GC right away

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Anonymous object collected");
    }
}
