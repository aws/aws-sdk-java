/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a Bonus payment paid to a Worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/BonusPayment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BonusPayment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Worker to whom the bonus was paid.
     * </p>
     */
    private String workerId;

    private String bonusAmount;
    /**
     * <p>
     * The ID of the assignment associated with this bonus payment.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * The Reason text given when the bonus was granted, if any.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The date and time of when the bonus was granted.
     * </p>
     */
    private java.util.Date grantTime;

    /**
     * <p>
     * The ID of the Worker to whom the bonus was paid.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker to whom the bonus was paid.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker to whom the bonus was paid.
     * </p>
     * 
     * @return The ID of the Worker to whom the bonus was paid.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker to whom the bonus was paid.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker to whom the bonus was paid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BonusPayment withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * @param bonusAmount
     */

    public void setBonusAmount(String bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    /**
     * @return
     */

    public String getBonusAmount() {
        return this.bonusAmount;
    }

    /**
     * @param bonusAmount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BonusPayment withBonusAmount(String bonusAmount) {
        setBonusAmount(bonusAmount);
        return this;
    }

    /**
     * <p>
     * The ID of the assignment associated with this bonus payment.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment associated with this bonus payment.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment associated with this bonus payment.
     * </p>
     * 
     * @return The ID of the assignment associated with this bonus payment.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment associated with this bonus payment.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment associated with this bonus payment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BonusPayment withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * The Reason text given when the bonus was granted, if any.
     * </p>
     * 
     * @param reason
     *        The Reason text given when the bonus was granted, if any.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The Reason text given when the bonus was granted, if any.
     * </p>
     * 
     * @return The Reason text given when the bonus was granted, if any.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The Reason text given when the bonus was granted, if any.
     * </p>
     * 
     * @param reason
     *        The Reason text given when the bonus was granted, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BonusPayment withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The date and time of when the bonus was granted.
     * </p>
     * 
     * @param grantTime
     *        The date and time of when the bonus was granted.
     */

    public void setGrantTime(java.util.Date grantTime) {
        this.grantTime = grantTime;
    }

    /**
     * <p>
     * The date and time of when the bonus was granted.
     * </p>
     * 
     * @return The date and time of when the bonus was granted.
     */

    public java.util.Date getGrantTime() {
        return this.grantTime;
    }

    /**
     * <p>
     * The date and time of when the bonus was granted.
     * </p>
     * 
     * @param grantTime
     *        The date and time of when the bonus was granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BonusPayment withGrantTime(java.util.Date grantTime) {
        setGrantTime(grantTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getBonusAmount() != null)
            sb.append("BonusAmount: ").append(getBonusAmount()).append(",");
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getGrantTime() != null)
            sb.append("GrantTime: ").append(getGrantTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BonusPayment == false)
            return false;
        BonusPayment other = (BonusPayment) obj;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getBonusAmount() == null ^ this.getBonusAmount() == null)
            return false;
        if (other.getBonusAmount() != null && other.getBonusAmount().equals(this.getBonusAmount()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getGrantTime() == null ^ this.getGrantTime() == null)
            return false;
        if (other.getGrantTime() != null && other.getGrantTime().equals(this.getGrantTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getBonusAmount() == null) ? 0 : getBonusAmount().hashCode());
        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getGrantTime() == null) ? 0 : getGrantTime().hashCode());
        return hashCode;
    }

    @Override
    public BonusPayment clone() {
        try {
            return (BonusPayment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.BonusPaymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
