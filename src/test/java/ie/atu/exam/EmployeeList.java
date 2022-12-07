package ie.atu.exam;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class EmployeeList
{
    Employee myEmployee;

@BeforeEach
void setup()
{

}
@Test
void TestName()
{
    myEmployee.setName("Connor");
    assertEquals("Connor",myEmployee.getName());
}
@Test
void TestNameFail()
{
    Exception exMessage = assertThrows(IllegalArgumentException.class,()-> {myEmployee.setName("Con");} );
            assertEquals("Minimum of characters needed or else invalid name error",exMessage.getMessage());
}
    @Test
    void AddEmployee()
    {

    }

    @Test
    void TestAddFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setName("Con");});
        assertEquals("Duplicate Employee details found, no object added", exMessage.getMessage());
    }
        @Test
    void deleteEmployee()
    {

    }
    @Test
    void TestdeleteFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setName("Con");});
        assertEquals("No matching employee found", exMessage.getMessage());
    }
    @Test
    void TestNumber()
    {
        myEmployee.setNumber(Integer.parseInt("12345678910"));
        assertEquals("123456789102",myEmployee.getName());
    }
    @Test
    void TestNumberFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class,()->{myEmployee.setNumber(1234);});
        assertEquals("Needs a unique 12 digit number, or else invalid employee number error",exMessage.getMessage());
    }

    @AfterEach
    void teardown()
    {

    }
}