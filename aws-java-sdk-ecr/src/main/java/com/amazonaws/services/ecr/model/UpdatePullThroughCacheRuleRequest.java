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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UpdatePullThroughCacheRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePullThroughCacheRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry associated with the pull through cache rule. If
     * you do not specify a registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The repository name prefix to use when caching images from the source registry.
     * </p>
     */
    private String ecrRepositoryPrefix;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the credentials
     * to authenticate to the upstream registry.
     * </p>
     */
    private String credentialArn;

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry associated with the pull through cache rule. If
     * you do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry associated with the pull through cache
     *        rule. If you do not specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry associated with the pull through cache rule. If
     * you do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the registry associated with the pull through cache
     *         rule. If you do not specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry associated with the pull through cache rule. If
     * you do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry associated with the pull through cache
     *        rule. If you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The repository name prefix to use when caching images from the source registry.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The repository name prefix to use when caching images from the source registry.
     */

    public void setEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        this.ecrRepositoryPrefix = ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The repository name prefix to use when caching images from the source registry.
     * </p>
     * 
     * @return The repository name prefix to use when caching images from the source registry.
     */

    public String getEcrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The repository name prefix to use when caching images from the source registry.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The repository name prefix to use when caching images from the source registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleRequest withEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        setEcrRepositoryPrefix(ecrRepositoryPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the credentials
     * to authenticate to the upstream registry.
     * </p>
     * 
     * @param credentialArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the
     *        credentials to authenticate to the upstream registry.
     */

    public void setCredentialArn(String credentialArn) {
        this.credentialArn = credentialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the credentials
     * to authenticate to the upstream registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the
     *         credentials to authenticate to the upstream registry.
     */

    public String getCredentialArn() {
        return this.credentialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the credentials
     * to authenticate to the upstream registry.
     * </p>
     * 
     * @param credentialArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that identifies the
     *        credentials to authenticate to the upstream registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullThroughCacheRuleRequest withCredentialArn(String credentialArn) {
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getEcrRepositoryPrefix() != null)
            sb.append("EcrRepositoryPrefix: ").append(getEcrRepositoryPrefix()).append(",");
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

        if (obj instanceof UpdatePullThroughCacheRuleRequest == false)
            return false;
        UpdatePullThroughCacheRuleRequest other = (UpdatePullThroughCacheRuleRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getEcrRepositoryPrefix() == null ^ this.getEcrRepositoryPrefix() == null)
            return false;
        if (other.getEcrRepositoryPrefix() != null && other.getEcrRepositoryPrefix().equals(this.getEcrRepositoryPrefix()) == false)
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

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getEcrRepositoryPrefix() == null) ? 0 : getEcrRepositoryPrefix().hashCode());
        hashCode = prime * hashCode + ((getCredentialArn() == null) ? 0 : getCredentialArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePullThroughCacheRuleRequest clone() {
        return (UpdatePullThroughCacheRuleRequest) super.clone();
    }

}
