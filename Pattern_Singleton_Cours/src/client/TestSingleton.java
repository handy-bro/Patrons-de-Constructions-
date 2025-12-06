package client;

import singleton.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        // Première utilisation du singleton sans paramètres
        int som = Singleton.getInstance().Somme(2, 5);
        System.out.println("la somme est: " + som);

        // Une instance est déjà en cours
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16, 19);
        s2.affiche();
    }
}

