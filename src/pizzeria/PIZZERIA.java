package pizzeria;

import java.util.Scanner;
import java.util.ArrayList;

public class PIZZERIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pizza p1 = new Pizza();

        int opprin = 0, opsec = 0;
        /*
        String contraAdmin, usuarioAdmin;
        String[] Usuario;
        String[] contrasenia;

        Usuario = new String[]{"LeoDoca", "Charlie", "Dieguito", "Gil", "Alan"};
        contrasenia = new String[]{"20223tn049", "20223tn066", "20223tn059", "20223tn052", "20223tn046"};

        */

        Empleado empleado1 = new Empleado("Diego");
        //p1.Pizza();

        do {
            try {
                //************************************************************************************************************************************System.out.println("**********************************");
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
                                    case 1:
                                        //Aquí metemos todo el menú
                                        break;
                                    case 2:
                                        //Aquí para consultar el carrito
                                        break;
                                    case 3:
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
                        // Usuarios: LeoDoca, Charlie, Dieguito, Gil, Alan
                        // Contraseñas: 20223tn049, 20223tn066, 20223tn059, 20223tn052, 20223tn046
                        int fenix = 0;
                        int validar = 0;
                        do {
                            try {
                                sc.nextLine();
                                System.out.println("**************EMPLEADO************\n");
                                System.out.println("1.Iniciar sesion\n2.Salir\n\nSELECCIONA UNA OPCIÓN:");
                                fenix = sc.nextInt();
                                //sc.nextLine();
                                System.out.println("**********************************");
                                switch (fenix) {

                                    //************************************************************************************************************************************
                                    case 1://Inicio de sesión
                                        Scanner em = new Scanner(System.in);

                                        int opter = 0;
                                        do{
                                            switch (fenix){
                                                case 1:
                                                    empleado1.InicioSesion();
                                                    break;
                                                case 2://salir
                                                    System.out.println("===SALISTE===");
                                                    break;
                                            }
                                        }while (opter !=2);
                                        //************************************************************************************************************************************
                                        if(empleado1.isInicio()){
                                            do {
                                                System.out.println("**********PANEL DE CONTROL********\n");
                                                System.out.println("1.Agregar nueva pizza\n2.Quitar pizza\n3.Editar precio\n4.Salir");
                                                opter = em.nextInt();
                                            } while (opter != 4);
                                            System.out.println("**********************************");
                                            System.out.println("");
                                        }else{
                                            System.out.println("suerte para la proxima");
                                        }

                                        break;
                                    //************************************************************************************************************************************
                                    case 2://Salir a menú principal
                                        System.out.println("\nSALIENDO A MENÚ PRINCIPAL...");
                                        break;
                                    default:
                                        System.out.println("**********OPCIÓN INVÁLIDA*********");
                                }
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("**********OPCIÓN INVÁLIDA*********\n");
                            }
                        } while (fenix != 2);
                        break;
                    //************************************************************************************************************************************
                    case 3:
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
