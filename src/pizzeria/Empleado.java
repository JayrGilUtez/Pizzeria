package pizzeria;

import java.util.Scanner;

public class Empleado {

    private String nombre;
    private boolean Inicio;//es para verificar que el empleado inicio sesion

    private String[] Usuario;
    private String[] contrasenia;

    //************************************************************************************************************************************
    //constructores

    public Empleado(){

    }
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //************************************************************************************************************************************
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInicio() {
        return Inicio;
    }

    public void setInicio(boolean inicio) {
        Inicio = inicio;
    }

    public String[] getUsuario() {
        return Usuario;
    }

    public void setUsuario(String[] usuario) {
        Usuario = usuario;
    }

    public String[] getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String[] contrasenia) {
        this.contrasenia = contrasenia;
    }

    //************************************************************************************************************************************
    //metodos
    public void InicioSesion(){
        Usuario = new String[]{"LeoDoca", "Charlie", "PinoCosmico", "1", "Alan"}; // cambie mi usuario a 1
        contrasenia = new String[]{"20223tn049", "20223tn066", "20223tn059", "1", "20223tn046"}; //cambie mi password a 1
        //***********************************************************************************************
        Scanner em = new Scanner(System.in);
        String contraAdmin, usuarioAdmin;
        boolean cont = true;
        int lim = 5, opter = 0;
        this.Inicio = false;
        //ciclo

        do {
            System.out.printf("Usuario: ");
            usuarioAdmin = em.nextLine();
            System.out.printf("Contrasenia: ");
            contraAdmin = em.nextLine();

            for (int i = 0; i < lim; i++) {
                if (usuarioAdmin.equals(Usuario[i]) && contraAdmin.equals(contrasenia[i])) {
                    // System.out.println("\nINICIO DE SESIÓN CORRECTO");
                    this.Inicio = true;
                }
            }

            if (this.Inicio == true) {
                System.out.println("\n    INICIO DE SESIÓN CORRECTO\n");
            } else {
                System.out.println("\nUSUARIO Y/O CONTRASEÑA INCORRECTO");
                System.out.println("**********************************");

                //return false;
            }
            if(isInicio()){
                do {
                    try {
                        em.nextLine();
                        System.out.println("**********PANEL DE CONTROL********\n");
                        System.out.println("1.Agregar nueva pizza\n2.Quitar pizza\n3.Editar precio\n4.Salir");
                        opter = em.nextInt();
                        switch (opter) {
                            case 1://agregar pizza
                                //System.out.println("Estamos trabajando en ello...");
                                Pizza pizza =  new Pizza();
                                pizza.choosig();
                                break;
                            case 2://quitar pizza
                                System.out.println("Estamos trabajando en ello...");
                                break;
                            case 3://editar precio
                                System.out.println("Estamos trabajando en ello...");
                                break;
                            case 4://salir
                                System.out.println("Saliste del Menu empleado");
                                //this.Inicio = true;
                                cont = false;
                                break;
                            default:
                                System.out.println("**********OPCIÓN INVÁLIDA*********\n");
                        }
                    }catch (java.util.InputMismatchException e){
                        System.out.println("**********OPCIÓN INVÁLIDA*********\n");
                    }
                } while (opter != 4);
                System.out.println("**********************************");
                System.out.println("");
            }
        } while (cont);
    }
}
