/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;
import java.io.*;


/**
 *
 * @author TANIA
 */
public class LeerMySQL implements Leer {

    @Override
    public String leer() throws Exception {
        //Aqui va todo lo de hibernate
        String mensajito="conectado a MySQL";
        return mensajito;
        
    }
    
    
}
