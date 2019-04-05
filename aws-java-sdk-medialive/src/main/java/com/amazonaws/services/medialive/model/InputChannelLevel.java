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
 * Input Channel Level
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputChannelLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputChannelLevel implements Serializable, Cloneable, StructuredPojo {

    /** Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB. */
    private Integer gain;
    /** The index of the input channel used as a source. */
    private Integer inputChannel;

    /**
     * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
     * 
     * @param gain
     *        Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
     */

    public void setGain(Integer gain) {
        this.gain = gain;
    }

    /**
     * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
     * 
     * @return Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
     */

    public Integer getGain() {
        return this.gain;
    }

    /**
     * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
     * 
     * @param gain
     *        Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputChannelLevel withGain(Integer gain) {
        setGain(gain);
        return this;
    }

    /**
     * The index of the input channel used as a source.
     * 
     * @param inputChannel
     *        The index of the input channel used as a source.
     */

    public void setInputChannel(Integer inputChannel) {
        this.inputChannel = inputChannel;
    }

    /**
     * The index of the input channel used as a source.
     * 
     * @return The index of the input channel used as a source.
     */

    public Integer getInputChannel() {
        return this.inputChannel;
    }

    /**
     * The index of the input channel used as a source.
     * 
     * @param inputChannel
     *        The index of the input channel used as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputChannelLevel withInputChannel(Integer inputChannel) {
        setInputChannel(inputChannel);
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
        if (getGain() != null)
            sb.append("Gain: ").append(getGain()).append(",");
        if (getInputChannel() != null)
            sb.append("InputChannel: ").append(getInputChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputChannelLevel == false)
            return false;
        InputChannelLevel other = (InputChannelLevel) obj;
        if (other.getGain() == null ^ this.getGain() == null)
            return false;
        if (other.getGain() != null && other.getGain().equals(this.getGain()) == false)
            return false;
        if (other.getInputChannel() == null ^ this.getInputChannel() == null)
            return false;
        if (other.getInputChannel() != null && other.getInputChannel().equals(this.getInputChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGain() == null) ? 0 : getGain().hashCode());
        hashCode = prime * hashCode + ((getInputChannel() == null) ? 0 : getInputChannel().hashCode());
        return hashCode;
    }

    @Override
    public InputChannelLevel clone() {
        try {
            return (InputChannelLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputChannelLevelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
