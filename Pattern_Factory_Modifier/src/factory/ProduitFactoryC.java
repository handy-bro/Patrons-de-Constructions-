package factory;

import product.Produit;
import product.ProduitC;

public class ProduitFactoryC extends ProduitFactory {
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitC();
        return produit;
    }
}

