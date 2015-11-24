
package Main;

import modelo.Centrosdetrabajo;
import DAO.CentroEstudiosDAO;

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
        
        
        /*Codigo para Actualizar Eliminar Centro de Estudios*/
        c.setIdcdt(1);
        c.setNombre("IPN");
        if(dao.eliminar(c))
        {
            System.out.println("Eliminado: "+c.getNombre());
        }
        else
        {
            System.out.println("Ocurrio algun problema");
        }
        
        
     System.exit(1);
    }
    
}
