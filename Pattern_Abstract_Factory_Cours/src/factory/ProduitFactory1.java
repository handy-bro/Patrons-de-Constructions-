package factory;

import product.ProduitA;
import product.ProduitA1;
import product.ProduitB;
import product.ProduitB1;

public class ProduitFactory1 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}

