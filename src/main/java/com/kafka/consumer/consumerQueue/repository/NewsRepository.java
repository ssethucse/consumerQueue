package com.kafka.consumer.consumerQueue.repository;

import com.kafka.consumer.consumerQueue.model.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<News,Integer> {
}
