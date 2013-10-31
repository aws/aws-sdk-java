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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listClusters(ListClustersRequest) ListClusters operation}.
 * <p>
 * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example,
 * filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the
 * paging of the cluster list across multiple ListClusters calls.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listClusters(ListClustersRequest)
 */
public class ListClustersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The creation date and time beginning value filter for listing clusters
     * .
     */
    private java.util.Date createdAfter;

    /**
     * The creation date and time end value filter for listing clusters .
     */
    private java.util.Date createdBefore;

    /**
     * The cluster state filters to apply when listing clusters.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterStates;

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String marker;

    /**
     * The creation date and time beginning value filter for listing clusters
     * .
     *
     * @return The creation date and time beginning value filter for listing clusters
     *         .
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }
    
    /**
     * The creation date and time beginning value filter for listing clusters
     * .
     *
     * @param createdAfter The creation date and time beginning value filter for listing clusters
     *         .
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }
    
    /**
     * The creation date and time beginning value filter for listing clusters
     * .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAfter The creation date and time beginning value filter for listing clusters
     *         .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListClustersRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * The creation date and time end value filter for listing clusters .
     *
     * @return The creation date and time end value filter for listing clusters .
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }
    
    /**
     * The creation date and time end value filter for listing clusters .
     *
     * @param createdBefore The creation date and time end value filter for listing clusters .
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }
    
    /**
     * The creation date and time end value filter for listing clusters .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdBefore The creation date and time end value filter for listing clusters .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListClustersRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * The cluster state filters to apply when listing clusters.
     *
     * @return The cluster state filters to apply when listing clusters.
     */
    public java.util.List<String> getClusterStates() {
        if (clusterStates == null) {
              clusterStates = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clusterStates.setAutoConstruct(true);
        }
        return clusterStates;
    }
    
    /**
     * The cluster state filters to apply when listing clusters.
     *
     * @param clusterStates The cluster state filters to apply when listing clusters.
     */
    public void setClusterStates(java.util.Collection<String> clusterStates) {
        if (clusterStates == null) {
            this.clusterStates = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterStatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusterStates.size());
        clusterStatesCopy.addAll(clusterStates);
        this.clusterStates = clusterStatesCopy;
    }
    
    /**
     * The cluster state filters to apply when listing clusters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterStates The cluster state filters to apply when listing clusters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListClustersRequest withClusterStates(String... clusterStates) {
        if (getClusterStates() == null) setClusterStates(new java.util.ArrayList<String>(clusterStates.length));
        for (String value : clusterStates) {
            getClusterStates().add(value);
        }
        return this;
    }
    
    /**
     * The cluster state filters to apply when listing clusters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterStates The cluster state filters to apply when listing clusters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListClustersRequest withClusterStates(java.util.Collection<String> clusterStates) {
        if (clusterStates == null) {
            this.clusterStates = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterStatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusterStates.size());
            clusterStatesCopy.addAll(clusterStates);
            this.clusterStates = clusterStatesCopy;
        }

        return this;
    }

    /**
     * The cluster state filters to apply when listing clusters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterStates The cluster state filters to apply when listing clusters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListClustersRequest withClusterStates(ClusterState... clusterStates) {
        java.util.ArrayList<String> clusterStatesCopy = new java.util.ArrayList<String>(clusterStates.length);
        for (ClusterState member : clusterStates) {
            clusterStatesCopy.add(member.toString());
        }
        if (getClusterStates() == null) {
            setClusterStates(clusterStatesCopy);
        } else {
            getClusterStates().addAll(clusterStatesCopy);
        }
        return this;
    }

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListClustersRequest withMarker(String marker) {
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
        if (getCreatedAfter() != null) sb.append("CreatedAfter: " + getCreatedAfter() + ",");
        if (getCreatedBefore() != null) sb.append("CreatedBefore: " + getCreatedBefore() + ",");
        if (getClusterStates() != null) sb.append("ClusterStates: " + getClusterStates() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode()); 
        hashCode = prime * hashCode + ((getClusterStates() == null) ? 0 : getClusterStates().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListClustersRequest == false) return false;
        ListClustersRequest other = (ListClustersRequest)obj;
        
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null) return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false) return false; 
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null) return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false) return false; 
        if (other.getClusterStates() == null ^ this.getClusterStates() == null) return false;
        if (other.getClusterStates() != null && other.getClusterStates().equals(this.getClusterStates()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    