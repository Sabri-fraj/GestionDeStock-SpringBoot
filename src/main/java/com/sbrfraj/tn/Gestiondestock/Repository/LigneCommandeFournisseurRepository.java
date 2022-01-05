package com.sbrfraj.tn.Gestiondestock.Repository;

import com.sbrfraj.tn.Gestiondestock.Model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, String> {
}
