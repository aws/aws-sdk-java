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
 * An object that describes an image returned by a <a>DescribeImages</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID associated with the registry to which this image belongs.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository to which this image belongs.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     */
    private String imageDigest;
    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     */
    private java.util.List<String> imageTags;
    /**
     * <p>
     * The size, in bytes, of the image in the repository.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
     * registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may
     * return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     * </p>
     * </note>
     */
    private Long imageSizeInBytes;
    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     */
    private java.util.Date imagePushedAt;

    /**
     * <p>
     * The AWS account ID associated with the registry to which this image belongs.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry to which this image belongs.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry to which this image belongs.
     * </p>
     * 
     * @return The AWS account ID associated with the registry to which this image belongs.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry to which this image belongs.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry to which this image belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository to which this image belongs.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to which this image belongs.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to which this image belongs.
     * </p>
     * 
     * @return The name of the repository to which this image belongs.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to which this image belongs.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to which this image belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The <code>sha256</code> digest of the image manifest.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @return The <code>sha256</code> digest of the image manifest.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The <code>sha256</code> digest of the image manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * 
     * @return The list of tags associated with this image.
     */

    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * 
     * @param imageTags
     *        The list of tags associated with this image.
     */

    public void setImageTags(java.util.Collection<String> imageTags) {
        if (imageTags == null) {
            this.imageTags = null;
            return;
        }

        this.imageTags = new java.util.ArrayList<String>(imageTags);
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTags(java.util.Collection)} or {@link #withImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageTags
     *        The list of tags associated with this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withImageTags(String... imageTags) {
        if (this.imageTags == null) {
            setImageTags(new java.util.ArrayList<String>(imageTags.length));
        }
        for (String ele : imageTags) {
            this.imageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * 
     * @param imageTags
     *        The list of tags associated with this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the image in the repository.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
     * registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may
     * return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @param imageSizeInBytes
     *        The size, in bytes, of the image in the repository.</p> <note>
     *        <p>
     *        Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2
     *        Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size,
     *        so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     *        </p>
     */

    public void setImageSizeInBytes(Long imageSizeInBytes) {
        this.imageSizeInBytes = imageSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the image in the repository.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
     * registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may
     * return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @return The size, in bytes, of the image in the repository.</p> <note>
     *         <p>
     *         Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2
     *         Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size,
     *         so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     *         </p>
     */

    public Long getImageSizeInBytes() {
        return this.imageSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the image in the repository.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
     * registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may
     * return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @param imageSizeInBytes
     *        The size, in bytes, of the image in the repository.</p> <note>
     *        <p>
     *        Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2
     *        Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size,
     *        so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withImageSizeInBytes(Long imageSizeInBytes) {
        setImageSizeInBytes(imageSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     * 
     * @param imagePushedAt
     *        The date and time, expressed in standard JavaScript date format, at which the current image was pushed to
     *        the repository.
     */

    public void setImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     * 
     * @return The date and time, expressed in standard JavaScript date format, at which the current image was pushed to
     *         the repository.
     */

    public java.util.Date getImagePushedAt() {
        return this.imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     * 
     * @param imagePushedAt
     *        The date and time, expressed in standard JavaScript date format, at which the current image was pushed to
     *        the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDetail withImagePushedAt(java.util.Date imagePushedAt) {
        setImagePushedAt(imagePushedAt);
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
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getImageTags() != null)
            sb.append("ImageTags: ").append(getImageTags()).append(",");
        if (getImageSizeInBytes() != null)
            sb.append("ImageSizeInBytes: ").append(getImageSizeInBytes()).append(",");
        if (getImagePushedAt() != null)
            sb.append("ImagePushedAt: ").append(getImagePushedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageDetail == false)
            return false;
        ImageDetail other = (ImageDetail) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getImageSizeInBytes() == null ^ this.getImageSizeInBytes() == null)
            return false;
        if (other.getImageSizeInBytes() != null && other.getImageSizeInBytes().equals(this.getImageSizeInBytes()) == false)
            return false;
        if (other.getImagePushedAt() == null ^ this.getImagePushedAt() == null)
            return false;
        if (other.getImagePushedAt() != null && other.getImagePushedAt().equals(this.getImagePushedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getImageSizeInBytes() == null) ? 0 : getImageSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getImagePushedAt() == null) ? 0 : getImagePushedAt().hashCode());
        return hashCode;
    }

    @Override
    public ImageDetail clone() {
        try {
            return (ImageDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
