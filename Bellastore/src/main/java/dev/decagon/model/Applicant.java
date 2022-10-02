package dev.decagon.model;


import dev.decagon.Enums.Qualification;
import dev.decagon.interfaces.ApplicantInterface;

import java.util.ArrayList;
import java.util.List;

public class Applicant extends Persons implements ApplicantInterface {
    private Qualification qualification;
    private String jobAppliedFor;

    public Applicant(){

    }

    public Applicant(String fullName, Integer age, String email, Integer id, Qualification qualification, String jobAppliedFor) {
        super(fullName, age, email, id);
        this.qualification = qualification;
        this.jobAppliedFor = jobAppliedFor;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public String getJobAppliedFor() {
        return jobAppliedFor;
    }

    public void setJobAppliedFor(String jobAppliedFor) {
        this.jobAppliedFor = jobAppliedFor;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "qualification=" + qualification +
                ", jobAppliedFor='" + jobAppliedFor + '\'' +
                '}';
    }



    public String apply(Applicant applicant) {
        String result ="";
        List<Applicant> applicants = new ArrayList();
        if(applicant.getQualification() == Qualification.BSC || applicant.getQualification() == Qualification.HND){
            applicants.add(applicant);
            result = "Congratulations! " + applicant.getFullName() + ", your application was successful";
        }else {
            result = "Sorry " + applicant.getFullName() + ", try some other time!";
        }

        return result;
    }
}
