package modelo;
// Generated Nov 18, 2015 4:27:39 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Escuela generated by hbm2java
 */
public class Escuela  implements java.io.Serializable {


     private int idescuela;
     private Centrosdetrabajo centrosdetrabajo;
     private String nombre;
     private Set<Carrera> carreras = new HashSet<Carrera>(0);
     private Set<Carrera> carreras_1 = new HashSet<Carrera>(0);

    public Escuela() {
    }

	
    public Escuela(int idescuela, Centrosdetrabajo centrosdetrabajo, String nombre) {
        this.idescuela = idescuela;
        this.centrosdetrabajo = centrosdetrabajo;
        this.nombre = nombre;
    }
    public Escuela(int idescuela, Centrosdetrabajo centrosdetrabajo, String nombre, Set<Carrera> carreras, Set<Carrera> carreras_1) {
       this.idescuela = idescuela;
       this.centrosdetrabajo = centrosdetrabajo;
       this.nombre = nombre;
       this.carreras = carreras;
       this.carreras_1 = carreras_1;
    }
   
    public int getIdescuela() {
        return this.idescuela;
    }
    
    public void setIdescuela(int idescuela) {
        this.idescuela = idescuela;
    }
    public Centrosdetrabajo getCentrosdetrabajo() {
        return this.centrosdetrabajo;
    }
    
    public void setCentrosdetrabajo(Centrosdetrabajo centrosdetrabajo) {
        this.centrosdetrabajo = centrosdetrabajo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Carrera> getCarreras() {
        return this.carreras;
    }
    
    public void setCarreras(Set<Carrera> carreras) {
        this.carreras = carreras;
    }
    public Set<Carrera> getCarreras_1() {
        return this.carreras_1;
    }
    
    public void setCarreras_1(Set<Carrera> carreras_1) {
        this.carreras_1 = carreras_1;
    }




}

