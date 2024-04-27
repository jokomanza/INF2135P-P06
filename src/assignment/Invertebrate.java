package assignment;

/**
 * The base class for all invertebrates. This class extends the Animal class.
 */
abstract class Invertebrate extends Animal {

    /**
     * Constructs an invertebrate. The hasBackbones is set to false.
     */
    public Invertebrate() {
        hasBackbones = false;
    }
}
