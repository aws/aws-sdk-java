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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Configurable settings for the input device.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDeviceConfigurableSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceConfigurableSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The input source that you want to use. If the device has a source connected to only one of its input ports, or if
     * you don't care which source the device sends, specify Auto. If the device has sources connected to both its input
     * ports, and you want to use a specific source, specify the source.
     */
    private String configuredInput;
    /** The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video. */
    private Integer maxBitrate;

    /**
     * The input source that you want to use. If the device has a source connected to only one of its input ports, or if
     * you don't care which source the device sends, specify Auto. If the device has sources connected to both its input
     * ports, and you want to use a specific source, specify the source.
     * 
     * @param configuredInput
     *        The input source that you want to use. If the device has a source connected to only one of its input
     *        ports, or if you don't care which source the device sends, specify Auto. If the device has sources
     *        connected to both its input ports, and you want to use a specific source, specify the source.
     * @see InputDeviceConfiguredInput
     */

    public void setConfiguredInput(String configuredInput) {
        this.configuredInput = configuredInput;
    }

    /**
     * The input source that you want to use. If the device has a source connected to only one of its input ports, or if
     * you don't care which source the device sends, specify Auto. If the device has sources connected to both its input
     * ports, and you want to use a specific source, specify the source.
     * 
     * @return The input source that you want to use. If the device has a source connected to only one of its input
     *         ports, or if you don't care which source the device sends, specify Auto. If the device has sources
     *         connected to both its input ports, and you want to use a specific source, specify the source.
     * @see InputDeviceConfiguredInput
     */

    public String getConfiguredInput() {
        return this.configuredInput;
    }

    /**
     * The input source that you want to use. If the device has a source connected to only one of its input ports, or if
     * you don't care which source the device sends, specify Auto. If the device has sources connected to both its input
     * ports, and you want to use a specific source, specify the source.
     * 
     * @param configuredInput
     *        The input source that you want to use. If the device has a source connected to only one of its input
     *        ports, or if you don't care which source the device sends, specify Auto. If the device has sources
     *        connected to both its input ports, and you want to use a specific source, specify the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceConfiguredInput
     */

    public InputDeviceConfigurableSettings withConfiguredInput(String configuredInput) {
        setConfiguredInput(configuredInput);
        return this;
    }

    /**
     * The input source that you want to use. If the device has a source connected to only one of its input ports, or if
     * you don't care which source the device sends, specify Auto. If the device has sources connected to both its input
     * ports, and you want to use a specific source, specify the source.
     * 
     * @param configuredInput
     *        The input source that you want to use. If the device has a source connected to only one of its input
     *        ports, or if you don't care which source the device sends, specify Auto. If the device has sources
     *        connected to both its input ports, and you want to use a specific source, specify the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceConfiguredInput
     */

    public InputDeviceConfigurableSettings withConfiguredInput(InputDeviceConfiguredInput configuredInput) {
        this.configuredInput = configuredInput.toString();
        return this;
    }

    /**
     * The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
     * 
     * @param maxBitrate
     *        The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
     * 
     * @return The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
     * 
     * @param maxBitrate
     *        The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceConfigurableSettings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
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
        if (getConfiguredInput() != null)
            sb.append("ConfiguredInput: ").append(getConfiguredInput()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceConfigurableSettings == false)
            return false;
        InputDeviceConfigurableSettings other = (InputDeviceConfigurableSettings) obj;
        if (other.getConfiguredInput() == null ^ this.getConfiguredInput() == null)
            return false;
        if (other.getConfiguredInput() != null && other.getConfiguredInput().equals(this.getConfiguredInput()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredInput() == null) ? 0 : getConfiguredInput().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        return hashCode;
    }

    @Override
    public InputDeviceConfigurableSettings clone() {
        try {
            return (InputDeviceConfigurableSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDeviceConfigurableSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
