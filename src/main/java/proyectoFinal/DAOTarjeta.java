/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.unitec.maven.HibernateUtilidades;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author TANIA
 */
public class DAOTarjeta {
   SessionFactory fact;
   Session ses;
   Transaction tranza;
   
public DAOTarjeta(){
     fact = HibernateUtilidades.getSessionFactory();
    ses = fact.openSession();
     
    }
        //Guardamos
        public void cerrarSesion(){
        tranza.commit(); 
        ses.close();
       }
        
    public void guardar(Tarjeta g)throws Exception{
        ses.save(g);
        cerrarSesion ();
        
    }
    public ArrayList< Tarjeta> buscarTodos()throws Exception{
        Criteria cri=ses.createCriteria(Tarjeta.class);
        ArrayList <Tarjeta> gastos=(ArrayList <Tarjeta>) cri.list();
        cerrarSesion();
        return gastos;    
    }
    public void actualizar(Tarjeta g)throws Exception{
        ses.update(g);
        
    }
    
};