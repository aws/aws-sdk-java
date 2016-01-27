/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output from the <i>AddTagsToResource</i> ,
 * <i>ListTagsOnResource</i> , and
 * <i>RemoveTagsFromResource</i> actions.
 * </p>
 */
public class ListTagsForResourceResult implements Serializable, Cloneable {

    /**
     * A list of cost allocation tags as key-value pairs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagList;

    /**
     * A list of cost allocation tags as key-value pairs.
     *
     * @return A list of cost allocation tags as key-value pairs.
     */
    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
              tagList = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tagList.setAutoConstruct(true);
        }
        return tagList;
    }
    
    /**
     * A list of cost allocation tags as key-value pairs.
     *
     * @param tagList A list of cost allocation tags as key-value pairs.
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
     * A list of cost allocation tags as key-value pairs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagList(java.util.Collection)} or {@link
     * #withTagList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagList A list of cost allocation tags as key-value pairs.
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
     * A list of cost allocation tags as key-value pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagList A list of cost allocation tags as key-value pairs.
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
    
    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    