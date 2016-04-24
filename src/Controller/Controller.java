package Controller;

import java.util.Scanner;

import Model.Model;
import View.View;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        int userNumber = -1;

        while(userNumber != model.getNumber()) {
            userNumber = inputIntValueWithScanner(sc);

            if(userNumber < model.getNumber()) {
                view.printMessage(view.LOWER_VALUE_MESSAGE);
                model.setLowerBorder(userNumber+1);
            }
            else
                if(userNumber > model.getNumber()) {
                    view.printMessage(view.BIGGER_VALUE_MESSAGE);
                    model.setUpperBorder(userNumber-1);
                }
        }

        view.printMessage(view.SUCCESS_MESSAGE);
    }

    // The Utility methods
    /**
     *
     * @param sc System.in Scanner
     * @return proper integer value between specified borders
     */
    public int inputIntValueWithScanner(Scanner sc) {
        int temp;
        view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());
        // Checking on proper integer value.
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA);
            view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());
            sc.next();
        }

        temp = sc.nextInt();
        // Checking if the integer value don't lie inside specified borders.
        if((temp < model.getLowerBorder() || (temp > model.getUpperBorder()))) {
            view.printMessage(view.WRONG_INPUT_INT_DATA);
            return inputIntValueWithScanner(sc);
        }
        return temp;
    }
}
