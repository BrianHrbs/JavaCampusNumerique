package ITE2_Donjon_And_Dragon.menu;

import ITE2_Donjon_And_Dragon.Menu;

public class StartMenu extends Menu {

    @Override
    protected String[] getOptions() {
        return new String[]{
                "    ____                                        ___              __   ____                             \n" +
                "   / __ \\__  ______  ____ ____  ____  ____     /   |  ____  ____/ /  / __ \\_________ _____ _____  ____ \n" +
                "  / / / / / / / __ \\/ __ `/ _ \\/ __ \\/ __ \\   / /| | / __ \\/ __  /  / / / / ___/ __ `/ __ `/ __ \\/ __ \\\n" +
                " / /_/ / /_/ / / / / /_/ /  __/ /_/ / / / /  / ___ |/ / / / /_/ /  / /_/ / /  / /_/ / /_/ / /_/ / / / /\n" +
                "/_____/\\__,_/_/ /_/\\__, /\\___/\\____/_/ /_/  /_/  |_/_/ /_/\\__,_/  /_____/_/   \\__,_/\\__, /\\____/_/ /_/ \n" +
                "                  /____/                                                           /____/              ",
                "n -> Créer un personnage", "x -> Quitter le jeu"};
    }

    @Override
    protected void setUserChoice(String choice) {
        if (choice.equals("n")) {
            Menu createPerson = new CreatePersonMenu();
            createPerson.displayMenu();
        } else if (choice.equals("x")) {
            System.out.println(
                    " █████      ██████  ██ ███████ ███    ██ ████████  ██████  ████████     ██ \n" +
                    "██   ██     ██   ██ ██ ██      ████   ██    ██    ██    ██    ██        ██ \n" +
                    "███████     ██████  ██ █████   ██ ██  ██    ██    ██    ██    ██        ██ \n" +
                    "██   ██     ██   ██ ██ ██      ██  ██ ██    ██    ██    ██    ██           \n" +
                    "██   ██     ██████  ██ ███████ ██   ████    ██     ██████     ██        ██ ");
        } else {
            System.out.println("Veuillez saisir une option valide");
        }
    }
}