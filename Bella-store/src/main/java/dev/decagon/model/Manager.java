package dev.decagon.model;


import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import dev.decagon.interfaces.ManagerInterface;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Persons implements ManagerInterface {
    public Manager(String fullName, Integer age, String email, Integer id) {
        super();
    }


    public String hire(Applicant applicant) {
       String message = "";
        List<Applicant> applicants = new ArrayList();
       if (applicant.getQualification()== Qualification.BSC || applicant.getQualification()==Qualification.HND){
          applicants.add(applicant);
          message = "Congratulations! " + applicant.getFullName() + " you have been hired!";
       }else {
           throw new UnsuccessfulApplicationException("Sorry " + applicant.getFullName() + ", try some other time!");
       }
        return message;
    }
}
