public class Main {
    public static void main(String[] args) {

        int numerolf = 0;

        if (numerolf > 0) {
            System.out.println("La variable analizada es positiva");
        }
        else if (numerolf < 0) {
            System.out.println("La variable analizada es negativa");
        }
        else{
            System.out.println("La variable analizada es igual a cero");
        }

        System.out.println("-----------+-----------");

        int numeroWhile = -2;

        while (numeroWhile < 3){
            System.out.println("numeroWhile vale " + numeroWhile);
            numeroWhile++;
        }

        System.out.println("-----------+-----------");

        do {
            numeroWhile++;
            System.out.println("numeroWhile vale " + numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("-----------+-----------");

        for (int numeroFor= 0; numeroFor<=3; numeroFor++)
            System.out.println("numeroFor vale " + numeroFor);

        System.out.println("-----------+-----------");

        var estacion = "Panda";

        switch (estacion){
            case "Verano":
                System.out.println("Es " + estacion + " sál a disfrutar!");
                break;
            case "Otoño":
                System.out.println("Es " + estacion + " hora de barrer las hojas!");
                break;
            case "Invierno":
                System.out.println("Es " + estacion + " hora de chocolate caliente!");
                break;
            case "Primavera":
                System.out.println("Es " + estacion + " tu mundo florece!");
                break;
            default:
                System.out.println("¿Qué quieres decir con '" + estacion + "'?");
                break;
        }


        System.out.println("-----------+-----------");
        System.out.println("Ready sr!");
    }
}