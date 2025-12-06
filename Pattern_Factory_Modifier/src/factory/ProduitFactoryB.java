package factory;

import product.Produit;
import product.ProduitB;

public class ProduitFactoryB extends ProduitFactory {
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitB();
        return produit;
    }
}

