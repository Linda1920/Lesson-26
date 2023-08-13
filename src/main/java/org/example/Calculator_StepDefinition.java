package org.example;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

import java.util.*;
public class Calculator_StepDefinition {

private List<Digits> digitsData = new ArrayList<>();
    @Given("two numbers {int} and {int}")
    public void two_numbers_and(Integer a, Integer b) {
        Digits digits = new Digits(a,b);
        digitsData.add(digits);

    }
    @When("we try to find the multiplication of numbers")
    public void we_try_to_find_the_multiplication_of_numbers() {

        for (Digits digits : digitsData)
        {
            Integer a=digits.getA();
            Integer b= digits.getB();
            Integer calculatedResult=a*b;
       //     System.out.println("Multiplication result: " + calculatedResult);
        }
    }
    @Then("result should be {int}")
    public void result_should_be(Integer expected) {
        for (Digits digits : digitsData)
        {
            Integer a=digits.getA();
            Integer b= digits.getB();
            Integer calculatedResult =a*b;
        Assert.assertEquals(expected, calculatedResult);
    }
}}
