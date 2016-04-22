package View;

/**
 * Created by wookie on 4/22/16.
 */
public class View {
    // Text's constants
    public static final String WRONG_INPUT_INT_DATA = "Wrong input!";
    private static final String REQUEST_MESSAGE = "Please input an integer value between values ";
    public static final String BIGGER_VALUE_MESSAGE = "Your value is bigger than our's. ";
    public static final String LOWER_VALUE_MESSAGE = "Your value is lower than our's. ";
    public static final String SUCCESS_MESSAGE = "YES! It's the right number. ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRequestMessage(int lowerBorder, int upperBorder){
        System.out.println(REQUEST_MESSAGE + lowerBorder + " and " + upperBorder);
    }

}
