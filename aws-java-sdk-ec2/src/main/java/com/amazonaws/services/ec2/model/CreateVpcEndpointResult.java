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
public class CreateVpcEndpointResult implements Serializable, Cloneable {

    /**
     * Information about the endpoint.
     */
    private VpcEndpoint vpcEndpoint;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     */
    private String clientToken;

    /**
     * Information about the endpoint.
     *
     * @return Information about the endpoint.
     */
    public VpcEndpoint getVpcEndpoint() {
        return vpcEndpoint;
    }
    
    /**
     * Information about the endpoint.
     *
     * @param vpcEndpoint Information about the endpoint.
     */
    public void setVpcEndpoint(VpcEndpoint vpcEndpoint) {
        this.vpcEndpoint = vpcEndpoint;
    }
    
    /**
     * Information about the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpoint Information about the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointResult withVpcEndpoint(VpcEndpoint vpcEndpoint) {
        this.vpcEndpoint = vpcEndpoint;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointResult withClientToken(String clientToken) {
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
        if (getVpcEndpoint() != null) sb.append("VpcEndpoint: " + getVpcEndpoint() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcEndpoint() == null) ? 0 : getVpcEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpcEndpointResult == false) return false;
        CreateVpcEndpointResult other = (CreateVpcEndpointResult)obj;
        
        if (other.getVpcEndpoint() == null ^ this.getVpcEndpoint() == null) return false;
        if (other.getVpcEndpoint() != null && other.getVpcEndpoint().equals(this.getVpcEndpoint()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateVpcEndpointResult clone() {
        try {
            return (CreateVpcEndpointResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    