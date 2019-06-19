package it.uniroma3.siw.authtest.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fotografia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	//private int img;
	
	//many to many
	//private Collection<Richiesta> richieste;

}



