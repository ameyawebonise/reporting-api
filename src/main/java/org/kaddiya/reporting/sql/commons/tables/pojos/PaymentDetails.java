/**
 * This class is generated by jOOQ
 */
package org.kaddiya.reporting.sql.commons.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.kaddiya.reporting.sql.commons.enums.PaymentDetailsStatus;


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
public class PaymentDetails implements Serializable {

    private static final long serialVersionUID = 926549123;

    private Integer              paymentDetailsId;
    private Integer              paymentModeId;
    private Integer              orgPlanId;
    private Integer              createdByUserId;
    private Timestamp            createdOn;
    private PaymentDetailsStatus status;

    public PaymentDetails() {}

    public PaymentDetails(PaymentDetails value) {
        this.paymentDetailsId = value.paymentDetailsId;
        this.paymentModeId = value.paymentModeId;
        this.orgPlanId = value.orgPlanId;
        this.createdByUserId = value.createdByUserId;
        this.createdOn = value.createdOn;
        this.status = value.status;
    }

    public PaymentDetails(
        Integer              paymentDetailsId,
        Integer              paymentModeId,
        Integer              orgPlanId,
        Integer              createdByUserId,
        Timestamp            createdOn,
        PaymentDetailsStatus status
    ) {
        this.paymentDetailsId = paymentDetailsId;
        this.paymentModeId = paymentModeId;
        this.orgPlanId = orgPlanId;
        this.createdByUserId = createdByUserId;
        this.createdOn = createdOn;
        this.status = status;
    }

    public Integer getPaymentDetailsId() {
        return this.paymentDetailsId;
    }

    public void setPaymentDetailsId(Integer paymentDetailsId) {
        this.paymentDetailsId = paymentDetailsId;
    }

    public Integer getPaymentModeId() {
        return this.paymentModeId;
    }

    public void setPaymentModeId(Integer paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public Integer getOrgPlanId() {
        return this.orgPlanId;
    }

    public void setOrgPlanId(Integer orgPlanId) {
        this.orgPlanId = orgPlanId;
    }

    public Integer getCreatedByUserId() {
        return this.createdByUserId;
    }

    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public PaymentDetailsStatus getStatus() {
        return this.status;
    }

    public void setStatus(PaymentDetailsStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PaymentDetails other = (PaymentDetails) obj;
        if (paymentDetailsId == null) {
            if (other.paymentDetailsId != null)
                return false;
        }
        else if (!paymentDetailsId.equals(other.paymentDetailsId))
            return false;
        if (paymentModeId == null) {
            if (other.paymentModeId != null)
                return false;
        }
        else if (!paymentModeId.equals(other.paymentModeId))
            return false;
        if (orgPlanId == null) {
            if (other.orgPlanId != null)
                return false;
        }
        else if (!orgPlanId.equals(other.orgPlanId))
            return false;
        if (createdByUserId == null) {
            if (other.createdByUserId != null)
                return false;
        }
        else if (!createdByUserId.equals(other.createdByUserId))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((paymentDetailsId == null) ? 0 : paymentDetailsId.hashCode());
        result = prime * result + ((paymentModeId == null) ? 0 : paymentModeId.hashCode());
        result = prime * result + ((orgPlanId == null) ? 0 : orgPlanId.hashCode());
        result = prime * result + ((createdByUserId == null) ? 0 : createdByUserId.hashCode());
        result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentDetails (");

        sb.append(paymentDetailsId);
        sb.append(", ").append(paymentModeId);
        sb.append(", ").append(orgPlanId);
        sb.append(", ").append(createdByUserId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
