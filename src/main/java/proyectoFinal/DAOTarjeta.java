/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.unitec.maven.HibernateUtilidades;

/**
 *
 * @author TANIA
 */
public class DAOTarjeta {
    public static void guardar(Tarjeta t) throws Exception{
        SessionFactory fac= HibernateUtilidades.getSessionFactory();
        Session ses= fac.openSession();
        Transaction tranza= ses.beginTransaction();
    }
        //Guardamos
        public void cerrarSesion(){
        tranza.commmit(); 
        ses.close();
       }
        
    public void guardar(Tarjeta t)throws Exception{
        ses.save(t);
        cerrarSesion ();
        
    }
    public ArrayList< Tarjeta> buscarTodos()throws Exception{
        Criteria cri=ses.createCriteria(Tarjeta.class);
        
        
        
    }
}
