package ITE2_Donjon_And_Dragon.menu;

import ITE2_Donjon_And_Dragon.Menu;
import ITE2_Donjon_And_Dragon.Personnage;
import ITE2_Donjon_And_Dragon.personnage.*;

public class CreatePersonMenu extends Menu {

    @Override
    protected String[] getOptions() {
        return new String[]{"Choisissez un personnage:", "m -> Magicien", "g -> Guerrier"};
    }

    @Override
    protected void setUserChoice(String choice) {
        switch (choice) {
            case "g" -> {
                Personnage guerrier = new Guerrier();
            }
            case "m" -> {
                Personnage magicien = new Magicien();
            }
            case "q" -> System.out.println("A bientôt");
            default -> System.out.println("Veuillez saisir une option valide");
        }
    }

}

