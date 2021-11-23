package it.prova.gestionedottori.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.prova.gestionedottori.model.Dottore;
import it.prova.gestionedottori.repository.DottoreRepository;

@Service
public class DottoreServiceImpl implements DottoreService {
	
	@Autowired
	private DottoreRepository dipendenteRepository;

	@Override
	public List<Dottore> listAll() {
		return (List<Dottore>) dipendenteRepository.findAll();
	}

	@Override
	public Dottore cariscaSingoloElemento(Long id) {
		return dipendenteRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Dottore inserisciNuovo(Dottore transientInstance) {
		return dipendenteRepository.save(transientInstance);
	}

}
