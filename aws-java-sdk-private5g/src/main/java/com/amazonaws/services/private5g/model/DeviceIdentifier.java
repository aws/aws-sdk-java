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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a subscriber of a device that can use a network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeviceIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The creation time of this device identifier.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     */
    private String deviceIdentifierArn;
    /**
     * <p>
     * The Integrated Circuit Card Identifier of the device identifier.
     * </p>
     */
    private String iccid;
    /**
     * <p>
     * The International Mobile Subscriber Identity of the device identifier.
     * </p>
     */
    private String imsi;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     * </p>
     */
    private String orderArn;
    /**
     * <p>
     * The status of the device identifier.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     * </p>
     */
    private String trafficGroupArn;
    /**
     * <p>
     * The vendor of the device identifier.
     * </p>
     */
    private String vendor;

    /**
     * <p>
     * The creation time of this device identifier.
     * </p>
     * 
     * @param createdAt
     *        The creation time of this device identifier.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation time of this device identifier.
     * </p>
     * 
     * @return The creation time of this device identifier.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation time of this device identifier.
     * </p>
     * 
     * @param createdAt
     *        The creation time of this device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     * 
     * @param deviceIdentifierArn
     *        The Amazon Resource Name (ARN) of the device identifier.
     */

    public void setDeviceIdentifierArn(String deviceIdentifierArn) {
        this.deviceIdentifierArn = deviceIdentifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device identifier.
     */

    public String getDeviceIdentifierArn() {
        return this.deviceIdentifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device identifier.
     * </p>
     * 
     * @param deviceIdentifierArn
     *        The Amazon Resource Name (ARN) of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withDeviceIdentifierArn(String deviceIdentifierArn) {
        setDeviceIdentifierArn(deviceIdentifierArn);
        return this;
    }

    /**
     * <p>
     * The Integrated Circuit Card Identifier of the device identifier.
     * </p>
     * 
     * @param iccid
     *        The Integrated Circuit Card Identifier of the device identifier.
     */

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * <p>
     * The Integrated Circuit Card Identifier of the device identifier.
     * </p>
     * 
     * @return The Integrated Circuit Card Identifier of the device identifier.
     */

    public String getIccid() {
        return this.iccid;
    }

    /**
     * <p>
     * The Integrated Circuit Card Identifier of the device identifier.
     * </p>
     * 
     * @param iccid
     *        The Integrated Circuit Card Identifier of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withIccid(String iccid) {
        setIccid(iccid);
        return this;
    }

    /**
     * <p>
     * The International Mobile Subscriber Identity of the device identifier.
     * </p>
     * 
     * @param imsi
     *        The International Mobile Subscriber Identity of the device identifier.
     */

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    /**
     * <p>
     * The International Mobile Subscriber Identity of the device identifier.
     * </p>
     * 
     * @return The International Mobile Subscriber Identity of the device identifier.
     */

    public String getImsi() {
        return this.imsi;
    }

    /**
     * <p>
     * The International Mobile Subscriber Identity of the device identifier.
     * </p>
     * 
     * @param imsi
     *        The International Mobile Subscriber Identity of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withImsi(String imsi) {
        setImsi(imsi);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network on which the device identifier appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     */

    public void setOrderArn(String orderArn) {
        this.orderArn = orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     */

    public String getOrderArn() {
        return this.orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withOrderArn(String orderArn) {
        setOrderArn(orderArn);
        return this;
    }

    /**
     * <p>
     * The status of the device identifier.
     * </p>
     * 
     * @param status
     *        The status of the device identifier.
     * @see DeviceIdentifierStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the device identifier.
     * </p>
     * 
     * @return The status of the device identifier.
     * @see DeviceIdentifierStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the device identifier.
     * </p>
     * 
     * @param status
     *        The status of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceIdentifierStatus
     */

    public DeviceIdentifier withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the device identifier.
     * </p>
     * 
     * @param status
     *        The status of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceIdentifierStatus
     */

    public DeviceIdentifier withStatus(DeviceIdentifierStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     * </p>
     * 
     * @param trafficGroupArn
     *        The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     */

    public void setTrafficGroupArn(String trafficGroupArn) {
        this.trafficGroupArn = trafficGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     */

    public String getTrafficGroupArn() {
        return this.trafficGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     * </p>
     * 
     * @param trafficGroupArn
     *        The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withTrafficGroupArn(String trafficGroupArn) {
        setTrafficGroupArn(trafficGroupArn);
        return this;
    }

    /**
     * <p>
     * The vendor of the device identifier.
     * </p>
     * 
     * @param vendor
     *        The vendor of the device identifier.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The vendor of the device identifier.
     * </p>
     * 
     * @return The vendor of the device identifier.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The vendor of the device identifier.
     * </p>
     * 
     * @param vendor
     *        The vendor of the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceIdentifier withVendor(String vendor) {
        setVendor(vendor);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeviceIdentifierArn() != null)
            sb.append("DeviceIdentifierArn: ").append(getDeviceIdentifierArn()).append(",");
        if (getIccid() != null)
            sb.append("Iccid: ").append(getIccid()).append(",");
        if (getImsi() != null)
            sb.append("Imsi: ").append("***Sensitive Data Redacted***").append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getOrderArn() != null)
            sb.append("OrderArn: ").append(getOrderArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrafficGroupArn() != null)
            sb.append("TrafficGroupArn: ").append(getTrafficGroupArn()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceIdentifier == false)
            return false;
        DeviceIdentifier other = (DeviceIdentifier) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeviceIdentifierArn() == null ^ this.getDeviceIdentifierArn() == null)
            return false;
        if (other.getDeviceIdentifierArn() != null && other.getDeviceIdentifierArn().equals(this.getDeviceIdentifierArn()) == false)
            return false;
        if (other.getIccid() == null ^ this.getIccid() == null)
            return false;
        if (other.getIccid() != null && other.getIccid().equals(this.getIccid()) == false)
            return false;
        if (other.getImsi() == null ^ this.getImsi() == null)
            return false;
        if (other.getImsi() != null && other.getImsi().equals(this.getImsi()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getOrderArn() == null ^ this.getOrderArn() == null)
            return false;
        if (other.getOrderArn() != null && other.getOrderArn().equals(this.getOrderArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrafficGroupArn() == null ^ this.getTrafficGroupArn() == null)
            return false;
        if (other.getTrafficGroupArn() != null && other.getTrafficGroupArn().equals(this.getTrafficGroupArn()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeviceIdentifierArn() == null) ? 0 : getDeviceIdentifierArn().hashCode());
        hashCode = prime * hashCode + ((getIccid() == null) ? 0 : getIccid().hashCode());
        hashCode = prime * hashCode + ((getImsi() == null) ? 0 : getImsi().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getOrderArn() == null) ? 0 : getOrderArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrafficGroupArn() == null) ? 0 : getTrafficGroupArn().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        return hashCode;
    }

    @Override
    public DeviceIdentifier clone() {
        try {
            return (DeviceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.DeviceIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
