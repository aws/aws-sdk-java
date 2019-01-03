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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an Amazon ECR image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/Image" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID associated with the registry containing the image.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository associated with the image.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * An object containing the image tag and image digest associated with an image.
     * </p>
     */
    private ImageIdentifier imageId;
    /**
     * <p>
     * The image manifest associated with the image.
     * </p>
     */
    private String imageManifest;

    /**
     * <p>
     * The AWS account ID associated with the registry containing the image.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry containing the image.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry containing the image.
     * </p>
     * 
     * @return The AWS account ID associated with the registry containing the image.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry containing the image.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry containing the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository associated with the image.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository associated with the image.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository associated with the image.
     * </p>
     * 
     * @return The name of the repository associated with the image.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository associated with the image.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * An object containing the image tag and image digest associated with an image.
     * </p>
     * 
     * @param imageId
     *        An object containing the image tag and image digest associated with an image.
     */

    public void setImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * An object containing the image tag and image digest associated with an image.
     * </p>
     * 
     * @return An object containing the image tag and image digest associated with an image.
     */

    public ImageIdentifier getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * An object containing the image tag and image digest associated with an image.
     * </p>
     * 
     * @param imageId
     *        An object containing the image tag and image digest associated with an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageId(ImageIdentifier imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The image manifest associated with the image.
     * </p>
     * 
     * @param imageManifest
     *        The image manifest associated with the image.
     */

    public void setImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
    }

    /**
     * <p>
     * The image manifest associated with the image.
     * </p>
     * 
     * @return The image manifest associated with the image.
     */

    public String getImageManifest() {
        return this.imageManifest;
    }

    /**
     * <p>
     * The image manifest associated with the image.
     * </p>
     * 
     * @param imageManifest
     *        The image manifest associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageManifest(String imageManifest) {
        setImageManifest(imageManifest);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImageManifest() != null)
            sb.append("ImageManifest: ").append(getImageManifest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImageManifest() == null ^ this.getImageManifest() == null)
            return false;
        if (other.getImageManifest() != null && other.getImageManifest().equals(this.getImageManifest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageManifest() == null) ? 0 : getImageManifest().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
