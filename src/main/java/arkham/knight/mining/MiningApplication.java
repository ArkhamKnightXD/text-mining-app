package arkham.knight.mining;

import arkham.knight.mining.models.SentimentTweet;
import arkham.knight.mining.services.SentimentTweetServices;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class MiningApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiningApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(SentimentTweetServices sentimentTweetServices){
        return args -> {

            /*ObjectMapper mapper = new ObjectMapper();

            TypeReference<List<SentimentTweet>> typeReference = new TypeReference<List<SentimentTweet>>(){};

            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/final.json");

            try {
                List<SentimentTweet> sentimentTweetLists = mapper.readValue(inputStream,typeReference);

                sentimentTweetServices.CreateAllSentimentTweet(sentimentTweetLists);

                System.out.println("Tweets Saved!");

            } catch (IOException e){

                System.out.println("Unable to save tweets: " + e.getMessage());
            }
*/
        };
    };
}
