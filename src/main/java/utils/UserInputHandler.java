package utils;

import models.Actor;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner skanik = new Scanner(System.in);
    public static MenuOptions getMenuOptionFromUser(){
    return MenuOptions.values()[getSelectedOptionFromUser()-1];
    }
    private static int getSelectedOptionFromUser(){
        int result=getIntegerFromUser();
        skanik.nextLine();
        if (result>0 && result<4){
            return result;
        }else{
            System.out.println("wrong option. it's not 1-3. try again");
            return getSelectedOptionFromUser();
        }
    }

    private static int getIntegerFromUser() {
        while (!skanik.hasNextInt()){
            skanik.nextLine();
            System.out.println("wrong. it's not integer");
        }
        return skanik.nextInt();
    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = skanik.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);

    }
}
