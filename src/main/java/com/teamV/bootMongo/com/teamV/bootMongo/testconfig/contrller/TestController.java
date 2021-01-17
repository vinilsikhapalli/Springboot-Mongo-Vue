package com.teamV.bootMongo.com.teamV.bootMongo.testconfig.contrller;

import com.teamV.bootMongo.com.teamV.bootMongo.testconfig.beans.Person;
import com.teamV.bootMongo.com.teamV.bootMongo.testconfig.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boot-mongo")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return testService.getAllPersons();
    }

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person person){
        return testService.savePerson(person);
    }

    @GetMapping("/get/{personId}")
    public Person getPersonByPersonId(@PathVariable("personId") String personid){
        return testService.getPersonByPersonId(personid);
    }

    @PutMapping("/update")
    public Person updatePerosnByPersonId(@RequestBody Person person){
        return testService.savePerson(person);
    }



    @PatchMapping("/delete/{personId}")
    public Person deletePerson(@PathVariable("personId") String personId){
        return testService.deletePerson(personId);
    }

}
