package it.prova.gestionedottori;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.prova.gestionedottori.model.Dottore;
import it.prova.gestionedottori.service.DottoreService;

@SpringBootApplication
public class GestionedottoriApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionedottoriApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDottori(DottoreService dottoreService) {
		return (args) -> {

			// inizializzo il Db
			dottoreService.save(new Dottore("nome1", "cognome1", "codice1", false, true));
			dottoreService.save(new Dottore("nome2", "cognome2", "codice2", false, true));
			dottoreService.save(new Dottore("nome3", "cognome3", "codice3", false, true));
			dottoreService.save(new Dottore("nome4", "cognome4", "codice4", false, true));
			dottoreService.save(new Dottore("nome5", "cognome5", "codice5", false, true));
			dottoreService.save(new Dottore("nome6", "cognome6", "codice6", false, true));
			dottoreService.save(new Dottore("nome7", "cognome7", "codice7", false, true));
			dottoreService.save(new Dottore("nome8", "cognome8", "codice8", false, true));
			
			// verifico inserimento
			System.out.println("Elenco Dottori");
			dottoreService.listAll().forEach(dottItem -> {
				System.out.println(dottItem);
			});

			
		};
	}
	
	
}
