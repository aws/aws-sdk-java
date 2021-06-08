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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a transit gateway Connect peer association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TransitGatewayConnectPeerAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnectPeerAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     */
    private String transitGatewayConnectPeerArn;
    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The ID of the link.
     * </p>
     */
    private String linkId;
    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerArn
     *        The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     */

    public void setTransitGatewayConnectPeerArn(String transitGatewayConnectPeerArn) {
        this.transitGatewayConnectPeerArn = transitGatewayConnectPeerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     */

    public String getTransitGatewayConnectPeerArn() {
        return this.transitGatewayConnectPeerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerArn
     *        The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerAssociation withTransitGatewayConnectPeerArn(String transitGatewayConnectPeerArn) {
        setTransitGatewayConnectPeerArn(transitGatewayConnectPeerArn);
        return this;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerAssociation withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @return The ID of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerAssociation withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the link.
     * </p>
     * 
     * @param linkId
     *        The ID of the link.
     */

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * <p>
     * The ID of the link.
     * </p>
     * 
     * @return The ID of the link.
     */

    public String getLinkId() {
        return this.linkId;
    }

    /**
     * <p>
     * The ID of the link.
     * </p>
     * 
     * @param linkId
     *        The ID of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeerAssociation withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @see TransitGatewayConnectPeerAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @return The state of the association.
     * @see TransitGatewayConnectPeerAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayConnectPeerAssociationState
     */

    public TransitGatewayConnectPeerAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayConnectPeerAssociationState
     */

    public TransitGatewayConnectPeerAssociation withState(TransitGatewayConnectPeerAssociationState state) {
        this.state = state.toString();
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
        if (getTransitGatewayConnectPeerArn() != null)
            sb.append("TransitGatewayConnectPeerArn: ").append(getTransitGatewayConnectPeerArn()).append(",");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getLinkId() != null)
            sb.append("LinkId: ").append(getLinkId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayConnectPeerAssociation == false)
            return false;
        TransitGatewayConnectPeerAssociation other = (TransitGatewayConnectPeerAssociation) obj;
        if (other.getTransitGatewayConnectPeerArn() == null ^ this.getTransitGatewayConnectPeerArn() == null)
            return false;
        if (other.getTransitGatewayConnectPeerArn() != null && other.getTransitGatewayConnectPeerArn().equals(this.getTransitGatewayConnectPeerArn()) == false)
            return false;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getLinkId() == null ^ this.getLinkId() == null)
            return false;
        if (other.getLinkId() != null && other.getLinkId().equals(this.getLinkId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayConnectPeerArn() == null) ? 0 : getTransitGatewayConnectPeerArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayConnectPeerAssociation clone() {
        try {
            return (TransitGatewayConnectPeerAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.TransitGatewayConnectPeerAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
