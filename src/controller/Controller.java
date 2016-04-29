package controller;

import java.util.Scanner;

import model.GlobalConstants;
import model.Model;
import view.View;


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
        model.setBorders(GlobalConstants.START_LOWER_BORDER, GlobalConstants.START_UPPER_BORDER);
        model.setSecretValue();

        while(!model.checkUserNumber(inputIntValueWithScanner(sc))) {
            view.printMessage(View.WRONG_MESSAGE);
        }

        view.printMessage(View.SUCCESS_MESSAGE);
        view.printStatistic(model.getStatistic());
    }

    /**
     *
     * @param sc System.in Scanner
     * @return proper integer value between specified borders
     */
    private int inputIntValueWithScanner(Scanner sc) {
        int temp;
        view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());

        // Checking on proper integer value.
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());
            sc.next();
        }

        temp = sc.nextInt();
        // Checking if the integer value doesn't lie inside a specified borders.
        if(((temp <= model.getLowerBorder()) || (temp >= model.getUpperBorder()))) {
            view.printMessage(View.WRONG_INPUT_NOT_INSIDE);
            return inputIntValueWithScanner(sc);
        }
        return temp;
    }
}
