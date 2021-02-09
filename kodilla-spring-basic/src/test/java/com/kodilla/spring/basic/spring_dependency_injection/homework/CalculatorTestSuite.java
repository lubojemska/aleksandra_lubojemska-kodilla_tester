package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    double a = 7.5;
    double b = 4.0;

    @Test
    public void shouldReturnSum() {
        double sum = bean.add(a,b);
        assertEquals(11.5,sum);
    }

    @Test
    public void shouldReturnDifference() {
        double difference = bean.substract(a,b);
        assertEquals(3.5,difference);
    }

    @Test
    public void shouldReturnProduct() {
        double product = bean.multiply(a,b);
        assertEquals(30,product);
    }

    @Test
    public void shouldReturnQuotient() {
        double quotient = bean.divide(a,b);
        assertEquals(1.875,quotient);
    }

}
