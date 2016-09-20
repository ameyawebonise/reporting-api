/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.enums;


import javax.annotation.Generated;

import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum DataSetTimeseriesInterval implements EnumType {

    DAILY("DAILY"),

    WEEKLY("WEEKLY"),

    MONTHLY("MONTHLY"),

    QUARTERLY("QUARTERLY"),

    BI_ANNUAL("BI_ANNUAL"),

    YEARLY("YEARLY");

    private final String literal;

    private DataSetTimeseriesInterval(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "data_set_TIMESERIES_INTERVAL";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
