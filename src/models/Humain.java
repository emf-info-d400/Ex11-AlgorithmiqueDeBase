package models;

public class Humain {

    public final static int AGE_INCONNU = -1; // Car c'est un age impossible

    private final String nom;
    private final int age;

    public Humain(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Humain(String nom) {
        this.nom = nom;
        age = AGE_INCONNU;
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", age=" + age + "]";
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}
