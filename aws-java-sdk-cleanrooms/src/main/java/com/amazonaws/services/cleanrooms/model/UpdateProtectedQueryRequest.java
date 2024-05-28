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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateProtectedQuery" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProtectedQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for a member of a protected query instance.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     */
    private String protectedQueryIdentifier;
    /**
     * <p>
     * The target status of a query. Used to update the execution status of a currently running query.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The identifier for a member of a protected query instance.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for a member of a protected query instance.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for a member of a protected query instance.
     * </p>
     * 
     * @return The identifier for a member of a protected query instance.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for a member of a protected query instance.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for a member of a protected query instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectedQueryRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     * 
     * @param protectedQueryIdentifier
     *        The identifier for a protected query instance.
     */

    public void setProtectedQueryIdentifier(String protectedQueryIdentifier) {
        this.protectedQueryIdentifier = protectedQueryIdentifier;
    }

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     * 
     * @return The identifier for a protected query instance.
     */

    public String getProtectedQueryIdentifier() {
        return this.protectedQueryIdentifier;
    }

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     * 
     * @param protectedQueryIdentifier
     *        The identifier for a protected query instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProtectedQueryRequest withProtectedQueryIdentifier(String protectedQueryIdentifier) {
        setProtectedQueryIdentifier(protectedQueryIdentifier);
        return this;
    }

    /**
     * <p>
     * The target status of a query. Used to update the execution status of a currently running query.
     * </p>
     * 
     * @param targetStatus
     *        The target status of a query. Used to update the execution status of a currently running query.
     * @see TargetProtectedQueryStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The target status of a query. Used to update the execution status of a currently running query.
     * </p>
     * 
     * @return The target status of a query. Used to update the execution status of a currently running query.
     * @see TargetProtectedQueryStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The target status of a query. Used to update the execution status of a currently running query.
     * </p>
     * 
     * @param targetStatus
     *        The target status of a query. Used to update the execution status of a currently running query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetProtectedQueryStatus
     */

    public UpdateProtectedQueryRequest withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The target status of a query. Used to update the execution status of a currently running query.
     * </p>
     * 
     * @param targetStatus
     *        The target status of a query. Used to update the execution status of a currently running query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetProtectedQueryStatus
     */

    public UpdateProtectedQueryRequest withTargetStatus(TargetProtectedQueryStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getProtectedQueryIdentifier() != null)
            sb.append("ProtectedQueryIdentifier: ").append(getProtectedQueryIdentifier()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProtectedQueryRequest == false)
            return false;
        UpdateProtectedQueryRequest other = (UpdateProtectedQueryRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getProtectedQueryIdentifier() == null ^ this.getProtectedQueryIdentifier() == null)
            return false;
        if (other.getProtectedQueryIdentifier() != null && other.getProtectedQueryIdentifier().equals(this.getProtectedQueryIdentifier()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getProtectedQueryIdentifier() == null) ? 0 : getProtectedQueryIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProtectedQueryRequest clone() {
        return (UpdateProtectedQueryRequest) super.clone();
    }

}
