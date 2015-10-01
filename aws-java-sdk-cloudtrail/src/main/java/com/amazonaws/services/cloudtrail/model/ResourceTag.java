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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * A resource tag.
 * </p>
 */
public class ResourceTag implements Serializable, Cloneable {

    /**
     * Specifies the ARN of the resource.
     */
    private String resourceId;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsList;

    /**
     * Specifies the ARN of the resource.
     *
     * @return Specifies the ARN of the resource.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * Specifies the ARN of the resource.
     *
     * @param resourceId Specifies the ARN of the resource.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * Specifies the ARN of the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId Specifies the ARN of the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceTag withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTagsList() {
        if (tagsList == null) {
              tagsList = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tagsList.setAutoConstruct(true);
        }
        return tagsList;
    }
    
    /**
     * A list of tags.
     *
     * @param tagsList A list of tags.
     */
    public void setTagsList(java.util.Collection<Tag> tagsList) {
        if (tagsList == null) {
            this.tagsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tagsList.size());
        tagsListCopy.addAll(tagsList);
        this.tagsList = tagsListCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagsList(java.util.Collection)} or {@link
     * #withTagsList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagsList A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceTag withTagsList(Tag... tagsList) {
        if (getTagsList() == null) setTagsList(new java.util.ArrayList<Tag>(tagsList.length));
        for (Tag value : tagsList) {
            getTagsList().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagsList A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceTag withTagsList(java.util.Collection<Tag> tagsList) {
        if (tagsList == null) {
            this.tagsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tagsList.size());
            tagsListCopy.addAll(tagsList);
            this.tagsList = tagsListCopy;
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
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getTagsList() != null) sb.append("TagsList: " + getTagsList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getTagsList() == null) ? 0 : getTagsList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceTag == false) return false;
        ResourceTag other = (ResourceTag)obj;
        
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getTagsList() == null ^ this.getTagsList() == null) return false;
        if (other.getTagsList() != null && other.getTagsList().equals(this.getTagsList()) == false) return false; 
        return true;
    }
    
    @Override
    public ResourceTag clone() {
        try {
            return (ResourceTag) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    