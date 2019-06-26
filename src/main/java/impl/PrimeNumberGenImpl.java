package impl;

import interfaces.PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenImpl implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {

        int startBound;
        int endBound;

        List<Integer> primeNumList = new ArrayList<>();

        if (startingValue > endingValue) {
            startBound = endingValue;
            endBound = startingValue;
        } else {
            startBound = startingValue;
            endBound = endingValue;
        }

        if (startBound <= 2) {
            startBound = 2;
        }

        for (int i = startBound; i <= endBound; i++) {
            if (isPrime(i)) {
                primeNumList.add(i);
            }
        }

        return primeNumList;
    }

    @Override
    public boolean isPrime(int value) {

        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
