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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcs(DescribeVpcsRequest) DescribeVpcs operation}.
 * <p>
 * Gives you information about your VPCs. You can filter the results to return information only about VPCs that match criteria you specify.
 * </p>
 * <p>
 * For example, you could ask to get information about a particular VPC or VPCs (or all your VPCs) only if the VPC's state is available. You can specify
 * multiple filters (e.g., the VPC uses one of several sets of DHCP options, and the VPC's state is available). The result includes information for a
 * particular VPC only if the VPC matches all your filters.
 * </p>
 * <p>
 * If there's no match, no special message is returned; the response is simply empty. The following table shows the available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcs(DescribeVpcsRequest)
 */
public class DescribeVpcsRequest extends AmazonWebServiceRequest {

    /**
     * The ID of a VPC you want information about.
     */
    private java.util.List<String> vpcIds;

    /**
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The ID of a VPC you want information about.
     *
     * @return The ID of a VPC you want information about.
     */
    public java.util.List<String> getVpcIds() {
        
        if (vpcIds == null) {
            vpcIds = new java.util.ArrayList<String>();
        }
        return vpcIds;
    }
    
    /**
     * The ID of a VPC you want information about.
     *
     * @param vpcIds The ID of a VPC you want information about.
     */
    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }

        java.util.List<String> vpcIdsCopy = new java.util.ArrayList<String>(vpcIds.size());
        vpcIdsCopy.addAll(vpcIds);
        this.vpcIds = vpcIdsCopy;
    }
    
    /**
     * The ID of a VPC you want information about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcIds The ID of a VPC you want information about.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcsRequest withVpcIds(String... vpcIds) {
        if (getVpcIds() == null) setVpcIds(new java.util.ArrayList<String>(vpcIds.length));
        for (String value : vpcIds) {
            getVpcIds().add(value);
        }
        return this;
    }
    
    /**
     * The ID of a VPC you want information about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcIds The ID of a VPC you want information about.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcsRequest withVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
        } else {
            java.util.List<String> vpcIdsCopy = new java.util.ArrayList<String>(vpcIds.size());
            vpcIdsCopy.addAll(vpcIds);
            this.vpcIds = vpcIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for VPCs. For a complete
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
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for VPCs. For a complete
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
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPCs. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPCs. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (vpcIds != null) sb.append("VpcIds: " + vpcIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeVpcsRequest == false) return false;
        DescribeVpcsRequest other = (DescribeVpcsRequest)obj;
        
        if (other.getVpcIds() == null ^ this.getVpcIds() == null) return false;
        if (other.getVpcIds() != null && other.getVpcIds().equals(this.getVpcIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    