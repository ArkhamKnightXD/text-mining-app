package arkham.knight.mining.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SentimentTweet implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String text;
    private String hashtags;
    private double sentiment;
    private String sentiment_label;


    public SentimentTweet() {
    }

    public SentimentTweet(String text,String hashtags) {

        this.text = text;
        this.hashtags = hashtags;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public double getSentiment() {
        return sentiment;
    }

    public void setSentiment(double sentiment) {
        this.sentiment = sentiment;
    }

    public String getSentiment_label() {
        return sentiment_label;
    }

    public void setSentiment_label(String sentiment_label) {
        this.sentiment_label = sentiment_label;
    }
}
