/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Customizable notification settings that will be applied to notification events. IAM Roles Anywhere consumes these
 * settings while notifying across multiple channels - CloudWatch metrics, EventBridge, and Health Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/NotificationSetting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     * Dashboard to notify for an event.
     * </p>
     * <note>
     * <p>
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     * </p>
     * </note>
     */
    private String channel;
    /**
     * <p>
     * Indicates whether the notification setting is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The event to which this notification setting is applied.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The number of days before a notification event. This value is required for a notification setting that is
     * enabled.
     * </p>
     */
    private Integer threshold;

    /**
     * <p>
     * The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     * Dashboard to notify for an event.
     * </p>
     * <note>
     * <p>
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     * </p>
     * </note>
     * 
     * @param channel
     *        The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     *        Dashboard to notify for an event.</p> <note>
     *        <p>
     *        In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     *        </p>
     * @see NotificationChannel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     * Dashboard to notify for an event.
     * </p>
     * <note>
     * <p>
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     * </p>
     * </note>
     * 
     * @return The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and
     *         Health Dashboard to notify for an event.</p> <note>
     *         <p>
     *         In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     *         </p>
     * @see NotificationChannel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     * Dashboard to notify for an event.
     * </p>
     * <note>
     * <p>
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     * </p>
     * </note>
     * 
     * @param channel
     *        The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     *        Dashboard to notify for an event.</p> <note>
     *        <p>
     *        In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationChannel
     */

    public NotificationSetting withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     * Dashboard to notify for an event.
     * </p>
     * <note>
     * <p>
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     * </p>
     * </note>
     * 
     * @param channel
     *        The specified channel of notification. IAM Roles Anywhere uses CloudWatch metrics, EventBridge, and Health
     *        Dashboard to notify for an event.</p> <note>
     *        <p>
     *        In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL' channels.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationChannel
     */

    public NotificationSetting withChannel(NotificationChannel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the notification setting is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the notification setting is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the notification setting is enabled.
     * </p>
     * 
     * @return Indicates whether the notification setting is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the notification setting is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the notification setting is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationSetting withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the notification setting is enabled.
     * </p>
     * 
     * @return Indicates whether the notification setting is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The event to which this notification setting is applied.
     * </p>
     * 
     * @param event
     *        The event to which this notification setting is applied.
     * @see NotificationEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event to which this notification setting is applied.
     * </p>
     * 
     * @return The event to which this notification setting is applied.
     * @see NotificationEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event to which this notification setting is applied.
     * </p>
     * 
     * @param event
     *        The event to which this notification setting is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationSetting withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The event to which this notification setting is applied.
     * </p>
     * 
     * @param event
     *        The event to which this notification setting is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationSetting withEvent(NotificationEvent event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * The number of days before a notification event. This value is required for a notification setting that is
     * enabled.
     * </p>
     * 
     * @param threshold
     *        The number of days before a notification event. This value is required for a notification setting that is
     *        enabled.
     */

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The number of days before a notification event. This value is required for a notification setting that is
     * enabled.
     * </p>
     * 
     * @return The number of days before a notification event. This value is required for a notification setting that is
     *         enabled.
     */

    public Integer getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The number of days before a notification event. This value is required for a notification setting that is
     * enabled.
     * </p>
     * 
     * @param threshold
     *        The number of days before a notification event. This value is required for a notification setting that is
     *        enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationSetting withThreshold(Integer threshold) {
        setThreshold(threshold);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationSetting == false)
            return false;
        NotificationSetting other = (NotificationSetting) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        return hashCode;
    }

    @Override
    public NotificationSetting clone() {
        try {
            return (NotificationSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.NotificationSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
