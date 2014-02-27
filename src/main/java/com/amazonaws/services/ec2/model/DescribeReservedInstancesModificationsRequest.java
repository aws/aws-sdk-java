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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest) DescribeReservedInstancesModifications operation}.
 * <p>
 * Describes the modifications made to your Reserved Instances. If no
 * parameter is specified, information about all your Reserved Instances
 * modification requests is returned. If a modification ID is specified,
 * only information about the specific modification is returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest)
 */
public class DescribeReservedInstancesModificationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * IDs for the submitted modification request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesModificationIds;

    /**
     * The token for the next page of data.
     */
    private String nextToken;

    /**
     * One or more filters. <ul> <li> <p><code>client-token</code> - The
     * idempotency token for the modification request. </li> <li>
     * <p><code>create-date</code> - The time when the modification request
     * was created. </li> <li> <p><code>effective-date</code> - The time when
     * the modification becomes effective. </li> <li>
     * <p><code>modification-result.reserved-instances-id</code> - The ID for
     * the Reserved Instances created as part of the modification request.
     * This ID is only available when the status of the modification is
     * <code>fulfilled</code>. </li> <li>
     * <p><code>modification-result.target-configuration.availability-zone</code>
     * - The Availability Zone for the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-count
     * </code> - The number of new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-type</code>
     * - The instance type of the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.platform</code> -
     * The network platform of the new Reserved Instances
     * (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     * <p><code>reserved-instances-id</code> - The ID of the Reserved
     * Instances modified. </li> <li>
     * <p><code>reserved-instances-modification-id</code> - The ID of the
     * modification request. </li> <li> <p><code>status</code> - The status
     * of the Reserved Instances modification request
     * (<code>processing</code> | <code>fulfilled</code> |
     * <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     * reason for the status. </li> <li> <p><code>update-date</code> - The
     * time when the modification request was last updated. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * IDs for the submitted modification request.
     *
     * @return IDs for the submitted modification request.
     */
    public java.util.List<String> getReservedInstancesModificationIds() {
        if (reservedInstancesModificationIds == null) {
              reservedInstancesModificationIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesModificationIds.setAutoConstruct(true);
        }
        return reservedInstancesModificationIds;
    }
    
    /**
     * IDs for the submitted modification request.
     *
     * @param reservedInstancesModificationIds IDs for the submitted modification request.
     */
    public void setReservedInstancesModificationIds(java.util.Collection<String> reservedInstancesModificationIds) {
        if (reservedInstancesModificationIds == null) {
            this.reservedInstancesModificationIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesModificationIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesModificationIds.size());
        reservedInstancesModificationIdsCopy.addAll(reservedInstancesModificationIds);
        this.reservedInstancesModificationIds = reservedInstancesModificationIdsCopy;
    }
    
    /**
     * IDs for the submitted modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModificationIds IDs for the submitted modification request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsRequest withReservedInstancesModificationIds(String... reservedInstancesModificationIds) {
        if (getReservedInstancesModificationIds() == null) setReservedInstancesModificationIds(new java.util.ArrayList<String>(reservedInstancesModificationIds.length));
        for (String value : reservedInstancesModificationIds) {
            getReservedInstancesModificationIds().add(value);
        }
        return this;
    }
    
    /**
     * IDs for the submitted modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModificationIds IDs for the submitted modification request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsRequest withReservedInstancesModificationIds(java.util.Collection<String> reservedInstancesModificationIds) {
        if (reservedInstancesModificationIds == null) {
            this.reservedInstancesModificationIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesModificationIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesModificationIds.size());
            reservedInstancesModificationIdsCopy.addAll(reservedInstancesModificationIds);
            this.reservedInstancesModificationIds = reservedInstancesModificationIdsCopy;
        }

        return this;
    }

    /**
     * The token for the next page of data.
     *
     * @return The token for the next page of data.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next page of data.
     *
     * @param nextToken The token for the next page of data.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next page of data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next page of data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>client-token</code> - The
     * idempotency token for the modification request. </li> <li>
     * <p><code>create-date</code> - The time when the modification request
     * was created. </li> <li> <p><code>effective-date</code> - The time when
     * the modification becomes effective. </li> <li>
     * <p><code>modification-result.reserved-instances-id</code> - The ID for
     * the Reserved Instances created as part of the modification request.
     * This ID is only available when the status of the modification is
     * <code>fulfilled</code>. </li> <li>
     * <p><code>modification-result.target-configuration.availability-zone</code>
     * - The Availability Zone for the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-count
     * </code> - The number of new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-type</code>
     * - The instance type of the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.platform</code> -
     * The network platform of the new Reserved Instances
     * (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     * <p><code>reserved-instances-id</code> - The ID of the Reserved
     * Instances modified. </li> <li>
     * <p><code>reserved-instances-modification-id</code> - The ID of the
     * modification request. </li> <li> <p><code>status</code> - The status
     * of the Reserved Instances modification request
     * (<code>processing</code> | <code>fulfilled</code> |
     * <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     * reason for the status. </li> <li> <p><code>update-date</code> - The
     * time when the modification request was last updated. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>client-token</code> - The
     *         idempotency token for the modification request. </li> <li>
     *         <p><code>create-date</code> - The time when the modification request
     *         was created. </li> <li> <p><code>effective-date</code> - The time when
     *         the modification becomes effective. </li> <li>
     *         <p><code>modification-result.reserved-instances-id</code> - The ID for
     *         the Reserved Instances created as part of the modification request.
     *         This ID is only available when the status of the modification is
     *         <code>fulfilled</code>. </li> <li>
     *         <p><code>modification-result.target-configuration.availability-zone</code>
     *         - The Availability Zone for the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-count
     *         </code> - The number of new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-type</code>
     *         - The instance type of the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.platform</code> -
     *         The network platform of the new Reserved Instances
     *         (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     *         <p><code>reserved-instances-id</code> - The ID of the Reserved
     *         Instances modified. </li> <li>
     *         <p><code>reserved-instances-modification-id</code> - The ID of the
     *         modification request. </li> <li> <p><code>status</code> - The status
     *         of the Reserved Instances modification request
     *         (<code>processing</code> | <code>fulfilled</code> |
     *         <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     *         reason for the status. </li> <li> <p><code>update-date</code> - The
     *         time when the modification request was last updated. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>client-token</code> - The
     * idempotency token for the modification request. </li> <li>
     * <p><code>create-date</code> - The time when the modification request
     * was created. </li> <li> <p><code>effective-date</code> - The time when
     * the modification becomes effective. </li> <li>
     * <p><code>modification-result.reserved-instances-id</code> - The ID for
     * the Reserved Instances created as part of the modification request.
     * This ID is only available when the status of the modification is
     * <code>fulfilled</code>. </li> <li>
     * <p><code>modification-result.target-configuration.availability-zone</code>
     * - The Availability Zone for the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-count
     * </code> - The number of new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-type</code>
     * - The instance type of the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.platform</code> -
     * The network platform of the new Reserved Instances
     * (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     * <p><code>reserved-instances-id</code> - The ID of the Reserved
     * Instances modified. </li> <li>
     * <p><code>reserved-instances-modification-id</code> - The ID of the
     * modification request. </li> <li> <p><code>status</code> - The status
     * of the Reserved Instances modification request
     * (<code>processing</code> | <code>fulfilled</code> |
     * <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     * reason for the status. </li> <li> <p><code>update-date</code> - The
     * time when the modification request was last updated. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>client-token</code> - The
     *         idempotency token for the modification request. </li> <li>
     *         <p><code>create-date</code> - The time when the modification request
     *         was created. </li> <li> <p><code>effective-date</code> - The time when
     *         the modification becomes effective. </li> <li>
     *         <p><code>modification-result.reserved-instances-id</code> - The ID for
     *         the Reserved Instances created as part of the modification request.
     *         This ID is only available when the status of the modification is
     *         <code>fulfilled</code>. </li> <li>
     *         <p><code>modification-result.target-configuration.availability-zone</code>
     *         - The Availability Zone for the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-count
     *         </code> - The number of new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-type</code>
     *         - The instance type of the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.platform</code> -
     *         The network platform of the new Reserved Instances
     *         (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     *         <p><code>reserved-instances-id</code> - The ID of the Reserved
     *         Instances modified. </li> <li>
     *         <p><code>reserved-instances-modification-id</code> - The ID of the
     *         modification request. </li> <li> <p><code>status</code> - The status
     *         of the Reserved Instances modification request
     *         (<code>processing</code> | <code>fulfilled</code> |
     *         <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     *         reason for the status. </li> <li> <p><code>update-date</code> - The
     *         time when the modification request was last updated. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>client-token</code> - The
     * idempotency token for the modification request. </li> <li>
     * <p><code>create-date</code> - The time when the modification request
     * was created. </li> <li> <p><code>effective-date</code> - The time when
     * the modification becomes effective. </li> <li>
     * <p><code>modification-result.reserved-instances-id</code> - The ID for
     * the Reserved Instances created as part of the modification request.
     * This ID is only available when the status of the modification is
     * <code>fulfilled</code>. </li> <li>
     * <p><code>modification-result.target-configuration.availability-zone</code>
     * - The Availability Zone for the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-count
     * </code> - The number of new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-type</code>
     * - The instance type of the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.platform</code> -
     * The network platform of the new Reserved Instances
     * (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     * <p><code>reserved-instances-id</code> - The ID of the Reserved
     * Instances modified. </li> <li>
     * <p><code>reserved-instances-modification-id</code> - The ID of the
     * modification request. </li> <li> <p><code>status</code> - The status
     * of the Reserved Instances modification request
     * (<code>processing</code> | <code>fulfilled</code> |
     * <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     * reason for the status. </li> <li> <p><code>update-date</code> - The
     * time when the modification request was last updated. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>client-token</code> - The
     *         idempotency token for the modification request. </li> <li>
     *         <p><code>create-date</code> - The time when the modification request
     *         was created. </li> <li> <p><code>effective-date</code> - The time when
     *         the modification becomes effective. </li> <li>
     *         <p><code>modification-result.reserved-instances-id</code> - The ID for
     *         the Reserved Instances created as part of the modification request.
     *         This ID is only available when the status of the modification is
     *         <code>fulfilled</code>. </li> <li>
     *         <p><code>modification-result.target-configuration.availability-zone</code>
     *         - The Availability Zone for the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-count
     *         </code> - The number of new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-type</code>
     *         - The instance type of the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.platform</code> -
     *         The network platform of the new Reserved Instances
     *         (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     *         <p><code>reserved-instances-id</code> - The ID of the Reserved
     *         Instances modified. </li> <li>
     *         <p><code>reserved-instances-modification-id</code> - The ID of the
     *         modification request. </li> <li> <p><code>status</code> - The status
     *         of the Reserved Instances modification request
     *         (<code>processing</code> | <code>fulfilled</code> |
     *         <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     *         reason for the status. </li> <li> <p><code>update-date</code> - The
     *         time when the modification request was last updated. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>client-token</code> - The
     * idempotency token for the modification request. </li> <li>
     * <p><code>create-date</code> - The time when the modification request
     * was created. </li> <li> <p><code>effective-date</code> - The time when
     * the modification becomes effective. </li> <li>
     * <p><code>modification-result.reserved-instances-id</code> - The ID for
     * the Reserved Instances created as part of the modification request.
     * This ID is only available when the status of the modification is
     * <code>fulfilled</code>. </li> <li>
     * <p><code>modification-result.target-configuration.availability-zone</code>
     * - The Availability Zone for the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-count
     * </code> - The number of new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.instance-type</code>
     * - The instance type of the new Reserved Instances. </li> <li>
     * <p><code>modification-result.target-configuration.platform</code> -
     * The network platform of the new Reserved Instances
     * (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     * <p><code>reserved-instances-id</code> - The ID of the Reserved
     * Instances modified. </li> <li>
     * <p><code>reserved-instances-modification-id</code> - The ID of the
     * modification request. </li> <li> <p><code>status</code> - The status
     * of the Reserved Instances modification request
     * (<code>processing</code> | <code>fulfilled</code> |
     * <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     * reason for the status. </li> <li> <p><code>update-date</code> - The
     * time when the modification request was last updated. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>client-token</code> - The
     *         idempotency token for the modification request. </li> <li>
     *         <p><code>create-date</code> - The time when the modification request
     *         was created. </li> <li> <p><code>effective-date</code> - The time when
     *         the modification becomes effective. </li> <li>
     *         <p><code>modification-result.reserved-instances-id</code> - The ID for
     *         the Reserved Instances created as part of the modification request.
     *         This ID is only available when the status of the modification is
     *         <code>fulfilled</code>. </li> <li>
     *         <p><code>modification-result.target-configuration.availability-zone</code>
     *         - The Availability Zone for the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-count
     *         </code> - The number of new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.instance-type</code>
     *         - The instance type of the new Reserved Instances. </li> <li>
     *         <p><code>modification-result.target-configuration.platform</code> -
     *         The network platform of the new Reserved Instances
     *         (<code>EC2-Classic</code> | <code>EC2-VPC</code>). </li> <li>
     *         <p><code>reserved-instances-id</code> - The ID of the Reserved
     *         Instances modified. </li> <li>
     *         <p><code>reserved-instances-modification-id</code> - The ID of the
     *         modification request. </li> <li> <p><code>status</code> - The status
     *         of the Reserved Instances modification request
     *         (<code>processing</code> | <code>fulfilled</code> |
     *         <code>failed</code>). </li> <li> <p><code>status-message</code> - The
     *         reason for the status. </li> <li> <p><code>update-date</code> - The
     *         time when the modification request was last updated. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
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
        if (getReservedInstancesModificationIds() != null) sb.append("ReservedInstancesModificationIds: " + getReservedInstancesModificationIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesModificationIds() == null) ? 0 : getReservedInstancesModificationIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesModificationsRequest == false) return false;
        DescribeReservedInstancesModificationsRequest other = (DescribeReservedInstancesModificationsRequest)obj;
        
        if (other.getReservedInstancesModificationIds() == null ^ this.getReservedInstancesModificationIds() == null) return false;
        if (other.getReservedInstancesModificationIds() != null && other.getReservedInstancesModificationIds().equals(this.getReservedInstancesModificationIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    