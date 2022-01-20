package tsi.ensg.jee.articles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tsi.ensg.jee.articles.models.Author;
import tsi.ensg.jee.articles.services.AuthorService;

@Controller
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ArticleController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/myarticle")
    public String getMyArticle(Model model) {
        // Instancier ici un objet art de la classe Article (avec un auteur)
        Author art = new Author();
        model.addAttribute("myarticle",art); // Ajout au modèle
        return "article"; //Envoi vers la vue
    }
}
