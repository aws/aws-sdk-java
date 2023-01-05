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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Program transition configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/Transition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration of the live program in seconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * </p>
     */
    private String relativePosition;
    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by <code>RelativePosition</code>.
     * </p>
     */
    private String relativeProgram;
    /**
     * <p>
     * The date and time that the program is scheduled to start, in epoch milliseconds.
     * </p>
     */
    private Long scheduledStartTimeMillis;
    /**
     * <p>
     * Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     * <code>RELATIVE</code>.
     * </p>
     * <p>
     * <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used for
     * channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     * </p>
     * <p>
     * Note the following considerations when using <code>ABSOLUTE</code> transitions:
     * </p>
     * <p>
     * If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor
     * truncates the preceding program on a common segment boundary.
     * </p>
     * <p>
     * If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your linear
     * channel.
     * </p>
     * <p>
     * <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that you
     * specify via <code>RelativePosition</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The duration of the live program in seconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the live program in seconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the live program in seconds.
     * </p>
     * 
     * @return The duration of the live program in seconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The duration of the live program in seconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the live program in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * </p>
     * 
     * @param relativePosition
     *        The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * @see RelativePosition
     */

    public void setRelativePosition(String relativePosition) {
        this.relativePosition = relativePosition;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * </p>
     * 
     * @return The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * @see RelativePosition
     */

    public String getRelativePosition() {
        return this.relativePosition;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * </p>
     * 
     * @param relativePosition
     *        The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativePosition
     */

    public Transition withRelativePosition(String relativePosition) {
        setRelativePosition(relativePosition);
        return this;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * </p>
     * 
     * @param relativePosition
     *        The position where this program will be inserted relative to the <code>RelativePosition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativePosition
     */

    public Transition withRelativePosition(RelativePosition relativePosition) {
        this.relativePosition = relativePosition.toString();
        return this;
    }

    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by <code>RelativePosition</code>.
     * </p>
     * 
     * @param relativeProgram
     *        The name of the program that this program will be inserted next to, as defined by
     *        <code>RelativePosition</code>.
     */

    public void setRelativeProgram(String relativeProgram) {
        this.relativeProgram = relativeProgram;
    }

    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by <code>RelativePosition</code>.
     * </p>
     * 
     * @return The name of the program that this program will be inserted next to, as defined by
     *         <code>RelativePosition</code>.
     */

    public String getRelativeProgram() {
        return this.relativeProgram;
    }

    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by <code>RelativePosition</code>.
     * </p>
     * 
     * @param relativeProgram
     *        The name of the program that this program will be inserted next to, as defined by
     *        <code>RelativePosition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withRelativeProgram(String relativeProgram) {
        setRelativeProgram(relativeProgram);
        return this;
    }

    /**
     * <p>
     * The date and time that the program is scheduled to start, in epoch milliseconds.
     * </p>
     * 
     * @param scheduledStartTimeMillis
     *        The date and time that the program is scheduled to start, in epoch milliseconds.
     */

    public void setScheduledStartTimeMillis(Long scheduledStartTimeMillis) {
        this.scheduledStartTimeMillis = scheduledStartTimeMillis;
    }

    /**
     * <p>
     * The date and time that the program is scheduled to start, in epoch milliseconds.
     * </p>
     * 
     * @return The date and time that the program is scheduled to start, in epoch milliseconds.
     */

    public Long getScheduledStartTimeMillis() {
        return this.scheduledStartTimeMillis;
    }

    /**
     * <p>
     * The date and time that the program is scheduled to start, in epoch milliseconds.
     * </p>
     * 
     * @param scheduledStartTimeMillis
     *        The date and time that the program is scheduled to start, in epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withScheduledStartTimeMillis(Long scheduledStartTimeMillis) {
        setScheduledStartTimeMillis(scheduledStartTimeMillis);
        return this;
    }

    /**
     * <p>
     * Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     * <code>RELATIVE</code>.
     * </p>
     * <p>
     * <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used for
     * channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     * </p>
     * <p>
     * Note the following considerations when using <code>ABSOLUTE</code> transitions:
     * </p>
     * <p>
     * If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor
     * truncates the preceding program on a common segment boundary.
     * </p>
     * <p>
     * If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your linear
     * channel.
     * </p>
     * <p>
     * <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that you
     * specify via <code>RelativePosition</code>.
     * </p>
     * 
     * @param type
     *        Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     *        <code>RELATIVE</code>.</p>
     *        <p>
     *        <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used for
     *        channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     *        </p>
     *        <p>
     *        Note the following considerations when using <code>ABSOLUTE</code> transitions:
     *        </p>
     *        <p>
     *        If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor
     *        truncates the preceding program on a common segment boundary.
     *        </p>
     *        <p>
     *        If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your
     *        linear channel.
     *        </p>
     *        <p>
     *        <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that
     *        you specify via <code>RelativePosition</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     * <code>RELATIVE</code>.
     * </p>
     * <p>
     * <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used for
     * channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     * </p>
     * <p>
     * Note the following considerations when using <code>ABSOLUTE</code> transitions:
     * </p>
     * <p>
     * If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor
     * truncates the preceding program on a common segment boundary.
     * </p>
     * <p>
     * If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your linear
     * channel.
     * </p>
     * <p>
     * <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that you
     * specify via <code>RelativePosition</code>.
     * </p>
     * 
     * @return Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     *         <code>RELATIVE</code>.</p>
     *         <p>
     *         <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used
     *         for channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     *         </p>
     *         <p>
     *         Note the following considerations when using <code>ABSOLUTE</code> transitions:
     *         </p>
     *         <p>
     *         If the preceding program in the schedule has a duration that extends past the wall clock time,
     *         MediaTailor truncates the preceding program on a common segment boundary.
     *         </p>
     *         <p>
     *         If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your
     *         linear channel.
     *         </p>
     *         <p>
     *         <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that
     *         you specify via <code>RelativePosition</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     * <code>RELATIVE</code>.
     * </p>
     * <p>
     * <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used for
     * channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     * </p>
     * <p>
     * Note the following considerations when using <code>ABSOLUTE</code> transitions:
     * </p>
     * <p>
     * If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor
     * truncates the preceding program on a common segment boundary.
     * </p>
     * <p>
     * If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your linear
     * channel.
     * </p>
     * <p>
     * <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that you
     * specify via <code>RelativePosition</code>.
     * </p>
     * 
     * @param type
     *        Defines when the program plays in the schedule. You can set the value to <code>ABSOLUTE</code> or
     *        <code>RELATIVE</code>.</p>
     *        <p>
     *        <code>ABSOLUTE</code> - The program plays at a specific wall clock time. This setting can only be used for
     *        channels using the <code>LINEAR</code> <code>PlaybackMode</code>.
     *        </p>
     *        <p>
     *        Note the following considerations when using <code>ABSOLUTE</code> transitions:
     *        </p>
     *        <p>
     *        If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor
     *        truncates the preceding program on a common segment boundary.
     *        </p>
     *        <p>
     *        If there are gaps in playback, MediaTailor plays the <code>FillerSlate</code> you configured for your
     *        linear channel.
     *        </p>
     *        <p>
     *        <code>RELATIVE</code> - The program is inserted into the schedule either before or after a program that
     *        you specify via <code>RelativePosition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withType(String type) {
        setType(type);
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
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getRelativePosition() != null)
            sb.append("RelativePosition: ").append(getRelativePosition()).append(",");
        if (getRelativeProgram() != null)
            sb.append("RelativeProgram: ").append(getRelativeProgram()).append(",");
        if (getScheduledStartTimeMillis() != null)
            sb.append("ScheduledStartTimeMillis: ").append(getScheduledStartTimeMillis()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transition == false)
            return false;
        Transition other = (Transition) obj;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getRelativePosition() == null ^ this.getRelativePosition() == null)
            return false;
        if (other.getRelativePosition() != null && other.getRelativePosition().equals(this.getRelativePosition()) == false)
            return false;
        if (other.getRelativeProgram() == null ^ this.getRelativeProgram() == null)
            return false;
        if (other.getRelativeProgram() != null && other.getRelativeProgram().equals(this.getRelativeProgram()) == false)
            return false;
        if (other.getScheduledStartTimeMillis() == null ^ this.getScheduledStartTimeMillis() == null)
            return false;
        if (other.getScheduledStartTimeMillis() != null && other.getScheduledStartTimeMillis().equals(this.getScheduledStartTimeMillis()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getRelativePosition() == null) ? 0 : getRelativePosition().hashCode());
        hashCode = prime * hashCode + ((getRelativeProgram() == null) ? 0 : getRelativeProgram().hashCode());
        hashCode = prime * hashCode + ((getScheduledStartTimeMillis() == null) ? 0 : getScheduledStartTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Transition clone() {
        try {
            return (Transition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.TransitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
