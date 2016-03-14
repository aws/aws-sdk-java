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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * </p>
 */
public class DescribeTagsResult implements Serializable, Cloneable {

    /**
     * A list of tags with their associated resources.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TaggedResource> taggedResources;

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     */
    private String marker;

    /**
     * A list of tags with their associated resources.
     *
     * @return A list of tags with their associated resources.
     */
    public java.util.List<TaggedResource> getTaggedResources() {
        if (taggedResources == null) {
              taggedResources = new com.amazonaws.internal.ListWithAutoConstructFlag<TaggedResource>();
              taggedResources.setAutoConstruct(true);
        }
        return taggedResources;
    }
    
    /**
     * A list of tags with their associated resources.
     *
     * @param taggedResources A list of tags with their associated resources.
     */
    public void setTaggedResources(java.util.Collection<TaggedResource> taggedResources) {
        if (taggedResources == null) {
            this.taggedResources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TaggedResource> taggedResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TaggedResource>(taggedResources.size());
        taggedResourcesCopy.addAll(taggedResources);
        this.taggedResources = taggedResourcesCopy;
    }
    
    /**
     * A list of tags with their associated resources.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTaggedResources(java.util.Collection)} or {@link
     * #withTaggedResources(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taggedResources A list of tags with their associated resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withTaggedResources(TaggedResource... taggedResources) {
        if (getTaggedResources() == null) setTaggedResources(new java.util.ArrayList<TaggedResource>(taggedResources.length));
        for (TaggedResource value : taggedResources) {
            getTaggedResources().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags with their associated resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taggedResources A list of tags with their associated resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withTaggedResources(java.util.Collection<TaggedResource> taggedResources) {
        if (taggedResources == null) {
            this.taggedResources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TaggedResource> taggedResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TaggedResource>(taggedResources.size());
            taggedResourcesCopy.addAll(taggedResources);
            this.taggedResources = taggedResourcesCopy;
        }

        return this;
    }

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @return A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getTaggedResources() != null) sb.append("TaggedResources: " + getTaggedResources() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaggedResources() == null) ? 0 : getTaggedResources().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTagsResult == false) return false;
        DescribeTagsResult other = (DescribeTagsResult)obj;
        
        if (other.getTaggedResources() == null ^ this.getTaggedResources() == null) return false;
        if (other.getTaggedResources() != null && other.getTaggedResources().equals(this.getTaggedResources()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
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
    