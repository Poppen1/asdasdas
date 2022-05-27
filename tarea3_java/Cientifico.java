public class Cientifico extends Persona{


    //  Constructor Cientifico
    //  parametros : 
    //  string nombre 
    //  int nivel
    //  int capacidad
    //  int edad
    //  int productividad
    //  int esGranjero
    //  int esHerrero
    //  int EsCientifico
    //  Descripcion : settea la edad inicial a 24, el nivel a 1 y la productividad a 10.
    public Cientifico(String nombre, int edad, int nivel, int productividad, int esGranjero, int esHerrero, int esCientifico){
        super(nombre, edad, nivel, productividad, esGranjero, esHerrero, esCientifico); 
        setEdad(24);
        setNivel(1);
        setProductividad(10);
    }

    //  Void mejorar
    //  parametros : no pide parametros.
    //  Descripcion : Aumenta su nivel y productividad en 1.
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setProductividad(getProductividad()+1);
    }

    //  int trabajo_realizado
    //  parametros : no pide parametros.
    //  Descripcion : retorna un entero equivalente a tres veces su productividad mas su nivel.
    @Override
    public int trabajo_realizado(){
        return ((getProductividad()*3)+(getNivel()));
    }
}
