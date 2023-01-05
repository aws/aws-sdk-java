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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying the ingest configuration set up by the broadcaster, usually in an encoder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/IngestConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Encoder settings for audio.
     * </p>
     */
    private AudioConfiguration audio;
    /**
     * <p>
     * Encoder settings for video.
     * </p>
     */
    private VideoConfiguration video;

    /**
     * <p>
     * Encoder settings for audio.
     * </p>
     * 
     * @param audio
     *        Encoder settings for audio.
     */

    public void setAudio(AudioConfiguration audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * Encoder settings for audio.
     * </p>
     * 
     * @return Encoder settings for audio.
     */

    public AudioConfiguration getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * Encoder settings for audio.
     * </p>
     * 
     * @param audio
     *        Encoder settings for audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestConfiguration withAudio(AudioConfiguration audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * Encoder settings for video.
     * </p>
     * 
     * @param video
     *        Encoder settings for video.
     */

    public void setVideo(VideoConfiguration video) {
        this.video = video;
    }

    /**
     * <p>
     * Encoder settings for video.
     * </p>
     * 
     * @return Encoder settings for video.
     */

    public VideoConfiguration getVideo() {
        return this.video;
    }

    /**
     * <p>
     * Encoder settings for video.
     * </p>
     * 
     * @param video
     *        Encoder settings for video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestConfiguration withVideo(VideoConfiguration video) {
        setVideo(video);
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
            sb.append("Video: ").append(getVideo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestConfiguration == false)
            return false;
        IngestConfiguration other = (IngestConfiguration) obj;
        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        return hashCode;
    }

    @Override
    public IngestConfiguration clone() {
        try {
            return (IngestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.IngestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
