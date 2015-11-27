
package DAO;

import conf.HibernateUtil;
import java.util.List;
import modelo.Respuesta;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RespuestaDAO 
{
      public boolean insertar(Respuesta ce)
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
     public boolean actualizar(Respuesta c) 
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
     public boolean eliminar(Respuesta c) 
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
    public  List<Respuesta> listaRespuestas()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Respuesta> lista;
       try
       {
       lista = (List<Respuesta>)session.createQuery("FROM Respuesta ").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Respuesta buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Respuesta ct;
        try {
            tx.begin();
            ct = (Respuesta) session.createQuery("FROM Respuesta WHERE idrespuesta = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) {
            return null;
        }
        return ct;
    }
}
