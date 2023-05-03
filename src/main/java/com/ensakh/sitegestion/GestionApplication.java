package com.ensakh.sitegestion;

import com.ensakh.sitegestion.entity.Filliere;
import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.repository.FilliereRepository;
import com.ensakh.sitegestion.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionApplication implements CommandLineRunner {
	@Autowired
	private ProfesseurRepository professeurRepository;
	//private ProfesseurRepository professeurRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		//Filliere f1 = new Filliere("informatique");
		// ob.save() method
		//FilliereRepository.save(f1);


	}
}

