/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class CreateNatGatewayResult implements Serializable, Cloneable {

    /**
     * Information about the NAT gateway.
     */
    private NatGateway natGateway;

    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     */
    private String clientToken;

    /**
     * Information about the NAT gateway.
     *
     * @return Information about the NAT gateway.
     */
    public NatGateway getNatGateway() {
        return natGateway;
    }
    
    /**
     * Information about the NAT gateway.
     *
     * @param natGateway Information about the NAT gateway.
     */
    public void setNatGateway(NatGateway natGateway) {
        this.natGateway = natGateway;
    }
    
    /**
     * Information about the NAT gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGateway Information about the NAT gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNatGatewayResult withNatGateway(NatGateway natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     *
     * @return Unique, case-sensitive identifier to ensure the idempotency of the
     *         request. Only returned if a client token was provided in the request.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     *
     * @param clientToken Unique, case-sensitive identifier to ensure the idempotency of the
     *         request. Only returned if a client token was provided in the request.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier to ensure the idempotency of the
     *         request. Only returned if a client token was provided in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNatGatewayResult withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getNatGateway() != null) sb.append("NatGateway: " + getNatGateway() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNatGateway() == null) ? 0 : getNatGateway().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateNatGatewayResult == false) return false;
        CreateNatGatewayResult other = (CreateNatGatewayResult)obj;
        
        if (other.getNatGateway() == null ^ this.getNatGateway() == null) return false;
        if (other.getNatGateway() != null && other.getNatGateway().equals(this.getNatGateway()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateNatGatewayResult clone() {
        try {
            return (CreateNatGatewayResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    