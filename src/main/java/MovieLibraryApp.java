import models.Actor;
import utils.Menu;
import utils.UserInputHandler;

public class MovieLibraryApp {
    public static void main(String[] args) {
        while (true) {
            Menu.printMenu();

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE: //metoda get random movie info
                    break;

                case DISPLAYACTORS: //metoda Display all movies for selected actor
                    break;

                case QUIT: //exit
                    System.out.println("bye");
                    System.exit(1);
            }
        }
    }
}
