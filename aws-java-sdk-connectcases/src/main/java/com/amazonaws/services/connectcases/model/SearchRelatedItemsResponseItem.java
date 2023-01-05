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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of items that represent RelatedItems.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchRelatedItemsResponseItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRelatedItemsResponseItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time at which a related item was associated with a case.
     * </p>
     */
    private java.util.Date associationTime;
    /**
     * <p>
     * Represents the content of a particular type of related item.
     * </p>
     */
    private RelatedItemContent content;
    /**
     * <p>
     * Unique identifier of a related item.
     * </p>
     */
    private String relatedItemId;
    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Type of a related item.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Time at which a related item was associated with a case.
     * </p>
     * 
     * @param associationTime
     *        Time at which a related item was associated with a case.
     */

    public void setAssociationTime(java.util.Date associationTime) {
        this.associationTime = associationTime;
    }

    /**
     * <p>
     * Time at which a related item was associated with a case.
     * </p>
     * 
     * @return Time at which a related item was associated with a case.
     */

    public java.util.Date getAssociationTime() {
        return this.associationTime;
    }

    /**
     * <p>
     * Time at which a related item was associated with a case.
     * </p>
     * 
     * @param associationTime
     *        Time at which a related item was associated with a case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRelatedItemsResponseItem withAssociationTime(java.util.Date associationTime) {
        setAssociationTime(associationTime);
        return this;
    }

    /**
     * <p>
     * Represents the content of a particular type of related item.
     * </p>
     * 
     * @param content
     *        Represents the content of a particular type of related item.
     */

    public void setContent(RelatedItemContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Represents the content of a particular type of related item.
     * </p>
     * 
     * @return Represents the content of a particular type of related item.
     */

    public RelatedItemContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Represents the content of a particular type of related item.
     * </p>
     * 
     * @param content
     *        Represents the content of a particular type of related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRelatedItemsResponseItem withContent(RelatedItemContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Unique identifier of a related item.
     * </p>
     * 
     * @param relatedItemId
     *        Unique identifier of a related item.
     */

    public void setRelatedItemId(String relatedItemId) {
        this.relatedItemId = relatedItemId;
    }

    /**
     * <p>
     * Unique identifier of a related item.
     * </p>
     * 
     * @return Unique identifier of a related item.
     */

    public String getRelatedItemId() {
        return this.relatedItemId;
    }

    /**
     * <p>
     * Unique identifier of a related item.
     * </p>
     * 
     * @param relatedItemId
     *        Unique identifier of a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRelatedItemsResponseItem withRelatedItemId(String relatedItemId) {
        setRelatedItemId(relatedItemId);
        return this;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @return A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *         control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRelatedItemsResponseItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SearchRelatedItemsResponseItem#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SearchRelatedItemsResponseItem addTagsEntry(String key, String value) {
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

    public SearchRelatedItemsResponseItem clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Type of a related item.
     * </p>
     * 
     * @param type
     *        Type of a related item.
     * @see RelatedItemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of a related item.
     * </p>
     * 
     * @return Type of a related item.
     * @see RelatedItemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of a related item.
     * </p>
     * 
     * @param type
     *        Type of a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelatedItemType
     */

    public SearchRelatedItemsResponseItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of a related item.
     * </p>
     * 
     * @param type
     *        Type of a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelatedItemType
     */

    public SearchRelatedItemsResponseItem withType(RelatedItemType type) {
        this.type = type.toString();
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
        if (getAssociationTime() != null)
            sb.append("AssociationTime: ").append(getAssociationTime()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getRelatedItemId() != null)
            sb.append("RelatedItemId: ").append(getRelatedItemId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRelatedItemsResponseItem == false)
            return false;
        SearchRelatedItemsResponseItem other = (SearchRelatedItemsResponseItem) obj;
        if (other.getAssociationTime() == null ^ this.getAssociationTime() == null)
            return false;
        if (other.getAssociationTime() != null && other.getAssociationTime().equals(this.getAssociationTime()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getRelatedItemId() == null ^ this.getRelatedItemId() == null)
            return false;
        if (other.getRelatedItemId() != null && other.getRelatedItemId().equals(this.getRelatedItemId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationTime() == null) ? 0 : getAssociationTime().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getRelatedItemId() == null) ? 0 : getRelatedItemId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SearchRelatedItemsResponseItem clone() {
        try {
            return (SearchRelatedItemsResponseItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.SearchRelatedItemsResponseItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
