import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager(
                "Simon",
                "fake1",
                40000,
                "Dev");
    }

    @Test
    public void hasName(){
        assertEquals("Simon", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, manager.getSalary(), 0);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("fake1", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Dev", manager.getDeptName());
    }

    @Test
    public void canGetBonus() {
        assertEquals(400, manager.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(50000, manager.getSalary(), 0);
    }
}
