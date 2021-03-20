package com.kafka.consumer.consumerQueue.service;

import com.kafka.consumer.consumerQueue.model.News;
import com.kafka.consumer.consumerQueue.repository.NewsRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwitterConsumerMsg {
    @Autowired
    NewsRepository newsRepository;

    public void saveMsg(ConsumerRecord<String, String> consumerRecord){
        try {
            News temp=new News();
            temp.setSubject(consumerRecord.key());
            temp.setMessage(consumerRecord.value());
            newsRepository.save(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
