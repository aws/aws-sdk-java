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
 * Timecode Config
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TimecodeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimecodeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * Identifies the source for the timecode that will be associated with the events outputs. -Embedded (embedded):
     * Initialize the output timecode with timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System Clock (systemclock): Use the UTC time.
     * -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
     */
    private String source;
    /**
     * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below
     * this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     */
    private Integer syncThreshold;

    /**
     * Identifies the source for the timecode that will be associated with the events outputs. -Embedded (embedded):
     * Initialize the output timecode with timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System Clock (systemclock): Use the UTC time.
     * -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
     * 
     * @param source
     *        Identifies the source for the timecode that will be associated with the events outputs. -Embedded
     *        (embedded): Initialize the output timecode with timecode from the the source. If no embedded timecode is
     *        detected in the source, the system falls back to using "Start at 0" (zerobased). -System Clock
     *        (systemclock): Use the UTC time. -Start at 0 (zerobased): The time of the first frame of the event will be
     *        00:00:00:00.
     * @see TimecodeConfigSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Identifies the source for the timecode that will be associated with the events outputs. -Embedded (embedded):
     * Initialize the output timecode with timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System Clock (systemclock): Use the UTC time.
     * -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
     * 
     * @return Identifies the source for the timecode that will be associated with the events outputs. -Embedded
     *         (embedded): Initialize the output timecode with timecode from the the source. If no embedded timecode is
     *         detected in the source, the system falls back to using "Start at 0" (zerobased). -System Clock
     *         (systemclock): Use the UTC time. -Start at 0 (zerobased): The time of the first frame of the event will
     *         be 00:00:00:00.
     * @see TimecodeConfigSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * Identifies the source for the timecode that will be associated with the events outputs. -Embedded (embedded):
     * Initialize the output timecode with timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System Clock (systemclock): Use the UTC time.
     * -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
     * 
     * @param source
     *        Identifies the source for the timecode that will be associated with the events outputs. -Embedded
     *        (embedded): Initialize the output timecode with timecode from the the source. If no embedded timecode is
     *        detected in the source, the system falls back to using "Start at 0" (zerobased). -System Clock
     *        (systemclock): Use the UTC time. -Start at 0 (zerobased): The time of the first frame of the event will be
     *        00:00:00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeConfigSource
     */

    public TimecodeConfig withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * Identifies the source for the timecode that will be associated with the events outputs. -Embedded (embedded):
     * Initialize the output timecode with timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System Clock (systemclock): Use the UTC time.
     * -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
     * 
     * @param source
     *        Identifies the source for the timecode that will be associated with the events outputs. -Embedded
     *        (embedded): Initialize the output timecode with timecode from the the source. If no embedded timecode is
     *        detected in the source, the system falls back to using "Start at 0" (zerobased). -System Clock
     *        (systemclock): Use the UTC time. -Start at 0 (zerobased): The time of the first frame of the event will be
     *        00:00:00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeConfigSource
     */

    public TimecodeConfig withSource(TimecodeConfigSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below
     * this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * 
     * @param syncThreshold
     *        Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies
     *        below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No
     *        timecode sync when this is not specified.
     */

    public void setSyncThreshold(Integer syncThreshold) {
        this.syncThreshold = syncThreshold;
    }

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below
     * this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * 
     * @return Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies
     *         below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No
     *         timecode sync when this is not specified.
     */

    public Integer getSyncThreshold() {
        return this.syncThreshold;
    }

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below
     * this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * 
     * @param syncThreshold
     *        Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies
     *        below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No
     *        timecode sync when this is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeConfig withSyncThreshold(Integer syncThreshold) {
        setSyncThreshold(syncThreshold);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSyncThreshold() != null)
            sb.append("SyncThreshold: ").append(getSyncThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimecodeConfig == false)
            return false;
        TimecodeConfig other = (TimecodeConfig) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSyncThreshold() == null ^ this.getSyncThreshold() == null)
            return false;
        if (other.getSyncThreshold() != null && other.getSyncThreshold().equals(this.getSyncThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSyncThreshold() == null) ? 0 : getSyncThreshold().hashCode());
        return hashCode;
    }

    @Override
    public TimecodeConfig clone() {
        try {
            return (TimecodeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.TimecodeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
