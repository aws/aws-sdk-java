/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the file that you're transcoding.
 * </p>
 */
public class JobInput implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline to use
     * for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic Transcoder which
     * Amazon S3 bucket to get the file from.
     * </p>
     * <p>
     * If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of the
     * input file, specify <code>auto</code>. If you want to specify the frame rate for the input file, enter one of the
     * following values:
     * </p>
     * <p>
     * <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     * <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the frame
     * rate.
     * </p>
     */
    private String frameRate;
    /**
     * <p>
     * This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the resolution of
     * the input file.
     * </p>
     */
    private String resolution;
    /**
     * <p>
     * The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect ratio of
     * the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the output file, enter one
     * of the following values:
     * </p>
     * <p>
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the
     * aspect ratio.
     * </p>
     */
    private String aspectRatio;
    /**
     * <p>
     * Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the input
     * file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is interlaced, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>true</code>, <code>false</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * </p>
     */
    private String interlaced;
    /**
     * <p>
     * The container type for the input file. If you want Elastic Transcoder to automatically detect the container type
     * of the input file, specify <code>auto</code>. If you want to specify the container type for the input file, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>, <code>flv</code>,
     * <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>, <code>mp4</code>, <code>mpeg</code>,
     * <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>, <code>vob</code>,
     * <code>wav</code>, <code>webm</code>
     * </p>
     */
    private String container;
    /**
     * <p>
     * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted,
     * you must specify the mode that Elastic Transcoder will use to decrypt your file.
     * </p>
     */
    private Encryption encryption;
    /**
     * <p>
     * The detected properties of the input file.
     * </p>
     */
    private DetectedProperties detectedProperties;

    /**
     * <p>
     * The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline to use
     * for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic Transcoder which
     * Amazon S3 bucket to get the file from.
     * </p>
     * <p>
     * If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @param key
     *        The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline
     *        to use for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic
     *        Transcoder which Amazon S3 bucket to get the file from. </p>
     *        <p>
     *        If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the
     *        key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline to use
     * for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic Transcoder which
     * Amazon S3 bucket to get the file from.
     * </p>
     * <p>
     * If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @return The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline
     *         to use for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic
     *         Transcoder which Amazon S3 bucket to get the file from. </p>
     *         <p>
     *         If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the
     *         key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline to use
     * for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic Transcoder which
     * Amazon S3 bucket to get the file from.
     * </p>
     * <p>
     * If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the key. If
     * the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @param key
     *        The name of the file to transcode. Elsewhere in the body of the JSON block is the the ID of the pipeline
     *        to use for processing the job. The <code>InputBucket</code> object in that pipeline tells Elastic
     *        Transcoder which Amazon S3 bucket to get the file from. </p>
     *        <p>
     *        If the file name includes a prefix, such as <code>cooking/lasagna.mpg</code>, include the prefix in the
     *        key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of the
     * input file, specify <code>auto</code>. If you want to specify the frame rate for the input file, enter one of the
     * following values:
     * </p>
     * <p>
     * <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     * <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the frame
     * rate.
     * </p>
     * 
     * @param frameRate
     *        The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of
     *        the input file, specify <code>auto</code>. If you want to specify the frame rate for the input file, enter
     *        one of the following values: </p>
     *        <p>
     *        <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>, <code>60</code>
     *        </p>
     *        <p>
     *        If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *        the frame rate.
     */

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * <p>
     * The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of the
     * input file, specify <code>auto</code>. If you want to specify the frame rate for the input file, enter one of the
     * following values:
     * </p>
     * <p>
     * <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     * <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the frame
     * rate.
     * </p>
     * 
     * @return The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate
     *         of the input file, specify <code>auto</code>. If you want to specify the frame rate for the input file,
     *         enter one of the following values: </p>
     *         <p>
     *         <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code>
     *         </p>
     *         <p>
     *         If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *         the frame rate.
     */

    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * <p>
     * The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of the
     * input file, specify <code>auto</code>. If you want to specify the frame rate for the input file, enter one of the
     * following values:
     * </p>
     * <p>
     * <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     * <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the frame
     * rate.
     * </p>
     * 
     * @param frameRate
     *        The frame rate of the input file. If you want Elastic Transcoder to automatically detect the frame rate of
     *        the input file, specify <code>auto</code>. If you want to specify the frame rate for the input file, enter
     *        one of the following values: </p>
     *        <p>
     *        <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>, <code>60</code>
     *        </p>
     *        <p>
     *        If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *        the frame rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withFrameRate(String frameRate) {
        setFrameRate(frameRate);
        return this;
    }

    /**
     * <p>
     * This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the resolution of
     * the input file.
     * </p>
     * 
     * @param resolution
     *        This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the
     *        resolution of the input file.
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <p>
     * This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the resolution of
     * the input file.
     * </p>
     * 
     * @return This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the
     *         resolution of the input file.
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <p>
     * This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the resolution of
     * the input file.
     * </p>
     * 
     * @param resolution
     *        This value must be <code>auto</code>, which causes Elastic Transcoder to automatically detect the
     *        resolution of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <p>
     * The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect ratio of
     * the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the output file, enter one
     * of the following values:
     * </p>
     * <p>
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the
     * aspect ratio.
     * </p>
     * 
     * @param aspectRatio
     *        The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect
     *        ratio of the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the output
     *        file, enter one of the following values: </p>
     *        <p>
     *        <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *        </p>
     *        <p>
     *        If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *        the aspect ratio.
     */

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * <p>
     * The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect ratio of
     * the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the output file, enter one
     * of the following values:
     * </p>
     * <p>
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the
     * aspect ratio.
     * </p>
     * 
     * @return The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect
     *         ratio of the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the
     *         output file, enter one of the following values: </p>
     *         <p>
     *         <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *         </p>
     *         <p>
     *         If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *         the aspect ratio.
     */

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * <p>
     * The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect ratio of
     * the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the output file, enter one
     * of the following values:
     * </p>
     * <p>
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of the
     * aspect ratio.
     * </p>
     * 
     * @param aspectRatio
     *        The aspect ratio of the input file. If you want Elastic Transcoder to automatically detect the aspect
     *        ratio of the input file, specify <code>auto</code>. If you want to specify the aspect ratio for the output
     *        file, enter one of the following values: </p>
     *        <p>
     *        <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *        </p>
     *        <p>
     *        If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *        the aspect ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withAspectRatio(String aspectRatio) {
        setAspectRatio(aspectRatio);
        return this;
    }

    /**
     * <p>
     * Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the input
     * file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is interlaced, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>true</code>, <code>false</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * </p>
     * 
     * @param interlaced
     *        Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the
     *        input file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is
     *        interlaced, enter one of the following values:</p>
     *        <p>
     *        <code>true</code>, <code>false</code>
     *        </p>
     *        <p>
     *        If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *        interlacing.
     */

    public void setInterlaced(String interlaced) {
        this.interlaced = interlaced;
    }

    /**
     * <p>
     * Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the input
     * file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is interlaced, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>true</code>, <code>false</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * </p>
     * 
     * @return Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the
     *         input file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is
     *         interlaced, enter one of the following values:</p>
     *         <p>
     *         <code>true</code>, <code>false</code>
     *         </p>
     *         <p>
     *         If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *         interlacing.
     */

    public String getInterlaced() {
        return this.interlaced;
    }

    /**
     * <p>
     * Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the input
     * file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is interlaced, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>true</code>, <code>false</code>
     * </p>
     * <p>
     * If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * </p>
     * 
     * @param interlaced
     *        Whether the input file is interlaced. If you want Elastic Transcoder to automatically detect whether the
     *        input file is interlaced, specify <code>auto</code>. If you want to specify whether the input file is
     *        interlaced, enter one of the following values:</p>
     *        <p>
     *        <code>true</code>, <code>false</code>
     *        </p>
     *        <p>
     *        If you specify a value other than <code>auto</code>, Elastic Transcoder disables automatic detection of
     *        interlacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withInterlaced(String interlaced) {
        setInterlaced(interlaced);
        return this;
    }

    /**
     * <p>
     * The container type for the input file. If you want Elastic Transcoder to automatically detect the container type
     * of the input file, specify <code>auto</code>. If you want to specify the container type for the input file, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>, <code>flv</code>,
     * <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>, <code>mp4</code>, <code>mpeg</code>,
     * <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>, <code>vob</code>,
     * <code>wav</code>, <code>webm</code>
     * </p>
     * 
     * @param container
     *        The container type for the input file. If you want Elastic Transcoder to automatically detect the
     *        container type of the input file, specify <code>auto</code>. If you want to specify the container type for
     *        the input file, enter one of the following values: </p>
     *        <p>
     *        <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>,
     *        <code>flv</code>, <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>, <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     *        <code>vob</code>, <code>wav</code>, <code>webm</code>
     */

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * <p>
     * The container type for the input file. If you want Elastic Transcoder to automatically detect the container type
     * of the input file, specify <code>auto</code>. If you want to specify the container type for the input file, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>, <code>flv</code>,
     * <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>, <code>mp4</code>, <code>mpeg</code>,
     * <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>, <code>vob</code>,
     * <code>wav</code>, <code>webm</code>
     * </p>
     * 
     * @return The container type for the input file. If you want Elastic Transcoder to automatically detect the
     *         container type of the input file, specify <code>auto</code>. If you want to specify the container type
     *         for the input file, enter one of the following values: </p>
     *         <p>
     *         <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>,
     *         <code>flv</code>, <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     *         <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>,
     *         <code>ogg</code>, <code>vob</code>, <code>wav</code>, <code>webm</code>
     */

    public String getContainer() {
        return this.container;
    }

    /**
     * <p>
     * The container type for the input file. If you want Elastic Transcoder to automatically detect the container type
     * of the input file, specify <code>auto</code>. If you want to specify the container type for the input file, enter
     * one of the following values:
     * </p>
     * <p>
     * <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>, <code>flv</code>,
     * <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>, <code>mp4</code>, <code>mpeg</code>,
     * <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>, <code>vob</code>,
     * <code>wav</code>, <code>webm</code>
     * </p>
     * 
     * @param container
     *        The container type for the input file. If you want Elastic Transcoder to automatically detect the
     *        container type of the input file, specify <code>auto</code>. If you want to specify the container type for
     *        the input file, enter one of the following values: </p>
     *        <p>
     *        <code>3gp</code>, <code>aac</code>, <code>asf</code>, <code>avi</code>, <code>divx</code>,
     *        <code>flv</code>, <code>m4a</code>, <code>mkv</code>, <code>mov</code>, <code>mp3</code>, <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>, <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     *        <code>vob</code>, <code>wav</code>, <code>webm</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withContainer(String container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted,
     * you must specify the mode that Elastic Transcoder will use to decrypt your file.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that are used for decrypting your input files. If your input file is
     *        encrypted, you must specify the mode that Elastic Transcoder will use to decrypt your file.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted,
     * you must specify the mode that Elastic Transcoder will use to decrypt your file.
     * </p>
     * 
     * @return The encryption settings, if any, that are used for decrypting your input files. If your input file is
     *         encrypted, you must specify the mode that Elastic Transcoder will use to decrypt your file.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted,
     * you must specify the mode that Elastic Transcoder will use to decrypt your file.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that are used for decrypting your input files. If your input file is
     *        encrypted, you must specify the mode that Elastic Transcoder will use to decrypt your file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * <p>
     * The detected properties of the input file.
     * </p>
     * 
     * @param detectedProperties
     *        The detected properties of the input file.
     */

    public void setDetectedProperties(DetectedProperties detectedProperties) {
        this.detectedProperties = detectedProperties;
    }

    /**
     * <p>
     * The detected properties of the input file.
     * </p>
     * 
     * @return The detected properties of the input file.
     */

    public DetectedProperties getDetectedProperties() {
        return this.detectedProperties;
    }

    /**
     * <p>
     * The detected properties of the input file.
     * </p>
     * 
     * @param detectedProperties
     *        The detected properties of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withDetectedProperties(DetectedProperties detectedProperties) {
        setDetectedProperties(detectedProperties);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getFrameRate() != null)
            sb.append("FrameRate: " + getFrameRate() + ",");
        if (getResolution() != null)
            sb.append("Resolution: " + getResolution() + ",");
        if (getAspectRatio() != null)
            sb.append("AspectRatio: " + getAspectRatio() + ",");
        if (getInterlaced() != null)
            sb.append("Interlaced: " + getInterlaced() + ",");
        if (getContainer() != null)
            sb.append("Container: " + getContainer() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getDetectedProperties() != null)
            sb.append("DetectedProperties: " + getDetectedProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobInput == false)
            return false;
        JobInput other = (JobInput) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null)
            return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false)
            return false;
        if (other.getInterlaced() == null ^ this.getInterlaced() == null)
            return false;
        if (other.getInterlaced() != null && other.getInterlaced().equals(this.getInterlaced()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getDetectedProperties() == null ^ this.getDetectedProperties() == null)
            return false;
        if (other.getDetectedProperties() != null && other.getDetectedProperties().equals(this.getDetectedProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getAspectRatio() == null) ? 0 : getAspectRatio().hashCode());
        hashCode = prime * hashCode + ((getInterlaced() == null) ? 0 : getInterlaced().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getDetectedProperties() == null) ? 0 : getDetectedProperties().hashCode());
        return hashCode;
    }

    @Override
    public JobInput clone() {
        try {
            return (JobInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
