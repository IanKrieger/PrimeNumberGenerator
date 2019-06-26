package app;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class PrimeNumberGenAppTest {

    @Test
    public void testCheckPrimeRun() {
        try {
            String mode = "c";
            String numToCheck = "7";
            String cont = "n";

            String input = mode + System.getProperty("line.separator") + numToCheck
                    + System.getProperty("line.separator")
                    + cont;

            System.setIn(new ByteArrayInputStream(input.getBytes()));

            PrimeNumberGenApp.main(new String[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.setIn(System.in);
        }
    }

    @Test
    public void testGeneratePrimeRun() {
        try {
            String mode = "g";
            String startNum = "2";
            String endNum = "12";
            String cont = "n";

            String input = mode + System.getProperty("line.separator") + startNum
                    + System.getProperty("line.separator") + endNum
                    + System.getProperty("line.separator") + cont;

            System.setIn(new ByteArrayInputStream(input.getBytes()));

            PrimeNumberGenApp.main(new String[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.setIn(System.in);
        }
    }

    @Test
    public void testInpResetRun() {
        try {
            String mode = "g";
            String startNum = "2";
            String endNum = "2";
            String cont = "y";

            String input = mode + System.getProperty("line.separator") + startNum
                    + System.getProperty("line.separator") + endNum
                    + System.getProperty("line.separator") + cont;

            System.setIn(new ByteArrayInputStream(input.getBytes()));

            PrimeNumberGenApp.main(new String[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.setIn(System.in);
        }
    }

    @Test
    public void testNeitherRun() {
        try {
            String mode = "q";
            String startNum = "2";
            String endNum = "12";
            String cont = "n";

            String input = mode + System.getProperty("line.separator") + startNum
                    + System.getProperty("line.separator") + endNum
                    + System.getProperty("line.separator") + cont;

            System.setIn(new ByteArrayInputStream(input.getBytes()));

            PrimeNumberGenApp.main(new String[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.setIn(System.in);
        }
    }

}
