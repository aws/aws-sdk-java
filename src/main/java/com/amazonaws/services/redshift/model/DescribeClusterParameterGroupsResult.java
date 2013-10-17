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
 * Contains the output from the DescribeClusterParameterGroups action.
 * </p>
 */
public class DescribeClusterParameterGroupsResult implements Serializable {

    /**
     * A marker at which to continue listing cluster parameter groups in a
     * new request. The response returns a marker if there are more parameter
     * groups to list than returned in the response.
     */
    private String marker;

    /**
     * A list of <a>ClusterParameterGroup</a> instances. Each instance
     * describes one cluster parameter group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroup> parameterGroups;

    /**
     * A marker at which to continue listing cluster parameter groups in a
     * new request. The response returns a marker if there are more parameter
     * groups to list than returned in the response.
     *
     * @return A marker at which to continue listing cluster parameter groups in a
     *         new request. The response returns a marker if there are more parameter
     *         groups to list than returned in the response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker at which to continue listing cluster parameter groups in a
     * new request. The response returns a marker if there are more parameter
     * groups to list than returned in the response.
     *
     * @param marker A marker at which to continue listing cluster parameter groups in a
     *         new request. The response returns a marker if there are more parameter
     *         groups to list than returned in the response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker at which to continue listing cluster parameter groups in a
     * new request. The response returns a marker if there are more parameter
     * groups to list than returned in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker at which to continue listing cluster parameter groups in a
     *         new request. The response returns a marker if there are more parameter
     *         groups to list than returned in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParameterGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>ClusterParameterGroup</a> instances. Each instance
     * describes one cluster parameter group.
     *
     * @return A list of <a>ClusterParameterGroup</a> instances. Each instance
     *         describes one cluster parameter group.
     */
    public java.util.List<ClusterParameterGroup> getParameterGroups() {
        if (parameterGroups == null) {
              parameterGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroup>();
              parameterGroups.setAutoConstruct(true);
        }
        return parameterGroups;
    }
    
    /**
     * A list of <a>ClusterParameterGroup</a> instances. Each instance
     * describes one cluster parameter group.
     *
     * @param parameterGroups A list of <a>ClusterParameterGroup</a> instances. Each instance
     *         describes one cluster parameter group.
     */
    public void setParameterGroups(java.util.Collection<ClusterParameterGroup> parameterGroups) {
        if (parameterGroups == null) {
            this.parameterGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroup> parameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroup>(parameterGroups.size());
        parameterGroupsCopy.addAll(parameterGroups);
        this.parameterGroups = parameterGroupsCopy;
    }
    
    /**
     * A list of <a>ClusterParameterGroup</a> instances. Each instance
     * describes one cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroups A list of <a>ClusterParameterGroup</a> instances. Each instance
     *         describes one cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParameterGroupsResult withParameterGroups(ClusterParameterGroup... parameterGroups) {
        if (getParameterGroups() == null) setParameterGroups(new java.util.ArrayList<ClusterParameterGroup>(parameterGroups.length));
        for (ClusterParameterGroup value : parameterGroups) {
            getParameterGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ClusterParameterGroup</a> instances. Each instance
     * describes one cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroups A list of <a>ClusterParameterGroup</a> instances. Each instance
     *         describes one cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParameterGroupsResult withParameterGroups(java.util.Collection<ClusterParameterGroup> parameterGroups) {
        if (parameterGroups == null) {
            this.parameterGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroup> parameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroup>(parameterGroups.size());
            parameterGroupsCopy.addAll(parameterGroups);
            this.parameterGroups = parameterGroupsCopy;
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
        if (getParameterGroups() != null) sb.append("ParameterGroups: " + getParameterGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getParameterGroups() == null) ? 0 : getParameterGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterParameterGroupsResult == false) return false;
        DescribeClusterParameterGroupsResult other = (DescribeClusterParameterGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getParameterGroups() == null ^ this.getParameterGroups() == null) return false;
        if (other.getParameterGroups() != null && other.getParameterGroups().equals(this.getParameterGroups()) == false) return false; 
        return true;
    }
    
}
    