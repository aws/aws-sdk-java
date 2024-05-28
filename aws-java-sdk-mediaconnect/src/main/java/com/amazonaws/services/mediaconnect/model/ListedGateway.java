/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Provides a summary of a gateway, including its name, ARN, and status.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListedGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedGateway implements Serializable, Cloneable, StructuredPojo {

    /** The Amazon Resource Name (ARN) of the gateway. */
    private String gatewayArn;

    private String gatewayState;
    /** The name of the gateway. */
    private String name;

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     * @return The Amazon Resource Name (ARN) of the gateway.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedGateway withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * @param gatewayState
     * @see GatewayState
     */

    public void setGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
    }

    /**
     * @return
     * @see GatewayState
     */

    public String getGatewayState() {
        return this.gatewayState;
    }

    /**
     * @param gatewayState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayState
     */

    public ListedGateway withGatewayState(String gatewayState) {
        setGatewayState(gatewayState);
        return this;
    }

    /**
     * @param gatewayState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayState
     */

    public ListedGateway withGatewayState(GatewayState gatewayState) {
        this.gatewayState = gatewayState.toString();
        return this;
    }

    /**
     * The name of the gateway.
     * 
     * @param name
     *        The name of the gateway.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the gateway.
     * 
     * @return The name of the gateway.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the gateway.
     * 
     * @param name
     *        The name of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedGateway withName(String name) {
        setName(name);
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
        if (getGatewayState() != null)
            sb.append("GatewayState: ").append(getGatewayState()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedGateway == false)
            return false;
        ListedGateway other = (ListedGateway) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getGatewayState() == null ^ this.getGatewayState() == null)
            return false;
        if (other.getGatewayState() != null && other.getGatewayState().equals(this.getGatewayState()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getGatewayState() == null) ? 0 : getGatewayState().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ListedGateway clone() {
        try {
            return (ListedGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.ListedGatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
