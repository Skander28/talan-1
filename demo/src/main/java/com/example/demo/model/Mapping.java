package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name = "mapping")
@JacksonXmlRootElement(localName = "Mapping")

public class Mapping  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
	    private Long id;
	
	 @JacksonXmlProperty
	@Column(name = "generateur")
	private String generateur;
	
	 
	@JacksonXmlProperty
	@Column(name = "fichier")
	private String fichier;
	
	@Column(name = "delimiteur ")
	private String delimiteur ;
	
	@Column(name = "lignesAignorer ")
	private String lignesAignorer ;
	
	@Column(name = "Informatica ")
	private String Informatica ;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination  ")
	private String destination ;
	
	@Column(name = "tablederejet ")
	private String tablederejet ;
	
	@Column(name = "masquefichier")
	private String masquefichier;
	
	@Column(name = "masquejava  ")
	private String masquejava  ;
	
	@Column(name = "masqueinfo  ")
	private String masqueinfo;
	
	@Column(name = "SchemaInput ")
	private String SchemaInput;
	
	@Column(name = "ajouter")
	private String ajouter;


	
	

	
	public Mapping(Long id, String generateur, String fichier, String delimiteur, String lignesAignorer,
			String informatica, String source, String destination, String tablederejet, String masquefichier,
			String masquejava, String masqueinfo, String schemaInput, String ajouter) {
		super();
		this.id = id;
		this.generateur = generateur;
		this.fichier = fichier;
		this.delimiteur = delimiteur;
		this.lignesAignorer = lignesAignorer;
		this.Informatica = informatica;
		this.source = source;
		this.destination = destination;
		this.tablederejet = tablederejet;
		this.masquefichier = masquefichier;
		this.masquejava = masquejava;
		this.masqueinfo = masqueinfo;
		this.SchemaInput = schemaInput;
		this.ajouter = ajouter;
	}






	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public String getGenerateur() {
		return generateur;
	}






	public void setGenerateur(String generateur) {
		this.generateur = generateur;
	}






	public String getFichier() {
		return fichier;
	}






	public void setFichier(String fichier) {
		this.fichier = fichier;
	}






	public String getDelimiteur() {
		return delimiteur;
	}






	public void setDelimiteur(String delimiteur) {
		this.delimiteur = delimiteur;
	}






	public String getLignesAignorer() {
		return lignesAignorer;
	}






	public void setLignesAignorer(String lignesAignorer) {
		this.lignesAignorer = lignesAignorer;
	}






	public String getInformatica() {
		return Informatica;
	}






	public void setInformatica(String informatica) {
		Informatica = informatica;
	}






	public String getSource() {
		return source;
	}






	public void setSource(String source) {
		this.source = source;
	}






	public String getDestination() {
		return destination;
	}






	public void setDestination(String destination) {
		this.destination = destination;
	}






	public String getTablederejet() {
		return tablederejet;
	}






	public void setTablederejet(String tablederejet) {
		this.tablederejet = tablederejet;
	}






	public String getMasquefichier() {
		return masquefichier;
	}






	public void setMasquefichier(String masquefichier) {
		this.masquefichier = masquefichier;
	}






	public String getMasquejava() {
		return masquejava;
	}






	public void setMasquejava(String masquejava) {
		this.masquejava = masquejava;
	}






	public String getMasqueinfo() {
		return masqueinfo;
	}






	public void setMasqueinfo(String masqueinfo) {
		this.masqueinfo = masqueinfo;
	}






	public String getSchemaInput() {
		return SchemaInput;
	}






	public void setSchemaInput(String schemaInput) {
		SchemaInput = schemaInput;
	}






	public String getAjouter() {
		return ajouter;
	}






	public void setAjouter(String ajouter) {
		this.ajouter = ajouter;
	}






	public static long getSerialversionuid() {
		return serialVersionUID;
	}






	public Mapping() {
		
	}
	
	
	
	
	
	
	
	
}
