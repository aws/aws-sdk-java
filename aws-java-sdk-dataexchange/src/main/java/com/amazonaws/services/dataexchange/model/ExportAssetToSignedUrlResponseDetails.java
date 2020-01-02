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
 * The details of the export to signed URL response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ExportAssetToSignedUrlResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportAssetToSignedUrlResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for the revision associated with this export response.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     */
    private String signedUrl;
    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     */
    private java.util.Date signedUrlExpiresAt;

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     * 
     * @param assetId
     *        The unique identifier for the asset associated with this export job.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     * 
     * @return The unique identifier for the asset associated with this export job.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     * 
     * @param assetId
     *        The unique identifier for the asset associated with this export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetToSignedUrlResponseDetails withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this export job.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * 
     * @return The unique identifier for the data set associated with this export job.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetToSignedUrlResponseDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export response.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this export response.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export response.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this export response.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export response.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this export response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetToSignedUrlResponseDetails withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     * 
     * @param signedUrl
     *        The signed URL for the export request.
     */

    public void setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
    }

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     * 
     * @return The signed URL for the export request.
     */

    public String getSignedUrl() {
        return this.signedUrl;
    }

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     * 
     * @param signedUrl
     *        The signed URL for the export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetToSignedUrlResponseDetails withSignedUrl(String signedUrl) {
        setSignedUrl(signedUrl);
        return this;
    }

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param signedUrlExpiresAt
     *        The date and time that the signed URL expires, in ISO 8601 format.
     */

    public void setSignedUrlExpiresAt(java.util.Date signedUrlExpiresAt) {
        this.signedUrlExpiresAt = signedUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the signed URL expires, in ISO 8601 format.
     */

    public java.util.Date getSignedUrlExpiresAt() {
        return this.signedUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param signedUrlExpiresAt
     *        The date and time that the signed URL expires, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetToSignedUrlResponseDetails withSignedUrlExpiresAt(java.util.Date signedUrlExpiresAt) {
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
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

        if (obj instanceof ExportAssetToSignedUrlResponseDetails == false)
            return false;
        ExportAssetToSignedUrlResponseDetails other = (ExportAssetToSignedUrlResponseDetails) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
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

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getSignedUrl() == null) ? 0 : getSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getSignedUrlExpiresAt() == null) ? 0 : getSignedUrlExpiresAt().hashCode());
        return hashCode;
    }

    @Override
    public ExportAssetToSignedUrlResponseDetails clone() {
        try {
            return (ExportAssetToSignedUrlResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ExportAssetToSignedUrlResponseDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
