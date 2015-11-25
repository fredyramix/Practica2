
package remoto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import modelo.Centrosdetrabajo;

public interface interfaces extends Remote
{
    public boolean insertarCentroDeTrabajo(Centrosdetrabajo ce)throws RemoteException;
    public Centrosdetrabajo buscaCentroDeEstudios(int id)throws RemoteException;
    public boolean actualizarCentroDeEstudios(Centrosdetrabajo ce) throws RemoteException;
    public boolean eliminarCentroDeEstudios(Centrosdetrabajo ce) throws RemoteException;
    public  List<Centrosdetrabajo> listaCentros()throws RemoteException;
    
}
