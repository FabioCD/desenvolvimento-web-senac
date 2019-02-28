/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.braully.dws.modelo;

/**
 *
 * @author Aluno
 */
public enum Estado {

    GO("Goias"), DF("Distrito Federal"), AC("Acre"), AL("Alagoas"), AM("Amazonas"),
    AP("Amapa"), BA("Bahia"), CE("Ceara"), ES("Esprito Santo"), MA(" Maranhao"),
    MG("Minas Gerais"), MS("Mato Grosso do Sul"), MT("Mato Grosso"), PA("Para"),
    PB("Paraba"), PE("Pernambuco"), PI("Piau"), PR("Parana"), RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte "), RO(" R o n d n i a "), RR("Roraima"), RS("Rio Grande do Su"),
    SC("Santa Catarina"), SE(" Sergipe "), SP("S~ao Paulo "), TO("Tocantins");

    String nome;

    private Estado(String nome) {
        this.nome = nome;
    }

}
