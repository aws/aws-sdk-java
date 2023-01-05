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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourceEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceEventConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     */
    private String identifierType;
    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * </p>
     */
    private String partnerType;
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
     * Resource identifier to opt in for event messaging.
     * </p>
     * 
     * @param identifier
     *        Resource identifier to opt in for event messaging.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     * 
     * @return Resource identifier to opt in for event messaging.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Resource identifier to opt in for event messaging.
     * </p>
     * 
     * @param identifier
     *        Resource identifier to opt in for event messaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceEventConfigurationRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @see IdentifierType
     */

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @return Identifier type of the particular resource identifier for event configuration.
     * @see IdentifierType
     */

    public String getIdentifierType() {
        return this.identifierType;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifierType
     */

    public UpdateResourceEventConfigurationRequest withIdentifierType(String identifierType) {
        setIdentifierType(identifierType);
        return this;
    }

    /**
     * <p>
     * Identifier type of the particular resource identifier for event configuration.
     * </p>
     * 
     * @param identifierType
     *        Identifier type of the particular resource identifier for event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifierType
     */

    public UpdateResourceEventConfigurationRequest withIdentifierType(IdentifierType identifierType) {
        this.identifierType = identifierType.toString();
        return this;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * @see EventNotificationPartnerType
     */

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * </p>
     * 
     * @return Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * @see EventNotificationPartnerType
     */

    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationPartnerType
     */

    public UpdateResourceEventConfigurationRequest withPartnerType(String partnerType) {
        setPartnerType(partnerType);
        return this;
    }

    /**
     * <p>
     * Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * </p>
     * 
     * @param partnerType
     *        Partner type of the resource if the identifier type is <code>PartnerAccountId</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventNotificationPartnerType
     */

    public UpdateResourceEventConfigurationRequest withPartnerType(EventNotificationPartnerType partnerType) {
        this.partnerType = partnerType.toString();
        return this;
    }

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

    public UpdateResourceEventConfigurationRequest withDeviceRegistrationState(DeviceRegistrationStateEventConfiguration deviceRegistrationState) {
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

    public UpdateResourceEventConfigurationRequest withProximity(ProximityEventConfiguration proximity) {
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

    public UpdateResourceEventConfigurationRequest withJoin(JoinEventConfiguration join) {
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

    public UpdateResourceEventConfigurationRequest withConnectionStatus(ConnectionStatusEventConfiguration connectionStatus) {
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

    public UpdateResourceEventConfigurationRequest withMessageDeliveryStatus(MessageDeliveryStatusEventConfiguration messageDeliveryStatus) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getIdentifierType() != null)
            sb.append("IdentifierType: ").append(getIdentifierType()).append(",");
        if (getPartnerType() != null)
            sb.append("PartnerType: ").append(getPartnerType()).append(",");
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

        if (obj instanceof UpdateResourceEventConfigurationRequest == false)
            return false;
        UpdateResourceEventConfigurationRequest other = (UpdateResourceEventConfigurationRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getIdentifierType() == null ^ this.getIdentifierType() == null)
            return false;
        if (other.getIdentifierType() != null && other.getIdentifierType().equals(this.getIdentifierType()) == false)
            return false;
        if (other.getPartnerType() == null ^ this.getPartnerType() == null)
            return false;
        if (other.getPartnerType() != null && other.getPartnerType().equals(this.getPartnerType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifierType() == null) ? 0 : getIdentifierType().hashCode());
        hashCode = prime * hashCode + ((getPartnerType() == null) ? 0 : getPartnerType().hashCode());
        hashCode = prime * hashCode + ((getDeviceRegistrationState() == null) ? 0 : getDeviceRegistrationState().hashCode());
        hashCode = prime * hashCode + ((getProximity() == null) ? 0 : getProximity().hashCode());
        hashCode = prime * hashCode + ((getJoin() == null) ? 0 : getJoin().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getMessageDeliveryStatus() == null) ? 0 : getMessageDeliveryStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceEventConfigurationRequest clone() {
        return (UpdateResourceEventConfigurationRequest) super.clone();
    }

}
