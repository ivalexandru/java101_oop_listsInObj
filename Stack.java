package com.sarmale;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> listStack;

    public Stack() {
        this.listStack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.listStack.isEmpty();
    }

    public void add(String value) {
        this.listStack.add(value);
    }

    public ArrayList<String> values() {
        return this.listStack;
    }

    public void printStack() {
        for (String v : this.listStack) {
            System.out.println(v);
        }
    }

    public String take() {
        int index = this.listStack.size() - 1;
        return this.listStack.remove(index);
    }

    public static void main(String[] args) {
        Stack tst = new Stack();
//        System.out.println(tst.isEmpty()); // tru
        tst.add("paine");
        tst.add("parizer");
        tst.add("Sana");
//        System.out.println(tst.isEmpty()); // false
        tst.printStack();
        System.out.println(tst.take()); // Sana

    }

}
