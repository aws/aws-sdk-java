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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for a SCTE-35 splice_insert message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35SpliceInsertScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35SpliceInsertScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds
     * by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and
     * cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an
     * expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
     */
    private Long duration;
    /** The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35. */
    private Long spliceEventId;

    /**
     * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds
     * by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and
     * cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an
     * expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
     * 
     * @param duration
     *        Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the
     *        seconds by 90,000. If you enter a duration, there is an expectation that the downstream system can read
     *        the duration and cue in at that time. If you do not enter a duration, the splice_insert will continue
     *        indefinitely and there is an expectation that you will enter a return_to_network to end the splice_insert
     *        at the appropriate time.
     */

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds
     * by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and
     * cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an
     * expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
     * 
     * @return Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the
     *         seconds by 90,000. If you enter a duration, there is an expectation that the downstream system can read
     *         the duration and cue in at that time. If you do not enter a duration, the splice_insert will continue
     *         indefinitely and there is an expectation that you will enter a return_to_network to end the splice_insert
     *         at the appropriate time.
     */

    public Long getDuration() {
        return this.duration;
    }

    /**
     * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds
     * by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and
     * cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an
     * expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
     * 
     * @param duration
     *        Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the
     *        seconds by 90,000. If you enter a duration, there is an expectation that the downstream system can read
     *        the duration and cue in at that time. If you do not enter a duration, the splice_insert will continue
     *        indefinitely and there is an expectation that you will enter a return_to_network to end the splice_insert
     *        at the appropriate time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SpliceInsertScheduleActionSettings withDuration(Long duration) {
        setDuration(duration);
        return this;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * 
     * @param spliceEventId
     *        The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     */

    public void setSpliceEventId(Long spliceEventId) {
        this.spliceEventId = spliceEventId;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * 
     * @return The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     */

    public Long getSpliceEventId() {
        return this.spliceEventId;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * 
     * @param spliceEventId
     *        The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SpliceInsertScheduleActionSettings withSpliceEventId(Long spliceEventId) {
        setSpliceEventId(spliceEventId);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getSpliceEventId() != null)
            sb.append("SpliceEventId: ").append(getSpliceEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35SpliceInsertScheduleActionSettings == false)
            return false;
        Scte35SpliceInsertScheduleActionSettings other = (Scte35SpliceInsertScheduleActionSettings) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getSpliceEventId() == null ^ this.getSpliceEventId() == null)
            return false;
        if (other.getSpliceEventId() != null && other.getSpliceEventId().equals(this.getSpliceEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getSpliceEventId() == null) ? 0 : getSpliceEventId().hashCode());
        return hashCode;
    }

    @Override
    public Scte35SpliceInsertScheduleActionSettings clone() {
        try {
            return (Scte35SpliceInsertScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35SpliceInsertScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
