package com.Suraj.GarbageCollector;


/*
 When a reference is reassigned to another object, the original object may become unreachable.
 */
public class GCReassignExample {
    public static void main(String[] args) {
        GCReassignExample obj1 = new GCReassignExample();
        GCReassignExample obj2 = new GCReassignExample();

        obj1 = obj2;  // Now the first object is unreachable and eligible for GC

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object finalized");
    }
}

