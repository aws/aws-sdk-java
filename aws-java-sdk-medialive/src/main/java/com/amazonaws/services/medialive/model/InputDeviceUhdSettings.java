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
 * Settings that describe the active source from the input device, and the video characteristics of that source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDeviceUhdSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceUhdSettings implements Serializable, Cloneable, StructuredPojo {

    /** If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI). */
    private String activeInput;
    /** The source at the input device that is currently active. You can specify this source. */
    private String configuredInput;
    /** The state of the input device. */
    private String deviceState;
    /** The frame rate of the video source. */
    private Double framerate;
    /** The height of the video source, in pixels. */
    private Integer height;
    /** The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum. */
    private Integer maxBitrate;
    /** The scan type of the video source. */
    private String scanType;
    /** The width of the video source, in pixels. */
    private Integer width;
    /** The Link device's buffer size (latency) in milliseconds (ms). You can specify this value. */
    private Integer latencyMs;
    /** The codec for the video that the device produces. */
    private String codec;
    /**
     * Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     * MEDIACONNECT_FLOW.
     */
    private InputDeviceMediaConnectSettings mediaconnectSettings;
    /**
     * An array of eight audio configurations, one for each audio pair in the source. Each audio configuration specifies
     * either to exclude the pair, or to format it and include it in the output from the UHD device. Applies only when
     * the device is configured as the source for a MediaConnect flow.
     */
    private java.util.List<InputDeviceUhdAudioChannelPairConfig> audioChannelPairs;

    /**
     * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
     * 
     * @param activeInput
     *        If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or
     *        HDMI).
     * @see InputDeviceActiveInput
     */

    public void setActiveInput(String activeInput) {
        this.activeInput = activeInput;
    }

    /**
     * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
     * 
     * @return If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or
     *         HDMI).
     * @see InputDeviceActiveInput
     */

    public String getActiveInput() {
        return this.activeInput;
    }

    /**
     * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
     * 
     * @param activeInput
     *        If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or
     *        HDMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceActiveInput
     */

    public InputDeviceUhdSettings withActiveInput(String activeInput) {
        setActiveInput(activeInput);
        return this;
    }

    /**
     * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
     * 
     * @param activeInput
     *        If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or
     *        HDMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceActiveInput
     */

    public InputDeviceUhdSettings withActiveInput(InputDeviceActiveInput activeInput) {
        this.activeInput = activeInput.toString();
        return this;
    }

    /**
     * The source at the input device that is currently active. You can specify this source.
     * 
     * @param configuredInput
     *        The source at the input device that is currently active. You can specify this source.
     * @see InputDeviceConfiguredInput
     */

    public void setConfiguredInput(String configuredInput) {
        this.configuredInput = configuredInput;
    }

    /**
     * The source at the input device that is currently active. You can specify this source.
     * 
     * @return The source at the input device that is currently active. You can specify this source.
     * @see InputDeviceConfiguredInput
     */

    public String getConfiguredInput() {
        return this.configuredInput;
    }

    /**
     * The source at the input device that is currently active. You can specify this source.
     * 
     * @param configuredInput
     *        The source at the input device that is currently active. You can specify this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceConfiguredInput
     */

    public InputDeviceUhdSettings withConfiguredInput(String configuredInput) {
        setConfiguredInput(configuredInput);
        return this;
    }

    /**
     * The source at the input device that is currently active. You can specify this source.
     * 
     * @param configuredInput
     *        The source at the input device that is currently active. You can specify this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceConfiguredInput
     */

    public InputDeviceUhdSettings withConfiguredInput(InputDeviceConfiguredInput configuredInput) {
        this.configuredInput = configuredInput.toString();
        return this;
    }

    /**
     * The state of the input device.
     * 
     * @param deviceState
     *        The state of the input device.
     * @see InputDeviceState
     */

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    /**
     * The state of the input device.
     * 
     * @return The state of the input device.
     * @see InputDeviceState
     */

    public String getDeviceState() {
        return this.deviceState;
    }

    /**
     * The state of the input device.
     * 
     * @param deviceState
     *        The state of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceState
     */

    public InputDeviceUhdSettings withDeviceState(String deviceState) {
        setDeviceState(deviceState);
        return this;
    }

    /**
     * The state of the input device.
     * 
     * @param deviceState
     *        The state of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceState
     */

    public InputDeviceUhdSettings withDeviceState(InputDeviceState deviceState) {
        this.deviceState = deviceState.toString();
        return this;
    }

    /**
     * The frame rate of the video source.
     * 
     * @param framerate
     *        The frame rate of the video source.
     */

    public void setFramerate(Double framerate) {
        this.framerate = framerate;
    }

    /**
     * The frame rate of the video source.
     * 
     * @return The frame rate of the video source.
     */

    public Double getFramerate() {
        return this.framerate;
    }

    /**
     * The frame rate of the video source.
     * 
     * @param framerate
     *        The frame rate of the video source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withFramerate(Double framerate) {
        setFramerate(framerate);
        return this;
    }

    /**
     * The height of the video source, in pixels.
     * 
     * @param height
     *        The height of the video source, in pixels.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * The height of the video source, in pixels.
     * 
     * @return The height of the video source, in pixels.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * The height of the video source, in pixels.
     * 
     * @param height
     *        The height of the video source, in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
     * 
     * @param maxBitrate
     *        The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
     * 
     * @return The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
     * 
     * @param maxBitrate
     *        The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * The scan type of the video source.
     * 
     * @param scanType
     *        The scan type of the video source.
     * @see InputDeviceScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * The scan type of the video source.
     * 
     * @return The scan type of the video source.
     * @see InputDeviceScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * The scan type of the video source.
     * 
     * @param scanType
     *        The scan type of the video source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceScanType
     */

    public InputDeviceUhdSettings withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * The scan type of the video source.
     * 
     * @param scanType
     *        The scan type of the video source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceScanType
     */

    public InputDeviceUhdSettings withScanType(InputDeviceScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * The width of the video source, in pixels.
     * 
     * @param width
     *        The width of the video source, in pixels.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * The width of the video source, in pixels.
     * 
     * @return The width of the video source, in pixels.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * The width of the video source, in pixels.
     * 
     * @param width
     *        The width of the video source, in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
     * 
     * @param latencyMs
     *        The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
     */

    public void setLatencyMs(Integer latencyMs) {
        this.latencyMs = latencyMs;
    }

    /**
     * The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
     * 
     * @return The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
     */

    public Integer getLatencyMs() {
        return this.latencyMs;
    }

    /**
     * The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
     * 
     * @param latencyMs
     *        The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withLatencyMs(Integer latencyMs) {
        setLatencyMs(latencyMs);
        return this;
    }

    /**
     * The codec for the video that the device produces.
     * 
     * @param codec
     *        The codec for the video that the device produces.
     * @see InputDeviceCodec
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * The codec for the video that the device produces.
     * 
     * @return The codec for the video that the device produces.
     * @see InputDeviceCodec
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * The codec for the video that the device produces.
     * 
     * @param codec
     *        The codec for the video that the device produces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceCodec
     */

    public InputDeviceUhdSettings withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * The codec for the video that the device produces.
     * 
     * @param codec
     *        The codec for the video that the device produces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceCodec
     */

    public InputDeviceUhdSettings withCodec(InputDeviceCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     * MEDIACONNECT_FLOW.
     * 
     * @param mediaconnectSettings
     *        Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     *        MEDIACONNECT_FLOW.
     */

    public void setMediaconnectSettings(InputDeviceMediaConnectSettings mediaconnectSettings) {
        this.mediaconnectSettings = mediaconnectSettings;
    }

    /**
     * Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     * MEDIACONNECT_FLOW.
     * 
     * @return Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     *         MEDIACONNECT_FLOW.
     */

    public InputDeviceMediaConnectSettings getMediaconnectSettings() {
        return this.mediaconnectSettings;
    }

    /**
     * Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     * MEDIACONNECT_FLOW.
     * 
     * @param mediaconnectSettings
     *        Information about the MediaConnect flow attached to the device. Returned only if the outputType is
     *        MEDIACONNECT_FLOW.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withMediaconnectSettings(InputDeviceMediaConnectSettings mediaconnectSettings) {
        setMediaconnectSettings(mediaconnectSettings);
        return this;
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Each audio configuration specifies
     * either to exclude the pair, or to format it and include it in the output from the UHD device. Applies only when
     * the device is configured as the source for a MediaConnect flow.
     * 
     * @return An array of eight audio configurations, one for each audio pair in the source. Each audio configuration
     *         specifies either to exclude the pair, or to format it and include it in the output from the UHD device.
     *         Applies only when the device is configured as the source for a MediaConnect flow.
     */

    public java.util.List<InputDeviceUhdAudioChannelPairConfig> getAudioChannelPairs() {
        return audioChannelPairs;
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Each audio configuration specifies
     * either to exclude the pair, or to format it and include it in the output from the UHD device. Applies only when
     * the device is configured as the source for a MediaConnect flow.
     * 
     * @param audioChannelPairs
     *        An array of eight audio configurations, one for each audio pair in the source. Each audio configuration
     *        specifies either to exclude the pair, or to format it and include it in the output from the UHD device.
     *        Applies only when the device is configured as the source for a MediaConnect flow.
     */

    public void setAudioChannelPairs(java.util.Collection<InputDeviceUhdAudioChannelPairConfig> audioChannelPairs) {
        if (audioChannelPairs == null) {
            this.audioChannelPairs = null;
            return;
        }

        this.audioChannelPairs = new java.util.ArrayList<InputDeviceUhdAudioChannelPairConfig>(audioChannelPairs);
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Each audio configuration specifies
     * either to exclude the pair, or to format it and include it in the output from the UHD device. Applies only when
     * the device is configured as the source for a MediaConnect flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioChannelPairs(java.util.Collection)} or {@link #withAudioChannelPairs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param audioChannelPairs
     *        An array of eight audio configurations, one for each audio pair in the source. Each audio configuration
     *        specifies either to exclude the pair, or to format it and include it in the output from the UHD device.
     *        Applies only when the device is configured as the source for a MediaConnect flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withAudioChannelPairs(InputDeviceUhdAudioChannelPairConfig... audioChannelPairs) {
        if (this.audioChannelPairs == null) {
            setAudioChannelPairs(new java.util.ArrayList<InputDeviceUhdAudioChannelPairConfig>(audioChannelPairs.length));
        }
        for (InputDeviceUhdAudioChannelPairConfig ele : audioChannelPairs) {
            this.audioChannelPairs.add(ele);
        }
        return this;
    }

    /**
     * An array of eight audio configurations, one for each audio pair in the source. Each audio configuration specifies
     * either to exclude the pair, or to format it and include it in the output from the UHD device. Applies only when
     * the device is configured as the source for a MediaConnect flow.
     * 
     * @param audioChannelPairs
     *        An array of eight audio configurations, one for each audio pair in the source. Each audio configuration
     *        specifies either to exclude the pair, or to format it and include it in the output from the UHD device.
     *        Applies only when the device is configured as the source for a MediaConnect flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdSettings withAudioChannelPairs(java.util.Collection<InputDeviceUhdAudioChannelPairConfig> audioChannelPairs) {
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
        if (getActiveInput() != null)
            sb.append("ActiveInput: ").append(getActiveInput()).append(",");
        if (getConfiguredInput() != null)
            sb.append("ConfiguredInput: ").append(getConfiguredInput()).append(",");
        if (getDeviceState() != null)
            sb.append("DeviceState: ").append(getDeviceState()).append(",");
        if (getFramerate() != null)
            sb.append("Framerate: ").append(getFramerate()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
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

        if (obj instanceof InputDeviceUhdSettings == false)
            return false;
        InputDeviceUhdSettings other = (InputDeviceUhdSettings) obj;
        if (other.getActiveInput() == null ^ this.getActiveInput() == null)
            return false;
        if (other.getActiveInput() != null && other.getActiveInput().equals(this.getActiveInput()) == false)
            return false;
        if (other.getConfiguredInput() == null ^ this.getConfiguredInput() == null)
            return false;
        if (other.getConfiguredInput() != null && other.getConfiguredInput().equals(this.getConfiguredInput()) == false)
            return false;
        if (other.getDeviceState() == null ^ this.getDeviceState() == null)
            return false;
        if (other.getDeviceState() != null && other.getDeviceState().equals(this.getDeviceState()) == false)
            return false;
        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
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

        hashCode = prime * hashCode + ((getActiveInput() == null) ? 0 : getActiveInput().hashCode());
        hashCode = prime * hashCode + ((getConfiguredInput() == null) ? 0 : getConfiguredInput().hashCode());
        hashCode = prime * hashCode + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getLatencyMs() == null) ? 0 : getLatencyMs().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getMediaconnectSettings() == null) ? 0 : getMediaconnectSettings().hashCode());
        hashCode = prime * hashCode + ((getAudioChannelPairs() == null) ? 0 : getAudioChannelPairs().hashCode());
        return hashCode;
    }

    @Override
    public InputDeviceUhdSettings clone() {
        try {
            return (InputDeviceUhdSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDeviceUhdSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
