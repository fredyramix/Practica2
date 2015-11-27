
package DAO;

import conf.HibernateUtil;
import java.util.List;
import modelo.Pregunta;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PreguntaDAO 
{
      public boolean insertar(Pregunta ce)
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
     public boolean actualizar(Pregunta c) 
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
     public boolean eliminar(Pregunta c) 
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
    public  List<Pregunta> listaPreguntas()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Pregunta> lista;
       try
       {
       lista = (List<Pregunta>)session.createQuery("FROM Pregunta ").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Pregunta buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Pregunta ct;
        try {
            tx.begin();
            ct = (Pregunta) session.createQuery("FROM Pregunta WHERE idpregunta = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) {
            return null;
        }
        return ct;
    }
}

