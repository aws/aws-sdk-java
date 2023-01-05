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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccessPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccessPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description of the policy. Typically used to store information about the permissions defined in the policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The version of the policy being updated.
     * </p>
     */
    private String policyVersion;
    /**
     * <p>
     * The type of policy.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description of the policy. Typically used to store information about the permissions defined in the policy.
     * </p>
     * 
     * @param description
     *        A description of the policy. Typically used to store information about the permissions defined in the
     *        policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the policy. Typically used to store information about the permissions defined in the policy.
     * </p>
     * 
     * @return A description of the policy. Typically used to store information about the permissions defined in the
     *         policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the policy. Typically used to store information about the permissions defined in the policy.
     * </p>
     * 
     * @param description
     *        A description of the policy. Typically used to store information about the permissions defined in the
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param name
     *        The name of the policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param name
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @param policy
     *        The JSON policy document to use as the content for the policy.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @return The JSON policy document to use as the content for the policy.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The JSON policy document to use as the content for the policy.
     * </p>
     * 
     * @param policy
     *        The JSON policy document to use as the content for the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The version of the policy being updated.
     * </p>
     * 
     * @param policyVersion
     *        The version of the policy being updated.
     */

    public void setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
    }

    /**
     * <p>
     * The version of the policy being updated.
     * </p>
     * 
     * @return The version of the policy being updated.
     */

    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * <p>
     * The version of the policy being updated.
     * </p>
     * 
     * @param policyVersion
     *        The version of the policy being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withPolicyVersion(String policyVersion) {
        setPolicyVersion(policyVersion);
        return this;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @see AccessPolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @return The type of policy.
     * @see AccessPolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPolicyType
     */

    public UpdateAccessPolicyRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPolicyType
     */

    public UpdateAccessPolicyRequest withType(AccessPolicyType type) {
        this.type = type.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPolicyVersion() != null)
            sb.append("PolicyVersion: ").append(getPolicyVersion()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessPolicyRequest == false)
            return false;
        UpdateAccessPolicyRequest other = (UpdateAccessPolicyRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPolicyVersion() == null ^ this.getPolicyVersion() == null)
            return false;
        if (other.getPolicyVersion() != null && other.getPolicyVersion().equals(this.getPolicyVersion()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersion() == null) ? 0 : getPolicyVersion().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccessPolicyRequest clone() {
        return (UpdateAccessPolicyRequest) super.clone();
    }

}
