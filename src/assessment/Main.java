package assessment;

public class Main {

    public static void main(String[] args) {
        Insects ant = new Insects();
        ant.setSpecies("Formicidae");
        System.out.println("Ant");
        System.out.println("Species: " + ant.getSpecies());
        System.out.println("Phylum: " + ant.getPhylum());

        Insects bee = new Insects();
        bee.setSpecies("Apis mellifera");
        System.out.println("Bee");
        System.out.println("Species: " + bee.getSpecies());
        System.out.println("Phylum: " + bee.getPhylum());

        Insects butterfly = new Insects();
        butterfly.setSpecies("Lepidoptera");
        System.out.println("Butterfly");
        System.out.println("Species: " + butterfly.getSpecies());
        System.out.println("Phylum: " + butterfly.getPhylum());
    }
}
