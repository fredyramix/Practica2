
package DAO;

import conf.HibernateUtil;
import java.util.List;
import modelo.Alumno;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlumnoDAO 
{
      public boolean insertar(Alumno ce)
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
     public boolean actualizar(Alumno c) 
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
     public boolean eliminar(Alumno c) 
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
    public  List<Alumno> listaAlumnos()
     {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.getTransaction();
       tx.begin();
       List<Alumno> lista;
       try
       {
       lista = (List<Alumno>)session.createQuery("FROM Alumno ORDER BY nombre ASC").list();
       tx.commit();
       }catch(Exception e)
       {
           return null;
       }
       return lista;
    }
     public Alumno buscar(int clave) 
     {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        Alumno ct;
        try {
            tx.begin();
            ct = (Alumno) session.createQuery("FROM Alumno WHERE matricula = " + clave).uniqueResult();
            tx.commit();
        } catch (Exception e) 
        {
            return null;
        }
        return ct;
    }
}
