package client;

import factory.IProduitFactory;
import factory.ProduitFactory1;
import factory.ProduitFactory2;
import product.ProduitA;
import product.ProduitB;

public class Client {
    public static void main(String[] args) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}

