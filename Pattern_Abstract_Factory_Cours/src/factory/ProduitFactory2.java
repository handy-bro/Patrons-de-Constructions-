package factory;

import product.ProduitA;
import product.ProduitA2;
import product.ProduitB;
import product.ProduitB2;

public class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}

