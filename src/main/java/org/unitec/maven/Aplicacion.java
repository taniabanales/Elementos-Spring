/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan 
@EnableAutoConfiguration
public class Aplicacion {
    
    public static void main(String[] args) throws Exception{
        
        SpringApplication.run(Aplicacion.class, args);
        
        System.out.println("Un menssaje desde spring boot");
        
        LeerArchivo objeto=new LeerArchivo();
        System.out.println(objeto.leer());
    }
        
        
    }
    
