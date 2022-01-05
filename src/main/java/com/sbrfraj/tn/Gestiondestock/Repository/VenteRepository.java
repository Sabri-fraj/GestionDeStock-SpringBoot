package com.sbrfraj.tn.Gestiondestock.Repository;

import com.sbrfraj.tn.Gestiondestock.Model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteRepository extends JpaRepository<Vente, String> {
}
