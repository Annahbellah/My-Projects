package dev.decagon.model;

import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import org.junit.Assert;
import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Test;

class ApplicantTest {


    @Test
    void apply() {
        Applicant applicant1 = new Applicant("Ijeoma Thompson", 18,
                "ij@gmail.com", 10, Qualification.BSC, "Cashier");
        Applicant applicant2 = new Applicant("John Moss", 30, "jm@gmail.com",
                20, Qualification.OND, "Cashier");


        Assert.assertThrows(UnsuccessfulApplicationException.class,()->applicant2.apply(applicant2));

    }
}