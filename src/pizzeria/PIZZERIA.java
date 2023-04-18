package pizzeria;

import java.util.Scanner;
import java.util.ArrayList;

public class PIZZERIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza = new Pizza();


        int opprin = 0, opsec = 0;
        Empleado empleado1 = new Empleado("Diego");

        //************************************************************************************************************************************
        do {
            try {
                System.out.println("***********************************");
                System.out.println("BIENVENIDO A LA CAPO PIZZERIA");
                System.out.println("\n1.Cliente\n2.Empleado\n3.Salir");
                System.out.println("\nSELECCIONA UNA OPCION: ");
                opprin = sc.nextInt();
                switch (opprin) {
                    //************************************************************************************************************************************
                    case 1: //Cliente
                        do {
                            try {
                                System.out.println("**************CLIENTE*************");
                                System.out.println("¿QUE DESEA HACER?\n");
                                System.out.println("1.Ver menú\n2.Consultar carrito\n3.Salir a menu principal\n\nSELECCIONA UNA OPCIÓN:");
                                opsec = sc.nextInt();
                                switch (opsec) {
                                    case 1: //Hacer orden
                                        System.out.println("***************MENÚ***************");

                                        System.out.println("Estamos trabajando en ello...");
                                        break;
                                    case 2://Aquí para consultar el carrito
                                        System.out.println("Estamos trabajando en ello...");
                                        break;
                                    case 3://salir del menu
                                        System.out.println("SALIENDO A MENÚ PRINCIPAL...");
                                        break;
                                    default:
                                        System.out.println("**********OPCIÓN INVÁLIDA*********");
                                }
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("**********OPCIÓN INVÁLIDA*********\n");
                            }
                        } while (opsec != 3);
                        break;
                    //************************************************************************************************************************************
                    case 2: //Empleados
                        int fenix = 0;
                        int validar = 0;
                        do {
                            try {
                                sc.nextLine();
                                System.out.println("**************EMPLEADO************\n");
                                System.out.println("SELECCIONA UNA OPCIÓN:\n1.Iniciar sesion\n2.Salir\n");
                                fenix = sc.nextInt();
                                System.out.println("**********************************");
                                //************************************************************************************************************************************
                                switch (fenix) {
                                    case 1://Inicio de sesión
                                        empleado1.InicioSesion();
                                        break;
                                    case 2://Salir a menú principal
                                        System.out.println("\nSALIENDO A MENÚ PRINCIPAL...");
                                        break;
                                    default:
                                        System.out.println("**********OPCIÓN INVÁLIDA*********");
                                }
                                //************************************************************************************************************************************
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("**********OPCIÓN INVÁLIDA*********\n");
                            }
                        } while (fenix != 2);
                        break;
                    //************************************************************************************************************************************
                    case 3://salir
                        System.out.println("**********************************");
                        System.out.println("\t  GRACIAS POR VENIR ♥");//salir
                        break;
                    default:
                        System.out.println("**********OPCIÓN INVÁLIDA*********");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("**********OPCIÓN INVÁLIDA *********\n");
            }
        } while (opprin != 3);
    }
}
