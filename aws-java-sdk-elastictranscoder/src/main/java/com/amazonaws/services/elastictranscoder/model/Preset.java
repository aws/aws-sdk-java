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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Presets are templates that contain most of the settings for transcoding media files from one format to another.
 * Elastic Transcoder includes some default presets for common formats, for example, several iPod and iPhone versions.
 * You can also create your own presets for formats that aren't included among the default presets. You specify which
 * preset you want to use when you create a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Preset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the preset.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the preset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the preset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     * <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>, <code>mxf</code>,
     * <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     * </p>
     */
    private String container;
    /**
     * <p>
     * A section of the response body that provides information about the audio preset values.
     * </p>
     */
    private AudioParameters audio;
    /**
     * <p>
     * A section of the response body that provides information about the video preset values.
     * </p>
     */
    private VideoParameters video;
    /**
     * <p>
     * A section of the response body that provides information about the thumbnail preset values, if any.
     * </p>
     */
    private Thumbnails thumbnails;
    /**
     * <p>
     * Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset that you
     * have defined (<code>Custom</code>).
     * </p>
     */
    private String type;

    /**
     * <p>
     * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     * </p>
     * 
     * @param id
     *        Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     * </p>
     * 
     * @return Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     * </p>
     * 
     * @param id
     *        Identifier for the new preset. You use this value to get settings for the preset or to delete it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the preset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the preset.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the preset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the preset.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the preset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the preset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the preset.
     * </p>
     * 
     * @param name
     *        The name of the preset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the preset.
     * </p>
     * 
     * @return The name of the preset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the preset.
     * </p>
     * 
     * @param name
     *        The name of the preset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the preset.
     * </p>
     * 
     * @param description
     *        A description of the preset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the preset.
     * </p>
     * 
     * @return A description of the preset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the preset.
     * </p>
     * 
     * @param description
     *        A description of the preset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     * <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>, <code>mxf</code>,
     * <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     * </p>
     * 
     * @param container
     *        The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     *        <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>,
     *        <code>mxf</code>, <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     */

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * <p>
     * The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     * <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>, <code>mxf</code>,
     * <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     * </p>
     * 
     * @return The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     *         <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>,
     *         <code>mxf</code>, <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     */

    public String getContainer() {
        return this.container;
    }

    /**
     * <p>
     * The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     * <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>, <code>mxf</code>,
     * <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     * </p>
     * 
     * @param container
     *        The container type for the output file. Valid values include <code>flac</code>, <code>flv</code>,
     *        <code>fmp4</code>, <code>gif</code>, <code>mp3</code>, <code>mp4</code>, <code>mpg</code>,
     *        <code>mxf</code>, <code>oga</code>, <code>ogg</code>, <code>ts</code>, and <code>webm</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withContainer(String container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * A section of the response body that provides information about the audio preset values.
     * </p>
     * 
     * @param audio
     *        A section of the response body that provides information about the audio preset values.
     */

    public void setAudio(AudioParameters audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * A section of the response body that provides information about the audio preset values.
     * </p>
     * 
     * @return A section of the response body that provides information about the audio preset values.
     */

    public AudioParameters getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * A section of the response body that provides information about the audio preset values.
     * </p>
     * 
     * @param audio
     *        A section of the response body that provides information about the audio preset values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withAudio(AudioParameters audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * A section of the response body that provides information about the video preset values.
     * </p>
     * 
     * @param video
     *        A section of the response body that provides information about the video preset values.
     */

    public void setVideo(VideoParameters video) {
        this.video = video;
    }

    /**
     * <p>
     * A section of the response body that provides information about the video preset values.
     * </p>
     * 
     * @return A section of the response body that provides information about the video preset values.
     */

    public VideoParameters getVideo() {
        return this.video;
    }

    /**
     * <p>
     * A section of the response body that provides information about the video preset values.
     * </p>
     * 
     * @param video
     *        A section of the response body that provides information about the video preset values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withVideo(VideoParameters video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * A section of the response body that provides information about the thumbnail preset values, if any.
     * </p>
     * 
     * @param thumbnails
     *        A section of the response body that provides information about the thumbnail preset values, if any.
     */

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    /**
     * <p>
     * A section of the response body that provides information about the thumbnail preset values, if any.
     * </p>
     * 
     * @return A section of the response body that provides information about the thumbnail preset values, if any.
     */

    public Thumbnails getThumbnails() {
        return this.thumbnails;
    }

    /**
     * <p>
     * A section of the response body that provides information about the thumbnail preset values, if any.
     * </p>
     * 
     * @param thumbnails
     *        A section of the response body that provides information about the thumbnail preset values, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withThumbnails(Thumbnails thumbnails) {
        setThumbnails(thumbnails);
        return this;
    }

    /**
     * <p>
     * Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset that you
     * have defined (<code>Custom</code>).
     * </p>
     * 
     * @param type
     *        Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset
     *        that you have defined (<code>Custom</code>).
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset that you
     * have defined (<code>Custom</code>).
     * </p>
     * 
     * @return Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset
     *         that you have defined (<code>Custom</code>).
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset that you
     * have defined (<code>Custom</code>).
     * </p>
     * 
     * @param type
     *        Whether the preset is a default preset provided by Elastic Transcoder (<code>System</code>) or a preset
     *        that you have defined (<code>Custom</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Preset withType(String type) {
        setType(type);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getAudio() != null)
            sb.append("Audio: ").append(getAudio()).append(",");
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getThumbnails() != null)
            sb.append("Thumbnails: ").append(getThumbnails()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Preset == false)
            return false;
        Preset other = (Preset) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getThumbnails() == null ^ this.getThumbnails() == null)
            return false;
        if (other.getThumbnails() != null && other.getThumbnails().equals(this.getThumbnails()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getThumbnails() == null) ? 0 : getThumbnails().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Preset clone() {
        try {
            return (Preset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.PresetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
