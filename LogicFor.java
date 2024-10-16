import java.util.Scanner;

public class LogicFor{

    public static void main(String[] args) {
        // Variables inicializadas
        double edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, promedioEdad = 0, promedioEstatura = 0;
        double porcentajepersonas = 0, contadorPersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
        int cantidadPersonas = 2;

        // Scanner para entrada de usuario
        Scanner scanner = new Scanner(System.in);

        for (int numerPersona = 1; numerPersona <= cantidadPersonas; numerPersona++) {
            // Solicitar datos
            System.out.print("Ingrese la edad de la persona " + numerPersona + ": ");
            edad = scanner.nextDouble();
            
            System.out.print("Ingrese el estado civil de la persona " + numerPersona + " (1. soltero, 2. casado): ");
            estadoCivil = scanner.nextDouble();
            
            System.out.print("Ingrese la estatura de la persona " + numerPersona + " en cms: ");
            estatura = scanner.nextDouble();
            
            System.out.print("Ingrese el sexo de la persona " + numerPersona + " (1. hombre, 2. mujer): ");
            sexo = scanner.nextDouble();

            // Condición para cumplir con los requisitos
            if (edad > 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }

        // Evitar la división por cero si no se cumple la condición en ninguna persona
        if (contadorPersonas > 0) {
            promedioEdad = acumuladorEdad / contadorPersonas;
            promedioEstatura = acumuladorEstatura / contadorPersonas;
        }

        // Cálculo del porcentaje de personas que cumplen
        porcentajepersonas = (contadorPersonas / cantidadPersonas) * 100;

        // Mostrar resultados
        System.out.println("El promedio de edad de las personas que cumplen es " + promedioEdad + " años");
        System.out.println("El promedio de estatura de las personas que cumplen es " + promedioEstatura + " centímetros");
        System.out.println("El porcentaje de personas que cumplen con la condición es " + porcentajepersonas + "%");

        // Cerrar scanner
        scanner.close();
    }
}