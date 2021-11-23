package it.prova.gestionedottori.service;

import java.util.List;

import org.springframework.data.domain.Page;

import it.prova.gestionedottori.model.Dottore;

public interface DottoreService {
	
	public Dottore inserisciNuovo(Dottore transientInstance);

	public List<Dottore> listAll();

	public Dottore cariscaSingoloElemento(Long id);

	Page<Dottore> searchAndPaginate(Dottore automobileExample, Integer pageNo, Integer pageSize, String sortBy);

	Dottore get(Long idInput);

	Dottore save(Dottore input);

	void delete(Dottore input);

	
}
