package com.lao.conditionalStatements;

public class SuperHeroFinder {
    
    String Superheroname;

    SuperHeroFinder(String Name) {
        Superheroname = Name;
    }

    public void superherofinder() {
        if (Superheroname.equalsIgnoreCase("Superman")) {
            System.out.println("Yes, Superman is a Super Hero");
        } else if (Superheroname.equalsIgnoreCase("Batman")) {
            System.out.println("Yes, Batman is a Super Hero");
        } else if (Superheroname.equalsIgnoreCase("Spiderman")) {
            System.out.println("Yes, Spiderman is a Super Hero");
        } else if (Superheroname.equalsIgnoreCase("Ironman")) {
            System.out.println("Yes, Ironman is a Super Hero");
        } else if (Superheroname.equalsIgnoreCase("Daddy")) { 
            System.out.println("Yes, Daddy is a Super Hero");
        } else {
            System.out.println("He is not a Super Hero");
        }
    }

    public static void main(String[] args) {
        SuperHeroFinder finder = new SuperHeroFinder("daddy");
        finder.superherofinder();
    }
}
