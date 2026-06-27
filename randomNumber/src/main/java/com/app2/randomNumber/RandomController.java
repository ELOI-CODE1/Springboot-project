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
    @PostMapping("/random")
    public String choiceDifficulty(@RequestParam("difficulity") int choice){
        if (choice == 1 ) {
            return "easy";  
        }else if (choice == 2) {
            return "medium";
            
        }else{
            return "hard";
        }

    }
    @PostMapping("/guess")
    public String guessedNumber(@RequestParam("guessed") int guessedNum, Model model){
        int randomNumber=random.nextInt(100);
        if (guessedNum != randomNumber) {
            guessedNum=randomNumber;
            model.addAttribute("number", guessedNum);
            return "random";
        }
        else{
            model.addAttribute("number", guessedNum);           
            return "random";
        }
    }
    
}
