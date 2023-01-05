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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a label detected in a video analysis request and the time the label was detected in the video.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected. Note that <code>Timestamp</code>
     * is not guaranteed to be accurate to the individual frame where the label first appears.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * Details about the detected label.
     * </p>
     */
    private Label label;
    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected label.
     * </p>
     */
    private Long startTimestampMillis;
    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected label.
     * </p>
     */
    private Long endTimestampMillis;
    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     * EndTimestampMillis.
     * </p>
     */
    private Long durationMillis;

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected. Note that <code>Timestamp</code>
     * is not guaranteed to be accurate to the individual frame where the label first appears.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the start of the video, that the label was detected. Note that
     *        <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the label first
     *        appears.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected. Note that <code>Timestamp</code>
     * is not guaranteed to be accurate to the individual frame where the label first appears.
     * </p>
     * 
     * @return Time, in milliseconds from the start of the video, that the label was detected. Note that
     *         <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the label first
     *         appears.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected. Note that <code>Timestamp</code>
     * is not guaranteed to be accurate to the individual frame where the label first appears.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the start of the video, that the label was detected. Note that
     *        <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the label first
     *        appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * 
     * @param label
     *        Details about the detected label.
     */

    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * 
     * @return Details about the detected label.
     */

    public Label getLabel() {
        return this.label;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * 
     * @param label
     *        Details about the detected label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withLabel(Label label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected label.
     * </p>
     * 
     * @param startTimestampMillis
     *        The time in milliseconds defining the start of the timeline segment containing a continuously detected
     *        label.
     */

    public void setStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected label.
     * </p>
     * 
     * @return The time in milliseconds defining the start of the timeline segment containing a continuously detected
     *         label.
     */

    public Long getStartTimestampMillis() {
        return this.startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected label.
     * </p>
     * 
     * @param startTimestampMillis
     *        The time in milliseconds defining the start of the timeline segment containing a continuously detected
     *        label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withStartTimestampMillis(Long startTimestampMillis) {
        setStartTimestampMillis(startTimestampMillis);
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected label.
     * </p>
     * 
     * @param endTimestampMillis
     *        The time in milliseconds defining the end of the timeline segment containing a continuously detected
     *        label.
     */

    public void setEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected label.
     * </p>
     * 
     * @return The time in milliseconds defining the end of the timeline segment containing a continuously detected
     *         label.
     */

    public Long getEndTimestampMillis() {
        return this.endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected label.
     * </p>
     * 
     * @param endTimestampMillis
     *        The time in milliseconds defining the end of the timeline segment containing a continuously detected
     *        label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withEndTimestampMillis(Long endTimestampMillis) {
        setEndTimestampMillis(endTimestampMillis);
        return this;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     * EndTimestampMillis.
     * </p>
     * 
     * @param durationMillis
     *        The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     *        EndTimestampMillis.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     * EndTimestampMillis.
     * </p>
     * 
     * @return The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     *         EndTimestampMillis.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     * EndTimestampMillis.
     * </p>
     * 
     * @param durationMillis
     *        The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to
     *        EndTimestampMillis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getStartTimestampMillis() != null)
            sb.append("StartTimestampMillis: ").append(getStartTimestampMillis()).append(",");
        if (getEndTimestampMillis() != null)
            sb.append("EndTimestampMillis: ").append(getEndTimestampMillis()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelDetection == false)
            return false;
        LabelDetection other = (LabelDetection) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getStartTimestampMillis() == null) ? 0 : getStartTimestampMillis().hashCode());
        hashCode = prime * hashCode + ((getEndTimestampMillis() == null) ? 0 : getEndTimestampMillis().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        return hashCode;
    }

    @Override
    public LabelDetection clone() {
        try {
            return (LabelDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.LabelDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
