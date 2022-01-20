package tsi.ensg.jee.articles.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tsi.ensg.jee.articles.models.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long> {

}
