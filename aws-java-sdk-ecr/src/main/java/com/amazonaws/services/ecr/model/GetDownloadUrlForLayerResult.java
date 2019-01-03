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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetDownloadUrlForLayer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDownloadUrlForLayerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     */
    private String downloadUrl;
    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     */
    private String layerDigest;

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     * 
     * @param downloadUrl
     *        The pre-signed Amazon S3 download URL for the requested layer.
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     * 
     * @return The pre-signed Amazon S3 download URL for the requested layer.
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     * 
     * @param downloadUrl
     *        The pre-signed Amazon S3 download URL for the requested layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDownloadUrlForLayerResult withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
        return this;
    }

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * 
     * @param layerDigest
     *        The digest of the image layer to download.
     */

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * 
     * @return The digest of the image layer to download.
     */

    public String getLayerDigest() {
        return this.layerDigest;
    }

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * 
     * @param layerDigest
     *        The digest of the image layer to download.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDownloadUrlForLayerResult withLayerDigest(String layerDigest) {
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
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append(getDownloadUrl()).append(",");
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

        if (obj instanceof GetDownloadUrlForLayerResult == false)
            return false;
        GetDownloadUrlForLayerResult other = (GetDownloadUrlForLayerResult) obj;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
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

        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        return hashCode;
    }

    @Override
    public GetDownloadUrlForLayerResult clone() {
        try {
            return (GetDownloadUrlForLayerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
