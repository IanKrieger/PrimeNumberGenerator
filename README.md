# impl.PrimeNumberGenerator

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

To generate jar, make sure you are at the root of the project ../impl.PrimeNumberGenerator/..

Then run:
mvn clean install

To just run the test:
mvn test

Once the jar is generated you will find it at ../impl.PrimeNumberGenerator/target/impl.PrimeNumberGenerator.jar
Here you can  run your: java -jar impl.PrimeNumberGenerator.jar  (and the command line app will run no problem!)

You can find the unit test coverage as well after the maven command in the location:
../impl.PrimeNumberGenerator/target/site/jacoco/index.html

```