package com.example.banque_service1.repositories;

import com.example.banque_service1.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
    long count();

    @Query("SELECT SUM(c.solde) FROM Compte c")
    double sumSoldes();
}
