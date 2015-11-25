
package remoto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import modelo.Centrosdetrabajo;
import modelo.Escuela;

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
    
}
