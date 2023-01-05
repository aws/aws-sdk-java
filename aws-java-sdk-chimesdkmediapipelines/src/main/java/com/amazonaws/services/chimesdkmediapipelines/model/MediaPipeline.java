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
 * A pipeline consisting of a media capture, media concatenation, or live-streaming pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaPipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A pipeline that enables users to capture audio and video.
     * </p>
     */
    private MediaCapturePipeline mediaCapturePipeline;
    /**
     * <p>
     * The connector pipeline of the media pipeline.
     * </p>
     */
    private MediaLiveConnectorPipeline mediaLiveConnectorPipeline;
    /**
     * <p>
     * The media concatenation pipeline in a media pipeline.
     * </p>
     */
    private MediaConcatenationPipeline mediaConcatenationPipeline;

    /**
     * <p>
     * A pipeline that enables users to capture audio and video.
     * </p>
     * 
     * @param mediaCapturePipeline
     *        A pipeline that enables users to capture audio and video.
     */

    public void setMediaCapturePipeline(MediaCapturePipeline mediaCapturePipeline) {
        this.mediaCapturePipeline = mediaCapturePipeline;
    }

    /**
     * <p>
     * A pipeline that enables users to capture audio and video.
     * </p>
     * 
     * @return A pipeline that enables users to capture audio and video.
     */

    public MediaCapturePipeline getMediaCapturePipeline() {
        return this.mediaCapturePipeline;
    }

    /**
     * <p>
     * A pipeline that enables users to capture audio and video.
     * </p>
     * 
     * @param mediaCapturePipeline
     *        A pipeline that enables users to capture audio and video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaPipeline withMediaCapturePipeline(MediaCapturePipeline mediaCapturePipeline) {
        setMediaCapturePipeline(mediaCapturePipeline);
        return this;
    }

    /**
     * <p>
     * The connector pipeline of the media pipeline.
     * </p>
     * 
     * @param mediaLiveConnectorPipeline
     *        The connector pipeline of the media pipeline.
     */

    public void setMediaLiveConnectorPipeline(MediaLiveConnectorPipeline mediaLiveConnectorPipeline) {
        this.mediaLiveConnectorPipeline = mediaLiveConnectorPipeline;
    }

    /**
     * <p>
     * The connector pipeline of the media pipeline.
     * </p>
     * 
     * @return The connector pipeline of the media pipeline.
     */

    public MediaLiveConnectorPipeline getMediaLiveConnectorPipeline() {
        return this.mediaLiveConnectorPipeline;
    }

    /**
     * <p>
     * The connector pipeline of the media pipeline.
     * </p>
     * 
     * @param mediaLiveConnectorPipeline
     *        The connector pipeline of the media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaPipeline withMediaLiveConnectorPipeline(MediaLiveConnectorPipeline mediaLiveConnectorPipeline) {
        setMediaLiveConnectorPipeline(mediaLiveConnectorPipeline);
        return this;
    }

    /**
     * <p>
     * The media concatenation pipeline in a media pipeline.
     * </p>
     * 
     * @param mediaConcatenationPipeline
     *        The media concatenation pipeline in a media pipeline.
     */

    public void setMediaConcatenationPipeline(MediaConcatenationPipeline mediaConcatenationPipeline) {
        this.mediaConcatenationPipeline = mediaConcatenationPipeline;
    }

    /**
     * <p>
     * The media concatenation pipeline in a media pipeline.
     * </p>
     * 
     * @return The media concatenation pipeline in a media pipeline.
     */

    public MediaConcatenationPipeline getMediaConcatenationPipeline() {
        return this.mediaConcatenationPipeline;
    }

    /**
     * <p>
     * The media concatenation pipeline in a media pipeline.
     * </p>
     * 
     * @param mediaConcatenationPipeline
     *        The media concatenation pipeline in a media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaPipeline withMediaConcatenationPipeline(MediaConcatenationPipeline mediaConcatenationPipeline) {
        setMediaConcatenationPipeline(mediaConcatenationPipeline);
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
        if (getMediaCapturePipeline() != null)
            sb.append("MediaCapturePipeline: ").append(getMediaCapturePipeline()).append(",");
        if (getMediaLiveConnectorPipeline() != null)
            sb.append("MediaLiveConnectorPipeline: ").append(getMediaLiveConnectorPipeline()).append(",");
        if (getMediaConcatenationPipeline() != null)
            sb.append("MediaConcatenationPipeline: ").append(getMediaConcatenationPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaPipeline == false)
            return false;
        MediaPipeline other = (MediaPipeline) obj;
        if (other.getMediaCapturePipeline() == null ^ this.getMediaCapturePipeline() == null)
            return false;
        if (other.getMediaCapturePipeline() != null && other.getMediaCapturePipeline().equals(this.getMediaCapturePipeline()) == false)
            return false;
        if (other.getMediaLiveConnectorPipeline() == null ^ this.getMediaLiveConnectorPipeline() == null)
            return false;
        if (other.getMediaLiveConnectorPipeline() != null && other.getMediaLiveConnectorPipeline().equals(this.getMediaLiveConnectorPipeline()) == false)
            return false;
        if (other.getMediaConcatenationPipeline() == null ^ this.getMediaConcatenationPipeline() == null)
            return false;
        if (other.getMediaConcatenationPipeline() != null && other.getMediaConcatenationPipeline().equals(this.getMediaConcatenationPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaCapturePipeline() == null) ? 0 : getMediaCapturePipeline().hashCode());
        hashCode = prime * hashCode + ((getMediaLiveConnectorPipeline() == null) ? 0 : getMediaLiveConnectorPipeline().hashCode());
        hashCode = prime * hashCode + ((getMediaConcatenationPipeline() == null) ? 0 : getMediaConcatenationPipeline().hashCode());
        return hashCode;
    }

    @Override
    public MediaPipeline clone() {
        try {
            return (MediaPipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaPipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
