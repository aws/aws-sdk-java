/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the wireless gateway to get.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The type of identifier used in <code>identifier</code>.
     * </p>
     */
    private String identifierType;

    /**
     * <p>
     * The identifier of the wireless gateway to get.
     * </p>
     * 
     * @param identifier
     *        The identifier of the wireless gateway to get.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the wireless gateway to get.
     * </p>
     * 
     * @return The identifier of the wireless gateway to get.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the wireless gateway to get.
     * </p>
     * 
     * @param identifier
     *        The identifier of the wireless gateway to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The type of identifier used in <code>identifier</code>.
     * </p>
     * 
     * @param identifierType
     *        The type of identifier used in <code>identifier</code>.
     * @see WirelessGatewayIdType
     */

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    /**
     * <p>
     * The type of identifier used in <code>identifier</code>.
     * </p>
     * 
     * @return The type of identifier used in <code>identifier</code>.
     * @see WirelessGatewayIdType
     */

    public String getIdentifierType() {
        return this.identifierType;
    }

    /**
     * <p>
     * The type of identifier used in <code>identifier</code>.
     * </p>
     * 
     * @param identifierType
     *        The type of identifier used in <code>identifier</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayIdType
     */

    public GetWirelessGatewayRequest withIdentifierType(String identifierType) {
        setIdentifierType(identifierType);
        return this;
    }

    /**
     * <p>
     * The type of identifier used in <code>identifier</code>.
     * </p>
     * 
     * @param identifierType
     *        The type of identifier used in <code>identifier</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayIdType
     */

    public GetWirelessGatewayRequest withIdentifierType(WirelessGatewayIdType identifierType) {
        this.identifierType = identifierType.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getIdentifierType() != null)
            sb.append("IdentifierType: ").append(getIdentifierType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessGatewayRequest == false)
            return false;
        GetWirelessGatewayRequest other = (GetWirelessGatewayRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getIdentifierType() == null ^ this.getIdentifierType() == null)
            return false;
        if (other.getIdentifierType() != null && other.getIdentifierType().equals(this.getIdentifierType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifierType() == null) ? 0 : getIdentifierType().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayRequest clone() {
        return (GetWirelessGatewayRequest) super.clone();
    }

}
