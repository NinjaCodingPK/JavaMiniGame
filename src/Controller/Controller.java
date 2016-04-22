package Controller;

import java.util.Scanner;

import Model.Model;
import View.View;

/**
 * Created by wookie on 4/22/16.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        //model.setValue(inputIntValueWithScanner(sc));
        //model.addIntOurValue(4);

        //view.printMessageAndInt(view.OUR_INT, model.getValue());
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
