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


/**
 * <p>
 * 
 * </p>
 */
public class DescribeCustomerGatewaysResult implements Serializable {

    /**
     * 
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CustomerGateway> customerGateways;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<CustomerGateway> getCustomerGateways() {
        if (customerGateways == null) {
              customerGateways = new com.amazonaws.internal.ListWithAutoConstructFlag<CustomerGateway>();
              customerGateways.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<CustomerGateway> customerGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CustomerGateway>(customerGateways.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<CustomerGateway> customerGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CustomerGateway>(customerGateways.size());
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
        if (getCustomerGateways() != null) sb.append("CustomerGateways: " + getCustomerGateways() );
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
    