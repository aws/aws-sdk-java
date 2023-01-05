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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateConnectPeer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateConnectPeerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of your global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     */
    private String connectPeerId;
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
     * The ID of your global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of your global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of your global network.
     * </p>
     * 
     * @return The ID of your global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of your global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of your global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateConnectPeerRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

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

    public AssociateConnectPeerRequest withConnectPeerId(String connectPeerId) {
        setConnectPeerId(connectPeerId);
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

    public AssociateConnectPeerRequest withDeviceId(String deviceId) {
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

    public AssociateConnectPeerRequest withLinkId(String linkId) {
        setLinkId(linkId);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getConnectPeerId() != null)
            sb.append("ConnectPeerId: ").append(getConnectPeerId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getLinkId() != null)
            sb.append("LinkId: ").append(getLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateConnectPeerRequest == false)
            return false;
        AssociateConnectPeerRequest other = (AssociateConnectPeerRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getConnectPeerId() == null ^ this.getConnectPeerId() == null)
            return false;
        if (other.getConnectPeerId() != null && other.getConnectPeerId().equals(this.getConnectPeerId()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getLinkId() == null ^ this.getLinkId() == null)
            return false;
        if (other.getLinkId() != null && other.getLinkId().equals(this.getLinkId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getConnectPeerId() == null) ? 0 : getConnectPeerId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateConnectPeerRequest clone() {
        return (AssociateConnectPeerRequest) super.clone();
    }

}
