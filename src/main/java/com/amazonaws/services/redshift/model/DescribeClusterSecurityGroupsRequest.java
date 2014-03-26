/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest) DescribeClusterSecurityGroups operation}.
 * <p>
 * Returns information about Amazon Redshift security groups. If the
 * name of a security group is specified, the response will contain only
 * information about only that security group.
 * </p>
 * <p>
 * For information about managing security groups, go to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a>
 * in the <i>Amazon Redshift Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest)
 */
public class DescribeClusterSecurityGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     * <code>securitygroup1</code>
     */
    private String clusterSecurityGroupName;

    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request. <p>
     * Constraints: You can specify either the
     * <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     * parameter, but not both.
     */
    private String marker;

    /**
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     * <code>securitygroup1</code>
     *
     * @return The name of a cluster security group for which you are requesting
     *         details. You can specify either the <b>Marker</b> parameter or a
     *         <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     *         <code>securitygroup1</code>
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }
    
    /**
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     * <code>securitygroup1</code>
     *
     * @param clusterSecurityGroupName The name of a cluster security group for which you are requesting
     *         details. You can specify either the <b>Marker</b> parameter or a
     *         <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     *         <code>securitygroup1</code>
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }
    
    /**
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     * <code>securitygroup1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroupName The name of a cluster security group for which you are requesting
     *         details. You can specify either the <b>Marker</b> parameter or a
     *         <b>ClusterSecurityGroupName</b> parameter, but not both. <p> Example:
     *         <code>securitygroup1</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSecurityGroupsRequest withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @return The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @param maxRecords The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSecurityGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request. <p>
     * Constraints: You can specify either the
     * <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     * parameter, but not both.
     *
     * @return An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a
     *         <a>DescribeClusterSecurityGroups</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the next
     *         set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request. <p>
     *         Constraints: You can specify either the
     *         <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request. <p>
     * Constraints: You can specify either the
     * <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     * parameter, but not both.
     *
     * @param marker An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a
     *         <a>DescribeClusterSecurityGroups</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the next
     *         set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request. <p>
     *         Constraints: You can specify either the
     *         <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request. <p>
     * Constraints: You can specify either the
     * <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     * parameter, but not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a
     *         <a>DescribeClusterSecurityGroups</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the next
     *         set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request. <p>
     *         Constraints: You can specify either the
     *         <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSecurityGroupsRequest withMarker(String marker) {
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
        if (getClusterSecurityGroupName() != null) sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterSecurityGroupsRequest == false) return false;
        DescribeClusterSecurityGroupsRequest other = (DescribeClusterSecurityGroupsRequest)obj;
        
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null) return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    