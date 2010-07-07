/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBSecurityGroups(DescribeDBSecurityGroupsRequest) DescribeDBSecurityGroups operation}.
 * <p>
 * This API returns a list of DBSecurityGroup descriptions. If a
 * DBSecurityGroupName is specified, the list will contain only the
 * descriptions of the specified DBSecurityGroup.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBSecurityGroups(DescribeDBSecurityGroupsRequest)
 */
public class DescribeDBSecurityGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Security Group to return details for.
     */
    private String dBSecurityGroupName;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * The name of the DB Security Group to return details for.
     *
     * @return The name of the DB Security Group to return details for.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to return details for.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to return details for.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to return details for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to return details for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <i>MaxRecords</i> value, a marker is
     * included in the response so that the remaining results may be
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <i>MaxRecords</i> value, a marker is
     *         included in the response so that the remaining results may be
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     *
     * @return An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     *
     * @param marker An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsRequest withMarker(String marker) {
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
        sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    