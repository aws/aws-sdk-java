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


/**
 * <p>
 * Presets are templates that contain most of the settings for transcoding media files from one format to another. Elastic Transcoder includes some
 * default presets for common formats, for example, several iPod and iPhone versions. You can also create your own presets for formats that aren't
 * included among the default presets. You specify which preset you want to use when you create a job.
 * </p>
 */
public class Preset implements Serializable {

    /**
     * Identifier for the new preset. You use this value to get settings for
     * the preset or to delete it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

    /**
     * The name of the preset.
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
     * A section of the response body that provides information about the
     * audio preset values.
     */
    private AudioParameters audio;

    /**
     * A section of the response body that provides information about the
     * video preset values.
     */
    private VideoParameters video;

    /**
     * A section of the response body that provides information about the
     * thumbnail preset values, if any.
     */
    private Thumbnails thumbnails;

    /**
     * Whether the preset is a default preset provided by Elastic Transcoder
     * (<code>System</code>) or a preset that you have defined
     * (<code>Custom</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^System$)|(^Custom$)<br/>
     */
    private String type;

    /**
     * Identifier for the new preset. You use this value to get settings for
     * the preset or to delete it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return Identifier for the new preset. You use this value to get settings for
     *         the preset or to delete it.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Identifier for the new preset. You use this value to get settings for
     * the preset or to delete it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id Identifier for the new preset. You use this value to get settings for
     *         the preset or to delete it.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Identifier for the new preset. You use this value to get settings for
     * the preset or to delete it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id Identifier for the new preset. You use this value to get settings for
     *         the preset or to delete it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Preset withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return The name of the preset.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the preset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the preset.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the preset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param name The name of the preset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Preset withName(String name) {
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
    public Preset withDescription(String description) {
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
    public Preset withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * A section of the response body that provides information about the
     * audio preset values.
     *
     * @return A section of the response body that provides information about the
     *         audio preset values.
     */
    public AudioParameters getAudio() {
        return audio;
    }
    
    /**
     * A section of the response body that provides information about the
     * audio preset values.
     *
     * @param audio A section of the response body that provides information about the
     *         audio preset values.
     */
    public void setAudio(AudioParameters audio) {
        this.audio = audio;
    }
    
    /**
     * A section of the response body that provides information about the
     * audio preset values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param audio A section of the response body that provides information about the
     *         audio preset values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Preset withAudio(AudioParameters audio) {
        this.audio = audio;
        return this;
    }

    /**
     * A section of the response body that provides information about the
     * video preset values.
     *
     * @return A section of the response body that provides information about the
     *         video preset values.
     */
    public VideoParameters getVideo() {
        return video;
    }
    
    /**
     * A section of the response body that provides information about the
     * video preset values.
     *
     * @param video A section of the response body that provides information about the
     *         video preset values.
     */
    public void setVideo(VideoParameters video) {
        this.video = video;
    }
    
    /**
     * A section of the response body that provides information about the
     * video preset values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param video A section of the response body that provides information about the
     *         video preset values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Preset withVideo(VideoParameters video) {
        this.video = video;
        return this;
    }

    /**
     * A section of the response body that provides information about the
     * thumbnail preset values, if any.
     *
     * @return A section of the response body that provides information about the
     *         thumbnail preset values, if any.
     */
    public Thumbnails getThumbnails() {
        return thumbnails;
    }
    
    /**
     * A section of the response body that provides information about the
     * thumbnail preset values, if any.
     *
     * @param thumbnails A section of the response body that provides information about the
     *         thumbnail preset values, if any.
     */
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }
    
    /**
     * A section of the response body that provides information about the
     * thumbnail preset values, if any.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbnails A section of the response body that provides information about the
     *         thumbnail preset values, if any.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Preset withThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
        return this;
    }

    /**
     * Whether the preset is a default preset provided by Elastic Transcoder
     * (<code>System</code>) or a preset that you have defined
     * (<code>Custom</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^System$)|(^Custom$)<br/>
     *
     * @return Whether the preset is a default preset provided by Elastic Transcoder
     *         (<code>System</code>) or a preset that you have defined
     *         (<code>Custom</code>).
     */
    public String getType() {
        return type;
    }
    
    /**
     * Whether the preset is a default preset provided by Elastic Transcoder
     * (<code>System</code>) or a preset that you have defined
     * (<code>Custom</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^System$)|(^Custom$)<br/>
     *
     * @param type Whether the preset is a default preset provided by Elastic Transcoder
     *         (<code>System</code>) or a preset that you have defined
     *         (<code>Custom</code>).
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Whether the preset is a default preset provided by Elastic Transcoder
     * (<code>System</code>) or a preset that you have defined
     * (<code>Custom</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^System$)|(^Custom$)<br/>
     *
     * @param type Whether the preset is a default preset provided by Elastic Transcoder
     *         (<code>System</code>) or a preset that you have defined
     *         (<code>Custom</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Preset withType(String type) {
        this.type = type;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getContainer() != null) sb.append("Container: " + getContainer() + ",");
        if (getAudio() != null) sb.append("Audio: " + getAudio() + ",");
        if (getVideo() != null) sb.append("Video: " + getVideo() + ",");
        if (getThumbnails() != null) sb.append("Thumbnails: " + getThumbnails() + ",");
        if (getType() != null) sb.append("Type: " + getType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Preset == false) return false;
        Preset other = (Preset)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getContainer() == null ^ this.getContainer() == null) return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false) return false; 
        if (other.getAudio() == null ^ this.getAudio() == null) return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false) return false; 
        if (other.getVideo() == null ^ this.getVideo() == null) return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false) return false; 
        if (other.getThumbnails() == null ^ this.getThumbnails() == null) return false;
        if (other.getThumbnails() != null && other.getThumbnails().equals(this.getThumbnails()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        return true;
    }
    
}
    