public class Main {
    public static void main(String[] args) {
        int modulos = 6;
        int estudio = 45; //+ 50h en el trabajo =(

        System.out.print("Estudiante " + args[0] + ":");
        //realizamos la comprobacion de los argumentos de entrada
        System.out.println(veredicto(args[1], args[2]));
    }

    public static String veredicto(String cadena1, String cadena2) {
        if (Integer.parseInt(cadena1) > Integer.parseInt(cadena2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo";
        } else if (Integer.parseInt(cadena1) == Integer.parseInt(cadena2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        return "Ideal. Trabajas los contenidos en casa.";

        //Diego Pérez Antón
    }
}