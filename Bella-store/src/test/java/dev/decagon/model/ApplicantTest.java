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

//        String result1 = applicant1.apply(applicant1);
        //String result2 = applicant2.apply(applicant2);
        Assert.assertThrows(UnsuccessfulApplicationException.class,()->applicant2.apply(applicant2));

//        System.out.println(result1);

//       Assert.assertEquals("Congratulations! Ijeoma Thompson, your application was successful", result1);
//        Assert.assertThrows(UnsuccessfulApplicationException.class, apply());
//        Assert.assertEquals("Sorry John Moss, try some other time!", result2);
    }
}