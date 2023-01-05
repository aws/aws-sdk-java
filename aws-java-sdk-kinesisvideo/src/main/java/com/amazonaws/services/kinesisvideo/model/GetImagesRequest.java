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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetImages"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the images.
     * </p>
     */
    private String imageSelectorType;
    /**
     * <p>
     * The starting point from which the images should be generated. This <code>StartTimestamp</code> must be within an
     * inclusive range of timestamps for an image to be returned.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The end timestamp for the range of images to be generated.
     * </p>
     */
    private java.util.Date endTimestamp;
    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval, the Image from
     * the <code>startTimestamp</code> will be returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     * </p>
     * </note>
     */
    private Integer samplingInterval;
    /**
     * <p>
     * The format that will be used to encode the image.
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
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be thrown. If neither parameter is
     * provided, the original image size from the stream will be returned.
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
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 100 images per API response. The additional results will be paginated.
     * </p>
     * </note>
     */
    private Long maxResults;
    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images. This is the
     * <code>GetImages:NextToken</code> from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to retrieve the images. You must specify either the
     *        <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @return The name of the stream from which to retrieve the images. You must specify either the
     *         <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to retrieve the images. You must specify either the
     *        <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either
     *        the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either
     *         the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either
     *        the <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
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

    public GetImagesRequest withImageSelectorType(String imageSelectorType) {
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

    public GetImagesRequest withImageSelectorType(ImageSelectorType imageSelectorType) {
        this.imageSelectorType = imageSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The starting point from which the images should be generated. This <code>StartTimestamp</code> must be within an
     * inclusive range of timestamps for an image to be returned.
     * </p>
     * 
     * @param startTimestamp
     *        The starting point from which the images should be generated. This <code>StartTimestamp</code> must be
     *        within an inclusive range of timestamps for an image to be returned.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The starting point from which the images should be generated. This <code>StartTimestamp</code> must be within an
     * inclusive range of timestamps for an image to be returned.
     * </p>
     * 
     * @return The starting point from which the images should be generated. This <code>StartTimestamp</code> must be
     *         within an inclusive range of timestamps for an image to be returned.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The starting point from which the images should be generated. This <code>StartTimestamp</code> must be within an
     * inclusive range of timestamps for an image to be returned.
     * </p>
     * 
     * @param startTimestamp
     *        The starting point from which the images should be generated. This <code>StartTimestamp</code> must be
     *        within an inclusive range of timestamps for an image to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The end timestamp for the range of images to be generated.
     * </p>
     * 
     * @param endTimestamp
     *        The end timestamp for the range of images to be generated.
     */

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The end timestamp for the range of images to be generated.
     * </p>
     * 
     * @return The end timestamp for the range of images to be generated.
     */

    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * <p>
     * The end timestamp for the range of images to be generated.
     * </p>
     * 
     * @param endTimestamp
     *        The end timestamp for the range of images to be generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
        return this;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval, the Image from
     * the <code>startTimestamp</code> will be returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     * </p>
     * </note>
     * 
     * @param samplingInterval
     *        The time interval in milliseconds (ms) at which the images need to be generated from the stream. The
     *        minimum value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval,
     *        the Image from the <code>startTimestamp</code> will be returned if available. </p> <note>
     *        <p>
     *        The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     *        </p>
     */

    public void setSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval, the Image from
     * the <code>startTimestamp</code> will be returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     * </p>
     * </note>
     * 
     * @return The time interval in milliseconds (ms) at which the images need to be generated from the stream. The
     *         minimum value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval,
     *         the Image from the <code>startTimestamp</code> will be returned if available. </p> <note>
     *         <p>
     *         The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     *         </p>
     */

    public Integer getSamplingInterval() {
        return this.samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum
     * value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval, the Image from
     * the <code>startTimestamp</code> will be returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     * </p>
     * </note>
     * 
     * @param samplingInterval
     *        The time interval in milliseconds (ms) at which the images need to be generated from the stream. The
     *        minimum value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval,
     *        the Image from the <code>startTimestamp</code> will be returned if available. </p> <note>
     *        <p>
     *        The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withSamplingInterval(Integer samplingInterval) {
        setSamplingInterval(samplingInterval);
        return this;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * 
     * @param format
     *        The format that will be used to encode the image.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * 
     * @return The format that will be used to encode the image.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * 
     * @param format
     *        The format that will be used to encode the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public GetImagesRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * 
     * @param format
     *        The format that will be used to encode the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public GetImagesRequest withFormat(Format format) {
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

    public GetImagesRequest withFormatConfig(java.util.Map<String, String> formatConfig) {
        setFormatConfig(formatConfig);
        return this;
    }

    /**
     * Add a single FormatConfig entry
     *
     * @see GetImagesRequest#withFormatConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest addFormatConfigEntry(String key, String value) {
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

    public GetImagesRequest clearFormatConfigEntries() {
        this.formatConfig = null;
        return this;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be thrown. If neither parameter is
     * provided, the original image size from the stream will be returned.
     * </p>
     * 
     * @param widthPixels
     *        The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter.
     *        When both <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will
     *        be stretched to fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided
     *        or if only the <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be thrown.
     *        If neither parameter is provided, the original image size from the stream will be returned.
     */

    public void setWidthPixels(Integer widthPixels) {
        this.widthPixels = widthPixels;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be thrown. If neither parameter is
     * provided, the original image size from the stream will be returned.
     * </p>
     * 
     * @return The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter.
     *         When both <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will
     *         be stretched to fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is
     *         provided or if only the <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be
     *         thrown. If neither parameter is provided, the original image size from the stream will be returned.
     */

    public Integer getWidthPixels() {
        return this.widthPixels;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter. When both
     * <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will be stretched to
     * fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be thrown. If neither parameter is
     * provided, the original image size from the stream will be returned.
     * </p>
     * 
     * @param widthPixels
     *        The width of the output image that is used in conjunction with the <code>HeightPixels</code> parameter.
     *        When both <code>WidthPixels</code> and <code>HeightPixels</code> parameters are provided, the image will
     *        be stretched to fit the specified aspect ratio. If only the <code>WidthPixels</code> parameter is provided
     *        or if only the <code>HeightPixels</code> is provided, a <code>ValidationException</code> will be thrown.
     *        If neither parameter is provided, the original image size from the stream will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withWidthPixels(Integer widthPixels) {
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

    public GetImagesRequest withHeightPixels(Integer heightPixels) {
        setHeightPixels(heightPixels);
        return this;
    }

    /**
     * <p>
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 100 images per API response. The additional results will be paginated.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of images to be returned by the API. </p> <note>
     *        <p>
     *        The default limit is 100 images per API response. The additional results will be paginated.
     *        </p>
     */

    public void setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 100 images per API response. The additional results will be paginated.
     * </p>
     * </note>
     * 
     * @return The maximum number of images to be returned by the API. </p> <note>
     *         <p>
     *         The default limit is 100 images per API response. The additional results will be paginated.
     *         </p>
     */

    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 100 images per API response. The additional results will be paginated.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of images to be returned by the API. </p> <note>
     *        <p>
     *        The default limit is 100 images per API response. The additional results will be paginated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withMaxResults(Long maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images. This is the
     * <code>GetImages:NextToken</code> from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token that specifies where to start paginating the next set of Images. This is the
     *        <code>GetImages:NextToken</code> from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images. This is the
     * <code>GetImages:NextToken</code> from a previously truncated response.
     * </p>
     * 
     * @return A token that specifies where to start paginating the next set of Images. This is the
     *         <code>GetImages:NextToken</code> from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images. This is the
     * <code>GetImages:NextToken</code> from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token that specifies where to start paginating the next set of Images. This is the
     *        <code>GetImages:NextToken</code> from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getImageSelectorType() != null)
            sb.append("ImageSelectorType: ").append(getImageSelectorType()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp()).append(",");
        if (getSamplingInterval() != null)
            sb.append("SamplingInterval: ").append(getSamplingInterval()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFormatConfig() != null)
            sb.append("FormatConfig: ").append(getFormatConfig()).append(",");
        if (getWidthPixels() != null)
            sb.append("WidthPixels: ").append(getWidthPixels()).append(",");
        if (getHeightPixels() != null)
            sb.append("HeightPixels: ").append(getHeightPixels()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImagesRequest == false)
            return false;
        GetImagesRequest other = (GetImagesRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getImageSelectorType() == null ^ this.getImageSelectorType() == null)
            return false;
        if (other.getImageSelectorType() != null && other.getImageSelectorType().equals(this.getImageSelectorType()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getImageSelectorType() == null) ? 0 : getImageSelectorType().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSamplingInterval() == null) ? 0 : getSamplingInterval().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFormatConfig() == null) ? 0 : getFormatConfig().hashCode());
        hashCode = prime * hashCode + ((getWidthPixels() == null) ? 0 : getWidthPixels().hashCode());
        hashCode = prime * hashCode + ((getHeightPixels() == null) ? 0 : getHeightPixels().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetImagesRequest clone() {
        return (GetImagesRequest) super.clone();
    }

}
