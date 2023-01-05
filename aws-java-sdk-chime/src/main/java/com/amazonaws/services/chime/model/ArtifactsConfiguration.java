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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the artifacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ArtifactsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the audio artifacts.
     * </p>
     */
    private AudioArtifactsConfiguration audio;
    /**
     * <p>
     * The configuration for the video artifacts.
     * </p>
     */
    private VideoArtifactsConfiguration video;
    /**
     * <p>
     * The configuration for the content artifacts.
     * </p>
     */
    private ContentArtifactsConfiguration content;

    /**
     * <p>
     * The configuration for the audio artifacts.
     * </p>
     * 
     * @param audio
     *        The configuration for the audio artifacts.
     */

    public void setAudio(AudioArtifactsConfiguration audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * The configuration for the audio artifacts.
     * </p>
     * 
     * @return The configuration for the audio artifacts.
     */

    public AudioArtifactsConfiguration getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * The configuration for the audio artifacts.
     * </p>
     * 
     * @param audio
     *        The configuration for the audio artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConfiguration withAudio(AudioArtifactsConfiguration audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * The configuration for the video artifacts.
     * </p>
     * 
     * @param video
     *        The configuration for the video artifacts.
     */

    public void setVideo(VideoArtifactsConfiguration video) {
        this.video = video;
    }

    /**
     * <p>
     * The configuration for the video artifacts.
     * </p>
     * 
     * @return The configuration for the video artifacts.
     */

    public VideoArtifactsConfiguration getVideo() {
        return this.video;
    }

    /**
     * <p>
     * The configuration for the video artifacts.
     * </p>
     * 
     * @param video
     *        The configuration for the video artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConfiguration withVideo(VideoArtifactsConfiguration video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * The configuration for the content artifacts.
     * </p>
     * 
     * @param content
     *        The configuration for the content artifacts.
     */

    public void setContent(ContentArtifactsConfiguration content) {
        this.content = content;
    }

    /**
     * <p>
     * The configuration for the content artifacts.
     * </p>
     * 
     * @return The configuration for the content artifacts.
     */

    public ContentArtifactsConfiguration getContent() {
        return this.content;
    }

    /**
     * <p>
     * The configuration for the content artifacts.
     * </p>
     * 
     * @param content
     *        The configuration for the content artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactsConfiguration withContent(ContentArtifactsConfiguration content) {
        setContent(content);
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
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactsConfiguration == false)
            return false;
        ArtifactsConfiguration other = (ArtifactsConfiguration) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactsConfiguration clone() {
        try {
            return (ArtifactsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ArtifactsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
