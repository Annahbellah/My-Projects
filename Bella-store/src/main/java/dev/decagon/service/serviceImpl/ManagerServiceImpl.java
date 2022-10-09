package dev.decagon.service.serviceImpl;

import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import dev.decagon.model.Applicant;
import dev.decagon.service.ManagerService;

import java.util.ArrayList;
import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    @Override
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
