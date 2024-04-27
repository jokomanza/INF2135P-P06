package assessment;

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

    String getPhylum() {
        return phylum;
    }
}
