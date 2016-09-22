/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * This contains a ClusterSummaryList with the cluster details; for example, the cluster IDs, names, and status.
 * </p>
 */
public class ListClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of clusters for the account based on the given filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSummary> clusters;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of clusters for the account based on the given filters.
     * </p>
     * 
     * @return The list of clusters for the account based on the given filters.
     */

    public java.util.List<ClusterSummary> getClusters() {
        if (clusters == null) {
            clusters = new com.amazonaws.internal.SdkInternalList<ClusterSummary>();
        }
        return clusters;
    }

    /**
     * <p>
     * The list of clusters for the account based on the given filters.
     * </p>
     * 
     * @param clusters
     *        The list of clusters for the account based on the given filters.
     */

    public void setClusters(java.util.Collection<ClusterSummary> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new com.amazonaws.internal.SdkInternalList<ClusterSummary>(clusters);
    }

    /**
     * <p>
     * The list of clusters for the account based on the given filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        The list of clusters for the account based on the given filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusters(ClusterSummary... clusters) {
        if (this.clusters == null) {
            setClusters(new com.amazonaws.internal.SdkInternalList<ClusterSummary>(clusters.length));
        }
        for (ClusterSummary ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of clusters for the account based on the given filters.
     * </p>
     * 
     * @param clusters
     *        The list of clusters for the account based on the given filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusters(java.util.Collection<ClusterSummary> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusters() != null)
            sb.append("Clusters: " + getClusters() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersResult == false)
            return false;
        ListClustersResult other = (ListClustersResult) obj;
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersResult clone() {
        try {
            return (ListClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
