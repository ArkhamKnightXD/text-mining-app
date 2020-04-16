package arkham.knight.mining.repositories;

import arkham.knight.mining.models.SentimentTweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentimentTweetRepository extends JpaRepository<SentimentTweet, Long> {

}
