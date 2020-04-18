package arkham.knight.mining.services;

import arkham.knight.mining.models.SentimentTweet;
import arkham.knight.mining.repositories.SentimentTweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

import java.util.ArrayList;
import java.util.List;

@Service
public class WekaServices {

    @Autowired
    private SentimentTweetRepository sentimentTweetRepository;


 //   List<SentimentTweet> sentimentTweetList = new ArrayList<>(sentimentTweetRepository.findAll());


}
