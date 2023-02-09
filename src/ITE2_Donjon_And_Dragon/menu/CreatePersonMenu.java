package ITE2_Donjon_And_Dragon.menu;

import ITE2_Donjon_And_Dragon.Menu;
import ITE2_Donjon_And_Dragon.Personnage;
import ITE2_Donjon_And_Dragon.personnage.*;

public class CreatePersonMenu extends Menu {

    @Override
    protected String[] getOptions() {
        return new String[]{"Choisissez un personnage:",
                "                    ____ \n" +
                "                  .'* *.'\n" +
                "               __/_*_*(_\n" +
                "              / _______ \\\n" +
                "             _\\_)/___\\(_/_ \n" +
                "            / _((\\- -/))_ \\\n" +
                "            \\ \\())(-)(()/ /\n" +
                "             ' \\(((()))/ '\n" +
                "            / ' \\)).))/ ' \\\n" +
                "           / _ \\ - | - /_  \\\n" +
                "          (   ( .;''';. .'  )\n" +
                "          _\\\"__ /    )\\ __\"/_\n" +
                "            \\/  \\   ' /  \\/\n" +
                "             .'  '...' ' )\n" +
                "              / /  |  \\ \\\n" +
                "             / .   .   . \\\n" +
                "            /   .     .   \\\n" +
                "           /   /   |   \\   \\\n" +
                "         .'   /    b    '.  '.\n" +
                "     _.-'    /     Bb     '-. '-._ \n" +
                " _.-'       |      BBb       '-.  '-. \n" +
                "(________mrf\\____.dBBBb.________)____) -----------> m pour ----> Magicien",


                " /\\\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||           {}\n" +
                        " ||          .--.\n" +
                        " ||         /.--.\\\n" +
                        " ||         |====|\n" +
                        " ||         |`::`|\n" +
                        "_||_    .-;`\\..../`;_.-^-._\n" +
                        " /\\\\   /  |...::..|`   :   `|\n" +
                        " |:'\\ |   /'''::''|   .:.   |\n" +
                        "  \\ /\\;-,/\\   ::  |..:::::..|\n" +
                        "   \\ <` >  >._::_.| ':::::' |\n" +
                        "    `\"\"`  /   ^^  |   ':'   |\n" +
                        "          |       \\    :    /\n" +
                        "          |        \\   :   / \n" +
                        "          |___/\\___|`-.:.-`\n" +
                        "           \\_ || _/    `\n" +
                        "           <_ >< _>\n" +
                        "           |  ||  |\n" +
                        "           |  ||  |\n" +
                        "          _\\.:||:./_\n" +
                        "         /____/\\____\\ -----------> g pour ----> Guerrier"};
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
            case "x" -> System.out.println(
                            " █████      ██████  ██ ███████ ███    ██ ████████  ██████  ████████     ██ \n" +
                            "██   ██     ██   ██ ██ ██      ████   ██    ██    ██    ██    ██        ██ \n" +
                            "███████     ██████  ██ █████   ██ ██  ██    ██    ██    ██    ██        ██ \n" +
                            "██   ██     ██   ██ ██ ██      ██  ██ ██    ██    ██    ██    ██           \n" +
                            "██   ██     ██████  ██ ███████ ██   ████    ██     ██████     ██        ██ ");
            default -> System.out.println("Veuillez saisir une option valide");
        }
    }

}

