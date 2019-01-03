/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutLifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a
     * registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository to receive the policy.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     */
    private String lifecyclePolicyText;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not
     *        specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not
     *         specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not
     *        specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecyclePolicyRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository to receive the policy.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to receive the policy.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to receive the policy.
     * </p>
     * 
     * @return The name of the repository to receive the policy.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to receive the policy.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to receive the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecyclePolicyRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The JSON repository policy text to apply to the repository.
     */

    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     * 
     * @return The JSON repository policy text to apply to the repository.
     */

    public String getLifecyclePolicyText() {
        return this.lifecyclePolicyText;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The JSON repository policy text to apply to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecyclePolicyRequest withLifecyclePolicyText(String lifecyclePolicyText) {
        setLifecyclePolicyText(lifecyclePolicyText);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getLifecyclePolicyText() != null)
            sb.append("LifecyclePolicyText: ").append(getLifecyclePolicyText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecyclePolicyRequest == false)
            return false;
        PutLifecyclePolicyRequest other = (PutLifecyclePolicyRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getLifecyclePolicyText() == null ^ this.getLifecyclePolicyText() == null)
            return false;
        if (other.getLifecyclePolicyText() != null && other.getLifecyclePolicyText().equals(this.getLifecyclePolicyText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyText() == null) ? 0 : getLifecyclePolicyText().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecyclePolicyRequest clone() {
        return (PutLifecyclePolicyRequest) super.clone();
    }

}
