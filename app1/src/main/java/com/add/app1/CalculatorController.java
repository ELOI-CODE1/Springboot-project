package com.add.app1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculator(){
        return"calculator";
    }
    @PostMapping("/calculate")
    public String addNumber(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        int result = num1 + num2;

        model.addAttribute("number1", num1);
        model.addAttribute("number2", num2);
        model.addAttribute("total", result);

        return "calculator";
    }
    
    
}
