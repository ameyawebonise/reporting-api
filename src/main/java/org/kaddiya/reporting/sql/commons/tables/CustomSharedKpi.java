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
import org.kaddiya.reporting.sql.commons.tables.records.CustomSharedKpiRecord;


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
public class CustomSharedKpi extends TableImpl<CustomSharedKpiRecord> {

    private static final long serialVersionUID = -49291182;

    /**
     * The reference instance of <code>proof.custom_shared_kpi</code>
     */
    public static final CustomSharedKpi CUSTOM_SHARED_KPI = new CustomSharedKpi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomSharedKpiRecord> getRecordType() {
        return CustomSharedKpiRecord.class;
    }

    /**
     * The column <code>proof.custom_shared_kpi.CUSTOM_SHARED_KPI_ID</code>.
     */
    public final TableField<CustomSharedKpiRecord, Integer> CUSTOM_SHARED_KPI_ID = createField("CUSTOM_SHARED_KPI_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.custom_shared_kpi.KPI_ID</code>.
     */
    public final TableField<CustomSharedKpiRecord, Integer> KPI_ID = createField("KPI_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.custom_shared_kpi.USER_ID</code>.
     */
    public final TableField<CustomSharedKpiRecord, Integer> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>proof.custom_shared_kpi</code> table reference
     */
    public CustomSharedKpi() {
        this("custom_shared_kpi", null);
    }

    /**
     * Create an aliased <code>proof.custom_shared_kpi</code> table reference
     */
    public CustomSharedKpi(String alias) {
        this(alias, CUSTOM_SHARED_KPI);
    }

    private CustomSharedKpi(String alias, Table<CustomSharedKpiRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomSharedKpi(String alias, Table<CustomSharedKpiRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CustomSharedKpiRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CUSTOM_SHARED_KPI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomSharedKpiRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOM_SHARED_KPI_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomSharedKpiRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomSharedKpiRecord>>asList(Keys.KEY_CUSTOM_SHARED_KPI_PRIMARY, Keys.KEY_CUSTOM_SHARED_KPI_UNIQUE_KEY_ON_USER_ID_AND_KPI_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CustomSharedKpiRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CustomSharedKpiRecord, ?>>asList(Keys.FK_CUSTOM_SHARED_KPI_KPI_ID, Keys.FK_CUSTOM_SHARED_KPI_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomSharedKpi as(String alias) {
        return new CustomSharedKpi(alias, this);
    }

    /**
     * Rename this table
     */
    public CustomSharedKpi rename(String name) {
        return new CustomSharedKpi(name, null);
    }
}
