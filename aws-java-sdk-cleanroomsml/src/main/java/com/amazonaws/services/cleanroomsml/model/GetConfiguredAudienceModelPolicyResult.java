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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModelPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfiguredAudienceModelPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The configured audience model policy. This is a JSON IAM resource policy.
     * </p>
     */
    private String configuredAudienceModelPolicy;
    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     */
    private String policyHash;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelPolicyResult withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The configured audience model policy. This is a JSON IAM resource policy.
     * </p>
     * 
     * @param configuredAudienceModelPolicy
     *        The configured audience model policy. This is a JSON IAM resource policy.
     */

    public void setConfiguredAudienceModelPolicy(String configuredAudienceModelPolicy) {
        this.configuredAudienceModelPolicy = configuredAudienceModelPolicy;
    }

    /**
     * <p>
     * The configured audience model policy. This is a JSON IAM resource policy.
     * </p>
     * 
     * @return The configured audience model policy. This is a JSON IAM resource policy.
     */

    public String getConfiguredAudienceModelPolicy() {
        return this.configuredAudienceModelPolicy;
    }

    /**
     * <p>
     * The configured audience model policy. This is a JSON IAM resource policy.
     * </p>
     * 
     * @param configuredAudienceModelPolicy
     *        The configured audience model policy. This is a JSON IAM resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelPolicyResult withConfiguredAudienceModelPolicy(String configuredAudienceModelPolicy) {
        setConfiguredAudienceModelPolicy(configuredAudienceModelPolicy);
        return this;
    }

    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     * 
     * @param policyHash
     *        A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of
     *        the policy.
     */

    public void setPolicyHash(String policyHash) {
        this.policyHash = policyHash;
    }

    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     * 
     * @return A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of
     *         the policy.
     */

    public String getPolicyHash() {
        return this.policyHash;
    }

    /**
     * <p>
     * A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of the
     * policy.
     * </p>
     * 
     * @param policyHash
     *        A cryptographic hash of the contents of the policy used to prevent unexpected concurrent modification of
     *        the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfiguredAudienceModelPolicyResult withPolicyHash(String policyHash) {
        setPolicyHash(policyHash);
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
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getConfiguredAudienceModelPolicy() != null)
            sb.append("ConfiguredAudienceModelPolicy: ").append(getConfiguredAudienceModelPolicy()).append(",");
        if (getPolicyHash() != null)
            sb.append("PolicyHash: ").append(getPolicyHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfiguredAudienceModelPolicyResult == false)
            return false;
        GetConfiguredAudienceModelPolicyResult other = (GetConfiguredAudienceModelPolicyResult) obj;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getConfiguredAudienceModelPolicy() == null ^ this.getConfiguredAudienceModelPolicy() == null)
            return false;
        if (other.getConfiguredAudienceModelPolicy() != null
                && other.getConfiguredAudienceModelPolicy().equals(this.getConfiguredAudienceModelPolicy()) == false)
            return false;
        if (other.getPolicyHash() == null ^ this.getPolicyHash() == null)
            return false;
        if (other.getPolicyHash() != null && other.getPolicyHash().equals(this.getPolicyHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelPolicy() == null) ? 0 : getConfiguredAudienceModelPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyHash() == null) ? 0 : getPolicyHash().hashCode());
        return hashCode;
    }

    @Override
    public GetConfiguredAudienceModelPolicyResult clone() {
        try {
            return (GetConfiguredAudienceModelPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
