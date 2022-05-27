import java.util.ArrayList;

public abstract class Atraccion {

    //  Metodo abstracto visitar
    //  parametros : 
    //  ArrayList<Persona> lsitaPersonas : lista de Persona.
    //  Descripcion : Es un metodo abstracto por lo que se implementara en las clases hijas de atraccion..
    public abstract int visitar(ArrayList<Persona> listaPersonas);
}
