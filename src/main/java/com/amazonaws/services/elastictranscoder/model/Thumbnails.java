/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * Thumbnails for videos.
 * </p>
 */
public class Thumbnails implements Serializable {

    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     */
    private String format;

    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}$<br/>
     */
    private String interval;

    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The width and height of thumbnail files in pixels.
     * Specify a value in the format <code><i>width</i></code> x
     * <code><i>height</i></code> where both values are even integers. The
     * values cannot exceed the width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}x\d{1,5}$<br/>
     */
    private String resolution;

    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     */
    private String aspectRatio;

    /**
     * The maximum width of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 4096.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     */
    private String maxWidth;

    /**
     * The maximum height of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 3072.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     */
    private String maxHeight;

    /**
     * Specify one of the following values to control scaling of thumbnails:
     * <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     * they match the value that you specified in thumbnail MaxWidth or
     * MaxHeight settings without exceeding the other value. </li>
     * <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     * match the value that you specified in thumbnail <code>MaxWidth</code>
     * or <code>MaxHeight</code> settings and matches or exceeds the other
     * value. Elastic Transcoder centers the image in thumbnails and then
     * crops in the dimension (if any) that exceeds the maximum value.</li>
     * <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     * relative proportions of the input video and thumbnails are different,
     * the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale thumbnails. If either dimension of the input
     * video exceeds the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     * Elastic Transcoder scales thumbnails down so that their dimensions
     * match the values that you specified for at least one of thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales thumbnails down so that their dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale thumbnails
     * up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     */
    private String sizingPolicy;

    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of thumbnails to make the total size of the thumbnails
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     */
    private String paddingPolicy;

    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     *
     * @return The format of thumbnails, if any. Valid values are <code>jpg</code>
     *         and <code>png</code>. <p>You specify whether you want Elastic
     *         Transcoder to create thumbnails when you create a job.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     *
     * @param format The format of thumbnails, if any. Valid values are <code>jpg</code>
     *         and <code>png</code>. <p>You specify whether you want Elastic
     *         Transcoder to create thumbnails when you create a job.
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     *
     * @param format The format of thumbnails, if any. Valid values are <code>jpg</code>
     *         and <code>png</code>. <p>You specify whether you want Elastic
     *         Transcoder to create thumbnails when you create a job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}$<br/>
     *
     * @return The number of seconds between thumbnails. Specify an integer value.
     */
    public String getInterval() {
        return interval;
    }
    
    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}$<br/>
     *
     * @param interval The number of seconds between thumbnails. Specify an integer value.
     */
    public void setInterval(String interval) {
        this.interval = interval;
    }
    
    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}$<br/>
     *
     * @param interval The number of seconds between thumbnails. Specify an integer value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The width and height of thumbnail files in pixels.
     * Specify a value in the format <code><i>width</i></code> x
     * <code><i>height</i></code> where both values are even integers. The
     * values cannot exceed the width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}x\d{1,5}$<br/>
     *
     * @return <important> <p>To better control resolution and aspect ratio of
     *         thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>,
     *         <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     *         <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     *         of settings are mutually exclusive. Do not use them together.
     *         </important> <p>The width and height of thumbnail files in pixels.
     *         Specify a value in the format <code><i>width</i></code> x
     *         <code><i>height</i></code> where both values are even integers. The
     *         values cannot exceed the width and height that you specified in the
     *         <code>Video:Resolution</code> object.
     */
    public String getResolution() {
        return resolution;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The width and height of thumbnail files in pixels.
     * Specify a value in the format <code><i>width</i></code> x
     * <code><i>height</i></code> where both values are even integers. The
     * values cannot exceed the width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}x\d{1,5}$<br/>
     *
     * @param resolution <important> <p>To better control resolution and aspect ratio of
     *         thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>,
     *         <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     *         <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     *         of settings are mutually exclusive. Do not use them together.
     *         </important> <p>The width and height of thumbnail files in pixels.
     *         Specify a value in the format <code><i>width</i></code> x
     *         <code><i>height</i></code> where both values are even integers. The
     *         values cannot exceed the width and height that you specified in the
     *         <code>Video:Resolution</code> object.
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The width and height of thumbnail files in pixels.
     * Specify a value in the format <code><i>width</i></code> x
     * <code><i>height</i></code> where both values are even integers. The
     * values cannot exceed the width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}x\d{1,5}$<br/>
     *
     * @param resolution <important> <p>To better control resolution and aspect ratio of
     *         thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>,
     *         <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     *         <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     *         of settings are mutually exclusive. Do not use them together.
     *         </important> <p>The width and height of thumbnail files in pixels.
     *         Specify a value in the format <code><i>width</i></code> x
     *         <code><i>height</i></code> where both values are even integers. The
     *         values cannot exceed the width and height that you specified in the
     *         <code>Video:Resolution</code> object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @return <important> <p>To better control resolution and aspect ratio of
     *         thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>,
     *         <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     *         <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     *         of settings are mutually exclusive. Do not use them together.
     *         </important> <p>The aspect ratio of thumbnails. Valid values include:
     *         <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     *         <code>3:2</code>, <code>16:9</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     *         ratio of the video in the output file.
     */
    public String getAspectRatio() {
        return aspectRatio;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio <important> <p>To better control resolution and aspect ratio of
     *         thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>,
     *         <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     *         <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     *         of settings are mutually exclusive. Do not use them together.
     *         </important> <p>The aspect ratio of thumbnails. Valid values include:
     *         <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     *         <code>3:2</code>, <code>16:9</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     *         ratio of the video in the output file.
     */
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of
     * thumbnails, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>,
     * <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     * <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </important> <p>The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio <important> <p>To better control resolution and aspect ratio of
     *         thumbnails, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>,
     *         <code>SizingPolicy</code>, and <code>PaddingPolicy</code> instead of
     *         <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     *         of settings are mutually exclusive. Do not use them together.
     *         </important> <p>The aspect ratio of thumbnails. Valid values include:
     *         <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     *         <code>3:2</code>, <code>16:9</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     *         ratio of the video in the output file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    /**
     * The maximum width of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 4096.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @return The maximum width of thumbnails in pixels. If you specify auto,
     *         Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     *         specify a numeric value, enter an even integer between 32 and 4096.
     */
    public String getMaxWidth() {
        return maxWidth;
    }
    
    /**
     * The maximum width of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 4096.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxWidth The maximum width of thumbnails in pixels. If you specify auto,
     *         Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     *         specify a numeric value, enter an even integer between 32 and 4096.
     */
    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }
    
    /**
     * The maximum width of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 4096.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxWidth The maximum width of thumbnails in pixels. If you specify auto,
     *         Elastic Transcoder uses 1920 (Full HD) as the default value. If you
     *         specify a numeric value, enter an even integer between 32 and 4096.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    /**
     * The maximum height of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 3072.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @return The maximum height of thumbnails in pixels. If you specify auto,
     *         Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     *         specify a numeric value, enter an even integer between 32 and 3072.
     */
    public String getMaxHeight() {
        return maxHeight;
    }
    
    /**
     * The maximum height of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 3072.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxHeight The maximum height of thumbnails in pixels. If you specify auto,
     *         Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     *         specify a numeric value, enter an even integer between 32 and 3072.
     */
    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }
    
    /**
     * The maximum height of thumbnails in pixels. If you specify auto,
     * Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     * specify a numeric value, enter an even integer between 32 and 3072.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxHeight The maximum height of thumbnails in pixels. If you specify auto,
     *         Elastic Transcoder uses 1080 (Full HD) as the default value. If you
     *         specify a numeric value, enter an even integer between 32 and 3072.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    /**
     * Specify one of the following values to control scaling of thumbnails:
     * <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     * they match the value that you specified in thumbnail MaxWidth or
     * MaxHeight settings without exceeding the other value. </li>
     * <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     * match the value that you specified in thumbnail <code>MaxWidth</code>
     * or <code>MaxHeight</code> settings and matches or exceeds the other
     * value. Elastic Transcoder centers the image in thumbnails and then
     * crops in the dimension (if any) that exceeds the maximum value.</li>
     * <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     * relative proportions of the input video and thumbnails are different,
     * the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale thumbnails. If either dimension of the input
     * video exceeds the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     * Elastic Transcoder scales thumbnails down so that their dimensions
     * match the values that you specified for at least one of thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales thumbnails down so that their dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale thumbnails
     * up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @return Specify one of the following values to control scaling of thumbnails:
     *         <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     *         they match the value that you specified in thumbnail MaxWidth or
     *         MaxHeight settings without exceeding the other value. </li>
     *         <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     *         match the value that you specified in thumbnail <code>MaxWidth</code>
     *         or <code>MaxHeight</code> settings and matches or exceeds the other
     *         value. Elastic Transcoder centers the image in thumbnails and then
     *         crops in the dimension (if any) that exceeds the maximum value.</li>
     *         <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     *         match the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     *         relative proportions of the input video and thumbnails are different,
     *         the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     *         Transcoder does not scale thumbnails. If either dimension of the input
     *         video exceeds the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     *         Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     *         Elastic Transcoder scales thumbnails down so that their dimensions
     *         match the values that you specified for at least one of thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not
     *         scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     *         Transcoder scales thumbnails down so that their dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code>
     *         and <code>MaxHeight</code> without dropping below either value. If you
     *         specify this option, Elastic Transcoder does not scale thumbnails
     *         up.</li> </ul>
     */
    public String getSizingPolicy() {
        return sizingPolicy;
    }
    
    /**
     * Specify one of the following values to control scaling of thumbnails:
     * <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     * they match the value that you specified in thumbnail MaxWidth or
     * MaxHeight settings without exceeding the other value. </li>
     * <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     * match the value that you specified in thumbnail <code>MaxWidth</code>
     * or <code>MaxHeight</code> settings and matches or exceeds the other
     * value. Elastic Transcoder centers the image in thumbnails and then
     * crops in the dimension (if any) that exceeds the maximum value.</li>
     * <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     * relative proportions of the input video and thumbnails are different,
     * the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale thumbnails. If either dimension of the input
     * video exceeds the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     * Elastic Transcoder scales thumbnails down so that their dimensions
     * match the values that you specified for at least one of thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales thumbnails down so that their dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale thumbnails
     * up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @param sizingPolicy Specify one of the following values to control scaling of thumbnails:
     *         <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     *         they match the value that you specified in thumbnail MaxWidth or
     *         MaxHeight settings without exceeding the other value. </li>
     *         <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     *         match the value that you specified in thumbnail <code>MaxWidth</code>
     *         or <code>MaxHeight</code> settings and matches or exceeds the other
     *         value. Elastic Transcoder centers the image in thumbnails and then
     *         crops in the dimension (if any) that exceeds the maximum value.</li>
     *         <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     *         match the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     *         relative proportions of the input video and thumbnails are different,
     *         the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     *         Transcoder does not scale thumbnails. If either dimension of the input
     *         video exceeds the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     *         Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     *         Elastic Transcoder scales thumbnails down so that their dimensions
     *         match the values that you specified for at least one of thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not
     *         scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     *         Transcoder scales thumbnails down so that their dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code>
     *         and <code>MaxHeight</code> without dropping below either value. If you
     *         specify this option, Elastic Transcoder does not scale thumbnails
     *         up.</li> </ul>
     */
    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }
    
    /**
     * Specify one of the following values to control scaling of thumbnails:
     * <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     * they match the value that you specified in thumbnail MaxWidth or
     * MaxHeight settings without exceeding the other value. </li>
     * <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     * match the value that you specified in thumbnail <code>MaxWidth</code>
     * or <code>MaxHeight</code> settings and matches or exceeds the other
     * value. Elastic Transcoder centers the image in thumbnails and then
     * crops in the dimension (if any) that exceeds the maximum value.</li>
     * <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     * relative proportions of the input video and thumbnails are different,
     * the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale thumbnails. If either dimension of the input
     * video exceeds the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     * Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     * Elastic Transcoder scales thumbnails down so that their dimensions
     * match the values that you specified for at least one of thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales thumbnails down so that their dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale thumbnails
     * up.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @param sizingPolicy Specify one of the following values to control scaling of thumbnails:
     *         <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales thumbnails so
     *         they match the value that you specified in thumbnail MaxWidth or
     *         MaxHeight settings without exceeding the other value. </li>
     *         <li><code>Fill</code>: Elastic Transcoder scales thumbnails so they
     *         match the value that you specified in thumbnail <code>MaxWidth</code>
     *         or <code>MaxHeight</code> settings and matches or exceeds the other
     *         value. Elastic Transcoder centers the image in thumbnails and then
     *         crops in the dimension (if any) that exceeds the maximum value.</li>
     *         <li><code>Stretch</code>: Elastic Transcoder stretches thumbnails to
     *         match the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings. If the
     *         relative proportions of the input video and thumbnails are different,
     *         the thumbnails will be distorted.</li> <li><code>Keep</code>: Elastic
     *         Transcoder does not scale thumbnails. If either dimension of the input
     *         video exceeds the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings, Elastic
     *         Transcoder crops the thumbnails.</li> <li><code>ShrinkToFit</code>:
     *         Elastic Transcoder scales thumbnails down so that their dimensions
     *         match the values that you specified for at least one of thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not
     *         scale thumbnails up.</li> <li><code>ShrinkToFill</code>: Elastic
     *         Transcoder scales thumbnails down so that their dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code>
     *         and <code>MaxHeight</code> without dropping below either value. If you
     *         specify this option, Elastic Transcoder does not scale thumbnails
     *         up.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
        return this;
    }

    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of thumbnails to make the total size of the thumbnails
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @return When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add black bars to the top and bottom and/or left and
     *         right sides of thumbnails to make the total size of the thumbnails
     *         match the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     */
    public String getPaddingPolicy() {
        return paddingPolicy;
    }
    
    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of thumbnails to make the total size of the thumbnails
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @param paddingPolicy When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add black bars to the top and bottom and/or left and
     *         right sides of thumbnails to make the total size of the thumbnails
     *         match the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     */
    public void setPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
    }
    
    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of thumbnails to make the total size of the thumbnails
     * match the values that you specified for thumbnail
     * <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @param paddingPolicy When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add black bars to the top and bottom and/or left and
     *         right sides of thumbnails to make the total size of the thumbnails
     *         match the values that you specified for thumbnail
     *         <code>MaxWidth</code> and <code>MaxHeight</code> settings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Thumbnails withPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getInterval() != null) sb.append("Interval: " + getInterval() + ",");
        if (getResolution() != null) sb.append("Resolution: " + getResolution() + ",");
        if (getAspectRatio() != null) sb.append("AspectRatio: " + getAspectRatio() + ",");
        if (getMaxWidth() != null) sb.append("MaxWidth: " + getMaxWidth() + ",");
        if (getMaxHeight() != null) sb.append("MaxHeight: " + getMaxHeight() + ",");
        if (getSizingPolicy() != null) sb.append("SizingPolicy: " + getSizingPolicy() + ",");
        if (getPaddingPolicy() != null) sb.append("PaddingPolicy: " + getPaddingPolicy() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Thumbnails == false) return false;
        Thumbnails other = (Thumbnails)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getInterval() == null ^ this.getInterval() == null) return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false) return false; 
        if (other.getResolution() == null ^ this.getResolution() == null) return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false) return false; 
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null) return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false) return false; 
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null) return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false) return false; 
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null) return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false) return false; 
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null) return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false) return false; 
        if (other.getPaddingPolicy() == null ^ this.getPaddingPolicy() == null) return false;
        if (other.getPaddingPolicy() != null && other.getPaddingPolicy().equals(this.getPaddingPolicy()) == false) return false; 
        return true;
    }
    
}
    