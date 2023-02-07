package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsList() {
        return "<html>" +
            "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>These are the languages in which I will code fluently</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>Python</li>" +
                    "<li>Angular</li>" +
                "</ol>" +
           "</body>" +
        "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
             "<body>" +
                  "<form action='/results'>" +
                       "<label>Name<input type='text' name='userName' /></label>" +
                       "<label>First Favorite<label>" +
                       "<select name='fave1'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Python'>Python</option>" +
                            "<option value='Angular'>Angular</option>" +
                       "</select>" +
                        "<label>Second Favorite<label>" +
                        "<select name='fave2'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Python'>Python</option>" +
                            "<option value='Angular'>Angular</option>" +
                        "</select>" +
                        "<label>Third Favorite<label>" +
                        "<select name='fave3'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Python'>Python</option>" +
                            "<option value='Angular'>Angular</option>" +
                        "</select>" +
                        "<button>Submit</button>" +
                  "</form>" +
             "</body>" +
        "</html>";
    }

    @GetMapping("/results")
    @ResponseBody
    public String displayResults(@RequestParam String userName, @RequestParam String fave1, @RequestParam String fave2, @RequestParam String fave3) {
        return "<html>" +
              "<body>" +
                    "<h1>" + userName + "</h1>" +
                    "<ol>" +
                        "<li>" + fave1 + "</li>" +
                        "<li>" + fave2 + "</li>" +
                        "<li>" + fave3 + "</li>" +
                    "</ol>" +
              "</body>" +
        "</html>";
    }
}
