import java.util.ArrayList;

public class Herrería extends Edificio{

    //  Constructor Herreria
    //  parametros : 
    //  string nombre 
    //  int nivel
    //  int capacidad
    //  Descripcion : Constructor de la clase settea el nivel a 1, la capacidad a 8 y declara su nombre.
    public Herrería(String nombre, int nivel, int capacidad){
            super(nombre, nivel, capacidad);
            setCapacidad(8);
            setNivel(1);
        }
    
    
    //  ArrayList<Integer> producir
    //  parametros : no pide parametros
    //  Descripcion : Produce recursos dependiendo de la cantidad de personas y el oficio de cada una de ellas. Retorna una lista de tamaño 4 con los recursos que va a producir.
    @Override
    public ArrayList<Integer> producir(){
        if(getPersonas().size() > 0){    
            System.out.println("La Herreria " + getNombre() + " : ");
            System.out.println("La cantidad de Javalares que produsca la Herreria será el trabajo realizado por solo los herreros dividido la cantidad total de personas.");
            System.out.println("La cantidad de Hierro que produsca la Herreria sera el trabajo realizado por los herreros dividido la cantidad de personas no herreras.");
            System.out.println("La cantidad de trigo que produsca la Herreria sera 0.");
            System.out.println("La cantidad de tecnologia sera igual a un tercio del trabajo realizado por los cientificos dividido por la cantidad de personas cientificas.");
            System.out.println("Trabajo realizado por cada Persona :");
            ArrayList<Integer> array = new ArrayList<Integer>();
            int javalares = 0;
            int trabajo_total_herreros = 0;
            int trabajo_total_cientificos = 0;
            int cantidadHerreros = 0;
            int cantidadCientificos = 0;
            for (int i = 0; i < getPersonas().size(); i++){
                if (getPersonas().get(i).getEsHerrero() == 1){
                    trabajo_total_herreros += getPersonas().get(i).trabajo_realizado();
                    cantidadHerreros++;
                }
            }
            for (int i = 0; i < getPersonas().size(); i++){
                if (getPersonas().get(i).getEsCientifico() == 1){
                    cantidadCientificos++;
                    trabajo_total_cientificos += getPersonas().get(i).trabajo_realizado() / 3;
                }
            }

            javalares = trabajo_total_herreros/getPersonas().size();
            array.add(javalares);
            int hierro = trabajo_total_herreros/(getPersonas().size()-cantidadHerreros);
            array.add(hierro);
            array.add(0);
            int tecnologia = trabajo_total_cientificos / cantidadCientificos;
            array.add(tecnologia);
            return array;
        }
        else{
            ArrayList<Integer> array = new ArrayList<Integer>();
            array.add(0);
            array.add(0);
            array.add(0);
            array.add(0);
            return array;
        }
    }
    
    //  Void mejorar
    //  parametros : no recibe parametros.
    //  Descripcion : Mejora el nivel de la Herreria, agregando 4 a su capacidad.
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setCapacidad(getCapacidad()+4);
    }
    
}
