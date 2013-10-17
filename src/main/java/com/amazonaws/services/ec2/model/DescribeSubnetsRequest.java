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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSubnetsRequestMarshaller;

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
public class DescribeSubnetsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSubnetsRequest> {

    /**
     * A set of one or more subnet IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * A set of one or more subnet IDs.
     *
     * @return A set of one or more subnet IDs.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
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
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
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
     * A list of filters used to match properties for Subnets. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Subnets. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSubnetsRequest> getDryRunRequest() {
        Request<DescribeSubnetsRequest> request = new DescribeSubnetsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    