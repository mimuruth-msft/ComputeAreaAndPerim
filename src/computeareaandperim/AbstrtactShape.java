package computeareaandperim;

/** 
 * Abstract class for a geometric shape. 
 */
public abstract class AbstrtactShape implements Shape
{
    /** The name of the shape */
    private final String shapeName;

    /**
     * Initializes the shapeName.
     * @param shapeName the kind of shape
     */
    public AbstrtactShape(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * Get the kind of shape.
     * @return the shapeName
     */
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "Shape is a " + shapeName;
    }
}
