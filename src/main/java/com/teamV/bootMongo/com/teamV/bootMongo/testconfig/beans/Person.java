package com.teamV.bootMongo.com.teamV.bootMongo.testconfig.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document
public class Person {
    @Id
    private String personId;
    private String personName;
    private Double personAge;
    private Date createdTime;
    private Boolean deleted;
    private String test;

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Double getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Double personAge) {
        this.personAge = personAge;
    }
}
