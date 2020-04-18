package arkham.knight.mining.controllers;

import arkham.knight.mining.models.SentimentTweet;
import arkham.knight.mining.services.SentimentTweetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    private SentimentTweetServices sentimentTweetServices;

    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("title","Welcome to sentiment analyzer");
        model.addAttribute("tweets", sentimentTweetServices.FindAllSentimentTweets());

        return "/freemarker/adminPage";
    }


    @RequestMapping("/creation")
    public String creationPage(Model model){

        model.addAttribute("title","Welcome to sentiment analyzer");

        return "/freemarker/createTweet";
    }


    @RequestMapping("/create")
    public String create(@RequestParam(name = "text") String text, @RequestParam(name = "hashtags") String hashtags){

        SentimentTweet sentimentTweetToCreate = new SentimentTweet(text,hashtags);

        sentimentTweetServices.CreateSentimentTweet(sentimentTweetToCreate);

        return "redirect:";
    }
}
