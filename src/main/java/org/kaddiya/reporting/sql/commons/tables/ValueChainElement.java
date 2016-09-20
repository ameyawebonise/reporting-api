/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.kaddiya.reporting.sql.commons.Keys;
import org.kaddiya.reporting.sql.commons.Proof;
import org.kaddiya.reporting.sql.commons.tables.records.ValueChainElementRecord;


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
public class ValueChainElement extends TableImpl<ValueChainElementRecord> {

    private static final long serialVersionUID = -364218640;

    /**
     * The reference instance of <code>proof.value_chain_element</code>
     */
    public static final ValueChainElement VALUE_CHAIN_ELEMENT = new ValueChainElement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ValueChainElementRecord> getRecordType() {
        return ValueChainElementRecord.class;
    }

    /**
     * The column <code>proof.value_chain_element.VALUE_CHAIN_ELEMENT_ID</code>.
     */
    public final TableField<ValueChainElementRecord, Integer> VALUE_CHAIN_ELEMENT_ID = createField("VALUE_CHAIN_ELEMENT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.value_chain_element.VALUE_CHAIN_ID</code>.
     */
    public final TableField<ValueChainElementRecord, Integer> VALUE_CHAIN_ID = createField("VALUE_CHAIN_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.value_chain_element.KPI_ID</code>.
     */
    public final TableField<ValueChainElementRecord, Integer> KPI_ID = createField("KPI_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.value_chain_element.TIME_SERIES</code>.
     */
    public final TableField<ValueChainElementRecord, String> TIME_SERIES = createField("TIME_SERIES", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>proof.value_chain_element.X_POSITION</code>.
     */
    public final TableField<ValueChainElementRecord, Integer> X_POSITION = createField("X_POSITION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.value_chain_element.Y_POSITION</code>.
     */
    public final TableField<ValueChainElementRecord, Integer> Y_POSITION = createField("Y_POSITION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>proof.value_chain_element</code> table reference
     */
    public ValueChainElement() {
        this("value_chain_element", null);
    }

    /**
     * Create an aliased <code>proof.value_chain_element</code> table reference
     */
    public ValueChainElement(String alias) {
        this(alias, VALUE_CHAIN_ELEMENT);
    }

    private ValueChainElement(String alias, Table<ValueChainElementRecord> aliased) {
        this(alias, aliased, null);
    }

    private ValueChainElement(String alias, Table<ValueChainElementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Proof.PROOF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ValueChainElementRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VALUE_CHAIN_ELEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ValueChainElementRecord> getPrimaryKey() {
        return Keys.KEY_VALUE_CHAIN_ELEMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ValueChainElementRecord>> getKeys() {
        return Arrays.<UniqueKey<ValueChainElementRecord>>asList(Keys.KEY_VALUE_CHAIN_ELEMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ValueChainElementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ValueChainElementRecord, ?>>asList(Keys.FK_VALUE_CHAIN_ID, Keys.FK_VALUE_CHAIN_ELEMENT_KPI_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValueChainElement as(String alias) {
        return new ValueChainElement(alias, this);
    }

    /**
     * Rename this table
     */
    public ValueChainElement rename(String name) {
        return new ValueChainElement(name, null);
    }
}
