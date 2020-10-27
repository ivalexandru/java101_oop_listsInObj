package com.sarmale;

import java.util.ArrayList;

public class Suitcase {
    private int totalWeight;
    private ArrayList<Item> suitcaseList;

    public Suitcase(int totalWeight) {
        this.totalWeight = totalWeight;
        this.suitcaseList = new ArrayList<>();
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int weightSoFar(){
        int sum = 0;
        for(Item x : this.suitcaseList) {
            sum += x.getWeight();
        }
        return sum;
    }

    public void addItem(Item item){
        //check if weight is suported
        if ( ( this.getTotalWeight() - weightSoFar() )  > item.getWeight()){
            System.out.println("added");
            this.suitcaseList.add(item);
        } else { System.out.println("cannot add item"); }
    }

    public String toString(){
        return this.suitcaseList.stream().count() + " items " + this.getTotalWeight() + " kg";
    }

    public static void main(String[] args) {

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

    }
}
