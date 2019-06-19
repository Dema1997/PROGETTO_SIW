package it.uniroma3.siw.authtest.model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import it.uniroma3.siw.authtest.model.Album;
import it.uniroma3.siw.authtest.model.Fotografia;

@Entity
public class Album {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String descrizione;
	@OneToMany
	@JoinColumn(name="album")
	private List<Fotografia> fotografie;
	
	
	public Album(String nome,String descrizione) {
		this.nome=nome;
		this.descrizione=descrizione;
		this.fotografie=new LinkedList<>();
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	

	public Collection<Fotografia> getFotografie() {
		return fotografie;
	}

	public void setFotografie(List<Fotografia> fotografie) {
		this.fotografie = fotografie;
	}

	

}

