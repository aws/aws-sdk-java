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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateEventConfigurationByResourceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventConfigurationByResourceTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Device registration state resource type event configuration object for enabling and disabling wireless gateway
     * topic.
     * </p>
     */
    private DeviceRegistrationStateResourceTypeEventConfiguration deviceRegistrationState;
    /**
     * <p>
     * Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     */
    private ProximityResourceTypeEventConfiguration proximity;
    /**
     * <p>
     * Join resource type event configuration object for enabling and disabling wireless device topic.
     * </p>
     */
    private JoinResourceTypeEventConfiguration join;
    /**
     * <p>
     * Connection status resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     */
    private ConnectionStatusResourceTypeEventConfiguration connectionStatus;
    /**
     * <p>
     * Message delivery status resource type event configuration object for enabling and disabling wireless device
     * topic.
     * </p>
     */
    private MessageDeliveryStatusResourceTypeEventConfiguration messageDeliveryStatus;

    /**
     * <p>
     * Device registration state resource type event configuration object for enabling and disabling wireless gateway
     * topic.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Device registration state resource type event configuration object for enabling and disabling wireless
     *        gateway topic.
     */

    public void setDeviceRegistrationState(DeviceRegistrationStateResourceTypeEventConfiguration deviceRegistrationState) {
        this.deviceRegistrationState = deviceRegistrationState;
    }

    /**
     * <p>
     * Device registration state resource type event configuration object for enabling and disabling wireless gateway
     * topic.
     * </p>
     * 
     * @return Device registration state resource type event configuration object for enabling and disabling wireless
     *         gateway topic.
     */

    public DeviceRegistrationStateResourceTypeEventConfiguration getDeviceRegistrationState() {
        return this.deviceRegistrationState;
    }

    /**
     * <p>
     * Device registration state resource type event configuration object for enabling and disabling wireless gateway
     * topic.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Device registration state resource type event configuration object for enabling and disabling wireless
     *        gateway topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventConfigurationByResourceTypesRequest withDeviceRegistrationState(
            DeviceRegistrationStateResourceTypeEventConfiguration deviceRegistrationState) {
        setDeviceRegistrationState(deviceRegistrationState);
        return this;
    }

    /**
     * <p>
     * Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     * 
     * @param proximity
     *        Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     */

    public void setProximity(ProximityResourceTypeEventConfiguration proximity) {
        this.proximity = proximity;
    }

    /**
     * <p>
     * Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     * 
     * @return Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     */

    public ProximityResourceTypeEventConfiguration getProximity() {
        return this.proximity;
    }

    /**
     * <p>
     * Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     * 
     * @param proximity
     *        Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventConfigurationByResourceTypesRequest withProximity(ProximityResourceTypeEventConfiguration proximity) {
        setProximity(proximity);
        return this;
    }

    /**
     * <p>
     * Join resource type event configuration object for enabling and disabling wireless device topic.
     * </p>
     * 
     * @param join
     *        Join resource type event configuration object for enabling and disabling wireless device topic.
     */

    public void setJoin(JoinResourceTypeEventConfiguration join) {
        this.join = join;
    }

    /**
     * <p>
     * Join resource type event configuration object for enabling and disabling wireless device topic.
     * </p>
     * 
     * @return Join resource type event configuration object for enabling and disabling wireless device topic.
     */

    public JoinResourceTypeEventConfiguration getJoin() {
        return this.join;
    }

    /**
     * <p>
     * Join resource type event configuration object for enabling and disabling wireless device topic.
     * </p>
     * 
     * @param join
     *        Join resource type event configuration object for enabling and disabling wireless device topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventConfigurationByResourceTypesRequest withJoin(JoinResourceTypeEventConfiguration join) {
        setJoin(join);
        return this;
    }

    /**
     * <p>
     * Connection status resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     * 
     * @param connectionStatus
     *        Connection status resource type event configuration object for enabling and disabling wireless gateway
     *        topic.
     */

    public void setConnectionStatus(ConnectionStatusResourceTypeEventConfiguration connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Connection status resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     * 
     * @return Connection status resource type event configuration object for enabling and disabling wireless gateway
     *         topic.
     */

    public ConnectionStatusResourceTypeEventConfiguration getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * Connection status resource type event configuration object for enabling and disabling wireless gateway topic.
     * </p>
     * 
     * @param connectionStatus
     *        Connection status resource type event configuration object for enabling and disabling wireless gateway
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventConfigurationByResourceTypesRequest withConnectionStatus(ConnectionStatusResourceTypeEventConfiguration connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * Message delivery status resource type event configuration object for enabling and disabling wireless device
     * topic.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Message delivery status resource type event configuration object for enabling and disabling wireless
     *        device topic.
     */

    public void setMessageDeliveryStatus(MessageDeliveryStatusResourceTypeEventConfiguration messageDeliveryStatus) {
        this.messageDeliveryStatus = messageDeliveryStatus;
    }

    /**
     * <p>
     * Message delivery status resource type event configuration object for enabling and disabling wireless device
     * topic.
     * </p>
     * 
     * @return Message delivery status resource type event configuration object for enabling and disabling wireless
     *         device topic.
     */

    public MessageDeliveryStatusResourceTypeEventConfiguration getMessageDeliveryStatus() {
        return this.messageDeliveryStatus;
    }

    /**
     * <p>
     * Message delivery status resource type event configuration object for enabling and disabling wireless device
     * topic.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Message delivery status resource type event configuration object for enabling and disabling wireless
     *        device topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventConfigurationByResourceTypesRequest withMessageDeliveryStatus(MessageDeliveryStatusResourceTypeEventConfiguration messageDeliveryStatus) {
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

        if (obj instanceof UpdateEventConfigurationByResourceTypesRequest == false)
            return false;
        UpdateEventConfigurationByResourceTypesRequest other = (UpdateEventConfigurationByResourceTypesRequest) obj;
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
    public UpdateEventConfigurationByResourceTypesRequest clone() {
        return (UpdateEventConfigurationByResourceTypesRequest) super.clone();
    }

}
