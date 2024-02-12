package imc;

import java.util.Scanner;

/**
 * Esta clase representa el resultado del cálculo del Índice de Masa Corporal (IMC).
 * Permite al usuario introducir su peso y altura, calcular su IMC y mostrar el resultado.
 */
public class Resultado {

    /**
     * Este método ejecuta el cálculo del IMC.
     * Solicita al usuario que ingrese su nombre, peso y altura,
     * calcula el IMC y muestra el resultado junto con su clasificación.
     */
    public void executar() {
        // Declaración de variables
        int pesoDoUsuario;
        double alturaDoUsuario, valorImc;
        String nomeDoUsuario;
        Imc imc = new Imc(); // Creación de un objeto de la clase Imc para realizar el cálculo del IMC

        // Leer la entrada del usuario desde el teclado
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o o seu nome? ");
        nomeDoUsuario = leitor.nextLine();

        // Solicitar al usuario que ingrese su peso
        System.out.print(nomeDoUsuario + " digite seu peso: ");
        pesoDoUsuario = leitor.nextInt();

        // Solicitar al usuario que ingrese su altura
        System.out.print("\nDigite a sua altura: ");
        alturaDoUsuario = leitor.nextDouble();

        leitor.close(); // Cerrar el Scanner después de leer la entrada del usuario

        // Calcular el IMC utilizando el objeto Imc y los valores proporcionados por el usuario
        valorImc = imc.calcularImc(pesoDoUsuario, alturaDoUsuario);

        // Mostrar el resultado del IMC
        System.out.println("\n" + nomeDoUsuario + ", seu imc é " + valorImc + ".");

        // Clasificar el IMC y mostrar el resultado
        imc.classificarImc(valorImc);
    }

}