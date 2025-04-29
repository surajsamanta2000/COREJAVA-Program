package com.Suraj.GarbageCollector;
/*
 When a group of objects reference each other but are not referenced by any live thread,
 they form an island of isolation and become eligible for GC.
 */

public class Island {
    Island ref;

    public static void main(String[] args) {
        Island obj1 = new Island();
        Island obj2 = new Island();

        obj1.ref = obj2;
        obj2.ref = obj1;

        obj1 = null;
        obj2 = null; // Both objects are now unreachable

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Island object finalized");
    }
}

