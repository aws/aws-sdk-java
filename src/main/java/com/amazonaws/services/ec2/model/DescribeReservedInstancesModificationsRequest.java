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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest) DescribeReservedInstancesModifications operation}.
 * <p>
 * The DescribeReservedInstancesModifications operation describes modifications made to Reserved Instances in your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest)
 */
public class DescribeReservedInstancesModificationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An optional list of Reserved Instances modification IDs to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesModificationIds;

    /**
     * A string specifying the next paginated set of results to return.
     */
    private String nextToken;

    /**
     * A list of filters used to match properties for
     * ReservedInstancesModifications. For a complete reference to the
     * available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * An optional list of Reserved Instances modification IDs to describe.
     *
     * @return An optional list of Reserved Instances modification IDs to describe.
     */
    public java.util.List<String> getReservedInstancesModificationIds() {
        if (reservedInstancesModificationIds == null) {
              reservedInstancesModificationIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesModificationIds.setAutoConstruct(true);
        }
        return reservedInstancesModificationIds;
    }
    
    /**
     * An optional list of Reserved Instances modification IDs to describe.
     *
     * @param reservedInstancesModificationIds An optional list of Reserved Instances modification IDs to describe.
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
     * An optional list of Reserved Instances modification IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModificationIds An optional list of Reserved Instances modification IDs to describe.
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
     * An optional list of Reserved Instances modification IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModificationIds An optional list of Reserved Instances modification IDs to describe.
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
     * A string specifying the next paginated set of results to return.
     *
     * @return A string specifying the next paginated set of results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     *
     * @param nextToken A string specifying the next paginated set of results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string specifying the next paginated set of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesModificationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * A list of filters used to match properties for
     * ReservedInstancesModifications. For a complete reference to the
     * available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for
     *         ReservedInstancesModifications. For a complete reference to the
     *         available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for
     * ReservedInstancesModifications. For a complete reference to the
     * available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesModifications. For a complete reference to the
     *         available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
     * A list of filters used to match properties for
     * ReservedInstancesModifications. For a complete reference to the
     * available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesModifications. For a complete reference to the
     *         available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
     * A list of filters used to match properties for
     * ReservedInstancesModifications. For a complete reference to the
     * available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesModifications. For a complete reference to the
     *         available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
    