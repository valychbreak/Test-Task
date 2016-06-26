package com.valeriy.job.task_for_labix.expression;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Valeriy on 26/6/2016.
 */
public class IntegerExpression<T extends Integer> implements Expression<T> {
    @Override
    public T add(List<T> operands) throws UnsupportedOperationException {
        Integer result = 0;
        for (T operand : operands) {
            result += operand.intValue();
        }

        return (T)result;
    }

    @Override
    public T subtract(List<T> operands) throws UnsupportedOperationException {
        Iterator<T> iterator = operands.iterator();
        Integer result = iterator.next();

        while(iterator.hasNext()) {
            result -= iterator.next().intValue();
        }

        return (T) result;
    }

    @Override
    public T multiply(List<T> operands) throws UnsupportedOperationException {
        Integer result = 0;
        for (T operand : operands) {
            result *= operand.intValue();
        }

        return (T)result;
    }

    @Override
    public T divide(List<T> operands) throws UnsupportedOperationException {
        Iterator<T> iterator = operands.iterator();
        Integer result = iterator.next();

        while(iterator.hasNext()) {
            result /= iterator.next().intValue();
        }

        return (T)result;
    }
}
