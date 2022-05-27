import java.util.ArrayList;

public class ZonaComun extends Edificio{

    //  Constructor ZonaComun
    //  Parametros: 
    //  String nombre
    //  int nivel
    //  int capacidad
    //  Descripcion: settea la capacidad a 6 y el nivel a 1.
    public ZonaComun(String nombre, int nivel, int capacidad){
        super(nombre, nivel, capacidad);
        setCapacidad(6);
        setNivel(1);
    }

    //  ArrayList<Integer> producir
    //  Parametros: no pide parametros
    //  Descripcion: Produce una cantidad de recursos dependiendo de la cantidad de Persona en la lista personas.
    @Override
    public ArrayList<Integer> producir(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        if(getPersonas().size() > 0){
            array.add(getPersonas().size());
            array.add(0);
            array.add(0);
            array.add(0);
        }
        else{
            array.add(0);
            array.add(0);
            array.add(0);
            array.add(0);
        }
        return array;
    }

    //  void mejorar
    //  Parametros: no pide parametros
    //  Descripcion: agreaga 1 a su nivel y 4 a su capacidad.
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setCapacidad(getCapacidad()+4);
    }

}
