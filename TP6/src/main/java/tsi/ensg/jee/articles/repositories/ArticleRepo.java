package tsi.ensg.jee.articles.repositories;

import org.springframework.data.repository.CrudRepository;
import tsi.ensg.jee.articles.models.Article;

public interface ArticleRepo extends CrudRepository<Article, Long> {

}
