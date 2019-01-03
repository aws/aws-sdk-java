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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchGetImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The repository that contains the images to describe.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * A list of image ID references that correspond to images to describe. The format of the <code>imageIds</code>
     * reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * </p>
     */
    private java.util.List<ImageIdentifier> imageIds;
    /**
     * <p>
     * The accepted media types for the request.
     * </p>
     * <p>
     * Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     * <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     * <code>application/vnd.oci.image.manifest.v1+json</code>
     * </p>
     */
    private java.util.List<String> acceptedMediaTypes;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the images to describe. If you do not
     *        specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the images to describe. If you do not
     *         specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the images to describe. If you do not
     *        specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetImageRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The repository that contains the images to describe.
     * </p>
     * 
     * @param repositoryName
     *        The repository that contains the images to describe.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository that contains the images to describe.
     * </p>
     * 
     * @return The repository that contains the images to describe.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository that contains the images to describe.
     * </p>
     * 
     * @param repositoryName
     *        The repository that contains the images to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetImageRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * A list of image ID references that correspond to images to describe. The format of the <code>imageIds</code>
     * reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * </p>
     * 
     * @return A list of image ID references that correspond to images to describe. The format of the
     *         <code>imageIds</code> reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     */

    public java.util.List<ImageIdentifier> getImageIds() {
        return imageIds;
    }

    /**
     * <p>
     * A list of image ID references that correspond to images to describe. The format of the <code>imageIds</code>
     * reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * </p>
     * 
     * @param imageIds
     *        A list of image ID references that correspond to images to describe. The format of the
     *        <code>imageIds</code> reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     */

    public void setImageIds(java.util.Collection<ImageIdentifier> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new java.util.ArrayList<ImageIdentifier>(imageIds);
    }

    /**
     * <p>
     * A list of image ID references that correspond to images to describe. The format of the <code>imageIds</code>
     * reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        A list of image ID references that correspond to images to describe. The format of the
     *        <code>imageIds</code> reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetImageRequest withImageIds(ImageIdentifier... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new java.util.ArrayList<ImageIdentifier>(imageIds.length));
        }
        for (ImageIdentifier ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of image ID references that correspond to images to describe. The format of the <code>imageIds</code>
     * reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * </p>
     * 
     * @param imageIds
     *        A list of image ID references that correspond to images to describe. The format of the
     *        <code>imageIds</code> reference is <code>imageTag=tag</code> or <code>imageDigest=digest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetImageRequest withImageIds(java.util.Collection<ImageIdentifier> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * The accepted media types for the request.
     * </p>
     * <p>
     * Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     * <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     * <code>application/vnd.oci.image.manifest.v1+json</code>
     * </p>
     * 
     * @return The accepted media types for the request.</p>
     *         <p>
     *         Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     *         <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     *         <code>application/vnd.oci.image.manifest.v1+json</code>
     */

    public java.util.List<String> getAcceptedMediaTypes() {
        return acceptedMediaTypes;
    }

    /**
     * <p>
     * The accepted media types for the request.
     * </p>
     * <p>
     * Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     * <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     * <code>application/vnd.oci.image.manifest.v1+json</code>
     * </p>
     * 
     * @param acceptedMediaTypes
     *        The accepted media types for the request.</p>
     *        <p>
     *        Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     *        <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     *        <code>application/vnd.oci.image.manifest.v1+json</code>
     */

    public void setAcceptedMediaTypes(java.util.Collection<String> acceptedMediaTypes) {
        if (acceptedMediaTypes == null) {
            this.acceptedMediaTypes = null;
            return;
        }

        this.acceptedMediaTypes = new java.util.ArrayList<String>(acceptedMediaTypes);
    }

    /**
     * <p>
     * The accepted media types for the request.
     * </p>
     * <p>
     * Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     * <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     * <code>application/vnd.oci.image.manifest.v1+json</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceptedMediaTypes(java.util.Collection)} or {@link #withAcceptedMediaTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param acceptedMediaTypes
     *        The accepted media types for the request.</p>
     *        <p>
     *        Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     *        <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     *        <code>application/vnd.oci.image.manifest.v1+json</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetImageRequest withAcceptedMediaTypes(String... acceptedMediaTypes) {
        if (this.acceptedMediaTypes == null) {
            setAcceptedMediaTypes(new java.util.ArrayList<String>(acceptedMediaTypes.length));
        }
        for (String ele : acceptedMediaTypes) {
            this.acceptedMediaTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The accepted media types for the request.
     * </p>
     * <p>
     * Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     * <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     * <code>application/vnd.oci.image.manifest.v1+json</code>
     * </p>
     * 
     * @param acceptedMediaTypes
     *        The accepted media types for the request.</p>
     *        <p>
     *        Valid values: <code>application/vnd.docker.distribution.manifest.v1+json</code> |
     *        <code>application/vnd.docker.distribution.manifest.v2+json</code> |
     *        <code>application/vnd.oci.image.manifest.v1+json</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetImageRequest withAcceptedMediaTypes(java.util.Collection<String> acceptedMediaTypes) {
        setAcceptedMediaTypes(acceptedMediaTypes);
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
        if (getImageIds() != null)
            sb.append("ImageIds: ").append(getImageIds()).append(",");
        if (getAcceptedMediaTypes() != null)
            sb.append("AcceptedMediaTypes: ").append(getAcceptedMediaTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetImageRequest == false)
            return false;
        BatchGetImageRequest other = (BatchGetImageRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
        if (other.getAcceptedMediaTypes() == null ^ this.getAcceptedMediaTypes() == null)
            return false;
        if (other.getAcceptedMediaTypes() != null && other.getAcceptedMediaTypes().equals(this.getAcceptedMediaTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getAcceptedMediaTypes() == null) ? 0 : getAcceptedMediaTypes().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetImageRequest clone() {
        return (BatchGetImageRequest) super.clone();
    }

}
