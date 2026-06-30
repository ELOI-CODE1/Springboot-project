package com.app2.randomNumber;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RandomController {

    Random random = new Random();

    @GetMapping("/")
    public String randomWeb(){
        return"random";
    }
    @PostMapping("/page")
    public void choiceDifficulty(@RequestParam("difficulty") int choice, Model model){
        if (choice == 1 ) {
            model.addAttribute("difficultyChoosen","Easy");  
        }else if (choice == 2) {
            model.addAttribute("difficultyChoosen","Medium");
        }else{
            model.addAttribute("difficultyChoosen","Hard");
        }

    }
    @PostMapping("/page")
    public String guessedNumber(@RequestParam("guessed") int guessedNum, Model model){
        int randomNumber = random.nextInt(100);
        if (guessedNum != randomNumber) {
            guessedNum = randomNumber;
            model.addAttribute("number", guessedNum);
            return "random";
        }
        else{
            model.addAttribute("number", guessedNum);           
            return "random";
        }
    }
}
