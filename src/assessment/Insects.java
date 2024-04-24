package assessment;

public class Insects extends Invertebrate {

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
