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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRevisionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the revision
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision
     * tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API,
     * using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely
     * identified by their ARN.
     * </p>
     */
    private Boolean finalized;
    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is
     * returned when a revision owner is viewing the entitled copy of its owned revision.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * The tags for the revision.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the revision
     * </p>
     * 
     * @param arn
     *        The ARN for the revision
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the revision
     * </p>
     * 
     * @return The ARN for the revision
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the revision
     * </p>
     * 
     * @param arn
     *        The ARN for the revision
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @param comment
     *        An optional comment about the revision.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @return An optional comment about the revision.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @param comment
     *        An optional comment about the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the revision was created, in ISO 8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the revision was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the revision was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this revision.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     * 
     * @return The unique identifier for the data set associated with this revision.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision
     * tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API,
     * using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely
     * identified by their ARN.
     * </p>
     * 
     * @param finalized
     *        To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a
     *        revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's
     *        in this read-only state, you can publish the revision to your products.</p>
     *        <p>
     *        Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog
     *        API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are
     *        uniquely identified by their ARN.
     */

    public void setFinalized(Boolean finalized) {
        this.finalized = finalized;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision
     * tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API,
     * using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely
     * identified by their ARN.
     * </p>
     * 
     * @return To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a
     *         revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's
     *         in this read-only state, you can publish the revision to your products.</p>
     *         <p>
     *         Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog
     *         API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are
     *         uniquely identified by their ARN.
     */

    public Boolean getFinalized() {
        return this.finalized;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision
     * tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API,
     * using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely
     * identified by their ARN.
     * </p>
     * 
     * @param finalized
     *        To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a
     *        revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's
     *        in this read-only state, you can publish the revision to your products.</p>
     *        <p>
     *        Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog
     *        API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are
     *        uniquely identified by their ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withFinalized(Boolean finalized) {
        setFinalized(finalized);
        return this;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a revision
     * tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog API,
     * using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are uniquely
     * identified by their ARN.
     * </p>
     * 
     * @return To publish a revision to a data set in a product, the revision must first be finalized. Finalizing a
     *         revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After it's
     *         in this read-only state, you can publish the revision to your products.</p>
     *         <p>
     *         Finalized revisions can be published through the AWS Data Exchange console or the AWS Marketplace Catalog
     *         API, using the StartChangeSet AWS Marketplace Catalog API action. When using the API, revisions are
     *         uniquely identified by their ARN.
     */

    public Boolean isFinalized() {
        return this.finalized;
    }

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     * 
     * @param id
     *        The unique identifier for the revision.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     * 
     * @return The unique identifier for the revision.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     * 
     * @param id
     *        The unique identifier for the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is
     * returned when a revision owner is viewing the entitled copy of its owned revision.
     * </p>
     * 
     * @param sourceId
     *        The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter
     *        is returned when a revision owner is viewing the entitled copy of its owned revision.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is
     * returned when a revision owner is viewing the entitled copy of its owned revision.
     * </p>
     * 
     * @return The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter
     *         is returned when a revision owner is viewing the entitled copy of its owned revision.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter is
     * returned when a revision owner is viewing the entitled copy of its owned revision.
     * </p>
     * 
     * @param sourceId
     *        The revision ID of the owned revision corresponding to the entitled revision being viewed. This parameter
     *        is returned when a revision owner is viewing the entitled copy of its owned revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * The tags for the revision.
     * </p>
     * 
     * @return The tags for the revision.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the revision.
     * </p>
     * 
     * @param tags
     *        The tags for the revision.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the revision.
     * </p>
     * 
     * @param tags
     *        The tags for the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRevisionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the revision was last updated, in ISO 8601 format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the revision was last updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the revision was last updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRevisionResult withUpdatedAt(java.util.Date updatedAt) {
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getFinalized() != null)
            sb.append("Finalized: ").append(getFinalized()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateRevisionResult == false)
            return false;
        CreateRevisionResult other = (CreateRevisionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getFinalized() == null ^ this.getFinalized() == null)
            return false;
        if (other.getFinalized() != null && other.getFinalized().equals(this.getFinalized()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getFinalized() == null) ? 0 : getFinalized().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CreateRevisionResult clone() {
        try {
            return (CreateRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
