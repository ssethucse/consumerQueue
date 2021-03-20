package com.kafka.consumer.consumerQueue.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class News {
    @Id
    @GeneratedValue
    private Integer value;
    private String subject;
    private String message;
}
