/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdateEnrollmentStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnrollmentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether to enroll member accounts of the organization if the account is the management account.
     * </p>
     */
    private Boolean includeMemberAccounts;
    /**
     * <p>
     * Sets the account status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Indicates whether to enroll member accounts of the organization if the account is the management account.
     * </p>
     * 
     * @param includeMemberAccounts
     *        Indicates whether to enroll member accounts of the organization if the account is the management account.
     */

    public void setIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts of the organization if the account is the management account.
     * </p>
     * 
     * @return Indicates whether to enroll member accounts of the organization if the account is the management account.
     */

    public Boolean getIncludeMemberAccounts() {
        return this.includeMemberAccounts;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts of the organization if the account is the management account.
     * </p>
     * 
     * @param includeMemberAccounts
     *        Indicates whether to enroll member accounts of the organization if the account is the management account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnrollmentStatusRequest withIncludeMemberAccounts(Boolean includeMemberAccounts) {
        setIncludeMemberAccounts(includeMemberAccounts);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enroll member accounts of the organization if the account is the management account.
     * </p>
     * 
     * @return Indicates whether to enroll member accounts of the organization if the account is the management account.
     */

    public Boolean isIncludeMemberAccounts() {
        return this.includeMemberAccounts;
    }

    /**
     * <p>
     * Sets the account status.
     * </p>
     * 
     * @param status
     *        Sets the account status.
     * @see EnrollmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Sets the account status.
     * </p>
     * 
     * @return Sets the account status.
     * @see EnrollmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Sets the account status.
     * </p>
     * 
     * @param status
     *        Sets the account status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnrollmentStatus
     */

    public UpdateEnrollmentStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Sets the account status.
     * </p>
     * 
     * @param status
     *        Sets the account status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnrollmentStatus
     */

    public UpdateEnrollmentStatusRequest withStatus(EnrollmentStatus status) {
        this.status = status.toString();
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
        if (getIncludeMemberAccounts() != null)
            sb.append("IncludeMemberAccounts: ").append(getIncludeMemberAccounts()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getIncludeMemberAccounts() == null ^ this.getIncludeMemberAccounts() == null)
            return false;
        if (other.getIncludeMemberAccounts() != null && other.getIncludeMemberAccounts().equals(this.getIncludeMemberAccounts()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeMemberAccounts() == null) ? 0 : getIncludeMemberAccounts().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnrollmentStatusRequest clone() {
        return (UpdateEnrollmentStatusRequest) super.clone();
    }

}
