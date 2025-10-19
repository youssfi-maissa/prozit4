package main;

import zoo.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Parc Animalier", "Tunis");

        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 4, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        System.out.println("Animaux du zoo :");
        myZoo.displayAnimals();

        System.out.println("\nRecherche Lion : " + myZoo.searchAnimal(lion));
        System.out.println("Recherche un autre Lion : " + myZoo.searchAnimal(new Animal("Félidé", "Lion", 5, true)));
    }
}
