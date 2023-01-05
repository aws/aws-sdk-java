/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that contains the information required for the KVS images delivery. If null, the configuration will be
 * deleted from the stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ImageGenerationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageGenerationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the images.
     * </p>
     */
    private String imageSelectorType;
    /**
     * <p>
     * The structure that contains the information required to deliver images to a customer.
     * </p>
     */
    private ImageGenerationDestinationConfig destinationConfig;
    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 33 ms, because a camera that generates content at 30 FPS would create a frame every
     * 33.3 ms. If the timestamp range is less than the sampling interval, the Image from the
     * <code>StartTimestamp</code> will be returned if available.
     * </p>
     */
    private Integer samplingInterval;
    /**
     * <p>
     * The accepted image format.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters that can be applied when the image is
     * generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG quality
     * key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to 100. If the
     * value is 1, the image will be generated with less quality and the best compression. If the value is 100, the
     * image will be generated with the best quality and less compression. If no value is provided, the default value of
     * the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     */
    private java.util.Map<String, String> formatConfig;
    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>HeightPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     */
    private Integer widthPixels;
    /**
     * <p>
     * The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter. When both
     * <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     */
    private Integer heightPixels;

    /**
     * <p>
     * Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * @see ConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * @see ConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationStatus
     */

    public ImageGenerationConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * </p>
     * 
     * @param status
     *        Indicates whether the <code>ContinuousImageGenerationConfigurations</code> API is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationStatus
     */

    public ImageGenerationConfiguration withStatus(ConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the images.
     * </p>
     * 
     * @param imageSelectorType
     *        The origin of the Server or Producer timestamps to use to generate the images.
     * @see ImageSelectorType
     */

    public void setImageSelectorType(String imageSelectorType) {
        this.imageSelectorType = imageSelectorType;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the images.
     * </p>
     * 
     * @return The origin of the Server or Producer timestamps to use to generate the images.
     * @see ImageSelectorType
     */

    public String getImageSelectorType() {
        return this.imageSelectorType;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the images.
     * </p>
     * 
     * @param imageSelectorType
     *        The origin of the Server or Producer timestamps to use to generate the images.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSelectorType
     */

    public ImageGenerationConfiguration withImageSelectorType(String imageSelectorType) {
        setImageSelectorType(imageSelectorType);
        return this;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the images.
     * </p>
     * 
     * @param imageSelectorType
     *        The origin of the Server or Producer timestamps to use to generate the images.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSelectorType
     */

    public ImageGenerationConfiguration withImageSelectorType(ImageSelectorType imageSelectorType) {
        this.imageSelectorType = imageSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The structure that contains the information required to deliver images to a customer.
     * </p>
     * 
     * @param destinationConfig
     *        The structure that contains the information required to deliver images to a customer.
     */

    public void setDestinationConfig(ImageGenerationDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * The structure that contains the information required to deliver images to a customer.
     * </p>
     * 
     * @return The structure that contains the information required to deliver images to a customer.
     */

    public ImageGenerationDestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * The structure that contains the information required to deliver images to a customer.
     * </p>
     * 
     * @param destinationConfig
     *        The structure that contains the information required to deliver images to a customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration withDestinationConfig(ImageGenerationDestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 33 ms, because a camera that generates content at 30 FPS would create a frame every
     * 33.3 ms. If the timestamp range is less than the sampling interval, the Image from the
     * <code>StartTimestamp</code> will be returned if available.
     * </p>
     * 
     * @param samplingInterval
     *        The time interval in milliseconds (ms) at which the images need to be generated from the stream. The
     *        minimum value that can be provided is 33 ms, because a camera that generates content at 30 FPS would
     *        create a frame every 33.3 ms. If the timestamp range is less than the sampling interval, the Image from
     *        the <code>StartTimestamp</code> will be returned if available.
     */

    public void setSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 33 ms, because a camera that generates content at 30 FPS would create a frame every
     * 33.3 ms. If the timestamp range is less than the sampling interval, the Image from the
     * <code>StartTimestamp</code> will be returned if available.
     * </p>
     * 
     * @return The time interval in milliseconds (ms) at which the images need to be generated from the stream. The
     *         minimum value that can be provided is 33 ms, because a camera that generates content at 30 FPS would
     *         create a frame every 33.3 ms. If the timestamp range is less than the sampling interval, the Image from
     *         the <code>StartTimestamp</code> will be returned if available.
     */

    public Integer getSamplingInterval() {
        return this.samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 33 ms, because a camera that generates content at 30 FPS would create a frame every
     * 33.3 ms. If the timestamp range is less than the sampling interval, the Image from the
     * <code>StartTimestamp</code> will be returned if available.
     * </p>
     * 
     * @param samplingInterval
     *        The time interval in milliseconds (ms) at which the images need to be generated from the stream. The
     *        minimum value that can be provided is 33 ms, because a camera that generates content at 30 FPS would
     *        create a frame every 33.3 ms. If the timestamp range is less than the sampling interval, the Image from
     *        the <code>StartTimestamp</code> will be returned if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration withSamplingInterval(Integer samplingInterval) {
        setSamplingInterval(samplingInterval);
        return this;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * 
     * @param format
     *        The accepted image format.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * 
     * @return The accepted image format.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * 
     * @param format
     *        The accepted image format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ImageGenerationConfiguration withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * 
     * @param format
     *        The accepted image format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ImageGenerationConfiguration withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters that can be applied when the image is
     * generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG quality
     * key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to 100. If the
     * value is 1, the image will be generated with less quality and the best compression. If the value is 100, the
     * image will be generated with the best quality and less compression. If no value is provided, the default value of
     * the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     * 
     * @return The list of a key-value pair structure that contains extra parameters that can be applied when the image
     *         is generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG
     *         quality key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to
     *         100. If the value is 1, the image will be generated with less quality and the best compression. If the
     *         value is 100, the image will be generated with the best quality and less compression. If no value is
     *         provided, the default value of the <code>JPEGQuality</code> key will be set to 80.
     */

    public java.util.Map<String, String> getFormatConfig() {
        return formatConfig;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters that can be applied when the image is
     * generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG quality
     * key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to 100. If the
     * value is 1, the image will be generated with less quality and the best compression. If the value is 100, the
     * image will be generated with the best quality and less compression. If no value is provided, the default value of
     * the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     * 
     * @param formatConfig
     *        The list of a key-value pair structure that contains extra parameters that can be applied when the image
     *        is generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG
     *        quality key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to
     *        100. If the value is 1, the image will be generated with less quality and the best compression. If the
     *        value is 100, the image will be generated with the best quality and less compression. If no value is
     *        provided, the default value of the <code>JPEGQuality</code> key will be set to 80.
     */

    public void setFormatConfig(java.util.Map<String, String> formatConfig) {
        this.formatConfig = formatConfig;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters that can be applied when the image is
     * generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG quality
     * key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to 100. If the
     * value is 1, the image will be generated with less quality and the best compression. If the value is 100, the
     * image will be generated with the best quality and less compression. If no value is provided, the default value of
     * the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     * 
     * @param formatConfig
     *        The list of a key-value pair structure that contains extra parameters that can be applied when the image
     *        is generated. The <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which indicates the JPEG
     *        quality key to be used to generate the image. The <code>FormatConfig</code> value accepts ints from 1 to
     *        100. If the value is 1, the image will be generated with less quality and the best compression. If the
     *        value is 100, the image will be generated with the best quality and less compression. If no value is
     *        provided, the default value of the <code>JPEGQuality</code> key will be set to 80.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration withFormatConfig(java.util.Map<String, String> formatConfig) {
        setFormatConfig(formatConfig);
        return this;
    }

    /**
     * Add a single FormatConfig entry
     *
     * @see ImageGenerationConfiguration#withFormatConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration addFormatConfigEntry(String key, String value) {
        if (null == this.formatConfig) {
            this.formatConfig = new java.util.HashMap<String, String>();
        }
        if (this.formatConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.formatConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormatConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration clearFormatConfigEntries() {
        this.formatConfig = null;
        return this;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>HeightPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     * 
     * @param widthPixels
     *        The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter.
     *        When both <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will
     *        be stretched to fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is
     *        provided, its original aspect ratio will be used to calculate the <code>HeightPixels</code> ratio. If
     *        neither parameter is provided, the original image size will be returned.
     */

    public void setWidthPixels(Integer widthPixels) {
        this.widthPixels = widthPixels;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>HeightPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     * 
     * @return The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter.
     *         When both <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will
     *         be stretched to fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is
     *         provided, its original aspect ratio will be used to calculate the <code>HeightPixels</code> ratio. If
     *         neither parameter is provided, the original image size will be returned.
     */

    public Integer getWidthPixels() {
        return this.widthPixels;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>HeightPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     * 
     * @param widthPixels
     *        The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter.
     *        When both <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will
     *        be stretched to fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is
     *        provided, its original aspect ratio will be used to calculate the <code>HeightPixels</code> ratio. If
     *        neither parameter is provided, the original image size will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration withWidthPixels(Integer widthPixels) {
        setWidthPixels(widthPixels);
        return this;
    }

    /**
     * <p>
     * The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter. When both
     * <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     * 
     * @param heightPixels
     *        The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter.
     *        When both <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will
     *        be stretched to fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is
     *        provided, its original aspect ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     *        neither parameter is provided, the original image size will be returned.
     */

    public void setHeightPixels(Integer heightPixels) {
        this.heightPixels = heightPixels;
    }

    /**
     * <p>
     * The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter. When both
     * <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     * 
     * @return The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter.
     *         When both <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will
     *         be stretched to fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is
     *         provided, its original aspect ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     *         neither parameter is provided, the original image size will be returned.
     */

    public Integer getHeightPixels() {
        return this.heightPixels;
    }

    /**
     * <p>
     * The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter. When both
     * <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If neither parameter is provided, the
     * original image size will be returned.
     * </p>
     * 
     * @param heightPixels
     *        The height of the output image that is used in conjunction with the <code>WidthPixels</code> parameter.
     *        When both <code>HeightPixels</code> and <code>WidthPixels</code> parameters are provided, the image will
     *        be stretched to fit the specified aspect ratio. If only the <code>HeightPixels</code> parameter is
     *        provided, its original aspect ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     *        neither parameter is provided, the original image size will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageGenerationConfiguration withHeightPixels(Integer heightPixels) {
        setHeightPixels(heightPixels);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getImageSelectorType() != null)
            sb.append("ImageSelectorType: ").append(getImageSelectorType()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig()).append(",");
        if (getSamplingInterval() != null)
            sb.append("SamplingInterval: ").append(getSamplingInterval()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFormatConfig() != null)
            sb.append("FormatConfig: ").append(getFormatConfig()).append(",");
        if (getWidthPixels() != null)
            sb.append("WidthPixels: ").append(getWidthPixels()).append(",");
        if (getHeightPixels() != null)
            sb.append("HeightPixels: ").append(getHeightPixels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageGenerationConfiguration == false)
            return false;
        ImageGenerationConfiguration other = (ImageGenerationConfiguration) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getImageSelectorType() == null ^ this.getImageSelectorType() == null)
            return false;
        if (other.getImageSelectorType() != null && other.getImageSelectorType().equals(this.getImageSelectorType()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getSamplingInterval() == null ^ this.getSamplingInterval() == null)
            return false;
        if (other.getSamplingInterval() != null && other.getSamplingInterval().equals(this.getSamplingInterval()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFormatConfig() == null ^ this.getFormatConfig() == null)
            return false;
        if (other.getFormatConfig() != null && other.getFormatConfig().equals(this.getFormatConfig()) == false)
            return false;
        if (other.getWidthPixels() == null ^ this.getWidthPixels() == null)
            return false;
        if (other.getWidthPixels() != null && other.getWidthPixels().equals(this.getWidthPixels()) == false)
            return false;
        if (other.getHeightPixels() == null ^ this.getHeightPixels() == null)
            return false;
        if (other.getHeightPixels() != null && other.getHeightPixels().equals(this.getHeightPixels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getImageSelectorType() == null) ? 0 : getImageSelectorType().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getSamplingInterval() == null) ? 0 : getSamplingInterval().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFormatConfig() == null) ? 0 : getFormatConfig().hashCode());
        hashCode = prime * hashCode + ((getWidthPixels() == null) ? 0 : getWidthPixels().hashCode());
        hashCode = prime * hashCode + ((getHeightPixels() == null) ? 0 : getHeightPixels().hashCode());
        return hashCode;
    }

    @Override
    public ImageGenerationConfiguration clone() {
        try {
            return (ImageGenerationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ImageGenerationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
