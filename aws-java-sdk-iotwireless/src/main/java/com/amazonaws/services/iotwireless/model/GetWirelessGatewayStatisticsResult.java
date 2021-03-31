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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     */
    private String wirelessGatewayId;
    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     */
    private String lastUplinkReceivedAt;
    /**
     * <p>
     * The connection status of the wireless gateway.
     * </p>
     */
    private String connectionStatus;

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param wirelessGatewayId
     *        The ID of the wireless gateway.
     */

    public void setWirelessGatewayId(String wirelessGatewayId) {
        this.wirelessGatewayId = wirelessGatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @return The ID of the wireless gateway.
     */

    public String getWirelessGatewayId() {
        return this.wirelessGatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param wirelessGatewayId
     *        The ID of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayStatisticsResult withWirelessGatewayId(String wirelessGatewayId) {
        setWirelessGatewayId(wirelessGatewayId);
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

    public GetWirelessGatewayStatisticsResult withLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        setLastUplinkReceivedAt(lastUplinkReceivedAt);
        return this;
    }

    /**
     * <p>
     * The connection status of the wireless gateway.
     * </p>
     * 
     * @param connectionStatus
     *        The connection status of the wireless gateway.
     * @see ConnectionStatus
     */

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The connection status of the wireless gateway.
     * </p>
     * 
     * @return The connection status of the wireless gateway.
     * @see ConnectionStatus
     */

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The connection status of the wireless gateway.
     * </p>
     * 
     * @param connectionStatus
     *        The connection status of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public GetWirelessGatewayStatisticsResult withConnectionStatus(String connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * The connection status of the wireless gateway.
     * </p>
     * 
     * @param connectionStatus
     *        The connection status of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public GetWirelessGatewayStatisticsResult withConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
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
        if (getWirelessGatewayId() != null)
            sb.append("WirelessGatewayId: ").append(getWirelessGatewayId()).append(",");
        if (getLastUplinkReceivedAt() != null)
            sb.append("LastUplinkReceivedAt: ").append(getLastUplinkReceivedAt()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessGatewayStatisticsResult == false)
            return false;
        GetWirelessGatewayStatisticsResult other = (GetWirelessGatewayStatisticsResult) obj;
        if (other.getWirelessGatewayId() == null ^ this.getWirelessGatewayId() == null)
            return false;
        if (other.getWirelessGatewayId() != null && other.getWirelessGatewayId().equals(this.getWirelessGatewayId()) == false)
            return false;
        if (other.getLastUplinkReceivedAt() == null ^ this.getLastUplinkReceivedAt() == null)
            return false;
        if (other.getLastUplinkReceivedAt() != null && other.getLastUplinkReceivedAt().equals(this.getLastUplinkReceivedAt()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWirelessGatewayId() == null) ? 0 : getWirelessGatewayId().hashCode());
        hashCode = prime * hashCode + ((getLastUplinkReceivedAt() == null) ? 0 : getLastUplinkReceivedAt().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayStatisticsResult clone() {
        try {
            return (GetWirelessGatewayStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
