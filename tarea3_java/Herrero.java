public class Herrero extends Persona{

    //  Constructor Herrero
    //  Parametros: 
    //  String nombre
    //  int edad
    //  int nivel
    //  int productividad
    //  int esGranjero
    //  int esHerrero
    //  int esCientifico
    //  Descripcion: Contructor que settea el nivel a 1, la edad a 18 y la productividad a 9.
    public Herrero(String nombre, int edad, int nivel, int productividad, int esGranjero, int esHerrero, int esCientifico){
        super(nombre, edad, nivel, productividad, esGranjero, esHerrero, esCientifico); 
        setEdad(18);
        setNivel(1);
        setProductividad(9);
    }

    //  void mejorar
    //  Parametros: no pide parametros.
    //  Descripcion: aumenta el nivel en 1 y la productividad en 3.    
    @Override
    public void mejorar(){
        setNivel(getNivel()+1);
        setProductividad(getProductividad()+3);
    }

    //  int trabajo_realizado
    //  Parametros: no pide parametros.
    //  Descripcion: retorna una entero correspondiente a su productividad mas dos veces su nivel.
    @Override
    public int trabajo_realizado(){
        return ((getProductividad())+(getNivel()*2));
    }
}
