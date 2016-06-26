package com.valeriy.job.task_for_labix.expression;

import java.util.List;

/**
 * Created by Valeriy on 26/6/2016.
 */
public class StringExpression<T extends String> implements Expression<T> {
    @Override
    public T add(List<T> operands) throws UnsupportedOperationException {
        StringBuilder builder = new StringBuilder();
        for (T operand : operands) {
            builder.append(operand);
        }

        return (T) builder.toString();
    }

    @Override
    public T subtract(List<T> operands) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public T multiply(List<T> operands) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public T divide(List<T> operands) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
