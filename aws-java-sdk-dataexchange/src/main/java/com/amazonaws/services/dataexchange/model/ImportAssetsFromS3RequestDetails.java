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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ImportAssetsFromS3RequestDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAssetsFromS3RequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     */
    private java.util.List<AssetSourceEntry> assetSources;
    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for the revision associated with this import request.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     * 
     * @return Is a list of S3 bucket and object key pairs.
     */

    public java.util.List<AssetSourceEntry> getAssetSources() {
        return assetSources;
    }

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     * 
     * @param assetSources
     *        Is a list of S3 bucket and object key pairs.
     */

    public void setAssetSources(java.util.Collection<AssetSourceEntry> assetSources) {
        if (assetSources == null) {
            this.assetSources = null;
            return;
        }

        this.assetSources = new java.util.ArrayList<AssetSourceEntry>(assetSources);
    }

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetSources(java.util.Collection)} or {@link #withAssetSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assetSources
     *        Is a list of S3 bucket and object key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromS3RequestDetails withAssetSources(AssetSourceEntry... assetSources) {
        if (this.assetSources == null) {
            setAssetSources(new java.util.ArrayList<AssetSourceEntry>(assetSources.length));
        }
        for (AssetSourceEntry ele : assetSources) {
            this.assetSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     * 
     * @param assetSources
     *        Is a list of S3 bucket and object key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromS3RequestDetails withAssetSources(java.util.Collection<AssetSourceEntry> assetSources) {
        setAssetSources(assetSources);
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

    public ImportAssetsFromS3RequestDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import request.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import request.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import request.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this import request.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import request.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromS3RequestDetails withRevisionId(String revisionId) {
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
        if (getAssetSources() != null)
            sb.append("AssetSources: ").append(getAssetSources()).append(",");
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

        if (obj instanceof ImportAssetsFromS3RequestDetails == false)
            return false;
        ImportAssetsFromS3RequestDetails other = (ImportAssetsFromS3RequestDetails) obj;
        if (other.getAssetSources() == null ^ this.getAssetSources() == null)
            return false;
        if (other.getAssetSources() != null && other.getAssetSources().equals(this.getAssetSources()) == false)
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

        hashCode = prime * hashCode + ((getAssetSources() == null) ? 0 : getAssetSources().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public ImportAssetsFromS3RequestDetails clone() {
        try {
            return (ImportAssetsFromS3RequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ImportAssetsFromS3RequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
