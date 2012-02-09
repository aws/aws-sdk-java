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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaces(DescribeNetworkInterfacesRequest) DescribeNetworkInterfaces operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaces(DescribeNetworkInterfacesRequest)
 */
public class DescribeNetworkInterfacesRequest extends AmazonWebServiceRequest {

    private java.util.List<String> networkInterfaceIds;

    private java.util.List<Filter> filters;

    /**
     * Returns the value of the NetworkInterfaceIds property for this object.
     *
     * @return The value of the NetworkInterfaceIds property for this object.
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        
        if (networkInterfaceIds == null) {
            networkInterfaceIds = new java.util.ArrayList<String>();
        }
        return networkInterfaceIds;
    }
    
    /**
     * Sets the value of the NetworkInterfaceIds property for this object.
     *
     * @param networkInterfaceIds The new value for the NetworkInterfaceIds property for this object.
     */
    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        java.util.List<String> networkInterfaceIdsCopy = new java.util.ArrayList<String>(networkInterfaceIds.size());
        networkInterfaceIdsCopy.addAll(networkInterfaceIds);
        this.networkInterfaceIds = networkInterfaceIdsCopy;
    }
    
    /**
     * Sets the value of the NetworkInterfaceIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceIds The new value for the NetworkInterfaceIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (getNetworkInterfaceIds() == null) setNetworkInterfaceIds(new java.util.ArrayList<String>(networkInterfaceIds.length));
        for (String value : networkInterfaceIds) {
            getNetworkInterfaceIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the NetworkInterfaceIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceIds The new value for the NetworkInterfaceIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
        } else {
            java.util.List<String> networkInterfaceIdsCopy = new java.util.ArrayList<String>(networkInterfaceIds.size());
            networkInterfaceIdsCopy.addAll(networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIdsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the Filters property for this object.
     *
     * @return The value of the Filters property for this object.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     *
     * @param filters The new value for the Filters property for this object.
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
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkInterfacesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkInterfacesRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (networkInterfaceIds != null) sb.append("NetworkInterfaceIds: " + networkInterfaceIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeNetworkInterfacesRequest == false) return false;
        DescribeNetworkInterfacesRequest other = (DescribeNetworkInterfacesRequest)obj;
        
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null) return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    