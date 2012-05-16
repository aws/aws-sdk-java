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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeCustomerGateways(DescribeCustomerGatewaysRequest) DescribeCustomerGateways operation}.
 * <p>
 * Gives you information about your customer gateways. You can filter the results to return information only about customer gateways that match criteria
 * you specify. For example, you could ask to get information about a particular customer gateway (or all) only if the gateway's state is pending or
 * available. You can specify multiple filters (e.g., the customer gateway has a particular IP address for the Internet-routable external interface, and
 * the gateway's state is pending or available). The result includes information for a particular customer gateway only if the gateway matches all your
 * filters. If there's no match, no special message is returned; the response is simply empty. The following table shows the available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeCustomerGateways(DescribeCustomerGatewaysRequest)
 */
public class DescribeCustomerGatewaysRequest extends AmazonWebServiceRequest {

    /**
     * A set of one or more customer gateway IDs.
     */
    private java.util.List<String> customerGatewayIds;

    /**
     * A list of filters used to match properties for Customer Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * A set of one or more customer gateway IDs.
     *
     * @return A set of one or more customer gateway IDs.
     */
    public java.util.List<String> getCustomerGatewayIds() {
        
        if (customerGatewayIds == null) {
            customerGatewayIds = new java.util.ArrayList<String>();
        }
        return customerGatewayIds;
    }
    
    /**
     * A set of one or more customer gateway IDs.
     *
     * @param customerGatewayIds A set of one or more customer gateway IDs.
     */
    public void setCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        if (customerGatewayIds == null) {
            this.customerGatewayIds = null;
            return;
        }

        java.util.List<String> customerGatewayIdsCopy = new java.util.ArrayList<String>(customerGatewayIds.size());
        customerGatewayIdsCopy.addAll(customerGatewayIds);
        this.customerGatewayIds = customerGatewayIdsCopy;
    }
    
    /**
     * A set of one or more customer gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayIds A set of one or more customer gateway IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(String... customerGatewayIds) {
        if (getCustomerGatewayIds() == null) setCustomerGatewayIds(new java.util.ArrayList<String>(customerGatewayIds.length));
        for (String value : customerGatewayIds) {
            getCustomerGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * A set of one or more customer gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayIds A set of one or more customer gateway IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        if (customerGatewayIds == null) {
            this.customerGatewayIds = null;
        } else {
            java.util.List<String> customerGatewayIdsCopy = new java.util.ArrayList<String>(customerGatewayIds.size());
            customerGatewayIdsCopy.addAll(customerGatewayIds);
            this.customerGatewayIds = customerGatewayIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Customer Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Customer Gateways. For
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
     * A list of filters used to match properties for Customer Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Customer Gateways. For
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
     * A list of filters used to match properties for Customer Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Customer Gateways. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Customer Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Customer Gateways. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (customerGatewayIds != null) sb.append("CustomerGatewayIds: " + customerGatewayIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCustomerGatewayIds() == null) ? 0 : getCustomerGatewayIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeCustomerGatewaysRequest == false) return false;
        DescribeCustomerGatewaysRequest other = (DescribeCustomerGatewaysRequest)obj;
        
        if (other.getCustomerGatewayIds() == null ^ this.getCustomerGatewayIds() == null) return false;
        if (other.getCustomerGatewayIds() != null && other.getCustomerGatewayIds().equals(this.getCustomerGatewayIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    