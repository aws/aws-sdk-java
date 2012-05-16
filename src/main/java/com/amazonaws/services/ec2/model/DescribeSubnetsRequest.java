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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSubnets(DescribeSubnetsRequest) DescribeSubnets operation}.
 * <p>
 * Gives you information about your subnets. You can filter the results to return information only about subnets that match criteria you specify.
 * </p>
 * <p>
 * For example, you could ask to get information about a particular subnet (or all) only if the subnet's state is available. You can specify multiple
 * filters (e.g., the subnet is in a particular VPC, and the subnet's state is available).
 * </p>
 * <p>
 * The result includes information for a particular subnet only if the subnet matches all your filters. If there's no match, no special message is
 * returned; the response is simply empty. The following table shows the available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSubnets(DescribeSubnetsRequest)
 */
public class DescribeSubnetsRequest extends AmazonWebServiceRequest {

    /**
     * A set of one or more subnet IDs.
     */
    private java.util.List<String> subnetIds;

    /**
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * A set of one or more subnet IDs.
     *
     * @return A set of one or more subnet IDs.
     */
    public java.util.List<String> getSubnetIds() {
        
        if (subnetIds == null) {
            subnetIds = new java.util.ArrayList<String>();
        }
        return subnetIds;
    }
    
    /**
     * A set of one or more subnet IDs.
     *
     * @param subnetIds A set of one or more subnet IDs.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * A set of one or more subnet IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A set of one or more subnet IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * A set of one or more subnet IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A set of one or more subnet IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
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
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
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
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (subnetIds != null) sb.append("SubnetIds: " + subnetIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeSubnetsRequest == false) return false;
        DescribeSubnetsRequest other = (DescribeSubnetsRequest)obj;
        
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    