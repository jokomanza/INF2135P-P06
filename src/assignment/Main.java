package assignment;

/**
 * The Main class. The entry point of the program.
 */
public class Main {

    /**
     * The main method. Creates an ant, a bee, and a butterfly.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Insects ant = new Insects();
        ant.setSpecies("Formicidae");
        System.out.println("Ant");
        System.out.println("Species: " + ant.getSpecies());
        System.out.println("Phylum: " + ant.getPhylum());
        System.out.println("Has backbones: " + ant.hasBackbones());

        Insects bee = new Insects();
        bee.setSpecies("Apis mellifera");
        System.out.println("Bee");
        System.out.println("Species: " + bee.getSpecies());
        System.out.println("Phylum: " + bee.getPhylum());
        System.out.println("Has backbones: " + bee.hasBackbones());

        Insects butterfly = new Insects();
        butterfly.setSpecies("Lepidoptera");
        System.out.println("Butterfly");
        System.out.println("Species: " + butterfly.getSpecies());
        System.out.println("Phylum: " + butterfly.getPhylum());
        System.out.println("Has backbones: " + butterfly.hasBackbones());
    }
}
