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
import org.kaddiya.reporting.sql.commons.tables.records.KpiTagRecord;


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
public class KpiTag extends TableImpl<KpiTagRecord> {

    private static final long serialVersionUID = 474629876;

    /**
     * The reference instance of <code>proof.kpi_tag</code>
     */
    public static final KpiTag KPI_TAG = new KpiTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KpiTagRecord> getRecordType() {
        return KpiTagRecord.class;
    }

    /**
     * The column <code>proof.kpi_tag.KPI_TAG_ID</code>.
     */
    public final TableField<KpiTagRecord, Integer> KPI_TAG_ID = createField("KPI_TAG_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.kpi_tag.KPI_ID</code>.
     */
    public final TableField<KpiTagRecord, Integer> KPI_ID = createField("KPI_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.kpi_tag.TAG_ID</code>.
     */
    public final TableField<KpiTagRecord, Integer> TAG_ID = createField("TAG_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>proof.kpi_tag</code> table reference
     */
    public KpiTag() {
        this("kpi_tag", null);
    }

    /**
     * Create an aliased <code>proof.kpi_tag</code> table reference
     */
    public KpiTag(String alias) {
        this(alias, KPI_TAG);
    }

    private KpiTag(String alias, Table<KpiTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private KpiTag(String alias, Table<KpiTagRecord> aliased, Field<?>[] parameters) {
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
    public Identity<KpiTagRecord, Integer> getIdentity() {
        return Keys.IDENTITY_KPI_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<KpiTagRecord> getPrimaryKey() {
        return Keys.KEY_KPI_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<KpiTagRecord>> getKeys() {
        return Arrays.<UniqueKey<KpiTagRecord>>asList(Keys.KEY_KPI_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<KpiTagRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<KpiTagRecord, ?>>asList(Keys.FK_KPI_TAG_KPI_ID, Keys.FK_KPI_TAG_TAG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KpiTag as(String alias) {
        return new KpiTag(alias, this);
    }

    /**
     * Rename this table
     */
    public KpiTag rename(String name) {
        return new KpiTag(name, null);
    }
}
