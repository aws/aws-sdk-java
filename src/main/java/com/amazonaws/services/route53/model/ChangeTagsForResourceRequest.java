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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#changeTagsForResource(ChangeTagsForResourceRequest) ChangeTagsForResource operation}.
 * 
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#changeTagsForResource(ChangeTagsForResourceRequest)
 */
public class ChangeTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     */
    private String resourceType;

    /**
     * The ID of the resource for which you want to add, change, or delete
     * tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String resourceId;

    /**
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or
     * update for the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> addTags;

    /**
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> removeTagKeys;

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
    public ChangeTagsForResourceRequest withResourceType(String resourceType) {
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
    public ChangeTagsForResourceRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The ID of the resource for which you want to add, change, or delete
     * tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The ID of the resource for which you want to add, change, or delete
     *         tags.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource for which you want to add, change, or delete
     * tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param resourceId The ID of the resource for which you want to add, change, or delete
     *         tags.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource for which you want to add, change, or delete
     * tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param resourceId The ID of the resource for which you want to add, change, or delete
     *         tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeTagsForResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or
     * update for the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return A complex type that contains a list of <code>Tag</code> elements. Each
     *         <code>Tag</code> element identifies a tag that you want to add or
     *         update for the specified resource.
     */
    public java.util.List<Tag> getAddTags() {
        if (addTags == null) {
              addTags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              addTags.setAutoConstruct(true);
        }
        return addTags;
    }
    
    /**
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or
     * update for the specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param addTags A complex type that contains a list of <code>Tag</code> elements. Each
     *         <code>Tag</code> element identifies a tag that you want to add or
     *         update for the specified resource.
     */
    public void setAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> addTagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(addTags.size());
        addTagsCopy.addAll(addTags);
        this.addTags = addTagsCopy;
    }
    
    /**
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or
     * update for the specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param addTags A complex type that contains a list of <code>Tag</code> elements. Each
     *         <code>Tag</code> element identifies a tag that you want to add or
     *         update for the specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeTagsForResourceRequest withAddTags(Tag... addTags) {
        if (getAddTags() == null) setAddTags(new java.util.ArrayList<Tag>(addTags.length));
        for (Tag value : addTags) {
            getAddTags().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or
     * update for the specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param addTags A complex type that contains a list of <code>Tag</code> elements. Each
     *         <code>Tag</code> element identifies a tag that you want to add or
     *         update for the specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeTagsForResourceRequest withAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> addTagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(addTags.size());
            addTagsCopy.addAll(addTags);
            this.addTags = addTagsCopy;
        }

        return this;
    }

    /**
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return A list of <code>Tag</code> keys that you want to remove from the
     *         specified resource.
     */
    public java.util.List<String> getRemoveTagKeys() {
        if (removeTagKeys == null) {
              removeTagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              removeTagKeys.setAutoConstruct(true);
        }
        return removeTagKeys;
    }
    
    /**
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param removeTagKeys A list of <code>Tag</code> keys that you want to remove from the
     *         specified resource.
     */
    public void setRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        if (removeTagKeys == null) {
            this.removeTagKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> removeTagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(removeTagKeys.size());
        removeTagKeysCopy.addAll(removeTagKeys);
        this.removeTagKeys = removeTagKeysCopy;
    }
    
    /**
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param removeTagKeys A list of <code>Tag</code> keys that you want to remove from the
     *         specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeTagsForResourceRequest withRemoveTagKeys(String... removeTagKeys) {
        if (getRemoveTagKeys() == null) setRemoveTagKeys(new java.util.ArrayList<String>(removeTagKeys.length));
        for (String value : removeTagKeys) {
            getRemoveTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param removeTagKeys A list of <code>Tag</code> keys that you want to remove from the
     *         specified resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeTagsForResourceRequest withRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        if (removeTagKeys == null) {
            this.removeTagKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> removeTagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(removeTagKeys.size());
            removeTagKeysCopy.addAll(removeTagKeys);
            this.removeTagKeys = removeTagKeysCopy;
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
        if (getAddTags() != null) sb.append("AddTags: " + getAddTags() + ",");
        if (getRemoveTagKeys() != null) sb.append("RemoveTagKeys: " + getRemoveTagKeys() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getAddTags() == null) ? 0 : getAddTags().hashCode()); 
        hashCode = prime * hashCode + ((getRemoveTagKeys() == null) ? 0 : getRemoveTagKeys().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeTagsForResourceRequest == false) return false;
        ChangeTagsForResourceRequest other = (ChangeTagsForResourceRequest)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getAddTags() == null ^ this.getAddTags() == null) return false;
        if (other.getAddTags() != null && other.getAddTags().equals(this.getAddTags()) == false) return false; 
        if (other.getRemoveTagKeys() == null ^ this.getRemoveTagKeys() == null) return false;
        if (other.getRemoveTagKeys() != null && other.getRemoveTagKeys().equals(this.getRemoveTagKeys()) == false) return false; 
        return true;
    }
    
}
    