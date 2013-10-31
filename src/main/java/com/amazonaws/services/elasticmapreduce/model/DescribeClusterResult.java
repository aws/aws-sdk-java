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


/**
 * <p>
 * This output contains the description of the cluster.
 * </p>
 */
public class DescribeClusterResult implements Serializable {

    /**
     * This output contains the details for the requested cluster.
     */
    private Cluster cluster;

    /**
     * This output contains the details for the requested cluster.
     *
     * @return This output contains the details for the requested cluster.
     */
    public Cluster getCluster() {
        return cluster;
    }
    
    /**
     * This output contains the details for the requested cluster.
     *
     * @param cluster This output contains the details for the requested cluster.
     */
    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }
    
    /**
     * This output contains the details for the requested cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster This output contains the details for the requested cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterResult withCluster(Cluster cluster) {
        this.cluster = cluster;
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
        if (getCluster() != null) sb.append("Cluster: " + getCluster() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterResult == false) return false;
        DescribeClusterResult other = (DescribeClusterResult)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        return true;
    }
    
}
    