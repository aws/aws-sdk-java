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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listTagsForResource(ListTagsForResourceRequest) ListTagsForResource operation}.
 * 
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listTagsForResource(ListTagsForResourceRequest)
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The type of the resource. The resource type for health checks is
     * <code>healthcheck</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck
     */
    private String resourceType;

    /**
     * The ID of the resource for which you want to retrieve tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String resourceId;

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
    public ListTagsForResourceRequest withResourceType(String resourceType) {
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
    public ListTagsForResourceRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The ID of the resource for which you want to retrieve tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The ID of the resource for which you want to retrieve tags.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource for which you want to retrieve tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param resourceId The ID of the resource for which you want to retrieve tags.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource for which you want to retrieve tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param resourceId The ID of the resource for which you want to retrieve tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourceRequest == false) return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        return true;
    }
    
}
    