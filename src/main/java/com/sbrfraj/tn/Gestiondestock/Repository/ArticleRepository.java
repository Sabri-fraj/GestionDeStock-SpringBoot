package com.sbrfraj.tn.Gestiondestock.Repository;

import com.sbrfraj.tn.Gestiondestock.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {
}
