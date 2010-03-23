/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describe Customer Gateways Request
 */
public class DescribeCustomerGatewaysRequest extends AmazonWebServiceRequest {
        
    private java.util.List<String> customerGatewayIds;

    private java.util.List<Filter> filters;

    /**
     * Returns the value of the CustomerGatewayIds property for this object.
     *
     * @return The value of the CustomerGatewayIds property for this object.
     */
    public java.util.List<String> getCustomerGatewayIds() {
        if (customerGatewayIds == null) {
            customerGatewayIds = new java.util.ArrayList<String>();
        }
        return customerGatewayIds;
    }
    
    /**
     * Sets the value of the CustomerGatewayIds property for this object.
     *
     * @param customerGatewayIds The new value for the CustomerGatewayIds property for this object.
     */
    public void setCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        java.util.List<String> customerGatewayIdsCopy = new java.util.ArrayList<String>();
        if (customerGatewayIds != null) {
            customerGatewayIdsCopy.addAll(customerGatewayIds);
        }
        this.customerGatewayIds = customerGatewayIdsCopy;
    }
    
    /**
     * Sets the value of the CustomerGatewayIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayIds The new value for the CustomerGatewayIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(String... customerGatewayIds) {
        for (String value : customerGatewayIds) {
            getCustomerGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the CustomerGatewayIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayIds The new value for the CustomerGatewayIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        java.util.List<String> customerGatewayIdsCopy = new java.util.ArrayList<String>();
        if (customerGatewayIds != null) {
            customerGatewayIdsCopy.addAll(customerGatewayIds);
        }
        this.customerGatewayIds = customerGatewayIdsCopy;

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
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
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
    public DescribeCustomerGatewaysRequest withFilters(Filter... filters) {
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
    public DescribeCustomerGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

        return this;
    }
    
}
    