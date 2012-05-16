/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstances(DescribeReservedInstancesRequest) DescribeReservedInstances operation}.
 * <p>
 * The DescribeReservedInstances operation describes Reserved Instances that were purchased for use with your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstances(DescribeReservedInstancesRequest)
 */
public class DescribeReservedInstancesRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of Reserved Instance IDs to describe.
     */
    private java.util.List<String> reservedInstancesIds;

    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The Reserved Instance offering type.
     */
    private String offeringType;

    /**
     * The optional list of Reserved Instance IDs to describe.
     *
     * @return The optional list of Reserved Instance IDs to describe.
     */
    public java.util.List<String> getReservedInstancesIds() {
        
        if (reservedInstancesIds == null) {
            reservedInstancesIds = new java.util.ArrayList<String>();
        }
        return reservedInstancesIds;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        java.util.List<String> reservedInstancesIdsCopy = new java.util.ArrayList<String>(reservedInstancesIds.size());
        reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        this.reservedInstancesIds = reservedInstancesIdsCopy;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) setReservedInstancesIds(new java.util.ArrayList<String>(reservedInstancesIds.length));
        for (String value : reservedInstancesIds) {
            getReservedInstancesIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
        } else {
            java.util.List<String> reservedInstancesIdsCopy = new java.util.ArrayList<String>(reservedInstancesIds.size());
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
            this.reservedInstancesIds = reservedInstancesIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }
    
    /**
     * The Reserved Instance offering type.
     *
     * @return The Reserved Instance offering type.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     *
     * @param offeringType The Reserved Instance offering type.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
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
        if (reservedInstancesIds != null) sb.append("ReservedInstancesIds: " + reservedInstancesIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        if (offeringType != null) sb.append("OfferingType: " + offeringType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeReservedInstancesRequest == false) return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest)obj;
        
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null) return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        return true;
    }
    
}
    