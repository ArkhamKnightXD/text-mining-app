package arkham.knight.mining.services;

import arkham.knight.mining.models.SentimentTweet;
import arkham.knight.mining.repositories.SentimentTweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentimentTweetServices {

    @Autowired
    private SentimentTweetRepository sentimentTweetRepository;


    public void CreateAllSentimentTweet(List<SentimentTweet> sentimentTweetListToCreate){

        sentimentTweetRepository.saveAll(sentimentTweetListToCreate);

    }


    public void CreateSentimentTweet(SentimentTweet sentimentTweetToCreate){

        sentimentTweetRepository.save(sentimentTweetToCreate);

    }


    public List<SentimentTweet> FindAllSentimentTweets(){

        return sentimentTweetRepository.findAll();
    }


    public void DeleteSentimentTweet(SentimentTweet sentimentTweetToDelete){

        sentimentTweetRepository.delete(sentimentTweetToDelete);

    }


    public void DeleteAllSentimentTweet(){

        sentimentTweetRepository.deleteAll();

    }
}
