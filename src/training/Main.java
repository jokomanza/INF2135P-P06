package training;

public class Main {
    public static void main(String[] args) {
        Mammals human = new Mammals();
        human.setSpecies("");
        System.out.println("Species: " + human.getSpecies());
        System.out.println("Phylum: " + human.getPhylum());

        Mammals dog = new Mammals();
        dog.setSpecies("Canis lupus familiaris");
        System.out.println("Species: " + dog.getSpecies());
        System.out.println("Phylum: " + dog.getPhylum());

        Mammals cat = new Mammals();
        cat.setSpecies("felis catus");
        System.out.println("Species: " + cat.getSpecies());
        System.out.println("Phylum: " + cat.getPhylum());

    }
}
