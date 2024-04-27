package assignment;

/**
 * The base class for all animals. Contains the species and whether the animal has backbones.
 */
abstract class Animal {

    /**
     * The phylum of the animal.
     */
    protected String phylum;

    /**
     * The species of the animal.
     */
    protected String species;

    /**
     * Whether the animal has backbones.
     */
    protected boolean hasBackbones;

    /**
     * Returns the species of the animal.
     *
     * @return the species of the animal
     */
    abstract String getSpecies();

    /**
     * Sets the species of the animal.
     *
     * @param species the species of the animal
     */
    abstract void setSpecies(String species);

    /**
     * Returns whether the animal has backbones.
     *
     * @return whether the animal has backbones
     */
    abstract boolean hasBackbones();
}
