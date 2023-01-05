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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetEventConfigurationByResourceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventConfigurationByResourceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Resource type event configuration for the device registration state event.
     * </p>
     */
    private DeviceRegistrationStateResourceTypeEventConfiguration deviceRegistrationState;
    /**
     * <p>
     * Resource type event configuration for the proximity event.
     * </p>
     */
    private ProximityResourceTypeEventConfiguration proximity;
    /**
     * <p>
     * Resource type event configuration for the join event.
     * </p>
     */
    private JoinResourceTypeEventConfiguration join;
    /**
     * <p>
     * Resource type event configuration for the connection status event.
     * </p>
     */
    private ConnectionStatusResourceTypeEventConfiguration connectionStatus;
    /**
     * <p>
     * Resource type event configuration object for the message delivery status event.
     * </p>
     */
    private MessageDeliveryStatusResourceTypeEventConfiguration messageDeliveryStatus;

    /**
     * <p>
     * Resource type event configuration for the device registration state event.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Resource type event configuration for the device registration state event.
     */

    public void setDeviceRegistrationState(DeviceRegistrationStateResourceTypeEventConfiguration deviceRegistrationState) {
        this.deviceRegistrationState = deviceRegistrationState;
    }

    /**
     * <p>
     * Resource type event configuration for the device registration state event.
     * </p>
     * 
     * @return Resource type event configuration for the device registration state event.
     */

    public DeviceRegistrationStateResourceTypeEventConfiguration getDeviceRegistrationState() {
        return this.deviceRegistrationState;
    }

    /**
     * <p>
     * Resource type event configuration for the device registration state event.
     * </p>
     * 
     * @param deviceRegistrationState
     *        Resource type event configuration for the device registration state event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventConfigurationByResourceTypesResult withDeviceRegistrationState(DeviceRegistrationStateResourceTypeEventConfiguration deviceRegistrationState) {
        setDeviceRegistrationState(deviceRegistrationState);
        return this;
    }

    /**
     * <p>
     * Resource type event configuration for the proximity event.
     * </p>
     * 
     * @param proximity
     *        Resource type event configuration for the proximity event.
     */

    public void setProximity(ProximityResourceTypeEventConfiguration proximity) {
        this.proximity = proximity;
    }

    /**
     * <p>
     * Resource type event configuration for the proximity event.
     * </p>
     * 
     * @return Resource type event configuration for the proximity event.
     */

    public ProximityResourceTypeEventConfiguration getProximity() {
        return this.proximity;
    }

    /**
     * <p>
     * Resource type event configuration for the proximity event.
     * </p>
     * 
     * @param proximity
     *        Resource type event configuration for the proximity event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventConfigurationByResourceTypesResult withProximity(ProximityResourceTypeEventConfiguration proximity) {
        setProximity(proximity);
        return this;
    }

    /**
     * <p>
     * Resource type event configuration for the join event.
     * </p>
     * 
     * @param join
     *        Resource type event configuration for the join event.
     */

    public void setJoin(JoinResourceTypeEventConfiguration join) {
        this.join = join;
    }

    /**
     * <p>
     * Resource type event configuration for the join event.
     * </p>
     * 
     * @return Resource type event configuration for the join event.
     */

    public JoinResourceTypeEventConfiguration getJoin() {
        return this.join;
    }

    /**
     * <p>
     * Resource type event configuration for the join event.
     * </p>
     * 
     * @param join
     *        Resource type event configuration for the join event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventConfigurationByResourceTypesResult withJoin(JoinResourceTypeEventConfiguration join) {
        setJoin(join);
        return this;
    }

    /**
     * <p>
     * Resource type event configuration for the connection status event.
     * </p>
     * 
     * @param connectionStatus
     *        Resource type event configuration for the connection status event.
     */

    public void setConnectionStatus(ConnectionStatusResourceTypeEventConfiguration connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Resource type event configuration for the connection status event.
     * </p>
     * 
     * @return Resource type event configuration for the connection status event.
     */

    public ConnectionStatusResourceTypeEventConfiguration getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * Resource type event configuration for the connection status event.
     * </p>
     * 
     * @param connectionStatus
     *        Resource type event configuration for the connection status event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventConfigurationByResourceTypesResult withConnectionStatus(ConnectionStatusResourceTypeEventConfiguration connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * Resource type event configuration object for the message delivery status event.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Resource type event configuration object for the message delivery status event.
     */

    public void setMessageDeliveryStatus(MessageDeliveryStatusResourceTypeEventConfiguration messageDeliveryStatus) {
        this.messageDeliveryStatus = messageDeliveryStatus;
    }

    /**
     * <p>
     * Resource type event configuration object for the message delivery status event.
     * </p>
     * 
     * @return Resource type event configuration object for the message delivery status event.
     */

    public MessageDeliveryStatusResourceTypeEventConfiguration getMessageDeliveryStatus() {
        return this.messageDeliveryStatus;
    }

    /**
     * <p>
     * Resource type event configuration object for the message delivery status event.
     * </p>
     * 
     * @param messageDeliveryStatus
     *        Resource type event configuration object for the message delivery status event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventConfigurationByResourceTypesResult withMessageDeliveryStatus(MessageDeliveryStatusResourceTypeEventConfiguration messageDeliveryStatus) {
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

        if (obj instanceof GetEventConfigurationByResourceTypesResult == false)
            return false;
        GetEventConfigurationByResourceTypesResult other = (GetEventConfigurationByResourceTypesResult) obj;
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
    public GetEventConfigurationByResourceTypesResult clone() {
        try {
            return (GetEventConfigurationByResourceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
