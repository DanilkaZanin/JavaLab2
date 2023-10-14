package org.example;

public class Foo {
    private static Foo instance = new Foo();
    private static final int delta = 6;
    private static int BASE = 7;

    private int x;

    public Foo() {
        x = BASE + delta;
    }

    public static void main(String[] args) {
        System.out.println(Foo.instance.x);
    }
}


