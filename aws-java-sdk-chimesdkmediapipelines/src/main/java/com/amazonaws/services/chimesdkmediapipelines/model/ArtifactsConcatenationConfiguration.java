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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the artifacts concatenation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ArtifactsConcatenationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactsConcatenationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the audio artifacts concatenation.
     * </p>
     */
    private AudioConcatenationConfiguration audio;
    /**
     * <p>
     * The configuration for the video artifacts concatenation.
     * </p>
     */
    private VideoConcatenationConfiguration video;
    /**
     * <p>
     * The configuration for the content artifacts concatenation.
     * </p>
     */
    private ContentConcatenationConfiguration content;
    /**
     * <p>
     * The configuration for the data channel artifacts concatenation.
     * </p>
     */
    private DataChannelConcatenationConfiguration dataChannel;
    /**
     * <p>
     * The configuration for the transcription messages artifacts concatenation.
     * </p>
     */
    private TranscriptionMessagesConcatenationConfiguration transcriptionMessages;
    /**
     * <p>
     * The configuration for the meeting events artifacts concatenation.
     * </p>
     */
    private MeetingEventsConcatenationConfiguration meetingEvents;
    /**
     * <p>
     * The configuration for the composited video artifacts concatenation.
     * </p>
     */
    private CompositedVideoConcatenationConfiguration compositedVideo;

    /**
     * <p>
     * The configuration for the audio artifacts concatenation.
     * </p>
     * 
     * @param audio
     *        The configuration for the audio artifacts concatenation.
     */

    public void setAudio(AudioConcatenationConfiguration audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * The configuration for the audio artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the audio artifacts concatenation.
     */

    public AudioConcatenationConfiguration getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * The configuration for the audio artifacts concatenation.
     * </p>
     * 
     * @param audio
     *        The configuration for the audio artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withAudio(AudioConcatenationConfiguration audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * The configuration for the video artifacts concatenation.
     * </p>
     * 
     * @param video
     *        The configuration for the video artifacts concatenation.
     */

    public void setVideo(VideoConcatenationConfiguration video) {
        this.video = video;
    }

    /**
     * <p>
     * The configuration for the video artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the video artifacts concatenation.
     */

    public VideoConcatenationConfiguration getVideo() {
        return this.video;
    }

    /**
     * <p>
     * The configuration for the video artifacts concatenation.
     * </p>
     * 
     * @param video
     *        The configuration for the video artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withVideo(VideoConcatenationConfiguration video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * The configuration for the content artifacts concatenation.
     * </p>
     * 
     * @param content
     *        The configuration for the content artifacts concatenation.
     */

    public void setContent(ContentConcatenationConfiguration content) {
        this.content = content;
    }

    /**
     * <p>
     * The configuration for the content artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the content artifacts concatenation.
     */

    public ContentConcatenationConfiguration getContent() {
        return this.content;
    }

    /**
     * <p>
     * The configuration for the content artifacts concatenation.
     * </p>
     * 
     * @param content
     *        The configuration for the content artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withContent(ContentConcatenationConfiguration content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The configuration for the data channel artifacts concatenation.
     * </p>
     * 
     * @param dataChannel
     *        The configuration for the data channel artifacts concatenation.
     */

    public void setDataChannel(DataChannelConcatenationConfiguration dataChannel) {
        this.dataChannel = dataChannel;
    }

    /**
     * <p>
     * The configuration for the data channel artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the data channel artifacts concatenation.
     */

    public DataChannelConcatenationConfiguration getDataChannel() {
        return this.dataChannel;
    }

    /**
     * <p>
     * The configuration for the data channel artifacts concatenation.
     * </p>
     * 
     * @param dataChannel
     *        The configuration for the data channel artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withDataChannel(DataChannelConcatenationConfiguration dataChannel) {
        setDataChannel(dataChannel);
        return this;
    }

    /**
     * <p>
     * The configuration for the transcription messages artifacts concatenation.
     * </p>
     * 
     * @param transcriptionMessages
     *        The configuration for the transcription messages artifacts concatenation.
     */

    public void setTranscriptionMessages(TranscriptionMessagesConcatenationConfiguration transcriptionMessages) {
        this.transcriptionMessages = transcriptionMessages;
    }

    /**
     * <p>
     * The configuration for the transcription messages artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the transcription messages artifacts concatenation.
     */

    public TranscriptionMessagesConcatenationConfiguration getTranscriptionMessages() {
        return this.transcriptionMessages;
    }

    /**
     * <p>
     * The configuration for the transcription messages artifacts concatenation.
     * </p>
     * 
     * @param transcriptionMessages
     *        The configuration for the transcription messages artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withTranscriptionMessages(TranscriptionMessagesConcatenationConfiguration transcriptionMessages) {
        setTranscriptionMessages(transcriptionMessages);
        return this;
    }

    /**
     * <p>
     * The configuration for the meeting events artifacts concatenation.
     * </p>
     * 
     * @param meetingEvents
     *        The configuration for the meeting events artifacts concatenation.
     */

    public void setMeetingEvents(MeetingEventsConcatenationConfiguration meetingEvents) {
        this.meetingEvents = meetingEvents;
    }

    /**
     * <p>
     * The configuration for the meeting events artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the meeting events artifacts concatenation.
     */

    public MeetingEventsConcatenationConfiguration getMeetingEvents() {
        return this.meetingEvents;
    }

    /**
     * <p>
     * The configuration for the meeting events artifacts concatenation.
     * </p>
     * 
     * @param meetingEvents
     *        The configuration for the meeting events artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withMeetingEvents(MeetingEventsConcatenationConfiguration meetingEvents) {
        setMeetingEvents(meetingEvents);
        return this;
    }

    /**
     * <p>
     * The configuration for the composited video artifacts concatenation.
     * </p>
     * 
     * @param compositedVideo
     *        The configuration for the composited video artifacts concatenation.
     */

    public void setCompositedVideo(CompositedVideoConcatenationConfiguration compositedVideo) {
        this.compositedVideo = compositedVideo;
    }

    /**
     * <p>
     * The configuration for the composited video artifacts concatenation.
     * </p>
     * 
     * @return The configuration for the composited video artifacts concatenation.
     */

    public CompositedVideoConcatenationConfiguration getCompositedVideo() {
        return this.compositedVideo;
    }

    /**
     * <p>
     * The configuration for the composited video artifacts concatenation.
     * </p>
     * 
     * @param compositedVideo
     *        The configuration for the composited video artifacts concatenation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConcatenationConfiguration withCompositedVideo(CompositedVideoConcatenationConfiguration compositedVideo) {
        setCompositedVideo(compositedVideo);
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
        if (getDataChannel() != null)
            sb.append("DataChannel: ").append(getDataChannel()).append(",");
        if (getTranscriptionMessages() != null)
            sb.append("TranscriptionMessages: ").append(getTranscriptionMessages()).append(",");
        if (getMeetingEvents() != null)
            sb.append("MeetingEvents: ").append(getMeetingEvents()).append(",");
        if (getCompositedVideo() != null)
            sb.append("CompositedVideo: ").append(getCompositedVideo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactsConcatenationConfiguration == false)
            return false;
        ArtifactsConcatenationConfiguration other = (ArtifactsConcatenationConfiguration) obj;
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
        if (other.getDataChannel() == null ^ this.getDataChannel() == null)
            return false;
        if (other.getDataChannel() != null && other.getDataChannel().equals(this.getDataChannel()) == false)
            return false;
        if (other.getTranscriptionMessages() == null ^ this.getTranscriptionMessages() == null)
            return false;
        if (other.getTranscriptionMessages() != null && other.getTranscriptionMessages().equals(this.getTranscriptionMessages()) == false)
            return false;
        if (other.getMeetingEvents() == null ^ this.getMeetingEvents() == null)
            return false;
        if (other.getMeetingEvents() != null && other.getMeetingEvents().equals(this.getMeetingEvents()) == false)
            return false;
        if (other.getCompositedVideo() == null ^ this.getCompositedVideo() == null)
            return false;
        if (other.getCompositedVideo() != null && other.getCompositedVideo().equals(this.getCompositedVideo()) == false)
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
        hashCode = prime * hashCode + ((getDataChannel() == null) ? 0 : getDataChannel().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionMessages() == null) ? 0 : getTranscriptionMessages().hashCode());
        hashCode = prime * hashCode + ((getMeetingEvents() == null) ? 0 : getMeetingEvents().hashCode());
        hashCode = prime * hashCode + ((getCompositedVideo() == null) ? 0 : getCompositedVideo().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactsConcatenationConfiguration clone() {
        try {
            return (ArtifactsConcatenationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.ArtifactsConcatenationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
