import java.util.ArrayList;

public class Javapato extends Atraccion{
    private String nombre;

    //  Contructor Javapato
    //  Parametros: 
    //  String nombre
    //  Descripcion: contructor que settea el nombre.
    public Javapato(String nombre){
        this.nombre = nombre;
    }

    // Getter de nombre.
    public String getNombre(){
        return nombre;
    }

    //  int visitar
    //  Parametros:
    //  ArrayList<Persona> listaPersonas
    //  Descripcion: retorna un entero que es una cantidad de javalares, dependiendo la cantidad de personas en la listaPersonas y sus oficios.
    @Override
    public int visitar(ArrayList<Persona> listaPersonas){
        int cantidadCientifico = 0;
        int cantidadHerreros = 0;
        int cantidadGranjeros = 0;
        int javalares = 0;

        for (int i = 0; i < listaPersonas.size(); i++){
            if (listaPersonas.get(i).getEsCientifico() == 1){
                cantidadCientifico++;
            }
        }

        for (int i = 0; i < listaPersonas.size(); i++){
            if (listaPersonas.get(i).getEsHerrero() == 1){
                cantidadHerreros++;
            }
        }

        for (int i = 0; i < listaPersonas.size(); i++){
            if (listaPersonas.get(i).getEsGranjero() == 1){
                cantidadGranjeros++;
            }
        } 

        javalares = (cantidadGranjeros * 3) + ((cantidadCientifico * 6) / 4) + (cantidadHerreros * 3);
        return javalares;
    };
}
