
package DAO;

import conf.HibernateUtil;
import java.util.List;
import modelo.Carrera;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarreraDAO 
{
      public boolean insertar(Carrera ce)
    {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction(); 
       try
       {
            tx.begin();
            session.save(ce);
            tx.commit();
       }catch(Exception e)
       {
           
           return false;
       }
       return true;
    }
     public boolean actualizar(Carrera c) 
    {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.update(c);
            tx.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
     public boolean eliminar(Carrera c) 
    {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.delete(c);
            tx.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public  List<Carrera> listaCarreras()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Carrera> lista;
       try
       {
       lista = (List<Carrera>)session.createQuery("FROM Carrera ORDER BY nombre ASC").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Carrera buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Carrera ct;
        try {
            tx.begin();
            ct = (Carrera) session.createQuery("FROM Carrera WHERE idcarrera = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) {
            return null;
        }
        return ct;
    }
}
