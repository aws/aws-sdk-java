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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeTagsResult implements Serializable, Cloneable {

    /**
     * If the request included a <code>Marker</code>, the response returns
     * that value in this field.
     */
    private String marker;

    /**
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     */
    private String nextMarker;

    /**
     * If the request included a <code>Marker</code>, the response returns
     * that value in this field.
     *
     * @return If the request included a <code>Marker</code>, the response returns
     *         that value in this field.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If the request included a <code>Marker</code>, the response returns
     * that value in this field.
     *
     * @param marker If the request included a <code>Marker</code>, the response returns
     *         that value in this field.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If the request included a <code>Marker</code>, the response returns
     * that value in this field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker If the request included a <code>Marker</code>, the response returns
     *         that value in this field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     *
     * @return Returns tags associated with the file system as an array of
     *         <code>Tag</code> objects.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     *
     * @param tags Returns tags associated with the file system as an array of
     *         <code>Tag</code> objects.
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
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Returns tags associated with the file system as an array of
     *         <code>Tag</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Returns tags associated with the file system as an array of
     *         <code>Tag</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withTags(java.util.Collection<Tag> tags) {
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
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     *
     * @return If a value is present, there are more tags to return. In a subsequent
     *         request, you can provide the value of <code>NextMarker</code> as the
     *         value of the <code>Marker</code> parameter in your next request to
     *         retrieve the next set of tags.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     *
     * @param nextMarker If a value is present, there are more tags to return. In a subsequent
     *         request, you can provide the value of <code>NextMarker</code> as the
     *         value of the <code>Marker</code> parameter in your next request to
     *         retrieve the next set of tags.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker If a value is present, there are more tags to return. In a subsequent
     *         request, you can provide the value of <code>NextMarker</code> as the
     *         value of the <code>Marker</code> parameter in your next request to
     *         retrieve the next set of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTagsResult == false) return false;
        DescribeTagsResult other = (DescribeTagsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeTagsResult clone() {
        try {
            return (DescribeTagsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    