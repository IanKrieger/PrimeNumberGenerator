package impl;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberGenImplTest {

    PrimeNumberGenImpl primeNumberGen  = new PrimeNumberGenImpl();

    @Test
    public void isPrimeTestTrue(){
        Assert.assertTrue(primeNumberGen.isPrime(2));
    }

    @Test
    public void isPrimeTestFalse(){
        Assert.assertFalse(primeNumberGen.isPrime(12));
    }

    @Test
    public void isPrimeTestVeryLargeNumberTrue() {
        Assert.assertTrue(primeNumberGen.isPrime(433494437));
    }

    @Test
    public void isPrimeTestVeryLargeNumberFalse() {
        Assert.assertFalse(primeNumberGen.isPrime(1000000000));
    }

}
