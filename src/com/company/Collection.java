package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Collection {

    /*
     * VARIABLES
     * ArrayList for all Enclosures/ Cages / Animals / Keepers declared
     * FileInputOutput object declared
     */
    private ArrayList<Cage> allCages;
    private ArrayList<Animal> allAnimals;
    private ArrayList<Keeper> allKeepers;
    private ArrayList<Enclosure> allEnclosures;
    private FileInputOutput data;

    /*
     * CONSTRUCTOR
     * Initialise all arrayLists
     * Instantiate FileInputOutput object
     * Call readData() method to populate data structures from
     * text file data
     * Collection object instantiated on program start so data is
     * automatically read
     */

    public Collection() throws IOException {
        allCages = new ArrayList<>();
        allAnimals = new ArrayList<>();
        allKeepers= new ArrayList<>();
        allEnclosures= new ArrayList<>();
        data = new FileInputOutput();
    }

    //Getters and setters

    public ArrayList<Cage> getAllCages() {
        return allCages;
    }

    public void setAllCages(ArrayList<Cage> allCages) {
        this.allCages = allCages;
    }

    public ArrayList<Animal> getAllAnimals() {
        return allAnimals;
    }

    public void setAllAnimals(ArrayList<Animal> allAnimals) {
        this.allAnimals = allAnimals;
    }

    public ArrayList<Keeper> getAllKeepers() {
        return allKeepers;
    }

    public void setAllKeepers(ArrayList<Keeper> allKeepers) {
        this.allKeepers = allKeepers;
    }

    public ArrayList<Enclosure> getAllEnclosures() {
        return allEnclosures;
    }

    public void setAllEnclosures(ArrayList<Enclosure> allEnclosures) {
        this.allEnclosures = allEnclosures;
    }
}
