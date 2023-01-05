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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceEventConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Event configuration for the device registration state event.
     * </p>
     */
    private DeviceRegistrationStateEventConfiguration deviceRegistrationState;
    /**
     * <p>
     * Event configuration for the proximity event.
     * </p>
     */
    private ProximityEventConfiguration proximity;
    /**
     * <p>
     * Event configuration for the join event.
     * </p>
     */
    private JoinEventConfiguration join;
    /**
     * <p>
     * Event configuration for the connection status event.
     * </p>
     */
    private ConnectionStatusEventConfiguration connectionStatus;
    /**
     * <p>
     * Event configuration for the message delivery status event.
     * </p>
     */
    private MessageDeliveryStatusEventConfiguration messageDeliveryStatus;

    /**
     * <p>
     * Event configuration for the device registration state event.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Event configuration for the device registration state event.
     */

    public void setDeviceRegistrationState(DeviceRegistrationStateEventConfiguration deviceRegistrationState) {
        this.deviceRegistrationState = deviceRegistrationState;
    }

    /**
     * <p>
     * Event configuration for the device registration state event.
     * </p>
     * 
     * @return Event configuration for the device registration state event.
     */

    public DeviceRegistrationStateEventConfiguration getDeviceRegistrationState() {
        return this.deviceRegistrationState;
    }

    /**
     * <p>
     * Event configuration for the device registration state event.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Event configuration for the device registration state event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEventConfigurationResult withDeviceRegistrationState(DeviceRegistrationStateEventConfiguration deviceRegistrationState) {
        setDeviceRegistrationState(deviceRegistrationState);
        return this;
    }

    /**
     * <p>
     * Event configuration for the proximity event.
     * </p>
     * 
     * @param proximity
     *        Event configuration for the proximity event.
     */

    public void setProximity(ProximityEventConfiguration proximity) {
        this.proximity = proximity;
    }

    /**
     * <p>
     * Event configuration for the proximity event.
     * </p>
     * 
     * @return Event configuration for the proximity event.
     */

    public ProximityEventConfiguration getProximity() {
        return this.proximity;
    }

    /**
     * <p>
     * Event configuration for the proximity event.
     * </p>
     * 
     * @param proximity
     *        Event configuration for the proximity event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEventConfigurationResult withProximity(ProximityEventConfiguration proximity) {
        setProximity(proximity);
        return this;
    }

    /**
     * <p>
     * Event configuration for the join event.
     * </p>
     * 
     * @param join
     *        Event configuration for the join event.
     */

    public void setJoin(JoinEventConfiguration join) {
        this.join = join;
    }

    /**
     * <p>
     * Event configuration for the join event.
     * </p>
     * 
     * @return Event configuration for the join event.
     */

    public JoinEventConfiguration getJoin() {
        return this.join;
    }

    /**
     * <p>
     * Event configuration for the join event.
     * </p>
     * 
     * @param join
     *        Event configuration for the join event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEventConfigurationResult withJoin(JoinEventConfiguration join) {
        setJoin(join);
        return this;
    }

    /**
     * <p>
     * Event configuration for the connection status event.
     * </p>
     * 
     * @param connectionStatus
     *        Event configuration for the connection status event.
     */

    public void setConnectionStatus(ConnectionStatusEventConfiguration connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Event configuration for the connection status event.
     * </p>
     * 
     * @return Event configuration for the connection status event.
     */

    public ConnectionStatusEventConfiguration getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * Event configuration for the connection status event.
     * </p>
     * 
     * @param connectionStatus
     *        Event configuration for the connection status event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEventConfigurationResult withConnectionStatus(ConnectionStatusEventConfiguration connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * Event configuration for the message delivery status event.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Event configuration for the message delivery status event.
     */

    public void setMessageDeliveryStatus(MessageDeliveryStatusEventConfiguration messageDeliveryStatus) {
        this.messageDeliveryStatus = messageDeliveryStatus;
    }

    /**
     * <p>
     * Event configuration for the message delivery status event.
     * </p>
     * 
     * @return Event configuration for the message delivery status event.
     */

    public MessageDeliveryStatusEventConfiguration getMessageDeliveryStatus() {
        return this.messageDeliveryStatus;
    }

    /**
     * <p>
     * Event configuration for the message delivery status event.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Event configuration for the message delivery status event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceEventConfigurationResult withMessageDeliveryStatus(MessageDeliveryStatusEventConfiguration messageDeliveryStatus) {
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

        if (obj instanceof GetResourceEventConfigurationResult == false)
            return false;
        GetResourceEventConfigurationResult other = (GetResourceEventConfigurationResult) obj;
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
    public GetResourceEventConfigurationResult clone() {
        try {
            return (GetResourceEventConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
