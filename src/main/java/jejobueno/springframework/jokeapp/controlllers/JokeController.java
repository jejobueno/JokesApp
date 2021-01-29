package jejobueno.springframework.jokeapp.controlllers;

import jejobueno.springframework.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public  JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    //It will take in an model and we are adding an attribute that
    // are the random jokes. We also are giving name view "chucknorris"
    @RequestMapping({"/",""}) //Map context root
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";

    }
}
