package client;

import factory.FabriqueProduit;
import product.Produit;

public class Client {
    public static void main(String[] args) {
        System.out.println("bonjour le monde");

        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        // Affiche un produit de type A
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeA);
        produit.methodeproduit();

        // Affiche un produit de type B
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeB);
        produit.methodeproduit();

        // Affiche un produit de type C
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeC);
        produit.methodeproduit();

        // Produit inexistant - gère l'exception
        try {
            String d = "D";
            produit = fabriqueproduit.createProduit(d);
            produit.methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}

