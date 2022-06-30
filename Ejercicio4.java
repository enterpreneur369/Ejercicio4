public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 3;
        // Condicional
        if (numero > 0) {
            System.out.println("Número positivo.");
        } else if (numero < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("El número es 0");
        }
        // While
        int numeroWhile = 0;
        while(numeroWhile < 3) 
        {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        // Do While
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while(numeroWhile < 3);
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        // Switch
        String estacion = "verano";
        switch(estacion) {
            case "primavera" : 
                System.out.println("Estás en primavera.");
                break;
            case "verano" : 
                System.out.println("Estás en verano.");
                break;
            case "otoño" : 
                System.out.println("Estás en otoño.");
                break;
            case "invierno" : 
                System.out.println("Estás en invierno.");
                break;
            default:
                System.out.println("No es una estación válida.");
        }
    }
}