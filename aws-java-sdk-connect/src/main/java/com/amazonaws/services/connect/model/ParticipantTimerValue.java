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
 * The value of the timer. Either the timer action (<code>Unset</code> to delete the timer), or the duration of the
 * timer in minutes. Only one value can be set.
 * </p>
 * <p>
 * For more information about how chat timeouts work, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html">Set up chat timeouts for human
 * participants</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ParticipantTimerValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipantTimerValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * </p>
     */
    private String participantTimerAction;
    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     */
    private Integer participantTimerDurationInMinutes;

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * </p>
     * 
     * @param participantTimerAction
     *        The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * @see ParticipantTimerAction
     */

    public void setParticipantTimerAction(String participantTimerAction) {
        this.participantTimerAction = participantTimerAction;
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * </p>
     * 
     * @return The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * @see ParticipantTimerAction
     */

    public String getParticipantTimerAction() {
        return this.participantTimerAction;
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * </p>
     * 
     * @param participantTimerAction
     *        The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTimerAction
     */

    public ParticipantTimerValue withParticipantTimerAction(String participantTimerAction) {
        setParticipantTimerAction(participantTimerAction);
        return this;
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * </p>
     * 
     * @param participantTimerAction
     *        The timer action. Currently only one value is allowed: <code>Unset</code>. It deletes a timer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTimerAction
     */

    public ParticipantTimerValue withParticipantTimerAction(ParticipantTimerAction participantTimerAction) {
        this.participantTimerAction = participantTimerAction.toString();
        return this;
    }

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * 
     * @param participantTimerDurationInMinutes
     *        The duration of a timer, in minutes.
     */

    public void setParticipantTimerDurationInMinutes(Integer participantTimerDurationInMinutes) {
        this.participantTimerDurationInMinutes = participantTimerDurationInMinutes;
    }

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * 
     * @return The duration of a timer, in minutes.
     */

    public Integer getParticipantTimerDurationInMinutes() {
        return this.participantTimerDurationInMinutes;
    }

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * 
     * @param participantTimerDurationInMinutes
     *        The duration of a timer, in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipantTimerValue withParticipantTimerDurationInMinutes(Integer participantTimerDurationInMinutes) {
        setParticipantTimerDurationInMinutes(participantTimerDurationInMinutes);
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
        if (getParticipantTimerAction() != null)
            sb.append("ParticipantTimerAction: ").append(getParticipantTimerAction()).append(",");
        if (getParticipantTimerDurationInMinutes() != null)
            sb.append("ParticipantTimerDurationInMinutes: ").append(getParticipantTimerDurationInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantTimerValue == false)
            return false;
        ParticipantTimerValue other = (ParticipantTimerValue) obj;
        if (other.getParticipantTimerAction() == null ^ this.getParticipantTimerAction() == null)
            return false;
        if (other.getParticipantTimerAction() != null && other.getParticipantTimerAction().equals(this.getParticipantTimerAction()) == false)
            return false;
        if (other.getParticipantTimerDurationInMinutes() == null ^ this.getParticipantTimerDurationInMinutes() == null)
            return false;
        if (other.getParticipantTimerDurationInMinutes() != null
                && other.getParticipantTimerDurationInMinutes().equals(this.getParticipantTimerDurationInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantTimerAction() == null) ? 0 : getParticipantTimerAction().hashCode());
        hashCode = prime * hashCode + ((getParticipantTimerDurationInMinutes() == null) ? 0 : getParticipantTimerDurationInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public ParticipantTimerValue clone() {
        try {
            return (ParticipantTimerValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ParticipantTimerValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
