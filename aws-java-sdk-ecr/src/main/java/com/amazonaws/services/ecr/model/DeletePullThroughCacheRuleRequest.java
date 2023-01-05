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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeletePullThroughCacheRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePullThroughCacheRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     * </p>
     */
    private String ecrRepositoryPrefix;
    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry that contains the pull through cache rule. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     */
    private String registryId;

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     */

    public void setEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        this.ecrRepositoryPrefix = ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     * </p>
     * 
     * @return The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     */

    public String getEcrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    /**
     * <p>
     * The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     * </p>
     * 
     * @param ecrRepositoryPrefix
     *        The Amazon ECR repository prefix associated with the pull through cache rule to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullThroughCacheRuleRequest withEcrRepositoryPrefix(String ecrRepositoryPrefix) {
        setEcrRepositoryPrefix(ecrRepositoryPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry that contains the pull through cache rule. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry that contains the pull through cache rule.
     *        If you do not specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry that contains the pull through cache rule. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the registry that contains the pull through cache
     *         rule. If you do not specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry that contains the pull through cache rule. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry that contains the pull through cache rule.
     *        If you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePullThroughCacheRuleRequest withRegistryId(String registryId) {
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

        if (obj instanceof DeletePullThroughCacheRuleRequest == false)
            return false;
        DeletePullThroughCacheRuleRequest other = (DeletePullThroughCacheRuleRequest) obj;
        if (other.getEcrRepositoryPrefix() == null ^ this.getEcrRepositoryPrefix() == null)
            return false;
        if (other.getEcrRepositoryPrefix() != null && other.getEcrRepositoryPrefix().equals(this.getEcrRepositoryPrefix()) == false)
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
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePullThroughCacheRuleRequest clone() {
        return (DeletePullThroughCacheRuleRequest) super.clone();
    }

}
