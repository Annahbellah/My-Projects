package dev.decagon.service.serviceImpl;

import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import dev.decagon.model.Applicant;
import dev.decagon.service.ApplicantService;

import java.util.ArrayList;
import java.util.List;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public String apply(Applicant applicant) {
        String result ="";
        List<Applicant> applicants = new ArrayList();
        if(applicant.getQualification() == Qualification.BSC || applicant.getQualification() == Qualification.HND){
            applicants.add(applicant);
            result = "Congratulations! " + applicant.getFullName() + ", your application was successful";
        }else {
            throw new UnsuccessfulApplicationException("Sorry " + applicant.getFullName() + ", try some other time!");
        }

        return result;
    }
}
