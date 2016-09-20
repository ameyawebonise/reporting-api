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
import org.kaddiya.reporting.sql.commons.enums.SubscriptionPlanStatus;
import org.kaddiya.reporting.sql.commons.tables.records.SubscriptionPlanRecord;


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
public class SubscriptionPlan extends TableImpl<SubscriptionPlanRecord> {

    private static final long serialVersionUID = -1806851267;

    /**
     * The reference instance of <code>proof.subscription_plan</code>
     */
    public static final SubscriptionPlan SUBSCRIPTION_PLAN = new SubscriptionPlan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubscriptionPlanRecord> getRecordType() {
        return SubscriptionPlanRecord.class;
    }

    /**
     * The column <code>proof.subscription_plan.PLAN_ID</code>.
     */
    public final TableField<SubscriptionPlanRecord, Integer> PLAN_ID = createField("PLAN_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.subscription_plan.PLAN_CODE</code>.
     */
    public final TableField<SubscriptionPlanRecord, String> PLAN_CODE = createField("PLAN_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

    /**
     * The column <code>proof.subscription_plan.PLAN_NAME</code>.
     */
    public final TableField<SubscriptionPlanRecord, String> PLAN_NAME = createField("PLAN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>proof.subscription_plan.PLAN_DESCRIPTION</code>.
     */
    public final TableField<SubscriptionPlanRecord, String> PLAN_DESCRIPTION = createField("PLAN_DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>proof.subscription_plan.NUMBER_OF_DAYS</code>.
     */
    public final TableField<SubscriptionPlanRecord, Integer> NUMBER_OF_DAYS = createField("NUMBER_OF_DAYS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.subscription_plan.NUMBER_OF_CALCULATIONS</code>.
     */
    public final TableField<SubscriptionPlanRecord, Integer> NUMBER_OF_CALCULATIONS = createField("NUMBER_OF_CALCULATIONS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.subscription_plan.STATUS</code>.
     */
    public final TableField<SubscriptionPlanRecord, SubscriptionPlanStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.kaddiya.reporting.sql.commons.enums.SubscriptionPlanStatus.class), this, "");

    /**
     * The column <code>proof.subscription_plan.CREATED_BY</code>.
     */
    public final TableField<SubscriptionPlanRecord, Integer> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.subscription_plan.CREATED_AT</code>.
     */
    public final TableField<SubscriptionPlanRecord, Timestamp> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>proof.subscription_plan.UPDATED_BY</code>.
     */
    public final TableField<SubscriptionPlanRecord, Integer> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>proof.subscription_plan.UPDATED_AT</code>.
     */
    public final TableField<SubscriptionPlanRecord, Timestamp> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>proof.subscription_plan</code> table reference
     */
    public SubscriptionPlan() {
        this("subscription_plan", null);
    }

    /**
     * Create an aliased <code>proof.subscription_plan</code> table reference
     */
    public SubscriptionPlan(String alias) {
        this(alias, SUBSCRIPTION_PLAN);
    }

    private SubscriptionPlan(String alias, Table<SubscriptionPlanRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubscriptionPlan(String alias, Table<SubscriptionPlanRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubscriptionPlanRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUBSCRIPTION_PLAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubscriptionPlanRecord> getPrimaryKey() {
        return Keys.KEY_SUBSCRIPTION_PLAN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubscriptionPlanRecord>> getKeys() {
        return Arrays.<UniqueKey<SubscriptionPlanRecord>>asList(Keys.KEY_SUBSCRIPTION_PLAN_PRIMARY, Keys.KEY_SUBSCRIPTION_PLAN_PLAN_CODE, Keys.KEY_SUBSCRIPTION_PLAN_PLAN_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SubscriptionPlanRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SubscriptionPlanRecord, ?>>asList(Keys.FK_PLAN_USER_ID, Keys.FK_PLAN_UPDATED_BY_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlan as(String alias) {
        return new SubscriptionPlan(alias, this);
    }

    /**
     * Rename this table
     */
    public SubscriptionPlan rename(String name) {
        return new SubscriptionPlan(name, null);
    }
}
