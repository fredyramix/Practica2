
package Servidor;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import remoto.implementation;
import remoto.interfaces;


public class Servidor 
{
    
    public Servidor()
    {
        
        try {
            interfaces operaciones;
            LocateRegistry.createRegistry(1099);
            operaciones = new implementation();
            Naming.bind("persistencia", operaciones);
            System.out.println("Servidor escuchando...");
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) 
    {
        Servidor s = new Servidor();
    }
    
    
}
