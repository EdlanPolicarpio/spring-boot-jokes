package policarpio.edlan.springbootjokes.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJoke implements JokeService {
    private ChuckNorrisQuotes chuckNorrisQuoteObject;

    public ChuckNorrisJoke() {
        this.chuckNorrisQuoteObject = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuoteObject.getRandomQuote();
    }
}
