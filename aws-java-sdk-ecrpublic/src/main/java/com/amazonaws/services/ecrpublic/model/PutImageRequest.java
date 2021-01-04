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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to put the image. If
     * you do not specify a registry, the default public registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository in which to put the image.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The image manifest corresponding to the image to be uploaded.
     * </p>
     */
    private String imageManifest;
    /**
     * <p>
     * The media type of the image manifest. If you push an image manifest that does not contain the
     * <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     * </p>
     */
    private String imageManifestMediaType;
    /**
     * <p>
     * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2
     * Schema 2 or Open Container Initiative (OCI) formats.
     * </p>
     */
    private String imageTag;
    /**
     * <p>
     * The image digest of the image manifest corresponding to the image.
     * </p>
     */
    private String imageDigest;

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to put the image. If
     * you do not specify a registry, the default public registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the public registry that contains the repository in which to put the
     *        image. If you do not specify a registry, the default public registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to put the image. If
     * you do not specify a registry, the default public registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the public registry that contains the repository in which to put the
     *         image. If you do not specify a registry, the default public registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the public registry that contains the repository in which to put the image. If
     * you do not specify a registry, the default public registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the public registry that contains the repository in which to put the
     *        image. If you do not specify a registry, the default public registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository in which to put the image.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository in which to put the image.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to put the image.
     * </p>
     * 
     * @return The name of the repository in which to put the image.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to put the image.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository in which to put the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The image manifest corresponding to the image to be uploaded.
     * </p>
     * 
     * @param imageManifest
     *        The image manifest corresponding to the image to be uploaded.
     */

    public void setImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
    }

    /**
     * <p>
     * The image manifest corresponding to the image to be uploaded.
     * </p>
     * 
     * @return The image manifest corresponding to the image to be uploaded.
     */

    public String getImageManifest() {
        return this.imageManifest;
    }

    /**
     * <p>
     * The image manifest corresponding to the image to be uploaded.
     * </p>
     * 
     * @param imageManifest
     *        The image manifest corresponding to the image to be uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageRequest withImageManifest(String imageManifest) {
        setImageManifest(imageManifest);
        return this;
    }

    /**
     * <p>
     * The media type of the image manifest. If you push an image manifest that does not contain the
     * <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     * </p>
     * 
     * @param imageManifestMediaType
     *        The media type of the image manifest. If you push an image manifest that does not contain the
     *        <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     */

    public void setImageManifestMediaType(String imageManifestMediaType) {
        this.imageManifestMediaType = imageManifestMediaType;
    }

    /**
     * <p>
     * The media type of the image manifest. If you push an image manifest that does not contain the
     * <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     * </p>
     * 
     * @return The media type of the image manifest. If you push an image manifest that does not contain the
     *         <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     */

    public String getImageManifestMediaType() {
        return this.imageManifestMediaType;
    }

    /**
     * <p>
     * The media type of the image manifest. If you push an image manifest that does not contain the
     * <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     * </p>
     * 
     * @param imageManifestMediaType
     *        The media type of the image manifest. If you push an image manifest that does not contain the
     *        <code>mediaType</code> field, you must specify the <code>imageManifestMediaType</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageRequest withImageManifestMediaType(String imageManifestMediaType) {
        setImageManifestMediaType(imageManifestMediaType);
        return this;
    }

    /**
     * <p>
     * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2
     * Schema 2 or Open Container Initiative (OCI) formats.
     * </p>
     * 
     * @param imageTag
     *        The tag to associate with the image. This parameter is required for images that use the Docker Image
     *        Manifest V2 Schema 2 or Open Container Initiative (OCI) formats.
     */

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * <p>
     * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2
     * Schema 2 or Open Container Initiative (OCI) formats.
     * </p>
     * 
     * @return The tag to associate with the image. This parameter is required for images that use the Docker Image
     *         Manifest V2 Schema 2 or Open Container Initiative (OCI) formats.
     */

    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * <p>
     * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2
     * Schema 2 or Open Container Initiative (OCI) formats.
     * </p>
     * 
     * @param imageTag
     *        The tag to associate with the image. This parameter is required for images that use the Docker Image
     *        Manifest V2 Schema 2 or Open Container Initiative (OCI) formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageRequest withImageTag(String imageTag) {
        setImageTag(imageTag);
        return this;
    }

    /**
     * <p>
     * The image digest of the image manifest corresponding to the image.
     * </p>
     * 
     * @param imageDigest
     *        The image digest of the image manifest corresponding to the image.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The image digest of the image manifest corresponding to the image.
     * </p>
     * 
     * @return The image digest of the image manifest corresponding to the image.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The image digest of the image manifest corresponding to the image.
     * </p>
     * 
     * @param imageDigest
     *        The image digest of the image manifest corresponding to the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageRequest withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
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
        if (getImageManifest() != null)
            sb.append("ImageManifest: ").append(getImageManifest()).append(",");
        if (getImageManifestMediaType() != null)
            sb.append("ImageManifestMediaType: ").append(getImageManifestMediaType()).append(",");
        if (getImageTag() != null)
            sb.append("ImageTag: ").append(getImageTag()).append(",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutImageRequest == false)
            return false;
        PutImageRequest other = (PutImageRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageManifest() == null ^ this.getImageManifest() == null)
            return false;
        if (other.getImageManifest() != null && other.getImageManifest().equals(this.getImageManifest()) == false)
            return false;
        if (other.getImageManifestMediaType() == null ^ this.getImageManifestMediaType() == null)
            return false;
        if (other.getImageManifestMediaType() != null && other.getImageManifestMediaType().equals(this.getImageManifestMediaType()) == false)
            return false;
        if (other.getImageTag() == null ^ this.getImageTag() == null)
            return false;
        if (other.getImageTag() != null && other.getImageTag().equals(this.getImageTag()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageManifest() == null) ? 0 : getImageManifest().hashCode());
        hashCode = prime * hashCode + ((getImageManifestMediaType() == null) ? 0 : getImageManifestMediaType().hashCode());
        hashCode = prime * hashCode + ((getImageTag() == null) ? 0 : getImageTag().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        return hashCode;
    }

    @Override
    public PutImageRequest clone() {
        return (PutImageRequest) super.clone();
    }

}
