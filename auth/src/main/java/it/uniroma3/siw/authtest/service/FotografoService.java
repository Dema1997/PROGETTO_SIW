package it.uniroma3.siw.authtest.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.uniroma3.siw.authtest.model.Fotografo;
import it.uniroma3.siw.authtest.repository.FotografoRepository;

@Service
public class FotografoService {
	
	@Autowired 
	private FotografoRepository fotografoRepository;
	
	@Transactional
	public Fotografo fotografoPerId(Long id) {
	return	this.fotografoRepository.findById(id).get();
	}
	
	@Transactional
	public Fotografo inserisci(Fotografo fotografo) {
	return	this.fotografoRepository.save(fotografo);
	}
	
	@Transactional
	public List<Fotografo> tutti() {
	return	(List<Fotografo>) this.fotografoRepository.findAll();
	}

	/*public List<Fotografo> findByNome(String nome) {
		return this.studenteRepository.findByNome(nome);
	} */
	
}

