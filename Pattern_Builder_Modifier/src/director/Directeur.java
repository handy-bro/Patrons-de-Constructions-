package director;

import builder.MonteurPizza;
import builder.MonteurPizzaPiquante;
import builder.MonteurPizzaReine;
import builder.MonteurPizzaGombo;
import product.Pizza;

public class Directeur {
    // Construire pizza reine
    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    // Construire pizza Piquante
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }

    // Construire pizza Gumbo
    public Pizza construirePizzaGombo() {
        MonteurPizza pizzaGumbo = new MonteurPizzaGombo();
        return pizzaGombo.getPizza();
    }
}

