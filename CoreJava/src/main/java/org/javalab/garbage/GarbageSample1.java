package org.javalab.garbage;

public class GarbageSample1 {

    protected void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageSample1 s1 = new GarbageSample1();
        GarbageSample1 s2 = new GarbageSample1();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
