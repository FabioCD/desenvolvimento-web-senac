/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.braully.dws.Controle;

import com.github.braully.dws.modelo.Cliente;
import com.github.braully.dws.modelo.Estado;
import org.springframework.stereotype.Component;

/**
 *
 * @author Aluno
 */
@Component
public class ClienteControle {
Cliente cliente ;
public Estado[] getListaEstados(){
    return Estado.values();
    
}
public ClienteControle () {
novoCliente ();
}
public Cliente getCliente () {
return cliente ;
}
public void setCliente ( Cliente cliente ) {
this . cliente = cliente ;
}
public void novoCliente () {
this . cliente = new Cliente ();
}
public void salvarCliente () {
String mensagem = " Cliente Salvo : " + cliente ;
System . out . println ( mensagem );
}}