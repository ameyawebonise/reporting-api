/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables;


import java.sql.Timestamp;
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
import org.kaddiya.reporting.sql.commons.enums.OrganisationStatus;
import org.kaddiya.reporting.sql.commons.tables.records.OrganisationRecord;


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
public class Organisation extends TableImpl<OrganisationRecord> {

    private static final long serialVersionUID = -344818336;

    /**
     * The reference instance of <code>proof.organisation</code>
     */
    public static final Organisation ORGANISATION = new Organisation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganisationRecord> getRecordType() {
        return OrganisationRecord.class;
    }

    /**
     * The column <code>proof.organisation.ORGANISATION_ID</code>.
     */
    public final TableField<OrganisationRecord, Integer> ORGANISATION_ID = createField("ORGANISATION_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.organisation.ORGANISATION_NAME</code>.
     */
    public final TableField<OrganisationRecord, String> ORGANISATION_NAME = createField("ORGANISATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>proof.organisation.FISCAL_YEAR_START</code>.
     */
    public final TableField<OrganisationRecord, String> FISCAL_YEAR_START = createField("FISCAL_YEAR_START", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>proof.organisation.FISCAL_YEAR_END</code>.
     */
    public final TableField<OrganisationRecord, String> FISCAL_YEAR_END = createField("FISCAL_YEAR_END", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>proof.organisation.CREATED_ON</code>.
     */
    public final TableField<OrganisationRecord, Timestamp> CREATED_ON = createField("CREATED_ON", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>proof.organisation.STATUS</code>.
     */
    public final TableField<OrganisationRecord, OrganisationStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.kaddiya.reporting.sql.commons.enums.OrganisationStatus.class), this, "");

    /**
     * The column <code>proof.organisation.CREATED_BY</code>.
     */
    public final TableField<OrganisationRecord, Integer> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>proof.organisation</code> table reference
     */
    public Organisation() {
        this("organisation", null);
    }

    /**
     * Create an aliased <code>proof.organisation</code> table reference
     */
    public Organisation(String alias) {
        this(alias, ORGANISATION);
    }

    private Organisation(String alias, Table<OrganisationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organisation(String alias, Table<OrganisationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<OrganisationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORGANISATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrganisationRecord> getPrimaryKey() {
        return Keys.KEY_ORGANISATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrganisationRecord>> getKeys() {
        return Arrays.<UniqueKey<OrganisationRecord>>asList(Keys.KEY_ORGANISATION_PRIMARY, Keys.KEY_ORGANISATION_ORGANISATION_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrganisationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrganisationRecord, ?>>asList(Keys.FK_ORGANISATION_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Organisation as(String alias) {
        return new Organisation(alias, this);
    }

    /**
     * Rename this table
     */
    public Organisation rename(String name) {
        return new Organisation(name, null);
    }
}
