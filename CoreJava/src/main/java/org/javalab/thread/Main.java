package org.javalab.thread;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; ++i) {
            ThreadByExtendingThreadClass myThing = new ThreadByExtendingThreadClass(i);
            myThing.start();
        }

        for(int i=0; i<5; ++i) {
            ThreadByImplementingRunnable myThing = new ThreadByImplementingRunnable(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }
    }
}
