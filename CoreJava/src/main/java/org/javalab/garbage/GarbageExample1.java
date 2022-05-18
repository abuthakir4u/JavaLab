package org.javalab.garbage;

public class GarbageExample1 {

    protected void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageExample1 s1 = new GarbageExample1();
        GarbageExample1 s2 = new GarbageExample1();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
