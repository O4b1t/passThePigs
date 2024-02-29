import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ptpTest{
    @Test
    public void test(){
        Player A = new GenericBot("GenericBot");
        assertTrue(A.getName().equals("GenericBot") );
    }
}