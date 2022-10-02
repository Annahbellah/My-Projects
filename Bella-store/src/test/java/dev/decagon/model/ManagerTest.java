package dev.decagon.model;

import dev.decagon.Enums.Qualification;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void ShouldReturnCongratulationsForSuccessfulHire() {
        Applicant applicant1 = new Applicant("Ijeoma Thompson", 18,
                "ij@gmail.com", 10, Qualification.BSC, "Cashier");
        Applicant applicant2 = new Applicant("John Moss", 30, "jm@gmail.com",
                20, Qualification.OND, "Cashier");

        Manager manager = new Manager("Bella Tim", 22, "anabella@gmail.com", 23);
        String result1 =  manager.hire(applicant1);
        String result2 = manager.hire(applicant2);

        Assert.assertEquals("Congratulations! " + applicant1.getFullName() + " you have been hired!", result1);
    }
}