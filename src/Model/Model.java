package Model;
import java.util.ArrayList;
/**
 * Created by wookie on 4/22/16.
 */
public class Model {
    private int lowerBorder;
    private int upperBorder;
    private int number;
    /**
     * a variable for saving user statistic.
     */
    private ArrayList<Integer> statistic;

    public Model() {
        lowerBorder = 0;
        upperBorder = 100;
        number = rand(0, 100);
        statistic = new ArrayList<>();
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

    /**
     * Method for saving user's turns.
     * @param userNumber a number which user input the last time
     */
    public void addTurn(int userNumber) {
        statistic.add(userNumber);
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

    public ArrayList<Integer> getStatistic() {
        return statistic;
    }
}
