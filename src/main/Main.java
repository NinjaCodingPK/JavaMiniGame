package main;

import model.Model;
import view.View;
import controller.Controller;
/**
 * Created by wookie on 4/22/16.
 */
public class Main {
    public static void main(String args[]) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
