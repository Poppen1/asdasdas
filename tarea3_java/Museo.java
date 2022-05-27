import java.util.ArrayList;

public class Museo extends Atraccion{
    private String nombre;

    //  Contructor Museo
    //  Parametros: 
    //  String nombre
    //  Descripcion: Contructor que establece el nombre
    public Museo(String nombre){
        this.nombre = nombre;
    }


    //  getter getNombre
    public String getNombre(){
        return nombre;
    }

    //  int visitar
    //  Parametros: ArrayList<Persona> listaPersonas
    //  Descripcion: retorna un entero cantidad de javalares dependiendo la cantidad de personas de listaPersonas y sus oficios.
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

        javalares = (cantidadGranjeros) + (cantidadCientifico * 4) + (cantidadHerreros * 2);
        return javalares;
    };
}
