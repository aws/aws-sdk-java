/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a connection notification for a VPC endpoint or VPC endpoint service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConnectionNotification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionNotification implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the notification.
     * </p>
     */
    private String connectionNotificationId;
    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The type of notification.
     * </p>
     */
    private String connectionNotificationType;
    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     */
    private String connectionNotificationArn;
    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     * and <code>Reject</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> connectionEvents;
    /**
     * <p>
     * The state of the notification.
     * </p>
     */
    private String connectionNotificationState;

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * 
     * @param connectionNotificationId
     *        The ID of the notification.
     */

    public void setConnectionNotificationId(String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * 
     * @return The ID of the notification.
     */

    public String getConnectionNotificationId() {
        return this.connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * 
     * @param connectionNotificationId
     *        The ID of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionNotification withConnectionNotificationId(String connectionNotificationId) {
        setConnectionNotificationId(connectionNotificationId);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @return The ID of the endpoint service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionNotification withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @return The ID of the VPC endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionNotification withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * 
     * @param connectionNotificationType
     *        The type of notification.
     * @see ConnectionNotificationType
     */

    public void setConnectionNotificationType(String connectionNotificationType) {
        this.connectionNotificationType = connectionNotificationType;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * 
     * @return The type of notification.
     * @see ConnectionNotificationType
     */

    public String getConnectionNotificationType() {
        return this.connectionNotificationType;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * 
     * @param connectionNotificationType
     *        The type of notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionNotificationType
     */

    public ConnectionNotification withConnectionNotificationType(String connectionNotificationType) {
        setConnectionNotificationType(connectionNotificationType);
        return this;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * 
     * @param connectionNotificationType
     *        The type of notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionNotificationType
     */

    public ConnectionNotification withConnectionNotificationType(ConnectionNotificationType connectionNotificationType) {
        this.connectionNotificationType = connectionNotificationType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     * 
     * @param connectionNotificationArn
     *        The ARN of the SNS topic for the notification.
     */

    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     * 
     * @return The ARN of the SNS topic for the notification.
     */

    public String getConnectionNotificationArn() {
        return this.connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     * 
     * @param connectionNotificationArn
     *        The ARN of the SNS topic for the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionNotification withConnectionNotificationArn(String connectionNotificationArn) {
        setConnectionNotificationArn(connectionNotificationArn);
        return this;
    }

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     * and <code>Reject</code>.
     * </p>
     * 
     * @return The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>,
     *         <code>Delete</code>, and <code>Reject</code>.
     */

    public java.util.List<String> getConnectionEvents() {
        if (connectionEvents == null) {
            connectionEvents = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return connectionEvents;
    }

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     * and <code>Reject</code>.
     * </p>
     * 
     * @param connectionEvents
     *        The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>,
     *        <code>Delete</code>, and <code>Reject</code>.
     */

    public void setConnectionEvents(java.util.Collection<String> connectionEvents) {
        if (connectionEvents == null) {
            this.connectionEvents = null;
            return;
        }

        this.connectionEvents = new com.amazonaws.internal.SdkInternalList<String>(connectionEvents);
    }

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     * and <code>Reject</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionEvents(java.util.Collection)} or {@link #withConnectionEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param connectionEvents
     *        The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>,
     *        <code>Delete</code>, and <code>Reject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionNotification withConnectionEvents(String... connectionEvents) {
        if (this.connectionEvents == null) {
            setConnectionEvents(new com.amazonaws.internal.SdkInternalList<String>(connectionEvents.length));
        }
        for (String ele : connectionEvents) {
            this.connectionEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     * and <code>Reject</code>.
     * </p>
     * 
     * @param connectionEvents
     *        The events for the notification. Valid values are <code>Accept</code>, <code>Connect</code>,
     *        <code>Delete</code>, and <code>Reject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionNotification withConnectionEvents(java.util.Collection<String> connectionEvents) {
        setConnectionEvents(connectionEvents);
        return this;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * 
     * @param connectionNotificationState
     *        The state of the notification.
     * @see ConnectionNotificationState
     */

    public void setConnectionNotificationState(String connectionNotificationState) {
        this.connectionNotificationState = connectionNotificationState;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * 
     * @return The state of the notification.
     * @see ConnectionNotificationState
     */

    public String getConnectionNotificationState() {
        return this.connectionNotificationState;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * 
     * @param connectionNotificationState
     *        The state of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionNotificationState
     */

    public ConnectionNotification withConnectionNotificationState(String connectionNotificationState) {
        setConnectionNotificationState(connectionNotificationState);
        return this;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * 
     * @param connectionNotificationState
     *        The state of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionNotificationState
     */

    public ConnectionNotification withConnectionNotificationState(ConnectionNotificationState connectionNotificationState) {
        this.connectionNotificationState = connectionNotificationState.toString();
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
        if (getConnectionNotificationId() != null)
            sb.append("ConnectionNotificationId: ").append(getConnectionNotificationId()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getConnectionNotificationType() != null)
            sb.append("ConnectionNotificationType: ").append(getConnectionNotificationType()).append(",");
        if (getConnectionNotificationArn() != null)
            sb.append("ConnectionNotificationArn: ").append(getConnectionNotificationArn()).append(",");
        if (getConnectionEvents() != null)
            sb.append("ConnectionEvents: ").append(getConnectionEvents()).append(",");
        if (getConnectionNotificationState() != null)
            sb.append("ConnectionNotificationState: ").append(getConnectionNotificationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionNotification == false)
            return false;
        ConnectionNotification other = (ConnectionNotification) obj;
        if (other.getConnectionNotificationId() == null ^ this.getConnectionNotificationId() == null)
            return false;
        if (other.getConnectionNotificationId() != null && other.getConnectionNotificationId().equals(this.getConnectionNotificationId()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getConnectionNotificationType() == null ^ this.getConnectionNotificationType() == null)
            return false;
        if (other.getConnectionNotificationType() != null && other.getConnectionNotificationType().equals(this.getConnectionNotificationType()) == false)
            return false;
        if (other.getConnectionNotificationArn() == null ^ this.getConnectionNotificationArn() == null)
            return false;
        if (other.getConnectionNotificationArn() != null && other.getConnectionNotificationArn().equals(this.getConnectionNotificationArn()) == false)
            return false;
        if (other.getConnectionEvents() == null ^ this.getConnectionEvents() == null)
            return false;
        if (other.getConnectionEvents() != null && other.getConnectionEvents().equals(this.getConnectionEvents()) == false)
            return false;
        if (other.getConnectionNotificationState() == null ^ this.getConnectionNotificationState() == null)
            return false;
        if (other.getConnectionNotificationState() != null && other.getConnectionNotificationState().equals(this.getConnectionNotificationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionNotificationId() == null) ? 0 : getConnectionNotificationId().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getConnectionNotificationType() == null) ? 0 : getConnectionNotificationType().hashCode());
        hashCode = prime * hashCode + ((getConnectionNotificationArn() == null) ? 0 : getConnectionNotificationArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionEvents() == null) ? 0 : getConnectionEvents().hashCode());
        hashCode = prime * hashCode + ((getConnectionNotificationState() == null) ? 0 : getConnectionNotificationState().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionNotification clone() {
        try {
            return (ConnectionNotification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
