package ru.vdovin.sandbox;

import org.junit.Assert;
import org.junit.Test;
import ru.vdovin.sandbox.helloWorld.Primes;

public class PrimeTests {

    @Test
    public void testPrime(){
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testPrimeWhile(){
        Assert.assertTrue(Primes.isPrimeWhile(Integer.MAX_VALUE));
    }


    @Test
    public void testNonPrime(){
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }
}
