package guru.springframework.chucknorris_jokes.controllers;

import guru.springframework.chucknorris_jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String openRootPage(Model model) {
        model.addAttribute("joke",jokeService.getRandomQuote());
        return "jokes/jokelist";
    }

}
