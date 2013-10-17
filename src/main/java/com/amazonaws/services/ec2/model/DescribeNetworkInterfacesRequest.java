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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfacesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaces(DescribeNetworkInterfacesRequest) DescribeNetworkInterfaces operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkInterfaces(DescribeNetworkInterfacesRequest)
 */
public class DescribeNetworkInterfacesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeNetworkInterfacesRequest> {

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> networkInterfaceIds;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * Returns the value of the NetworkInterfaceIds property for this object.
     *
     * @return The value of the NetworkInterfaceIds property for this object.
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
              networkInterfaceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              networkInterfaceIds.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> networkInterfaceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(networkInterfaceIds.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> networkInterfaceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(networkInterfaceIds.size());
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
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
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
    public Request<DescribeNetworkInterfacesRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfacesRequest> request = new DescribeNetworkInterfacesRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceIds() != null) sb.append("NetworkInterfaceIds: " + getNetworkInterfaceIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    