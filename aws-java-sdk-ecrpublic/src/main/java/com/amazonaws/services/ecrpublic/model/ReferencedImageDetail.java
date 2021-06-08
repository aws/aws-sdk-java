/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes the image tag details returned by a <a>DescribeImageTags</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/ReferencedImageDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferencedImageDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     */
    private String imageDigest;
    /**
     * <p>
     * The size, in bytes, of the image in the repository.
     * </p>
     * <p>
     * If the image is a manifest list, this will be the max size of all manifests in the list.
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
     * The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed to the
     * repository.
     * </p>
     */
    private java.util.Date imagePushedAt;
    /**
     * <p>
     * The media type of the image manifest.
     * </p>
     */
    private String imageManifestMediaType;
    /**
     * <p>
     * The artifact media type of the image.
     * </p>
     */
    private String artifactMediaType;

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

    public ReferencedImageDetail withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the image in the repository.
     * </p>
     * <p>
     * If the image is a manifest list, this will be the max size of all manifests in the list.
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
     *        The size, in bytes, of the image in the repository.</p>
     *        <p>
     *        If the image is a manifest list, this will be the max size of all manifests in the list.
     *        </p>
     *        <note>
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
     * <p>
     * If the image is a manifest list, this will be the max size of all manifests in the list.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
     * registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may
     * return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @return The size, in bytes, of the image in the repository.</p>
     *         <p>
     *         If the image is a manifest list, this will be the max size of all manifests in the list.
     *         </p>
     *         <note>
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
     * <p>
     * If the image is a manifest list, this will be the max size of all manifests in the list.
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
     *        The size, in bytes, of the image in the repository.</p>
     *        <p>
     *        If the image is a manifest list, this will be the max size of all manifests in the list.
     *        </p>
     *        <note>
     *        <p>
     *        Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2
     *        Docker registry. The output of the <code>docker images</code> command shows the uncompressed image size,
     *        so it may return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedImageDetail withImageSizeInBytes(Long imageSizeInBytes) {
        setImageSizeInBytes(imageSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed to the
     * repository.
     * </p>
     * 
     * @param imagePushedAt
     *        The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed
     *        to the repository.
     */

    public void setImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed to the
     * repository.
     * </p>
     * 
     * @return The date and time, expressed in standard JavaScript date format, at which the current image tag was
     *         pushed to the repository.
     */

    public java.util.Date getImagePushedAt() {
        return this.imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed to the
     * repository.
     * </p>
     * 
     * @param imagePushedAt
     *        The date and time, expressed in standard JavaScript date format, at which the current image tag was pushed
     *        to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedImageDetail withImagePushedAt(java.util.Date imagePushedAt) {
        setImagePushedAt(imagePushedAt);
        return this;
    }

    /**
     * <p>
     * The media type of the image manifest.
     * </p>
     * 
     * @param imageManifestMediaType
     *        The media type of the image manifest.
     */

    public void setImageManifestMediaType(String imageManifestMediaType) {
        this.imageManifestMediaType = imageManifestMediaType;
    }

    /**
     * <p>
     * The media type of the image manifest.
     * </p>
     * 
     * @return The media type of the image manifest.
     */

    public String getImageManifestMediaType() {
        return this.imageManifestMediaType;
    }

    /**
     * <p>
     * The media type of the image manifest.
     * </p>
     * 
     * @param imageManifestMediaType
     *        The media type of the image manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedImageDetail withImageManifestMediaType(String imageManifestMediaType) {
        setImageManifestMediaType(imageManifestMediaType);
        return this;
    }

    /**
     * <p>
     * The artifact media type of the image.
     * </p>
     * 
     * @param artifactMediaType
     *        The artifact media type of the image.
     */

    public void setArtifactMediaType(String artifactMediaType) {
        this.artifactMediaType = artifactMediaType;
    }

    /**
     * <p>
     * The artifact media type of the image.
     * </p>
     * 
     * @return The artifact media type of the image.
     */

    public String getArtifactMediaType() {
        return this.artifactMediaType;
    }

    /**
     * <p>
     * The artifact media type of the image.
     * </p>
     * 
     * @param artifactMediaType
     *        The artifact media type of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencedImageDetail withArtifactMediaType(String artifactMediaType) {
        setArtifactMediaType(artifactMediaType);
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
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getImageSizeInBytes() != null)
            sb.append("ImageSizeInBytes: ").append(getImageSizeInBytes()).append(",");
        if (getImagePushedAt() != null)
            sb.append("ImagePushedAt: ").append(getImagePushedAt()).append(",");
        if (getImageManifestMediaType() != null)
            sb.append("ImageManifestMediaType: ").append(getImageManifestMediaType()).append(",");
        if (getArtifactMediaType() != null)
            sb.append("ArtifactMediaType: ").append(getArtifactMediaType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferencedImageDetail == false)
            return false;
        ReferencedImageDetail other = (ReferencedImageDetail) obj;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImageSizeInBytes() == null ^ this.getImageSizeInBytes() == null)
            return false;
        if (other.getImageSizeInBytes() != null && other.getImageSizeInBytes().equals(this.getImageSizeInBytes()) == false)
            return false;
        if (other.getImagePushedAt() == null ^ this.getImagePushedAt() == null)
            return false;
        if (other.getImagePushedAt() != null && other.getImagePushedAt().equals(this.getImagePushedAt()) == false)
            return false;
        if (other.getImageManifestMediaType() == null ^ this.getImageManifestMediaType() == null)
            return false;
        if (other.getImageManifestMediaType() != null && other.getImageManifestMediaType().equals(this.getImageManifestMediaType()) == false)
            return false;
        if (other.getArtifactMediaType() == null ^ this.getArtifactMediaType() == null)
            return false;
        if (other.getArtifactMediaType() != null && other.getArtifactMediaType().equals(this.getArtifactMediaType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImageSizeInBytes() == null) ? 0 : getImageSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getImagePushedAt() == null) ? 0 : getImagePushedAt().hashCode());
        hashCode = prime * hashCode + ((getImageManifestMediaType() == null) ? 0 : getImageManifestMediaType().hashCode());
        hashCode = prime * hashCode + ((getArtifactMediaType() == null) ? 0 : getArtifactMediaType().hashCode());
        return hashCode;
    }

    @Override
    public ReferencedImageDetail clone() {
        try {
            return (ReferencedImageDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.ReferencedImageDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
