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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a streaming channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StreamChannelDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamChannelDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of channels in a streaming channel.
     * </p>
     */
    private Integer numberOfChannels;
    /**
     * <p>
     * The definitions of the channels in a streaming channel.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * The number of channels in a streaming channel.
     * </p>
     * 
     * @param numberOfChannels
     *        The number of channels in a streaming channel.
     */

    public void setNumberOfChannels(Integer numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    /**
     * <p>
     * The number of channels in a streaming channel.
     * </p>
     * 
     * @return The number of channels in a streaming channel.
     */

    public Integer getNumberOfChannels() {
        return this.numberOfChannels;
    }

    /**
     * <p>
     * The number of channels in a streaming channel.
     * </p>
     * 
     * @param numberOfChannels
     *        The number of channels in a streaming channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamChannelDefinition withNumberOfChannels(Integer numberOfChannels) {
        setNumberOfChannels(numberOfChannels);
        return this;
    }

    /**
     * <p>
     * The definitions of the channels in a streaming channel.
     * </p>
     * 
     * @return The definitions of the channels in a streaming channel.
     */

    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * The definitions of the channels in a streaming channel.
     * </p>
     * 
     * @param channelDefinitions
     *        The definitions of the channels in a streaming channel.
     */

    public void setChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<ChannelDefinition>(channelDefinitions);
    }

    /**
     * <p>
     * The definitions of the channels in a streaming channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelDefinitions(java.util.Collection)} or {@link #withChannelDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelDefinitions
     *        The definitions of the channels in a streaming channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamChannelDefinition withChannelDefinitions(ChannelDefinition... channelDefinitions) {
        if (this.channelDefinitions == null) {
            setChannelDefinitions(new java.util.ArrayList<ChannelDefinition>(channelDefinitions.length));
        }
        for (ChannelDefinition ele : channelDefinitions) {
            this.channelDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The definitions of the channels in a streaming channel.
     * </p>
     * 
     * @param channelDefinitions
     *        The definitions of the channels in a streaming channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamChannelDefinition withChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
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
        if (getNumberOfChannels() != null)
            sb.append("NumberOfChannels: ").append(getNumberOfChannels()).append(",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: ").append(getChannelDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamChannelDefinition == false)
            return false;
        StreamChannelDefinition other = (StreamChannelDefinition) obj;
        if (other.getNumberOfChannels() == null ^ this.getNumberOfChannels() == null)
            return false;
        if (other.getNumberOfChannels() != null && other.getNumberOfChannels().equals(this.getNumberOfChannels()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfChannels() == null) ? 0 : getNumberOfChannels().hashCode());
        hashCode = prime * hashCode + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public StreamChannelDefinition clone() {
        try {
            return (StreamChannelDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.StreamChannelDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
