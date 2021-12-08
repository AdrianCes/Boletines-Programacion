public class Boletin12 {


    public static void main(String[] args) {
        Coche coche1 = new Coche("96956");
        Coche coche2 = new Coche("98746");
        Coche coche3 = new Coche("59476");
        Coche coche4 = new Coche("96464");
        Coche coche5 = new Coche("84625");
        Coche coche6 = new Coche("27593");
        Garaje.entradaCoche(coche1);
        Garaje.salidaCoche(4, 50, coche1);
        Garaje.entradaCoche(coche2);
        Garaje.entradaCoche(coche3);
        Garaje.entradaCoche(coche4);
        Garaje.entradaCoche(coche5);
        Garaje.entradaCoche(coche6);
        Garaje.entradaCoche(coche1);
        Garaje.salidaCoche(2, 50, coche5);
    }
    
}
