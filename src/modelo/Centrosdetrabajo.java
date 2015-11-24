package modelo;
// Generated Nov 18, 2015 4:27:39 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
public class Centrosdetrabajo  implements java.io.Serializable {


     private int idcdt;
     private String nombre;
     private Set<Escuela> escuelas = new HashSet<Escuela>(0);
     private Set<Escuela> escuelas_1 = new HashSet<Escuela>(0);

    public Centrosdetrabajo() 
    {
        
    }
    public Centrosdetrabajo(String nombre) 
    {
        this.nombre = nombre;
        
    }
    public Centrosdetrabajo(int idcdt) {
        this.idcdt = idcdt;

    }
	
    public Centrosdetrabajo(int idcdt, String nombre) {
        this.idcdt = idcdt;
        this.nombre = nombre;
    }
    public Centrosdetrabajo(int idcdt, String nombre, Set<Escuela> escuelas, Set<Escuela> escuelas_1) {
       this.idcdt = idcdt;
       this.nombre = nombre;
       this.escuelas = escuelas;
       this.escuelas_1 = escuelas_1;
    }
   
    public int getIdcdt() {
        return this.idcdt;
    }
    
    public void setIdcdt(int idcdt) {
        this.idcdt = idcdt;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Escuela> getEscuelas() {
        return this.escuelas;
    }
    
    public void setEscuelas(Set<Escuela> escuelas) {
        this.escuelas = escuelas;
    }
    public Set<Escuela> getEscuelas_1() {
        return this.escuelas_1;
    }
    
    public void setEscuelas_1(Set<Escuela> escuelas_1) {
        this.escuelas_1 = escuelas_1;
    }
  




}


