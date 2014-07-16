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
 * A complex type containing tags for the specified resources.
 * </p>
 */
public class ListTagsForResourcesResult implements Serializable {

    /**
     * A list of <code>ResourceTagSet</code>s containing tags associated with
     * the specified resources.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTagSet> resourceTagSets;

    /**
     * A list of <code>ResourceTagSet</code>s containing tags associated with
     * the specified resources.
     *
     * @return A list of <code>ResourceTagSet</code>s containing tags associated with
     *         the specified resources.
     */
    public java.util.List<ResourceTagSet> getResourceTagSets() {
        if (resourceTagSets == null) {
              resourceTagSets = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTagSet>();
              resourceTagSets.setAutoConstruct(true);
        }
        return resourceTagSets;
    }
    
    /**
     * A list of <code>ResourceTagSet</code>s containing tags associated with
     * the specified resources.
     *
     * @param resourceTagSets A list of <code>ResourceTagSet</code>s containing tags associated with
     *         the specified resources.
     */
    public void setResourceTagSets(java.util.Collection<ResourceTagSet> resourceTagSets) {
        if (resourceTagSets == null) {
            this.resourceTagSets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTagSet> resourceTagSetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTagSet>(resourceTagSets.size());
        resourceTagSetsCopy.addAll(resourceTagSets);
        this.resourceTagSets = resourceTagSetsCopy;
    }
    
    /**
     * A list of <code>ResourceTagSet</code>s containing tags associated with
     * the specified resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTagSets A list of <code>ResourceTagSet</code>s containing tags associated with
     *         the specified resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourcesResult withResourceTagSets(ResourceTagSet... resourceTagSets) {
        if (getResourceTagSets() == null) setResourceTagSets(new java.util.ArrayList<ResourceTagSet>(resourceTagSets.length));
        for (ResourceTagSet value : resourceTagSets) {
            getResourceTagSets().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>ResourceTagSet</code>s containing tags associated with
     * the specified resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTagSets A list of <code>ResourceTagSet</code>s containing tags associated with
     *         the specified resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourcesResult withResourceTagSets(java.util.Collection<ResourceTagSet> resourceTagSets) {
        if (resourceTagSets == null) {
            this.resourceTagSets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTagSet> resourceTagSetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTagSet>(resourceTagSets.size());
            resourceTagSetsCopy.addAll(resourceTagSets);
            this.resourceTagSets = resourceTagSetsCopy;
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
        if (getResourceTagSets() != null) sb.append("ResourceTagSets: " + getResourceTagSets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceTagSets() == null) ? 0 : getResourceTagSets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourcesResult == false) return false;
        ListTagsForResourcesResult other = (ListTagsForResourcesResult)obj;
        
        if (other.getResourceTagSets() == null ^ this.getResourceTagSets() == null) return false;
        if (other.getResourceTagSets() != null && other.getResourceTagSets().equals(this.getResourceTagSets()) == false) return false; 
        return true;
    }
    
}
    