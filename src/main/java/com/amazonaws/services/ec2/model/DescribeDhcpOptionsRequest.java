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
import com.amazonaws.services.ec2.model.transform.DescribeDhcpOptionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeDhcpOptions(DescribeDhcpOptionsRequest) DescribeDhcpOptions operation}.
 * <p>
 * Gives you information about one or more sets of DHCP options. You can specify one or more DHCP options set IDs, or no IDs (to describe all your sets
 * of DHCP options). The returned information consists of:
 * </p>
 * 
 * <ul>
 * <li> The DHCP options set ID </li>
 * <li> The options </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeDhcpOptions(DescribeDhcpOptionsRequest)
 */
public class DescribeDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeDhcpOptionsRequest> {

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dhcpOptionsIds;

    /**
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * Returns the value of the DhcpOptionsIds property for this object.
     *
     * @return The value of the DhcpOptionsIds property for this object.
     */
    public java.util.List<String> getDhcpOptionsIds() {
        if (dhcpOptionsIds == null) {
              dhcpOptionsIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dhcpOptionsIds.setAutoConstruct(true);
        }
        return dhcpOptionsIds;
    }
    
    /**
     * Sets the value of the DhcpOptionsIds property for this object.
     *
     * @param dhcpOptionsIds The new value for the DhcpOptionsIds property for this object.
     */
    public void setDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        if (dhcpOptionsIds == null) {
            this.dhcpOptionsIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dhcpOptionsIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dhcpOptionsIds.size());
        dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
        this.dhcpOptionsIds = dhcpOptionsIdsCopy;
    }
    
    /**
     * Sets the value of the DhcpOptionsIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsIds The new value for the DhcpOptionsIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDhcpOptionsRequest withDhcpOptionsIds(String... dhcpOptionsIds) {
        if (getDhcpOptionsIds() == null) setDhcpOptionsIds(new java.util.ArrayList<String>(dhcpOptionsIds.length));
        for (String value : dhcpOptionsIds) {
            getDhcpOptionsIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the DhcpOptionsIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsIds The new value for the DhcpOptionsIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDhcpOptionsRequest withDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        if (dhcpOptionsIds == null) {
            this.dhcpOptionsIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dhcpOptionsIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dhcpOptionsIds.size());
            dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
            this.dhcpOptionsIds = dhcpOptionsIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for DhcpOptions. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for DhcpOptions. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for DhcpOptions. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDhcpOptionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for DhcpOptions. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDhcpOptionsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeDhcpOptionsRequest> getDryRunRequest() {
        Request<DescribeDhcpOptionsRequest> request = new DescribeDhcpOptionsRequestMarshaller().marshall(this);
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
        if (getDhcpOptionsIds() != null) sb.append("DhcpOptionsIds: " + getDhcpOptionsIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDhcpOptionsIds() == null) ? 0 : getDhcpOptionsIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDhcpOptionsRequest == false) return false;
        DescribeDhcpOptionsRequest other = (DescribeDhcpOptionsRequest)obj;
        
        if (other.getDhcpOptionsIds() == null ^ this.getDhcpOptionsIds() == null) return false;
        if (other.getDhcpOptionsIds() != null && other.getDhcpOptionsIds().equals(this.getDhcpOptionsIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    