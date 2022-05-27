import java.util.ArrayList;

public abstract class Edificio {
    private String nombre;
    private int nivel;
    private int capacidad;
    private ArrayList<Persona> personas;
    
    //  Constructor Edificio
    //  parametros : 
    //  string nombre 
    //  int nivel
    //  int capacidad
    //  Descripcion : Constructor de la clase abstracta, inicializa la lista de personas..
    public Edificio(String nombre, int nivel, int capacidad){
        this.nombre = nombre;
        this.nivel = nivel;
        this.capacidad = capacidad;
        personas = new ArrayList<Persona>();
    }
    //metodos setter y getter

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setNivel(int nivel){
        this.nivel = nivel;
    }

    void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Persona> getPersonas(){
        return personas;
    }

    //  void sacar_persona
    //  parametros : 
    //  String nombre_a_buscar
    //  Descripcion : .Busca el nombre de una persona en la lista "personas" y si lo encuentra lo elimina.
    public void sacar_persona(String nombre_a_buscar){
        for(int i = 0; i < personas.size(); i++){
            if (personas.get(i).getNombre().equals(nombre_a_buscar)){
                personas.remove(i);
                break;
            }
        }
    }

    //  void agregar_persona
    //  parametros : 
    //  Persona p
    //  Descripcion : Si es que la capacidad es mayor al tamaño de la lista "personas", agrega la persona p.
    public void agregar_persona(Persona p){
        if (capacidad > personas.size()){
            personas.add(p);
        }
        else{
            System.out.println("Capacidad insuficiente.");
        }
    }
    
    //  metodo abstracto ArrayList<Integer> producir
    //  parametros : no pide parametros.
    //  Descripcion : Metodo abstracto por lo que se sobreescribira en las clases hijas.
    public abstract ArrayList<Integer> producir();

    //  metodo abstracto void mejorar.
    //  parametros : no pide parametros.
    //  Descripcion : Metodo abstracto por lo que se sobreescribira en las clases hijas.
    public abstract void mejorar();
}
