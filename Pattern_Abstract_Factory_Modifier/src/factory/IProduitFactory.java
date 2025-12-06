package factory;

import product.ProduitA;
import product.ProduitB;
import product.ProduitC;

public interface IProduitFactory {
    public ProduitA getProduitA();
    public ProduitB getProduitB();
    public ProduitC getProduitC();
}

