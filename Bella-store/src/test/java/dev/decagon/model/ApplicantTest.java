package dev.decagon.model;

import dev.decagon.Enums.Qualification;
import dev.decagon.exceptions.UnsuccessfulApplicationException;
import org.junit.Assert;
import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Test;

class ApplicantTest {


    @Test
    void apply() {
        Applicant applicant1 = new Applicant();
        applicant1.setFullName("Ijeoma Thompson"); applicant1.setQualification(Qualification.OND);
        applicant1.setAge(30); applicant1.setId(22);

        Assert.assertThrows(UnsuccessfulApplicationException.class,()->applicant1.apply(applicant1));

    }
}