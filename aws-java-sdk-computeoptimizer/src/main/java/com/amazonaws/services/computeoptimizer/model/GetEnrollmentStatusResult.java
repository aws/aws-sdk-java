/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnrollmentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The enrollment status of the account.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the enrollment status of the account.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Confirms the enrollment status of member accounts within the organization, if the account is a master account of
     * an organization.
     * </p>
     */
    private Boolean memberAccountsEnrolled;

    /**
     * <p>
     * The enrollment status of the account.
     * </p>
     * 
     * @param status
     *        The enrollment status of the account.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The enrollment status of the account.
     * </p>
     * 
     * @return The enrollment status of the account.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The enrollment status of the account.
     * </p>
     * 
     * @param status
     *        The enrollment status of the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetEnrollmentStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The enrollment status of the account.
     * </p>
     * 
     * @param status
     *        The enrollment status of the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetEnrollmentStatusResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the enrollment status of the account.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     * 
     * @param statusReason
     *        The reason for the enrollment status of the account.</p>
     *        <p>
     *        For example, an account might show a status of <code>Pending</code> because member accounts of an
     *        organization require more time to be enrolled in the service.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the enrollment status of the account.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     * 
     * @return The reason for the enrollment status of the account.</p>
     *         <p>
     *         For example, an account might show a status of <code>Pending</code> because member accounts of an
     *         organization require more time to be enrolled in the service.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the enrollment status of the account.
     * </p>
     * <p>
     * For example, an account might show a status of <code>Pending</code> because member accounts of an organization
     * require more time to be enrolled in the service.
     * </p>
     * 
     * @param statusReason
     *        The reason for the enrollment status of the account.</p>
     *        <p>
     *        For example, an account might show a status of <code>Pending</code> because member accounts of an
     *        organization require more time to be enrolled in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnrollmentStatusResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Confirms the enrollment status of member accounts within the organization, if the account is a master account of
     * an organization.
     * </p>
     * 
     * @param memberAccountsEnrolled
     *        Confirms the enrollment status of member accounts within the organization, if the account is a master
     *        account of an organization.
     */

    public void setMemberAccountsEnrolled(Boolean memberAccountsEnrolled) {
        this.memberAccountsEnrolled = memberAccountsEnrolled;
    }

    /**
     * <p>
     * Confirms the enrollment status of member accounts within the organization, if the account is a master account of
     * an organization.
     * </p>
     * 
     * @return Confirms the enrollment status of member accounts within the organization, if the account is a master
     *         account of an organization.
     */

    public Boolean getMemberAccountsEnrolled() {
        return this.memberAccountsEnrolled;
    }

    /**
     * <p>
     * Confirms the enrollment status of member accounts within the organization, if the account is a master account of
     * an organization.
     * </p>
     * 
     * @param memberAccountsEnrolled
     *        Confirms the enrollment status of member accounts within the organization, if the account is a master
     *        account of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnrollmentStatusResult withMemberAccountsEnrolled(Boolean memberAccountsEnrolled) {
        setMemberAccountsEnrolled(memberAccountsEnrolled);
        return this;
    }

    /**
     * <p>
     * Confirms the enrollment status of member accounts within the organization, if the account is a master account of
     * an organization.
     * </p>
     * 
     * @return Confirms the enrollment status of member accounts within the organization, if the account is a master
     *         account of an organization.
     */

    public Boolean isMemberAccountsEnrolled() {
        return this.memberAccountsEnrolled;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getMemberAccountsEnrolled() != null)
            sb.append("MemberAccountsEnrolled: ").append(getMemberAccountsEnrolled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnrollmentStatusResult == false)
            return false;
        GetEnrollmentStatusResult other = (GetEnrollmentStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getMemberAccountsEnrolled() == null ^ this.getMemberAccountsEnrolled() == null)
            return false;
        if (other.getMemberAccountsEnrolled() != null && other.getMemberAccountsEnrolled().equals(this.getMemberAccountsEnrolled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountsEnrolled() == null) ? 0 : getMemberAccountsEnrolled().hashCode());
        return hashCode;
    }

    @Override
    public GetEnrollmentStatusResult clone() {
        try {
            return (GetEnrollmentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
