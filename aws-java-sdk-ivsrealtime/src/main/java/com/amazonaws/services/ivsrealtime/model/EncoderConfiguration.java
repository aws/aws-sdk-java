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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for transcoding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/EncoderConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncoderConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the EncoderConfiguration resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Optional name to identify the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     * </p>
     */
    private Video video;

    /**
     * <p>
     * ARN of the EncoderConfiguration resource.
     * </p>
     * 
     * @param arn
     *        ARN of the EncoderConfiguration resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the EncoderConfiguration resource.
     * </p>
     * 
     * @return ARN of the EncoderConfiguration resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the EncoderConfiguration resource.
     * </p>
     * 
     * @param arn
     *        ARN of the EncoderConfiguration resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Optional name to identify the resource.
     * </p>
     * 
     * @param name
     *        Optional name to identify the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Optional name to identify the resource.
     * </p>
     * 
     * @return Optional name to identify the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Optional name to identify the resource.
     * </p>
     * 
     * @param name
     *        Optional name to identify the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @return Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *         See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>
     *         for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     *         IVS has no constraints on tags beyond what is documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderConfiguration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EncoderConfiguration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EncoderConfiguration addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderConfiguration clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     * </p>
     * 
     * @param video
     *        Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     */

    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * <p>
     * Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     * </p>
     * 
     * @return Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     */

    public Video getVideo() {
        return this.video;
    }

    /**
     * <p>
     * Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     * </p>
     * 
     * @param video
     *        Video configuration. Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderConfiguration withVideo(Video video) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof EncoderConfiguration == false)
            return false;
        EncoderConfiguration other = (EncoderConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        return hashCode;
    }

    @Override
    public EncoderConfiguration clone() {
        try {
            return (EncoderConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.EncoderConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
