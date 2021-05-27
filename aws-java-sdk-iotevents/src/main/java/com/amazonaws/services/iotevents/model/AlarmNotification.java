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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about one or more notification actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AlarmNotification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmNotification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on
     * this alarm model.
     * </p>
     */
    private java.util.List<NotificationAction> notificationActions;

    /**
     * <p>
     * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on
     * this alarm model.
     * </p>
     * 
     * @return Contains the notification settings of an alarm model. The settings apply to all alarms that were created
     *         based on this alarm model.
     */

    public java.util.List<NotificationAction> getNotificationActions() {
        return notificationActions;
    }

    /**
     * <p>
     * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on
     * this alarm model.
     * </p>
     * 
     * @param notificationActions
     *        Contains the notification settings of an alarm model. The settings apply to all alarms that were created
     *        based on this alarm model.
     */

    public void setNotificationActions(java.util.Collection<NotificationAction> notificationActions) {
        if (notificationActions == null) {
            this.notificationActions = null;
            return;
        }

        this.notificationActions = new java.util.ArrayList<NotificationAction>(notificationActions);
    }

    /**
     * <p>
     * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on
     * this alarm model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationActions(java.util.Collection)} or {@link #withNotificationActions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notificationActions
     *        Contains the notification settings of an alarm model. The settings apply to all alarms that were created
     *        based on this alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmNotification withNotificationActions(NotificationAction... notificationActions) {
        if (this.notificationActions == null) {
            setNotificationActions(new java.util.ArrayList<NotificationAction>(notificationActions.length));
        }
        for (NotificationAction ele : notificationActions) {
            this.notificationActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on
     * this alarm model.
     * </p>
     * 
     * @param notificationActions
     *        Contains the notification settings of an alarm model. The settings apply to all alarms that were created
     *        based on this alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmNotification withNotificationActions(java.util.Collection<NotificationAction> notificationActions) {
        setNotificationActions(notificationActions);
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
        if (getNotificationActions() != null)
            sb.append("NotificationActions: ").append(getNotificationActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmNotification == false)
            return false;
        AlarmNotification other = (AlarmNotification) obj;
        if (other.getNotificationActions() == null ^ this.getNotificationActions() == null)
            return false;
        if (other.getNotificationActions() != null && other.getNotificationActions().equals(this.getNotificationActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationActions() == null) ? 0 : getNotificationActions().hashCode());
        return hashCode;
    }

    @Override
    public AlarmNotification clone() {
        try {
            return (AlarmNotification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AlarmNotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
