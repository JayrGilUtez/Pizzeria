package pizzeria;

public class Ingrediente {
    protected String[] ingredientes = new String[]{"Pepperoni", "Pinia", "Champiniones", "Morron", "Jalapenio", "Cebolla", "Jamon", "Tocino", "Salchicha"};
   // protected String[] ingredienteEnPizza;
    protected boolean pepperoni;
    protected boolean pinia;
    protected boolean champiniones;
    protected boolean morron;
    protected boolean jalapenio;
    protected boolean cebolla;
    protected boolean jamon;
    protected boolean tocino;
    protected boolean salchicha;
    //♥

    public  Ingrediente(){
    }

    public Ingrediente(String[] ingredientes, /*String[] ingredienteEnPizza, */boolean pepperoni,
                       boolean pinia, boolean champiniones, boolean morron, boolean jalapenio,
                       boolean cebolla, boolean jamon, boolean tocino, boolean salchicha) {
        this.ingredientes = ingredientes;
      //  this.ingredienteEnPizza = ingredienteEnPizza;
        this.pepperoni = pepperoni;
        this.pinia = pinia;
        this.champiniones = champiniones;
        this.morron = morron;
        this.jalapenio = jalapenio;
        this.cebolla = cebolla;
        this.jamon = jamon;
        this.tocino = tocino;
        this.salchicha = salchicha;
    }


    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

  /*  public String[] getIngredienteEnPizza() {
        return ingredienteEnPizza;
    }

    public void setIngredienteEnPizza(String[] ingredienteEnPizza) {
        this.ingredienteEnPizza = ingredienteEnPizza;
    }
*/
    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isPinia() {
        return pinia;
    }

    public void setPinia(boolean pinia) {
        this.pinia = pinia;
    }

    public boolean isChampiniones() {
        return champiniones;
    }

    public void setChampiniones(boolean champiniones) {
        this.champiniones = champiniones;
    }

    public boolean isMorron() {
        return morron;
    }

    public void setMorron(boolean morron) {
        this.morron = morron;
    }

    public boolean isJalapenio() {
        return jalapenio;
    }

    public void setJalapenio(boolean jalapenio) {
        this.jalapenio = jalapenio;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isTocino() {
        return tocino;
    }

    public void setTocino(boolean tocino) {
        this.tocino = tocino;
    }

    public boolean isSalchicha() {
        return salchicha;
    }

    public void setSalchicha(boolean salchicha) {
        this.salchicha = salchicha;
    }


}
