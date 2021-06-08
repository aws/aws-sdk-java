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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a wireless gateway's operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WirelessGatewayStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessGatewayStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the wireless gateway reporting the data.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * LoRaWAN gateway info.
     * </p>
     */
    private LoRaWANGateway loRaWAN;
    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     */
    private String lastUplinkReceivedAt;

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessGatewayStatistics withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the wireless gateway reporting the data.
     * </p>
     * 
     * @param id
     *        The ID of the wireless gateway reporting the data.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the wireless gateway reporting the data.
     * </p>
     * 
     * @return The ID of the wireless gateway reporting the data.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the wireless gateway reporting the data.
     * </p>
     * 
     * @param id
     *        The ID of the wireless gateway reporting the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessGatewayStatistics withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessGatewayStatistics withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @return The description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessGatewayStatistics withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * LoRaWAN gateway info.
     * </p>
     * 
     * @param loRaWAN
     *        LoRaWAN gateway info.
     */

    public void setLoRaWAN(LoRaWANGateway loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * LoRaWAN gateway info.
     * </p>
     * 
     * @return LoRaWAN gateway info.
     */

    public LoRaWANGateway getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * LoRaWAN gateway info.
     * </p>
     * 
     * @param loRaWAN
     *        LoRaWAN gateway info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessGatewayStatistics withLoRaWAN(LoRaWANGateway loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @param lastUplinkReceivedAt
     *        The date and time when the most recent uplink was received.
     */

    public void setLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @return The date and time when the most recent uplink was received.
     */

    public String getLastUplinkReceivedAt() {
        return this.lastUplinkReceivedAt;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @param lastUplinkReceivedAt
     *        The date and time when the most recent uplink was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessGatewayStatistics withLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        setLastUplinkReceivedAt(lastUplinkReceivedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getLastUplinkReceivedAt() != null)
            sb.append("LastUplinkReceivedAt: ").append(getLastUplinkReceivedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessGatewayStatistics == false)
            return false;
        WirelessGatewayStatistics other = (WirelessGatewayStatistics) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getLastUplinkReceivedAt() == null ^ this.getLastUplinkReceivedAt() == null)
            return false;
        if (other.getLastUplinkReceivedAt() != null && other.getLastUplinkReceivedAt().equals(this.getLastUplinkReceivedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getLastUplinkReceivedAt() == null) ? 0 : getLastUplinkReceivedAt().hashCode());
        return hashCode;
    }

    @Override
    public WirelessGatewayStatistics clone() {
        try {
            return (WirelessGatewayStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WirelessGatewayStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
