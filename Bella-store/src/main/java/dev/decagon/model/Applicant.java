package dev.decagon.model;


import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import dev.decagon.service.ApplicantService;

import java.util.ArrayList;
import java.util.List;

public class Applicant extends Persons  {
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

}
