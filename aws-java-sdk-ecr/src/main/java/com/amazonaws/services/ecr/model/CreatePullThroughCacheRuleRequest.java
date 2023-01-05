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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CreatePullThroughCacheRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePullThroughCacheRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository name prefix to use when caching images from the source registry.
     * </p>
     */
    private String ecrRepositoryPrefix;
    /**
     * <p>
     * The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     * </p>
     */
    private String upstreamRegistryUrl;
    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to create the pull through cache rule for. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     */
    private String registryId;

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

    public CreatePullThroughCacheRuleRequest withEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        setEcrRepositoryPrefix(ecrRepositoryPrefix);
        return this;
    }

    /**
     * <p>
     * The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     * </p>
     * 
     * @param upstreamRegistryUrl
     *        The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     */

    public void setUpstreamRegistryUrl(String upstreamRegistryUrl) {
        this.upstreamRegistryUrl = upstreamRegistryUrl;
    }

    /**
     * <p>
     * The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     * </p>
     * 
     * @return The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     */

    public String getUpstreamRegistryUrl() {
        return this.upstreamRegistryUrl;
    }

    /**
     * <p>
     * The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     * </p>
     * 
     * @param upstreamRegistryUrl
     *        The registry URL of the upstream public registry to use as the source for the pull through cache rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullThroughCacheRuleRequest withUpstreamRegistryUrl(String upstreamRegistryUrl) {
        setUpstreamRegistryUrl(upstreamRegistryUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to create the pull through cache rule for. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry to create the pull through cache rule for.
     *        If you do not specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to create the pull through cache rule for. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the registry to create the pull through cache rule
     *         for. If you do not specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to create the pull through cache rule for. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry to create the pull through cache rule for.
     *        If you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullThroughCacheRuleRequest withRegistryId(String registryId) {
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

        if (obj instanceof CreatePullThroughCacheRuleRequest == false)
            return false;
        CreatePullThroughCacheRuleRequest other = (CreatePullThroughCacheRuleRequest) obj;
        if (other.getEcrRepositoryPrefix() == null ^ this.getEcrRepositoryPrefix() == null)
            return false;
        if (other.getEcrRepositoryPrefix() != null && other.getEcrRepositoryPrefix().equals(this.getEcrRepositoryPrefix()) == false)
            return false;
        if (other.getUpstreamRegistryUrl() == null ^ this.getUpstreamRegistryUrl() == null)
            return false;
        if (other.getUpstreamRegistryUrl() != null && other.getUpstreamRegistryUrl().equals(this.getUpstreamRegistryUrl()) == false)
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
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        return hashCode;
    }

    @Override
    public CreatePullThroughCacheRuleRequest clone() {
        return (CreatePullThroughCacheRuleRequest) super.clone();
    }

}
