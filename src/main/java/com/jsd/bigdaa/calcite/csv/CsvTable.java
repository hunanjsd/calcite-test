package com.jsd.bigdaa.calcite.csv;

import org.apache.calcite.DataContext;
import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.schema.ScannableTable;
import org.apache.calcite.schema.impl.AbstractTable;

/**
 * @description: TODO 类描述
 * @author: jiangsd3
 **/
public class CsvTable extends AbstractTable implements ScannableTable {
    @Override
    public RelDataType getRowType(RelDataTypeFactory typeFactory) {
        return null;
    }

    @Override
    public Enumerable<Object[]> scan(DataContext root) {
        return null;
    }
}
