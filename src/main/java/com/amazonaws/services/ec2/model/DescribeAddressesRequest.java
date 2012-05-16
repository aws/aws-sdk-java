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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeAddresses(DescribeAddressesRequest) DescribeAddresses operation}.
 * <p>
 * The DescribeAddresses operation lists elastic IP addresses assigned to your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeAddresses(DescribeAddressesRequest)
 */
public class DescribeAddressesRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of Elastic IP addresses to describe.
     */
    private java.util.List<String> publicIps;

    /**
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    private java.util.List<String> allocationIds;

    /**
     * The optional list of Elastic IP addresses to describe.
     *
     * @return The optional list of Elastic IP addresses to describe.
     */
    public java.util.List<String> getPublicIps() {
        
        if (publicIps == null) {
            publicIps = new java.util.ArrayList<String>();
        }
        return publicIps;
    }
    
    /**
     * The optional list of Elastic IP addresses to describe.
     *
     * @param publicIps The optional list of Elastic IP addresses to describe.
     */
    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }

        java.util.List<String> publicIpsCopy = new java.util.ArrayList<String>(publicIps.size());
        publicIpsCopy.addAll(publicIps);
        this.publicIps = publicIpsCopy;
    }
    
    /**
     * The optional list of Elastic IP addresses to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps The optional list of Elastic IP addresses to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withPublicIps(String... publicIps) {
        if (getPublicIps() == null) setPublicIps(new java.util.ArrayList<String>(publicIps.length));
        for (String value : publicIps) {
            getPublicIps().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Elastic IP addresses to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps The optional list of Elastic IP addresses to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
        } else {
            java.util.List<String> publicIpsCopy = new java.util.ArrayList<String>(publicIps.size());
            publicIpsCopy.addAll(publicIps);
            this.publicIps = publicIpsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Addresses. For a
     *         complete reference to the available filter keys for this operation,
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
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Addresses. For a
     *         complete reference to the available filter keys for this operation,
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
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Addresses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Addresses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withFilters(java.util.Collection<Filter> filters) {
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
     * Returns the value of the AllocationIds property for this object.
     *
     * @return The value of the AllocationIds property for this object.
     */
    public java.util.List<String> getAllocationIds() {
        
        if (allocationIds == null) {
            allocationIds = new java.util.ArrayList<String>();
        }
        return allocationIds;
    }
    
    /**
     * Sets the value of the AllocationIds property for this object.
     *
     * @param allocationIds The new value for the AllocationIds property for this object.
     */
    public void setAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
            return;
        }

        java.util.List<String> allocationIdsCopy = new java.util.ArrayList<String>(allocationIds.size());
        allocationIdsCopy.addAll(allocationIds);
        this.allocationIds = allocationIdsCopy;
    }
    
    /**
     * Sets the value of the AllocationIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationIds The new value for the AllocationIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withAllocationIds(String... allocationIds) {
        if (getAllocationIds() == null) setAllocationIds(new java.util.ArrayList<String>(allocationIds.length));
        for (String value : allocationIds) {
            getAllocationIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AllocationIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationIds The new value for the AllocationIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
        } else {
            java.util.List<String> allocationIdsCopy = new java.util.ArrayList<String>(allocationIds.size());
            allocationIdsCopy.addAll(allocationIds);
            this.allocationIds = allocationIdsCopy;
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
        if (publicIps != null) sb.append("PublicIps: " + publicIps + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        if (allocationIds != null) sb.append("AllocationIds: " + allocationIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationIds() == null) ? 0 : getAllocationIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeAddressesRequest == false) return false;
        DescribeAddressesRequest other = (DescribeAddressesRequest)obj;
        
        if (other.getPublicIps() == null ^ this.getPublicIps() == null) return false;
        if (other.getPublicIps() != null && other.getPublicIps().equals(this.getPublicIps()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null) return false;
        if (other.getAllocationIds() != null && other.getAllocationIds().equals(this.getAllocationIds()) == false) return false; 
        return true;
    }
    
}
    