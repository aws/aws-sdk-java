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
 * Details of the operation to be performed by the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ExportAssetsToS3RequestDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportAssetsToS3RequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination for the asset.
     * </p>
     */
    private java.util.List<AssetDestinationEntry> assetDestinations;
    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for the revision associated with this export request.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The destination for the asset.
     * </p>
     * 
     * @return The destination for the asset.
     */

    public java.util.List<AssetDestinationEntry> getAssetDestinations() {
        return assetDestinations;
    }

    /**
     * <p>
     * The destination for the asset.
     * </p>
     * 
     * @param assetDestinations
     *        The destination for the asset.
     */

    public void setAssetDestinations(java.util.Collection<AssetDestinationEntry> assetDestinations) {
        if (assetDestinations == null) {
            this.assetDestinations = null;
            return;
        }

        this.assetDestinations = new java.util.ArrayList<AssetDestinationEntry>(assetDestinations);
    }

    /**
     * <p>
     * The destination for the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetDestinations(java.util.Collection)} or {@link #withAssetDestinations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assetDestinations
     *        The destination for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetsToS3RequestDetails withAssetDestinations(AssetDestinationEntry... assetDestinations) {
        if (this.assetDestinations == null) {
            setAssetDestinations(new java.util.ArrayList<AssetDestinationEntry>(assetDestinations.length));
        }
        for (AssetDestinationEntry ele : assetDestinations) {
            this.assetDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination for the asset.
     * </p>
     * 
     * @param assetDestinations
     *        The destination for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetsToS3RequestDetails withAssetDestinations(java.util.Collection<AssetDestinationEntry> assetDestinations) {
        setAssetDestinations(assetDestinations);
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

    public ExportAssetsToS3RequestDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export request.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this export request.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export request.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this export request.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export request.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAssetsToS3RequestDetails withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getAssetDestinations() != null)
            sb.append("AssetDestinations: ").append(getAssetDestinations()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportAssetsToS3RequestDetails == false)
            return false;
        ExportAssetsToS3RequestDetails other = (ExportAssetsToS3RequestDetails) obj;
        if (other.getAssetDestinations() == null ^ this.getAssetDestinations() == null)
            return false;
        if (other.getAssetDestinations() != null && other.getAssetDestinations().equals(this.getAssetDestinations()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetDestinations() == null) ? 0 : getAssetDestinations().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public ExportAssetsToS3RequestDetails clone() {
        try {
            return (ExportAssetsToS3RequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ExportAssetsToS3RequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
