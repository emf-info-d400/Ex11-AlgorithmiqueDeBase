package app;

import models.Foule;
import models.Humain;

public class Application {

    public static void main(String[] args) {

        Foule foule = new Foule(64);

        Humain h1 = new Humain("John d'Oeuf", 99);
        Humain h2 = new Humain("Philipp von Roll", 33);
        foule.ajoute(new Humain("Fred", 12));
        foule.ajoute(new Humain("Jean", 17));
        foule.ajoute(new Humain("Paul", 11));
        foule.ajoute(new Humain("John", 18));
        foule.ajoute(h2);
        foule.ajoute(new Humain("Mac Haroni", 22));
        foule.ajoute(h1);
        foule.ajoute(new Humain("Alex Terrieur", 23));
        foule.ajoute(new Humain("Alain Terrieur", 25));
        foule.ajoute(new Humain("Paul", 54));

        System.out.println("======================================================================");
        System.out.println("La foule contient            : " + foule.compter() + " [humains]");
        System.out.println("L'âge moyen de la foule est  : " + foule.ageMoyen() + " [années]");
        System.out.println("Le plus petit âge trouvé est : " + foule.cherchePlusPetitAge() + " [années]");
        System.out.println("Le plus grand âge trouvé est : " + foule.cherchePlusGrandAge() + " [années]");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Le contenu actuel de la liste est ci-dessous :");
        Humain[] liste = foule.listeSansTrous();
        for (int i = 0; i < liste.length; i++) {
            System.out.println((i + 1) + ") " + liste[i].getNom() + " âgé de " + liste[i].getAge() + " [années]");
        }
        System.out.println("----------------------------------------------------------------------");
        boolean aEteSupprime = foule.supprime(h1);
        System.out.println("La suppression de John d'Oeuf a : " + (aEteSupprime ? "RÉUSSI !" : "ÉCHOUÉ !"));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("La foule contient           : " + foule.compter() + " [humains]");
        System.out.println("L'âge moyen de la foule est : " + foule.ageMoyen() + " [années]");
        System.out.println("Le plus petit âge trouvé est : " + foule.cherchePlusPetitAge() + " [années]");
        System.out.println("Le plus grand âge trouvé est : " + foule.cherchePlusGrandAge() + " [années]");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Le contenu actuel de la liste est ci-dessous :");
        liste = foule.listeSansTrous();
        for (int i = 0; i < liste.length; i++) {
            System.out
                    .println((i + 1) + ") " + liste[i].getNom() + " âgé de " + liste[i].getAge() + " [années]");
        }
        System.out.println("----------------------------------------------------------------------");
        int positionPremier = foule.cherchePositionPremier(h2);
        int positionDernier = foule.cherchePositionDernier(h2);
        System.out.println("La première position trouvée pour [" + h2.getNom() + "] est  : " + positionPremier);
        System.out.println("La dernière position trouvée pour [" + h2.getNom() + "] est  : " + positionDernier);
        System.out.println("----------------------------------------------------------------------");
        positionPremier = foule.cherchePositionPremier(new Humain("batard qui sera pas trouvé :-)"));
        System.out.println("La première position trouvée pour [celui qu'on veut pas trouver] est  : " + positionPremier);
        System.out.println("----------------------------------------------------------------------");
        Humain premierHumain = foule.cherchePremier("Paul");
        Humain dernierHumain = foule.chercheDernier("Paul");
        System.out.println("Le premier humain trouvé avec le nom 'Paul' est âgé de : " + premierHumain.getAge());
        System.out.println("Le dernier humain trouvé avec le nom 'Paul' est âgé de : " + dernierHumain.getAge());
        System.out.println("----------------------------------------------------------------------");
        String[] tousLesNoms = foule.listeDesNomsSansDoublons();
        System.out.println("Voici ci-dessous la liste de tous les prénoms (sans doublons) :");
        tousLesNoms = foule.listeDesNomsSansDoublons();
        for (int i = 0; i < tousLesNoms.length; i++) {
            System.out.println((i + 1) + ") " + tousLesNoms[i]);
        }

    }
}
