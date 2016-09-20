/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.kaddiya.reporting.sql.commons.enums.SubscriptionPlanStatus;
import org.kaddiya.reporting.sql.commons.tables.SubscriptionPlan;


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
public class SubscriptionPlanRecord extends UpdatableRecordImpl<SubscriptionPlanRecord> implements Record11<Integer, String, String, String, Integer, Integer, SubscriptionPlanStatus, Integer, Timestamp, Integer, Timestamp> {

    private static final long serialVersionUID = -1175433361;

    /**
     * Setter for <code>proof.subscription_plan.PLAN_ID</code>.
     */
    public void setPlanId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.PLAN_ID</code>.
     */
    public Integer getPlanId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>proof.subscription_plan.PLAN_CODE</code>.
     */
    public void setPlanCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.PLAN_CODE</code>.
     */
    public String getPlanCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>proof.subscription_plan.PLAN_NAME</code>.
     */
    public void setPlanName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.PLAN_NAME</code>.
     */
    public String getPlanName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>proof.subscription_plan.PLAN_DESCRIPTION</code>.
     */
    public void setPlanDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.PLAN_DESCRIPTION</code>.
     */
    public String getPlanDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>proof.subscription_plan.NUMBER_OF_DAYS</code>.
     */
    public void setNumberOfDays(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.NUMBER_OF_DAYS</code>.
     */
    public Integer getNumberOfDays() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>proof.subscription_plan.NUMBER_OF_CALCULATIONS</code>.
     */
    public void setNumberOfCalculations(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.NUMBER_OF_CALCULATIONS</code>.
     */
    public Integer getNumberOfCalculations() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>proof.subscription_plan.STATUS</code>.
     */
    public void setStatus(SubscriptionPlanStatus value) {
        set(6, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.STATUS</code>.
     */
    public SubscriptionPlanStatus getStatus() {
        return (SubscriptionPlanStatus) get(6);
    }

    /**
     * Setter for <code>proof.subscription_plan.CREATED_BY</code>.
     */
    public void setCreatedBy(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>proof.subscription_plan.CREATED_AT</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.CREATED_AT</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>proof.subscription_plan.UPDATED_BY</code>.
     */
    public void setUpdatedBy(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.UPDATED_BY</code>.
     */
    public Integer getUpdatedBy() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>proof.subscription_plan.UPDATED_AT</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>proof.subscription_plan.UPDATED_AT</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Integer, Integer, SubscriptionPlanStatus, Integer, Timestamp, Integer, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Integer, Integer, SubscriptionPlanStatus, Integer, Timestamp, Integer, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.PLAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.PLAN_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.PLAN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.PLAN_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.NUMBER_OF_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.NUMBER_OF_CALCULATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SubscriptionPlanStatus> field7() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SubscriptionPlan.SUBSCRIPTION_PLAN.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPlanCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlanName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPlanDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNumberOfDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getNumberOfCalculations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanStatus value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value1(Integer value) {
        setPlanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value2(String value) {
        setPlanCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value3(String value) {
        setPlanName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value4(String value) {
        setPlanDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value5(Integer value) {
        setNumberOfDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value6(Integer value) {
        setNumberOfCalculations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value7(SubscriptionPlanStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value8(Integer value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value9(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value10(Integer value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord value11(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionPlanRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, SubscriptionPlanStatus value7, Integer value8, Timestamp value9, Integer value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubscriptionPlanRecord
     */
    public SubscriptionPlanRecord() {
        super(SubscriptionPlan.SUBSCRIPTION_PLAN);
    }

    /**
     * Create a detached, initialised SubscriptionPlanRecord
     */
    public SubscriptionPlanRecord(Integer planId, String planCode, String planName, String planDescription, Integer numberOfDays, Integer numberOfCalculations, SubscriptionPlanStatus status, Integer createdBy, Timestamp createdAt, Integer updatedBy, Timestamp updatedAt) {
        super(SubscriptionPlan.SUBSCRIPTION_PLAN);

        set(0, planId);
        set(1, planCode);
        set(2, planName);
        set(3, planDescription);
        set(4, numberOfDays);
        set(5, numberOfCalculations);
        set(6, status);
        set(7, createdBy);
        set(8, createdAt);
        set(9, updatedBy);
        set(10, updatedAt);
    }
}
