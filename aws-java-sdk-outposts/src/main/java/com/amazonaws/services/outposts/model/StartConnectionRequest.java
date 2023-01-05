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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The serial number of the dongle.
     * </p>
     */
    private String deviceSerialNumber;
    /**
     * <p>
     * The ID of the Outpost server.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The public key of the client.
     * </p>
     */
    private String clientPublicKey;
    /**
     * <p>
     * The device index of the network interface on the Outpost server.
     * </p>
     */
    private Integer networkInterfaceDeviceIndex;

    /**
     * <p>
     * The serial number of the dongle.
     * </p>
     * 
     * @param deviceSerialNumber
     *        The serial number of the dongle.
     */

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    /**
     * <p>
     * The serial number of the dongle.
     * </p>
     * 
     * @return The serial number of the dongle.
     */

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    /**
     * <p>
     * The serial number of the dongle.
     * </p>
     * 
     * @param deviceSerialNumber
     *        The serial number of the dongle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConnectionRequest withDeviceSerialNumber(String deviceSerialNumber) {
        setDeviceSerialNumber(deviceSerialNumber);
        return this;
    }

    /**
     * <p>
     * The ID of the Outpost server.
     * </p>
     * 
     * @param assetId
     *        The ID of the Outpost server.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the Outpost server.
     * </p>
     * 
     * @return The ID of the Outpost server.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the Outpost server.
     * </p>
     * 
     * @param assetId
     *        The ID of the Outpost server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConnectionRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The public key of the client.
     * </p>
     * 
     * @param clientPublicKey
     *        The public key of the client.
     */

    public void setClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
    }

    /**
     * <p>
     * The public key of the client.
     * </p>
     * 
     * @return The public key of the client.
     */

    public String getClientPublicKey() {
        return this.clientPublicKey;
    }

    /**
     * <p>
     * The public key of the client.
     * </p>
     * 
     * @param clientPublicKey
     *        The public key of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConnectionRequest withClientPublicKey(String clientPublicKey) {
        setClientPublicKey(clientPublicKey);
        return this;
    }

    /**
     * <p>
     * The device index of the network interface on the Outpost server.
     * </p>
     * 
     * @param networkInterfaceDeviceIndex
     *        The device index of the network interface on the Outpost server.
     */

    public void setNetworkInterfaceDeviceIndex(Integer networkInterfaceDeviceIndex) {
        this.networkInterfaceDeviceIndex = networkInterfaceDeviceIndex;
    }

    /**
     * <p>
     * The device index of the network interface on the Outpost server.
     * </p>
     * 
     * @return The device index of the network interface on the Outpost server.
     */

    public Integer getNetworkInterfaceDeviceIndex() {
        return this.networkInterfaceDeviceIndex;
    }

    /**
     * <p>
     * The device index of the network interface on the Outpost server.
     * </p>
     * 
     * @param networkInterfaceDeviceIndex
     *        The device index of the network interface on the Outpost server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConnectionRequest withNetworkInterfaceDeviceIndex(Integer networkInterfaceDeviceIndex) {
        setNetworkInterfaceDeviceIndex(networkInterfaceDeviceIndex);
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
        if (getDeviceSerialNumber() != null)
            sb.append("DeviceSerialNumber: ").append(getDeviceSerialNumber()).append(",");
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getClientPublicKey() != null)
            sb.append("ClientPublicKey: ").append(getClientPublicKey()).append(",");
        if (getNetworkInterfaceDeviceIndex() != null)
            sb.append("NetworkInterfaceDeviceIndex: ").append(getNetworkInterfaceDeviceIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartConnectionRequest == false)
            return false;
        StartConnectionRequest other = (StartConnectionRequest) obj;
        if (other.getDeviceSerialNumber() == null ^ this.getDeviceSerialNumber() == null)
            return false;
        if (other.getDeviceSerialNumber() != null && other.getDeviceSerialNumber().equals(this.getDeviceSerialNumber()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getClientPublicKey() == null ^ this.getClientPublicKey() == null)
            return false;
        if (other.getClientPublicKey() != null && other.getClientPublicKey().equals(this.getClientPublicKey()) == false)
            return false;
        if (other.getNetworkInterfaceDeviceIndex() == null ^ this.getNetworkInterfaceDeviceIndex() == null)
            return false;
        if (other.getNetworkInterfaceDeviceIndex() != null && other.getNetworkInterfaceDeviceIndex().equals(this.getNetworkInterfaceDeviceIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceSerialNumber() == null) ? 0 : getDeviceSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getClientPublicKey() == null) ? 0 : getClientPublicKey().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceDeviceIndex() == null) ? 0 : getNetworkInterfaceDeviceIndex().hashCode());
        return hashCode;
    }

    @Override
    public StartConnectionRequest clone() {
        return (StartConnectionRequest) super.clone();
    }

}
