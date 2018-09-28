import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.lang.Exception;

/**
 * Junit testcases - simple for experimenting with VSCode.
 * @author Patrick Victorio
 * @since 09/16/2018
 * @version 09/16/2018 -created.</br>
 */
public class JunitTests {

    /**
     * Simple testcase.
     * @throws Exception
     */
    @Test
    public void test() throws Exception {
        System.out.println("JunitTests test.");
    }

    /**
     * Simple testcase that makes an assertion.
     */
    @Test
    public void test2() throws Exception {
        System.out.println("Test2 with an assertion.");
        assertTrue(true);
    }

}