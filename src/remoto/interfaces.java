
package remoto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import modelo.Alumno;
import modelo.Carrera;
import modelo.Centrosdetrabajo;
import modelo.Escuela;
import modelo.Examen;
import modelo.Materia;
import modelo.Pregunta;
import modelo.Respuesta;

public interface interfaces extends Remote
{
    public boolean insertarCentroDeTrabajo(Centrosdetrabajo ce)throws RemoteException;
    public Centrosdetrabajo buscaCentroDeEstudios(int id)throws RemoteException;
    public boolean actualizarCentroDeEstudios(Centrosdetrabajo ce) throws RemoteException;
    public boolean eliminarCentroDeEstudios(Centrosdetrabajo ce) throws RemoteException;
    public  List<Centrosdetrabajo> listaCentros()throws RemoteException;
    
    
    /// Escuelas:
    
    public boolean insertarEscuela(Escuela e)throws RemoteException;
    public Escuela buscaEscuela(int id)throws RemoteException;
    public boolean actualizarEscuela(Escuela e) throws RemoteException;
    public boolean eliminarEscuela(Escuela ce) throws RemoteException;
    public  List<Escuela> listaEscuelas()throws RemoteException;
    
    //Carreras
    
    public boolean insertarCarrera(Carrera c)throws RemoteException;
    public Carrera buscaCarrera(int id)throws RemoteException;
    public boolean actualizarCarrera(Carrera e) throws RemoteException;
    public boolean eliminarCarrera(Carrera ce) throws RemoteException;
    public  List<Carrera> listaCarreras()throws RemoteException;
    // Materias
    
    public boolean insertarMateria(Materia c)throws RemoteException;
    public Materia buscaMateria(int id)throws RemoteException;
    public boolean actualizarMateria(Materia e) throws RemoteException;
    public boolean eliminarMateria(Materia ce) throws RemoteException;
    public  List<Materia> listaMaterias()throws RemoteException;
    public  List<Materia> listaMateriasCarreras(int id)throws RemoteException;
    
    //Examenes
    public boolean insertarExamen(Examen c)throws RemoteException;
    public Examen buscaExamen(int id)throws RemoteException;
    public boolean actualizarExamen(Examen e) throws RemoteException;
    public boolean eliminarExamen(Examen ce) throws RemoteException;
    public  List<Examen> listaExamenes()throws RemoteException;
    
    //Preguntas
    public boolean insertarPregunta(Pregunta c)throws RemoteException;
    public Pregunta buscaPregunta(int id)throws RemoteException;
    public boolean actualizarPregunta(Pregunta e) throws RemoteException;
    public boolean eliminarPregunta(Pregunta ce) throws RemoteException;
    public  List<Pregunta> listaPreguntas()throws RemoteException;
    //Respuestas
    public boolean insertarRespuesta(Respuesta c)throws RemoteException;
    public Respuesta buscaRespuesta(int id)throws RemoteException;
    public boolean actualizarRespuesta(Respuesta e) throws RemoteException;
    public boolean eliminarRespuesta(Respuesta ce) throws RemoteException;
    public  List<Respuesta> listaRespuestas()throws RemoteException;
    
    public boolean insertarAlumno(Alumno c)throws RemoteException;
    public Alumno buscaAlumno(int id)throws RemoteException;
    public boolean actualizarAlumno(Alumno e) throws RemoteException;
    public boolean eliminarAlumno(Alumno ce) throws RemoteException;
    public  List<Alumno> listaAlumnos()throws RemoteException;
}
