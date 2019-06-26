package impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrimeNumberGenImplTest {

    PrimeNumberGenImpl primeNumberGen = new PrimeNumberGenImpl();

    @Test
    public void isPrimeTestTrue() {
        Assert.assertTrue(primeNumberGen.isPrime(2));
    }

    @Test
    public void isPrimeTestFalse() {
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

    @Test
    public void testGenerateForwardRangeOfNumbers() {

        List<Integer> primeList = primeNumberGen.generate(1, 10);

        Assert.assertEquals(4, primeList.size());
        Assert.assertTrue(primeList.contains(2));
        Assert.assertTrue(primeList.contains(3));
        Assert.assertTrue(primeList.contains(5));
        Assert.assertTrue(primeList.contains(7));

    }

    @Test
    public void testGenerateBackwardsRangeOfNumbers() {

        List<Integer> primeList = primeNumberGen.generate(10, 1);

        Assert.assertEquals(4, primeList.size());
        Assert.assertTrue(primeList.contains(2));
        Assert.assertTrue(primeList.contains(3));
        Assert.assertTrue(primeList.contains(5));
        Assert.assertTrue(primeList.contains(7));

    }

    @Test
    public void testGenerate7000Range() {

        List<Integer> primeList =  primeNumberGen.generate(7900,7920);

        Assert.assertEquals(primeList.size(), 3);
        Assert.assertTrue(primeList.contains(7901));
        Assert.assertTrue(primeList.contains(7907));
        Assert.assertTrue(primeList.contains(7919));

    }

    @Test
    public void testGenerateFirst1000Primes() {
        Assert.assertEquals(1000, primeNumberGen.generate(2,7919).size());
    }

    @Test
    public void testGenerateFirstPrimeAndSameRange() {
        Assert.assertEquals(1, primeNumberGen.generate(2,2).size());
    }

}
