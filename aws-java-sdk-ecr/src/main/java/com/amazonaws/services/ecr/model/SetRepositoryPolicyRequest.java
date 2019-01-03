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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/SetRepositoryPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetRepositoryPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry,
     * the default registry is assumed.
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
    private String policyText;
    /**
     * <p>
     * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in
     * the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent accidental
     * repository lock outs.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository. If you do not specify a
     *        registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the repository. If you do not specify a
     *         registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository. If you do not specify a
     *        registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRepositoryPolicyRequest withRegistryId(String registryId) {
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

    public SetRepositoryPolicyRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     * 
     * @param policyText
     *        The JSON repository policy text to apply to the repository.
     */

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     * 
     * @return The JSON repository policy text to apply to the repository.
     */

    public String getPolicyText() {
        return this.policyText;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the repository.
     * </p>
     * 
     * @param policyText
     *        The JSON repository policy text to apply to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRepositoryPolicyRequest withPolicyText(String policyText) {
        setPolicyText(policyText);
        return this;
    }

    /**
     * <p>
     * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in
     * the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent accidental
     * repository lock outs.
     * </p>
     * 
     * @param force
     *        If the policy you are attempting to set on a repository policy would prevent you from setting another
     *        policy in the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent
     *        accidental repository lock outs.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in
     * the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent accidental
     * repository lock outs.
     * </p>
     * 
     * @return If the policy you are attempting to set on a repository policy would prevent you from setting another
     *         policy in the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to
     *         prevent accidental repository lock outs.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in
     * the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent accidental
     * repository lock outs.
     * </p>
     * 
     * @param force
     *        If the policy you are attempting to set on a repository policy would prevent you from setting another
     *        policy in the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent
     *        accidental repository lock outs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetRepositoryPolicyRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in
     * the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to prevent accidental
     * repository lock outs.
     * </p>
     * 
     * @return If the policy you are attempting to set on a repository policy would prevent you from setting another
     *         policy in the future, you must force the <a>SetRepositoryPolicy</a> operation. This is intended to
     *         prevent accidental repository lock outs.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getPolicyText() != null)
            sb.append("PolicyText: ").append(getPolicyText()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetRepositoryPolicyRequest == false)
            return false;
        SetRepositoryPolicyRequest other = (SetRepositoryPolicyRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public SetRepositoryPolicyRequest clone() {
        return (SetRepositoryPolicyRequest) super.clone();
    }

}
