package view;

import java.util.ArrayList;

/**
 * Created by wookie on 4/22/16.
 */
public class View {
    // Text's constants
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! It's not an integer!";
    public static final String WRONG_INPUT_NOT_INSIDE = "Wrong input! Your value isn't inside borders";
    private static final String REQUEST_MESSAGE = "Please input an integer value between values ";
    public static final String WRONG_MESSAGE = "Nope! Your value is wrong. Try again.";
    public static final String SUCCESS_MESSAGE = "YES! It's the right number. ";
    //public static final String BIGGER_VALUE_MESSAGE = "Your value is bigger than our's. ";
    //public static final String LOWER_VALUE_MESSAGE = "Your value is lower than our's. ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRequestMessage(int lowerBorder, int upperBorder){
        System.out.println(REQUEST_MESSAGE + lowerBorder + " and " + upperBorder);
    }

    public void printStatistic(ArrayList<Integer> statistic) {
        System.out.println("Your turns :");
        for(int i : statistic)
            System.out.println(i);
    }

}
