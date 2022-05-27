public abstract class Persona {
    //atributos
    private String nombre;
    private int edad;
    private int nivel;
    private int productividad;
    private int esGranjero;
    private int esHerrero;
    private int esCientifico;
    
    
    //metodos

    //  Contructor Persona
    //  Parametros: 
    //  String nombre
    //  int edad
    //  int nivel
    //  int productividad
    //  int esGranjero
    //  int esHerrero
    //  int esCientifico
    //  Descripcion: Contructor inicializa ambitos.
    public Persona(String nombre, int edad, int nivel, int productividad, int esGranjero,int esHerrero ,int esCientifico){
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.productividad = productividad;
        this.esGranjero = esGranjero;
        this.esHerrero = esHerrero;
        this.esCientifico = esCientifico;
    }

    //Getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public int getProductividad(){
        return productividad;
    }

    public void setProductividad(int productividad){
        this.productividad = productividad;
    }

    public int getEsGranjero(){
        return esGranjero;
    }

    public int getEsHerrero(){
        return esHerrero;
    }

    public int getEsCientifico(){
        return esCientifico;
    }

    //metodos funciones

    //  void Envejecer
    //  Parametros: no pide parametros
    //  Descripcion: suma 1 a la edad.
    public void Envejecer(){
        edad++;
    }

    //  Metodo abstracto void mejorar
    //  Parametros: no pide parametros
    //  Descripcion: Como es abstracto se sobreescribira en las clases hijas.
    public abstract void mejorar();

    //  Metodo abstracto int trabajo_realizado
    //  Parametros: no pide parametros
    //  Descripcion: Como es abstracto se sobreescribira en las clases hijas.
    public abstract int trabajo_realizado();


}
