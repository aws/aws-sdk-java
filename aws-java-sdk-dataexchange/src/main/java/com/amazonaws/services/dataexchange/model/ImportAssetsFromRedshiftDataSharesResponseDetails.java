/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details from an import from Amazon Redshift datashare response.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ImportAssetsFromRedshiftDataSharesResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAssetsFromRedshiftDataSharesResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Amazon Redshift datashare asset sources.
     * </p>
     */
    private java.util.List<RedshiftDataShareAssetSourceEntry> assetSources;
    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * A list of Amazon Redshift datashare asset sources.
     * </p>
     * 
     * @return A list of Amazon Redshift datashare asset sources.
     */

    public java.util.List<RedshiftDataShareAssetSourceEntry> getAssetSources() {
        return assetSources;
    }

    /**
     * <p>
     * A list of Amazon Redshift datashare asset sources.
     * </p>
     * 
     * @param assetSources
     *        A list of Amazon Redshift datashare asset sources.
     */

    public void setAssetSources(java.util.Collection<RedshiftDataShareAssetSourceEntry> assetSources) {
        if (assetSources == null) {
            this.assetSources = null;
            return;
        }

        this.assetSources = new java.util.ArrayList<RedshiftDataShareAssetSourceEntry>(assetSources);
    }

    /**
     * <p>
     * A list of Amazon Redshift datashare asset sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetSources(java.util.Collection)} or {@link #withAssetSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assetSources
     *        A list of Amazon Redshift datashare asset sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromRedshiftDataSharesResponseDetails withAssetSources(RedshiftDataShareAssetSourceEntry... assetSources) {
        if (this.assetSources == null) {
            setAssetSources(new java.util.ArrayList<RedshiftDataShareAssetSourceEntry>(assetSources.length));
        }
        for (RedshiftDataShareAssetSourceEntry ele : assetSources) {
            this.assetSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Redshift datashare asset sources.
     * </p>
     * 
     * @param assetSources
     *        A list of Amazon Redshift datashare asset sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromRedshiftDataSharesResponseDetails withAssetSources(java.util.Collection<RedshiftDataShareAssetSourceEntry> assetSources) {
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

    public ImportAssetsFromRedshiftDataSharesResponseDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import job.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this import job.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromRedshiftDataSharesResponseDetails withRevisionId(String revisionId) {
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

        if (obj instanceof ImportAssetsFromRedshiftDataSharesResponseDetails == false)
            return false;
        ImportAssetsFromRedshiftDataSharesResponseDetails other = (ImportAssetsFromRedshiftDataSharesResponseDetails) obj;
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
    public ImportAssetsFromRedshiftDataSharesResponseDetails clone() {
        try {
            return (ImportAssetsFromRedshiftDataSharesResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ImportAssetsFromRedshiftDataSharesResponseDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
