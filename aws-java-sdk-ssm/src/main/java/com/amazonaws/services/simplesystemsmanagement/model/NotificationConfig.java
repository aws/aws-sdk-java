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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configurations for sending notifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/NotificationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications
     * about command status changes to this topic.
     * </p>
     */
    private String notificationArn;
    /**
     * <p>
     * The different events for which you can receive notifications. These events include the following: All (events),
     * InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring Amazon
     * SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notificationEvents;
    /**
     * <p>
     * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple
     * instances, receive notification on a per-instance basis when the status of a command changes.
     * </p>
     */
    private String notificationType;

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications
     * about command status changes to this topic.
     * </p>
     * 
     * @param notificationArn
     *        An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes
     *        notifications about command status changes to this topic.
     */

    public void setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications
     * about command status changes to this topic.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes
     *         notifications about command status changes to this topic.
     */

    public String getNotificationArn() {
        return this.notificationArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications
     * about command status changes to this topic.
     * </p>
     * 
     * @param notificationArn
     *        An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes
     *        notifications about command status changes to this topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfig withNotificationArn(String notificationArn) {
        setNotificationArn(notificationArn);
        return this;
    }

    /**
     * <p>
     * The different events for which you can receive notifications. These events include the following: All (events),
     * InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring Amazon
     * SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The different events for which you can receive notifications. These events include the following: All
     *         (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *         Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @see NotificationEvent
     */

    public java.util.List<String> getNotificationEvents() {
        if (notificationEvents == null) {
            notificationEvents = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notificationEvents;
    }

    /**
     * <p>
     * The different events for which you can receive notifications. These events include the following: All (events),
     * InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring Amazon
     * SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param notificationEvents
     *        The different events for which you can receive notifications. These events include the following: All
     *        (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *        Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @see NotificationEvent
     */

    public void setNotificationEvents(java.util.Collection<String> notificationEvents) {
        if (notificationEvents == null) {
            this.notificationEvents = null;
            return;
        }

        this.notificationEvents = new com.amazonaws.internal.SdkInternalList<String>(notificationEvents);
    }

    /**
     * <p>
     * The different events for which you can receive notifications. These events include the following: All (events),
     * InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring Amazon
     * SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationEvents(java.util.Collection)} or {@link #withNotificationEvents(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param notificationEvents
     *        The different events for which you can receive notifications. These events include the following: All
     *        (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *        Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationConfig withNotificationEvents(String... notificationEvents) {
        if (this.notificationEvents == null) {
            setNotificationEvents(new com.amazonaws.internal.SdkInternalList<String>(notificationEvents.length));
        }
        for (String ele : notificationEvents) {
            this.notificationEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The different events for which you can receive notifications. These events include the following: All (events),
     * InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring Amazon
     * SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param notificationEvents
     *        The different events for which you can receive notifications. These events include the following: All
     *        (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *        Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationConfig withNotificationEvents(java.util.Collection<String> notificationEvents) {
        setNotificationEvents(notificationEvents);
        return this;
    }

    /**
     * <p>
     * The different events for which you can receive notifications. These events include the following: All (events),
     * InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring Amazon
     * SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param notificationEvents
     *        The different events for which you can receive notifications. These events include the following: All
     *        (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *        Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationConfig withNotificationEvents(NotificationEvent... notificationEvents) {
        com.amazonaws.internal.SdkInternalList<String> notificationEventsCopy = new com.amazonaws.internal.SdkInternalList<String>(notificationEvents.length);
        for (NotificationEvent value : notificationEvents) {
            notificationEventsCopy.add(value.toString());
        }
        if (getNotificationEvents() == null) {
            setNotificationEvents(notificationEventsCopy);
        } else {
            getNotificationEvents().addAll(notificationEventsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple
     * instances, receive notification on a per-instance basis when the status of a command changes.
     * </p>
     * 
     * @param notificationType
     *        Command: Receive notification when the status of a command changes. Invocation: For commands sent to
     *        multiple instances, receive notification on a per-instance basis when the status of a command changes.
     * @see NotificationType
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple
     * instances, receive notification on a per-instance basis when the status of a command changes.
     * </p>
     * 
     * @return Command: Receive notification when the status of a command changes. Invocation: For commands sent to
     *         multiple instances, receive notification on a per-instance basis when the status of a command changes.
     * @see NotificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * <p>
     * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple
     * instances, receive notification on a per-instance basis when the status of a command changes.
     * </p>
     * 
     * @param notificationType
     *        Command: Receive notification when the status of a command changes. Invocation: For commands sent to
     *        multiple instances, receive notification on a per-instance basis when the status of a command changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public NotificationConfig withNotificationType(String notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * <p>
     * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple
     * instances, receive notification on a per-instance basis when the status of a command changes.
     * </p>
     * 
     * @param notificationType
     *        Command: Receive notification when the status of a command changes. Invocation: For commands sent to
     *        multiple instances, receive notification on a per-instance basis when the status of a command changes.
     * @see NotificationType
     */

    public void setNotificationType(NotificationType notificationType) {
        withNotificationType(notificationType);
    }

    /**
     * <p>
     * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple
     * instances, receive notification on a per-instance basis when the status of a command changes.
     * </p>
     * 
     * @param notificationType
     *        Command: Receive notification when the status of a command changes. Invocation: For commands sent to
     *        multiple instances, receive notification on a per-instance basis when the status of a command changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public NotificationConfig withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
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
        if (getNotificationArn() != null)
            sb.append("NotificationArn: ").append(getNotificationArn()).append(",");
        if (getNotificationEvents() != null)
            sb.append("NotificationEvents: ").append(getNotificationEvents()).append(",");
        if (getNotificationType() != null)
            sb.append("NotificationType: ").append(getNotificationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfig == false)
            return false;
        NotificationConfig other = (NotificationConfig) obj;
        if (other.getNotificationArn() == null ^ this.getNotificationArn() == null)
            return false;
        if (other.getNotificationArn() != null && other.getNotificationArn().equals(this.getNotificationArn()) == false)
            return false;
        if (other.getNotificationEvents() == null ^ this.getNotificationEvents() == null)
            return false;
        if (other.getNotificationEvents() != null && other.getNotificationEvents().equals(this.getNotificationEvents()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationArn() == null) ? 0 : getNotificationArn().hashCode());
        hashCode = prime * hashCode + ((getNotificationEvents() == null) ? 0 : getNotificationEvents().hashCode());
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        return hashCode;
    }

    @Override
    public NotificationConfig clone() {
        try {
            return (NotificationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.NotificationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
