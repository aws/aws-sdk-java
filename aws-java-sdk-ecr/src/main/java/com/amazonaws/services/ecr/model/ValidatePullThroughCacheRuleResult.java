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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ValidatePullThroughCacheRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePullThroughCacheRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The upstream registry URL associated with the pull through cache rule.
     * </p>
     */
    private String upstreamRegistryUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret associated with the pull through
     * cache rule.
     * </p>
     */
    private String credentialArn;
    /**
     * <p>
     * Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to reach the
     * upstream registry and authentication was successful. If <code>false</code>, there was an issue and validation
     * failed. The <code>failure</code> reason indicates the cause.
     * </p>
     */
    private Boolean isValid;
    /**
     * <p>
     * The reason the validation failed. For more details about possible causes and how to address them, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through cache
     * rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     */
    private String failure;

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

    public ValidatePullThroughCacheRuleResult withEcrRepositoryPrefix(String ecrRepositoryPrefix) {
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

    public ValidatePullThroughCacheRuleResult withRegistryId(String registryId) {
        setRegistryId(registryId);
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

    public ValidatePullThroughCacheRuleResult withUpstreamRegistryUrl(String upstreamRegistryUrl) {
        setUpstreamRegistryUrl(upstreamRegistryUrl);
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

    public ValidatePullThroughCacheRuleResult withCredentialArn(String credentialArn) {
        setCredentialArn(credentialArn);
        return this;
    }

    /**
     * <p>
     * Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to reach the
     * upstream registry and authentication was successful. If <code>false</code>, there was an issue and validation
     * failed. The <code>failure</code> reason indicates the cause.
     * </p>
     * 
     * @param isValid
     *        Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to
     *        reach the upstream registry and authentication was successful. If <code>false</code>, there was an issue
     *        and validation failed. The <code>failure</code> reason indicates the cause.
     */

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * <p>
     * Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to reach the
     * upstream registry and authentication was successful. If <code>false</code>, there was an issue and validation
     * failed. The <code>failure</code> reason indicates the cause.
     * </p>
     * 
     * @return Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to
     *         reach the upstream registry and authentication was successful. If <code>false</code>, there was an issue
     *         and validation failed. The <code>failure</code> reason indicates the cause.
     */

    public Boolean getIsValid() {
        return this.isValid;
    }

    /**
     * <p>
     * Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to reach the
     * upstream registry and authentication was successful. If <code>false</code>, there was an issue and validation
     * failed. The <code>failure</code> reason indicates the cause.
     * </p>
     * 
     * @param isValid
     *        Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to
     *        reach the upstream registry and authentication was successful. If <code>false</code>, there was an issue
     *        and validation failed. The <code>failure</code> reason indicates the cause.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePullThroughCacheRuleResult withIsValid(Boolean isValid) {
        setIsValid(isValid);
        return this;
    }

    /**
     * <p>
     * Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to reach the
     * upstream registry and authentication was successful. If <code>false</code>, there was an issue and validation
     * failed. The <code>failure</code> reason indicates the cause.
     * </p>
     * 
     * @return Whether or not the pull through cache rule was validated. If <code>true</code>, Amazon ECR was able to
     *         reach the upstream registry and authentication was successful. If <code>false</code>, there was an issue
     *         and validation failed. The <code>failure</code> reason indicates the cause.
     */

    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * <p>
     * The reason the validation failed. For more details about possible causes and how to address them, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through cache
     * rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param failure
     *        The reason the validation failed. For more details about possible causes and how to address them, see <a
     *        href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through
     *        cache rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     */

    public void setFailure(String failure) {
        this.failure = failure;
    }

    /**
     * <p>
     * The reason the validation failed. For more details about possible causes and how to address them, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through cache
     * rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @return The reason the validation failed. For more details about possible causes and how to address them, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through
     *         cache rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     */

    public String getFailure() {
        return this.failure;
    }

    /**
     * <p>
     * The reason the validation failed. For more details about possible causes and how to address them, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through cache
     * rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param failure
     *        The reason the validation failed. For more details about possible causes and how to address them, see <a
     *        href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html">Using pull through
     *        cache rules</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePullThroughCacheRuleResult withFailure(String failure) {
        setFailure(failure);
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
        if (getUpstreamRegistryUrl() != null)
            sb.append("UpstreamRegistryUrl: ").append(getUpstreamRegistryUrl()).append(",");
        if (getCredentialArn() != null)
            sb.append("CredentialArn: ").append(getCredentialArn()).append(",");
        if (getIsValid() != null)
            sb.append("IsValid: ").append(getIsValid()).append(",");
        if (getFailure() != null)
            sb.append("Failure: ").append(getFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidatePullThroughCacheRuleResult == false)
            return false;
        ValidatePullThroughCacheRuleResult other = (ValidatePullThroughCacheRuleResult) obj;
        if (other.getEcrRepositoryPrefix() == null ^ this.getEcrRepositoryPrefix() == null)
            return false;
        if (other.getEcrRepositoryPrefix() != null && other.getEcrRepositoryPrefix().equals(this.getEcrRepositoryPrefix()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getUpstreamRegistryUrl() == null ^ this.getUpstreamRegistryUrl() == null)
            return false;
        if (other.getUpstreamRegistryUrl() != null && other.getUpstreamRegistryUrl().equals(this.getUpstreamRegistryUrl()) == false)
            return false;
        if (other.getCredentialArn() == null ^ this.getCredentialArn() == null)
            return false;
        if (other.getCredentialArn() != null && other.getCredentialArn().equals(this.getCredentialArn()) == false)
            return false;
        if (other.getIsValid() == null ^ this.getIsValid() == null)
            return false;
        if (other.getIsValid() != null && other.getIsValid().equals(this.getIsValid()) == false)
            return false;
        if (other.getFailure() == null ^ this.getFailure() == null)
            return false;
        if (other.getFailure() != null && other.getFailure().equals(this.getFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcrRepositoryPrefix() == null) ? 0 : getEcrRepositoryPrefix().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getUpstreamRegistryUrl() == null) ? 0 : getUpstreamRegistryUrl().hashCode());
        hashCode = prime * hashCode + ((getCredentialArn() == null) ? 0 : getCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        hashCode = prime * hashCode + ((getFailure() == null) ? 0 : getFailure().hashCode());
        return hashCode;
    }

    @Override
    public ValidatePullThroughCacheRuleResult clone() {
        try {
            return (ValidatePullThroughCacheRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
