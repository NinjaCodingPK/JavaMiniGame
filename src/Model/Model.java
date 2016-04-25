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
    private static final int START_LOWER_BORDER = 0;
    private static final int START_UPPER_BORDER = 100;

    public Model() {
        lowerBorder = START_LOWER_BORDER;
        upperBorder = START_UPPER_BORDER;
        number = rand(START_LOWER_BORDER, START_UPPER_BORDER);
        statistic = new ArrayList<>();
    }

    /**
     *
     * @param min lower border of random value.
     * @param max upper border of random value.
     * @return random value from min to max. Don't include borders.
     */
    private int rand(int min, int max) {
        return min + (int)(Math.random() * ((max - min - 1)) + 1);
    }

    /**
     *
     * @return return random value from zero to max integer. Don't include borders.
     */
    private int rand() {
        return (int)(Math.random() * (Integer.MAX_VALUE - 1) + 1);
    }

    /**
     * Method checks the coincidence between user's number and the hidden number.
     * If it wasn't found set proper lower or upper border depends on value of user's number.
     * @param userNumber the number which user input in console.
     * @return true if user's number is equal to the hidden number. False if not.
     */
    public boolean checkUserNumber(int userNumber) {
        this.addTurn(userNumber);
        if(userNumber < this.getNumber()) {
            this.setLowerBorder(userNumber);
        }
        else
            if(userNumber > this.getNumber()) {
                this.setUpperBorder(userNumber);
            }
            else //if user's number is equal to the hidden number.
                return true;

        return false;
    }

    /**
     * Method for saving user's turns.
     * @param userNumber a number which user input the last time.
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
