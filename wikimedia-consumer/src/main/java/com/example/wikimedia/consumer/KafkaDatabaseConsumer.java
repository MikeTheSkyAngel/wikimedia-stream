package com.example.wikimedia.consumer;

import com.example.wikimedia.entity.WikimediaRecentChange;
import com.example.wikimedia.repository.WikimediaRecentChangeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private WikimediaRecentChangeRepository repository;

    public KafkaDatabaseConsumer(WikimediaRecentChangeRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = {"wikimedia_recentchange"}, groupId = "wikimediaGroup")
    public void consume(String eventMessage) {
        LOGGER.info("Event message received -> {}", eventMessage);
        WikimediaRecentChange recentChange = new WikimediaRecentChange();
        recentChange.setWikiEventData(eventMessage);
        repository.save(recentChange);
    }

}
