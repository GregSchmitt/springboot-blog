package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//
@Controller
public class DiceController {

    //@getmapping with start game method
    @GetMapping("/dice-roll")
    public String StartGame() {

        return "dice";

    }

    //dice method
    @GetMapping("/dice-roll/{guess}")
    public String rollDice(@PathVariable int guess, Model viewModel) {

        //random number generator
        int randomNum = (int)(Math.random() * 6 + 1);
        String message = null;

        //dice logic
        if(randomNum == guess) {
            message = "Your guess matched the roll!";
        }
        else {
            message = "Your guess did not match my roll..";
        }


        //adding your attributes
        viewModel.addAttribute("message", message);
        viewModel.addAttribute("guess", guess);
        viewModel.addAttribute("randomNum", randomNum);

        return "dice";

    }
}