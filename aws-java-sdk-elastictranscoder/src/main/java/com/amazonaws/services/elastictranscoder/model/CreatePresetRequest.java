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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>CreatePresetRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
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
     * A section of the request body that specifies the video parameters.
     * </p>
     */
    private VideoParameters video;
    /**
     * <p>
     * A section of the request body that specifies the audio parameters.
     * </p>
     */
    private AudioParameters audio;
    /**
     * <p>
     * A section of the request body that specifies the thumbnail parameters, if any.
     * </p>
     */
    private Thumbnails thumbnails;

    /**
     * <p>
     * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * 
     * @param name
     *        The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not
     *        enforced.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * 
     * @return The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is
     *         not enforced.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not
     * enforced.
     * </p>
     * 
     * @param name
     *        The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not
     *        enforced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withName(String name) {
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

    public CreatePresetRequest withDescription(String description) {
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

    public CreatePresetRequest withContainer(String container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * A section of the request body that specifies the video parameters.
     * </p>
     * 
     * @param video
     *        A section of the request body that specifies the video parameters.
     */

    public void setVideo(VideoParameters video) {
        this.video = video;
    }

    /**
     * <p>
     * A section of the request body that specifies the video parameters.
     * </p>
     * 
     * @return A section of the request body that specifies the video parameters.
     */

    public VideoParameters getVideo() {
        return this.video;
    }

    /**
     * <p>
     * A section of the request body that specifies the video parameters.
     * </p>
     * 
     * @param video
     *        A section of the request body that specifies the video parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withVideo(VideoParameters video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * A section of the request body that specifies the audio parameters.
     * </p>
     * 
     * @param audio
     *        A section of the request body that specifies the audio parameters.
     */

    public void setAudio(AudioParameters audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * A section of the request body that specifies the audio parameters.
     * </p>
     * 
     * @return A section of the request body that specifies the audio parameters.
     */

    public AudioParameters getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * A section of the request body that specifies the audio parameters.
     * </p>
     * 
     * @param audio
     *        A section of the request body that specifies the audio parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withAudio(AudioParameters audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * A section of the request body that specifies the thumbnail parameters, if any.
     * </p>
     * 
     * @param thumbnails
     *        A section of the request body that specifies the thumbnail parameters, if any.
     */

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    /**
     * <p>
     * A section of the request body that specifies the thumbnail parameters, if any.
     * </p>
     * 
     * @return A section of the request body that specifies the thumbnail parameters, if any.
     */

    public Thumbnails getThumbnails() {
        return this.thumbnails;
    }

    /**
     * <p>
     * A section of the request body that specifies the thumbnail parameters, if any.
     * </p>
     * 
     * @param thumbnails
     *        A section of the request body that specifies the thumbnail parameters, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withThumbnails(Thumbnails thumbnails) {
        setThumbnails(thumbnails);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getAudio() != null)
            sb.append("Audio: ").append(getAudio()).append(",");
        if (getThumbnails() != null)
            sb.append("Thumbnails: ").append(getThumbnails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresetRequest == false)
            return false;
        CreatePresetRequest other = (CreatePresetRequest) obj;
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
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        if (other.getThumbnails() == null ^ this.getThumbnails() == null)
            return false;
        if (other.getThumbnails() != null && other.getThumbnails().equals(this.getThumbnails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        hashCode = prime * hashCode + ((getThumbnails() == null) ? 0 : getThumbnails().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresetRequest clone() {
        return (CreatePresetRequest) super.clone();
    }

}
