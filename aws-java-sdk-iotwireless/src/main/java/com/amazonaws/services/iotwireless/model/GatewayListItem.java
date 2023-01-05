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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gateway list item object that specifies the frequency and list of gateways for which the downlink message should be
 * sent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GatewayListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the wireless gateways that you want to add to the list of gateways when sending downlink messages.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The frequency to use for the gateways when sending a downlink message to the wireless device.
     * </p>
     */
    private Integer downlinkFrequency;

    /**
     * <p>
     * The ID of the wireless gateways that you want to add to the list of gateways when sending downlink messages.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the wireless gateways that you want to add to the list of gateways when sending downlink
     *        messages.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateways that you want to add to the list of gateways when sending downlink messages.
     * </p>
     * 
     * @return The ID of the wireless gateways that you want to add to the list of gateways when sending downlink
     *         messages.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateways that you want to add to the list of gateways when sending downlink messages.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the wireless gateways that you want to add to the list of gateways when sending downlink
     *        messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayListItem withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The frequency to use for the gateways when sending a downlink message to the wireless device.
     * </p>
     * 
     * @param downlinkFrequency
     *        The frequency to use for the gateways when sending a downlink message to the wireless device.
     */

    public void setDownlinkFrequency(Integer downlinkFrequency) {
        this.downlinkFrequency = downlinkFrequency;
    }

    /**
     * <p>
     * The frequency to use for the gateways when sending a downlink message to the wireless device.
     * </p>
     * 
     * @return The frequency to use for the gateways when sending a downlink message to the wireless device.
     */

    public Integer getDownlinkFrequency() {
        return this.downlinkFrequency;
    }

    /**
     * <p>
     * The frequency to use for the gateways when sending a downlink message to the wireless device.
     * </p>
     * 
     * @param downlinkFrequency
     *        The frequency to use for the gateways when sending a downlink message to the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayListItem withDownlinkFrequency(Integer downlinkFrequency) {
        setDownlinkFrequency(downlinkFrequency);
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
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getDownlinkFrequency() != null)
            sb.append("DownlinkFrequency: ").append(getDownlinkFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayListItem == false)
            return false;
        GatewayListItem other = (GatewayListItem) obj;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getDownlinkFrequency() == null ^ this.getDownlinkFrequency() == null)
            return false;
        if (other.getDownlinkFrequency() != null && other.getDownlinkFrequency().equals(this.getDownlinkFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDownlinkFrequency() == null) ? 0 : getDownlinkFrequency().hashCode());
        return hashCode;
    }

    @Override
    public GatewayListItem clone() {
        try {
            return (GatewayListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.GatewayListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
