/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNatGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     */
    private NatGateway natGateway;

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client
     *        token was provided in the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client
     *         token was provided in the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was
     * provided in the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client
     *        token was provided in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNatGatewayResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     * 
     * @param natGateway
     *        Information about the NAT gateway.
     */

    public void setNatGateway(NatGateway natGateway) {
        this.natGateway = natGateway;
    }

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     * 
     * @return Information about the NAT gateway.
     */

    public NatGateway getNatGateway() {
        return this.natGateway;
    }

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     * 
     * @param natGateway
     *        Information about the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNatGatewayResult withNatGateway(NatGateway natGateway) {
        setNatGateway(natGateway);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getNatGateway() != null)
            sb.append("NatGateway: ").append(getNatGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNatGatewayResult == false)
            return false;
        CreateNatGatewayResult other = (CreateNatGatewayResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNatGateway() == null ^ this.getNatGateway() == null)
            return false;
        if (other.getNatGateway() != null && other.getNatGateway().equals(this.getNatGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNatGateway() == null) ? 0 : getNatGateway().hashCode());
        return hashCode;
    }

    @Override
    public CreateNatGatewayResult clone() {
        try {
            return (CreateNatGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
