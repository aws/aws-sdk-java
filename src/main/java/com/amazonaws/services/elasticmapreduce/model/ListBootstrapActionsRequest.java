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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listBootstrapActions(ListBootstrapActionsRequest) ListBootstrapActions operation}.
 * <p>
 * Provides information about the bootstrap actions associated with a
 * cluster.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listBootstrapActions(ListBootstrapActionsRequest)
 */
public class ListBootstrapActionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The cluster identifier for the bootstrap actions to list.
     */
    private String clusterId;

    /**
     * The pagination token is a random string indicating whether there are
     * more results to fetch. Provide the pagination token from earlier API
     * calls to retrieve the next page of results. When the value is null,
     * all results have been returned.
     */
    private String marker;

    /**
     * The cluster identifier for the bootstrap actions to list.
     *
     * @return The cluster identifier for the bootstrap actions to list.
     */
    public String getClusterId() {
        return clusterId;
    }
    
    /**
     * The cluster identifier for the bootstrap actions to list.
     *
     * @param clusterId The cluster identifier for the bootstrap actions to list.
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }
    
    /**
     * The cluster identifier for the bootstrap actions to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterId The cluster identifier for the bootstrap actions to list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListBootstrapActionsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * The pagination token is a random string indicating whether there are
     * more results to fetch. Provide the pagination token from earlier API
     * calls to retrieve the next page of results. When the value is null,
     * all results have been returned.
     *
     * @return The pagination token is a random string indicating whether there are
     *         more results to fetch. Provide the pagination token from earlier API
     *         calls to retrieve the next page of results. When the value is null,
     *         all results have been returned.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token is a random string indicating whether there are
     * more results to fetch. Provide the pagination token from earlier API
     * calls to retrieve the next page of results. When the value is null,
     * all results have been returned.
     *
     * @param marker The pagination token is a random string indicating whether there are
     *         more results to fetch. Provide the pagination token from earlier API
     *         calls to retrieve the next page of results. When the value is null,
     *         all results have been returned.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token is a random string indicating whether there are
     * more results to fetch. Provide the pagination token from earlier API
     * calls to retrieve the next page of results. When the value is null,
     * all results have been returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The pagination token is a random string indicating whether there are
     *         more results to fetch. Provide the pagination token from earlier API
     *         calls to retrieve the next page of results. When the value is null,
     *         all results have been returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListBootstrapActionsRequest withMarker(String marker) {
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
        if (getClusterId() != null) sb.append("ClusterId: " + getClusterId() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListBootstrapActionsRequest == false) return false;
        ListBootstrapActionsRequest other = (ListBootstrapActionsRequest)obj;
        
        if (other.getClusterId() == null ^ this.getClusterId() == null) return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    