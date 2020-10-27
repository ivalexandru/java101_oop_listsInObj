package com.sarmale.jokes;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke){
        this.jokeList.add(joke);
    }

    Random rand = new Random();
    // Obtain a number between [0 - jokeListSize].
    public String drawJoke(){
        int n = rand.nextInt(jokeList.size() - 1);
        return jokeList.get(n);
    }

    public void printJokes(){
        for(String x: this.jokeList){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red - Red paint.");
        manager.addJoke("What is blue - Blue paint.");
        manager.addJoke("test");
        manager.addJoke("salam");


        System.out.println("Drawing jokes:");
        for (int i = 0; i < 2; i++) {
            System.out.println(manager.drawJoke());
        }

        System.out.println("");
        System.out.println("Printing jokes:");
        manager.printJokes();
    }
}
