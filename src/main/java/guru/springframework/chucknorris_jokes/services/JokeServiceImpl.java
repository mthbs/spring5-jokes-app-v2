package guru.springframework.chucknorris_jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
