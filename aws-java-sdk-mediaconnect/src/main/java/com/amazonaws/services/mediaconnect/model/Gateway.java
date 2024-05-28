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
 * The settings for a gateway, including its networks.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Gateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Gateway implements Serializable, Cloneable, StructuredPojo {

    /**
     * The range of IP addresses that contribute content or initiate output requests for flows communicating with this
     * gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     */
    private java.util.List<String> egressCidrBlocks;
    /** The Amazon Resource Name (ARN) of the gateway. */
    private String gatewayArn;

    private java.util.List<MessageDetail> gatewayMessages;
    /** The current status of the gateway. */
    private String gatewayState;
    /** The name of the gateway. This name can not be modified after the gateway is created. */
    private String name;
    /** The list of networks in the gateway. */
    private java.util.List<GatewayNetwork> networks;

    /**
     * The range of IP addresses that contribute content or initiate output requests for flows communicating with this
     * gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     * 
     * @return The range of IP addresses that contribute content or initiate output requests for flows communicating
     *         with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR)
     *         block; for example, 10.0.0.0/16.
     */

    public java.util.List<String> getEgressCidrBlocks() {
        return egressCidrBlocks;
    }

    /**
     * The range of IP addresses that contribute content or initiate output requests for flows communicating with this
     * gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     * 
     * @param egressCidrBlocks
     *        The range of IP addresses that contribute content or initiate output requests for flows communicating with
     *        this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     *        for example, 10.0.0.0/16.
     */

    public void setEgressCidrBlocks(java.util.Collection<String> egressCidrBlocks) {
        if (egressCidrBlocks == null) {
            this.egressCidrBlocks = null;
            return;
        }

        this.egressCidrBlocks = new java.util.ArrayList<String>(egressCidrBlocks);
    }

    /**
     * The range of IP addresses that contribute content or initiate output requests for flows communicating with this
     * gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEgressCidrBlocks(java.util.Collection)} or {@link #withEgressCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param egressCidrBlocks
     *        The range of IP addresses that contribute content or initiate output requests for flows communicating with
     *        this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     *        for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withEgressCidrBlocks(String... egressCidrBlocks) {
        if (this.egressCidrBlocks == null) {
            setEgressCidrBlocks(new java.util.ArrayList<String>(egressCidrBlocks.length));
        }
        for (String ele : egressCidrBlocks) {
            this.egressCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * The range of IP addresses that contribute content or initiate output requests for flows communicating with this
     * gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
     * 
     * @param egressCidrBlocks
     *        The range of IP addresses that contribute content or initiate output requests for flows communicating with
     *        this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     *        for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withEgressCidrBlocks(java.util.Collection<String> egressCidrBlocks) {
        setEgressCidrBlocks(egressCidrBlocks);
        return this;
    }

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

    public Gateway withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<MessageDetail> getGatewayMessages() {
        return gatewayMessages;
    }

    /**
     * @param gatewayMessages
     */

    public void setGatewayMessages(java.util.Collection<MessageDetail> gatewayMessages) {
        if (gatewayMessages == null) {
            this.gatewayMessages = null;
            return;
        }

        this.gatewayMessages = new java.util.ArrayList<MessageDetail>(gatewayMessages);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayMessages(java.util.Collection)} or {@link #withGatewayMessages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param gatewayMessages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withGatewayMessages(MessageDetail... gatewayMessages) {
        if (this.gatewayMessages == null) {
            setGatewayMessages(new java.util.ArrayList<MessageDetail>(gatewayMessages.length));
        }
        for (MessageDetail ele : gatewayMessages) {
            this.gatewayMessages.add(ele);
        }
        return this;
    }

    /**
     * @param gatewayMessages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withGatewayMessages(java.util.Collection<MessageDetail> gatewayMessages) {
        setGatewayMessages(gatewayMessages);
        return this;
    }

    /**
     * The current status of the gateway.
     * 
     * @param gatewayState
     *        The current status of the gateway.
     * @see GatewayState
     */

    public void setGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
    }

    /**
     * The current status of the gateway.
     * 
     * @return The current status of the gateway.
     * @see GatewayState
     */

    public String getGatewayState() {
        return this.gatewayState;
    }

    /**
     * The current status of the gateway.
     * 
     * @param gatewayState
     *        The current status of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayState
     */

    public Gateway withGatewayState(String gatewayState) {
        setGatewayState(gatewayState);
        return this;
    }

    /**
     * The current status of the gateway.
     * 
     * @param gatewayState
     *        The current status of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayState
     */

    public Gateway withGatewayState(GatewayState gatewayState) {
        this.gatewayState = gatewayState.toString();
        return this;
    }

    /**
     * The name of the gateway. This name can not be modified after the gateway is created.
     * 
     * @param name
     *        The name of the gateway. This name can not be modified after the gateway is created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the gateway. This name can not be modified after the gateway is created.
     * 
     * @return The name of the gateway. This name can not be modified after the gateway is created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the gateway. This name can not be modified after the gateway is created.
     * 
     * @param name
     *        The name of the gateway. This name can not be modified after the gateway is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The list of networks in the gateway.
     * 
     * @return The list of networks in the gateway.
     */

    public java.util.List<GatewayNetwork> getNetworks() {
        return networks;
    }

    /**
     * The list of networks in the gateway.
     * 
     * @param networks
     *        The list of networks in the gateway.
     */

    public void setNetworks(java.util.Collection<GatewayNetwork> networks) {
        if (networks == null) {
            this.networks = null;
            return;
        }

        this.networks = new java.util.ArrayList<GatewayNetwork>(networks);
    }

    /**
     * The list of networks in the gateway.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworks(java.util.Collection)} or {@link #withNetworks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param networks
     *        The list of networks in the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withNetworks(GatewayNetwork... networks) {
        if (this.networks == null) {
            setNetworks(new java.util.ArrayList<GatewayNetwork>(networks.length));
        }
        for (GatewayNetwork ele : networks) {
            this.networks.add(ele);
        }
        return this;
    }

    /**
     * The list of networks in the gateway.
     * 
     * @param networks
     *        The list of networks in the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gateway withNetworks(java.util.Collection<GatewayNetwork> networks) {
        setNetworks(networks);
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
        if (getEgressCidrBlocks() != null)
            sb.append("EgressCidrBlocks: ").append(getEgressCidrBlocks()).append(",");
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getGatewayMessages() != null)
            sb.append("GatewayMessages: ").append(getGatewayMessages()).append(",");
        if (getGatewayState() != null)
            sb.append("GatewayState: ").append(getGatewayState()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworks() != null)
            sb.append("Networks: ").append(getNetworks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Gateway == false)
            return false;
        Gateway other = (Gateway) obj;
        if (other.getEgressCidrBlocks() == null ^ this.getEgressCidrBlocks() == null)
            return false;
        if (other.getEgressCidrBlocks() != null && other.getEgressCidrBlocks().equals(this.getEgressCidrBlocks()) == false)
            return false;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getGatewayMessages() == null ^ this.getGatewayMessages() == null)
            return false;
        if (other.getGatewayMessages() != null && other.getGatewayMessages().equals(this.getGatewayMessages()) == false)
            return false;
        if (other.getGatewayState() == null ^ this.getGatewayState() == null)
            return false;
        if (other.getGatewayState() != null && other.getGatewayState().equals(this.getGatewayState()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworks() == null ^ this.getNetworks() == null)
            return false;
        if (other.getNetworks() != null && other.getNetworks().equals(this.getNetworks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressCidrBlocks() == null) ? 0 : getEgressCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getGatewayMessages() == null) ? 0 : getGatewayMessages().hashCode());
        hashCode = prime * hashCode + ((getGatewayState() == null) ? 0 : getGatewayState().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworks() == null) ? 0 : getNetworks().hashCode());
        return hashCode;
    }

    @Override
    public Gateway clone() {
        try {
            return (Gateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.GatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
