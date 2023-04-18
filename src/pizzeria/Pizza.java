package pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {

    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String tamanio;
    private double precio;
    private String[] ingredients = new String[9];

    public Pizza(String nombre, String tamanio, double precio, String[] ingredients) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
        this.ingredients = ingredients;
    }

    // Constructor vacio
    public Pizza() {
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void showIngredients() {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i] != null) {
                System.out.println(ingredients[i]);
            }
        }
    }

    public void choosig() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pizza> menu = new ArrayList<>();
        //Arreglo de ingredientes
        String[] ingredientes = new String[]{
                "Pepperoni",
                "Pinia",
                "Champiniones",
                "Pimiento",
                "Jalapenio",
                "Cebolla",
                "Jamon",
                "Tocino",
                "Chorizo"
        };

        String[] ingrPizzaPepperoni = new String[9];
        ingrPizzaPepperoni[0] = "Pepperoni";

        Pizza pizzaPepperoni = new Pizza("Pepperoni ", "M ", 189, ingrPizzaPepperoni);
        menu.add(pizzaPepperoni);
        System.out.println(menu.get(0).nombre);
        int brokeThatShit = 0;
        do {

            System.out.println("Elige un ingrediente");
            pizzaPepperoni.showIngredients();
            ingrPizzaPepperoni[0] = ingredients[sc.nextInt()];
            pizzaPepperoni.showIngredients();
            System.out.println("presiona 1 para continuar");
            brokeThatShit = sc.nextInt();
        } while (brokeThatShit != 0);


    }

}