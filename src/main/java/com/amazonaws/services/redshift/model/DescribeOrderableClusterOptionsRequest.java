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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest) DescribeOrderableClusterOptions operation}.
 * <p>
 * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as
 * the EC2 Availability Zones (AZ) in the specific AWS region that you can specify, and the node types you can request. The node types differ by
 * available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify
 * values when creating a cluster. For more information about managing clusters, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
 * Guide</i>
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest)
 */
public class DescribeOrderableClusterOptionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version. <p>Default: All
     * versions. <p>Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     */
    private String clusterVersion;

    /**
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     */
    private String nodeType;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version. <p>Default: All
     * versions. <p>Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     *
     * @return The version filter value. Specify this parameter to show only the
     *         available offerings matching the specified version. <p>Default: All
     *         versions. <p>Constraints: Must be one of the version returned from
     *         <a>DescribeClusterVersions</a>.
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version. <p>Default: All
     * versions. <p>Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     *
     * @param clusterVersion The version filter value. Specify this parameter to show only the
     *         available offerings matching the specified version. <p>Default: All
     *         versions. <p>Constraints: Must be one of the version returned from
     *         <a>DescribeClusterVersions</a>.
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version. <p>Default: All
     * versions. <p>Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The version filter value. Specify this parameter to show only the
     *         available offerings matching the specified version. <p>Default: All
     *         versions. <p>Constraints: Must be one of the version returned from
     *         <a>DescribeClusterVersions</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableClusterOptionsRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     *
     * @return The node type filter value. Specify this parameter to show only the
     *         available offerings matching the specified node type.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     *
     * @param nodeType The node type filter value. Specify this parameter to show only the
     *         available offerings matching the specified node type.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type filter value. Specify this parameter to show only the
     *         available offerings matching the specified node type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableClusterOptionsRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableClusterOptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @return An optional marker returned from a previous
     *         <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional marker returned from a previous
     *         <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a previous
     *         <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOrderableClusterOptionsRequest withMarker(String marker) {
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
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode()); 
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeOrderableClusterOptionsRequest == false) return false;
        DescribeOrderableClusterOptionsRequest other = (DescribeOrderableClusterOptionsRequest)obj;
        
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    