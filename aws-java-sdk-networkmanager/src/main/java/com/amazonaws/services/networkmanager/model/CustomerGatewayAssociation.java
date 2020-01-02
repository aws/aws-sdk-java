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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the association between a customer gateway, a device, and a link.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CustomerGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerGatewayAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer gateway.
     * </p>
     */
    private String customerGatewayArn;
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
     * The association state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer gateway.
     * </p>
     * 
     * @param customerGatewayArn
     *        The Amazon Resource Name (ARN) of the customer gateway.
     */

    public void setCustomerGatewayArn(String customerGatewayArn) {
        this.customerGatewayArn = customerGatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer gateway.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customer gateway.
     */

    public String getCustomerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer gateway.
     * </p>
     * 
     * @param customerGatewayArn
     *        The Amazon Resource Name (ARN) of the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGatewayAssociation withCustomerGatewayArn(String customerGatewayArn) {
        setCustomerGatewayArn(customerGatewayArn);
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

    public CustomerGatewayAssociation withGlobalNetworkId(String globalNetworkId) {
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

    public CustomerGatewayAssociation withDeviceId(String deviceId) {
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

    public CustomerGatewayAssociation withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The association state.
     * </p>
     * 
     * @param state
     *        The association state.
     * @see CustomerGatewayAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The association state.
     * </p>
     * 
     * @return The association state.
     * @see CustomerGatewayAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The association state.
     * </p>
     * 
     * @param state
     *        The association state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerGatewayAssociationState
     */

    public CustomerGatewayAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The association state.
     * </p>
     * 
     * @param state
     *        The association state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerGatewayAssociationState
     */

    public CustomerGatewayAssociation withState(CustomerGatewayAssociationState state) {
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
        if (getCustomerGatewayArn() != null)
            sb.append("CustomerGatewayArn: ").append(getCustomerGatewayArn()).append(",");
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

        if (obj instanceof CustomerGatewayAssociation == false)
            return false;
        CustomerGatewayAssociation other = (CustomerGatewayAssociation) obj;
        if (other.getCustomerGatewayArn() == null ^ this.getCustomerGatewayArn() == null)
            return false;
        if (other.getCustomerGatewayArn() != null && other.getCustomerGatewayArn().equals(this.getCustomerGatewayArn()) == false)
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

        hashCode = prime * hashCode + ((getCustomerGatewayArn() == null) ? 0 : getCustomerGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public CustomerGatewayAssociation clone() {
        try {
            return (CustomerGatewayAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CustomerGatewayAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
