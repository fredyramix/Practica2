
package Main;

import modelo.Centrosdetrabajo;
import DAO.CentroEstudiosDAO;
import java.util.List;

public class main 
{
    public static void main(String args[])
    {
        Centrosdetrabajo c = new Centrosdetrabajo();
        c.setNombre("Uvm");
        
        CentroEstudiosDAO  dao = new CentroEstudiosDAO();
        /*Codigo para insertar Centro de Estudios
        
        if(dao.insertar(c))
        {
            System.out.println("Agregado: "+c.getNombre());
        }
        else
        {
            System.out.println("Ocurrio algun problemads");
        }
        */
        
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
        c=dao.buscar(2);
        System.out.println("ID: "+c.getIdcdt()+" Nombre: "+c.getNombre());
     System.exit(1);
    }
    
}
