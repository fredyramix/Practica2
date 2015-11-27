
package DAO;

import conf.HibernateUtil;
import java.util.List;
import modelo.Examen;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ExamenDAO 
{
      public boolean insertar(Examen ce)
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
     public boolean actualizar(Examen c) 
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
     public boolean eliminar(Examen c) 
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
    public  List<Examen> listaExamens()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Examen> lista;
       try
       {
       lista = (List<Examen>)session.createQuery("FROM Examen").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Examen buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Examen ct;
        try {
            tx.begin();
            ct = (Examen) session.createQuery("FROM Examen WHERE idexamen = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) {
            return null;
        }
        return ct;
    }
}
