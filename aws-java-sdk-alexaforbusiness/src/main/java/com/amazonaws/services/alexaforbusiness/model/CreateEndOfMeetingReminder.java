/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Creates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting
 * reminder enables Alexa to remind users when a meeting is ending.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateEndOfMeetingReminder"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndOfMeetingReminder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A range of 3 to 15 minutes that determines when the reminder begins.
     * </p>
     */
    private java.util.List<Integer> reminderAtMinutes;
    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     */
    private String reminderType;
    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * A range of 3 to 15 minutes that determines when the reminder begins.
     * </p>
     * 
     * @return A range of 3 to 15 minutes that determines when the reminder begins.
     */

    public java.util.List<Integer> getReminderAtMinutes() {
        return reminderAtMinutes;
    }

    /**
     * <p>
     * A range of 3 to 15 minutes that determines when the reminder begins.
     * </p>
     * 
     * @param reminderAtMinutes
     *        A range of 3 to 15 minutes that determines when the reminder begins.
     */

    public void setReminderAtMinutes(java.util.Collection<Integer> reminderAtMinutes) {
        if (reminderAtMinutes == null) {
            this.reminderAtMinutes = null;
            return;
        }

        this.reminderAtMinutes = new java.util.ArrayList<Integer>(reminderAtMinutes);
    }

    /**
     * <p>
     * A range of 3 to 15 minutes that determines when the reminder begins.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReminderAtMinutes(java.util.Collection)} or {@link #withReminderAtMinutes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reminderAtMinutes
     *        A range of 3 to 15 minutes that determines when the reminder begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndOfMeetingReminder withReminderAtMinutes(Integer... reminderAtMinutes) {
        if (this.reminderAtMinutes == null) {
            setReminderAtMinutes(new java.util.ArrayList<Integer>(reminderAtMinutes.length));
        }
        for (Integer ele : reminderAtMinutes) {
            this.reminderAtMinutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A range of 3 to 15 minutes that determines when the reminder begins.
     * </p>
     * 
     * @param reminderAtMinutes
     *        A range of 3 to 15 minutes that determines when the reminder begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndOfMeetingReminder withReminderAtMinutes(java.util.Collection<Integer> reminderAtMinutes) {
        setReminderAtMinutes(reminderAtMinutes);
        return this;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * 
     * @param reminderType
     *        The type of sound that users hear during the end of meeting reminder.
     * @see EndOfMeetingReminderType
     */

    public void setReminderType(String reminderType) {
        this.reminderType = reminderType;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * 
     * @return The type of sound that users hear during the end of meeting reminder.
     * @see EndOfMeetingReminderType
     */

    public String getReminderType() {
        return this.reminderType;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * 
     * @param reminderType
     *        The type of sound that users hear during the end of meeting reminder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndOfMeetingReminderType
     */

    public CreateEndOfMeetingReminder withReminderType(String reminderType) {
        setReminderType(reminderType);
        return this;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * 
     * @param reminderType
     *        The type of sound that users hear during the end of meeting reminder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndOfMeetingReminderType
     */

    public CreateEndOfMeetingReminder withReminderType(EndOfMeetingReminderType reminderType) {
        this.reminderType = reminderType.toString();
        return this;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether an end of meeting reminder is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     * 
     * @return Whether an end of meeting reminder is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether an end of meeting reminder is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndOfMeetingReminder withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     * 
     * @return Whether an end of meeting reminder is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getReminderAtMinutes() != null)
            sb.append("ReminderAtMinutes: ").append(getReminderAtMinutes()).append(",");
        if (getReminderType() != null)
            sb.append("ReminderType: ").append(getReminderType()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndOfMeetingReminder == false)
            return false;
        CreateEndOfMeetingReminder other = (CreateEndOfMeetingReminder) obj;
        if (other.getReminderAtMinutes() == null ^ this.getReminderAtMinutes() == null)
            return false;
        if (other.getReminderAtMinutes() != null && other.getReminderAtMinutes().equals(this.getReminderAtMinutes()) == false)
            return false;
        if (other.getReminderType() == null ^ this.getReminderType() == null)
            return false;
        if (other.getReminderType() != null && other.getReminderType().equals(this.getReminderType()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReminderAtMinutes() == null) ? 0 : getReminderAtMinutes().hashCode());
        hashCode = prime * hashCode + ((getReminderType() == null) ? 0 : getReminderType().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndOfMeetingReminder clone() {
        try {
            return (CreateEndOfMeetingReminder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.CreateEndOfMeetingReminderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
