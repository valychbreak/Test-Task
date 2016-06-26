package com.valeriy.job.task_for_labix.expression;

import java.util.List;

/**
 * Created by Valeriy on 26/6/2016.
 */
public interface Expression<T> {
    T add(List<T> operands) throws UnsupportedOperationException;
    T subtract(List<T> operands) throws UnsupportedOperationException;
    T multiply(List<T> operands) throws UnsupportedOperationException;
    T divide(List<T> operands) throws UnsupportedOperationException;
}
