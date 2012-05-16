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
public class DescribeDhcpOptionsRequest extends AmazonWebServiceRequest {

    private java.util.List<String> dhcpOptionsIds;

    /**
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * Returns the value of the DhcpOptionsIds property for this object.
     *
     * @return The value of the DhcpOptionsIds property for this object.
     */
    public java.util.List<String> getDhcpOptionsIds() {
        
        if (dhcpOptionsIds == null) {
            dhcpOptionsIds = new java.util.ArrayList<String>();
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

        java.util.List<String> dhcpOptionsIdsCopy = new java.util.ArrayList<String>(dhcpOptionsIds.size());
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
            java.util.List<String> dhcpOptionsIdsCopy = new java.util.ArrayList<String>(dhcpOptionsIds.size());
            dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
            this.dhcpOptionsIds = dhcpOptionsIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for DhcpOptions. For a
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
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for DhcpOptions. For a
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
     * A list of filters used to match properties for DhcpOptions. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for DhcpOptions. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for DhcpOptions. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDhcpOptionsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (dhcpOptionsIds != null) sb.append("DhcpOptionsIds: " + dhcpOptionsIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
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
    