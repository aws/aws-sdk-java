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
 * Object of all event configurations and the status of the event topics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/EventNotificationItemConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventNotificationItemConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Device registration state event configuration for an event configuration item.
     * </p>
     */
    private DeviceRegistrationStateEventConfiguration deviceRegistrationState;
    /**
     * <p>
     * Proximity event configuration for an event configuration item.
     * </p>
     */
    private ProximityEventConfiguration proximity;
    /**
     * <p>
     * Join event configuration for an event configuration item.
     * </p>
     */
    private JoinEventConfiguration join;
    /**
     * <p>
     * Connection status event configuration for an event configuration item.
     * </p>
     */
    private ConnectionStatusEventConfiguration connectionStatus;
    /**
     * <p>
     * Message delivery status event configuration for an event configuration item.
     * </p>
     */
    private MessageDeliveryStatusEventConfiguration messageDeliveryStatus;

    /**
     * <p>
     * Device registration state event configuration for an event configuration item.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Device registration state event configuration for an event configuration item.
     */

    public void setDeviceRegistrationState(DeviceRegistrationStateEventConfiguration deviceRegistrationState) {
        this.deviceRegistrationState = deviceRegistrationState;
    }

    /**
     * <p>
     * Device registration state event configuration for an event configuration item.
     * </p>
     * 
     * @return Device registration state event configuration for an event configuration item.
     */

    public DeviceRegistrationStateEventConfiguration getDeviceRegistrationState() {
        return this.deviceRegistrationState;
    }

    /**
     * <p>
     * Device registration state event configuration for an event configuration item.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Device registration state event configuration for an event configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventNotificationItemConfigurations withDeviceRegistrationState(DeviceRegistrationStateEventConfiguration deviceRegistrationState) {
        setDeviceRegistrationState(deviceRegistrationState);
        return this;
    }

    /**
     * <p>
     * Proximity event configuration for an event configuration item.
     * </p>
     * 
     * @param proximity
     *        Proximity event configuration for an event configuration item.
     */

    public void setProximity(ProximityEventConfiguration proximity) {
        this.proximity = proximity;
    }

    /**
     * <p>
     * Proximity event configuration for an event configuration item.
     * </p>
     * 
     * @return Proximity event configuration for an event configuration item.
     */

    public ProximityEventConfiguration getProximity() {
        return this.proximity;
    }

    /**
     * <p>
     * Proximity event configuration for an event configuration item.
     * </p>
     * 
     * @param proximity
     *        Proximity event configuration for an event configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventNotificationItemConfigurations withProximity(ProximityEventConfiguration proximity) {
        setProximity(proximity);
        return this;
    }

    /**
     * <p>
     * Join event configuration for an event configuration item.
     * </p>
     * 
     * @param join
     *        Join event configuration for an event configuration item.
     */

    public void setJoin(JoinEventConfiguration join) {
        this.join = join;
    }

    /**
     * <p>
     * Join event configuration for an event configuration item.
     * </p>
     * 
     * @return Join event configuration for an event configuration item.
     */

    public JoinEventConfiguration getJoin() {
        return this.join;
    }

    /**
     * <p>
     * Join event configuration for an event configuration item.
     * </p>
     * 
     * @param join
     *        Join event configuration for an event configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventNotificationItemConfigurations withJoin(JoinEventConfiguration join) {
        setJoin(join);
        return this;
    }

    /**
     * <p>
     * Connection status event configuration for an event configuration item.
     * </p>
     * 
     * @param connectionStatus
     *        Connection status event configuration for an event configuration item.
     */

    public void setConnectionStatus(ConnectionStatusEventConfiguration connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Connection status event configuration for an event configuration item.
     * </p>
     * 
     * @return Connection status event configuration for an event configuration item.
     */

    public ConnectionStatusEventConfiguration getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * Connection status event configuration for an event configuration item.
     * </p>
     * 
     * @param connectionStatus
     *        Connection status event configuration for an event configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventNotificationItemConfigurations withConnectionStatus(ConnectionStatusEventConfiguration connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * Message delivery status event configuration for an event configuration item.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Message delivery status event configuration for an event configuration item.
     */

    public void setMessageDeliveryStatus(MessageDeliveryStatusEventConfiguration messageDeliveryStatus) {
        this.messageDeliveryStatus = messageDeliveryStatus;
    }

    /**
     * <p>
     * Message delivery status event configuration for an event configuration item.
     * </p>
     * 
     * @return Message delivery status event configuration for an event configuration item.
     */

    public MessageDeliveryStatusEventConfiguration getMessageDeliveryStatus() {
        return this.messageDeliveryStatus;
    }

    /**
     * <p>
     * Message delivery status event configuration for an event configuration item.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Message delivery status event configuration for an event configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventNotificationItemConfigurations withMessageDeliveryStatus(MessageDeliveryStatusEventConfiguration messageDeliveryStatus) {
        setMessageDeliveryStatus(messageDeliveryStatus);
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
        if (getDeviceRegistrationState() != null)
            sb.append("DeviceRegistrationState: ").append(getDeviceRegistrationState()).append(",");
        if (getProximity() != null)
            sb.append("Proximity: ").append(getProximity()).append(",");
        if (getJoin() != null)
            sb.append("Join: ").append(getJoin()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus()).append(",");
        if (getMessageDeliveryStatus() != null)
            sb.append("MessageDeliveryStatus: ").append(getMessageDeliveryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventNotificationItemConfigurations == false)
            return false;
        EventNotificationItemConfigurations other = (EventNotificationItemConfigurations) obj;
        if (other.getDeviceRegistrationState() == null ^ this.getDeviceRegistrationState() == null)
            return false;
        if (other.getDeviceRegistrationState() != null && other.getDeviceRegistrationState().equals(this.getDeviceRegistrationState()) == false)
            return false;
        if (other.getProximity() == null ^ this.getProximity() == null)
            return false;
        if (other.getProximity() != null && other.getProximity().equals(this.getProximity()) == false)
            return false;
        if (other.getJoin() == null ^ this.getJoin() == null)
            return false;
        if (other.getJoin() != null && other.getJoin().equals(this.getJoin()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        if (other.getMessageDeliveryStatus() == null ^ this.getMessageDeliveryStatus() == null)
            return false;
        if (other.getMessageDeliveryStatus() != null && other.getMessageDeliveryStatus().equals(this.getMessageDeliveryStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceRegistrationState() == null) ? 0 : getDeviceRegistrationState().hashCode());
        hashCode = prime * hashCode + ((getProximity() == null) ? 0 : getProximity().hashCode());
        hashCode = prime * hashCode + ((getJoin() == null) ? 0 : getJoin().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getMessageDeliveryStatus() == null) ? 0 : getMessageDeliveryStatus().hashCode());
        return hashCode;
    }

    @Override
    public EventNotificationItemConfigurations clone() {
        try {
            return (EventNotificationItemConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.EventNotificationItemConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
