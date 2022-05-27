import java.util.ArrayList;

public class Granero extends Edificio{

    //  Constructor Granero
    //  Parametros:
    //  String nomnre
    //  int nivel
    //  int capacidad
    //  Descripcion: Settea la capacidad a 10 y el nivel a 1. Tambien le da un nombre a el Granero.
    public Granero(String nombre, int nivel, int capacidad){
        super(nombre, nivel, capacidad);
        setCapacidad(10);
        setNivel(1);
    }

    //  ArrayList<Integer> producir
    //  Parametros: no pide parametros.
    //  Descripcion: Retorna una lista con recursos(javalares, hierro, trigo y tecnologia), estos varian segun la cantidad de personas y sus diferentes oficios.
    @Override
    public ArrayList<Integer> producir(){
        if(getPersonas().size() > 0){
            int cantidadGranjeros = 0;
            ArrayList<Integer> array = new ArrayList<Integer>();
            for(int i = 0; i < getPersonas().size(); i++){
                if(getPersonas().get(i).getEsGranjero() == 1){
                    cantidadGranjeros++;
                }
            }
            if(cantidadGranjeros >= (getPersonas().size()/2)){
                System.out.println("Como en el Granero " + getNombre() + "tiene la mitad o mas de las personas de oficio Granjero");
                System.out.println("La cantidad de Javalares que produsca el Granero será el promedio de el trabajo realizado por las personas.");
                System.out.println("La cantidad de Trigo que produsca el granero sera la suma del trabajo realizado de cada persona divido la mitad de la cantidad de personas.");
                System.out.println("La cantidad de Hierro que produsca el granero sera 0.");
                System.out.println("La cantidad de tecnologia sera igual a la cantidad de cientificos dentro del Granero dividido dos.");
                System.out.println("Trabajo realizado por cada Persona :");
                int javalares = 0;
                for(int i = 0; i < getPersonas().size(); i++){
                    System.out.println(getPersonas().get(i).getNombre()+" = "+getPersonas().get(i).trabajo_realizado());
                    javalares += getPersonas().get(i).trabajo_realizado();
                }
                javalares = javalares/getPersonas().size();
                System.out.println("Javalares = "+javalares);
                array.add(javalares);
            
                int trigo = 0;
                for(int i = 0; i < getPersonas().size(); i++){
                    trigo += getPersonas().get(i).trabajo_realizado();
                }
                trigo = trigo/(getPersonas().size()/2);
                System.out.println("Hierro = 0");
                System.out.println("Trigo = "+ trigo);
                array.add(0);

                int cantidadCientifico = 0;
                for(int i = 0; i < getPersonas().size(); i++){
                    if(getPersonas().get(i).getEsCientifico() == 1){
                        cantidadCientifico++;
                    }
                }
                cantidadCientifico = cantidadCientifico/2;
                array.add(trigo);
                System.out.println("Tecnologia = "+ cantidadCientifico);
                array.add(cantidadCientifico);

            }

            else{
                System.out.println("Debido a que la cantidad de granjeros es menos de la mitad, se pierden javalares y no se ganar recursos.");
                int javalares = getPersonas().size() * -2;
                array.add(javalares);
                array.add(0);
                array.add(0);
                array.add(0);
            }
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

    //  void mejorar
    //  Parametros: no pide parametros.
    //  Descripcion: agrega 1 al nivel y 3 a la capacidad.
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setCapacidad(getCapacidad()+3);
    }

}
