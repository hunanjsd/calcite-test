package com.jsd.bigdaa.calcite.csv;

import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.Enumerator;

import java.util.Iterator;

/**
 * @description: TODO 类描述
 * @author: jiangsd3
 **/
public class CsvEnumerable<T> implements Enumerator<T> {

    @Override
    public T current() {
        return null;
    }

    @Override
    public boolean moveNext() {
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void close() {

    }
}
