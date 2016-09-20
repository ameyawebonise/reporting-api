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
import org.kaddiya.reporting.sql.commons.tables.records.OrgDataSetRecord;


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
public class OrgDataSet extends TableImpl<OrgDataSetRecord> {

    private static final long serialVersionUID = -639317821;

    /**
     * The reference instance of <code>proof.org_data_set</code>
     */
    public static final OrgDataSet ORG_DATA_SET = new OrgDataSet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrgDataSetRecord> getRecordType() {
        return OrgDataSetRecord.class;
    }

    /**
     * The column <code>proof.org_data_set.ORG_DATA_SET_ID</code>.
     */
    public final TableField<OrgDataSetRecord, Integer> ORG_DATA_SET_ID = createField("ORG_DATA_SET_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.org_data_set.ORGANISATION_ID</code>.
     */
    public final TableField<OrgDataSetRecord, Integer> ORGANISATION_ID = createField("ORGANISATION_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.org_data_set.DATA_SET_ID</code>.
     */
    public final TableField<OrgDataSetRecord, Integer> DATA_SET_ID = createField("DATA_SET_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>proof.org_data_set</code> table reference
     */
    public OrgDataSet() {
        this("org_data_set", null);
    }

    /**
     * Create an aliased <code>proof.org_data_set</code> table reference
     */
    public OrgDataSet(String alias) {
        this(alias, ORG_DATA_SET);
    }

    private OrgDataSet(String alias, Table<OrgDataSetRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrgDataSet(String alias, Table<OrgDataSetRecord> aliased, Field<?>[] parameters) {
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
    public Identity<OrgDataSetRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORG_DATA_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrgDataSetRecord> getPrimaryKey() {
        return Keys.KEY_ORG_DATA_SET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrgDataSetRecord>> getKeys() {
        return Arrays.<UniqueKey<OrgDataSetRecord>>asList(Keys.KEY_ORG_DATA_SET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrgDataSetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrgDataSetRecord, ?>>asList(Keys.FK_ORG_DATA_SET_ORGANISATION_ID, Keys.FK_ORG_DATA_SET_DATA_SET_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgDataSet as(String alias) {
        return new OrgDataSet(alias, this);
    }

    /**
     * Rename this table
     */
    public OrgDataSet rename(String name) {
        return new OrgDataSet(name, null);
    }
}
