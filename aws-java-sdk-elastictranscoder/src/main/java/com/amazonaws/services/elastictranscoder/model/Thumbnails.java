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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Thumbnails for videos.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Thumbnails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>.
     * </p>
     * <p>
     * You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The approximate number of seconds between thumbnails. Specify an integer value.
     * </p>
     */
    private String interval;
    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of thumbnail files in pixels. Specify a value in the format <code> <i>width</i> </code> x
     * <code> <i>height</i> </code> where both values are even integers. The values cannot exceed the width and height
     * that you specified in the <code>Video:Resolution</code> object.
     * </p>
     */
    private String resolution;
    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The aspect ratio of thumbnails. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in the
     * output file.
     * </p>
     */
    private String aspectRatio;
    /**
     * <p>
     * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     * </p>
     */
    private String maxWidth;
    /**
     * <p>
     * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     * </p>
     */
    private String maxHeight;
    /**
     * <p>
     * Specify one of the following values to control scaling of thumbnails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * MaxWidth or MaxHeight settings without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other value. Elastic
     * Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     * thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the input
     * video and thumbnails are different, the thumbnails will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds
     * the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * </ul>
     */
    private String sizingPolicy;
    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that
     * you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * </p>
     */
    private String paddingPolicy;

    /**
     * <p>
     * The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>.
     * </p>
     * <p>
     * You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     * </p>
     * 
     * @param format
     *        The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>. </p>
     *        <p>
     *        You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>.
     * </p>
     * <p>
     * You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     * </p>
     * 
     * @return The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>. </p>
     *         <p>
     *         You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>.
     * </p>
     * <p>
     * You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     * </p>
     * 
     * @param format
     *        The format of thumbnails, if any. Valid values are <code>jpg</code> and <code>png</code>. </p>
     *        <p>
     *        You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The approximate number of seconds between thumbnails. Specify an integer value.
     * </p>
     * 
     * @param interval
     *        The approximate number of seconds between thumbnails. Specify an integer value.
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The approximate number of seconds between thumbnails. Specify an integer value.
     * </p>
     * 
     * @return The approximate number of seconds between thumbnails. Specify an integer value.
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The approximate number of seconds between thumbnails. Specify an integer value.
     * </p>
     * 
     * @param interval
     *        The approximate number of seconds between thumbnails. Specify an integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withInterval(String interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of thumbnail files in pixels. Specify a value in the format <code> <i>width</i> </code> x
     * <code> <i>height</i> </code> where both values are even integers. The values cannot exceed the width and height
     * that you specified in the <code>Video:Resolution</code> object.
     * </p>
     * 
     * @param resolution
     *        <p>
     *        To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code>
     *        instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually
     *        exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The width and height of thumbnail files in pixels. Specify a value in the format
     *        <code> <i>width</i> </code> x <code> <i>height</i> </code> where both values are even integers. The values
     *        cannot exceed the width and height that you specified in the <code>Video:Resolution</code> object.
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of thumbnail files in pixels. Specify a value in the format <code> <i>width</i> </code> x
     * <code> <i>height</i> </code> where both values are even integers. The values cannot exceed the width and height
     * that you specified in the <code>Video:Resolution</code> object.
     * </p>
     * 
     * @return <p>
     *         To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually
     *         exclusive. Do not use them together.
     *         </p>
     *         </important>
     *         <p>
     *         The width and height of thumbnail files in pixels. Specify a value in the format
     *         <code> <i>width</i> </code> x <code> <i>height</i> </code> where both values are even integers. The
     *         values cannot exceed the width and height that you specified in the <code>Video:Resolution</code> object.
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of thumbnail files in pixels. Specify a value in the format <code> <i>width</i> </code> x
     * <code> <i>height</i> </code> where both values are even integers. The values cannot exceed the width and height
     * that you specified in the <code>Video:Resolution</code> object.
     * </p>
     * 
     * @param resolution
     *        <p>
     *        To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code>
     *        instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually
     *        exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The width and height of thumbnail files in pixels. Specify a value in the format
     *        <code> <i>width</i> </code> x <code> <i>height</i> </code> where both values are even integers. The values
     *        cannot exceed the width and height that you specified in the <code>Video:Resolution</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The aspect ratio of thumbnails. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in the
     * output file.
     * </p>
     * 
     * @param aspectRatio
     *        <p>
     *        To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code>
     *        instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually
     *        exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The aspect ratio of thumbnails. Valid values include:
     *        </p>
     *        <p>
     *        <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in
     *        the output file.
     */

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The aspect ratio of thumbnails. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in the
     * output file.
     * </p>
     * 
     * @return <p>
     *         To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually
     *         exclusive. Do not use them together.
     *         </p>
     *         </important>
     *         <p>
     *         The aspect ratio of thumbnails. Valid values include:
     *         </p>
     *         <p>
     *         <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *         </p>
     *         <p>
     *         If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in
     *         the output file.
     */

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead
     * of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually exclusive. Do
     * not use them together.
     * </p>
     * </important>
     * <p>
     * The aspect ratio of thumbnails. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in the
     * output file.
     * </p>
     * 
     * @param aspectRatio
     *        <p>
     *        To better control resolution and aspect ratio of thumbnails, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, and <code>PaddingPolicy</code>
     *        instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups of settings are mutually
     *        exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The aspect ratio of thumbnails. Valid values include:
     *        </p>
     *        <p>
     *        <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the video in
     *        the output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withAspectRatio(String aspectRatio) {
        setAspectRatio(aspectRatio);
        return this;
    }

    /**
     * <p>
     * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     * </p>
     * 
     * @param maxWidth
     *        The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as
     *        the default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     */

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * <p>
     * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     * </p>
     * 
     * @return The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as
     *         the default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     */

    public String getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * <p>
     * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     * </p>
     * 
     * @param maxWidth
     *        The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as
     *        the default value. If you specify a numeric value, enter an even integer between 32 and 4096.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withMaxWidth(String maxWidth) {
        setMaxWidth(maxWidth);
        return this;
    }

    /**
     * <p>
     * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as
     *        the default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     */

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
     * <p>
     * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     * </p>
     * 
     * @return The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD)
     *         as the default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     */

    public String getMaxHeight() {
        return this.maxHeight;
    }

    /**
     * <p>
     * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as
     *        the default value. If you specify a numeric value, enter an even integer between 32 and 3072.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withMaxHeight(String maxHeight) {
        setMaxHeight(maxHeight);
        return this;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of thumbnails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * MaxWidth or MaxHeight settings without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other value. Elastic
     * Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     * thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the input
     * video and thumbnails are different, the thumbnails will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds
     * the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        Specify one of the following values to control scaling of thumbnails:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in
     *        thumbnail MaxWidth or MaxHeight settings without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in
     *        thumbnail <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other value.
     *        Elastic Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds
     *        the maximum value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     *        thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the
     *        input video and thumbnails are different, the thumbnails will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video
     *        exceeds the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code>
     *        settings, Elastic Transcoder crops the thumbnails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the
     *        values that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code>
     *        without exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails
     *        up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        dropping below either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     *        </p>
     *        </li>
     */

    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of thumbnails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * MaxWidth or MaxHeight settings without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other value. Elastic
     * Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     * thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the input
     * video and thumbnails are different, the thumbnails will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds
     * the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify one of the following values to control scaling of thumbnails:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in
     *         thumbnail MaxWidth or MaxHeight settings without exceeding the other value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in
     *         thumbnail <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other
     *         value. Elastic Transcoder centers the image in thumbnails and then crops in the dimension (if any) that
     *         exceeds the maximum value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     *         thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the
     *         input video and thumbnails are different, the thumbnails will be distorted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video
     *         exceeds the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code>
     *         settings, Elastic Transcoder crops the thumbnails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the
     *         values that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code>
     *         without exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails
     *         up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *         dropping below either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     *         </p>
     *         </li>
     */

    public String getSizingPolicy() {
        return this.sizingPolicy;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of thumbnails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * MaxWidth or MaxHeight settings without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail
     * <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other value. Elastic
     * Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     * thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the input
     * video and thumbnails are different, the thumbnails will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds
     * the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> without
     * exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        Specify one of the following values to control scaling of thumbnails:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fit</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in
     *        thumbnail MaxWidth or MaxHeight settings without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fill</code>: Elastic Transcoder scales thumbnails so they match the value that you specified in
     *        thumbnail <code>MaxWidth</code> or <code>MaxHeight</code> settings and matches or exceeds the other value.
     *        Elastic Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds
     *        the maximum value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stretch</code>: Elastic Transcoder stretches thumbnails to match the values that you specified for
     *        thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the relative proportions of the
     *        input video and thumbnails are different, the thumbnails will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keep</code>: Elastic Transcoder does not scale thumbnails. If either dimension of the input video
     *        exceeds the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code>
     *        settings, Elastic Transcoder crops the thumbnails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFit</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the
     *        values that you specified for at least one of thumbnail <code>MaxWidth</code> and <code>MaxHeight</code>
     *        without exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails
     *        up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFill</code>: Elastic Transcoder scales thumbnails down so that their dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        dropping below either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withSizingPolicy(String sizingPolicy) {
        setSizingPolicy(sizingPolicy);
        return this;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that
     * you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * </p>
     * 
     * @param paddingPolicy
     *        When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the
     *        top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match
     *        the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     */

    public void setPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that
     * you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * </p>
     * 
     * @return When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the
     *         top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match
     *         the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     */

    public String getPaddingPolicy() {
        return this.paddingPolicy;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that
     * you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * </p>
     * 
     * @param paddingPolicy
     *        When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the
     *        top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match
     *        the values that you specified for thumbnail <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Thumbnails withPaddingPolicy(String paddingPolicy) {
        setPaddingPolicy(paddingPolicy);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getAspectRatio() != null)
            sb.append("AspectRatio: ").append(getAspectRatio()).append(",");
        if (getMaxWidth() != null)
            sb.append("MaxWidth: ").append(getMaxWidth()).append(",");
        if (getMaxHeight() != null)
            sb.append("MaxHeight: ").append(getMaxHeight()).append(",");
        if (getSizingPolicy() != null)
            sb.append("SizingPolicy: ").append(getSizingPolicy()).append(",");
        if (getPaddingPolicy() != null)
            sb.append("PaddingPolicy: ").append(getPaddingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Thumbnails == false)
            return false;
        Thumbnails other = (Thumbnails) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null)
            return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false)
            return false;
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null)
            return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false)
            return false;
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null)
            return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false)
            return false;
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null)
            return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false)
            return false;
        if (other.getPaddingPolicy() == null ^ this.getPaddingPolicy() == null)
            return false;
        if (other.getPaddingPolicy() != null && other.getPaddingPolicy().equals(this.getPaddingPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getAspectRatio() == null) ? 0 : getAspectRatio().hashCode());
        hashCode = prime * hashCode + ((getMaxWidth() == null) ? 0 : getMaxWidth().hashCode());
        hashCode = prime * hashCode + ((getMaxHeight() == null) ? 0 : getMaxHeight().hashCode());
        hashCode = prime * hashCode + ((getSizingPolicy() == null) ? 0 : getSizingPolicy().hashCode());
        hashCode = prime * hashCode + ((getPaddingPolicy() == null) ? 0 : getPaddingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public Thumbnails clone() {
        try {
            return (Thumbnails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.ThumbnailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
