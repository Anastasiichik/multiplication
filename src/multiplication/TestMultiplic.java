package multiplication;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * @author Anastasia
 */
public class TestMultiplic {
    @Test(expected = Exception.class)
    public void testMult(){
        multipl val1 = new multipl(2);
        multipl val2 = new multipl(2);
        multipl exp = new multipl(4);
        multipl res = val1.mult(val2);
        
        
        assertEquals(res,exp);
        assertEquals(new multipl(2).mult(new multipl(3)),new multipl(6));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
}
