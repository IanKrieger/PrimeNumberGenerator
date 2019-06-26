# PrimeNumberGenerator

## Important Stuff First - Running the project

This project can be easily ran from the command line using the java -jar command.
I have used maven to do all the packaging, which means that a new jar can be created at any time from command line.
Tests can also be run from the command line, which will generate a human readable coverage report as an html file.
This eliminates the need for an ide to run the project in any manner.
This allows for easy git clone and run in under a minute.

Coded in Java using Maven archetype, using the Intellij IDE.


### Installing maven:
```
https://maven.apache.org/install.html

This will help get maven installed if you do not have it already.
Once installed open up a fresh command line in Windows, or terminal in Mac.
```

###  Generating  the jar, running tests, and viewing the coverage
```
Assuming maven is all good and working on your local, we can now generate the jar.

To generate jar, make sure you are at the root of the project ../PrimeNumberGenerator/..

Then run:
mvn clean install

To just run the test:
mvn test

Once the jar is generated you will find it at ../PrimeNumberGenerator/target/PrimeNumberGenerator.jar
Here you can  run your: java -jar PrimeNumberGenerator.jar  (and the command line app will run no problem!)

You can find the unit test coverage as well after the maven command in the location:
../PrimeNumberGenerator/target/site/jacoco/index.html

```

### Tests / Thoughts
```
Short Version: Made Sure Prime list would populate first, tested if number is prime, combined the both. Tested main and 
made sure I had 100% coverage inside the target/site/jacoco/index.html view.

Started out with writing the interface and getting the simple override methods setup with no code in them.
Then, wrote the interface test to compliment it. It  first asserted a null return value and false for isPrime.
Then from there modified test to assert list size, and do nothing else. It first checked that list was empty. From
there the generate function was coded, and returned an  empty list, which is what I wanted. From there went to the
isPrime tests. The Tests started with the implementation parameters i added, asserting false that 6 was a prime number,
which it did. While this was good I needed to do more then that.  So i started with a range 1-10 and saw that my 
assertions were failing. It was picking up 1 and 9 as prime numbers. I realized i was adding by 2 to my counter, and 
just went by ones, which worked for 9, but not 1. So I added if the start was less than 2 we just start at 2 and that 
worked for the 1-10, 10-1 use case. I then wrote the 7000 use case and that worked, so also added first 1000 primes and
first 1 million primes, and those assertions worked as  well. I also had isPrime checks for large and small numbers to 
make sure the prime check was consistant. Everything in terms of generating primes looked good. 

From there I moved onto the main, throwing test inout through, getting what I expected. This allowed test coverage 
of the run method. I was not getting 100% coverage in my jacoco plugin at first, but I was in my IDE so I was a bit 
confused. I then realized I need to meet all the 'OR' condiditions inside of the 'If' block. So I did that and at the
end of the day was able to acheive my 100% UT coverage!

What I could have done better:
Could've done TDD better. I wrote my tests first, but only modified the two interface tests I initially 
wrote while writing the core logic before I added the rest of my tests. The rest of the tests did help me find some 
things I was doing wrong so In spririt of writing tests, then writing code, then going back to the test I followed that 
until I was done with the code.

```