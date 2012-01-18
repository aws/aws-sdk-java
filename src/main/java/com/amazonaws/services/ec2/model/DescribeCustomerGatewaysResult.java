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
        if (customerGateways == null) {
            this.customerGateways = null;
            return;
        }

        java.util.List<CustomerGateway> customerGatewaysCopy = new java.util.ArrayList<CustomerGateway>(customerGateways.size());
        customerGatewaysCopy.addAll(customerGateways);
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
        if (getCustomerGateways() == null) setCustomerGateways(new java.util.ArrayList<CustomerGateway>(customerGateways.length));
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
        if (customerGateways == null) {
            this.customerGateways = null;
        } else {
            java.util.List<CustomerGateway> customerGatewaysCopy = new java.util.ArrayList<CustomerGateway>(customerGateways.size());
            customerGatewaysCopy.addAll(customerGateways);
            this.customerGateways = customerGatewaysCopy;
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
        if (customerGateways != null) sb.append("CustomerGateways: " + customerGateways + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCustomerGateways() == null) ? 0 : getCustomerGateways().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeCustomerGatewaysResult == false) return false;
        DescribeCustomerGatewaysResult other = (DescribeCustomerGatewaysResult)obj;
        
        if (other.getCustomerGateways() == null ^ this.getCustomerGateways() == null) return false;
        if (other.getCustomerGateways() != null && other.getCustomerGateways().equals(this.getCustomerGateways()) == false) return false; 
        return true;
    }
    
}
    