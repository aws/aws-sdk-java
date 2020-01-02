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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateDataSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     */
    private String assetType;
    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description for the data set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for
     * subscribers).
     * </p>
     */
    private String origin;
    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     * </p>
     */
    private OriginDetails originDetails;
    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is
     * returned when a data set owner is viewing the entitled copy of its owned data set.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     * 
     * @param arn
     *        The ARN for the data set.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     * 
     * @return The ARN for the data set.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     * 
     * @param arn
     *        The ARN for the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withArn(String arn) {
        setArn(arn);
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

    public UpdateDataSetResult withAssetType(String assetType) {
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

    public UpdateDataSetResult withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the data set was created, in ISO 8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the data set was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the data set was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description for the data set.
     * </p>
     * 
     * @param description
     *        The description for the data set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the data set.
     * </p>
     * 
     * @return The description for the data set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the data set.
     * </p>
     * 
     * @param description
     *        The description for the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     * 
     * @param id
     *        The unique identifier for the data set.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     * 
     * @return The unique identifier for the data set.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     * 
     * @param id
     *        The unique identifier for the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for
     * subscribers).
     * </p>
     * 
     * @param origin
     *        A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account
     *        (for subscribers).
     * @see Origin
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for
     * subscribers).
     * </p>
     * 
     * @return A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account
     *         (for subscribers).
     * @see Origin
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for
     * subscribers).
     * </p>
     * 
     * @param origin
     *        A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account
     *        (for subscribers).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Origin
     */

    public UpdateDataSetResult withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for
     * subscribers).
     * </p>
     * 
     * @param origin
     *        A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account
     *        (for subscribers).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Origin
     */

    public UpdateDataSetResult withOrigin(Origin origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     * </p>
     * 
     * @param originDetails
     *        If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     */

    public void setOriginDetails(OriginDetails originDetails) {
        this.originDetails = originDetails;
    }

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     * </p>
     * 
     * @return If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     */

    public OriginDetails getOriginDetails() {
        return this.originDetails;
    }

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     * </p>
     * 
     * @param originDetails
     *        If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withOriginDetails(OriginDetails originDetails) {
        setOriginDetails(originDetails);
        return this;
    }

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is
     * returned when a data set owner is viewing the entitled copy of its owned data set.
     * </p>
     * 
     * @param sourceId
     *        The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter
     *        is returned when a data set owner is viewing the entitled copy of its owned data set.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is
     * returned when a data set owner is viewing the entitled copy of its owned data set.
     * </p>
     * 
     * @return The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter
     *         is returned when a data set owner is viewing the entitled copy of its owned data set.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is
     * returned when a data set owner is viewing the entitled copy of its owned data set.
     * </p>
     * 
     * @param sourceId
     *        The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter
     *        is returned when a data set owner is viewing the entitled copy of its owned data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the data set was last updated, in ISO 8601 format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the data set was last updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the data set was last updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetResult withUpdatedAt(java.util.Date updatedAt) {
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
        if (getAssetType() != null)
            sb.append("AssetType: ").append(getAssetType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getOriginDetails() != null)
            sb.append("OriginDetails: ").append(getOriginDetails()).append(",");
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

        if (obj instanceof UpdateDataSetResult == false)
            return false;
        UpdateDataSetResult other = (UpdateDataSetResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getOriginDetails() == null ^ this.getOriginDetails() == null)
            return false;
        if (other.getOriginDetails() != null && other.getOriginDetails().equals(this.getOriginDetails()) == false)
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
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getOriginDetails() == null) ? 0 : getOriginDetails().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSetResult clone() {
        try {
            return (UpdateDataSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
