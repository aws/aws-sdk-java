/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateSignalingChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSignalingChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique for each account and region.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     * supported channel type.
     * </p>
     */
    private String channelType;
    /**
     * <p>
     * A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     */
    private SingleMasterConfiguration singleMasterConfiguration;
    /**
     * <p>
     * A set of tags (key/value pairs) that you want to associate with this channel.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique for each account and region.
     * </p>
     * 
     * @param channelName
     *        A name for the signaling channel that you are creating. It must be unique for each account and region.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique for each account and region.
     * </p>
     * 
     * @return A name for the signaling channel that you are creating. It must be unique for each account and region.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique for each account and region.
     * </p>
     * 
     * @param channelName
     *        A name for the signaling channel that you are creating. It must be unique for each account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalingChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     * supported channel type.
     * </p>
     * 
     * @param channelType
     *        A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     *        supported channel type.
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     * supported channel type.
     * </p>
     * 
     * @return A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     *         supported channel type.
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     * supported channel type.
     * </p>
     * 
     * @param channelType
     *        A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     *        supported channel type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public CreateSignalingChannelRequest withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     * supported channel type.
     * </p>
     * 
     * @param channelType
     *        A type of the signaling channel that you are creating. Currently, <code>SINGLE_MASTER</code> is the only
     *        supported channel type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public CreateSignalingChannelRequest withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @param singleMasterConfiguration
     *        A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     */

    public void setSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @return A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     */

    public SingleMasterConfiguration getSingleMasterConfiguration() {
        return this.singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @param singleMasterConfiguration
     *        A structure containing the configuration for the <code>SINGLE_MASTER</code> channel type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalingChannelRequest withSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        setSingleMasterConfiguration(singleMasterConfiguration);
        return this;
    }

    /**
     * <p>
     * A set of tags (key/value pairs) that you want to associate with this channel.
     * </p>
     * 
     * @return A set of tags (key/value pairs) that you want to associate with this channel.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key/value pairs) that you want to associate with this channel.
     * </p>
     * 
     * @param tags
     *        A set of tags (key/value pairs) that you want to associate with this channel.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A set of tags (key/value pairs) that you want to associate with this channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A set of tags (key/value pairs) that you want to associate with this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalingChannelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of tags (key/value pairs) that you want to associate with this channel.
     * </p>
     * 
     * @param tags
     *        A set of tags (key/value pairs) that you want to associate with this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalingChannelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
        if (getSingleMasterConfiguration() != null)
            sb.append("SingleMasterConfiguration: ").append(getSingleMasterConfiguration()).append(",");
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

        if (obj instanceof CreateSignalingChannelRequest == false)
            return false;
        CreateSignalingChannelRequest other = (CreateSignalingChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getSingleMasterConfiguration() == null ^ this.getSingleMasterConfiguration() == null)
            return false;
        if (other.getSingleMasterConfiguration() != null && other.getSingleMasterConfiguration().equals(this.getSingleMasterConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getSingleMasterConfiguration() == null) ? 0 : getSingleMasterConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSignalingChannelRequest clone() {
        return (CreateSignalingChannelRequest) super.clone();
    }

}
