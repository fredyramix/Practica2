/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoto;

import DAO.AlumnoDAO;
import DAO.CarreraDAO;
import DAO.CentroEstudiosDAO;
import DAO.EscuelaDAO;
import DAO.ExamenDAO;
import DAO.MateriaDAO;
import DAO.PreguntaDAO;
import DAO.RespuestaDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import modelo.Alumno;
import modelo.Carrera;
import modelo.Centrosdetrabajo;
import modelo.Escuela;
import modelo.Examen;
import modelo.Materia;
import modelo.Pregunta;
import modelo.Respuesta;

public class implementation extends UnicastRemoteObject implements interfaces
{
    CentroEstudiosDAO centro_dao = new CentroEstudiosDAO();
    EscuelaDAO escuela_dao = new EscuelaDAO();
    CarreraDAO carrera_dao = new CarreraDAO();
    MateriaDAO materia_dao = new MateriaDAO();
    ExamenDAO examen_dao = new ExamenDAO();
    PreguntaDAO pregunta_dao = new PreguntaDAO();
    RespuestaDAO respuesta_dao = new RespuestaDAO();
    AlumnoDAO alumnos_dao = new AlumnoDAO();
    public implementation()throws RemoteException
{
    super();
}

    @Override
    public boolean insertarCentroDeTrabajo(Centrosdetrabajo ce) throws RemoteException {
    return centro_dao.insertar(ce);
    }

    @Override
    public Centrosdetrabajo buscaCentroDeEstudios(int id) throws RemoteException {
        return centro_dao.buscar(id);
    }

    @Override
    public boolean actualizarCentroDeEstudios(Centrosdetrabajo ce) throws RemoteException {
         return centro_dao.actualizar(ce); }

    @Override
    public boolean eliminarCentroDeEstudios(Centrosdetrabajo ce) throws RemoteException {
       return centro_dao.eliminar(ce);}

    @Override
    public List<Centrosdetrabajo> listaCentros() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertarEscuela(Escuela e) throws RemoteException {
        return escuela_dao.insertar(e);
    }

    @Override
    public Escuela buscaEscuela(int id) throws RemoteException {
        return escuela_dao.buscar(id);
    }

    @Override
    public boolean actualizarEscuela(Escuela e) throws RemoteException {
        return escuela_dao.actualizar(e);
       }

    @Override
    public boolean eliminarEscuela(Escuela ce) throws RemoteException 
    {
        return escuela_dao.eliminar(ce);
    }

    @Override
    public List<Escuela> listaEscuelas() throws RemoteException {
        return escuela_dao.listaEscuelas();
         }

    @Override
    public boolean insertarCarrera(Carrera c) throws RemoteException 
    {
        return carrera_dao.insertar(c);
        }

    @Override
    public Carrera buscaCarrera(int id) throws RemoteException {
    return carrera_dao.buscar(id);}

    @Override
    public boolean actualizarCarrera(Carrera e) throws RemoteException {
    return carrera_dao.actualizar(e);}

    @Override
    public boolean eliminarCarrera(Carrera ce) throws RemoteException {
    return carrera_dao.eliminar(ce);}

    @Override
    public List<Carrera> listaCarreras() throws RemoteException 
    {
        return carrera_dao.listaCarreras();
        
    }

    @Override
    public boolean insertarMateria(Materia c) throws RemoteException {return materia_dao.insertar(c);}

    @Override
    public Materia buscaMateria(int id) throws RemoteException {
        return materia_dao.buscar(id);
    }

    @Override
    public boolean actualizarMateria(Materia e) throws RemoteException {return materia_dao.actualizar(e); }

    @Override
    public boolean eliminarMateria(Materia ce) throws RemoteException {return materia_dao.eliminar(ce);}

    @Override
    public List<Materia> listaMaterias() throws RemoteException {return materia_dao.listaMaterias();}

    @Override
    public boolean insertarExamen(Examen c) throws RemoteException {
    return examen_dao.insertar(c);}

    @Override
    public Examen buscaExamen(int id) throws RemoteException {return examen_dao.buscar(id);}

    @Override
    public boolean actualizarExamen(Examen e) throws RemoteException {return examen_dao.actualizar(e);}

    @Override
    public boolean eliminarExamen(Examen ce) throws RemoteException {
    return examen_dao.eliminar(ce);}

    @Override
    public List<Examen> listaExamenes() throws RemoteException {return examen_dao.listaExamens();}

    @Override
    public boolean insertarPregunta(Pregunta c) throws RemoteException {return pregunta_dao.insertar(c);}

    @Override
    public Pregunta buscaPregunta(int id) throws RemoteException {return pregunta_dao.buscar(id);}

    @Override
    public boolean actualizarPregunta(Pregunta e) throws RemoteException {return pregunta_dao.actualizar(e);}

    @Override
    public boolean eliminarPregunta(Pregunta ce) throws RemoteException {return pregunta_dao.eliminar(ce);}

    @Override
    public List<Pregunta> listaPreguntas() throws RemoteException {return pregunta_dao.listaPreguntas();}

    @Override
    public boolean insertarRespuesta(Respuesta c) throws RemoteException {
    return respuesta_dao.insertar(c);}

    @Override
    public Respuesta buscaRespuesta(int id) throws RemoteException {
    return respuesta_dao.buscar(id);}

    @Override
    public boolean actualizarRespuesta(Respuesta e) throws RemoteException {
    return respuesta_dao.actualizar(e);}

    @Override
    public boolean eliminarRespuesta(Respuesta ce) throws RemoteException {
    return respuesta_dao.eliminar(ce);}

    @Override
    public List<Respuesta> listaRespuestas() throws RemoteException {return respuesta_dao.listaRespuestas();}

    @Override
    public boolean insertarAlumno(Alumno c) throws RemoteException {
    return alumnos_dao.insertar(c);}

    @Override
    public Alumno buscaAlumno(int id) throws RemoteException {
    return alumnos_dao.buscar(id);}

    @Override
    public boolean actualizarAlumno(Alumno e) throws RemoteException {
    return alumnos_dao.actualizar(e);}

    @Override
    public boolean eliminarAlumno(Alumno ce) throws RemoteException {
    return alumnos_dao.eliminar(ce);}

    @Override
    public List<Alumno> listaAlumnos() throws RemoteException {
    return alumnos_dao.listaAlumnos();}

    @Override
    public List<Materia> listaMateriasCarreras(int id) throws RemoteException 
    {
        return materia_dao.buscarMateriasCarrera(id);
    }
    
}
