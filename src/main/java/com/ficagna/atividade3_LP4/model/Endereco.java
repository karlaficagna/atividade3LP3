package com.ficagna.atividade3_LP4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
@Entity
@Table(name="DB_Enderecos")
public class Endereco implements Serializable {
    @Id
    @GeneratedValue
    private long Id;

    private Integer cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

}
