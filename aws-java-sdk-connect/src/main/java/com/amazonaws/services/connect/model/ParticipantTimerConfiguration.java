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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the timer. After the timer configuration is set, it persists for the duration of the
 * chat. It persists across new contacts in the chain, for example, transfer contacts.
 * </p>
 * <p>
 * For more information about how chat timeouts work, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html">Set up chat timeouts for human
 * participants</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ParticipantTimerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipantTimerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant as
     * idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a chat
     * participant due to idleness.
     * </p>
     */
    private String timerType;
    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer in
     * minutes. Only one value can be set.
     * </p>
     */
    private ParticipantTimerValue timerValue;

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * 
     * @param participantRole
     *        The role of the participant in the chat conversation.
     * @see TimerEligibleParticipantRoles
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * 
     * @return The role of the participant in the chat conversation.
     * @see TimerEligibleParticipantRoles
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * 
     * @param participantRole
     *        The role of the participant in the chat conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimerEligibleParticipantRoles
     */

    public ParticipantTimerConfiguration withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * 
     * @param participantRole
     *        The role of the participant in the chat conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimerEligibleParticipantRoles
     */

    public ParticipantTimerConfiguration withParticipantRole(TimerEligibleParticipantRoles participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant as
     * idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a chat
     * participant due to idleness.
     * </p>
     * 
     * @param timerType
     *        The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant
     *        as idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a
     *        chat participant due to idleness.
     * @see ParticipantTimerType
     */

    public void setTimerType(String timerType) {
        this.timerType = timerType;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant as
     * idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a chat
     * participant due to idleness.
     * </p>
     * 
     * @return The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant
     *         as idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a
     *         chat participant due to idleness.
     * @see ParticipantTimerType
     */

    public String getTimerType() {
        return this.timerType;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant as
     * idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a chat
     * participant due to idleness.
     * </p>
     * 
     * @param timerType
     *        The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant
     *        as idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a
     *        chat participant due to idleness.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTimerType
     */

    public ParticipantTimerConfiguration withTimerType(String timerType) {
        setTimerType(timerType);
        return this;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant as
     * idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a chat
     * participant due to idleness.
     * </p>
     * 
     * @param timerType
     *        The type of timer. <code>IDLE</code> indicates the timer applies for considering a human chat participant
     *        as idle. <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to automatically disconnecting a
     *        chat participant due to idleness.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTimerType
     */

    public ParticipantTimerConfiguration withTimerType(ParticipantTimerType timerType) {
        this.timerType = timerType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer in
     * minutes. Only one value can be set.
     * </p>
     * 
     * @param timerValue
     *        The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer
     *        in minutes. Only one value can be set.
     */

    public void setTimerValue(ParticipantTimerValue timerValue) {
        this.timerValue = timerValue;
    }

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer in
     * minutes. Only one value can be set.
     * </p>
     * 
     * @return The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer
     *         in minutes. Only one value can be set.
     */

    public ParticipantTimerValue getTimerValue() {
        return this.timerValue;
    }

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer in
     * minutes. Only one value can be set.
     * </p>
     * 
     * @param timerValue
     *        The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer
     *        in minutes. Only one value can be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipantTimerConfiguration withTimerValue(ParticipantTimerValue timerValue) {
        setTimerValue(timerValue);
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
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
        if (getTimerType() != null)
            sb.append("TimerType: ").append(getTimerType()).append(",");
        if (getTimerValue() != null)
            sb.append("TimerValue: ").append(getTimerValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantTimerConfiguration == false)
            return false;
        ParticipantTimerConfiguration other = (ParticipantTimerConfiguration) obj;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getTimerType() == null ^ this.getTimerType() == null)
            return false;
        if (other.getTimerType() != null && other.getTimerType().equals(this.getTimerType()) == false)
            return false;
        if (other.getTimerValue() == null ^ this.getTimerValue() == null)
            return false;
        if (other.getTimerValue() != null && other.getTimerValue().equals(this.getTimerValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getTimerType() == null) ? 0 : getTimerType().hashCode());
        hashCode = prime * hashCode + ((getTimerValue() == null) ? 0 : getTimerValue().hashCode());
        return hashCode;
    }

    @Override
    public ParticipantTimerConfiguration clone() {
        try {
            return (ParticipantTimerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ParticipantTimerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
