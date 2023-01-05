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
 * Details of the operation to create an Amazon S3 data access from an S3 bucket.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateS3DataAccessFromS3BucketRequestDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateS3DataAccessFromS3BucketRequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the S3 data access source asset.
     * </p>
     */
    private S3DataAccessAssetSourceEntry assetSource;
    /**
     * <p>
     * The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * Details about the S3 data access source asset.
     * </p>
     * 
     * @param assetSource
     *        Details about the S3 data access source asset.
     */

    public void setAssetSource(S3DataAccessAssetSourceEntry assetSource) {
        this.assetSource = assetSource;
    }

    /**
     * <p>
     * Details about the S3 data access source asset.
     * </p>
     * 
     * @return Details about the S3 data access source asset.
     */

    public S3DataAccessAssetSourceEntry getAssetSource() {
        return this.assetSource;
    }

    /**
     * <p>
     * Details about the S3 data access source asset.
     * </p>
     * 
     * @param assetSource
     *        Details about the S3 data access source asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateS3DataAccessFromS3BucketRequestDetails withAssetSource(S3DataAccessAssetSourceEntry assetSource) {
        setAssetSource(assetSource);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     * </p>
     * 
     * @return The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with the creation of this Amazon S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateS3DataAccessFromS3BucketRequestDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for a revision.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * 
     * @return The unique identifier for a revision.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for a revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateS3DataAccessFromS3BucketRequestDetails withRevisionId(String revisionId) {
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
        if (getAssetSource() != null)
            sb.append("AssetSource: ").append(getAssetSource()).append(",");
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

        if (obj instanceof CreateS3DataAccessFromS3BucketRequestDetails == false)
            return false;
        CreateS3DataAccessFromS3BucketRequestDetails other = (CreateS3DataAccessFromS3BucketRequestDetails) obj;
        if (other.getAssetSource() == null ^ this.getAssetSource() == null)
            return false;
        if (other.getAssetSource() != null && other.getAssetSource().equals(this.getAssetSource()) == false)
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

        hashCode = prime * hashCode + ((getAssetSource() == null) ? 0 : getAssetSource().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateS3DataAccessFromS3BucketRequestDetails clone() {
        try {
            return (CreateS3DataAccessFromS3BucketRequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.CreateS3DataAccessFromS3BucketRequestDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
