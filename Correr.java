
package Galaxia;

import planetas.Planetas;


public class Correr {

    public static void main(String[] args) {
    
        Planetas tierra = new Planetas("tierra");
        Planetas mercurio = new Planetas("mercurio");
        
        System.out.println("Informacion de este planeta.");
        tierra.brindarinformacion();
        System.out.println("Densidad de tierra:" + tierra.decifrarlaDensidad()
                + "kg/km");
        System.out.println("tierra, ¿Es un planeta exterior?" +
                (tierra.esPlanetaeXterior() ? "si" : "no"));
        
        System.out.println("\n--//---//---//---//---\n");
        
        System.out.println("Informacion de este planeta.");
        mercurio.brindarinformacion();
        System.out.println("Densidad de mercurio:" + mercurio.decifrarlaDensidad()
                + "kg/km");
        System.out.println("tierra, ¿Es un planeta exterior?" +
                (mercurio.esPlanetaeXterior() ? "si" : "no"));
    
    
        }
            
            
}
