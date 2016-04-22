package Model;

/**
 * Created by wookie on 4/22/16.
 */
public class Model {
    private int lowerBorder;
    private int upperBorder;
    private int number;

    public Model() {
        lowerBorder = 0;
        upperBorder = 100;
        number = rand(0, 100);
    }

    /**
     *
     * @param min lower border of random value
     * @param max upper border of random value
     * @return random value from min to max
     */
    private int rand(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    /**
     *
     * @return return random value from zero to max integer
     */
    private int rand() {
        return (int)(Math.random() * Integer.MAX_VALUE);
    }

    public int getNumber() {
        return number;
    }

    public int getUpperBorder() {
        return upperBorder;
    }

    public void setUpperBorder(int upperBorder) {
        this.upperBorder = upperBorder;
    }

    public int getLowerBorder() {
        return lowerBorder;
    }

    public void setLowerBorder(int lowerBorder) {
        this.lowerBorder = lowerBorder;
    }
}
