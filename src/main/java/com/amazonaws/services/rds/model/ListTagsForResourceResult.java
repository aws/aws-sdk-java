/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * </p>
 */
public class ListTagsForResourceResult implements Serializable {

    /**
     * List of tags returned by the ListTagsForResource operation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagList;

    /**
     * List of tags returned by the ListTagsForResource operation.
     *
     * @return List of tags returned by the ListTagsForResource operation.
     */
    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
              tagList = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tagList.setAutoConstruct(true);
        }
        return tagList;
    }
    
    /**
     * List of tags returned by the ListTagsForResource operation.
     *
     * @param tagList List of tags returned by the ListTagsForResource operation.
     */
    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tagList.size());
        tagListCopy.addAll(tagList);
        this.tagList = tagListCopy;
    }
    
    /**
     * List of tags returned by the ListTagsForResource operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagList List of tags returned by the ListTagsForResource operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListTagsForResourceResult withTagList(Tag... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<Tag>(tagList.length));
        for (Tag value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * List of tags returned by the ListTagsForResource operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagList List of tags returned by the ListTagsForResource operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListTagsForResourceResult withTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tagList.size());
            tagListCopy.addAll(tagList);
            this.tagList = tagListCopy;
        }

        return this;
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
        if (getTagList() != null) sb.append("TagList: " + getTagList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourceResult == false) return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult)obj;
        
        if (other.getTagList() == null ^ this.getTagList() == null) return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false) return false; 
        return true;
    }
    
}
    