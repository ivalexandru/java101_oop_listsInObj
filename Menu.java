package com.sarmale;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if ( !this.meals.contains(meal)){
            this.meals.add(meal);
            System.out.println("meal " + meal + " added");
        } else {
            System.out.println("meal already in the menu");
        }
    }

    public void printMeals(){
        for (String x: this.meals){
            System.out.println(x);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        m.addMeal("salam");
        m.addMeal("pateu");
        m.addMeal("salam");
        m.printMeals();
        m.clearMenu();
        System.out.println("cleared:");
        m.printMeals();


    }

}