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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageTagMutability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutImageTagMutabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to update the image tag
     * mutability settings. If you do not specify a registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository in which to update the image tag mutability settings.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     * overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which
     * will prevent them from being overwritten.
     * </p>
     */
    private String imageTagMutability;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to update the image tag
     * mutability settings. If you do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository in which to update the image
     *        tag mutability settings. If you do not specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to update the image tag
     * mutability settings. If you do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the repository in which to update the image
     *         tag mutability settings. If you do not specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the repository in which to update the image tag
     * mutability settings. If you do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the repository in which to update the image
     *        tag mutability settings. If you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageTagMutabilityRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository in which to update the image tag mutability settings.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository in which to update the image tag mutability settings.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to update the image tag mutability settings.
     * </p>
     * 
     * @return The name of the repository in which to update the image tag mutability settings.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to update the image tag mutability settings.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository in which to update the image tag mutability settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageTagMutabilityRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     * overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which
     * will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     *        overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be
     *        immutable which will prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     * overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which
     * will prevent them from being overwritten.
     * </p>
     * 
     * @return The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     *         overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be
     *         immutable which will prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public String getImageTagMutability() {
        return this.imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     * overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which
     * will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     *        overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be
     *        immutable which will prevent them from being overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public PutImageTagMutabilityRequest withImageTagMutability(String imageTagMutability) {
        setImageTagMutability(imageTagMutability);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     * overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which
     * will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If <code>MUTABLE</code> is specified, image tags can be
     *        overwritten. If <code>IMMUTABLE</code> is specified, all image tags within the repository will be
     *        immutable which will prevent them from being overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public PutImageTagMutabilityRequest withImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
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
        if (getImageTagMutability() != null)
            sb.append("ImageTagMutability: ").append(getImageTagMutability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutImageTagMutabilityRequest == false)
            return false;
        PutImageTagMutabilityRequest other = (PutImageTagMutabilityRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageTagMutability() == null ^ this.getImageTagMutability() == null)
            return false;
        if (other.getImageTagMutability() != null && other.getImageTagMutability().equals(this.getImageTagMutability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageTagMutability() == null) ? 0 : getImageTagMutability().hashCode());
        return hashCode;
    }

    @Override
    public PutImageTagMutabilityRequest clone() {
        return (PutImageTagMutabilityRequest) super.clone();
    }

}
