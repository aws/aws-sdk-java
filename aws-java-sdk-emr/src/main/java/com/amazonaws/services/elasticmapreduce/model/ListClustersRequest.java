/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This input determines how the ListClusters action filters the list of clusters that it returns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clusterStates;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     * 
     * @param createdAfter
     *        The creation date and time beginning value filter for listing clusters.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     * 
     * @return The creation date and time beginning value filter for listing clusters.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     * 
     * @param createdAfter
     *        The creation date and time beginning value filter for listing clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     * 
     * @param createdBefore
     *        The creation date and time end value filter for listing clusters.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     * 
     * @return The creation date and time end value filter for listing clusters.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     * 
     * @param createdBefore
     *        The creation date and time end value filter for listing clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * 
     * @return The cluster state filters to apply when listing clusters.
     * @see ClusterState
     */

    public java.util.List<String> getClusterStates() {
        if (clusterStates == null) {
            clusterStates = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clusterStates;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * 
     * @param clusterStates
     *        The cluster state filters to apply when listing clusters.
     * @see ClusterState
     */

    public void setClusterStates(java.util.Collection<String> clusterStates) {
        if (clusterStates == null) {
            this.clusterStates = null;
            return;
        }

        this.clusterStates = new com.amazonaws.internal.SdkInternalList<String>(clusterStates);
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterStates(java.util.Collection)} or {@link #withClusterStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clusterStates
     *        The cluster state filters to apply when listing clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ListClustersRequest withClusterStates(String... clusterStates) {
        if (this.clusterStates == null) {
            setClusterStates(new com.amazonaws.internal.SdkInternalList<String>(clusterStates.length));
        }
        for (String ele : clusterStates) {
            this.clusterStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * 
     * @param clusterStates
     *        The cluster state filters to apply when listing clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ListClustersRequest withClusterStates(java.util.Collection<String> clusterStates) {
        setClusterStates(clusterStates);
        return this;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * 
     * @param clusterStates
     *        The cluster state filters to apply when listing clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ListClustersRequest withClusterStates(ClusterState... clusterStates) {
        com.amazonaws.internal.SdkInternalList<String> clusterStatesCopy = new com.amazonaws.internal.SdkInternalList<String>(clusterStates.length);
        for (ClusterState value : clusterStates) {
            clusterStatesCopy.add(value.toString());
        }
        if (getClusterStates() == null) {
            setClusterStates(clusterStatesCopy);
        } else {
            getClusterStates().addAll(clusterStatesCopy);
        }
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

    public ListClustersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getClusterStates() != null)
            sb.append("ClusterStates: ").append(getClusterStates()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersRequest == false)
            return false;
        ListClustersRequest other = (ListClustersRequest) obj;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getClusterStates() == null ^ this.getClusterStates() == null)
            return false;
        if (other.getClusterStates() != null && other.getClusterStates().equals(this.getClusterStates()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getClusterStates() == null) ? 0 : getClusterStates().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersRequest clone() {
        return (ListClustersRequest) super.clone();
    }

}
