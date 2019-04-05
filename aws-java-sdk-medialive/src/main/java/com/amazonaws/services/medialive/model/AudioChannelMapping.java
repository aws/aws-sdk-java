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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Audio Channel Mapping
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioChannelMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioChannelMapping implements Serializable, Cloneable, StructuredPojo {

    /** Indices and gain values for each input channel that should be remixed into this output channel. */
    private java.util.List<InputChannelLevel> inputChannelLevels;
    /** The index of the output channel being produced. */
    private Integer outputChannel;

    /**
     * Indices and gain values for each input channel that should be remixed into this output channel.
     * 
     * @return Indices and gain values for each input channel that should be remixed into this output channel.
     */

    public java.util.List<InputChannelLevel> getInputChannelLevels() {
        return inputChannelLevels;
    }

    /**
     * Indices and gain values for each input channel that should be remixed into this output channel.
     * 
     * @param inputChannelLevels
     *        Indices and gain values for each input channel that should be remixed into this output channel.
     */

    public void setInputChannelLevels(java.util.Collection<InputChannelLevel> inputChannelLevels) {
        if (inputChannelLevels == null) {
            this.inputChannelLevels = null;
            return;
        }

        this.inputChannelLevels = new java.util.ArrayList<InputChannelLevel>(inputChannelLevels);
    }

    /**
     * Indices and gain values for each input channel that should be remixed into this output channel.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputChannelLevels(java.util.Collection)} or {@link #withInputChannelLevels(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputChannelLevels
     *        Indices and gain values for each input channel that should be remixed into this output channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioChannelMapping withInputChannelLevels(InputChannelLevel... inputChannelLevels) {
        if (this.inputChannelLevels == null) {
            setInputChannelLevels(new java.util.ArrayList<InputChannelLevel>(inputChannelLevels.length));
        }
        for (InputChannelLevel ele : inputChannelLevels) {
            this.inputChannelLevels.add(ele);
        }
        return this;
    }

    /**
     * Indices and gain values for each input channel that should be remixed into this output channel.
     * 
     * @param inputChannelLevels
     *        Indices and gain values for each input channel that should be remixed into this output channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioChannelMapping withInputChannelLevels(java.util.Collection<InputChannelLevel> inputChannelLevels) {
        setInputChannelLevels(inputChannelLevels);
        return this;
    }

    /**
     * The index of the output channel being produced.
     * 
     * @param outputChannel
     *        The index of the output channel being produced.
     */

    public void setOutputChannel(Integer outputChannel) {
        this.outputChannel = outputChannel;
    }

    /**
     * The index of the output channel being produced.
     * 
     * @return The index of the output channel being produced.
     */

    public Integer getOutputChannel() {
        return this.outputChannel;
    }

    /**
     * The index of the output channel being produced.
     * 
     * @param outputChannel
     *        The index of the output channel being produced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioChannelMapping withOutputChannel(Integer outputChannel) {
        setOutputChannel(outputChannel);
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
        if (getInputChannelLevels() != null)
            sb.append("InputChannelLevels: ").append(getInputChannelLevels()).append(",");
        if (getOutputChannel() != null)
            sb.append("OutputChannel: ").append(getOutputChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioChannelMapping == false)
            return false;
        AudioChannelMapping other = (AudioChannelMapping) obj;
        if (other.getInputChannelLevels() == null ^ this.getInputChannelLevels() == null)
            return false;
        if (other.getInputChannelLevels() != null && other.getInputChannelLevels().equals(this.getInputChannelLevels()) == false)
            return false;
        if (other.getOutputChannel() == null ^ this.getOutputChannel() == null)
            return false;
        if (other.getOutputChannel() != null && other.getOutputChannel().equals(this.getOutputChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputChannelLevels() == null) ? 0 : getInputChannelLevels().hashCode());
        hashCode = prime * hashCode + ((getOutputChannel() == null) ? 0 : getOutputChannel().hashCode());
        return hashCode;
    }

    @Override
    public AudioChannelMapping clone() {
        try {
            return (AudioChannelMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioChannelMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
