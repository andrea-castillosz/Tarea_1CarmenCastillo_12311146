/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_1_carmencastillo.pkg12311146;

import java.util.Scanner;

/**
 *
 * @author casti
 */
public class Tarea_1_CarmenCastillo12311146 {

    static Scanner sc = new Scanner(System.in, "ISO-8859-1");
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguirmenu = true;
        while (seguirmenu) {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Cuantos numeros pares e impares hay en este rango?");
            System.out.println("2. Triangulos y mas Triangulos");
            System.out.println("3. Anita lava la tina");
            System.out.println("4. Codigos Secretos");
            System.out.println("5. Salir.");
            System.out.print("Ingrese su opcion: ");
            int opcionmenu = leer.nextInt();
            System.out.println("");

            switch (opcionmenu) {
                case 1:
                    System.out.println("1. Cuantos numeros pares e impares hay en este rango?");
                    System.out.print("Ingrese el numero de su rango: ");
                    int rango = leer.nextInt();
                    int pares = 0;
                    int impares = 0;
                    for (int i = 0; i < rango; i++) {
                        if (i % 2 == 0) {
                            pares++;
                        } else {
                            impares++;
                        }

                    }

                    System.out.print("Entre 0 y " + rango + " existen " + pares + " numeros pares y estos son: ");

                    for (int i = 0; i < rango; i++) {
                        if (i % 2 == 0) {
                            System.out.print("[" + i + "]");
                        }

                    }

                    System.out.println("");
                    System.out.print("Entre 0 y " + rango + " existen " + pares + " numeros pares y estos son: ");

                    for (int i = 0; i < rango; i++) {
                        if (i % 2 != 0) {
                            System.out.print("[" + i + "]");
                        }

                    }
                    System.out.println("");

                    break;

                case 2:
                    System.out.println("2. Triangulos y mas Triangulos");
                    boolean seguirsubmenu = true;
                    while (seguirsubmenu) {
                        System.out.println(" ");
                        System.out.println("SubMenu de Triangulos");
                        System.out.println("1. Triangulo Equilatero");
                        System.out.println("2. Triangulo Rectangulo");
                        System.out.println("3. Salir");
                        System.out.print("Ingrese su opcion: ");
                        int opcionsub = leer.nextInt();
                        System.out.println("");

                        switch (opcionsub) {
                            case 1:
                                System.out.println("Usted selecciono Triangulo Equilatero!");
                                System.out.print("Ïngrese el tamaño: ");
                                int tamannio = leer.nextInt();
                                for (int i = 0; i < tamannio; i++) {
                                    for (int j = 0; j < tamannio - i; j++) {
                                        System.out.print(" ");
                                    }
                                    for (int k = 0; k <= i; k++) {
                                        System.out.print("*");
                                    }
                                    for (int l = 0; l < i; l++) {
                                        System.out.print("*");
                                    }
                                    System.out.println(" ");
                                }
                                break;

                            case 2:
                                System.out.println("Usted selecciono Triangulo Rectangulo!");
                                System.out.print("Ïngrese el tamaño: ");
                                tamannio = leer.nextInt();
                                for (int t = 1; t <= tamannio; t++) {
                                    for (int c = 1; c <= t; c++) {
                                        System.out.print("*");
                                    }
                                    System.out.println(" ");
                                }
                                break;

                            case 3:
                                seguirsubmenu = false;
                                break;

                        }

                    }

                    break;

                case 3:
                    System.out.print("Ingrese una palabra/oración: ");
                    String oracion = sc.nextLine().toLowerCase().replaceAll(" ", "");
                    //quitarle las mayusculas por si acaso

                    boolean esPalindromo = true;

                    for (int i = 0; i < oracion.length() / 2; i++) {
                        if (oracion.charAt(i) != oracion.charAt(oracion.length() - 1 - i)) {
                            esPalindromo = false;
                            break;
                        }
                    }

                    if (esPalindromo) {
                        System.out.println("La palabra/oracion es palíndroma.");
                    } else {
                        System.out.println("La palabra/oracion no es palíndroma.");
                    }
                    break;

                case 4:
                    System.out.println("4. Codigos Secretos");
                    System.out.println("Ingrese su codigo: ");
                    String cadena = sc.next().toLowerCase();
                    boolean valid = true;
                    while (valid) {

                        //la longitud del string siempre debe de ser par
                        if (cadena.length() % 2 == 0) {
                            int invalid = 0;
                            for (int i = 0; i < cadena.length(); i += 2) {
                                int letra = cadena.charAt(i);
                                int num = cadena.charAt(i + 1);
                                if (letra >= 97 && letra <= 122 && num >= 48 && num <= 57) {
                                } else {
                                    invalid++;
                                }
                                if (invalid == 0) {
                                    valid = false;
                                } else {
                                    invalid = 0;
                                    System.out.println("Codigo no valido, ingrese otro: ");
                                    cadena = sc.next();
                                }
                            }
                        } else {
                            System.out.println("Codigo no valido, ingrese otro: ");
                            cadena = sc.next();
                        }
                    }

                    String codigomod = "";

                    for (int i = 0; i < cadena.length(); i += 2) {
                        char letra = cadena.charAt(i);
                        String num = "";
                        num += cadena.charAt(i + 1);
                        int nume = Integer.parseInt(num);

                        for (int j = 0; j < nume; j++) {
                            codigomod += letra;
                        }
                    }
                    System.out.println(codigomod);

                    break;

                default:
                    seguirmenu = false;
                    break;

            }

        }

    }

}
