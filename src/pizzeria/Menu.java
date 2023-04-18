package pizzeria;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Pizza> menu = new ArrayList<>();

    public Menu(ArrayList<Pizza> menu) {
        this.menu = menu;
    }

    public Menu(){

    }

    public ArrayList<Pizza> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Pizza> menu) {
        this.menu = menu;
    }


    //
    public void usarMenu(){
        //base de la pizza
        String base = "Masa, Salsa de tomate, queso, ";
        //Ingredientes disponibles
        String[] ingredientes = new String[]{
                "Pepperoni",        //0
                "Pinia",            //1
                "Champiniones",     //2
                "Pimiento",         //3
                "Jalapenios",       //4
                "Cebolla",          //5
                "Jamon",            //6
                "Tocino",           //7
                "Chorizo"           //8
        };

        //Pizzza de pepperoni
        String[] ingrPizzaPepperoni = new String[10];
        ingrPizzaPepperoni[0] = base;
        ingrPizzaPepperoni[1] = ingredientes[0];

        //Pizzza Hawaina
        String[] ingrPizzaHawaina = new String[10];
        ingrPizzaPepperoni[0] = base;
        ingrPizzaPepperoni[1] = ingredientes[6];
        ingrPizzaPepperoni[2] = ingredientes[1];

        //Pizzza Extravaganza
        String[] ingrPizzaExtravaganza = new String[10];
        ingrPizzaPepperoni[0] = base;
        ingrPizzaPepperoni[1] = ingredientes[0];
        ingrPizzaPepperoni[2] = ingredientes[6];
        ingrPizzaPepperoni[3] = ingredientes[8];
        ingrPizzaPepperoni[4] = ingredientes[2];
        ingrPizzaPepperoni[5] = ingredientes[3];
        ingrPizzaPepperoni[6] = ingredientes[5];

        //Pizzza CarnesFrias
        String[] ingrPizzaCarnesFrias = new String[10];
        ingrPizzaPepperoni[0] = base;
        ingrPizzaPepperoni[1] = ingredientes[0];
        ingrPizzaPepperoni[2] = ingredientes[6];
        ingrPizzaPepperoni[3] = ingredientes[8];

        //Pizzza Mexicana
        String[] ingrPizzaMexicana = new String[10];
        ingrPizzaPepperoni[0] = base;
        ingrPizzaPepperoni[1] = ingredientes[8];
        ingrPizzaPepperoni[2] = ingredientes[4];
        ingrPizzaPepperoni[3] = ingredientes[5];

        // se crean las pizzas oficiales con sus respectivos ingredientes
        Pizza pizzaPepperoni = new Pizza("Pepperoni ","M ",120,ingrPizzaPepperoni);

        Pizza pizzaHawaina = new Pizza("Hawaina ","M ",120,ingrPizzaHawaina);

        Pizza pizzaExtravaganaza = new Pizza("Extravaganza ","M ",120,ingrPizzaExtravaganza);

        Pizza pizzaCarnesFrias = new Pizza("CarnesFrias ","M ",120,ingrPizzaCarnesFrias);

        Pizza pizzaMexicana = new Pizza("Mexicana ","M ",120,ingrPizzaMexicana);

        //se crea el menu de pizzas como una array list que almacena objetos del tipo pizza
        ArrayList<Pizza> menuDePizzas = new ArrayList<>();

        menuDePizzas.add(pizzaPepperoni);
        menuDePizzas.add(pizzaHawaina);
        menuDePizzas.add(pizzaExtravaganaza);
        menuDePizzas.add(pizzaCarnesFrias);
        menuDePizzas.add(pizzaMexicana);

        Menu menu = new Menu(menuDePizzas);

        menu.mostrar();
    }
    public void mostrar(){
        for (Pizza pizza : menu) {
            System.out.println(pizza.getNombre());
        }
    }


}
