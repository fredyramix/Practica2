/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoto;

import DAO.CentroEstudiosDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import modelo.Centrosdetrabajo;

public class implementation extends UnicastRemoteObject implements interfaces
{
    CentroEstudiosDAO centro_dao = new CentroEstudiosDAO();
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
    
}
