package interfaces;

import impl.PrimeNumberGenImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {

    private PrimeNumberGenerator primeNumberGenerator;

    public PrimeNumberGeneratorTest(PrimeNumberGenerator primeNumberGenerator) {
        this.primeNumberGenerator = primeNumberGenerator;
    }

    @Test
    public void generateTest() {
        Assert.assertTrue(primeNumberGenerator.generate(2, 3).size() == 2);
    }

    @Test
    public void isPrimeTest() {
        Assert.assertFalse(primeNumberGenerator.isPrime(6));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> instancesToTest() {
        return Collections.singletonList(new Object[]{new PrimeNumberGenImpl()});
    }

}
