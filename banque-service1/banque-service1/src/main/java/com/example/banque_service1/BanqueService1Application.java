package com.example.banque_service1;

import com.example.banque_service1.entities.Compte;
import com.example.banque_service1.entities.TypeCompte;
import com.example.banque_service1.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class BanqueService1Application {

	public static void main(String[] args) {
		SpringApplication.run(BanqueService1Application.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {


			compteRepository.save(new Compte(null, Math.random() * 9000, LocalDate.now(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, Math.random() * 9000, LocalDate.now(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, Math.random() * 9000, LocalDate.now(), TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};

	}
}
