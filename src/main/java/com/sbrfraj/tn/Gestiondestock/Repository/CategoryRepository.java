package com.sbrfraj.tn.Gestiondestock.Repository;

import com.sbrfraj.tn.Gestiondestock.Model.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categorie, String> {
}
