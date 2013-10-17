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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest) DescribeClusterSubnetGroups operation}.
 * <p>
 * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns
 * information about all cluster subnet groups that are defined in you AWS account.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest)
 */
public class DescribeClusterSubnetGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cluster subnet group for which information is
     * requested.
     */
    private String clusterSubnetGroupName;

    /**
     * The maximum number of cluster subnet group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response returns a marker that you
     * can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     * order to retrieve the next set of cluster subnet group records.
     * <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     * 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSubnetGroups</a> request to indicate the first
     * cluster subnet group that the current request will return.
     */
    private String marker;

    /**
     * The name of the cluster subnet group for which information is
     * requested.
     *
     * @return The name of the cluster subnet group for which information is
     *         requested.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group for which information is
     * requested.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group for which information is
     *         requested.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group for which information is
     * requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group for which information is
     *         requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * The maximum number of cluster subnet group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response returns a marker that you
     * can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     * order to retrieve the next set of cluster subnet group records.
     * <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     * 100.
     *
     * @return The maximum number of cluster subnet group records to include in the
     *         response. If more records exist than the specified
     *         <code>MaxRecords</code> value, the response returns a marker that you
     *         can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     *         order to retrieve the next set of cluster subnet group records.
     *         <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     *         100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of cluster subnet group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response returns a marker that you
     * can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     * order to retrieve the next set of cluster subnet group records.
     * <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     * 100.
     *
     * @param maxRecords The maximum number of cluster subnet group records to include in the
     *         response. If more records exist than the specified
     *         <code>MaxRecords</code> value, the response returns a marker that you
     *         can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     *         order to retrieve the next set of cluster subnet group records.
     *         <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     *         100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of cluster subnet group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response returns a marker that you
     * can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     * order to retrieve the next set of cluster subnet group records.
     * <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     * 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of cluster subnet group records to include in the
     *         response. If more records exist than the specified
     *         <code>MaxRecords</code> value, the response returns a marker that you
     *         can use in a subsequent <a>DescribeClusterSubnetGroups</a> request in
     *         order to retrieve the next set of cluster subnet group records.
     *         <p>Default: 100 <p>Constraints: Must be at least 20 and no more than
     *         100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSubnetGroups</a> request to indicate the first
     * cluster subnet group that the current request will return.
     *
     * @return An optional marker returned by a previous
     *         <a>DescribeClusterSubnetGroups</a> request to indicate the first
     *         cluster subnet group that the current request will return.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSubnetGroups</a> request to indicate the first
     * cluster subnet group that the current request will return.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeClusterSubnetGroups</a> request to indicate the first
     *         cluster subnet group that the current request will return.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSubnetGroups</a> request to indicate the first
     * cluster subnet group that the current request will return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeClusterSubnetGroups</a> request to indicate the first
     *         cluster subnet group that the current request will return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withMarker(String marker) {
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
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterSubnetGroupsRequest == false) return false;
        DescribeClusterSubnetGroupsRequest other = (DescribeClusterSubnetGroupsRequest)obj;
        
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    