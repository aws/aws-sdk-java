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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listTagsForResources(ListTagsForResourcesRequest) ListTagsForResources operation}.
 * 
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listTagsForResources(ListTagsForResourcesRequest)
 */
public class ListTagsForResourcesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The type of the resources. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     */
    private String resourceType;

    /**
     * A complex type that contains the ResourceId element for each resource
     * for which you want to get a list of tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIds;

    /**
     * The type of the resources. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @return The type of the resources. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @see TagResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of the resources. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resources. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @see TagResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of the resources. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resources. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TagResourceType
     */
    public ListTagsForResourcesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of the resources. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resources. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @see TagResourceType
     */
    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The type of the resources. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     *
     * @param resourceType The type of the resources. The resource type for health checks is
     *         <code>healthcheck</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TagResourceType
     */
    public ListTagsForResourcesRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * A complex type that contains the ResourceId element for each resource
     * for which you want to get a list of tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return A complex type that contains the ResourceId element for each resource
     *         for which you want to get a list of tags.
     */
    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
              resourceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceIds.setAutoConstruct(true);
        }
        return resourceIds;
    }
    
    /**
     * A complex type that contains the ResourceId element for each resource
     * for which you want to get a list of tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param resourceIds A complex type that contains the ResourceId element for each resource
     *         for which you want to get a list of tags.
     */
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIds.size());
        resourceIdsCopy.addAll(resourceIds);
        this.resourceIds = resourceIdsCopy;
    }
    
    /**
     * A complex type that contains the ResourceId element for each resource
     * for which you want to get a list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param resourceIds A complex type that contains the ResourceId element for each resource
     *         for which you want to get a list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourcesRequest withResourceIds(String... resourceIds) {
        if (getResourceIds() == null) setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        for (String value : resourceIds) {
            getResourceIds().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains the ResourceId element for each resource
     * for which you want to get a list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param resourceIds A complex type that contains the ResourceId element for each resource
     *         for which you want to get a list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourcesRequest withResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIds.size());
            resourceIdsCopy.addAll(resourceIds);
            this.resourceIds = resourceIdsCopy;
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
        if (getResourceIds() != null) sb.append("ResourceIds: " + getResourceIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourcesRequest == false) return false;
        ListTagsForResourcesRequest other = (ListTagsForResourcesRequest)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceIds() == null ^ this.getResourceIds() == null) return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false) return false; 
        return true;
    }
    
}
    