import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DBAdmin;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {

    DBAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DBAdmin(
                "Bob",
                "fake23",
                27000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", dbAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(27000, dbAdmin.getSalary(), 0);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("fake23", dbAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetBonus() {
        assertEquals(270, dbAdmin.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        dbAdmin.raiseSalary(3000);
        assertEquals(30000, dbAdmin.getSalary(), 0);
    }
}
