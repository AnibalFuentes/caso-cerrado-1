package vista;

import java.util.Date;
import modelo.*;

public class PruebaCasoCerrado {

    public static void main(String[] args) {
        //Caso #1
        Detective detective1 = new Detective("1192344443", "Dominic", "Rangok", 5, "Narcoticos");
        Date fechaRegistro1 = new Date();
        Anotacion anotacion1 = new Anotacion(fechaRegistro1, "Sin observacion");
        Bitacora bitacora1 = new Bitacora(anotacion1);
        UltimaDireccion ultimaDireccion = new UltimaDireccion("01", "Wonsten", "California", "Cesar", "Colombia", true, "Casa de rejas color blanco");
        Sospechoso sospechoso1 = new Sospechoso("010102301", "Pedro Diaz", "Malambo", ultimaDireccion);
        Caso caso = new Caso("Hot Dog", "Detencion de droga por la frontera", "A", detective1, bitacora1, sospechoso1);
        System.out.println(caso.toString());
    }
}
