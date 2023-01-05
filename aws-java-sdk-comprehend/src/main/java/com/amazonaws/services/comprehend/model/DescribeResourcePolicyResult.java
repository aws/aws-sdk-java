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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON body of the resource-based policy.
     * </p>
     */
    private String resourcePolicy;
    /**
     * <p>
     * The time at which the policy was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the policy was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     */
    private String policyRevisionId;

    /**
     * <p>
     * The JSON body of the resource-based policy.
     * </p>
     * 
     * @param resourcePolicy
     *        The JSON body of the resource-based policy.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * The JSON body of the resource-based policy.
     * </p>
     * 
     * @return The JSON body of the resource-based policy.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * The JSON body of the resource-based policy.
     * </p>
     * 
     * @param resourcePolicy
     *        The JSON body of the resource-based policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePolicyResult withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
        return this;
    }

    /**
     * <p>
     * The time at which the policy was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the policy was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the policy was created.
     * </p>
     * 
     * @return The time at which the policy was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the policy was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePolicyResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the policy was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the policy was last modified.
     * </p>
     * 
     * @return The time at which the policy was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePolicyResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID,
     *        and it deletes the prior version of the policy.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     * 
     * @return The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision
     *         ID, and it deletes the prior version of the policy.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID,
     *        and it deletes the prior version of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePolicyResult withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
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
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourcePolicyResult == false)
            return false;
        DescribeResourcePolicyResult other = (DescribeResourcePolicyResult) obj;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourcePolicyResult clone() {
        try {
            return (DescribeResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
