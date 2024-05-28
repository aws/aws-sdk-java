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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Cmaf Ingest Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CmafIngestGroupSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafIngestGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /** A HTTP destination for the tracks */
    private OutputLocationRef destination;
    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     */
    private String nielsenId3Behavior;
    /** Type of scte35 track to add. none or scte35WithoutSegmentation */
    private String scte35Type;
    /**
     * The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on the
     * next keyframe after the specified duration, so the actual segment length might be longer, and it might be a
     * fraction of the units.
     */
    private Integer segmentLength;
    /** Time unit for segment length parameter. */
    private String segmentLengthUnits;
    /** Number of milliseconds to delay the output from the second pipeline. */
    private Integer sendDelayMs;

    /**
     * A HTTP destination for the tracks
     * 
     * @param destination
     *        A HTTP destination for the tracks
     */

    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * A HTTP destination for the tracks
     * 
     * @return A HTTP destination for the tracks
     */

    public OutputLocationRef getDestination() {
        return this.destination;
    }

    /**
     * A HTTP destination for the tracks
     * 
     * @param destination
     *        A HTTP destination for the tracks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafIngestGroupSettings withDestination(OutputLocationRef destination) {
        setDestination(destination);
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @param nielsenId3Behavior
     *        If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *        an equivalent ID3 tag will be inserted in the output.
     * @see CmafNielsenId3Behavior
     */

    public void setNielsenId3Behavior(String nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @return If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *         an equivalent ID3 tag will be inserted in the output.
     * @see CmafNielsenId3Behavior
     */

    public String getNielsenId3Behavior() {
        return this.nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @param nielsenId3Behavior
     *        If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *        an equivalent ID3 tag will be inserted in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafNielsenId3Behavior
     */

    public CmafIngestGroupSettings withNielsenId3Behavior(String nielsenId3Behavior) {
        setNielsenId3Behavior(nielsenId3Behavior);
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @param nielsenId3Behavior
     *        If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *        an equivalent ID3 tag will be inserted in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafNielsenId3Behavior
     */

    public CmafIngestGroupSettings withNielsenId3Behavior(CmafNielsenId3Behavior nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior.toString();
        return this;
    }

    /**
     * Type of scte35 track to add. none or scte35WithoutSegmentation
     * 
     * @param scte35Type
     *        Type of scte35 track to add. none or scte35WithoutSegmentation
     * @see Scte35Type
     */

    public void setScte35Type(String scte35Type) {
        this.scte35Type = scte35Type;
    }

    /**
     * Type of scte35 track to add. none or scte35WithoutSegmentation
     * 
     * @return Type of scte35 track to add. none or scte35WithoutSegmentation
     * @see Scte35Type
     */

    public String getScte35Type() {
        return this.scte35Type;
    }

    /**
     * Type of scte35 track to add. none or scte35WithoutSegmentation
     * 
     * @param scte35Type
     *        Type of scte35 track to add. none or scte35WithoutSegmentation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35Type
     */

    public CmafIngestGroupSettings withScte35Type(String scte35Type) {
        setScte35Type(scte35Type);
        return this;
    }

    /**
     * Type of scte35 track to add. none or scte35WithoutSegmentation
     * 
     * @param scte35Type
     *        Type of scte35 track to add. none or scte35WithoutSegmentation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35Type
     */

    public CmafIngestGroupSettings withScte35Type(Scte35Type scte35Type) {
        this.scte35Type = scte35Type.toString();
        return this;
    }

    /**
     * The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on the
     * next keyframe after the specified duration, so the actual segment length might be longer, and it might be a
     * fraction of the units.
     * 
     * @param segmentLength
     *        The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on
     *        the next keyframe after the specified duration, so the actual segment length might be longer, and it might
     *        be a fraction of the units.
     */

    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on the
     * next keyframe after the specified duration, so the actual segment length might be longer, and it might be a
     * fraction of the units.
     * 
     * @return The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on
     *         the next keyframe after the specified duration, so the actual segment length might be longer, and it
     *         might be a fraction of the units.
     */

    public Integer getSegmentLength() {
        return this.segmentLength;
    }

    /**
     * The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on the
     * next keyframe after the specified duration, so the actual segment length might be longer, and it might be a
     * fraction of the units.
     * 
     * @param segmentLength
     *        The nominal duration of segments. The units are specified in SegmentLengthUnits. The segments will end on
     *        the next keyframe after the specified duration, so the actual segment length might be longer, and it might
     *        be a fraction of the units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafIngestGroupSettings withSegmentLength(Integer segmentLength) {
        setSegmentLength(segmentLength);
        return this;
    }

    /**
     * Time unit for segment length parameter.
     * 
     * @param segmentLengthUnits
     *        Time unit for segment length parameter.
     * @see CmafIngestSegmentLengthUnits
     */

    public void setSegmentLengthUnits(String segmentLengthUnits) {
        this.segmentLengthUnits = segmentLengthUnits;
    }

    /**
     * Time unit for segment length parameter.
     * 
     * @return Time unit for segment length parameter.
     * @see CmafIngestSegmentLengthUnits
     */

    public String getSegmentLengthUnits() {
        return this.segmentLengthUnits;
    }

    /**
     * Time unit for segment length parameter.
     * 
     * @param segmentLengthUnits
     *        Time unit for segment length parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafIngestSegmentLengthUnits
     */

    public CmafIngestGroupSettings withSegmentLengthUnits(String segmentLengthUnits) {
        setSegmentLengthUnits(segmentLengthUnits);
        return this;
    }

    /**
     * Time unit for segment length parameter.
     * 
     * @param segmentLengthUnits
     *        Time unit for segment length parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafIngestSegmentLengthUnits
     */

    public CmafIngestGroupSettings withSegmentLengthUnits(CmafIngestSegmentLengthUnits segmentLengthUnits) {
        this.segmentLengthUnits = segmentLengthUnits.toString();
        return this;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * 
     * @param sendDelayMs
     *        Number of milliseconds to delay the output from the second pipeline.
     */

    public void setSendDelayMs(Integer sendDelayMs) {
        this.sendDelayMs = sendDelayMs;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * 
     * @return Number of milliseconds to delay the output from the second pipeline.
     */

    public Integer getSendDelayMs() {
        return this.sendDelayMs;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * 
     * @param sendDelayMs
     *        Number of milliseconds to delay the output from the second pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafIngestGroupSettings withSendDelayMs(Integer sendDelayMs) {
        setSendDelayMs(sendDelayMs);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getNielsenId3Behavior() != null)
            sb.append("NielsenId3Behavior: ").append(getNielsenId3Behavior()).append(",");
        if (getScte35Type() != null)
            sb.append("Scte35Type: ").append(getScte35Type()).append(",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: ").append(getSegmentLength()).append(",");
        if (getSegmentLengthUnits() != null)
            sb.append("SegmentLengthUnits: ").append(getSegmentLengthUnits()).append(",");
        if (getSendDelayMs() != null)
            sb.append("SendDelayMs: ").append(getSendDelayMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafIngestGroupSettings == false)
            return false;
        CmafIngestGroupSettings other = (CmafIngestGroupSettings) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getNielsenId3Behavior() == null ^ this.getNielsenId3Behavior() == null)
            return false;
        if (other.getNielsenId3Behavior() != null && other.getNielsenId3Behavior().equals(this.getNielsenId3Behavior()) == false)
            return false;
        if (other.getScte35Type() == null ^ this.getScte35Type() == null)
            return false;
        if (other.getScte35Type() != null && other.getScte35Type().equals(this.getScte35Type()) == false)
            return false;
        if (other.getSegmentLength() == null ^ this.getSegmentLength() == null)
            return false;
        if (other.getSegmentLength() != null && other.getSegmentLength().equals(this.getSegmentLength()) == false)
            return false;
        if (other.getSegmentLengthUnits() == null ^ this.getSegmentLengthUnits() == null)
            return false;
        if (other.getSegmentLengthUnits() != null && other.getSegmentLengthUnits().equals(this.getSegmentLengthUnits()) == false)
            return false;
        if (other.getSendDelayMs() == null ^ this.getSendDelayMs() == null)
            return false;
        if (other.getSendDelayMs() != null && other.getSendDelayMs().equals(this.getSendDelayMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getNielsenId3Behavior() == null) ? 0 : getNielsenId3Behavior().hashCode());
        hashCode = prime * hashCode + ((getScte35Type() == null) ? 0 : getScte35Type().hashCode());
        hashCode = prime * hashCode + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getSegmentLengthUnits() == null) ? 0 : getSegmentLengthUnits().hashCode());
        hashCode = prime * hashCode + ((getSendDelayMs() == null) ? 0 : getSendDelayMs().hashCode());
        return hashCode;
    }

    @Override
    public CmafIngestGroupSettings clone() {
        try {
            return (CmafIngestGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CmafIngestGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
