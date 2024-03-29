package com.ramjava.java.basique.collections.set;

import java.util.HashSet;
import java.util.Set;

// Set interface represents an unordered collection of unique elements
public class SetAndHashSet {
    public static void main(String[] args) {
        // Set of strings and initialize. Set is an interface and can't create instance of it
        // You can only instantiate it with classes that implements it
        Set<String> names = new HashSet<>();
        // Add objects
        names.add("Huskey");
        names.add("Saint");
        names.add("Blackey");
        // List maintains order but not unique, HashSet has no particular order,
        // but it doesn't allow duplicates
        names.remove("Huskey");
        System.out.println(names);
    }
}
