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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLifecyclePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     */
    private String lifecyclePolicyText;
    /**
     * <p>
     * The time stamp of the last time that the lifecycle policy was run.
     * </p>
     */
    private java.util.Date lastEvaluatedAt;

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

    public GetLifecyclePolicyResult withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @return The repository name associated with the request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The JSON lifecycle policy text.
     */

    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     * 
     * @return The JSON lifecycle policy text.
     */

    public String getLifecyclePolicyText() {
        return this.lifecyclePolicyText;
    }

    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The JSON lifecycle policy text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyResult withLifecyclePolicyText(String lifecyclePolicyText) {
        setLifecyclePolicyText(lifecyclePolicyText);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last time that the lifecycle policy was run.
     * </p>
     * 
     * @param lastEvaluatedAt
     *        The time stamp of the last time that the lifecycle policy was run.
     */

    public void setLastEvaluatedAt(java.util.Date lastEvaluatedAt) {
        this.lastEvaluatedAt = lastEvaluatedAt;
    }

    /**
     * <p>
     * The time stamp of the last time that the lifecycle policy was run.
     * </p>
     * 
     * @return The time stamp of the last time that the lifecycle policy was run.
     */

    public java.util.Date getLastEvaluatedAt() {
        return this.lastEvaluatedAt;
    }

    /**
     * <p>
     * The time stamp of the last time that the lifecycle policy was run.
     * </p>
     * 
     * @param lastEvaluatedAt
     *        The time stamp of the last time that the lifecycle policy was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyResult withLastEvaluatedAt(java.util.Date lastEvaluatedAt) {
        setLastEvaluatedAt(lastEvaluatedAt);
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
            sb.append("LifecyclePolicyText: ").append(getLifecyclePolicyText()).append(",");
        if (getLastEvaluatedAt() != null)
            sb.append("LastEvaluatedAt: ").append(getLastEvaluatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecyclePolicyResult == false)
            return false;
        GetLifecyclePolicyResult other = (GetLifecyclePolicyResult) obj;
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
        if (other.getLastEvaluatedAt() == null ^ this.getLastEvaluatedAt() == null)
            return false;
        if (other.getLastEvaluatedAt() != null && other.getLastEvaluatedAt().equals(this.getLastEvaluatedAt()) == false)
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
        hashCode = prime * hashCode + ((getLastEvaluatedAt() == null) ? 0 : getLastEvaluatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetLifecyclePolicyResult clone() {
        try {
            return (GetLifecyclePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
