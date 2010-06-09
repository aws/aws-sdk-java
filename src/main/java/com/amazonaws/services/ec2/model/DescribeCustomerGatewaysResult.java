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

/**
 * <p>
 * 
 * </p>
 */
public class DescribeCustomerGatewaysResult {

    /**
     * 
     */
    private java.util.List<CustomerGateway> customerGateways;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<CustomerGateway> getCustomerGateways() {
        if (customerGateways == null) {
            customerGateways = new java.util.ArrayList<CustomerGateway>();
        }
        return customerGateways;
    }
    
    /**
     * 
     *
     * @param customerGateways 
     */
    public void setCustomerGateways(java.util.Collection<CustomerGateway> customerGateways) {
        java.util.List<CustomerGateway> customerGatewaysCopy = new java.util.ArrayList<CustomerGateway>();
        if (customerGateways != null) {
            customerGatewaysCopy.addAll(customerGateways);
        }
        this.customerGateways = customerGatewaysCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGateways 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysResult withCustomerGateways(CustomerGateway... customerGateways) {
        for (CustomerGateway value : customerGateways) {
            getCustomerGateways().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGateways 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCustomerGatewaysResult withCustomerGateways(java.util.Collection<CustomerGateway> customerGateways) {
        java.util.List<CustomerGateway> customerGatewaysCopy = new java.util.ArrayList<CustomerGateway>();
        if (customerGateways != null) {
            customerGatewaysCopy.addAll(customerGateways);
        }
        this.customerGateways = customerGatewaysCopy;

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
        
        sb.append("CustomerGateways: " + customerGateways + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    