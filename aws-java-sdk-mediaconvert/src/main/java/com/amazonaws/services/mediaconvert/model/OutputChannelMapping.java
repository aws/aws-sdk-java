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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * OutputChannel mapping settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/OutputChannelMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputChannelMapping implements Serializable, Cloneable, StructuredPojo {

    /** Use this setting to specify your remix values when they are integers, such as -10, 0, or 4. */
    private java.util.List<Integer> inputChannels;
    /**
     * Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08, or 4.9.
     * MediaConvert rounds your remixing values to the nearest thousandth.
     */
    private java.util.List<Double> inputChannelsFineTune;

    /**
     * Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     * 
     * @return Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     */

    public java.util.List<Integer> getInputChannels() {
        return inputChannels;
    }

    /**
     * Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     * 
     * @param inputChannels
     *        Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     */

    public void setInputChannels(java.util.Collection<Integer> inputChannels) {
        if (inputChannels == null) {
            this.inputChannels = null;
            return;
        }

        this.inputChannels = new java.util.ArrayList<Integer>(inputChannels);
    }

    /**
     * Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputChannels(java.util.Collection)} or {@link #withInputChannels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputChannels
     *        Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputChannelMapping withInputChannels(Integer... inputChannels) {
        if (this.inputChannels == null) {
            setInputChannels(new java.util.ArrayList<Integer>(inputChannels.length));
        }
        for (Integer ele : inputChannels) {
            this.inputChannels.add(ele);
        }
        return this;
    }

    /**
     * Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     * 
     * @param inputChannels
     *        Use this setting to specify your remix values when they are integers, such as -10, 0, or 4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputChannelMapping withInputChannels(java.util.Collection<Integer> inputChannels) {
        setInputChannels(inputChannels);
        return this;
    }

    /**
     * Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08, or 4.9.
     * MediaConvert rounds your remixing values to the nearest thousandth.
     * 
     * @return Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08,
     *         or 4.9. MediaConvert rounds your remixing values to the nearest thousandth.
     */

    public java.util.List<Double> getInputChannelsFineTune() {
        return inputChannelsFineTune;
    }

    /**
     * Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08, or 4.9.
     * MediaConvert rounds your remixing values to the nearest thousandth.
     * 
     * @param inputChannelsFineTune
     *        Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08,
     *        or 4.9. MediaConvert rounds your remixing values to the nearest thousandth.
     */

    public void setInputChannelsFineTune(java.util.Collection<Double> inputChannelsFineTune) {
        if (inputChannelsFineTune == null) {
            this.inputChannelsFineTune = null;
            return;
        }

        this.inputChannelsFineTune = new java.util.ArrayList<Double>(inputChannelsFineTune);
    }

    /**
     * Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08, or 4.9.
     * MediaConvert rounds your remixing values to the nearest thousandth.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputChannelsFineTune(java.util.Collection)} or
     * {@link #withInputChannelsFineTune(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inputChannelsFineTune
     *        Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08,
     *        or 4.9. MediaConvert rounds your remixing values to the nearest thousandth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputChannelMapping withInputChannelsFineTune(Double... inputChannelsFineTune) {
        if (this.inputChannelsFineTune == null) {
            setInputChannelsFineTune(new java.util.ArrayList<Double>(inputChannelsFineTune.length));
        }
        for (Double ele : inputChannelsFineTune) {
            this.inputChannelsFineTune.add(ele);
        }
        return this;
    }

    /**
     * Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08, or 4.9.
     * MediaConvert rounds your remixing values to the nearest thousandth.
     * 
     * @param inputChannelsFineTune
     *        Use this setting to specify your remix values when they have a decimal component, such as -10.312, 0.08,
     *        or 4.9. MediaConvert rounds your remixing values to the nearest thousandth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputChannelMapping withInputChannelsFineTune(java.util.Collection<Double> inputChannelsFineTune) {
        setInputChannelsFineTune(inputChannelsFineTune);
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
        if (getInputChannels() != null)
            sb.append("InputChannels: ").append(getInputChannels()).append(",");
        if (getInputChannelsFineTune() != null)
            sb.append("InputChannelsFineTune: ").append(getInputChannelsFineTune());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputChannelMapping == false)
            return false;
        OutputChannelMapping other = (OutputChannelMapping) obj;
        if (other.getInputChannels() == null ^ this.getInputChannels() == null)
            return false;
        if (other.getInputChannels() != null && other.getInputChannels().equals(this.getInputChannels()) == false)
            return false;
        if (other.getInputChannelsFineTune() == null ^ this.getInputChannelsFineTune() == null)
            return false;
        if (other.getInputChannelsFineTune() != null && other.getInputChannelsFineTune().equals(this.getInputChannelsFineTune()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputChannels() == null) ? 0 : getInputChannels().hashCode());
        hashCode = prime * hashCode + ((getInputChannelsFineTune() == null) ? 0 : getInputChannelsFineTune().hashCode());
        return hashCode;
    }

    @Override
    public OutputChannelMapping clone() {
        try {
            return (OutputChannelMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.OutputChannelMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
