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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UpdateEnrollmentStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnrollmentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new enrollment status of the account.
     * </p>
     * <p>
     * Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code>
     * or <code>Failed</code> are specified.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether to enroll member accounts within the organization, if the account is a master account of an
     * organization.
     * </p>
     */
    private Boolean includeMemberAccounts;

    /**
     * <p>
     * The new enrollment status of the account.
     * </p>
     * <p>
     * Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code>
     * or <code>Failed</code> are specified.
     * </p>
     * 
     * @param status
     *        The new enrollment status of the account.</p>
     *        <p>
     *        Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if
     *        <code>Pending</code> or <code>Failed</code> are specified.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The new enrollment status of the account.
     * </p>
     * <p>
     * Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code>
     * or <code>Failed</code> are specified.
     * </p>
     * 
     * @return The new enrollment status of the account.</p>
     *         <p>
     *         Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if
     *         <code>Pending</code> or <code>Failed</code> are specified.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The new enrollment status of the account.
     * </p>
     * <p>
     * Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code>
     * or <code>Failed</code> are specified.
     * </p>
     * 
     * @param status
     *        The new enrollment status of the account.</p>
     *        <p>
     *        Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if
     *        <code>Pending</code> or <code>Failed</code> are specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public UpdateEnrollmentStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The new enrollment status of the account.
     * </p>
     * <p>
     * Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code>
     * or <code>Failed</code> are specified.
     * </p>
     * 
     * @param status
     *        The new enrollment status of the account.</p>
     *        <p>
     *        Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if
     *        <code>Pending</code> or <code>Failed</code> are specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public UpdateEnrollmentStatusRequest withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts within the organization, if the account is a master account of an
     * organization.
     * </p>
     * 
     * @param includeMemberAccounts
     *        Indicates whether to enroll member accounts within the organization, if the account is a master account of
     *        an organization.
     */

    public void setIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts within the organization, if the account is a master account of an
     * organization.
     * </p>
     * 
     * @return Indicates whether to enroll member accounts within the organization, if the account is a master account
     *         of an organization.
     */

    public Boolean getIncludeMemberAccounts() {
        return this.includeMemberAccounts;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts within the organization, if the account is a master account of an
     * organization.
     * </p>
     * 
     * @param includeMemberAccounts
     *        Indicates whether to enroll member accounts within the organization, if the account is a master account of
     *        an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnrollmentStatusRequest withIncludeMemberAccounts(Boolean includeMemberAccounts) {
        setIncludeMemberAccounts(includeMemberAccounts);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts within the organization, if the account is a master account of an
     * organization.
     * </p>
     * 
     * @return Indicates whether to enroll member accounts within the organization, if the account is a master account
     *         of an organization.
     */

    public Boolean isIncludeMemberAccounts() {
        return this.includeMemberAccounts;
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
        if (getIncludeMemberAccounts() != null)
            sb.append("IncludeMemberAccounts: ").append(getIncludeMemberAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnrollmentStatusRequest == false)
            return false;
        UpdateEnrollmentStatusRequest other = (UpdateEnrollmentStatusRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIncludeMemberAccounts() == null ^ this.getIncludeMemberAccounts() == null)
            return false;
        if (other.getIncludeMemberAccounts() != null && other.getIncludeMemberAccounts().equals(this.getIncludeMemberAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIncludeMemberAccounts() == null) ? 0 : getIncludeMemberAccounts().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnrollmentStatusRequest clone() {
        return (UpdateEnrollmentStatusRequest) super.clone();
    }

}
