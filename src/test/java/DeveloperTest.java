import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Stefano", "stefano42", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Stefano", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("stefano42", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(250, developer.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000);
        assertEquals(35000, developer.getSalary(), 0);
    }
}
