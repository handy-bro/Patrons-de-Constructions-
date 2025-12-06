package client;

import director.Directeur;
import product.Pizza;

public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        // Construire pizza reine
        System.out.println("...Pizza Reine Fabriquée...");
        Pizza pizzaReine = directeur.construirePizzaReine();
        pizzaReine.print();

        System.out.println("\n");

        // Construire pizza piquante
        System.out.println("...Pizza Piquante Fabriquée...");
        Pizza pizzaPiquante = directeur.construirePizzaPiquante();
        pizzaPiquante.print();

        System.out.println("\n");

        // Construire pizza gumbo
        System.out.println("...Pizza Gombo Fabriquée...");
        Pizza pizzaGombo = directeur.construirePizzaGombo();
        pizzaGumbo.print();
    }
}

