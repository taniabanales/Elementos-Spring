/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package proyectoFinal;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TANIA
 */
@RestController
 @RequestMapping("/")
public class ControladorTarjeta {
    @RequestMapping (value="/tarjeta/[nombre}/{fechaCorte}",method=RequestMethod.POST,
            headers ={"Accept=text/htm"})
    @ResponseBody String guardarTarjeta(@PathVariable String nombre,@PathVariable Integer fechaCorte)
            throws Exception{
            
        Tarjeta t=new Tarjeta();
        t.setDiacorte(fechaCorte);
        t.setNombre(nombre);
        DAOTarjeta dao=new DAOTarjeta();
        dao.guardar(t);
        
        return"Tarjeta guardada clon exito";
        
}
 @RequestMapping (value="/tarjeta",method =RequestMethod.GET,headers={"Accept=application/json"} )
 @ResponseBody ArrayList<Tarjeta> obtenerTodos()throws Exception{

    DAOTarjeta dao=new DAOTarjeta();
    ArrayList<Tarjeta>tarjetas=dao.buscarTodos();
    return tarjetas;
 
 }
            
}
    
        

