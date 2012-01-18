/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * </p>
 */
public class DescribeTagsResult {

    /**
     * A list of the tags for the specified resources.
     */
    private java.util.List<TagDescription> tags;

    /**
     * A list of the tags for the specified resources.
     *
     * @return A list of the tags for the specified resources.
     */
    public java.util.List<TagDescription> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<TagDescription>();
        }
        return tags;
    }
    
    /**
     * A list of the tags for the specified resources.
     *
     * @param tags A list of the tags for the specified resources.
     */
    public void setTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<TagDescription> tagsCopy = new java.util.ArrayList<TagDescription>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of the tags for the specified resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of the tags for the specified resources.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTagsResult withTags(TagDescription... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<TagDescription>(tags.length));
        for (TagDescription value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of the tags for the specified resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of the tags for the specified resources.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTagsResult withTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<TagDescription> tagsCopy = new java.util.ArrayList<TagDescription>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (tags != null) sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeTagsResult == false) return false;
        DescribeTagsResult other = (DescribeTagsResult)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    