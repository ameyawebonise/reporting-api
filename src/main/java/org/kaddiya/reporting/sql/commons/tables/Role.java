/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.kaddiya.reporting.sql.commons.Keys;
import org.kaddiya.reporting.sql.commons.Proof;
import org.kaddiya.reporting.sql.commons.tables.records.RoleRecord;


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
public class Role extends TableImpl<RoleRecord> {

    private static final long serialVersionUID = -1726807161;

    /**
     * The reference instance of <code>proof.role</code>
     */
    public static final Role ROLE = new Role();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRecord> getRecordType() {
        return RoleRecord.class;
    }

    /**
     * The column <code>proof.role.ROLE_ID</code>.
     */
    public final TableField<RoleRecord, Integer> ROLE_ID = createField("ROLE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>proof.role.ROLE_NAME</code>.
     */
    public final TableField<RoleRecord, String> ROLE_NAME = createField("ROLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * Create a <code>proof.role</code> table reference
     */
    public Role() {
        this("role", null);
    }

    /**
     * Create an aliased <code>proof.role</code> table reference
     */
    public Role(String alias) {
        this(alias, ROLE);
    }

    private Role(String alias, Table<RoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Role(String alias, Table<RoleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<RoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RoleRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RoleRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleRecord>>asList(Keys.KEY_ROLE_PRIMARY, Keys.KEY_ROLE_ROLE_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Role as(String alias) {
        return new Role(alias, this);
    }

    /**
     * Rename this table
     */
    public Role rename(String name) {
        return new Role(name, null);
    }
}
