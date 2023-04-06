package pizzeria;

import java.util.Scanner;

public class Empleado {

    private String nombre;
    private boolean Inicio;//es para verificar que el empleado inicio sesion

    private String[] Usuario;
    private String[] contrasenia;

    //constructores
    public Empleado(){

    }
    public Empleado(String nombre) {
        this.nombre = nombre;
        //Inicio = inicio;
        //Usuario = usuario;
        //this.contrasenia = contrasenia;
    }

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

    //metodos
    public void InicioSesion(){
        Usuario = new String[]{"LeoDoca", "Charlie", "Dieguito", "Gil", "Alan"};
        contrasenia = new String[]{"20223tn049", "20223tn066", "20223tn059", "20223tn052", "20223tn046"};
        //
        Scanner em = new Scanner(System.in);
        String contraAdmin, usuarioAdmin;
        int cont = 5,lim = 5;
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
                cont = 0;
                this.Inicio = false;
            } else {
                System.out.println("\nUSUARIO Y/O CONTRASEÑA INCORRECTO");
                System.out.println("**********************************");

                //return false;
            }
        } while (cont != 0);
    }

}
