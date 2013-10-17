/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createPreset(CreatePresetRequest) CreatePreset operation}.
 * <p>
 * The CreatePreset operation creates a preset with settings that you specify.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and to determine whether
 * they comply with H.264 standards. If your settings are not valid for Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response
 * (ValidationException) and does not create the preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264
 * standard, Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine whether your settings comply
 * with the H.264 standard while giving you greater flexibility with respect to the video that Elastic Transcoder produces.
 * </p>
 * <p>
 * Elastic Transcoder uses the H.264 video-compression format. For more information, see the International Telecommunication Union publication
 * <i>Recommendation ITU-T H.264: Advanced video coding for generic audiovisual services</i> .
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#createPreset(CreatePresetRequest)
 */
public class CreatePresetRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the preset. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String name;

    /**
     * A description of the preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String description;

    /**
     * The container type for the output file. Valid values include
     * <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     * and <code>webm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^ogg$)<br/>
     */
    private String container;

    /**
     * A section of the request body that specifies the video parameters.
     */
    private VideoParameters video;

    /**
     * A section of the request body that specifies the audio parameters.
     */
    private AudioParameters audio;

    /**
     * A section of the request body that specifies the thumbnail parameters,
     * if any.
     */
    private Thumbnails thumbnails;

    /**
     * The name of the preset. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return The name of the preset. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the preset. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the preset. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the preset. We recommend that the name be unique within
     * the AWS account, but uniqueness is not enforced.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the preset. We recommend that the name be unique within
     *         the AWS account, but uniqueness is not enforced.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A description of the preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return A description of the preset.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param description A description of the preset.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the preset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param description A description of the preset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The container type for the output file. Valid values include
     * <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     * and <code>webm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^ogg$)<br/>
     *
     * @return The container type for the output file. Valid values include
     *         <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     *         and <code>webm</code>.
     */
    public String getContainer() {
        return container;
    }
    
    /**
     * The container type for the output file. Valid values include
     * <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     * and <code>webm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^ogg$)<br/>
     *
     * @param container The container type for the output file. Valid values include
     *         <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     *         and <code>webm</code>.
     */
    public void setContainer(String container) {
        this.container = container;
    }
    
    /**
     * The container type for the output file. Valid values include
     * <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     * and <code>webm</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^ogg$)<br/>
     *
     * @param container The container type for the output file. Valid values include
     *         <code>mp3</code>, <code>mp4</code>, <code>ogg</code>, <code>ts</code>,
     *         and <code>webm</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetRequest withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * A section of the request body that specifies the video parameters.
     *
     * @return A section of the request body that specifies the video parameters.
     */
    public VideoParameters getVideo() {
        return video;
    }
    
    /**
     * A section of the request body that specifies the video parameters.
     *
     * @param video A section of the request body that specifies the video parameters.
     */
    public void setVideo(VideoParameters video) {
        this.video = video;
    }
    
    /**
     * A section of the request body that specifies the video parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param video A section of the request body that specifies the video parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetRequest withVideo(VideoParameters video) {
        this.video = video;
        return this;
    }

    /**
     * A section of the request body that specifies the audio parameters.
     *
     * @return A section of the request body that specifies the audio parameters.
     */
    public AudioParameters getAudio() {
        return audio;
    }
    
    /**
     * A section of the request body that specifies the audio parameters.
     *
     * @param audio A section of the request body that specifies the audio parameters.
     */
    public void setAudio(AudioParameters audio) {
        this.audio = audio;
    }
    
    /**
     * A section of the request body that specifies the audio parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param audio A section of the request body that specifies the audio parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetRequest withAudio(AudioParameters audio) {
        this.audio = audio;
        return this;
    }

    /**
     * A section of the request body that specifies the thumbnail parameters,
     * if any.
     *
     * @return A section of the request body that specifies the thumbnail parameters,
     *         if any.
     */
    public Thumbnails getThumbnails() {
        return thumbnails;
    }
    
    /**
     * A section of the request body that specifies the thumbnail parameters,
     * if any.
     *
     * @param thumbnails A section of the request body that specifies the thumbnail parameters,
     *         if any.
     */
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }
    
    /**
     * A section of the request body that specifies the thumbnail parameters,
     * if any.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbnails A section of the request body that specifies the thumbnail parameters,
     *         if any.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetRequest withThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getContainer() != null) sb.append("Container: " + getContainer() + ",");
        if (getVideo() != null) sb.append("Video: " + getVideo() + ",");
        if (getAudio() != null) sb.append("Audio: " + getAudio() + ",");
        if (getThumbnails() != null) sb.append("Thumbnails: " + getThumbnails() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePresetRequest == false) return false;
        CreatePresetRequest other = (CreatePresetRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getContainer() == null ^ this.getContainer() == null) return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false) return false; 
        if (other.getVideo() == null ^ this.getVideo() == null) return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false) return false; 
        if (other.getAudio() == null ^ this.getAudio() == null) return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false) return false; 
        if (other.getThumbnails() == null ^ this.getThumbnails() == null) return false;
        if (other.getThumbnails() != null && other.getThumbnails().equals(this.getThumbnails()) == false) return false; 
        return true;
    }
    
}
    