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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an inappropriate, unwanted, or offensive content label detection in a stored video.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentModerationDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content moderation label was detected. Note that
     * <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the moderated content first
     * appears.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     */
    private ModerationLabel moderationLabel;
    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     */
    private Long startTimestampMillis;
    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected moderation
     * label.
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
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     */
    private java.util.List<ContentType> contentTypes;

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content moderation label was detected. Note that
     * <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the moderated content first
     * appears.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the beginning of the video, that the content moderation label was detected.
     *        Note that <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the
     *        moderated content first appears.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content moderation label was detected. Note that
     * <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the moderated content first
     * appears.
     * </p>
     * 
     * @return Time, in milliseconds from the beginning of the video, that the content moderation label was detected.
     *         Note that <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the
     *         moderated content first appears.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content moderation label was detected. Note that
     * <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the moderated content first
     * appears.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the beginning of the video, that the content moderation label was detected.
     *        Note that <code>Timestamp</code> is not guaranteed to be accurate to the individual frame where the
     *        moderated content first appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentModerationDetection withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     * 
     * @param moderationLabel
     *        The content moderation label detected by in the stored video.
     */

    public void setModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
    }

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     * 
     * @return The content moderation label detected by in the stored video.
     */

    public ModerationLabel getModerationLabel() {
        return this.moderationLabel;
    }

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     * 
     * @param moderationLabel
     *        The content moderation label detected by in the stored video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentModerationDetection withModerationLabel(ModerationLabel moderationLabel) {
        setModerationLabel(moderationLabel);
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     * 
     * @param startTimestampMillis
     *        The time in milliseconds defining the start of the timeline segment containing a continuously detected
     *        moderation label.
     */

    public void setStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     * 
     * @return The time in milliseconds defining the start of the timeline segment containing a continuously detected
     *         moderation label.
     */

    public Long getStartTimestampMillis() {
        return this.startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     * 
     * @param startTimestampMillis
     *        The time in milliseconds defining the start of the timeline segment containing a continuously detected
     *        moderation label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentModerationDetection withStartTimestampMillis(Long startTimestampMillis) {
        setStartTimestampMillis(startTimestampMillis);
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     * 
     * @param endTimestampMillis
     *        The time in milliseconds defining the end of the timeline segment containing a continuously detected
     *        moderation label.
     */

    public void setEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     * 
     * @return The time in milliseconds defining the end of the timeline segment containing a continuously detected
     *         moderation label.
     */

    public Long getEndTimestampMillis() {
        return this.endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment containing a continuously detected moderation
     * label.
     * </p>
     * 
     * @param endTimestampMillis
     *        The time in milliseconds defining the end of the timeline segment containing a continuously detected
     *        moderation label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentModerationDetection withEndTimestampMillis(Long endTimestampMillis) {
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

    public ContentModerationDetection withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * 
     * @return A list of predicted results for the type of content an image contains. For example, the image content
     *         might be from animation, sports, or a video game.
     */

    public java.util.List<ContentType> getContentTypes() {
        return contentTypes;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * 
     * @param contentTypes
     *        A list of predicted results for the type of content an image contains. For example, the image content
     *        might be from animation, sports, or a video game.
     */

    public void setContentTypes(java.util.Collection<ContentType> contentTypes) {
        if (contentTypes == null) {
            this.contentTypes = null;
            return;
        }

        this.contentTypes = new java.util.ArrayList<ContentType>(contentTypes);
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentTypes(java.util.Collection)} or {@link #withContentTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contentTypes
     *        A list of predicted results for the type of content an image contains. For example, the image content
     *        might be from animation, sports, or a video game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentModerationDetection withContentTypes(ContentType... contentTypes) {
        if (this.contentTypes == null) {
            setContentTypes(new java.util.ArrayList<ContentType>(contentTypes.length));
        }
        for (ContentType ele : contentTypes) {
            this.contentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * 
     * @param contentTypes
     *        A list of predicted results for the type of content an image contains. For example, the image content
     *        might be from animation, sports, or a video game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentModerationDetection withContentTypes(java.util.Collection<ContentType> contentTypes) {
        setContentTypes(contentTypes);
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
        if (getModerationLabel() != null)
            sb.append("ModerationLabel: ").append(getModerationLabel()).append(",");
        if (getStartTimestampMillis() != null)
            sb.append("StartTimestampMillis: ").append(getStartTimestampMillis()).append(",");
        if (getEndTimestampMillis() != null)
            sb.append("EndTimestampMillis: ").append(getEndTimestampMillis()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getContentTypes() != null)
            sb.append("ContentTypes: ").append(getContentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentModerationDetection == false)
            return false;
        ContentModerationDetection other = (ContentModerationDetection) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getModerationLabel() == null ^ this.getModerationLabel() == null)
            return false;
        if (other.getModerationLabel() != null && other.getModerationLabel().equals(this.getModerationLabel()) == false)
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
        if (other.getContentTypes() == null ^ this.getContentTypes() == null)
            return false;
        if (other.getContentTypes() != null && other.getContentTypes().equals(this.getContentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModerationLabel() == null) ? 0 : getModerationLabel().hashCode());
        hashCode = prime * hashCode + ((getStartTimestampMillis() == null) ? 0 : getStartTimestampMillis().hashCode());
        hashCode = prime * hashCode + ((getEndTimestampMillis() == null) ? 0 : getEndTimestampMillis().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getContentTypes() == null) ? 0 : getContentTypes().hashCode());
        return hashCode;
    }

    @Override
    public ContentModerationDetection clone() {
        try {
            return (ContentModerationDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ContentModerationDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
