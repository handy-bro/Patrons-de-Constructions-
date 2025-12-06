package factory;

import product.Produit;
import product.ProduitD;

public class ProduitFactoryD extends ProduitFactory {
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitD();
        return produit;
    }
}

