/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class OrgTag implements Serializable {

    private static final long serialVersionUID = -64798866;

    private Integer orgTagId;
    private Integer organisationId;
    private Integer tagId;

    public OrgTag() {}

    public OrgTag(OrgTag value) {
        this.orgTagId = value.orgTagId;
        this.organisationId = value.organisationId;
        this.tagId = value.tagId;
    }

    public OrgTag(
        Integer orgTagId,
        Integer organisationId,
        Integer tagId
    ) {
        this.orgTagId = orgTagId;
        this.organisationId = organisationId;
        this.tagId = tagId;
    }

    public Integer getOrgTagId() {
        return this.orgTagId;
    }

    public void setOrgTagId(Integer orgTagId) {
        this.orgTagId = orgTagId;
    }

    public Integer getOrganisationId() {
        return this.organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    public Integer getTagId() {
        return this.tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OrgTag other = (OrgTag) obj;
        if (orgTagId == null) {
            if (other.orgTagId != null)
                return false;
        }
        else if (!orgTagId.equals(other.orgTagId))
            return false;
        if (organisationId == null) {
            if (other.organisationId != null)
                return false;
        }
        else if (!organisationId.equals(other.organisationId))
            return false;
        if (tagId == null) {
            if (other.tagId != null)
                return false;
        }
        else if (!tagId.equals(other.tagId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orgTagId == null) ? 0 : orgTagId.hashCode());
        result = prime * result + ((organisationId == null) ? 0 : organisationId.hashCode());
        result = prime * result + ((tagId == null) ? 0 : tagId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrgTag (");

        sb.append(orgTagId);
        sb.append(", ").append(organisationId);
        sb.append(", ").append(tagId);

        sb.append(")");
        return sb.toString();
    }
}
