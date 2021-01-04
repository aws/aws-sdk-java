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
 * Settings that describe the active source from the input device, and the video characteristics of that source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDeviceHdSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceHdSettings implements Serializable, Cloneable, StructuredPojo {

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

    public InputDeviceHdSettings withActiveInput(String activeInput) {
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

    public InputDeviceHdSettings withActiveInput(InputDeviceActiveInput activeInput) {
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

    public InputDeviceHdSettings withConfiguredInput(String configuredInput) {
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

    public InputDeviceHdSettings withConfiguredInput(InputDeviceConfiguredInput configuredInput) {
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

    public InputDeviceHdSettings withDeviceState(String deviceState) {
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

    public InputDeviceHdSettings withDeviceState(InputDeviceState deviceState) {
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

    public InputDeviceHdSettings withFramerate(Double framerate) {
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

    public InputDeviceHdSettings withHeight(Integer height) {
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

    public InputDeviceHdSettings withMaxBitrate(Integer maxBitrate) {
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

    public InputDeviceHdSettings withScanType(String scanType) {
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

    public InputDeviceHdSettings withScanType(InputDeviceScanType scanType) {
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

    public InputDeviceHdSettings withWidth(Integer width) {
        setWidth(width);
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
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceHdSettings == false)
            return false;
        InputDeviceHdSettings other = (InputDeviceHdSettings) obj;
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
        return hashCode;
    }

    @Override
    public InputDeviceHdSettings clone() {
        try {
            return (InputDeviceHdSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDeviceHdSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
