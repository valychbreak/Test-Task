package com.valeriy.job.task_for_labix;

import com.valeriy.job.task_for_labix.expression.Expression;
import com.valeriy.job.task_for_labix.expression.IntegerExpression;
import com.valeriy.job.task_for_labix.expression.StringExpression;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Valeriy on 26/6/2016.
 */
public class ExpressionTests {
    @Test
    public void integerAdditionOperationWithTwoOperandsTest() {
        Expression<Integer> exp = new IntegerExpression<>();
        Assert.assertEquals(
                new Integer(33), exp.add(Arrays.asList(13, 20))
        );
    }

    @Test
    public void integerAdditionOperationWithFiveOperandsTest() {
        Expression<Integer> exp = new IntegerExpression<>();
        Assert.assertEquals(
                new Integer(16), exp.add(Arrays.asList(4, 0, 3, 8, 1))
        );
    }

    @Test
    public void integerSubtractionOperationTest() {
        Expression<Integer> exp = new IntegerExpression<>();
        Assert.assertEquals(
                new Integer(-7), exp.subtract(Arrays.asList(3, 10))
        );
    }

    @Test
    public void integerMultiplicationOperationTest() {
        Expression<Integer> exp = new IntegerExpression<>();
        Assert.assertEquals(
                new Integer(0), exp.multiply(Arrays.asList(13, 0))
        );
    }

    @Test
    public void integerDivisionOperationTest() {
        Expression<Integer> exp = new IntegerExpression<>();
        Assert.assertEquals(
                new Integer(3), exp.divide(Arrays.asList(21, 7))
        );
    }

    @Test
    public void stringAdditionOperationTest() {
        Expression<String> exp = new StringExpression<>();
        Assert.assertEquals(
                "68", exp.add(Arrays.asList("6", "8"))
        );
    }

    @Test
    public void stringSubtractionOperationTest() {
        Expression<String> exp = new StringExpression<>();
        try {
            exp.subtract(Arrays.asList("6", "8"));
            Assert.assertTrue("Exception was not thrown", false);
        } catch(UnsupportedOperationException e) {

        }
    }

    @Test
    public void stringMultiplicationOperationTest() {
        Expression<String> exp = new StringExpression<>();
        try {
            exp.multiply(Arrays.asList("6", "8"));
            Assert.assertTrue("Exception was not thrown", false);
        } catch(UnsupportedOperationException e) {

        }
    }

    @Test
    public void stringDivisionOperationTest() {
        Expression<String> exp = new StringExpression<>();
        try {
            exp.divide(Arrays.asList("6", "8"));
            Assert.assertTrue("Exception was not thrown", false);
        } catch(UnsupportedOperationException e) {

        }
    }
}
