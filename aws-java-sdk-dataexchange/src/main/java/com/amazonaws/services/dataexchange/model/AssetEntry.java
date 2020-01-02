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
 * An asset in AWS Data Exchange is a piece of data that can be stored as an S3 object. The asset can be a structured
 * data file, an image file, or some other data file. When you create an import job for your files, you create an asset
 * in AWS Data Exchange for each of those files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/AssetEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     */
    private AssetDetails assetDetails;
    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     */
    private String assetType;
    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting
     * to Amazon S3, the asset name is used as default target S3 object key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when
     * an asset owner is viewing the entitled copy of its owned asset.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     * 
     * @param arn
     *        The ARN for the asset.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     * 
     * @return The ARN for the asset.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     * 
     * @param arn
     *        The ARN for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     * 
     * @param assetDetails
     *        Information about the asset, including its size.
     */

    public void setAssetDetails(AssetDetails assetDetails) {
        this.assetDetails = assetDetails;
    }

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     * 
     * @return Information about the asset, including its size.
     */

    public AssetDetails getAssetDetails() {
        return this.assetDetails;
    }

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     * 
     * @param assetDetails
     *        Information about the asset, including its size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withAssetDetails(AssetDetails assetDetails) {
        setAssetDetails(assetDetails);
        return this;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @param assetType
     *        The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @see AssetType
     */

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @return The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @see AssetType
     */

    public String getAssetType() {
        return this.assetType;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @param assetType
     *        The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public AssetEntry withAssetType(String assetType) {
        setAssetType(assetType);
        return this;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @param assetType
     *        The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public AssetEntry withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the asset was created, in ISO 8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the asset was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the asset was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this asset.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     * 
     * @return The unique identifier for the data set associated with this asset.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * 
     * @param id
     *        The unique identifier for the asset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * 
     * @return The unique identifier for the asset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * 
     * @param id
     *        The unique identifier for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting
     * to Amazon S3, the asset name is used as default target S3 object key.
     * </p>
     * 
     * @param name
     *        The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When
     *        exporting to Amazon S3, the asset name is used as default target S3 object key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting
     * to Amazon S3, the asset name is used as default target S3 object key.
     * </p>
     * 
     * @return The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When
     *         exporting to Amazon S3, the asset name is used as default target S3 object key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting
     * to Amazon S3, the asset name is used as default target S3 object key.
     * </p>
     * 
     * @param name
     *        The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When
     *        exporting to Amazon S3, the asset name is used as default target S3 object key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this asset.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this asset.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when
     * an asset owner is viewing the entitled copy of its owned asset.
     * </p>
     * 
     * @param sourceId
     *        The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is
     *        returned when an asset owner is viewing the entitled copy of its owned asset.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when
     * an asset owner is viewing the entitled copy of its owned asset.
     * </p>
     * 
     * @return The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is
     *         returned when an asset owner is viewing the entitled copy of its owned asset.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when
     * an asset owner is viewing the entitled copy of its owned asset.
     * </p>
     * 
     * @param sourceId
     *        The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is
     *        returned when an asset owner is viewing the entitled copy of its owned asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the asset was last updated, in ISO 8601 format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the asset was last updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the asset was last updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetEntry withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAssetDetails() != null)
            sb.append("AssetDetails: ").append(getAssetDetails()).append(",");
        if (getAssetType() != null)
            sb.append("AssetType: ").append(getAssetType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetEntry == false)
            return false;
        AssetEntry other = (AssetEntry) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssetDetails() == null ^ this.getAssetDetails() == null)
            return false;
        if (other.getAssetDetails() != null && other.getAssetDetails().equals(this.getAssetDetails()) == false)
            return false;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAssetDetails() == null) ? 0 : getAssetDetails().hashCode());
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AssetEntry clone() {
        try {
            return (AssetEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.AssetEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
