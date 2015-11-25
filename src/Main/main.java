
package Main;

import modelo.Centrosdetrabajo;
import DAO.CentroEstudiosDAO;
import DAO.EscuelaDAO;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import modelo.Escuela;
import remoto.interfaces;

public class main 
{
    public static void main(String args[]) throws NotBoundException, MalformedURLException, RemoteException
    {
        interfaces op;
        op = (interfaces) Naming.lookup("rmi://localhost/persistencia");
        Escuela e = new Escuela();
        EscuelaDAO edao = new EscuelaDAO();
        List l = new ArrayList();
        
        l=edao.listaEscuelas();
        for(int i=0;i<l.size();i++)
        {
            e=(Escuela)l.get(i);
            System.out.println("Nombre:" +e.getNombre());
            System.out.println("ID escuela:" +e.getIdescuela());
            System.out.println("ID centro Trabajo: " +e.getCentrosdetrabajo().getIdcdt());
            //System.out.println("Nombre centro Trabajo: " +e.getCentrosdetrabajo().getNombre());
            
        }
        
        //Centrosdetrabajo c = new Centrosdetrabajo();
        //e("Uvm");
        
        /*Codigo para insertar Centro de Estudios
        
        if(op.insertarCentroDeTrabajo(c))
        {
            System.out.println("Agregado: "+c.getNombre());
        }
        else
        {
            System.out.println("Ocurrio algun problemads");
        }*/
        
        
        /*Codigo para Actualizar Centro de Estudios
        c.setIdcdt(1);
        c.setNombre("IPN");
        if(dao.actualizar(c))
        {
            System.out.println("Actualizado: "+c.getNombre());
        }
        else
        {
            System.out.println("Ocurrio algun problema");
        }*/
        
        
        /*Codigo para Actualizar Eliminar Centro de Estudios
        c.setIdcdt(1);
        c.setNombre("IPN");
        if(dao.eliminar(c))
        {
            System.out.println("Eliminado: "+c.getNombre());
        }
        else
        {
            System.out.println("Ocurrio algun problema");
        }*/
        /*List lista = dao.listaCentros();
        for(int i =0;i<lista.size();i++)
        {
            Centrosdetrabajo ct = (Centrosdetrabajo) lista.get(i);
            System.out.println("ID: "+ct.getIdcdt()+" Nombre: "+ct.getNombre());
           
        }*/
        /*c=dao.buscar(2);
        System.out.println("ID: "+c.getIdcdt()+" Nombre: "+c.getNombre());*/
     System.exit(1);
    }
    
}
