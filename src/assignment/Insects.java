package assignment;

/**
 * The class for insects. This class extends the Invertebrate class.
 */
public class Insects extends Invertebrate {

    /**
     * Constructs an insect. The phylum is set to "arthropod".
     */
    public Insects() {
        phylum = "arthropod";
    }

    @Override
    String getSpecies() {
        return species;
    }

    @Override
    void setSpecies(String species) {
        this.species = species;
    }

    @Override
    boolean hasBackbones() {
        return this.hasBackbones;
    }

    String getPhylum() {
        return phylum;
    }
}
