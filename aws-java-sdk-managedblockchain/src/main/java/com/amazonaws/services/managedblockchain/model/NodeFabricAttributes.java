/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeFabricAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeFabricAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint that identifies the peer node for all services except peer channel-based event services.
     * </p>
     */
    private String peerEndpoint;
    /**
     * <p>
     * The endpoint that identifies the peer node for peer channel-based event services.
     * </p>
     */
    private String peerEventEndpoint;

    /**
     * <p>
     * The endpoint that identifies the peer node for all services except peer channel-based event services.
     * </p>
     * 
     * @param peerEndpoint
     *        The endpoint that identifies the peer node for all services except peer channel-based event services.
     */

    public void setPeerEndpoint(String peerEndpoint) {
        this.peerEndpoint = peerEndpoint;
    }

    /**
     * <p>
     * The endpoint that identifies the peer node for all services except peer channel-based event services.
     * </p>
     * 
     * @return The endpoint that identifies the peer node for all services except peer channel-based event services.
     */

    public String getPeerEndpoint() {
        return this.peerEndpoint;
    }

    /**
     * <p>
     * The endpoint that identifies the peer node for all services except peer channel-based event services.
     * </p>
     * 
     * @param peerEndpoint
     *        The endpoint that identifies the peer node for all services except peer channel-based event services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeFabricAttributes withPeerEndpoint(String peerEndpoint) {
        setPeerEndpoint(peerEndpoint);
        return this;
    }

    /**
     * <p>
     * The endpoint that identifies the peer node for peer channel-based event services.
     * </p>
     * 
     * @param peerEventEndpoint
     *        The endpoint that identifies the peer node for peer channel-based event services.
     */

    public void setPeerEventEndpoint(String peerEventEndpoint) {
        this.peerEventEndpoint = peerEventEndpoint;
    }

    /**
     * <p>
     * The endpoint that identifies the peer node for peer channel-based event services.
     * </p>
     * 
     * @return The endpoint that identifies the peer node for peer channel-based event services.
     */

    public String getPeerEventEndpoint() {
        return this.peerEventEndpoint;
    }

    /**
     * <p>
     * The endpoint that identifies the peer node for peer channel-based event services.
     * </p>
     * 
     * @param peerEventEndpoint
     *        The endpoint that identifies the peer node for peer channel-based event services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeFabricAttributes withPeerEventEndpoint(String peerEventEndpoint) {
        setPeerEventEndpoint(peerEventEndpoint);
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
        if (getPeerEndpoint() != null)
            sb.append("PeerEndpoint: ").append(getPeerEndpoint()).append(",");
        if (getPeerEventEndpoint() != null)
            sb.append("PeerEventEndpoint: ").append(getPeerEventEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeFabricAttributes == false)
            return false;
        NodeFabricAttributes other = (NodeFabricAttributes) obj;
        if (other.getPeerEndpoint() == null ^ this.getPeerEndpoint() == null)
            return false;
        if (other.getPeerEndpoint() != null && other.getPeerEndpoint().equals(this.getPeerEndpoint()) == false)
            return false;
        if (other.getPeerEventEndpoint() == null ^ this.getPeerEventEndpoint() == null)
            return false;
        if (other.getPeerEventEndpoint() != null && other.getPeerEventEndpoint().equals(this.getPeerEventEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeerEndpoint() == null) ? 0 : getPeerEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPeerEventEndpoint() == null) ? 0 : getPeerEventEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public NodeFabricAttributes clone() {
        try {
            return (NodeFabricAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeFabricAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
