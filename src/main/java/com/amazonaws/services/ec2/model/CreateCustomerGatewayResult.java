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
public class CreateCustomerGatewayResult implements Serializable {

    /**
     * Information about the customer gateway.
     */
    private CustomerGateway customerGateway;

    /**
     * Information about the customer gateway.
     *
     * @return Information about the customer gateway.
     */
    public CustomerGateway getCustomerGateway() {
        return customerGateway;
    }
    
    /**
     * Information about the customer gateway.
     *
     * @param customerGateway Information about the customer gateway.
     */
    public void setCustomerGateway(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }
    
    /**
     * Information about the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGateway Information about the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCustomerGatewayResult withCustomerGateway(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
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
        if (getCustomerGateway() != null) sb.append("CustomerGateway: " + getCustomerGateway() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCustomerGateway() == null) ? 0 : getCustomerGateway().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateCustomerGatewayResult == false) return false;
        CreateCustomerGatewayResult other = (CreateCustomerGatewayResult)obj;
        
        if (other.getCustomerGateway() == null ^ this.getCustomerGateway() == null) return false;
        if (other.getCustomerGateway() != null && other.getCustomerGateway().equals(this.getCustomerGateway()) == false) return false; 
        return true;
    }
    
}
    