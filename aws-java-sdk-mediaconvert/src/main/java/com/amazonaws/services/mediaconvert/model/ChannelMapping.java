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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units
 * are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel
 * unchanged to the output channel (no attenuation or amplification).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ChannelMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMapping implements Serializable, Cloneable, StructuredPojo {

    /** List of output channels */
    private java.util.List<OutputChannelMapping> outputChannels;

    /**
     * List of output channels
     * 
     * @return List of output channels
     */

    public java.util.List<OutputChannelMapping> getOutputChannels() {
        return outputChannels;
    }

    /**
     * List of output channels
     * 
     * @param outputChannels
     *        List of output channels
     */

    public void setOutputChannels(java.util.Collection<OutputChannelMapping> outputChannels) {
        if (outputChannels == null) {
            this.outputChannels = null;
            return;
        }

        this.outputChannels = new java.util.ArrayList<OutputChannelMapping>(outputChannels);
    }

    /**
     * List of output channels
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputChannels(java.util.Collection)} or {@link #withOutputChannels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputChannels
     *        List of output channels
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMapping withOutputChannels(OutputChannelMapping... outputChannels) {
        if (this.outputChannels == null) {
            setOutputChannels(new java.util.ArrayList<OutputChannelMapping>(outputChannels.length));
        }
        for (OutputChannelMapping ele : outputChannels) {
            this.outputChannels.add(ele);
        }
        return this;
    }

    /**
     * List of output channels
     * 
     * @param outputChannels
     *        List of output channels
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMapping withOutputChannels(java.util.Collection<OutputChannelMapping> outputChannels) {
        setOutputChannels(outputChannels);
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
        if (getOutputChannels() != null)
            sb.append("OutputChannels: ").append(getOutputChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMapping == false)
            return false;
        ChannelMapping other = (ChannelMapping) obj;
        if (other.getOutputChannels() == null ^ this.getOutputChannels() == null)
            return false;
        if (other.getOutputChannels() != null && other.getOutputChannels().equals(this.getOutputChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputChannels() == null) ? 0 : getOutputChannels().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMapping clone() {
        try {
            return (ChannelMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ChannelMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
