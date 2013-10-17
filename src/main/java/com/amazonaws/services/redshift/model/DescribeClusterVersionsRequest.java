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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusterVersions(DescribeClusterVersionsRequest) DescribeClusterVersions operation}.
 * <p>
 * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more
 * about the Amazon Redshift versions. For more information about managing clusters, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
 * Guide</i>
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusterVersions(DescribeClusterVersionsRequest)
 */
public class DescribeClusterVersionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The specific cluster version to return. <p>Example: <code>1.0</code>
     */
    private String clusterVersion;

    /**
     * The name of a specific cluster parameter group family to return
     * details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    private String clusterParameterGroupFamily;

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     */
    private Integer maxRecords;

    /**
     * The marker returned from a previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The specific cluster version to return. <p>Example: <code>1.0</code>
     *
     * @return The specific cluster version to return. <p>Example: <code>1.0</code>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The specific cluster version to return. <p>Example: <code>1.0</code>
     *
     * @param clusterVersion The specific cluster version to return. <p>Example: <code>1.0</code>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The specific cluster version to return. <p>Example: <code>1.0</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The specific cluster version to return. <p>Example: <code>1.0</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterVersionsRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * The name of a specific cluster parameter group family to return
     * details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return The name of a specific cluster parameter group family to return
     *         details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public String getClusterParameterGroupFamily() {
        return clusterParameterGroupFamily;
    }
    
    /**
     * The name of a specific cluster parameter group family to return
     * details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @param clusterParameterGroupFamily The name of a specific cluster parameter group family to return
     *         details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public void setClusterParameterGroupFamily(String clusterParameterGroupFamily) {
        this.clusterParameterGroupFamily = clusterParameterGroupFamily;
    }
    
    /**
     * The name of a specific cluster parameter group family to return
     * details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters</li> <li>First character must be a letter</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterParameterGroupFamily The name of a specific cluster parameter group family to return
     *         details for. <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters</li> <li>First character must be a letter</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterVersionsRequest withClusterParameterGroupFamily(String clusterParameterGroupFamily) {
        this.clusterParameterGroupFamily = clusterParameterGroupFamily;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     *
     * @return The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a marker is included
     *         in the response so that the following results can be retrieved.
     *         <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     *         and no more than 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a marker is included
     *         in the response so that the following results can be retrieved.
     *         <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     *         and no more than 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more than
     * the <code>MaxRecords</code> value is available, a marker is included
     * in the response so that the following results can be retrieved.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more than
     *         the <code>MaxRecords</code> value is available, a marker is included
     *         in the response so that the following results can be retrieved.
     *         <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     *         and no more than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterVersionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * The marker returned from a previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     *
     * @return The marker returned from a previous request. If this parameter is
     *         specified, the response includes records beyond the marker only, up to
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker returned from a previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     *
     * @param marker The marker returned from a previous request. If this parameter is
     *         specified, the response includes records beyond the marker only, up to
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker returned from a previous request. If this parameter is
     * specified, the response includes records beyond the marker only, up to
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker returned from a previous request. If this parameter is
     *         specified, the response includes records beyond the marker only, up to
     *         <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterVersionsRequest withMarker(String marker) {
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
        if (getClusterParameterGroupFamily() != null) sb.append("ClusterParameterGroupFamily: " + getClusterParameterGroupFamily() + ",");
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
        hashCode = prime * hashCode + ((getClusterParameterGroupFamily() == null) ? 0 : getClusterParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterVersionsRequest == false) return false;
        DescribeClusterVersionsRequest other = (DescribeClusterVersionsRequest)obj;
        
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.getClusterParameterGroupFamily() == null ^ this.getClusterParameterGroupFamily() == null) return false;
        if (other.getClusterParameterGroupFamily() != null && other.getClusterParameterGroupFamily().equals(this.getClusterParameterGroupFamily()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    