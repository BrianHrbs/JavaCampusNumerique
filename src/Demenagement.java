public class Demenagement {

    int count;
    int maxcamion;

    public Demenagement(int countactual, int maxcarton) {
        count = countactual;
        maxcamion = maxcarton;
    }

    public static void main(String[] args) {
        int carton = 3729;
        int max = 9;

        while(carton != 0) {
            if (carton >= 9) {
                carton = carton - max;
                System.out.println("Le camion fait un voyage de " + max + " cartons");
                System.out.println("Il reste " + carton + " au local");
            } else {
                System.out.println("Le camion fait un voyage de " + carton + " cartons");
                carton = 0;
                System.out.println("Il ne reste aucun carton au local");
            }
            System.out.println("___________________________________________________");
        }
        System.out.println("EXERCICE DEMENAGEMENT FINIS");

    }
}

