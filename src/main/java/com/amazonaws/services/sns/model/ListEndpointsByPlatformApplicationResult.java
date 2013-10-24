/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;


/**
 * <p>
 * Response for ListEndpointsByPlatformApplication action.
 * </p>
 */
public class ListEndpointsByPlatformApplicationResult implements Serializable {

    /**
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Endpoint> endpoints;

    /**
     * NextToken string is returned when calling
     * ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     */
    private String nextToken;

    /**
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     *
     * @return Endpoints returned for ListEndpointsByPlatformApplication action.
     */
    public java.util.List<Endpoint> getEndpoints() {
        if (endpoints == null) {
              endpoints = new com.amazonaws.internal.ListWithAutoConstructFlag<Endpoint>();
              endpoints.setAutoConstruct(true);
        }
        return endpoints;
    }
    
    /**
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     *
     * @param endpoints Endpoints returned for ListEndpointsByPlatformApplication action.
     */
    public void setEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Endpoint> endpointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Endpoint>(endpoints.size());
        endpointsCopy.addAll(endpoints);
        this.endpoints = endpointsCopy;
    }
    
    /**
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoints Endpoints returned for ListEndpointsByPlatformApplication action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListEndpointsByPlatformApplicationResult withEndpoints(Endpoint... endpoints) {
        if (getEndpoints() == null) setEndpoints(new java.util.ArrayList<Endpoint>(endpoints.length));
        for (Endpoint value : endpoints) {
            getEndpoints().add(value);
        }
        return this;
    }
    
    /**
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoints Endpoints returned for ListEndpointsByPlatformApplication action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListEndpointsByPlatformApplicationResult withEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Endpoint> endpointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Endpoint>(endpoints.size());
            endpointsCopy.addAll(endpoints);
            this.endpoints = endpointsCopy;
        }

        return this;
    }

    /**
     * NextToken string is returned when calling
     * ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     *
     * @return NextToken string is returned when calling
     *         ListEndpointsByPlatformApplication action if additional records are
     *         available after the first page results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * NextToken string is returned when calling
     * ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     *
     * @param nextToken NextToken string is returned when calling
     *         ListEndpointsByPlatformApplication action if additional records are
     *         available after the first page results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * NextToken string is returned when calling
     * ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken NextToken string is returned when calling
     *         ListEndpointsByPlatformApplication action if additional records are
     *         available after the first page results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListEndpointsByPlatformApplicationResult withNextToken(String nextToken) {
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
        if (getEndpoints() != null) sb.append("Endpoints: " + getEndpoints() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListEndpointsByPlatformApplicationResult == false) return false;
        ListEndpointsByPlatformApplicationResult other = (ListEndpointsByPlatformApplicationResult)obj;
        
        if (other.getEndpoints() == null ^ this.getEndpoints() == null) return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    