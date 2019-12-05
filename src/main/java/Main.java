import Controller.Controller;
import Model.Model;
import Model.data.Vegetable;
import View.View;

public class Main {

    public static void main(String[] args) {
        new Controller(new Model(), new View());
    }
}
