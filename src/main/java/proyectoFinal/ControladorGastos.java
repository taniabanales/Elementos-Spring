package proyectoFinal;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class ControladorGastos {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    @RequestMapping(value="/gastos/{concepto}/{cantidad}/{fecha}", method = RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardarGastos(@PathVariable String concepto, @PathVariable float cantidad , @PathVariable Integer fecha)throws Exception{
        Gastos g=new Gastos();
    g.setCantidad(cantidad);
    g.setConcepto(concepto);
    g.setFecha(fecha);
        DAOGastos dao=new DAOGastos();               
        dao.guardar(g);
        
        return "gASTO guardado con éxito";
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    @RequestMapping(value="/gasto", method =  RequestMethod.GET, headers={"Accept=application/json"})
@ResponseBody ArrayList<Gastos> obtenerTodos()throws Exception{
    
   DAOGastos dao= new DAOGastos();
    ArrayList<Gastos> gastos= dao.buscarTodos();
    return gastos;

}
    
}