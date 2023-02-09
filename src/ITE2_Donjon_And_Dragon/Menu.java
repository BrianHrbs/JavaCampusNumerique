package ITE2_Donjon_And_Dragon;

import java.util.Scanner;

abstract public class Menu {

    abstract protected String[] getOptions();

    public void displayMenu() {
        for (String options : getOptions()) {
            System.out.println(options);
        }
        String userChoice = getUserChoice();
        this.setUserChoice(userChoice);
    }
    protected String getUserChoice() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    abstract protected void setUserChoice(String choice);

}