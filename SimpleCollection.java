package com.sarmale;

import java.util.ArrayList;

public class SimpleCollection {
    String name;
    ArrayList<String> listCol;

    public SimpleCollection(String name){
        this.name = name;
        this.listCol = new ArrayList<>();
    }

    public void add(String item){
        this.listCol.add(item);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getListCol() {
        return listCol;
    }

    public String toString(){
        String theString = "";
        for(String x: this.listCol){
            theString = theString + " " + x;
        }
        return theString;
    }

    public String longest(){
        String longestS = "";
        for (String x: this.listCol){
            if (x.length() > longestS.length()){
                longestS = x;
            }
        }
        return longestS;
    }

    public static void main(String[] args) {
        SimpleCollection x = new SimpleCollection("test");
        x.add("ceva");
        x.add("pateu");

        System.out.println(x);
        System.out.println("longest:");
        System.out.println(x.longest());
    }



}
