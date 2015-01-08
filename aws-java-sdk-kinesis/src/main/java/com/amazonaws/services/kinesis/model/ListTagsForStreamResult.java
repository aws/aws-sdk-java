/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <code>ListTagsForStream</code> .
 * </p>
 */
public class ListTagsForStreamResult implements Serializable {

    /**
     * A list of tags associated with <code>StreamName</code>, starting with
     * the first tag after <code>ExclusiveStartTagKey</code> and up to the
     * specified <code>Limit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     * the last tag returned.
     */
    private Boolean hasMoreTags;

    /**
     * A list of tags associated with <code>StreamName</code>, starting with
     * the first tag after <code>ExclusiveStartTagKey</code> and up to the
     * specified <code>Limit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @return A list of tags associated with <code>StreamName</code>, starting with
     *         the first tag after <code>ExclusiveStartTagKey</code> and up to the
     *         specified <code>Limit</code>.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags associated with <code>StreamName</code>, starting with
     * the first tag after <code>ExclusiveStartTagKey</code> and up to the
     * specified <code>Limit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param tags A list of tags associated with <code>StreamName</code>, starting with
     *         the first tag after <code>ExclusiveStartTagKey</code> and up to the
     *         specified <code>Limit</code>.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags associated with <code>StreamName</code>, starting with
     * the first tag after <code>ExclusiveStartTagKey</code> and up to the
     * specified <code>Limit</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param tags A list of tags associated with <code>StreamName</code>, starting with
     *         the first tag after <code>ExclusiveStartTagKey</code> and up to the
     *         specified <code>Limit</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForStreamResult withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags associated with <code>StreamName</code>, starting with
     * the first tag after <code>ExclusiveStartTagKey</code> and up to the
     * specified <code>Limit</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param tags A list of tags associated with <code>StreamName</code>, starting with
     *         the first tag after <code>ExclusiveStartTagKey</code> and up to the
     *         specified <code>Limit</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForStreamResult withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     * the last tag returned.
     *
     * @return If set to <code>true</code>, more tags are available. To request
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     *         the last tag returned.
     */
    public Boolean isHasMoreTags() {
        return hasMoreTags;
    }
    
    /**
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     * the last tag returned.
     *
     * @param hasMoreTags If set to <code>true</code>, more tags are available. To request
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     *         the last tag returned.
     */
    public void setHasMoreTags(Boolean hasMoreTags) {
        this.hasMoreTags = hasMoreTags;
    }
    
    /**
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     * the last tag returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreTags If set to <code>true</code>, more tags are available. To request
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     *         the last tag returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForStreamResult withHasMoreTags(Boolean hasMoreTags) {
        this.hasMoreTags = hasMoreTags;
        return this;
    }

    /**
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     * the last tag returned.
     *
     * @return If set to <code>true</code>, more tags are available. To request
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the key of
     *         the last tag returned.
     */
    public Boolean getHasMoreTags() {
        return hasMoreTags;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (isHasMoreTags() != null) sb.append("HasMoreTags: " + isHasMoreTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((isHasMoreTags() == null) ? 0 : isHasMoreTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForStreamResult == false) return false;
        ListTagsForStreamResult other = (ListTagsForStreamResult)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.isHasMoreTags() == null ^ this.isHasMoreTags() == null) return false;
        if (other.isHasMoreTags() != null && other.isHasMoreTags().equals(this.isHasMoreTags()) == false) return false; 
        return true;
    }
    
}
    