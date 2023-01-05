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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network Connect peer association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ConnectPeerAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectPeerAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     */
    private String connectPeerId;
    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the device to connect to.
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
     * The state of the Connect peer association.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param connectPeerId
     *        The ID of the Connect peer.
     */

    public void setConnectPeerId(String connectPeerId) {
        this.connectPeerId = connectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @return The ID of the Connect peer.
     */

    public String getConnectPeerId() {
        return this.connectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param connectPeerId
     *        The ID of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerAssociation withConnectPeerId(String connectPeerId) {
        setConnectPeerId(connectPeerId);
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

    public ConnectPeerAssociation withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the device to connect to.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device to connect to.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device to connect to.
     * </p>
     * 
     * @return The ID of the device to connect to.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the device to connect to.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device to connect to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeerAssociation withDeviceId(String deviceId) {
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

    public ConnectPeerAssociation withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The state of the Connect peer association.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer association.
     * @see ConnectPeerAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Connect peer association.
     * </p>
     * 
     * @return The state of the Connect peer association.
     * @see ConnectPeerAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Connect peer association.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectPeerAssociationState
     */

    public ConnectPeerAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Connect peer association.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectPeerAssociationState
     */

    public ConnectPeerAssociation withState(ConnectPeerAssociationState state) {
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
        if (getConnectPeerId() != null)
            sb.append("ConnectPeerId: ").append(getConnectPeerId()).append(",");
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

        if (obj instanceof ConnectPeerAssociation == false)
            return false;
        ConnectPeerAssociation other = (ConnectPeerAssociation) obj;
        if (other.getConnectPeerId() == null ^ this.getConnectPeerId() == null)
            return false;
        if (other.getConnectPeerId() != null && other.getConnectPeerId().equals(this.getConnectPeerId()) == false)
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

        hashCode = prime * hashCode + ((getConnectPeerId() == null) ? 0 : getConnectPeerId().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ConnectPeerAssociation clone() {
        try {
            return (ConnectPeerAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectPeerAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
