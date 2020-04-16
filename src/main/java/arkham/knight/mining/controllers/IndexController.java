package arkham.knight.mining.controllers;

import arkham.knight.mining.services.SentimentTweetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private SentimentTweetServices sentimentTweetServices;


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to the tweet analyzer");

        return "/freemarker/index";
    }
}
