/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository to delete.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * Force the deletion of the repository if it contains images.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository to delete. If you do not
     *        specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the repository to delete. If you do not
     *         specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository to delete. If you do not
     *        specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRepositoryRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository to delete.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to delete.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to delete.
     * </p>
     * 
     * @return The name of the repository to delete.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to delete.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRepositoryRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * Force the deletion of the repository if it contains images.
     * </p>
     * 
     * @param force
     *        Force the deletion of the repository if it contains images.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Force the deletion of the repository if it contains images.
     * </p>
     * 
     * @return Force the deletion of the repository if it contains images.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Force the deletion of the repository if it contains images.
     * </p>
     * 
     * @param force
     *        Force the deletion of the repository if it contains images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRepositoryRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Force the deletion of the repository if it contains images.
     * </p>
     * 
     * @return Force the deletion of the repository if it contains images.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RegistryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRepositoryRequest == false)
            return false;
        DeleteRepositoryRequest other = (DeleteRepositoryRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
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
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRepositoryRequest clone() {
        return (DeleteRepositoryRequest) super.clone();
    }
}
