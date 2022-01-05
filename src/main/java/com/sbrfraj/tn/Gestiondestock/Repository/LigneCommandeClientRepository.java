package com.sbrfraj.tn.Gestiondestock.Repository;

import com.sbrfraj.tn.Gestiondestock.Model.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClient, String> {
}
