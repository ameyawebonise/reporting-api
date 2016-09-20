/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.kaddiya.reporting.sql.commons.enums.TagStatus;
import org.kaddiya.reporting.sql.commons.tables.Tag;


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
public class TagRecord extends UpdatableRecordImpl<TagRecord> implements Record5<Integer, String, String, TagStatus, Timestamp> {

    private static final long serialVersionUID = 1008019312;

    /**
     * Setter for <code>proof.tag.TAG_ID</code>.
     */
    public void setTagId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>proof.tag.TAG_ID</code>.
     */
    public Integer getTagId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>proof.tag.TAG_NAME</code>.
     */
    public void setTagName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>proof.tag.TAG_NAME</code>.
     */
    public String getTagName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>proof.tag.TAG_DESCRIPTION</code>.
     */
    public void setTagDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>proof.tag.TAG_DESCRIPTION</code>.
     */
    public String getTagDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>proof.tag.STATUS</code>.
     */
    public void setStatus(TagStatus value) {
        set(3, value);
    }

    /**
     * Getter for <code>proof.tag.STATUS</code>.
     */
    public TagStatus getStatus() {
        return (TagStatus) get(3);
    }

    /**
     * Setter for <code>proof.tag.CREATED_ON</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>proof.tag.CREATED_ON</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, TagStatus, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, TagStatus, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tag.TAG.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tag.TAG.TAG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tag.TAG.TAG_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TagStatus> field4() {
        return Tag.TAG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Tag.TAG.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTagName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTagDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagStatus value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value1(Integer value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value2(String value) {
        setTagName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value3(String value) {
        setTagDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value4(TagStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord values(Integer value1, String value2, String value3, TagStatus value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TagRecord
     */
    public TagRecord() {
        super(Tag.TAG);
    }

    /**
     * Create a detached, initialised TagRecord
     */
    public TagRecord(Integer tagId, String tagName, String tagDescription, TagStatus status, Timestamp createdOn) {
        super(Tag.TAG);

        set(0, tagId);
        set(1, tagName);
        set(2, tagDescription);
        set(3, status);
        set(4, createdOn);
    }
}
