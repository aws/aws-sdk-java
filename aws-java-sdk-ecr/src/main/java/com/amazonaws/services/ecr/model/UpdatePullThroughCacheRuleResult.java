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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UpdatePullThroughCacheRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePullThroughCacheRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     * </p>
     */
    private String ecrRepositoryPrefix;
    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The date and time, in JavaScript date format, when the pull through cache rule was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull through
     * cache rule.
     * </p>
     */
    private String credentialArn;

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The Amazon ECR repository prefix associated with the pull through cache rule.
     */

    public void setEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        this.ecrRepositoryPrefix = ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     * </p>
     * 
     * @return The Amazon ECR repository prefix associated with the pull through cache rule.
     */

    public String getEcrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The Amazon ECR repository prefix associated with the pull through cache rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleResult withEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        setEcrRepositoryPrefix(ecrRepositoryPrefix);
        return this;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the request.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @return The registry ID associated with the request.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleResult withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the pull through cache rule was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in JavaScript date format, when the pull through cache rule was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the pull through cache rule was updated.
     * </p>
     * 
     * @return The date and time, in JavaScript date format, when the pull through cache rule was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the pull through cache rule was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in JavaScript date format, when the pull through cache rule was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull through
     * cache rule.
     * </p>
     * 
     * @param credentialArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull
     *        through cache rule.
     */

    public void setCredentialArn(String credentialArn) {
        this.credentialArn = credentialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull through
     * cache rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull
     *         through cache rule.
     */

    public String getCredentialArn() {
        return this.credentialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull through
     * cache rule.
     * </p>
     * 
     * @param credentialArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull
     *        through cache rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleResult withCredentialArn(String credentialArn) {
        setCredentialArn(credentialArn);
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
        if (getEcrRepositoryPrefix() != null)
            sb.append("EcrRepositoryPrefix: ").append(getEcrRepositoryPrefix()).append(",");
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getCredentialArn() != null)
            sb.append("CredentialArn: ").append(getCredentialArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullThroughCacheRuleResult == false)
            return false;
        UpdatePullThroughCacheRuleResult other = (UpdatePullThroughCacheRuleResult) obj;
        if (other.getEcrRepositoryPrefix() == null ^ this.getEcrRepositoryPrefix() == null)
            return false;
        if (other.getEcrRepositoryPrefix() != null && other.getEcrRepositoryPrefix().equals(this.getEcrRepositoryPrefix()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getCredentialArn() == null ^ this.getCredentialArn() == null)
            return false;
        if (other.getCredentialArn() != null && other.getCredentialArn().equals(this.getCredentialArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcrRepositoryPrefix() == null) ? 0 : getEcrRepositoryPrefix().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCredentialArn() == null) ? 0 : getCredentialArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePullThroughCacheRuleResult clone() {
        try {
            return (UpdatePullThroughCacheRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
