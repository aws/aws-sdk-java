/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing a resource and its associated tags.
 * </p>
 */
public class ResourceTagSet implements Serializable {

    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     */
    private String resourceType;

    /**
     * The ID for the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String resourceId;

    /**
     * The tags associated with the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @return The type of the resource. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @see TagResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resource. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @see TagResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resource. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TagResourceType
     */
    public ResourceTagSet withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resource. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @see TagResourceType
     */
    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resource. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TagResourceType
     */
    public ResourceTagSet withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The ID for the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The ID for the specified resource.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID for the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param resourceId The ID for the specified resource.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID for the specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param resourceId The ID for the specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceTagSet withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The tags associated with the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return The tags associated with the specified resource.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tags associated with the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param tags The tags associated with the specified resource.
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
     * The tags associated with the specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param tags The tags associated with the specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceTagSet withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tags associated with the specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param tags The tags associated with the specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceTagSet withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceTagSet == false) return false;
        ResourceTagSet other = (ResourceTagSet)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    