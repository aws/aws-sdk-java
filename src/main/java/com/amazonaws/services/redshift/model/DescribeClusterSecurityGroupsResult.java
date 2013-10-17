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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the output from the DescribeClusterSecurityGroups action.
 * </p>
 */
public class DescribeClusterSecurityGroupsResult implements Serializable {

    /**
     * A marker at which to continue listing cluster security groups in a new
     * request. The response returns a marker if there are more security
     * groups to list than could be returned in the response.
     */
    private String marker;

    /**
     * A list of <a>ClusterSecurityGroup</a> instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroup> clusterSecurityGroups;

    /**
     * A marker at which to continue listing cluster security groups in a new
     * request. The response returns a marker if there are more security
     * groups to list than could be returned in the response.
     *
     * @return A marker at which to continue listing cluster security groups in a new
     *         request. The response returns a marker if there are more security
     *         groups to list than could be returned in the response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker at which to continue listing cluster security groups in a new
     * request. The response returns a marker if there are more security
     * groups to list than could be returned in the response.
     *
     * @param marker A marker at which to continue listing cluster security groups in a new
     *         request. The response returns a marker if there are more security
     *         groups to list than could be returned in the response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker at which to continue listing cluster security groups in a new
     * request. The response returns a marker if there are more security
     * groups to list than could be returned in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker at which to continue listing cluster security groups in a new
     *         request. The response returns a marker if there are more security
     *         groups to list than could be returned in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSecurityGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>ClusterSecurityGroup</a> instances.
     *
     * @return A list of <a>ClusterSecurityGroup</a> instances.
     */
    public java.util.List<ClusterSecurityGroup> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
              clusterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroup>();
              clusterSecurityGroups.setAutoConstruct(true);
        }
        return clusterSecurityGroups;
    }
    
    /**
     * A list of <a>ClusterSecurityGroup</a> instances.
     *
     * @param clusterSecurityGroups A list of <a>ClusterSecurityGroup</a> instances.
     */
    public void setClusterSecurityGroups(java.util.Collection<ClusterSecurityGroup> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroup> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroup>(clusterSecurityGroups.size());
        clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
        this.clusterSecurityGroups = clusterSecurityGroupsCopy;
    }
    
    /**
     * A list of <a>ClusterSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of <a>ClusterSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSecurityGroupsResult withClusterSecurityGroups(ClusterSecurityGroup... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) setClusterSecurityGroups(new java.util.ArrayList<ClusterSecurityGroup>(clusterSecurityGroups.length));
        for (ClusterSecurityGroup value : clusterSecurityGroups) {
            getClusterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ClusterSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of <a>ClusterSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSecurityGroupsResult withClusterSecurityGroups(java.util.Collection<ClusterSecurityGroup> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroup> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroup>(clusterSecurityGroups.size());
            clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
            this.clusterSecurityGroups = clusterSecurityGroupsCopy;
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
        if (getClusterSecurityGroups() != null) sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterSecurityGroupsResult == false) return false;
        DescribeClusterSecurityGroupsResult other = (DescribeClusterSecurityGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null) return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    