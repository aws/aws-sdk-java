/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     */
    private GatewayDetails gateway;

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @param gateway
     *        By providing the ARN (Amazon Resource Name), this API returns the gateway.
     */

    public void setGateway(GatewayDetails gateway) {
        this.gateway = gateway;
    }

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @return By providing the ARN (Amazon Resource Name), this API returns the gateway.
     */

    public GatewayDetails getGateway() {
        return this.gateway;
    }

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @param gateway
     *        By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayResult withGateway(GatewayDetails gateway) {
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
