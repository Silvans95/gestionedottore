package it.prova.gestionedottori.service;

import java.util.List;

import it.prova.gestionedottori.model.Dottore;

public interface DottoreService {
	
	public Dottore inserisciNuovo(Dottore transientInstance);

	public List<Dottore> listAll();

	public Dottore cariscaSingoloElemento(Long id);
	
}
