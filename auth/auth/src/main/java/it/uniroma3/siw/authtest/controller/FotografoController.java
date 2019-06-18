package it.uniroma3.siw.authtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FotografoController {
	
    @RequestMapping("/silph")
    public String home() {
    	return "studenteForm.html";
    }
	
	/*
	@RequestMapping(value = "/fotografo", method =  RequestMethod.POST)
	public String newStudente(@Valid @ModelAttribute("studente") Studente studente,
			Model model, BindingResult bindingResult) {
		
		this.studenteValidator.validate(studente, bindingResult);
		if(!bindingResult.hasErrors()) {
			this.studenteService.inserisci(studente);
			model.addAttribute("studenti", this.studenteService.tutti());
			return "studenti.html";
		}else {
			return "studenteForm.html";
		}
	}*/

}
