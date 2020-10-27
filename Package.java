package com.sarmale;

import java.util.ArrayList;

public class Package {
    ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.gifts.add(gift);
    }

    public int totalWeight(){
        int totalWeight = 0;
        for ( Gift x : this.gifts ){
            totalWeight += x.getWeight();
        }
        return totalWeight;
    }

    public static void main(String[] args) {

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book2 = new Gift("saww", 3);


        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(book2);
        System.out.println(gifts.totalWeight());

    }



}
