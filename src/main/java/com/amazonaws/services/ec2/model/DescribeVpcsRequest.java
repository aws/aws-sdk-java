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
import com.amazonaws.services.ec2.model.transform.DescribeVpcsRequestMarshaller;

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
public class DescribeVpcsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVpcsRequest> {

    /**
     * The ID of a VPC you want information about.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIds;

    /**
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The ID of a VPC you want information about.
     *
     * @return The ID of a VPC you want information about.
     */
    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
              vpcIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcIds.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcIds.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcIds.size());
            vpcIdsCopy.addAll(vpcIds);
            this.vpcIds = vpcIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for VPCs. For a complete
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
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for VPCs. For a complete
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
     * A list of filters used to match properties for VPCs. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPCs. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for VPCs. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpcsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeVpcsRequest> getDryRunRequest() {
        Request<DescribeVpcsRequest> request = new DescribeVpcsRequestMarshaller().marshall(this);
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
        if (getVpcIds() != null) sb.append("VpcIds: " + getVpcIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    