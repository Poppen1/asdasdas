import java.util.ArrayList;

public class Jugador {
    //atributos
    private String nombre;
    private int javalares;
    private int hierro;
    private int trigo;
    private int tecnologia;
    private ArrayList<Persona> personas;
    private ArrayList<Edificio> edificios;
    private ArrayList<Feria> ferias;
    private ArrayList<Museo> museos;
    private ArrayList<Javapato> javapatos;

    //constructor

    public Jugador(String nombre){
        this.nombre = nombre;
        this.javalares = 30;
        this.hierro = 15;
        this.trigo = 10;
        this.tecnologia = 6;
        this.personas = new ArrayList<Persona>();
        this.edificios = new ArrayList<Edificio>();
        this.ferias = new ArrayList<Feria>();
        this.museos = new ArrayList<Museo>();
        this.javapatos = new ArrayList<Javapato>();
    }

    //metodos getter and setter

    public ArrayList<Persona> getPersonas(){
        return personas;
    }

    public ArrayList<Edificio> getEdificios(){
        return edificios;
    }

    public ArrayList<Feria> getFerias(){
        return ferias;
    }

    public ArrayList<Museo> getMuseos(){
        return museos;
    }

    public ArrayList<Javapato> getJavapatos(){
        return javapatos;
    }

    public String getNombre(){
        return nombre;
    }

    public int getJavalares(){
        return javalares;
    }

    public void setJavalares(int javalares){
        this.javalares = javalares;
    }

    public int getHierro(){
        return hierro;
    }

    public void setHierro(int hierro){
        this.hierro = hierro;
    }

    public int getTrigo(){
        return trigo;
    }

    public void setTrigo(int trigo){
        this.trigo = trigo;
    }

    public int getTecnologia(){
        return tecnologia;
    }

    public void setTecnologia(int tecnologia){
        this.tecnologia = tecnologia;
    }

    //  void sacar_persona
    //  Parametros: 
    //  String nombre_a_buscar
    //  Descripcion: Busca un nombre dentro de la lista personas y si lo encuentra elimina esa persona.
    public void sacar_persona(String nombre_a_buscar){
        for(int i = 0; i < personas.size(); i++){
            if (personas.get(i).getNombre().equals(nombre_a_buscar)){
                personas.remove(i);
                break;
            }
        }
    }

    //  void agregar_persona
    //  Parametros: 
    //  Persona persona
    //  Descripcion: agrega la Persona persona a la lista personas.
    public void agregar_persona(Persona persona){
        personas.add(persona);
    }
    
    //  void sacar_edificio
    //  Parametros:
    //  String nombre_a_buscar
    //  Descripcion: Busca un nombre de un edificio dentro de la lista edificios y si lo encuentra, lo elimina.
    public void sacar_edificio(String nombre_a_buscar){
        for (int i = 0; i < edificios.size(); i++){
            if (edificios.get(i).getNombre().equals(nombre_a_buscar)){
                edificios.remove(i);
                break;
            }
        }
    }

    //  void agregar_edificio
    //  Parametros: Edificio edificio
    //  Descripcion: agrega un Edificio a la lista edificios.
    public void agregar_edificio(Edificio edificio){
        edificios.add(edificio);
    }

    //  void sacar_atraccion
    //  Parametros: 
    //  String nombre_a_buscar
    //  String tipo
    //  Descripcion: Elimina una atraccion dependiendo si el string tipo buscara el nombre en las listas ferias, museos o javapatos.
    public void sacar_atraccion(String nombre_a_buscar, String tipo){
        if ((tipo.equals("feria")) || (tipo.equals("FERIA")) || (tipo.equals("Feria"))){
            int encontro = 0;
            for (int i = 0; i < ferias.size(); i++){
                if (nombre_a_buscar.equals(ferias.get(i).getNombre())){
                    ferias.remove(i);
                    encontro = 1;
                    break;
                }
            }
            if (encontro == 0){
                System.out.println("No se encontro una feria con nombre "+nombre_a_buscar);
            }
        }
        if ((tipo.equals("museo")) || (tipo.equals("MUSEO")) || (tipo.equals("Museo"))){
            int encontro = 0;
            for (int i = 0; i < museos.size(); i++){
                if (nombre_a_buscar.equals(museos.get(i).getNombre())){
                    museos.remove(i);
                    encontro = 1;
                    break;
                }
            }
            if (encontro == 0){
                System.out.println("No se encontro un museo con nombre "+nombre_a_buscar);
            }
        }
        if ((tipo.equals("javapato")) || (tipo.equals("JAVAPATO")) || (tipo.equals("Javapato"))){
            int encontro = 0;
            for (int i = 0; i < javapatos.size(); i++){
                if (nombre_a_buscar.equals(javapatos.get(i).getNombre())){
                    javapatos.remove(i);
                    encontro = 1;
                    break;
                }
            }
            if (encontro == 0){
                System.out.println("No se encontro un javapato con nombre "+nombre_a_buscar);
            }
        }
    }

    //  void agregar_feria
    //  Parametros: Feria feria
    //  Descripcion: agrega una Feria a la lista ferias.
    public void agregar_feria(Feria feria){
        ferias.add(feria);
    }

    //  void agregar_museo
    //  Parametros: Museo museo
    //  Descripcion: agrega un museo a la lista museos.
    public void agregar_museo(Museo museo){
        museos.add(museo);
    }

    //  void agregar_javapato
    //  Parametros: Javapato javapato
    //  Descripcion: agrega un Javapato a la lista javapatos.
    public void agregar_javapato(Javapato javapato){
        javapatos.add(javapato);
    }

}
