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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusterParameterGroups(DescribeClusterParameterGroupsRequest) DescribeClusterParameterGroups operation}.
 * <p>
 * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group,
 * the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the
 * description of a specific parameter group.
 * </p>
 * <p>
 * For more information about managing parameter groups, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a> in the <i>Amazon
 * Redshift Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusterParameterGroups(DescribeClusterParameterGroupsRequest)
 */
public class DescribeClusterParameterGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of a specific parameter group for which to return details. By
     * default, details about all parameter groups and the default parameter
     * group are returned.
     */
    private String parameterGroupName;

    /**
     * The maximum number of parameter group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response includes a marker that you
     * can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     * to retrieve the next set of records. <p>Default: <code>100</code>
     * <p>Constraints: Value must be at least 20 and no more than 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterParameterGroups</a> request to indicate the first
     * parameter group that the current request will return.
     */
    private String marker;

    /**
     * The name of a specific parameter group for which to return details. By
     * default, details about all parameter groups and the default parameter
     * group are returned.
     *
     * @return The name of a specific parameter group for which to return details. By
     *         default, details about all parameter groups and the default parameter
     *         group are returned.
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }
    
    /**
     * The name of a specific parameter group for which to return details. By
     * default, details about all parameter groups and the default parameter
     * group are returned.
     *
     * @param parameterGroupName The name of a specific parameter group for which to return details. By
     *         default, details about all parameter groups and the default parameter
     *         group are returned.
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }
    
    /**
     * The name of a specific parameter group for which to return details. By
     * default, details about all parameter groups and the default parameter
     * group are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupName The name of a specific parameter group for which to return details. By
     *         default, details about all parameter groups and the default parameter
     *         group are returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParameterGroupsRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * The maximum number of parameter group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response includes a marker that you
     * can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     * to retrieve the next set of records. <p>Default: <code>100</code>
     * <p>Constraints: Value must be at least 20 and no more than 100.
     *
     * @return The maximum number of parameter group records to include in the
     *         response. If more records exist than the specified
     *         <code>MaxRecords</code> value, the response includes a marker that you
     *         can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     *         to retrieve the next set of records. <p>Default: <code>100</code>
     *         <p>Constraints: Value must be at least 20 and no more than 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of parameter group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response includes a marker that you
     * can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     * to retrieve the next set of records. <p>Default: <code>100</code>
     * <p>Constraints: Value must be at least 20 and no more than 100.
     *
     * @param maxRecords The maximum number of parameter group records to include in the
     *         response. If more records exist than the specified
     *         <code>MaxRecords</code> value, the response includes a marker that you
     *         can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     *         to retrieve the next set of records. <p>Default: <code>100</code>
     *         <p>Constraints: Value must be at least 20 and no more than 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of parameter group records to include in the
     * response. If more records exist than the specified
     * <code>MaxRecords</code> value, the response includes a marker that you
     * can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     * to retrieve the next set of records. <p>Default: <code>100</code>
     * <p>Constraints: Value must be at least 20 and no more than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of parameter group records to include in the
     *         response. If more records exist than the specified
     *         <code>MaxRecords</code> value, the response includes a marker that you
     *         can use in a subsequent <a>DescribeClusterParameterGroups</a> request
     *         to retrieve the next set of records. <p>Default: <code>100</code>
     *         <p>Constraints: Value must be at least 20 and no more than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParameterGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterParameterGroups</a> request to indicate the first
     * parameter group that the current request will return.
     *
     * @return An optional marker returned by a previous
     *         <a>DescribeClusterParameterGroups</a> request to indicate the first
     *         parameter group that the current request will return.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterParameterGroups</a> request to indicate the first
     * parameter group that the current request will return.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeClusterParameterGroups</a> request to indicate the first
     *         parameter group that the current request will return.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterParameterGroups</a> request to indicate the first
     * parameter group that the current request will return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeClusterParameterGroups</a> request to indicate the first
     *         parameter group that the current request will return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParameterGroupsRequest withMarker(String marker) {
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
        if (getParameterGroupName() != null) sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterParameterGroupsRequest == false) return false;
        DescribeClusterParameterGroupsRequest other = (DescribeClusterParameterGroupsRequest)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    