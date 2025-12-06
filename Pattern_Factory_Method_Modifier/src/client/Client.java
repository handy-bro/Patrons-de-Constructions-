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

        // Affiche un produit de type D
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeD);
        produit.methodeproduit();

        // Produit inexistant - gère l'exception
        try {
            String e = "E";
            produit = fabriqueproduit.createProduit(e);
            produit.methodeproduit();
        } catch (IllegalArgumentException ex) {
            System.out.println("Erreur: " + ex.getMessage());
        }
    }
}

