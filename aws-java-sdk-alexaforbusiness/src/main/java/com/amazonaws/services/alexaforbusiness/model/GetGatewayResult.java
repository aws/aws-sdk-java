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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the gateway.
     * </p>
     */
    private Gateway gateway;

    /**
     * <p>
     * The details of the gateway.
     * </p>
     * 
     * @param gateway
     *        The details of the gateway.
     */

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    /**
     * <p>
     * The details of the gateway.
     * </p>
     * 
     * @return The details of the gateway.
     */

    public Gateway getGateway() {
        return this.gateway;
    }

    /**
     * <p>
     * The details of the gateway.
     * </p>
     * 
     * @param gateway
     *        The details of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayResult withGateway(Gateway gateway) {
        setGateway(gateway);
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
        if (getGateway() != null)
            sb.append("Gateway: ").append(getGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGatewayResult == false)
            return false;
        GetGatewayResult other = (GetGatewayResult) obj;
        if (other.getGateway() == null ^ this.getGateway() == null)
            return false;
        if (other.getGateway() != null && other.getGateway().equals(this.getGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGateway() == null) ? 0 : getGateway().hashCode());
        return hashCode;
    }

    @Override
    public GetGatewayResult clone() {
        try {
            return (GetGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
