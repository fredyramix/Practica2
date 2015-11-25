package DAO;
import conf.HibernateUtil;
import java.util.List;
import modelo.Centrosdetrabajo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CentroEstudiosDAO 
{
    public boolean insertar(Centrosdetrabajo ce)
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
     public boolean actualizar(Centrosdetrabajo c) 
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
     public boolean eliminar(Centrosdetrabajo c) 
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
    public  List<Centrosdetrabajo> listaCentros()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Centrosdetrabajo> lista;
       try
       {
       lista = (List<Centrosdetrabajo>)session.createQuery("FROM Centrosdetrabajo ORDER BY nombre ASC").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Centrosdetrabajo buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Centrosdetrabajo ct;
        try {
            tx.begin();
            ct = (Centrosdetrabajo) session.createQuery("FROM Centrosdetrabajo WHERE idcdt = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) {
            return null;
        }
        return ct;
    }

}
