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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the network impairment for a specific network measured by Amazon CloudWatch Internet Monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/NetworkImpairment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkImpairment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The networks that could be impacted by a network impairment event.
     * </p>
     */
    private java.util.List<Network> networks;
    /**
     * <p>
     * The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * </p>
     */
    private java.util.List<Network> asPath;
    /**
     * <p>
     * The type of network impairment.
     * </p>
     */
    private String networkEventType;

    /**
     * <p>
     * The networks that could be impacted by a network impairment event.
     * </p>
     * 
     * @return The networks that could be impacted by a network impairment event.
     */

    public java.util.List<Network> getNetworks() {
        return networks;
    }

    /**
     * <p>
     * The networks that could be impacted by a network impairment event.
     * </p>
     * 
     * @param networks
     *        The networks that could be impacted by a network impairment event.
     */

    public void setNetworks(java.util.Collection<Network> networks) {
        if (networks == null) {
            this.networks = null;
            return;
        }

        this.networks = new java.util.ArrayList<Network>(networks);
    }

    /**
     * <p>
     * The networks that could be impacted by a network impairment event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworks(java.util.Collection)} or {@link #withNetworks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param networks
     *        The networks that could be impacted by a network impairment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkImpairment withNetworks(Network... networks) {
        if (this.networks == null) {
            setNetworks(new java.util.ArrayList<Network>(networks.length));
        }
        for (Network ele : networks) {
            this.networks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The networks that could be impacted by a network impairment event.
     * </p>
     * 
     * @param networks
     *        The networks that could be impacted by a network impairment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkImpairment withNetworks(java.util.Collection<Network> networks) {
        setNetworks(networks);
        return this;
    }

    /**
     * <p>
     * The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * </p>
     * 
     * @return The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     */

    public java.util.List<Network> getAsPath() {
        return asPath;
    }

    /**
     * <p>
     * The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * </p>
     * 
     * @param asPath
     *        The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     */

    public void setAsPath(java.util.Collection<Network> asPath) {
        if (asPath == null) {
            this.asPath = null;
            return;
        }

        this.asPath = new java.util.ArrayList<Network>(asPath);
    }

    /**
     * <p>
     * The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAsPath(java.util.Collection)} or {@link #withAsPath(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param asPath
     *        The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkImpairment withAsPath(Network... asPath) {
        if (this.asPath == null) {
            setAsPath(new java.util.ArrayList<Network>(asPath.length));
        }
        for (Network ele : asPath) {
            this.asPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * </p>
     * 
     * @param asPath
     *        The combination of the Autonomous System Number (ASN) of the network and the name of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkImpairment withAsPath(java.util.Collection<Network> asPath) {
        setAsPath(asPath);
        return this;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param networkEventType
     *        The type of network impairment.
     * @see TriangulationEventType
     */

    public void setNetworkEventType(String networkEventType) {
        this.networkEventType = networkEventType;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @return The type of network impairment.
     * @see TriangulationEventType
     */

    public String getNetworkEventType() {
        return this.networkEventType;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param networkEventType
     *        The type of network impairment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriangulationEventType
     */

    public NetworkImpairment withNetworkEventType(String networkEventType) {
        setNetworkEventType(networkEventType);
        return this;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param networkEventType
     *        The type of network impairment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriangulationEventType
     */

    public NetworkImpairment withNetworkEventType(TriangulationEventType networkEventType) {
        this.networkEventType = networkEventType.toString();
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
        if (getNetworks() != null)
            sb.append("Networks: ").append(getNetworks()).append(",");
        if (getAsPath() != null)
            sb.append("AsPath: ").append(getAsPath()).append(",");
        if (getNetworkEventType() != null)
            sb.append("NetworkEventType: ").append(getNetworkEventType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkImpairment == false)
            return false;
        NetworkImpairment other = (NetworkImpairment) obj;
        if (other.getNetworks() == null ^ this.getNetworks() == null)
            return false;
        if (other.getNetworks() != null && other.getNetworks().equals(this.getNetworks()) == false)
            return false;
        if (other.getAsPath() == null ^ this.getAsPath() == null)
            return false;
        if (other.getAsPath() != null && other.getAsPath().equals(this.getAsPath()) == false)
            return false;
        if (other.getNetworkEventType() == null ^ this.getNetworkEventType() == null)
            return false;
        if (other.getNetworkEventType() != null && other.getNetworkEventType().equals(this.getNetworkEventType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworks() == null) ? 0 : getNetworks().hashCode());
        hashCode = prime * hashCode + ((getAsPath() == null) ? 0 : getAsPath().hashCode());
        hashCode = prime * hashCode + ((getNetworkEventType() == null) ? 0 : getNetworkEventType().hashCode());
        return hashCode;
    }

    @Override
    public NetworkImpairment clone() {
        try {
            return (NetworkImpairment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.NetworkImpairmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
