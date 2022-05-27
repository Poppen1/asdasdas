import java.util.ArrayList;

public class Feria extends Atraccion{
    private String nombre;

    //  Constructor Feria
    //  parametros : 
    //  String nombre
    //  Descripcion : constrcutor de feria.
    public Feria(String nombre){
        this.nombre = nombre;
    }

    //getter de nombre.
    public String getNombre(){
        return nombre;
    }

    //  int visitar
    //  parametros : 
    //  ArrayList<Persona> listaPersonas
    //  Descripcion : La listaPersonas visita a esta atraccion y dependiendo de el oficio de cada una de las personas retornara una cantidad entera de javalares.
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

        javalares = (cantidadGranjeros * 2) + (cantidadCientifico) + ((cantidadHerreros * 2) / 3);
        return javalares;
    };

}
