package be.jslm.quarantine;


import org.junit.*;
import org.junit.runner.*;
import org.mockito.junit.*;

@RunWith(MockitoJUnitRunner.class)
public class SplitStringTest {

    @Test(expected = NullPointerException.class)
	public void testSplitString(){
	    String statusCodes = null;
	    String status[] = statusCodes.split(",");
    }

}
