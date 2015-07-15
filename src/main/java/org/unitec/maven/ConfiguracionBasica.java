/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author TANIA
 */
@Configuration
public class ConfiguracionBasica {
    
 /*   @Bean
   Leer ServicioLeer(){
       LeerArchivo leer=new LeerArchivo();
       return leer;
   } */
   
   Leer LeerMySQL(){
       Leer leer=new LeerMySQL();
       return leer;
   }
    
    
}
