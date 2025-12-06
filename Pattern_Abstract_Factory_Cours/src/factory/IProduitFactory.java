package factory;

import product.ProduitA;
import product.ProduitB;

public interface IProduitFactory {
    public ProduitA getProduitA();
    public ProduitB getProduitB();
}

