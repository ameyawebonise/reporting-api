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
import org.kaddiya.reporting.sql.commons.tables.OrgKpiCombination;


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
public class OrgKpiCombinationRecord extends UpdatableRecordImpl<OrgKpiCombinationRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -509912353;

    /**
     * Setter for <code>proof.org_kpi_combination.ORG_KPI_COMBINATION_ID</code>.
     */
    public void setOrgKpiCombinationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>proof.org_kpi_combination.ORG_KPI_COMBINATION_ID</code>.
     */
    public Integer getOrgKpiCombinationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>proof.org_kpi_combination.ORGANISATION_ID</code>.
     */
    public void setOrganisationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>proof.org_kpi_combination.ORGANISATION_ID</code>.
     */
    public Integer getOrganisationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>proof.org_kpi_combination.KPI_COMBINATION_ID</code>.
     */
    public void setKpiCombinationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>proof.org_kpi_combination.KPI_COMBINATION_ID</code>.
     */
    public Integer getKpiCombinationId() {
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
        return OrgKpiCombination.ORG_KPI_COMBINATION.ORG_KPI_COMBINATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OrgKpiCombination.ORG_KPI_COMBINATION.ORGANISATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OrgKpiCombination.ORG_KPI_COMBINATION.KPI_COMBINATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrgKpiCombinationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOrganisationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getKpiCombinationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgKpiCombinationRecord value1(Integer value) {
        setOrgKpiCombinationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgKpiCombinationRecord value2(Integer value) {
        setOrganisationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgKpiCombinationRecord value3(Integer value) {
        setKpiCombinationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgKpiCombinationRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrgKpiCombinationRecord
     */
    public OrgKpiCombinationRecord() {
        super(OrgKpiCombination.ORG_KPI_COMBINATION);
    }

    /**
     * Create a detached, initialised OrgKpiCombinationRecord
     */
    public OrgKpiCombinationRecord(Integer orgKpiCombinationId, Integer organisationId, Integer kpiCombinationId) {
        super(OrgKpiCombination.ORG_KPI_COMBINATION);

        set(0, orgKpiCombinationId);
        set(1, organisationId);
        set(2, kpiCombinationId);
    }
}
