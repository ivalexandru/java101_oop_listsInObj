package com.sarmale;

import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }
        this.visitors++;
        this.riding.add(person);
        return true;
    }

    public String toString() {

        String printOutput = this.name + ", minimum height requirement: " + this.minimumHeight +
                ", visitors: " + this.visitors + "\n";

        if (riding.isEmpty()) {
            return printOutput + "no one is on the ride.";
        }

        // we form a string from the people on the list
        String peopleOnRide = "";

        for (Person person: riding) {
            peopleOnRide = peopleOnRide + person.getName() + "\n";
        }

        return printOutput + "\n" +
                "on the ride:\n" + peopleOnRide;
    }

    public void removeEveryoneOnRide() {
        this.riding.clear();
    }

    public Person getTallest() {
        // return a null reference if there's no one on the ride
        if (this.riding.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.riding.get(0);

        // go through the list
        for (Person prs: this.riding) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the tallest,

            if (returnObject.getHeight() < prs.getHeight()) {
                // if we find a taller person in the comparison,
                // we assign it as the value of the returnObject
                returnObject = prs;
            }
        }

        // finally, the object reference describing the
        // return object is returned
        return returnObject;
    }

    public static void main(String[] args) {

        Person matti = new Person("Matti");
        matti.setHeight(180);

        Person juhana = new Person("Juhana");
        juhana.setHeight(132);

        Person awak = new Person("Awak");
        awak.setHeight(194);

        AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);

        hurjakuru.isAllowedOn(matti);
        hurjakuru.isAllowedOn(juhana);
        hurjakuru.isAllowedOn(awak);

        System.out.println(hurjakuru);
//        System.out.println(hurjakuru.averageHeightOfPeopleOnRide());

        System.out.println();
        System.out.println(hurjakuru.getTallest().getName());
        Person tallest = hurjakuru.getTallest();
        System.out.println(tallest.getName());

    }
}