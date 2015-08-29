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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * 
 */
public class ListDiscoveredResourcesResult implements Serializable, Cloneable {

    /**
     * The details that identify a resource that is discovered by AWS Config,
     * including the resource type, ID, and (if available) the custom
     * resource name.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ResourceIdentifier> resourceIdentifiers;

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     */
    private String nextToken;

    /**
     * The details that identify a resource that is discovered by AWS Config,
     * including the resource type, ID, and (if available) the custom
     * resource name.
     *
     * @return The details that identify a resource that is discovered by AWS Config,
     *         including the resource type, ID, and (if available) the custom
     *         resource name.
     */
    public java.util.List<ResourceIdentifier> getResourceIdentifiers() {
        if (resourceIdentifiers == null) {
              resourceIdentifiers = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceIdentifier>();
              resourceIdentifiers.setAutoConstruct(true);
        }
        return resourceIdentifiers;
    }
    
    /**
     * The details that identify a resource that is discovered by AWS Config,
     * including the resource type, ID, and (if available) the custom
     * resource name.
     *
     * @param resourceIdentifiers The details that identify a resource that is discovered by AWS Config,
     *         including the resource type, ID, and (if available) the custom
     *         resource name.
     */
    public void setResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ResourceIdentifier> resourceIdentifiersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceIdentifier>(resourceIdentifiers.size());
        resourceIdentifiersCopy.addAll(resourceIdentifiers);
        this.resourceIdentifiers = resourceIdentifiersCopy;
    }
    
    /**
     * The details that identify a resource that is discovered by AWS Config,
     * including the resource type, ID, and (if available) the custom
     * resource name.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceIdentifiers(java.util.Collection)} or
     * {@link #withResourceIdentifiers(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIdentifiers The details that identify a resource that is discovered by AWS Config,
     *         including the resource type, ID, and (if available) the custom
     *         resource name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesResult withResourceIdentifiers(ResourceIdentifier... resourceIdentifiers) {
        if (getResourceIdentifiers() == null) setResourceIdentifiers(new java.util.ArrayList<ResourceIdentifier>(resourceIdentifiers.length));
        for (ResourceIdentifier value : resourceIdentifiers) {
            getResourceIdentifiers().add(value);
        }
        return this;
    }
    
    /**
     * The details that identify a resource that is discovered by AWS Config,
     * including the resource type, ID, and (if available) the custom
     * resource name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIdentifiers The details that identify a resource that is discovered by AWS Config,
     *         including the resource type, ID, and (if available) the custom
     *         resource name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesResult withResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ResourceIdentifier> resourceIdentifiersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceIdentifier>(resourceIdentifiers.size());
            resourceIdentifiersCopy.addAll(resourceIdentifiers);
            this.resourceIdentifiers = resourceIdentifiersCopy;
        }

        return this;
    }

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     *
     * @return The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     *
     * @param nextToken The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceIdentifiers() != null) sb.append("ResourceIdentifiers: " + getResourceIdentifiers() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDiscoveredResourcesResult == false) return false;
        ListDiscoveredResourcesResult other = (ListDiscoveredResourcesResult)obj;
        
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null) return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListDiscoveredResourcesResult clone() {
        try {
            return (ListDiscoveredResourcesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    