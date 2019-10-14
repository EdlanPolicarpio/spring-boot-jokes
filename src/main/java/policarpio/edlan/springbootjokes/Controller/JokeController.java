package policarpio.edlan.springbootjokes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import policarpio.edlan.springbootjokes.Service.JokeService;

@Controller
public class JokeController {
    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "jokes";
    }
}
