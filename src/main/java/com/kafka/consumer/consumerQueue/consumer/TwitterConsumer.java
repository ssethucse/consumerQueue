package com.kafka.consumer.consumerQueue.consumer;

import com.kafka.consumer.consumerQueue.service.TwitterConsumerMsg;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TwitterConsumer {
    @Autowired
    TwitterConsumerMsg twitterConsumerMsg;

    @KafkaListener(topics={"test-topic-replicated"})
    public void consumerMsg(ConsumerRecord<String,String> consumerRecord){
        log.info("Consumer Records={}",consumerRecord.toString());
        twitterConsumerMsg.saveMsg(consumerRecord);
    }
}
