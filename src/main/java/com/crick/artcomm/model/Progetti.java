package com.crick.artcomm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PROGETTI")
public class Progetti implements Serializable{

	@Id
	@Column(name = "ID_PROGETTO")
	private long idProgetto;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

}
