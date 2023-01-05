/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the enrollment status of an organization's member accounts in Compute Optimizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/AccountEnrollmentStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountEnrollmentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The account enrollment status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the account enrollment status.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEnrollmentStatus withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The account enrollment status.
     * </p>
     * 
     * @param status
     *        The account enrollment status.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The account enrollment status.
     * </p>
     * 
     * @return The account enrollment status.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The account enrollment status.
     * </p>
     * 
     * @param status
     *        The account enrollment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AccountEnrollmentStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The account enrollment status.
     * </p>
     * 
     * @param status
     *        The account enrollment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AccountEnrollmentStatus withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the account enrollment status.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     * 
     * @param statusReason
     *        The reason for the account enrollment status.</p>
     *        <p>
     *        For example, an account might show a status of <code>Pending</code> because member accounts of an
     *        organization require more time to be enrolled in the service.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the account enrollment status.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     * 
     * @return The reason for the account enrollment status.</p>
     *         <p>
     *         For example, an account might show a status of <code>Pending</code> because member accounts of an
     *         organization require more time to be enrolled in the service.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the account enrollment status.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     * 
     * @param statusReason
     *        The reason for the account enrollment status.</p>
     *        <p>
     *        For example, an account might show a status of <code>Pending</code> because member accounts of an
     *        organization require more time to be enrolled in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEnrollmentStatus withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     * </p>
     * 
     * @return The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEnrollmentStatus withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountEnrollmentStatus == false)
            return false;
        AccountEnrollmentStatus other = (AccountEnrollmentStatus) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AccountEnrollmentStatus clone() {
        try {
            return (AccountEnrollmentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.AccountEnrollmentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
