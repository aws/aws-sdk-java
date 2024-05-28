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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new gateway. The request must include at least one network (up to 4).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     * communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing
     * (CIDR) block; for example, 10.0.0.0/16.
     */
    private java.util.List<String> egressCidrBlocks;
    /** The name of the gateway. This name can not be modified after the gateway is created. */
    private String name;
    /** The list of networks that you want to add. */
    private java.util.List<GatewayNetwork> networks;

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     * communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing
     * (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @return The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     *         communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain
     *         Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public java.util.List<String> getEgressCidrBlocks() {
        return egressCidrBlocks;
    }

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     * communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing
     * (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param egressCidrBlocks
     *        The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     *        communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain
     *        Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public void setEgressCidrBlocks(java.util.Collection<String> egressCidrBlocks) {
        if (egressCidrBlocks == null) {
            this.egressCidrBlocks = null;
            return;
        }

        this.egressCidrBlocks = new java.util.ArrayList<String>(egressCidrBlocks);
    }

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     * communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing
     * (CIDR) block; for example, 10.0.0.0/16.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEgressCidrBlocks(java.util.Collection)} or {@link #withEgressCidrBlocks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param egressCidrBlocks
     *        The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     *        communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain
     *        Routing (CIDR) block; for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withEgressCidrBlocks(String... egressCidrBlocks) {
        if (this.egressCidrBlocks == null) {
            setEgressCidrBlocks(new java.util.ArrayList<String>(egressCidrBlocks.length));
        }
        for (String ele : egressCidrBlocks) {
            this.egressCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     * communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing
     * (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param egressCidrBlocks
     *        The range of IP addresses that are allowed to contribute content or initiate output requests for flows
     *        communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain
     *        Routing (CIDR) block; for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withEgressCidrBlocks(java.util.Collection<String> egressCidrBlocks) {
        setEgressCidrBlocks(egressCidrBlocks);
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

    public CreateGatewayRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The list of networks that you want to add.
     * 
     * @return The list of networks that you want to add.
     */

    public java.util.List<GatewayNetwork> getNetworks() {
        return networks;
    }

    /**
     * The list of networks that you want to add.
     * 
     * @param networks
     *        The list of networks that you want to add.
     */

    public void setNetworks(java.util.Collection<GatewayNetwork> networks) {
        if (networks == null) {
            this.networks = null;
            return;
        }

        this.networks = new java.util.ArrayList<GatewayNetwork>(networks);
    }

    /**
     * The list of networks that you want to add.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworks(java.util.Collection)} or {@link #withNetworks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param networks
     *        The list of networks that you want to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withNetworks(GatewayNetwork... networks) {
        if (this.networks == null) {
            setNetworks(new java.util.ArrayList<GatewayNetwork>(networks.length));
        }
        for (GatewayNetwork ele : networks) {
            this.networks.add(ele);
        }
        return this;
    }

    /**
     * The list of networks that you want to add.
     * 
     * @param networks
     *        The list of networks that you want to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withNetworks(java.util.Collection<GatewayNetwork> networks) {
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

        if (obj instanceof CreateGatewayRequest == false)
            return false;
        CreateGatewayRequest other = (CreateGatewayRequest) obj;
        if (other.getEgressCidrBlocks() == null ^ this.getEgressCidrBlocks() == null)
            return false;
        if (other.getEgressCidrBlocks() != null && other.getEgressCidrBlocks().equals(this.getEgressCidrBlocks()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworks() == null) ? 0 : getNetworks().hashCode());
        return hashCode;
    }

    @Override
    public CreateGatewayRequest clone() {
        return (CreateGatewayRequest) super.clone();
    }

}
