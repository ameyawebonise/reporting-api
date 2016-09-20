/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.kaddiya.reporting.sql.commons.enums.OrgUserStatus;


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
public class OrgUser implements Serializable {

    private static final long serialVersionUID = 1340755355;

    private Integer       orgUserId;
    private Integer       organisationId;
    private Integer       userId;
    private Integer       roleId;
    private OrgUserStatus status;
    private Timestamp     createdOn;
    private Integer       createdBy;

    public OrgUser() {}

    public OrgUser(OrgUser value) {
        this.orgUserId = value.orgUserId;
        this.organisationId = value.organisationId;
        this.userId = value.userId;
        this.roleId = value.roleId;
        this.status = value.status;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
    }

    public OrgUser(
        Integer       orgUserId,
        Integer       organisationId,
        Integer       userId,
        Integer       roleId,
        OrgUserStatus status,
        Timestamp     createdOn,
        Integer       createdBy
    ) {
        this.orgUserId = orgUserId;
        this.organisationId = organisationId;
        this.userId = userId;
        this.roleId = roleId;
        this.status = status;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }

    public Integer getOrgUserId() {
        return this.orgUserId;
    }

    public void setOrgUserId(Integer orgUserId) {
        this.orgUserId = orgUserId;
    }

    public Integer getOrganisationId() {
        return this.organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public OrgUserStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrgUserStatus status) {
        this.status = status;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OrgUser other = (OrgUser) obj;
        if (orgUserId == null) {
            if (other.orgUserId != null)
                return false;
        }
        else if (!orgUserId.equals(other.orgUserId))
            return false;
        if (organisationId == null) {
            if (other.organisationId != null)
                return false;
        }
        else if (!organisationId.equals(other.organisationId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orgUserId == null) ? 0 : orgUserId.hashCode());
        result = prime * result + ((organisationId == null) ? 0 : organisationId.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
        result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrgUser (");

        sb.append(orgUserId);
        sb.append(", ").append(organisationId);
        sb.append(", ").append(userId);
        sb.append(", ").append(roleId);
        sb.append(", ").append(status);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);

        sb.append(")");
        return sb.toString();
    }
}
