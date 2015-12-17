/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class DescribeNatGatewaysResult implements Serializable, Cloneable {

    /**
     * Information about the NAT gateways.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NatGateway> natGateways;

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * Information about the NAT gateways.
     *
     * @return Information about the NAT gateways.
     */
    public java.util.List<NatGateway> getNatGateways() {
        if (natGateways == null) {
              natGateways = new com.amazonaws.internal.ListWithAutoConstructFlag<NatGateway>();
              natGateways.setAutoConstruct(true);
        }
        return natGateways;
    }
    
    /**
     * Information about the NAT gateways.
     *
     * @param natGateways Information about the NAT gateways.
     */
    public void setNatGateways(java.util.Collection<NatGateway> natGateways) {
        if (natGateways == null) {
            this.natGateways = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NatGateway> natGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NatGateway>(natGateways.size());
        natGatewaysCopy.addAll(natGateways);
        this.natGateways = natGatewaysCopy;
    }
    
    /**
     * Information about the NAT gateways.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNatGateways(java.util.Collection)} or {@link
     * #withNatGateways(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGateways Information about the NAT gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysResult withNatGateways(NatGateway... natGateways) {
        if (getNatGateways() == null) setNatGateways(new java.util.ArrayList<NatGateway>(natGateways.length));
        for (NatGateway value : natGateways) {
            getNatGateways().add(value);
        }
        return this;
    }
    
    /**
     * Information about the NAT gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGateways Information about the NAT gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysResult withNatGateways(java.util.Collection<NatGateway> natGateways) {
        if (natGateways == null) {
            this.natGateways = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NatGateway> natGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NatGateway>(natGateways.size());
            natGatewaysCopy.addAll(natGateways);
            this.natGateways = natGatewaysCopy;
        }

        return this;
    }

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNatGateways() != null) sb.append("NatGateways: " + getNatGateways() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNatGateways() == null) ? 0 : getNatGateways().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNatGatewaysResult == false) return false;
        DescribeNatGatewaysResult other = (DescribeNatGatewaysResult)obj;
        
        if (other.getNatGateways() == null ^ this.getNatGateways() == null) return false;
        if (other.getNatGateways() != null && other.getNatGateways().equals(this.getNatGateways()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeNatGatewaysResult clone() {
        try {
            return (DescribeNatGatewaysResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    