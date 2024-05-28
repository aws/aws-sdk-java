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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration settings of the features available to a meeting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/MeetingFeaturesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeetingFeaturesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     */
    private AudioFeatures audio;
    /**
     * <p>
     * The configuration settings for the video features available to a meeting.
     * </p>
     */
    private VideoFeatures video;
    /**
     * <p>
     * The configuration settings for the content features available to a meeting.
     * </p>
     */
    private ContentFeatures content;
    /**
     * <p>
     * The configuration settings for the attendee features available to a meeting.
     * </p>
     */
    private AttendeeFeatures attendee;

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * 
     * @param audio
     *        The configuration settings for the audio features available to a meeting.
     */

    public void setAudio(AudioFeatures audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * 
     * @return The configuration settings for the audio features available to a meeting.
     */

    public AudioFeatures getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * 
     * @param audio
     *        The configuration settings for the audio features available to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingFeaturesConfiguration withAudio(AudioFeatures audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the video features available to a meeting.
     * </p>
     * 
     * @param video
     *        The configuration settings for the video features available to a meeting.
     */

    public void setVideo(VideoFeatures video) {
        this.video = video;
    }

    /**
     * <p>
     * The configuration settings for the video features available to a meeting.
     * </p>
     * 
     * @return The configuration settings for the video features available to a meeting.
     */

    public VideoFeatures getVideo() {
        return this.video;
    }

    /**
     * <p>
     * The configuration settings for the video features available to a meeting.
     * </p>
     * 
     * @param video
     *        The configuration settings for the video features available to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingFeaturesConfiguration withVideo(VideoFeatures video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the content features available to a meeting.
     * </p>
     * 
     * @param content
     *        The configuration settings for the content features available to a meeting.
     */

    public void setContent(ContentFeatures content) {
        this.content = content;
    }

    /**
     * <p>
     * The configuration settings for the content features available to a meeting.
     * </p>
     * 
     * @return The configuration settings for the content features available to a meeting.
     */

    public ContentFeatures getContent() {
        return this.content;
    }

    /**
     * <p>
     * The configuration settings for the content features available to a meeting.
     * </p>
     * 
     * @param content
     *        The configuration settings for the content features available to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingFeaturesConfiguration withContent(ContentFeatures content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the attendee features available to a meeting.
     * </p>
     * 
     * @param attendee
     *        The configuration settings for the attendee features available to a meeting.
     */

    public void setAttendee(AttendeeFeatures attendee) {
        this.attendee = attendee;
    }

    /**
     * <p>
     * The configuration settings for the attendee features available to a meeting.
     * </p>
     * 
     * @return The configuration settings for the attendee features available to a meeting.
     */

    public AttendeeFeatures getAttendee() {
        return this.attendee;
    }

    /**
     * <p>
     * The configuration settings for the attendee features available to a meeting.
     * </p>
     * 
     * @param attendee
     *        The configuration settings for the attendee features available to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingFeaturesConfiguration withAttendee(AttendeeFeatures attendee) {
        setAttendee(attendee);
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
        if (getAudio() != null)
            sb.append("Audio: ").append(getAudio()).append(",");
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getAttendee() != null)
            sb.append("Attendee: ").append(getAttendee());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingFeaturesConfiguration == false)
            return false;
        MeetingFeaturesConfiguration other = (MeetingFeaturesConfiguration) obj;
        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getAttendee() == null ^ this.getAttendee() == null)
            return false;
        if (other.getAttendee() != null && other.getAttendee().equals(this.getAttendee()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getAttendee() == null) ? 0 : getAttendee().hashCode());
        return hashCode;
    }

    @Override
    public MeetingFeaturesConfiguration clone() {
        try {
            return (MeetingFeaturesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.MeetingFeaturesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
