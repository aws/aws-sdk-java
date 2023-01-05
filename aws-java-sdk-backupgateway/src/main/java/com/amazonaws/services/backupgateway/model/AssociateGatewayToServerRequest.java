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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/AssociateGatewayToServer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateGatewayToServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     */
    private String gatewayArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     * </p>
     */
    private String serverArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *        list of gateways for your account and Amazon Web Services Region.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *         list of gateways for your account and Amazon Web Services Region.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and Amazon Web Services Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *        list of gateways for your account and Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateGatewayToServerRequest withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     * </p>
     * 
     * @param serverArn
     *        The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     */

    public void setServerArn(String serverArn) {
        this.serverArn = serverArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     */

    public String getServerArn() {
        return this.serverArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     * </p>
     * 
     * @param serverArn
     *        The Amazon Resource Name (ARN) of the server that hosts your virtual machines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateGatewayToServerRequest withServerArn(String serverArn) {
        setServerArn(serverArn);
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
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getServerArn() != null)
            sb.append("ServerArn: ").append(getServerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateGatewayToServerRequest == false)
            return false;
        AssociateGatewayToServerRequest other = (AssociateGatewayToServerRequest) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getServerArn() == null ^ this.getServerArn() == null)
            return false;
        if (other.getServerArn() != null && other.getServerArn().equals(this.getServerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getServerArn() == null) ? 0 : getServerArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateGatewayToServerRequest clone() {
        return (AssociateGatewayToServerRequest) super.clone();
    }

}
