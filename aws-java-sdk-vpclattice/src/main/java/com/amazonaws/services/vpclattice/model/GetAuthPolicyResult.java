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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAuthPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAuthPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the auth policy was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time that the auth policy was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The auth policy.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The state of the auth policy. The auth policy is only active when the auth type is set to <code>AWS_IAM</code>.
     * If you provide a policy, then authentication and authorization decisions are made based on this policy and the
     * client's IAM policy. If the auth type is <code>NONE</code>, then any auth policy that you provide remains
     * inactive. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network">Create a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The date and time that the auth policy was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the auth policy was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the auth policy was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the auth policy was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the auth policy was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the auth policy was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthPolicyResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time that the auth policy was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the auth policy was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the auth policy was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the auth policy was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the auth policy was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the auth policy was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthPolicyResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The auth policy.
     * </p>
     * 
     * @param policy
     *        The auth policy.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The auth policy.
     * </p>
     * 
     * @return The auth policy.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The auth policy.
     * </p>
     * 
     * @param policy
     *        The auth policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthPolicyResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The state of the auth policy. The auth policy is only active when the auth type is set to <code>AWS_IAM</code>.
     * If you provide a policy, then authentication and authorization decisions are made based on this policy and the
     * client's IAM policy. If the auth type is <code>NONE</code>, then any auth policy that you provide remains
     * inactive. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network">Create a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the auth policy. The auth policy is only active when the auth type is set to
     *        <code>AWS_IAM</code>. If you provide a policy, then authentication and authorization decisions are made
     *        based on this policy and the client's IAM policy. If the auth type is <code>NONE</code>, then any auth
     *        policy that you provide remains inactive. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network"
     *        >Create a service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * @see AuthPolicyState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the auth policy. The auth policy is only active when the auth type is set to <code>AWS_IAM</code>.
     * If you provide a policy, then authentication and authorization decisions are made based on this policy and the
     * client's IAM policy. If the auth type is <code>NONE</code>, then any auth policy that you provide remains
     * inactive. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network">Create a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @return The state of the auth policy. The auth policy is only active when the auth type is set to
     *         <code>AWS_IAM</code>. If you provide a policy, then authentication and authorization decisions are made
     *         based on this policy and the client's IAM policy. If the auth type is <code>NONE</code>, then any auth
     *         policy that you provide remains inactive. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network"
     *         >Create a service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * @see AuthPolicyState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the auth policy. The auth policy is only active when the auth type is set to <code>AWS_IAM</code>.
     * If you provide a policy, then authentication and authorization decisions are made based on this policy and the
     * client's IAM policy. If the auth type is <code>NONE</code>, then any auth policy that you provide remains
     * inactive. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network">Create a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the auth policy. The auth policy is only active when the auth type is set to
     *        <code>AWS_IAM</code>. If you provide a policy, then authentication and authorization decisions are made
     *        based on this policy and the client's IAM policy. If the auth type is <code>NONE</code>, then any auth
     *        policy that you provide remains inactive. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network"
     *        >Create a service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthPolicyState
     */

    public GetAuthPolicyResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the auth policy. The auth policy is only active when the auth type is set to <code>AWS_IAM</code>.
     * If you provide a policy, then authentication and authorization decisions are made based on this policy and the
     * client's IAM policy. If the auth type is <code>NONE</code>, then any auth policy that you provide remains
     * inactive. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network">Create a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param state
     *        The state of the auth policy. The auth policy is only active when the auth type is set to
     *        <code>AWS_IAM</code>. If you provide a policy, then authentication and authorization decisions are made
     *        based on this policy and the client's IAM policy. If the auth type is <code>NONE</code>, then any auth
     *        policy that you provide remains inactive. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#create-service-network"
     *        >Create a service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthPolicyState
     */

    public GetAuthPolicyResult withState(AuthPolicyState state) {
        this.state = state.toString();
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthPolicyResult == false)
            return false;
        GetAuthPolicyResult other = (GetAuthPolicyResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthPolicyResult clone() {
        try {
            return (GetAuthPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
