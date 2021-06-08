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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A technical cue or shot detection segment detected in a video. An array of <code>SegmentDetection</code> objects
 * containing all segments detected in a stored video is returned by <a>GetSegmentDetection</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of the video. This value is rounded down.
     * For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a value of 100
     * millis.
     * </p>
     */
    private Long startTimestampMillis;
    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded down.
     * </p>
     */
    private Long endTimestampMillis;
    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     * <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     */
    private String startTimecodeSMPTE;
    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     * <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     */
    private String endTimecodeSMPTE;
    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     */
    private String durationSMPTE;
    /**
     * <p>
     * If the segment is a technical cue, contains information about the technical cue.
     * </p>
     */
    private TechnicalCueSegment technicalCueSegment;
    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot detection.
     * </p>
     */
    private ShotSegment shotSegment;

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * </p>
     * 
     * @param type
     *        The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * @see SegmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * </p>
     * 
     * @return The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * @see SegmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * </p>
     * 
     * @param type
     *        The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentDetection withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * </p>
     * 
     * @param type
     *        The type of the segment. Valid values are <code>TECHNICAL_CUE</code> and <code>SHOT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentDetection withType(SegmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of the video. This value is rounded down.
     * For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a value of 100
     * millis.
     * </p>
     * 
     * @param startTimestampMillis
     *        The start time of the detected segment in milliseconds from the start of the video. This value is rounded
     *        down. For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     *        value of 100 millis.
     */

    public void setStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
    }

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of the video. This value is rounded down.
     * For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a value of 100
     * millis.
     * </p>
     * 
     * @return The start time of the detected segment in milliseconds from the start of the video. This value is rounded
     *         down. For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     *         value of 100 millis.
     */

    public Long getStartTimestampMillis() {
        return this.startTimestampMillis;
    }

    /**
     * <p>
     * The start time of the detected segment in milliseconds from the start of the video. This value is rounded down.
     * For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a value of 100
     * millis.
     * </p>
     * 
     * @param startTimestampMillis
     *        The start time of the detected segment in milliseconds from the start of the video. This value is rounded
     *        down. For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a
     *        value of 100 millis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withStartTimestampMillis(Long startTimestampMillis) {
        setStartTimestampMillis(startTimestampMillis);
        return this;
    }

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded down.
     * </p>
     * 
     * @param endTimestampMillis
     *        The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded
     *        down.
     */

    public void setEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
    }

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded down.
     * </p>
     * 
     * @return The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded
     *         down.
     */

    public Long getEndTimestampMillis() {
        return this.endTimestampMillis;
    }

    /**
     * <p>
     * The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded down.
     * </p>
     * 
     * @param endTimestampMillis
     *        The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded
     *        down.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withEndTimestampMillis(Long endTimestampMillis) {
        setEndTimestampMillis(endTimestampMillis);
        return this;
    }

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the detected segment in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * 
     * @return The duration of the detected segment in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The duration of the detected segment in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the detected segment in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     * <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * 
     * @param startTimecodeSMPTE
     *        The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     *        <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     */

    public void setStartTimecodeSMPTE(String startTimecodeSMPTE) {
        this.startTimecodeSMPTE = startTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     * <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * 
     * @return The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     *         <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     */

    public String getStartTimecodeSMPTE() {
        return this.startTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     * <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * 
     * @param startTimecodeSMPTE
     *        The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment.
     *        <code>StartTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withStartTimecodeSMPTE(String startTimecodeSMPTE) {
        setStartTimecodeSMPTE(startTimecodeSMPTE);
        return this;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     * <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * 
     * @param endTimecodeSMPTE
     *        The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     *        <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     */

    public void setEndTimecodeSMPTE(String endTimecodeSMPTE) {
        this.endTimecodeSMPTE = endTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     * <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * 
     * @return The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     *         <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     */

    public String getEndTimecodeSMPTE() {
        return this.endTimecodeSMPTE;
    }

    /**
     * <p>
     * The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     * <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * </p>
     * 
     * @param endTimecodeSMPTE
     *        The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment.
     *        <code>EndTimecode</code> is in <i>HH:MM:SS:fr</i> format (and <i>;fr</i> for drop frame-rates).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withEndTimecodeSMPTE(String endTimecodeSMPTE) {
        setEndTimecodeSMPTE(endTimecodeSMPTE);
        return this;
    }

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     * 
     * @param durationSMPTE
     *        The duration of the timecode for the detected segment in SMPTE format.
     */

    public void setDurationSMPTE(String durationSMPTE) {
        this.durationSMPTE = durationSMPTE;
    }

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     * 
     * @return The duration of the timecode for the detected segment in SMPTE format.
     */

    public String getDurationSMPTE() {
        return this.durationSMPTE;
    }

    /**
     * <p>
     * The duration of the timecode for the detected segment in SMPTE format.
     * </p>
     * 
     * @param durationSMPTE
     *        The duration of the timecode for the detected segment in SMPTE format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withDurationSMPTE(String durationSMPTE) {
        setDurationSMPTE(durationSMPTE);
        return this;
    }

    /**
     * <p>
     * If the segment is a technical cue, contains information about the technical cue.
     * </p>
     * 
     * @param technicalCueSegment
     *        If the segment is a technical cue, contains information about the technical cue.
     */

    public void setTechnicalCueSegment(TechnicalCueSegment technicalCueSegment) {
        this.technicalCueSegment = technicalCueSegment;
    }

    /**
     * <p>
     * If the segment is a technical cue, contains information about the technical cue.
     * </p>
     * 
     * @return If the segment is a technical cue, contains information about the technical cue.
     */

    public TechnicalCueSegment getTechnicalCueSegment() {
        return this.technicalCueSegment;
    }

    /**
     * <p>
     * If the segment is a technical cue, contains information about the technical cue.
     * </p>
     * 
     * @param technicalCueSegment
     *        If the segment is a technical cue, contains information about the technical cue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withTechnicalCueSegment(TechnicalCueSegment technicalCueSegment) {
        setTechnicalCueSegment(technicalCueSegment);
        return this;
    }

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot detection.
     * </p>
     * 
     * @param shotSegment
     *        If the segment is a shot detection, contains information about the shot detection.
     */

    public void setShotSegment(ShotSegment shotSegment) {
        this.shotSegment = shotSegment;
    }

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot detection.
     * </p>
     * 
     * @return If the segment is a shot detection, contains information about the shot detection.
     */

    public ShotSegment getShotSegment() {
        return this.shotSegment;
    }

    /**
     * <p>
     * If the segment is a shot detection, contains information about the shot detection.
     * </p>
     * 
     * @param shotSegment
     *        If the segment is a shot detection, contains information about the shot detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDetection withShotSegment(ShotSegment shotSegment) {
        setShotSegment(shotSegment);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStartTimestampMillis() != null)
            sb.append("StartTimestampMillis: ").append(getStartTimestampMillis()).append(",");
        if (getEndTimestampMillis() != null)
            sb.append("EndTimestampMillis: ").append(getEndTimestampMillis()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getStartTimecodeSMPTE() != null)
            sb.append("StartTimecodeSMPTE: ").append(getStartTimecodeSMPTE()).append(",");
        if (getEndTimecodeSMPTE() != null)
            sb.append("EndTimecodeSMPTE: ").append(getEndTimecodeSMPTE()).append(",");
        if (getDurationSMPTE() != null)
            sb.append("DurationSMPTE: ").append(getDurationSMPTE()).append(",");
        if (getTechnicalCueSegment() != null)
            sb.append("TechnicalCueSegment: ").append(getTechnicalCueSegment()).append(",");
        if (getShotSegment() != null)
            sb.append("ShotSegment: ").append(getShotSegment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDetection == false)
            return false;
        SegmentDetection other = (SegmentDetection) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStartTimestampMillis() == null ^ this.getStartTimestampMillis() == null)
            return false;
        if (other.getStartTimestampMillis() != null && other.getStartTimestampMillis().equals(this.getStartTimestampMillis()) == false)
            return false;
        if (other.getEndTimestampMillis() == null ^ this.getEndTimestampMillis() == null)
            return false;
        if (other.getEndTimestampMillis() != null && other.getEndTimestampMillis().equals(this.getEndTimestampMillis()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getStartTimecodeSMPTE() == null ^ this.getStartTimecodeSMPTE() == null)
            return false;
        if (other.getStartTimecodeSMPTE() != null && other.getStartTimecodeSMPTE().equals(this.getStartTimecodeSMPTE()) == false)
            return false;
        if (other.getEndTimecodeSMPTE() == null ^ this.getEndTimecodeSMPTE() == null)
            return false;
        if (other.getEndTimecodeSMPTE() != null && other.getEndTimecodeSMPTE().equals(this.getEndTimecodeSMPTE()) == false)
            return false;
        if (other.getDurationSMPTE() == null ^ this.getDurationSMPTE() == null)
            return false;
        if (other.getDurationSMPTE() != null && other.getDurationSMPTE().equals(this.getDurationSMPTE()) == false)
            return false;
        if (other.getTechnicalCueSegment() == null ^ this.getTechnicalCueSegment() == null)
            return false;
        if (other.getTechnicalCueSegment() != null && other.getTechnicalCueSegment().equals(this.getTechnicalCueSegment()) == false)
            return false;
        if (other.getShotSegment() == null ^ this.getShotSegment() == null)
            return false;
        if (other.getShotSegment() != null && other.getShotSegment().equals(this.getShotSegment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStartTimestampMillis() == null) ? 0 : getStartTimestampMillis().hashCode());
        hashCode = prime * hashCode + ((getEndTimestampMillis() == null) ? 0 : getEndTimestampMillis().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getStartTimecodeSMPTE() == null) ? 0 : getStartTimecodeSMPTE().hashCode());
        hashCode = prime * hashCode + ((getEndTimecodeSMPTE() == null) ? 0 : getEndTimecodeSMPTE().hashCode());
        hashCode = prime * hashCode + ((getDurationSMPTE() == null) ? 0 : getDurationSMPTE().hashCode());
        hashCode = prime * hashCode + ((getTechnicalCueSegment() == null) ? 0 : getTechnicalCueSegment().hashCode());
        hashCode = prime * hashCode + ((getShotSegment() == null) ? 0 : getShotSegment().hashCode());
        return hashCode;
    }

    @Override
    public SegmentDetection clone() {
        try {
            return (SegmentDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.SegmentDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
