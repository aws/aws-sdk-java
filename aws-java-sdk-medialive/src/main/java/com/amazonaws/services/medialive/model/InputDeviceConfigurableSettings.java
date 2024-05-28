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
    /** The Link device's buffer size (latency) in milliseconds (ms). */
    private Integer latencyMs;
    /** Choose the codec for the video that the device produces. Only UHD devices can specify this parameter. */
    private String codec;
    /**
     * To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter {} for
     * the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     */
    private InputDeviceMediaConnectConfigurableSettings mediaconnectSettings;
    /**
     * An array of eight audio configurations, one for each audio pair in the source. Set up each audio configuration
     * either to exclude the pair, or to format it and include it in the output from the device. This parameter applies
     * only to UHD devices, and only when the device is configured as the source for a MediaConnect flow. For an HD
     * device, you configure the audio by setting up audio selectors in the channel configuration.
     */
    private java.util.List<InputDeviceConfigurableAudioChannelPairConfig> audioChannelPairs;

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
     * The Link device's buffer size (latency) in milliseconds (ms).
     * 
     * @param latencyMs
     *        The Link device's buffer size (latency) in milliseconds (ms).
     */

    public void setLatencyMs(Integer latencyMs) {
        this.latencyMs = latencyMs;
    }

    /**
     * The Link device's buffer size (latency) in milliseconds (ms).
     * 
     * @return The Link device's buffer size (latency) in milliseconds (ms).
     */

    public Integer getLatencyMs() {
        return this.latencyMs;
    }

    /**
     * The Link device's buffer size (latency) in milliseconds (ms).
     * 
     * @param latencyMs
     *        The Link device's buffer size (latency) in milliseconds (ms).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceConfigurableSettings withLatencyMs(Integer latencyMs) {
        setLatencyMs(latencyMs);
        return this;
    }

    /**
     * Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * 
     * @param codec
     *        Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * @see InputDeviceCodec
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * 
     * @return Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * @see InputDeviceCodec
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * 
     * @param codec
     *        Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceCodec
     */

    public InputDeviceConfigurableSettings withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * 
     * @param codec
     *        Choose the codec for the video that the device produces. Only UHD devices can specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceCodec
     */

    public InputDeviceConfigurableSettings withCodec(InputDeviceCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter {} for
     * the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     * 
     * @param mediaconnectSettings
     *        To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter
     *        {} for the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     */

    public void setMediaconnectSettings(InputDeviceMediaConnectConfigurableSettings mediaconnectSettings) {
        this.mediaconnectSettings = mediaconnectSettings;
    }

    /**
     * To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter {} for
     * the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     * 
     * @return To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter
     *         {} for the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     */

    public InputDeviceMediaConnectConfigurableSettings getMediaconnectSettings() {
        return this.mediaconnectSettings;
    }

    /**
     * To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter {} for
     * the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     * 
     * @param mediaconnectSettings
     *        To attach this device to a MediaConnect flow, specify these parameters. To detach an existing flow, enter
     *        {} for the value of mediaconnectSettings. Only UHD devices can specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceConfigurableSettings withMediaconnectSettings(InputDeviceMediaConnectConfigurableSettings mediaconnectSettings) {
        setMediaconnectSettings(mediaconnectSettings);
        return this;
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Set up each audio configuration
     * either to exclude the pair, or to format it and include it in the output from the device. This parameter applies
     * only to UHD devices, and only when the device is configured as the source for a MediaConnect flow. For an HD
     * device, you configure the audio by setting up audio selectors in the channel configuration.
     * 
     * @return An array of eight audio configurations, one for each audio pair in the source. Set up each audio
     *         configuration either to exclude the pair, or to format it and include it in the output from the device.
     *         This parameter applies only to UHD devices, and only when the device is configured as the source for a
     *         MediaConnect flow. For an HD device, you configure the audio by setting up audio selectors in the channel
     *         configuration.
     */

    public java.util.List<InputDeviceConfigurableAudioChannelPairConfig> getAudioChannelPairs() {
        return audioChannelPairs;
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Set up each audio configuration
     * either to exclude the pair, or to format it and include it in the output from the device. This parameter applies
     * only to UHD devices, and only when the device is configured as the source for a MediaConnect flow. For an HD
     * device, you configure the audio by setting up audio selectors in the channel configuration.
     * 
     * @param audioChannelPairs
     *        An array of eight audio configurations, one for each audio pair in the source. Set up each audio
     *        configuration either to exclude the pair, or to format it and include it in the output from the device.
     *        This parameter applies only to UHD devices, and only when the device is configured as the source for a
     *        MediaConnect flow. For an HD device, you configure the audio by setting up audio selectors in the channel
     *        configuration.
     */

    public void setAudioChannelPairs(java.util.Collection<InputDeviceConfigurableAudioChannelPairConfig> audioChannelPairs) {
        if (audioChannelPairs == null) {
            this.audioChannelPairs = null;
            return;
        }

        this.audioChannelPairs = new java.util.ArrayList<InputDeviceConfigurableAudioChannelPairConfig>(audioChannelPairs);
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Set up each audio configuration
     * either to exclude the pair, or to format it and include it in the output from the device. This parameter applies
     * only to UHD devices, and only when the device is configured as the source for a MediaConnect flow. For an HD
     * device, you configure the audio by setting up audio selectors in the channel configuration.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioChannelPairs(java.util.Collection)} or {@link #withAudioChannelPairs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param audioChannelPairs
     *        An array of eight audio configurations, one for each audio pair in the source. Set up each audio
     *        configuration either to exclude the pair, or to format it and include it in the output from the device.
     *        This parameter applies only to UHD devices, and only when the device is configured as the source for a
     *        MediaConnect flow. For an HD device, you configure the audio by setting up audio selectors in the channel
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceConfigurableSettings withAudioChannelPairs(InputDeviceConfigurableAudioChannelPairConfig... audioChannelPairs) {
        if (this.audioChannelPairs == null) {
            setAudioChannelPairs(new java.util.ArrayList<InputDeviceConfigurableAudioChannelPairConfig>(audioChannelPairs.length));
        }
        for (InputDeviceConfigurableAudioChannelPairConfig ele : audioChannelPairs) {
            this.audioChannelPairs.add(ele);
        }
        return this;
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Set up each audio configuration
     * either to exclude the pair, or to format it and include it in the output from the device. This parameter applies
     * only to UHD devices, and only when the device is configured as the source for a MediaConnect flow. For an HD
     * device, you configure the audio by setting up audio selectors in the channel configuration.
     * 
     * @param audioChannelPairs
     *        An array of eight audio configurations, one for each audio pair in the source. Set up each audio
     *        configuration either to exclude the pair, or to format it and include it in the output from the device.
     *        This parameter applies only to UHD devices, and only when the device is configured as the source for a
     *        MediaConnect flow. For an HD device, you configure the audio by setting up audio selectors in the channel
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceConfigurableSettings withAudioChannelPairs(java.util.Collection<InputDeviceConfigurableAudioChannelPairConfig> audioChannelPairs) {
        setAudioChannelPairs(audioChannelPairs);
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
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getLatencyMs() != null)
            sb.append("LatencyMs: ").append(getLatencyMs()).append(",");
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getMediaconnectSettings() != null)
            sb.append("MediaconnectSettings: ").append(getMediaconnectSettings()).append(",");
        if (getAudioChannelPairs() != null)
            sb.append("AudioChannelPairs: ").append(getAudioChannelPairs());
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
        if (other.getLatencyMs() == null ^ this.getLatencyMs() == null)
            return false;
        if (other.getLatencyMs() != null && other.getLatencyMs().equals(this.getLatencyMs()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMediaconnectSettings() == null ^ this.getMediaconnectSettings() == null)
            return false;
        if (other.getMediaconnectSettings() != null && other.getMediaconnectSettings().equals(this.getMediaconnectSettings()) == false)
            return false;
        if (other.getAudioChannelPairs() == null ^ this.getAudioChannelPairs() == null)
            return false;
        if (other.getAudioChannelPairs() != null && other.getAudioChannelPairs().equals(this.getAudioChannelPairs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredInput() == null) ? 0 : getConfiguredInput().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getLatencyMs() == null) ? 0 : getLatencyMs().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getMediaconnectSettings() == null) ? 0 : getMediaconnectSettings().hashCode());
        hashCode = prime * hashCode + ((getAudioChannelPairs() == null) ? 0 : getAudioChannelPairs().hashCode());
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
