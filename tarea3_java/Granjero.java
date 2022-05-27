public class Granjero extends Persona{

    //  Contructor Granjero
    //  Parametros: 
    // String nombre
    //  int nivel
    //  int edad
    //  int productividad
    //  int esGranjero
    //  int esHerrero
    //  int esCientifico
    //  Descripcion: Settea la edad a 15, el nivel a 1 y la productividad a 8.
    public Granjero(String nombre, int edad, int nivel, int productividad, int esGranjero, int esHerrero, int esCientifico){
        super(nombre, edad, nivel, productividad, esGranjero, esHerrero, esCientifico); 
        setEdad(15);
        setNivel(1);
        setProductividad(8);
    }

    //  void mejorar
    //  Parametros: no pide parametros.
    //  Descripcion: agreaga 1 al nivel y 2 a la productividad.
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setProductividad(getProductividad()+2);
    }

    //  int trabajo_realizado
    //  Parametros: no pide parametros.
    //  Descripcion: retorna un entero equivalente a dos veces su productividad mas la mitad de su nivel.
    @Override
    public int trabajo_realizado(){
        return ((getProductividad()*2)+(getNivel()/2));
    }
}
