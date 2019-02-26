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
 * The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20.
 * </p>
 * <p>
 * To remove artwork or leave the artwork empty, you can either set <code>Artwork</code> to null, or set the
 * <code>Merge Policy</code> to "Replace" and use an empty <code>Artwork</code> array.
 * </p>
 * <p>
 * To pass through existing artwork unchanged, set the <code>Merge Policy</code> to "Prepend", "Append", or "Fallback",
 * and use an empty <code>Artwork</code> array.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Artwork implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified file,
     * Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the <code>InputBucket</code> object
     * in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     */
    private String inputKey;
    /**
     * <p>
     * The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * </p>
     */
    private String maxWidth;
    /**
     * <p>
     * The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * </p>
     */
    private String maxHeight;
    /**
     * <p>
     * Specify one of the following values to control scaling of the output album art:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output art and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and the output art
     * are different, the output art will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art exceeds
     * the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder crops the
     * output art.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * </ul>
     */
    private String sizingPolicy;
    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the top and
     * bottom and/or left and right sides of the output album art to make the total size of the output art match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     */
    private String paddingPolicy;
    /**
     * <p>
     * The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     * </p>
     */
    private String albumArtFormat;
    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     * </p>
     */
    private Encryption encryption;

    /**
     * <p>
     * The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified file,
     * Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the <code>InputBucket</code> object
     * in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @param inputKey
     *        The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified
     *        file, Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the
     *        <code>InputBucket</code> object in that pipeline identifies the bucket.</p>
     *        <p>
     *        If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the
     *        key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     */

    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }

    /**
     * <p>
     * The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified file,
     * Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the <code>InputBucket</code> object
     * in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @return The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified
     *         file, Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the
     *         <code>InputBucket</code> object in that pipeline identifies the bucket.</p>
     *         <p>
     *         If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the
     *         key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     */

    public String getInputKey() {
        return this.inputKey;
    }

    /**
     * <p>
     * The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified file,
     * Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the <code>InputBucket</code> object
     * in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @param inputKey
     *        The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified
     *        file, Elastic Transcoder checks the pipeline specified by <code>PipelineId</code>; the
     *        <code>InputBucket</code> object in that pipeline identifies the bucket.</p>
     *        <p>
     *        If the file name includes a prefix, for example, <code>cooking/pie.jpg</code>, include the prefix in the
     *        key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withInputKey(String inputKey) {
        setInputKey(inputKey);
        return this;
    }

    /**
     * <p>
     * The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * </p>
     * 
     * @param maxWidth
     *        The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *        uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096,
     *        inclusive.
     */

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * <p>
     * The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * </p>
     * 
     * @return The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *         uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096,
     *         inclusive.
     */

    public String getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * <p>
     * The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * </p>
     * 
     * @param maxWidth
     *        The maximum width of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *        uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096,
     *        inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withMaxWidth(String maxWidth) {
        setMaxWidth(maxWidth);
        return this;
    }

    /**
     * <p>
     * The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *        uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072,
     *        inclusive.
     */

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
     * <p>
     * The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * </p>
     * 
     * @return The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic
     *         Transcoder uses 600 as the default value. If you specify a numeric value, enter an even integer between
     *         32 and 3072, inclusive.
     */

    public String getMaxHeight() {
        return this.maxHeight;
    }

    /**
     * <p>
     * The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     * 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of the output album art in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *        uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072,
     *        inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withMaxHeight(String maxHeight) {
        setMaxHeight(maxHeight);
        return this;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of the output album art:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output art and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and the output art
     * are different, the output art will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art exceeds
     * the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder crops the
     * output art.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        Specify one of the following values to control scaling of the output album art:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in
     *        either <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in
     *        either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic
     *        Transcoder centers the output art and then crops it in the dimension (if any) that exceeds the maximum
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified
     *        for <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and the
     *        output art are different, the output art will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art
     *        exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic
     *        Transcoder crops the output art.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        exceeding either value. If you specify this option, Elastic Transcoder does not scale the art up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        dropping below either value. If you specify this option, Elastic Transcoder does not scale the art up.
     *        </p>
     *        </li>
     */

    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of the output album art:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output art and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and the output art
     * are different, the output art will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art exceeds
     * the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder crops the
     * output art.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify one of the following values to control scaling of the output album art:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in
     *         either <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in
     *         either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic
     *         Transcoder centers the output art and then crops it in the dimension (if any) that exceeds the maximum
     *         value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified
     *         for <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and
     *         the output art are different, the output art will be distorted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art
     *         exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic
     *         Transcoder crops the output art.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *         exceeding either value. If you specify this option, Elastic Transcoder does not scale the art up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the
     *         values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *         dropping below either value. If you specify this option, Elastic Transcoder does not scale the art up.
     *         </p>
     *         </li>
     */

    public String getSizingPolicy() {
        return this.sizingPolicy;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of the output album art:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output art and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and the output art
     * are different, the output art will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art exceeds
     * the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder crops the
     * output art.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping below
     * either value. If you specify this option, Elastic Transcoder does not scale the art up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        Specify one of the following values to control scaling of the output album art:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fit:</code> Elastic Transcoder scales the output art so it matches the value that you specified in
     *        either <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fill:</code> Elastic Transcoder scales the output art so it matches the value that you specified in
     *        either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic
     *        Transcoder centers the output art and then crops it in the dimension (if any) that exceeds the maximum
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stretch:</code> Elastic Transcoder stretches the output art to match the values that you specified
     *        for <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input art and the
     *        output art are different, the output art will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keep:</code> Elastic Transcoder does not scale the output art. If either dimension of the input art
     *        exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic
     *        Transcoder crops the output art.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFit:</code> Elastic Transcoder scales the output art down so that its dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        exceeding either value. If you specify this option, Elastic Transcoder does not scale the art up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFill</code> Elastic Transcoder scales the output art down so that its dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        dropping below either value. If you specify this option, Elastic Transcoder does not scale the art up.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withSizingPolicy(String sizingPolicy) {
        setSizingPolicy(sizingPolicy);
        return this;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the top and
     * bottom and/or left and right sides of the output album art to make the total size of the output art match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     * 
     * @param paddingPolicy
     *        When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the
     *        top and bottom and/or left and right sides of the output album art to make the total size of the output
     *        art match the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     */

    public void setPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the top and
     * bottom and/or left and right sides of the output album art to make the total size of the output art match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     * 
     * @return When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the
     *         top and bottom and/or left and right sides of the output album art to make the total size of the output
     *         art match the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     */

    public String getPaddingPolicy() {
        return this.paddingPolicy;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the top and
     * bottom and/or left and right sides of the output album art to make the total size of the output art match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     * 
     * @param paddingPolicy
     *        When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add white bars to the
     *        top and bottom and/or left and right sides of the output album art to make the total size of the output
     *        art match the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withPaddingPolicy(String paddingPolicy) {
        setPaddingPolicy(paddingPolicy);
        return this;
    }

    /**
     * <p>
     * The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     * </p>
     * 
     * @param albumArtFormat
     *        The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     */

    public void setAlbumArtFormat(String albumArtFormat) {
        this.albumArtFormat = albumArtFormat;
    }

    /**
     * <p>
     * The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     * </p>
     * 
     * @return The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     */

    public String getAlbumArtFormat() {
        return this.albumArtFormat;
    }

    /**
     * <p>
     * The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     * </p>
     * 
     * @param albumArtFormat
     *        The format of album art, if any. Valid formats are <code>.jpg</code> and <code>.png</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withAlbumArtFormat(String albumArtFormat) {
        setAlbumArtFormat(albumArtFormat);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     * </p>
     * 
     * @return The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artwork withEncryption(Encryption encryption) {
        setEncryption(encryption);
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
        if (getInputKey() != null)
            sb.append("InputKey: ").append(getInputKey()).append(",");
        if (getMaxWidth() != null)
            sb.append("MaxWidth: ").append(getMaxWidth()).append(",");
        if (getMaxHeight() != null)
            sb.append("MaxHeight: ").append(getMaxHeight()).append(",");
        if (getSizingPolicy() != null)
            sb.append("SizingPolicy: ").append(getSizingPolicy()).append(",");
        if (getPaddingPolicy() != null)
            sb.append("PaddingPolicy: ").append(getPaddingPolicy()).append(",");
        if (getAlbumArtFormat() != null)
            sb.append("AlbumArtFormat: ").append(getAlbumArtFormat()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Artwork == false)
            return false;
        Artwork other = (Artwork) obj;
        if (other.getInputKey() == null ^ this.getInputKey() == null)
            return false;
        if (other.getInputKey() != null && other.getInputKey().equals(this.getInputKey()) == false)
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
        if (other.getAlbumArtFormat() == null ^ this.getAlbumArtFormat() == null)
            return false;
        if (other.getAlbumArtFormat() != null && other.getAlbumArtFormat().equals(this.getAlbumArtFormat()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public Artwork clone() {
        try {
            return (Artwork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.ArtworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
