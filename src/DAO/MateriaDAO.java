
package DAO;

import conf.HibernateUtil;
import java.util.List;
import modelo.Materia;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MateriaDAO 
{
      public boolean insertar(Materia ce)
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
     public boolean actualizar(Materia c) 
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
     public boolean eliminar(Materia c) 
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
    public  List<Materia> listaMaterias()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Materia> lista;
       try
       {
       lista = (List<Materia>)session.createQuery("FROM Materia ORDER BY nombre ASC").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Materia buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Materia ct;
        try {
            tx.begin();
            ct = (Materia) session.createQuery("FROM Materia WHERE idmateria = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) {
            return null;
        }
        return ct;
    }
     public List<Materia> buscarMateriasCarrera(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
         List<Materia> lista;
        try {
            tx.begin();
            lista = (List<Materia>)session.createQuery("FROM Materia WHERE car_id ="+clave).list();
            tx.commit();
        } catch(Exception e)
       {
           return null;
       }
       return lista;
    }
}
