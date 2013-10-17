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
 * The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20.
 * </p>
 * <p>
 * To remove artwork or leave the artwork empty, you can either set <code>Artwork</code> to null, or set the <code>Merge Policy</code> to "Replace" and
 * use an empty <code>Artwork</code> array.
 * </p>
 * <p>
 * To pass through existing artwork unchanged, set the <code>Merge Policy</code> to "Prepend", "Append", or "Fallback", and use an empty
 * <code>Artwork</code> array.
 * </p>
 */
public class Artwork implements Serializable {

    /**
     * The name of the file to be used as album art. To determine which
     * Amazon S3 bucket contains the specified file, Elastic Transcoder
     * checks the pipeline specified by <code>PipelineId</code>; the
     * <code>InputBucket</code> object in that pipeline identifies the
     * bucket. <p>If the file name includes a prefix, for example,
     * <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an
     * error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     */
    private String inputKey;

    /**
     * The maximum width of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 4096, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     */
    private String maxWidth;

    /**
     * The maximum height of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 3072, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     */
    private String maxHeight;

    /**
     * Specify one of the following values to control scaling of the output
     * album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     * the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     * output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output art and then
     * crops it in the dimension (if any) that exceeds the maximum value.
     * </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     * output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input art and the output art are different, the
     * output art will be distorted.</li> <li><code>Keep:</code> Elastic
     * Transcoder does not scale the output art. If either dimension of the
     * input art exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     * Transcoder scales the output art down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without exceeding either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     * output art down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and
     * <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     */
    private String sizingPolicy;

    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add white bars to the top and bottom and/or left and
     * right sides of the output album art to make the total size of the
     * output art match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     */
    private String paddingPolicy;

    /**
     * The format of album art, if any. Valid formats are <code>.jpg</code>
     * and <code>.png</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     */
    private String albumArtFormat;

    /**
     * The name of the file to be used as album art. To determine which
     * Amazon S3 bucket contains the specified file, Elastic Transcoder
     * checks the pipeline specified by <code>PipelineId</code>; the
     * <code>InputBucket</code> object in that pipeline identifies the
     * bucket. <p>If the file name includes a prefix, for example,
     * <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an
     * error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     *
     * @return The name of the file to be used as album art. To determine which
     *         Amazon S3 bucket contains the specified file, Elastic Transcoder
     *         checks the pipeline specified by <code>PipelineId</code>; the
     *         <code>InputBucket</code> object in that pipeline identifies the
     *         bucket. <p>If the file name includes a prefix, for example,
     *         <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     *         file isn't in the specified bucket, Elastic Transcoder returns an
     *         error.
     */
    public String getInputKey() {
        return inputKey;
    }
    
    /**
     * The name of the file to be used as album art. To determine which
     * Amazon S3 bucket contains the specified file, Elastic Transcoder
     * checks the pipeline specified by <code>PipelineId</code>; the
     * <code>InputBucket</code> object in that pipeline identifies the
     * bucket. <p>If the file name includes a prefix, for example,
     * <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an
     * error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     *
     * @param inputKey The name of the file to be used as album art. To determine which
     *         Amazon S3 bucket contains the specified file, Elastic Transcoder
     *         checks the pipeline specified by <code>PipelineId</code>; the
     *         <code>InputBucket</code> object in that pipeline identifies the
     *         bucket. <p>If the file name includes a prefix, for example,
     *         <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     *         file isn't in the specified bucket, Elastic Transcoder returns an
     *         error.
     */
    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }
    
    /**
     * The name of the file to be used as album art. To determine which
     * Amazon S3 bucket contains the specified file, Elastic Transcoder
     * checks the pipeline specified by <code>PipelineId</code>; the
     * <code>InputBucket</code> object in that pipeline identifies the
     * bucket. <p>If the file name includes a prefix, for example,
     * <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an
     * error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     *
     * @param inputKey The name of the file to be used as album art. To determine which
     *         Amazon S3 bucket contains the specified file, Elastic Transcoder
     *         checks the pipeline specified by <code>PipelineId</code>; the
     *         <code>InputBucket</code> object in that pipeline identifies the
     *         bucket. <p>If the file name includes a prefix, for example,
     *         <code>cooking/pie.jpg</code>, include the prefix in the key. If the
     *         file isn't in the specified bucket, Elastic Transcoder returns an
     *         error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Artwork withInputKey(String inputKey) {
        this.inputKey = inputKey;
        return this;
    }

    /**
     * The maximum width of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 4096, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @return The maximum width of the output album art in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     *         If you specify a numeric value, enter an even integer between 32 and
     *         4096, inclusive.
     */
    public String getMaxWidth() {
        return maxWidth;
    }
    
    /**
     * The maximum width of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 4096, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxWidth The maximum width of the output album art in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     *         If you specify a numeric value, enter an even integer between 32 and
     *         4096, inclusive.
     */
    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }
    
    /**
     * The maximum width of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 4096, inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxWidth The maximum width of the output album art in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     *         If you specify a numeric value, enter an even integer between 32 and
     *         4096, inclusive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Artwork withMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    /**
     * The maximum height of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 3072, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @return The maximum height of the output album art in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     *         If you specify a numeric value, enter an even integer between 32 and
     *         3072, inclusive.
     */
    public String getMaxHeight() {
        return maxHeight;
    }
    
    /**
     * The maximum height of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 3072, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxHeight The maximum height of the output album art in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     *         If you specify a numeric value, enter an even integer between 32 and
     *         3072, inclusive.
     */
    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }
    
    /**
     * The maximum height of the output album art in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     * If you specify a numeric value, enter an even integer between 32 and
     * 3072, inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxHeight The maximum height of the output album art in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 600 as the default value.
     *         If you specify a numeric value, enter an even integer between 32 and
     *         3072, inclusive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Artwork withMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    /**
     * Specify one of the following values to control scaling of the output
     * album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     * the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     * output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output art and then
     * crops it in the dimension (if any) that exceeds the maximum value.
     * </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     * output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input art and the output art are different, the
     * output art will be distorted.</li> <li><code>Keep:</code> Elastic
     * Transcoder does not scale the output art. If either dimension of the
     * input art exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     * Transcoder scales the output art down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without exceeding either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     * output art down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and
     * <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @return Specify one of the following values to control scaling of the output
     *         album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     *         the output art so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     *         other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     *         output art so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     *         the other value. Elastic Transcoder centers the output art and then
     *         crops it in the dimension (if any) that exceeds the maximum value.
     *         </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     *         output art to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     *         proportions of the input art and the output art are different, the
     *         output art will be distorted.</li> <li><code>Keep:</code> Elastic
     *         Transcoder does not scale the output art. If either dimension of the
     *         input art exceeds the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     *         crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     *         Transcoder scales the output art down so that its dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code>
     *         and <code>MaxHeight</code> without exceeding either value. If you
     *         specify this option, Elastic Transcoder does not scale the art
     *         up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     *         output art down so that its dimensions match the values that you
     *         specified for at least one of <code>MaxWidth</code> and
     *         <code>MaxHeight</code> without dropping below either value. If you
     *         specify this option, Elastic Transcoder does not scale the art
     *         up.</li> </ul>
     */
    public String getSizingPolicy() {
        return sizingPolicy;
    }
    
    /**
     * Specify one of the following values to control scaling of the output
     * album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     * the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     * output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output art and then
     * crops it in the dimension (if any) that exceeds the maximum value.
     * </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     * output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input art and the output art are different, the
     * output art will be distorted.</li> <li><code>Keep:</code> Elastic
     * Transcoder does not scale the output art. If either dimension of the
     * input art exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     * Transcoder scales the output art down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without exceeding either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     * output art down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and
     * <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @param sizingPolicy Specify one of the following values to control scaling of the output
     *         album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     *         the output art so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     *         other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     *         output art so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     *         the other value. Elastic Transcoder centers the output art and then
     *         crops it in the dimension (if any) that exceeds the maximum value.
     *         </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     *         output art to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     *         proportions of the input art and the output art are different, the
     *         output art will be distorted.</li> <li><code>Keep:</code> Elastic
     *         Transcoder does not scale the output art. If either dimension of the
     *         input art exceeds the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     *         crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     *         Transcoder scales the output art down so that its dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code>
     *         and <code>MaxHeight</code> without exceeding either value. If you
     *         specify this option, Elastic Transcoder does not scale the art
     *         up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     *         output art down so that its dimensions match the values that you
     *         specified for at least one of <code>MaxWidth</code> and
     *         <code>MaxHeight</code> without dropping below either value. If you
     *         specify this option, Elastic Transcoder does not scale the art
     *         up.</li> </ul>
     */
    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }
    
    /**
     * Specify one of the following values to control scaling of the output
     * album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     * the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     * output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output art and then
     * crops it in the dimension (if any) that exceeds the maximum value.
     * </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     * output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input art and the output art are different, the
     * output art will be distorted.</li> <li><code>Keep:</code> Elastic
     * Transcoder does not scale the output art. If either dimension of the
     * input art exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     * Transcoder scales the output art down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code>
     * and <code>MaxHeight</code> without exceeding either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     * output art down so that its dimensions match the values that you
     * specified for at least one of <code>MaxWidth</code> and
     * <code>MaxHeight</code> without dropping below either value. If you
     * specify this option, Elastic Transcoder does not scale the art
     * up.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @param sizingPolicy Specify one of the following values to control scaling of the output
     *         album art: <p> <ul> <li><code>Fit:</code> Elastic Transcoder scales
     *         the output art so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     *         other value.</li> <li><code>Fill:</code> Elastic Transcoder scales the
     *         output art so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     *         the other value. Elastic Transcoder centers the output art and then
     *         crops it in the dimension (if any) that exceeds the maximum value.
     *         </li> <li><code>Stretch:</code> Elastic Transcoder stretches the
     *         output art to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     *         proportions of the input art and the output art are different, the
     *         output art will be distorted.</li> <li><code>Keep:</code> Elastic
     *         Transcoder does not scale the output art. If either dimension of the
     *         input art exceeds the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     *         crops the output art.</li> <li><code>ShrinkToFit:</code> Elastic
     *         Transcoder scales the output art down so that its dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code>
     *         and <code>MaxHeight</code> without exceeding either value. If you
     *         specify this option, Elastic Transcoder does not scale the art
     *         up.</li> <li><code>ShrinkToFill</code> Elastic Transcoder scales the
     *         output art down so that its dimensions match the values that you
     *         specified for at least one of <code>MaxWidth</code> and
     *         <code>MaxHeight</code> without dropping below either value. If you
     *         specify this option, Elastic Transcoder does not scale the art
     *         up.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Artwork withSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
        return this;
    }

    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add white bars to the top and bottom and/or left and
     * right sides of the output album art to make the total size of the
     * output art match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @return When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add white bars to the top and bottom and/or left and
     *         right sides of the output album art to make the total size of the
     *         output art match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>.
     */
    public String getPaddingPolicy() {
        return paddingPolicy;
    }
    
    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add white bars to the top and bottom and/or left and
     * right sides of the output album art to make the total size of the
     * output art match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @param paddingPolicy When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add white bars to the top and bottom and/or left and
     *         right sides of the output album art to make the total size of the
     *         output art match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>.
     */
    public void setPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
    }
    
    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add white bars to the top and bottom and/or left and
     * right sides of the output album art to make the total size of the
     * output art match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @param paddingPolicy When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add white bars to the top and bottom and/or left and
     *         right sides of the output album art to make the total size of the
     *         output art match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Artwork withPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
        return this;
    }

    /**
     * The format of album art, if any. Valid formats are <code>.jpg</code>
     * and <code>.png</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     *
     * @return The format of album art, if any. Valid formats are <code>.jpg</code>
     *         and <code>.png</code>.
     */
    public String getAlbumArtFormat() {
        return albumArtFormat;
    }
    
    /**
     * The format of album art, if any. Valid formats are <code>.jpg</code>
     * and <code>.png</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     *
     * @param albumArtFormat The format of album art, if any. Valid formats are <code>.jpg</code>
     *         and <code>.png</code>.
     */
    public void setAlbumArtFormat(String albumArtFormat) {
        this.albumArtFormat = albumArtFormat;
    }
    
    /**
     * The format of album art, if any. Valid formats are <code>.jpg</code>
     * and <code>.png</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^jpg$)|(^png$)<br/>
     *
     * @param albumArtFormat The format of album art, if any. Valid formats are <code>.jpg</code>
     *         and <code>.png</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Artwork withAlbumArtFormat(String albumArtFormat) {
        this.albumArtFormat = albumArtFormat;
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
        if (getInputKey() != null) sb.append("InputKey: " + getInputKey() + ",");
        if (getMaxWidth() != null) sb.append("MaxWidth: " + getMaxWidth() + ",");
        if (getMaxHeight() != null) sb.append("MaxHeight: " + getMaxHeight() + ",");
        if (getSizingPolicy() != null) sb.append("SizingPolicy: " + getSizingPolicy() + ",");
        if (getPaddingPolicy() != null) sb.append("PaddingPolicy: " + getPaddingPolicy() + ",");
        if (getAlbumArtFormat() != null) sb.append("AlbumArtFormat: " + getAlbumArtFormat() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInputKey() == null) ? 0 : getInputKey().hashCode()); 
        hashCode = prime * hashCode + ((getMaxWidth() == null) ? 0 : getMaxWidth().hashCode()); 
        hashCode = prime * hashCode + ((getMaxHeight() == null) ? 0 : getMaxHeight().hashCode()); 
        hashCode = prime * hashCode + ((getSizingPolicy() == null) ? 0 : getSizingPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getPaddingPolicy() == null) ? 0 : getPaddingPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getAlbumArtFormat() == null) ? 0 : getAlbumArtFormat().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Artwork == false) return false;
        Artwork other = (Artwork)obj;
        
        if (other.getInputKey() == null ^ this.getInputKey() == null) return false;
        if (other.getInputKey() != null && other.getInputKey().equals(this.getInputKey()) == false) return false; 
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null) return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false) return false; 
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null) return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false) return false; 
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null) return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false) return false; 
        if (other.getPaddingPolicy() == null ^ this.getPaddingPolicy() == null) return false;
        if (other.getPaddingPolicy() != null && other.getPaddingPolicy().equals(this.getPaddingPolicy()) == false) return false; 
        if (other.getAlbumArtFormat() == null ^ this.getAlbumArtFormat() == null) return false;
        if (other.getAlbumArtFormat() != null && other.getAlbumArtFormat().equals(this.getAlbumArtFormat()) == false) return false; 
        return true;
    }
    
}
    