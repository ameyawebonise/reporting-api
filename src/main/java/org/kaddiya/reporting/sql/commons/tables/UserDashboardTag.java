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
import org.kaddiya.reporting.sql.commons.tables.records.UserDashboardTagRecord;


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
public class UserDashboardTag extends TableImpl<UserDashboardTagRecord> {

    private static final long serialVersionUID = 1241569650;

    /**
     * The reference instance of <code>proof.user_dashboard_tag</code>
     */
    public static final UserDashboardTag USER_DASHBOARD_TAG = new UserDashboardTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserDashboardTagRecord> getRecordType() {
        return UserDashboardTagRecord.class;
    }

    /**
     * The column <code>proof.user_dashboard_tag.USER_DASHBOARD_TAG_ID</code>.
     */
    public final TableField<UserDashboardTagRecord, Integer> USER_DASHBOARD_TAG_ID = createField("USER_DASHBOARD_TAG_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.user_dashboard_tag.USER_DASHBOARD_ID</code>.
     */
    public final TableField<UserDashboardTagRecord, Integer> USER_DASHBOARD_ID = createField("USER_DASHBOARD_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.user_dashboard_tag.TAG_ID</code>.
     */
    public final TableField<UserDashboardTagRecord, Integer> TAG_ID = createField("TAG_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>proof.user_dashboard_tag</code> table reference
     */
    public UserDashboardTag() {
        this("user_dashboard_tag", null);
    }

    /**
     * Create an aliased <code>proof.user_dashboard_tag</code> table reference
     */
    public UserDashboardTag(String alias) {
        this(alias, USER_DASHBOARD_TAG);
    }

    private UserDashboardTag(String alias, Table<UserDashboardTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserDashboardTag(String alias, Table<UserDashboardTagRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserDashboardTagRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_DASHBOARD_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserDashboardTagRecord> getPrimaryKey() {
        return Keys.KEY_USER_DASHBOARD_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserDashboardTagRecord>> getKeys() {
        return Arrays.<UniqueKey<UserDashboardTagRecord>>asList(Keys.KEY_USER_DASHBOARD_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserDashboardTagRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserDashboardTagRecord, ?>>asList(Keys.FK_USER_DASHBOARD_TAG_DASHBOARD_ID, Keys.FK_USER_DASHBOARD_TAG_TAG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDashboardTag as(String alias) {
        return new UserDashboardTag(alias, this);
    }

    /**
     * Rename this table
     */
    public UserDashboardTag rename(String name) {
        return new UserDashboardTag(name, null);
    }
}
