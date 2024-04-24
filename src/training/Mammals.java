package training;

public class Mammals extends Vertebrate {

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
