import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(
                "Bob",
                "fake69nice",
                100000,
                "Dev",
                2000000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, director.getSalary(), 0);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("fake69nice", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Dev", director.getDeptName());
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000, director.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(110000, director.getSalary(), 0);
    }

    @Test
    public void hasBidget(){
        assertEquals(2000000, director.getBudget(),0);
    }

    @Test
    public void canChangeName(){
        director.setName("Arthur");
        assertEquals("Arthur", director.getName());
    }

    @Test
    public void cannotChangeName(){
        director.setName(null);
        assertEquals("Bob", director.getName());
    }

    @Test
    public void cannotDecreaseSalary(){
        director.raiseSalary(-10000);
        assertEquals(100000, director.getSalary(), 0);
    }
}
