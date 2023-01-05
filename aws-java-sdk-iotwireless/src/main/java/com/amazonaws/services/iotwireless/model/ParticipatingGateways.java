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
 * Specify the list of gateways to which you want to send downlink data traffic when the wireless device is running in
 * class B or class C mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ParticipatingGateways" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipatingGateways implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the chosen
     * gateways from the previous uplink message transmission.
     * </p>
     */
    private String downlinkMode;
    /**
     * <p>
     * The list of gateways that you want to use for sending the downlink data traffic.
     * </p>
     */
    private java.util.List<GatewayListItem> gatewayList;
    /**
     * <p>
     * The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the next
     * gateway.
     * </p>
     */
    private Integer transmissionInterval;

    /**
     * <p>
     * Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the chosen
     * gateways from the previous uplink message transmission.
     * </p>
     * 
     * @param downlinkMode
     *        Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the
     *        chosen gateways from the previous uplink message transmission.
     * @see DownlinkMode
     */

    public void setDownlinkMode(String downlinkMode) {
        this.downlinkMode = downlinkMode;
    }

    /**
     * <p>
     * Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the chosen
     * gateways from the previous uplink message transmission.
     * </p>
     * 
     * @return Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the
     *         chosen gateways from the previous uplink message transmission.
     * @see DownlinkMode
     */

    public String getDownlinkMode() {
        return this.downlinkMode;
    }

    /**
     * <p>
     * Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the chosen
     * gateways from the previous uplink message transmission.
     * </p>
     * 
     * @param downlinkMode
     *        Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the
     *        chosen gateways from the previous uplink message transmission.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DownlinkMode
     */

    public ParticipatingGateways withDownlinkMode(String downlinkMode) {
        setDownlinkMode(downlinkMode);
        return this;
    }

    /**
     * <p>
     * Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the chosen
     * gateways from the previous uplink message transmission.
     * </p>
     * 
     * @param downlinkMode
     *        Indicates whether to send the downlink message in sequential mode or concurrent mode, or to use only the
     *        chosen gateways from the previous uplink message transmission.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DownlinkMode
     */

    public ParticipatingGateways withDownlinkMode(DownlinkMode downlinkMode) {
        this.downlinkMode = downlinkMode.toString();
        return this;
    }

    /**
     * <p>
     * The list of gateways that you want to use for sending the downlink data traffic.
     * </p>
     * 
     * @return The list of gateways that you want to use for sending the downlink data traffic.
     */

    public java.util.List<GatewayListItem> getGatewayList() {
        return gatewayList;
    }

    /**
     * <p>
     * The list of gateways that you want to use for sending the downlink data traffic.
     * </p>
     * 
     * @param gatewayList
     *        The list of gateways that you want to use for sending the downlink data traffic.
     */

    public void setGatewayList(java.util.Collection<GatewayListItem> gatewayList) {
        if (gatewayList == null) {
            this.gatewayList = null;
            return;
        }

        this.gatewayList = new java.util.ArrayList<GatewayListItem>(gatewayList);
    }

    /**
     * <p>
     * The list of gateways that you want to use for sending the downlink data traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayList(java.util.Collection)} or {@link #withGatewayList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param gatewayList
     *        The list of gateways that you want to use for sending the downlink data traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipatingGateways withGatewayList(GatewayListItem... gatewayList) {
        if (this.gatewayList == null) {
            setGatewayList(new java.util.ArrayList<GatewayListItem>(gatewayList.length));
        }
        for (GatewayListItem ele : gatewayList) {
            this.gatewayList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of gateways that you want to use for sending the downlink data traffic.
     * </p>
     * 
     * @param gatewayList
     *        The list of gateways that you want to use for sending the downlink data traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipatingGateways withGatewayList(java.util.Collection<GatewayListItem> gatewayList) {
        setGatewayList(gatewayList);
        return this;
    }

    /**
     * <p>
     * The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the next
     * gateway.
     * </p>
     * 
     * @param transmissionInterval
     *        The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the
     *        next gateway.
     */

    public void setTransmissionInterval(Integer transmissionInterval) {
        this.transmissionInterval = transmissionInterval;
    }

    /**
     * <p>
     * The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the next
     * gateway.
     * </p>
     * 
     * @return The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the
     *         next gateway.
     */

    public Integer getTransmissionInterval() {
        return this.transmissionInterval;
    }

    /**
     * <p>
     * The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the next
     * gateway.
     * </p>
     * 
     * @param transmissionInterval
     *        The duration of time for which AWS IoT Core for LoRaWAN will wait before transmitting the payload to the
     *        next gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipatingGateways withTransmissionInterval(Integer transmissionInterval) {
        setTransmissionInterval(transmissionInterval);
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
        if (getDownlinkMode() != null)
            sb.append("DownlinkMode: ").append(getDownlinkMode()).append(",");
        if (getGatewayList() != null)
            sb.append("GatewayList: ").append(getGatewayList()).append(",");
        if (getTransmissionInterval() != null)
            sb.append("TransmissionInterval: ").append(getTransmissionInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipatingGateways == false)
            return false;
        ParticipatingGateways other = (ParticipatingGateways) obj;
        if (other.getDownlinkMode() == null ^ this.getDownlinkMode() == null)
            return false;
        if (other.getDownlinkMode() != null && other.getDownlinkMode().equals(this.getDownlinkMode()) == false)
            return false;
        if (other.getGatewayList() == null ^ this.getGatewayList() == null)
            return false;
        if (other.getGatewayList() != null && other.getGatewayList().equals(this.getGatewayList()) == false)
            return false;
        if (other.getTransmissionInterval() == null ^ this.getTransmissionInterval() == null)
            return false;
        if (other.getTransmissionInterval() != null && other.getTransmissionInterval().equals(this.getTransmissionInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDownlinkMode() == null) ? 0 : getDownlinkMode().hashCode());
        hashCode = prime * hashCode + ((getGatewayList() == null) ? 0 : getGatewayList().hashCode());
        hashCode = prime * hashCode + ((getTransmissionInterval() == null) ? 0 : getTransmissionInterval().hashCode());
        return hashCode;
    }

    @Override
    public ParticipatingGateways clone() {
        try {
            return (ParticipatingGateways) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.ParticipatingGatewaysMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
