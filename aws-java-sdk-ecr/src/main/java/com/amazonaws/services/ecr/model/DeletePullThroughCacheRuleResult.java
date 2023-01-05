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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeletePullThroughCacheRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePullThroughCacheRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the request.
     * </p>
     */
    private String ecrRepositoryPrefix;
    /**
     * <p>
     * The upstream registry URL associated with the pull through cache rule.
     * </p>
     */
    private String upstreamRegistryUrl;
    /**
     * <p>
     * The timestamp associated with the pull through cache rule.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     */
    private String registryId;

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the request.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The Amazon ECR repository prefix associated with the request.
     */

    public void setEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        this.ecrRepositoryPrefix = ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the request.
     * </p>
     * 
     * @return The Amazon ECR repository prefix associated with the request.
     */

    public String getEcrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the request.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The Amazon ECR repository prefix associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullThroughCacheRuleResult withEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        setEcrRepositoryPrefix(ecrRepositoryPrefix);
        return this;
    }

    /**
     * <p>
     * The upstream registry URL associated with the pull through cache rule.
     * </p>
     * 
     * @param upstreamRegistryUrl
     *        The upstream registry URL associated with the pull through cache rule.
     */

    public void setUpstreamRegistryUrl(String upstreamRegistryUrl) {
        this.upstreamRegistryUrl = upstreamRegistryUrl;
    }

    /**
     * <p>
     * The upstream registry URL associated with the pull through cache rule.
     * </p>
     * 
     * @return The upstream registry URL associated with the pull through cache rule.
     */

    public String getUpstreamRegistryUrl() {
        return this.upstreamRegistryUrl;
    }

    /**
     * <p>
     * The upstream registry URL associated with the pull through cache rule.
     * </p>
     * 
     * @param upstreamRegistryUrl
     *        The upstream registry URL associated with the pull through cache rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullThroughCacheRuleResult withUpstreamRegistryUrl(String upstreamRegistryUrl) {
        setUpstreamRegistryUrl(upstreamRegistryUrl);
        return this;
    }

    /**
     * <p>
     * The timestamp associated with the pull through cache rule.
     * </p>
     * 
     * @param createdAt
     *        The timestamp associated with the pull through cache rule.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp associated with the pull through cache rule.
     * </p>
     * 
     * @return The timestamp associated with the pull through cache rule.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp associated with the pull through cache rule.
     * </p>
     * 
     * @param createdAt
     *        The timestamp associated with the pull through cache rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullThroughCacheRuleResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public DeletePullThroughCacheRuleResult withRegistryId(String registryId) {
        setRegistryId(registryId);
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
        if (getUpstreamRegistryUrl() != null)
            sb.append("UpstreamRegistryUrl: ").append(getUpstreamRegistryUrl()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePullThroughCacheRuleResult == false)
            return false;
        DeletePullThroughCacheRuleResult other = (DeletePullThroughCacheRuleResult) obj;
        if (other.getEcrRepositoryPrefix() == null ^ this.getEcrRepositoryPrefix() == null)
            return false;
        if (other.getEcrRepositoryPrefix() != null && other.getEcrRepositoryPrefix().equals(this.getEcrRepositoryPrefix()) == false)
            return false;
        if (other.getUpstreamRegistryUrl() == null ^ this.getUpstreamRegistryUrl() == null)
            return false;
        if (other.getUpstreamRegistryUrl() != null && other.getUpstreamRegistryUrl().equals(this.getUpstreamRegistryUrl()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcrRepositoryPrefix() == null) ? 0 : getEcrRepositoryPrefix().hashCode());
        hashCode = prime * hashCode + ((getUpstreamRegistryUrl() == null) ? 0 : getUpstreamRegistryUrl().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePullThroughCacheRuleResult clone() {
        try {
            return (DeletePullThroughCacheRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
