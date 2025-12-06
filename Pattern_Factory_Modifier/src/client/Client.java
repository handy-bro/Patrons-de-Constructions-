package client;

import factory.ProduitFactory;
import factory.ProduitFactoryA;
import factory.ProduitFactoryB;
import factory.ProduitFactoryC;
import factory.ProduitFactoryD;
import product.Produit;

public class Client {
    public static void main(String[] args) {
        System.out.println("...Factory Pattern avec 4 produits...");

        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();
        ProduitFactory produitfactoryD = new ProduitFactoryD();
        Produit produit = null;

        // Affiche un produit de type A
        produit = produitfactoryA.getProduit();
        produit.methodeproduit();

        // Affiche un produit de type B
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();

        // Affiche un produit de type C
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();

        // Affiche un produit de type D
        produit = produitfactoryD.getProduit();
        produit.methodeproduit();
    }
}

