package com.teamV.bootMongo.com.teamV.bootMongo.testconfig.Dao;

import com.teamV.bootMongo.com.teamV.bootMongo.testconfig.beans.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends MongoRepository<Person, String> {

}
