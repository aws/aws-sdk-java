/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The channel's output properties.
     * </p>
     */
    private java.util.List<RequestOutputItem> outputs;
    /**
     * <p>
     * The type of playback mode for this channel. The only supported value is LOOP.
     * </p>
     */
    private String playbackMode;
    /**
     * <p>
     * The tags to assign to the channel.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @return The identifier for the channel you are working on.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @return The channel's output properties.
     */

    public java.util.List<RequestOutputItem> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     */

    public void setOutputs(java.util.Collection<RequestOutputItem> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<RequestOutputItem>(outputs);
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withOutputs(RequestOutputItem... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<RequestOutputItem>(outputs.length));
        }
        for (RequestOutputItem ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withOutputs(java.util.Collection<RequestOutputItem> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The type of playback mode for this channel. The only supported value is LOOP.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode for this channel. The only supported value is LOOP.
     * @see PlaybackMode
     */

    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * The type of playback mode for this channel. The only supported value is LOOP.
     * </p>
     * 
     * @return The type of playback mode for this channel. The only supported value is LOOP.
     * @see PlaybackMode
     */

    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * <p>
     * The type of playback mode for this channel. The only supported value is LOOP.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode for this channel. The only supported value is LOOP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaybackMode
     */

    public CreateChannelRequest withPlaybackMode(String playbackMode) {
        setPlaybackMode(playbackMode);
        return this;
    }

    /**
     * <p>
     * The type of playback mode for this channel. The only supported value is LOOP.
     * </p>
     * 
     * @param playbackMode
     *        The type of playback mode for this channel. The only supported value is LOOP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaybackMode
     */

    public CreateChannelRequest withPlaybackMode(PlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
        return this;
    }

    /**
     * <p>
     * The tags to assign to the channel.
     * </p>
     * 
     * @return The tags to assign to the channel.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the channel.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the channel.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the channel.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateChannelRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest addTagsEntry(String key, String value) {
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

    public CreateChannelRequest clearTagsEntries() {
        this.tags = null;
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getPlaybackMode() != null)
            sb.append("PlaybackMode: ").append(getPlaybackMode()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getPlaybackMode() == null ^ this.getPlaybackMode() == null)
            return false;
        if (other.getPlaybackMode() != null && other.getPlaybackMode().equals(this.getPlaybackMode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getPlaybackMode() == null) ? 0 : getPlaybackMode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
