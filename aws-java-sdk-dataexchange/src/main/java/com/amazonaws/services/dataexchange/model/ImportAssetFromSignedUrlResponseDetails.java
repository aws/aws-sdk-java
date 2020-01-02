/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details in the response for an import request, including the signed URL and other information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ImportAssetFromSignedUrlResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAssetFromSignedUrlResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     * </p>
     */
    private String md5Hash;
    /**
     * <p>
     * The unique identifier for the revision associated with this import response.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The signed URL.
     * </p>
     */
    private String signedUrl;
    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     */
    private java.util.Date signedUrlExpiresAt;

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     * 
     * @param assetName
     *        The name for the asset associated with this import response.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     * 
     * @return The name for the asset associated with this import response.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     * 
     * @param assetName
     *        The name for the asset associated with this import response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromSignedUrlResponseDetails withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this import job.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * 
     * @return The unique identifier for the data set associated with this import job.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromSignedUrlResponseDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     * </p>
     * 
     * @param md5Hash
     *        The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     */

    public void setMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     * </p>
     * 
     * @return The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     */

    public String getMd5Hash() {
        return this.md5Hash;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     * </p>
     * 
     * @param md5Hash
     *        The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromSignedUrlResponseDetails withMd5Hash(String md5Hash) {
        setMd5Hash(md5Hash);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import response.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import response.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import response.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this import response.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import response.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromSignedUrlResponseDetails withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The signed URL.
     * </p>
     * 
     * @param signedUrl
     *        The signed URL.
     */

    public void setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
    }

    /**
     * <p>
     * The signed URL.
     * </p>
     * 
     * @return The signed URL.
     */

    public String getSignedUrl() {
        return this.signedUrl;
    }

    /**
     * <p>
     * The signed URL.
     * </p>
     * 
     * @param signedUrl
     *        The signed URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromSignedUrlResponseDetails withSignedUrl(String signedUrl) {
        setSignedUrl(signedUrl);
        return this;
    }

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param signedUrlExpiresAt
     *        The time and date at which the signed URL expires, in ISO 8601 format.
     */

    public void setSignedUrlExpiresAt(java.util.Date signedUrlExpiresAt) {
        this.signedUrlExpiresAt = signedUrlExpiresAt;
    }

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     * 
     * @return The time and date at which the signed URL expires, in ISO 8601 format.
     */

    public java.util.Date getSignedUrlExpiresAt() {
        return this.signedUrlExpiresAt;
    }

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param signedUrlExpiresAt
     *        The time and date at which the signed URL expires, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromSignedUrlResponseDetails withSignedUrlExpiresAt(java.util.Date signedUrlExpiresAt) {
        setSignedUrlExpiresAt(signedUrlExpiresAt);
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
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getMd5Hash() != null)
            sb.append("Md5Hash: ").append(getMd5Hash()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getSignedUrl() != null)
            sb.append("SignedUrl: ").append(getSignedUrl()).append(",");
        if (getSignedUrlExpiresAt() != null)
            sb.append("SignedUrlExpiresAt: ").append(getSignedUrlExpiresAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAssetFromSignedUrlResponseDetails == false)
            return false;
        ImportAssetFromSignedUrlResponseDetails other = (ImportAssetFromSignedUrlResponseDetails) obj;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getMd5Hash() == null ^ this.getMd5Hash() == null)
            return false;
        if (other.getMd5Hash() != null && other.getMd5Hash().equals(this.getMd5Hash()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getSignedUrl() == null ^ this.getSignedUrl() == null)
            return false;
        if (other.getSignedUrl() != null && other.getSignedUrl().equals(this.getSignedUrl()) == false)
            return false;
        if (other.getSignedUrlExpiresAt() == null ^ this.getSignedUrlExpiresAt() == null)
            return false;
        if (other.getSignedUrlExpiresAt() != null && other.getSignedUrlExpiresAt().equals(this.getSignedUrlExpiresAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getMd5Hash() == null) ? 0 : getMd5Hash().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getSignedUrl() == null) ? 0 : getSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getSignedUrlExpiresAt() == null) ? 0 : getSignedUrlExpiresAt().hashCode());
        return hashCode;
    }

    @Override
    public ImportAssetFromSignedUrlResponseDetails clone() {
        try {
            return (ImportAssetFromSignedUrlResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ImportAssetFromSignedUrlResponseDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
