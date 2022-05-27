import java.util.ArrayList;
import java.util.Scanner;

public class Javation {
    public static void main(String [] args){
        boolean partida = true;
        while (partida){
            String Nombre;
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Bienvenido a Javation");
            System.out.print("Digite el nombre del jugador :");
            Nombre = entrada2.nextLine();
            Jugador jugadores = new Jugador(Nombre);
            Boolean juego = true;
            while (juego || (jugadores.getJavalares() < 0)){
                Boolean turno = true;
                String eleccion;
                while(turno){
                    System.out.println("Recursos:");
                    System.out.println("-Javalares = "+jugadores.getJavalares());
                    System.out.println("-Hierro = "+jugadores.getHierro());
                    System.out.println("-Trigo = "+jugadores.getTrigo());
                    System.out.println("-Teconologia = "+jugadores.getTecnologia());
                    System.out.print("\n");
                    System.out.println("Elija una opción :");
                    System.out.println("- 1) Obtener Persona");
                    System.out.println("- 2) Obtener Edificio");
                    System.out.println("- 3) Obtener Atraccion");
                    System.out.println("- 4) Mejorar Persona (coste: 15 javalares)");
                    System.out.println("- 5) Mejorar Edificio");
                    System.out.println("- 6) Mover una Persona hacia un Edificio");
                    System.out.println("- 7) Sacar una Persona de un Edificio");
                    System.out.println("- 8) Listado de Personas no asignadas");
                    System.out.println("- 9) Listado de Edificios con sus personas");
                    System.out.println("- 10) Listado de Atracciones");
                    System.out.println("- 0) Terminar turno");
                    eleccion = entrada2.nextLine();
                    if (Integer.parseInt(eleccion) == 1){
                        System.out.println("-1) Granjero (coste: 5 javalares)");
                        System.out.println("-2) Cientifico (coste: 5 javalares)");
                        System.out.println("-3) Herrero (coste: 5 javalares)");
                        String tipo_persona_agregar = entrada2.nextLine();
                        if (Integer.parseInt(tipo_persona_agregar) == 1){
                            if(jugadores.getJavalares() >= 5){
                                jugadores.setJavalares(jugadores.getJavalares()-5);
                                System.out.println("Nombre del granjero :");
                                String nombre_granjero = entrada2.nextLine();
                                Persona g = new Granjero(nombre_granjero, 0, 0, 0, 1, 0, 0);
                                jugadores.getPersonas().add(g);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        if (Integer.parseInt(tipo_persona_agregar) == 2){
                            if(jugadores.getJavalares() >= 8){
                                jugadores.setJavalares(jugadores.getJavalares()-8);
                                System.out.println("Nombre del cientifico :");
                                String nombre_cientifico = entrada2.nextLine();
                                Persona g = new Cientifico(nombre_cientifico, 0, 0, 0, 0, 0, 1);
                                jugadores.getPersonas().add(g);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        if (Integer.parseInt(tipo_persona_agregar) == 3){
                            if(jugadores.getJavalares() >= 6){
                                jugadores.setJavalares(jugadores.getJavalares()-6);
                                System.out.println("Nombre del herrero :");
                                String nombre_herrero = entrada2.nextLine();
                                Persona g = new Herrero(nombre_herrero, 0, 0, 0, 0, 1, 0);
                                jugadores.getPersonas().add(g);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                    }
                    
                    if (Integer.parseInt(eleccion) == 2){
                        System.out.println("-1) Granero (coste: 10 javalaes, 5 hierro, 5 trigo)");
                        System.out.println("-2) Laboratorio (coste: 30 javalaes, 10 hierro, 6 tecnologia)");
                        System.out.println("-3) Herreria (coste: 20 javalaes, 20 hierro)");
                        System.out.println("-4) Zona Comun (coste: 15 javalaes, 3 hierro, 3 trigo, 3 tecnologia)");
                        String tipo_edificio_agregar = entrada2.nextLine();
                        if(Integer.parseInt(tipo_edificio_agregar) == 1){
                            if((jugadores.getJavalares() >= 10) && (jugadores.getHierro() >= 5) && (jugadores.getTrigo() >= 5)){
                                jugadores.setJavalares(jugadores.getJavalares()-10);
                                jugadores.setHierro(jugadores.getHierro()-5);
                                jugadores.setTrigo(jugadores.getTrigo()-5);
                                System.out.println("Nombre del Granero");
                                String nombre_granero = entrada2.nextLine();
                                Edificio g1 = new Granero(nombre_granero, 0, 0);
                                jugadores.getEdificios().add(g1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }

                        if(Integer.parseInt(tipo_edificio_agregar) == 2){
                            if((jugadores.getJavalares() >= 30) && (jugadores.getHierro() >= 10) && (jugadores.getTecnologia() >= 6)){
                                jugadores.setJavalares(jugadores.getJavalares()-30);
                                jugadores.setHierro(jugadores.getHierro()-10);
                                jugadores.setTecnologia(jugadores.getTecnologia()-6);
                                System.out.println("Nombre del Laboratorio");
                                String nombre_laboratorio = entrada2.nextLine();
                                Edificio l1 = new Laboratorio(nombre_laboratorio, 0, 0);
                                jugadores.getEdificios().add(l1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }

                        if(Integer.parseInt(tipo_edificio_agregar) == 3){
                            if((jugadores.getJavalares() >= 20) && (jugadores.getHierro() >= 20)){
                                jugadores.setJavalares(jugadores.getJavalares()-20);
                                jugadores.setHierro(jugadores.getHierro()-20);
                                System.out.println("Nombre de la herreria");
                                String nombre_herreria = entrada2.nextLine();
                                Edificio h1 = new Herrería(nombre_herreria, 0, 0);
                                jugadores.getEdificios().add(h1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }

                        if(Integer.parseInt(tipo_edificio_agregar) == 4){
                            if((jugadores.getJavalares() >= 15) && (jugadores.getHierro() >= 3) && (jugadores.getTrigo() >= 3) && (jugadores.getTecnologia() >= 3)){
                                jugadores.setJavalares(jugadores.getJavalares()-15);
                                jugadores.setHierro(jugadores.getHierro()-3);
                                jugadores.setTrigo(jugadores.getTrigo()-3);
                                jugadores.setTecnologia(jugadores.getTecnologia()-3);
                                System.out.println("Nombre de la Zona Comun");
                                String nombre_zonaComun = entrada2.nextLine();
                                Edificio zc1 = new ZonaComun(nombre_zonaComun, 0, 0);
                                jugadores.getEdificios().add(zc1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                    }

                    if (Integer.parseInt(eleccion) == 3){
                        System.out.println("-1) Feria (coste: 50 javalaes, 25 hierro, 25 trigo, 10 tecnologia)");
                        System.out.println("-2) Museo (coste: 50 javalaes, 30 hierro, 3 trigo, 30 tecnologia)");
                        System.out.println("-3) Javapato (coste: 50 javalaes, 40 hierro, 20 tecnologia)");
                        String tipo_atraccion_agregar = entrada2.nextLine();
                        if(Integer.parseInt(tipo_atraccion_agregar) == 1){
                            if((jugadores.getJavalares() >= 50) && (jugadores.getHierro() >= 25) && (jugadores.getTrigo() >= 25) && (jugadores.getTecnologia() >= 10)){
                                jugadores.setJavalares(jugadores.getJavalares()-50);
                                jugadores.setHierro(jugadores.getHierro()-25);
                                jugadores.setTrigo(jugadores.getTrigo()-25);
                                jugadores.setTecnologia(jugadores.getTecnologia()-10);
                                System.out.println("Nombre de la Feria");
                                String nombre_feria = entrada2.nextLine();
                                Feria f1 = new Feria(nombre_feria);
                                jugadores.getFerias().add(f1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        
                        if(Integer.parseInt(tipo_atraccion_agregar) == 2){
                            if((jugadores.getJavalares() >= 50) && (jugadores.getHierro() >= 30) && (jugadores.getTrigo() >= 3) && (jugadores.getTecnologia() >= 30)){
                                jugadores.setJavalares(jugadores.getJavalares()-50);
                                jugadores.setHierro(jugadores.getHierro()-30);
                                jugadores.setTrigo(jugadores.getTrigo()-3);
                                jugadores.setTecnologia(jugadores.getTecnologia()-30);
                                System.out.println("Nombre de la Museo");
                                String nombre_Museo = entrada2.nextLine();
                                Museo m1 = new Museo(nombre_Museo);
                                jugadores.getMuseos().add(m1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }

                        if(Integer.parseInt(tipo_atraccion_agregar) == 3){
                            if((jugadores.getJavalares() >= 50) && (jugadores.getHierro() >= 40) &&  (jugadores.getTecnologia() >= 20)){
                                jugadores.setJavalares(jugadores.getJavalares()-50);
                                jugadores.setHierro(jugadores.getHierro()-40);
                                jugadores.setTecnologia(jugadores.getTecnologia()-20);
                                System.out.println("Nombre del javapato");
                                String nombre_javapato = entrada2.nextLine();
                                Javapato j1 = new Javapato(nombre_javapato);
                                jugadores.getJavapatos().add(j1);
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                    }

                    if (Integer.parseInt(eleccion) == 4){
                        if (jugadores.getPersonas().size() != 0){
                            if(jugadores.getJavalares() >= 15){
                                System.out.println("Nombre de la persona que no esta asociada a un edificio que se desea mejorar");
                                String nombre_a_mejorar = entrada2.nextLine();
                                for(int k = 0; k < jugadores.getPersonas().size(); k++){
                                    if (jugadores.getPersonas().get(k).getNombre().equals(nombre_a_mejorar)){
                                        jugadores.getPersonas().get(k).mejorar();
                                        jugadores.setJavalares(jugadores.getJavalares()-15);
                                    }
                                }
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        else{
                            System.out.println("Lista de personas vacias");
                        }
                    }

                    if (Integer.parseInt(eleccion) == 5){
                        System.out.println("Digite el nombre del edificio que quiere mejorar");
                        String nombre_edificio = entrada2.nextLine();
                        System.out.println("-1) Granero (coste: 20 javalaes, 10 hierro, 15 trigo)");
                        System.out.println("-2) Laboratorio (coste: 20 javalaes, 15 hierro, 10 tecnologia)");
                        System.out.println("-3) Herreria (coste: 20 javalaes, 20 hierro)");
                        System.out.println("-4) Zona Comun (coste: 15 javalaes, 10 hierro, 10 trigo, 10 tecnologia)");
                        String tipo_edificio_a_mejorar = entrada2.nextLine();
                        if(Integer.parseInt(tipo_edificio_a_mejorar) == 1){
                            if((jugadores.getJavalares() >= 20) && (jugadores.getHierro() >= 10) && (jugadores.getTrigo() >= 15)){
                                for(int p = 0; p < jugadores.getEdificios().size(); p++){
                                    if(jugadores.getEdificios().get(p).getNombre().equals(nombre_edificio)){
                                        jugadores.setJavalares(jugadores.getJavalares()-20);
                                        jugadores.setHierro(jugadores.getHierro()-10);
                                        jugadores.setTrigo(jugadores.getTrigo()-15);
                                        jugadores.getEdificios().get(p).mejorar();
                                    }
                                }
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        if(Integer.parseInt(tipo_edificio_a_mejorar) == 2){
                            if((jugadores.getJavalares() >= 20) && (jugadores.getHierro() >= 15) && (jugadores.getTecnologia() >= 10)){
                                for(int p = 0; p < jugadores.getEdificios().size(); p++){
                                    if(jugadores.getEdificios().get(p).getNombre().equals(nombre_edificio)){
                                        jugadores.setJavalares(jugadores.getJavalares()-20);
                                        jugadores.setHierro(jugadores.getHierro()-15);
                                        jugadores.setTecnologia(jugadores.getTecnologia()-10);
                                        jugadores.getEdificios().get(p).mejorar();
                                    }
                                }
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        if(Integer.parseInt(tipo_edificio_a_mejorar) == 3){
                            if((jugadores.getJavalares() >= 20) && (jugadores.getHierro() >= 20)){
                                for(int p = 0; p < jugadores.getEdificios().size(); p++){
                                    if(jugadores.getEdificios().get(p).getNombre().equals(nombre_edificio)){
                                        jugadores.setJavalares(jugadores.getJavalares()-20);
                                        jugadores.setHierro(jugadores.getHierro()-20);
                                        jugadores.getEdificios().get(p).mejorar();
                                    }
                                }
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }
                        if(Integer.parseInt(tipo_edificio_a_mejorar) == 4){
                            if((jugadores.getJavalares() >= 15) && (jugadores.getHierro() >= 10) && (jugadores.getTecnologia() >= 10) && (jugadores.getTrigo() >= 10)){
                                for(int p = 0; p < jugadores.getEdificios().size(); p++){
                                    if(jugadores.getEdificios().get(p).getNombre().equals(nombre_edificio)){
                                        jugadores.setJavalares(jugadores.getJavalares()-15);
                                        jugadores.setHierro(jugadores.getHierro()-10);
                                        jugadores.setTecnologia(jugadores.getTecnologia()-10);
                                        jugadores.setTrigo(jugadores.getTrigo()-10);
                                        jugadores.getEdificios().get(p).mejorar();
                                    }
                                }
                            }
                            else{
                                System.out.println("Recursos insuficientes");
                            }
                        }


                    }

                    if (Integer.parseInt(eleccion) == 6){
                        System.out.println("Digite el nombre de la persona que quiere mover");
                        String persona_a_mover = entrada2.nextLine();
                        if (jugadores.getEdificios().size() != 0){
                            for(int o = 0; o < jugadores.getPersonas().size(); o++){
                                if (jugadores.getPersonas().get(o).getNombre().equals(persona_a_mover)){
                                    System.out.println("Edificios disponibles:");
                                    for(int u = 0; u < jugadores.getEdificios().size(); u++){
                                        System.out.println(jugadores.getEdificios().get(u).getNombre());
                                    }
                                    System.out.println("Digite el nombre del edificio al que quiere mover la persona");
                                    String nombre_edificio_destino = entrada2.nextLine();
                                    for(int u = 0; u < jugadores.getEdificios().size(); u++){
                                        if (jugadores.getEdificios().get(u).getNombre().equals(nombre_edificio_destino)){
                                            jugadores.getEdificios().get(u).agregar_persona(jugadores.getPersonas().get(o));
                                            jugadores.getPersonas().remove(o);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("No hay edificios");
                        }
                    }

                    if (Integer.parseInt(eleccion) == 7){
                        System.out.println("Digite el nombre de la persona que quiere sacar");
                        String persona_a_mover = entrada2.nextLine();
                        System.out.println("Digite el nombre del edificio donde se encuentra");
                        String Edificio_a_buscar = entrada2.nextLine();
                        for(int o = 0; o < jugadores.getEdificios().size(); o++){
                            if (jugadores.getEdificios().get(o).getNombre().equals(Edificio_a_buscar)){
                                for (int y = 0;y < jugadores.getEdificios().get(o).getPersonas().size(); y++){
                                    if (jugadores.getEdificios().get(o).getPersonas().get(y).getNombre().equals(persona_a_mover)){
                                        Persona clon = jugadores.getEdificios().get(o).getPersonas().get(y);
                                        jugadores.getEdificios().get(o).getPersonas().remove(y);
                                        jugadores.getPersonas().add(clon);
                                    }
                                }
                            }
                        }
                    }

                    if (Integer.parseInt(eleccion) == 8){
                        if(jugadores.getPersonas().size() != 0){
                            System.out.println("Listado de Personas no asignadas:");
                            for(int i = 0; i < jugadores.getPersonas().size(); i++){
                                if(jugadores.getPersonas().get(i).getEsGranjero() == 1){
                                    System.out.print("Granjero ");
                                }
                                if(jugadores.getPersonas().get(i).getEsHerrero() == 1){
                                    System.out.print("Herrero ");
                                }
                                if(jugadores.getPersonas().get(i).getEsCientifico() == 1){
                                    System.out.print("Cientifico ");
                                }
                                System.out.print(jugadores.getPersonas().get(i).getNombre()+"\n");
                            }
                        }
                        else{
                            System.out.println("Lista de personas vacia");
                        }
                    }

                    if (Integer.parseInt(eleccion) == 9){
                        for (int i = 0; i < jugadores.getEdificios().size(); i++){
                            System.out.println("Edificio "+i+" = "+jugadores.getEdificios().get(i).getNombre());
                            for (int j = 0; j < jugadores.getEdificios().get(i).getPersonas().size(); j++){
                                if(jugadores.getEdificios().get(i).getPersonas().get(j).getEsGranjero() == 1){
                                    System.out.print("Granjero ");
                                }
                                if(jugadores.getEdificios().get(i).getPersonas().get(j).getEsHerrero() == 1){
                                    System.out.print("Herrero ");
                                }
                                if(jugadores.getEdificios().get(i).getPersonas().get(j).getEsCientifico() == 1){
                                    System.out.print("Cientifico ");
                                }
                                System.out.print(jugadores.getEdificios().get(i).getPersonas().get(j).getNombre()+"\n");
                            }
                        }
                    }

                    if (Integer.parseInt(eleccion) == 10){
                        for(int i = 0; i < jugadores.getFerias().size(); i++){
                            System.out.print("Feria ");
                            System.out.print(jugadores.getPersonas().get(i).getNombre()+"\n");
                        }
                        for(int i = 0; i < jugadores.getMuseos().size(); i++){
                            System.out.print("Museo ");
                            System.out.println(jugadores.getMuseos().get(i).getNombre()+"\n");
                        }
                        for(int i = 0; i < jugadores.getJavapatos().size(); i++){
                            System.out.print("Javapato ");
                            System.out.print(jugadores.getJavapatos().get(i).getNombre());
                        }
                    }

                    if (Integer.parseInt(eleccion) == 0){
                        for (int i = 0; i < jugadores.getEdificios().size(); i++){
                            if(jugadores.getEdificios().get(i).getPersonas().size() != 0){
                                ArrayList<Integer> recursos_a_agregar = jugadores.getEdificios().get(i).producir();
                                jugadores.setJavalares(jugadores.getJavalares() + recursos_a_agregar.get(0));
                                jugadores.setHierro(jugadores.getHierro() + recursos_a_agregar.get(1));
                                jugadores.setTrigo(jugadores.getTrigo() + recursos_a_agregar.get(2));
                                jugadores.setTecnologia(jugadores.getTrigo() + recursos_a_agregar.get(3));
                            }
                        }


                        ArrayList<Persona> mundo = new ArrayList<Persona>();

                        for (int i = 0; i < jugadores.getPersonas().size(); i++){
                            mundo.add(jugadores.getPersonas().get(i));
                        }

                        for(int i = 0; i < jugadores.getEdificios().size(); i++){
                            for(int x = 0; x < jugadores.getEdificios().get(i).getPersonas().size(); x++){
                                mundo.add(jugadores.getEdificios().get(i).getPersonas().get(x));
                            }
                        }

                        for (int i = 0; i < jugadores.getFerias().size(); i++){
                            jugadores.setJavalares(jugadores.getJavalares() + jugadores.getFerias().get(i).visitar(mundo));
                        }

                        for (int i = 0; i < jugadores.getMuseos().size(); i++){
                            jugadores.setJavalares(jugadores.getJavalares() + jugadores.getMuseos().get(i).visitar(mundo));
                        }

                        for (int i = 0; i < jugadores.getJavapatos().size(); i++){
                            jugadores.setJavalares(jugadores.getJavalares() + jugadores.getJavapatos().get(i).visitar(mundo));
                        }

                        System.out.println("Los siguientes jugadores fallecieron:");
                        for(int i = 0; i < jugadores.getEdificios().size(); i++){
                            for(int x = 0; x < jugadores.getEdificios().get(i).getPersonas().size(); x++){
                                jugadores.getEdificios().get(i).getPersonas().get(x).Envejecer();
                                if(jugadores.getEdificios().get(i).getPersonas().get(x).getEdad() >= 30){
                                    System.out.println("-"+jugadores.getEdificios().get(i).getPersonas().get(x).getNombre());
                                    jugadores.getEdificios().get(i).getPersonas().remove(x);
                                }
                            }
                        }

                        for (int i = 0; i < jugadores.getPersonas().size(); i++){
                            jugadores.getPersonas().get(i).Envejecer();
                            if(jugadores.getPersonas().get(i).getEdad() >= 30){
                                System.out.println("-"+jugadores.getPersonas().get(i).getNombre());
                                jugadores.getPersonas().remove(i);
                            }
                        }
                        turno = false;
                    }
                
                    if(Integer.parseInt(eleccion) > 10 ||  Integer.parseInt(eleccion) < 0){
                        System.out.println("Opcion fuera de rango");
                    }
                }
        }
































            entrada2.close();
            partida = false;
        }
        
    }
}
