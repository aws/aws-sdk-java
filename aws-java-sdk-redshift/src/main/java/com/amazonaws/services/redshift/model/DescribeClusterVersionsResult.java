/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output from the DescribeClusterVersions action.
 * </p>
 */
public class DescribeClusterVersionsResult implements Serializable, Cloneable {

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     */
    private String marker;

    /**
     * A list of <code>Version</code> elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClusterVersion> clusterVersions;

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @return A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterVersionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <code>Version</code> elements.
     *
     * @return A list of <code>Version</code> elements.
     */
    public java.util.List<ClusterVersion> getClusterVersions() {
        if (clusterVersions == null) {
              clusterVersions = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterVersion>();
              clusterVersions.setAutoConstruct(true);
        }
        return clusterVersions;
    }
    
    /**
     * A list of <code>Version</code> elements.
     *
     * @param clusterVersions A list of <code>Version</code> elements.
     */
    public void setClusterVersions(java.util.Collection<ClusterVersion> clusterVersions) {
        if (clusterVersions == null) {
            this.clusterVersions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClusterVersion> clusterVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterVersion>(clusterVersions.size());
        clusterVersionsCopy.addAll(clusterVersions);
        this.clusterVersions = clusterVersionsCopy;
    }
    
    /**
     * A list of <code>Version</code> elements.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setClusterVersions(java.util.Collection)} or {@link
     * #withClusterVersions(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersions A list of <code>Version</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterVersionsResult withClusterVersions(ClusterVersion... clusterVersions) {
        if (getClusterVersions() == null) setClusterVersions(new java.util.ArrayList<ClusterVersion>(clusterVersions.length));
        for (ClusterVersion value : clusterVersions) {
            getClusterVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Version</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersions A list of <code>Version</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterVersionsResult withClusterVersions(java.util.Collection<ClusterVersion> clusterVersions) {
        if (clusterVersions == null) {
            this.clusterVersions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClusterVersion> clusterVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterVersion>(clusterVersions.size());
            clusterVersionsCopy.addAll(clusterVersions);
            this.clusterVersions = clusterVersionsCopy;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getClusterVersions() != null) sb.append("ClusterVersions: " + getClusterVersions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getClusterVersions() == null) ? 0 : getClusterVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterVersionsResult == false) return false;
        DescribeClusterVersionsResult other = (DescribeClusterVersionsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getClusterVersions() == null ^ this.getClusterVersions() == null) return false;
        if (other.getClusterVersions() != null && other.getClusterVersions().equals(this.getClusterVersions()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeClusterVersionsResult clone() {
        try {
            return (DescribeClusterVersionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    