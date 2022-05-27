import java.util.ArrayList;

public class Laboratorio extends Edificio{

    //  Constructor Laboratorio
    //  Parametros:
    //  String nombre
    //  int nivel
    //  int capacidad
    //  Descripcion: Constructor de Laboratorio, settea la capacidad a 5 y el nivel a 1.
    public Laboratorio(String nombre, int nivel, int capacidad){
        super(nombre, nivel, capacidad);
        setCapacidad(5);
        setNivel(1);
    }

    //  ArrayList<Integer> producir
    //  Parametros: no pide parametros
    //  Descripcion: Retorna una lista con recursos(javalares, hierro, trigo y tecnologia) dependiendo de la cantidad de personas y de sus oficios.
    @Override
    public ArrayList<Integer> producir(){
        if(getPersonas().size() > 0){
            ArrayList<Integer> array = new ArrayList<Integer>();
            int cantidadCientifico = 0;
            int trabajo_total_cientificos = 0;
            for (int i = 0; i < getPersonas().size(); i++){
                if(getPersonas().get(i).getEsCientifico() == 1){
                    cantidadCientifico++;
                    System.out.println(getPersonas().get(i).getNombre()+" = "+getPersonas().get(i).trabajo_realizado());
                    trabajo_total_cientificos += getPersonas().get(i).trabajo_realizado();
                }
            }
            if(cantidadCientifico >= getPersonas().size()*3/4){
                System.out.println("Como en el Laboratorio " + getNombre() + " tiene tres cuartos de sus personas cientificas este produce ");
                System.out.println("La cantidad de Javalares que produsca el Laboratorio es la sumatorio del trabajo realizado por los cientificos dividido la cantidad total de personas dividido la cantidad de personas no cientificas");
                System.out.println("La cantidad de Trigo que produsca el Laboratorio sera 0.");
                System.out.println("La cantidad de Hierro que produsca el granero sera 0.");
                System.out.println("La cantidad de tecnologia sera la suma del trabajo realizado por cada cientifico.");
                System.out.println("Trabajo realizado por cada Persona :");
                int javalares = trabajo_total_cientificos / (getPersonas().size()/(getPersonas().size()-cantidadCientifico));
                array.add(javalares);
                array.add(0);
                array.add(0);
                array.add(trabajo_total_cientificos);
            }
            else{
                System.out.println("Como en el Laboratorio "+ getNombre() + "la cantidad de cientificos es menor que tres cuartos de las personas, se pierden javalares.");
                array.add(getPersonas().size()*-4);
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
    //  Descripcion: agrega 1 al su nivel y 2 a su capacidad.
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setCapacidad(getCapacidad()+2);
    }

}
