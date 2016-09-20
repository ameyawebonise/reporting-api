/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.kaddiya.reporting.sql.commons.tables.OrgUserDetails;


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
public class OrgUserDetailsRecord extends UpdatableRecordImpl<OrgUserDetailsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1344123949;

    /**
     * Setter for <code>proof.org_user_details.ORG_USER_DETAILS_ID</code>.
     */
    public void setOrgUserDetailsId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>proof.org_user_details.ORG_USER_DETAILS_ID</code>.
     */
    public Integer getOrgUserDetailsId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>proof.org_user_details.ORG_USER_ID</code>.
     */
    public void setOrgUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>proof.org_user_details.ORG_USER_ID</code>.
     */
    public Integer getOrgUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>proof.org_user_details.ALLOTED_CALCULATIONS</code>.
     */
    public void setAllotedCalculations(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>proof.org_user_details.ALLOTED_CALCULATIONS</code>.
     */
    public Integer getAllotedCalculations() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OrgUserDetails.ORG_USER_DETAILS.ORG_USER_DETAILS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OrgUserDetails.ORG_USER_DETAILS.ORG_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OrgUserDetails.ORG_USER_DETAILS.ALLOTED_CALCULATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrgUserDetailsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOrgUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAllotedCalculations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgUserDetailsRecord value1(Integer value) {
        setOrgUserDetailsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgUserDetailsRecord value2(Integer value) {
        setOrgUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgUserDetailsRecord value3(Integer value) {
        setAllotedCalculations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgUserDetailsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrgUserDetailsRecord
     */
    public OrgUserDetailsRecord() {
        super(OrgUserDetails.ORG_USER_DETAILS);
    }

    /**
     * Create a detached, initialised OrgUserDetailsRecord
     */
    public OrgUserDetailsRecord(Integer orgUserDetailsId, Integer orgUserId, Integer allotedCalculations) {
        super(OrgUserDetails.ORG_USER_DETAILS);

        set(0, orgUserDetailsId);
        set(1, orgUserId);
        set(2, allotedCalculations);
    }
}
