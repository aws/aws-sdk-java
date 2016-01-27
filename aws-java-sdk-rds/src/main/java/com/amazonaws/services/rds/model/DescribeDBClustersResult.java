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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * DescribeDBClusters action.
 * </p>
 */
public class DescribeDBClustersResult implements Serializable, Cloneable {

    /**
     * A pagination token that can be used in a subsequent DescribeDBClusters
     * request.
     */
    private String marker;

    /**
     * Contains a list of DB clusters for the user.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBCluster> dBClusters;

    /**
     * A pagination token that can be used in a subsequent DescribeDBClusters
     * request.
     *
     * @return A pagination token that can be used in a subsequent DescribeDBClusters
     *         request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A pagination token that can be used in a subsequent DescribeDBClusters
     * request.
     *
     * @param marker A pagination token that can be used in a subsequent DescribeDBClusters
     *         request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A pagination token that can be used in a subsequent DescribeDBClusters
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A pagination token that can be used in a subsequent DescribeDBClusters
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Contains a list of DB clusters for the user.
     *
     * @return Contains a list of DB clusters for the user.
     */
    public java.util.List<DBCluster> getDBClusters() {
        if (dBClusters == null) {
              dBClusters = new com.amazonaws.internal.ListWithAutoConstructFlag<DBCluster>();
              dBClusters.setAutoConstruct(true);
        }
        return dBClusters;
    }
    
    /**
     * Contains a list of DB clusters for the user.
     *
     * @param dBClusters Contains a list of DB clusters for the user.
     */
    public void setDBClusters(java.util.Collection<DBCluster> dBClusters) {
        if (dBClusters == null) {
            this.dBClusters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBCluster> dBClustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBCluster>(dBClusters.size());
        dBClustersCopy.addAll(dBClusters);
        this.dBClusters = dBClustersCopy;
    }
    
    /**
     * Contains a list of DB clusters for the user.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBClusters(java.util.Collection)} or {@link
     * #withDBClusters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusters Contains a list of DB clusters for the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersResult withDBClusters(DBCluster... dBClusters) {
        if (getDBClusters() == null) setDBClusters(new java.util.ArrayList<DBCluster>(dBClusters.length));
        for (DBCluster value : dBClusters) {
            getDBClusters().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of DB clusters for the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusters Contains a list of DB clusters for the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClustersResult withDBClusters(java.util.Collection<DBCluster> dBClusters) {
        if (dBClusters == null) {
            this.dBClusters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBCluster> dBClustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBCluster>(dBClusters.size());
            dBClustersCopy.addAll(dBClusters);
            this.dBClusters = dBClustersCopy;
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
        if (getDBClusters() != null) sb.append("DBClusters: " + getDBClusters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusters() == null) ? 0 : getDBClusters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBClustersResult == false) return false;
        DescribeDBClustersResult other = (DescribeDBClustersResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBClusters() == null ^ this.getDBClusters() == null) return false;
        if (other.getDBClusters() != null && other.getDBClusters().equals(this.getDBClusters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBClustersResult clone() {
        try {
            return (DescribeDBClustersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    