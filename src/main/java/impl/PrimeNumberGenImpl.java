package impl;

import interfaces.PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenImpl implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {

        int startBound;
        int endBound;

        List<Integer> primeNumList  = new ArrayList<>();

        if(endingValue > startingValue) {
            startBound = endingValue;
            endBound = startingValue;
        } else {
            startBound = startingValue;
            endBound = endingValue;
        }

        primeNumList.add(startBound);
        primeNumList.add(endBound);

        return primeNumList;
    }

    @Override
    public boolean isPrime(int value) {
        return false;
    }
}
