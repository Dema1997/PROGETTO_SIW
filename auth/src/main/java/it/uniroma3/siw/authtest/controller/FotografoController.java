package it.uniroma3.siw.authtest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.authtest.model.Fotografo;
import it.uniroma3.siw.authtest.service.FotografoService;


@Controller
public class FotografoController {

	@Autowired
	private FotografoService fotografoService;


	public FotografoController() {
		super();
	}
	@RequestMapping(value = { "/fotografiGuest" }, method = RequestMethod.GET)
	public String getFotografiGuest(Model model) {
		//String role="GUEST";
		//model.addAttribute("role", role);
		model.addAttribute("fotografi",this.fotografoService.tutti());

		return "fotografi";
	}

	@RequestMapping(value = { "/fotografi" }, method = RequestMethod.GET)
	public String getFotografi(Model model) {
		
		UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String role = details.getAuthorities().iterator().next().getAuthority();    // get first authority
		model.addAttribute("role", role);
		model.addAttribute("fotografi",this.fotografoService.tutti());

		return "fotografi";
	}
	@RequestMapping( "/fotografoForm" )
	public String getFotografo(Model model) {
		model.addAttribute("fotografo",new Fotografo());
		return "fotografoForm";
	}
	
	@RequestMapping(value="/fotografo", method=RequestMethod.POST)
	public String newFotografo(@Valid@ModelAttribute("studente")Fotografo fotografo,Model model) {
		this.fotografoService.inserisci(fotografo);
		model.addAttribute("fotografi", this.fotografoService.tutti());
		return "fotografi";

	}
}


