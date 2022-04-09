package com.sbrfraj.tn.Gestiondestock.Repository;

import com.sbrfraj.tn.Gestiondestock.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {


    Article findArticleByCodeArticleExists(String s);
    @Query("select 'a' from Article where codeArticle = :codeArticle  AND designation = : Designation")
    List<Article> findByCustomQuery(@Param("codeArticle") String codeArticle,@Param("Designation") String Designation);
    @Query(value = "select * from Article where codeArticle = :codeArticle AND designation = :Designation ",nativeQuery = true)
    List<Article> findByCustomNativeQuery(@Param("codeArticle") String codeArticle,@Param("Designation") String Designation);

    List<Article> findByCodeArticleIgnoreCaseAndDesignationIgnoreCase(String codeArticle,String Designation);


}
