/*package it.uniroma3.siw.authtest.model;

import java.util.Collection;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Fotografo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cognome;
	@OneToMany
	@JoinColumn(name="fotografo")
	private Collection<Album> album;
	
	public Fotografo(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.album=new LinkedList<Album>();
	}

	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Collection<Album> getAlbum() {
		return this.album;
	}
	public void setFotografie(Collection<Album> album) {
		this.album = album;
	}
	
	
	
}
*/
