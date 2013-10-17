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
 * Describe Internet Gateways Result
 */
public class DescribeInternetGatewaysResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<InternetGateway> internetGateways;

    /**
     * Returns the value of the InternetGateways property for this object.
     *
     * @return The value of the InternetGateways property for this object.
     */
    public java.util.List<InternetGateway> getInternetGateways() {
        if (internetGateways == null) {
              internetGateways = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGateway>();
              internetGateways.setAutoConstruct(true);
        }
        return internetGateways;
    }
    
    /**
     * Sets the value of the InternetGateways property for this object.
     *
     * @param internetGateways The new value for the InternetGateways property for this object.
     */
    public void setInternetGateways(java.util.Collection<InternetGateway> internetGateways) {
        if (internetGateways == null) {
            this.internetGateways = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InternetGateway> internetGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGateway>(internetGateways.size());
        internetGatewaysCopy.addAll(internetGateways);
        this.internetGateways = internetGatewaysCopy;
    }
    
    /**
     * Sets the value of the InternetGateways property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGateways The new value for the InternetGateways property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInternetGatewaysResult withInternetGateways(InternetGateway... internetGateways) {
        if (getInternetGateways() == null) setInternetGateways(new java.util.ArrayList<InternetGateway>(internetGateways.length));
        for (InternetGateway value : internetGateways) {
            getInternetGateways().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the InternetGateways property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGateways The new value for the InternetGateways property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInternetGatewaysResult withInternetGateways(java.util.Collection<InternetGateway> internetGateways) {
        if (internetGateways == null) {
            this.internetGateways = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InternetGateway> internetGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGateway>(internetGateways.size());
            internetGatewaysCopy.addAll(internetGateways);
            this.internetGateways = internetGatewaysCopy;
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
        if (getInternetGateways() != null) sb.append("InternetGateways: " + getInternetGateways() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInternetGateways() == null) ? 0 : getInternetGateways().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInternetGatewaysResult == false) return false;
        DescribeInternetGatewaysResult other = (DescribeInternetGatewaysResult)obj;
        
        if (other.getInternetGateways() == null ^ this.getInternetGateways() == null) return false;
        if (other.getInternetGateways() != null && other.getInternetGateways().equals(this.getInternetGateways()) == false) return false; 
        return true;
    }
    
}
    