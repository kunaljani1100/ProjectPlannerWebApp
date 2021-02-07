package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Date;

public class Communication {
    private String communicationId;
//    @BsonProperty("sender")
//    private Person sender;
//    @BsonProperty("receiver")
//    private Person receiver;
    private Date date;
    private String summary;

    public String getCommunicationId() {
        return communicationId;
    }

    public void setCommunicationId(String communicationId) {
        this.communicationId = communicationId;
    }

//    public Person getSender() {
//        return sender;
//    }
//
//    public void setSender(Person sender) {
//        this.sender = sender;
//    }
//
//    public Person getReceiver() {
//        return receiver;
//    }
//
//    public void setReceiver(Person receiver) {
//        this.receiver = receiver;
//    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
