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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CompleteLayerUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteLayerUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The upload ID associated with the layer.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     */
    private String layerDigest;

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

    public CompleteLayerUploadResult withRegistryId(String registryId) {
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

    public CompleteLayerUploadResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The upload ID associated with the layer.
     * </p>
     * 
     * @param uploadId
     *        The upload ID associated with the layer.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID associated with the layer.
     * </p>
     * 
     * @return The upload ID associated with the layer.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The upload ID associated with the layer.
     * </p>
     * 
     * @param uploadId
     *        The upload ID associated with the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteLayerUploadResult withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * 
     * @param layerDigest
     *        The <code>sha256</code> digest of the image layer.
     */

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * 
     * @return The <code>sha256</code> digest of the image layer.
     */

    public String getLayerDigest() {
        return this.layerDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * 
     * @param layerDigest
     *        The <code>sha256</code> digest of the image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteLayerUploadResult withLayerDigest(String layerDigest) {
        setLayerDigest(layerDigest);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getLayerDigest() != null)
            sb.append("LayerDigest: ").append(getLayerDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteLayerUploadResult == false)
            return false;
        CompleteLayerUploadResult other = (CompleteLayerUploadResult) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null)
            return false;
        if (other.getLayerDigest() != null && other.getLayerDigest().equals(this.getLayerDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        return hashCode;
    }

    @Override
    public CompleteLayerUploadResult clone() {
        try {
            return (CompleteLayerUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
