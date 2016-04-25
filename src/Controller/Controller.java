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

        while(!model.checkUserNumber(inputIntValueWithScanner(sc))) {
            view.printMessage(View.WRONG_MESSAGE);
        }

        view.printMessage(View.SUCCESS_MESSAGE);
        //view.printStatistic(model.getStatistic());
    }

    // The Utility methods
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
        if((temp <= model.getLowerBorder() || (temp >= model.getUpperBorder()))) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            return inputIntValueWithScanner(sc);
        }
        return temp;
    }
}
