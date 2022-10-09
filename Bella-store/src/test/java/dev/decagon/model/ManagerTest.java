package dev.decagon.model;

import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import dev.decagon.service.ApplicantService;
import dev.decagon.service.ManagerService;
import dev.decagon.service.serviceImpl.ApplicantServiceImpl;
import dev.decagon.service.serviceImpl.ManagerServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    void ShouldThrowExceptionForUnsuccessfulHire() {
        ApplicantService applicantService = new ApplicantServiceImpl();


        Applicant applicant2 = new Applicant("John Moss", 30, "jm@gmail.com",
                20, Qualification.OND, "Cashier");

        ManagerService manager = new ManagerServiceImpl();


        Assert.assertThrows(UnsuccessfulApplicationException.class,()->manager.hire(applicant2));
    }


    @Test
    void ShouldReturnCongratulationsForSuccessfulHire() {
        ApplicantService applicantService = new ApplicantServiceImpl();


        Applicant applicant1 = new Applicant("Ijeoma Thompson", 18, "jm@gmail.com",
                20, Qualification.HND, "Cashier");

        ManagerService manager = new ManagerServiceImpl();


        Assert.assertEquals("Congratulations! " + applicant1.getFullName() + " you have been hired!",manager.hire(applicant1));
    }


}