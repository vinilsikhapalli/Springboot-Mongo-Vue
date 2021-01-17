package com.teamV.bootMongo.com.teamV.bootMongo.testconfig.service;

import com.teamV.bootMongo.com.teamV.bootMongo.testconfig.Dao.TestRepo;
import com.teamV.bootMongo.com.teamV.bootMongo.testconfig.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;

    public List<Person> getAllPersons(){
        return testRepo.findAll().stream().filter(data -> data.getDeleted() != true).collect(Collectors.toList());
    }

    public Person savePerson(Person person){

        person.setCreatedTime(new Date());
        if(person.getDeleted() == null)
            person.setDeleted(false);

        return  testRepo.save(person);
    }

    public Person getPersonByPersonId(String personId){
        return testRepo.findById(personId).orElse(null);
    }

//    public Person updatePerson(Person person){
//        return testRepo.save(person);
//    }

    public Person deletePerson(String persionId){

        Person persistedPerson = this.getPersonByPersonId(persionId);
        persistedPerson.setDeleted(true);
        return this.savePerson(persistedPerson);

    }
}
