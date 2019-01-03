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
 * Information about the file that you're transcoding.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobInput implements Serializable, Cloneable, StructuredPojo {

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
     * you must specify the mode that Elastic Transcoder uses to decrypt your file.
     * </p>
     */
    private Encryption encryption;
    /**
     * <p>
     * Settings for clipping an input. Each input can have different clip settings.
     * </p>
     */
    private TimeSpan timeSpan;
    /**
     * <p>
     * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     * captions must be in UTF-8. Elastic Transcoder supports two types of captions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic Transcoder
     * supports only one embedded caption per language, to a maximum of 300 embedded captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     * <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     * </p>
     * <p>
     * Valid outputs include: <code>mov-text</code>
     * </p>
     * <p>
     * Elastic Transcoder supports a maximum of one embedded format per output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar
     * captions require a player that is capable of understanding the relationship between the video file and the
     * sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar
     * captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>, <code>scc</code>,
     * <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and <code>webvtt</code>
     * </p>
     * <p>
     * Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>, and
     * <code>webvtt</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <p>
     * Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid
     * input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text
     * formatting (for example, italics) during the transcoding process.
     * </p>
     * <p>
     * To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through existing
     * captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a null
     * <code>CaptionSources</code> array.
     * </p>
     * <p>
     * For more information on embedded files, see the Subtitles Wikipedia page.
     * </p>
     * <p>
     * For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
     * </p>
     */
    private InputCaptions inputCaptions;
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
     * you must specify the mode that Elastic Transcoder uses to decrypt your file.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that are used for decrypting your input files. If your input file is
     *        encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted,
     * you must specify the mode that Elastic Transcoder uses to decrypt your file.
     * </p>
     * 
     * @return The encryption settings, if any, that are used for decrypting your input files. If your input file is
     *         encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that are used for decrypting your input files. If your input file is encrypted,
     * you must specify the mode that Elastic Transcoder uses to decrypt your file.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that are used for decrypting your input files. If your input file is
     *        encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * <p>
     * Settings for clipping an input. Each input can have different clip settings.
     * </p>
     * 
     * @param timeSpan
     *        Settings for clipping an input. Each input can have different clip settings.
     */

    public void setTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
    }

    /**
     * <p>
     * Settings for clipping an input. Each input can have different clip settings.
     * </p>
     * 
     * @return Settings for clipping an input. Each input can have different clip settings.
     */

    public TimeSpan getTimeSpan() {
        return this.timeSpan;
    }

    /**
     * <p>
     * Settings for clipping an input. Each input can have different clip settings.
     * </p>
     * 
     * @param timeSpan
     *        Settings for clipping an input. Each input can have different clip settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withTimeSpan(TimeSpan timeSpan) {
        setTimeSpan(timeSpan);
        return this;
    }

    /**
     * <p>
     * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     * captions must be in UTF-8. Elastic Transcoder supports two types of captions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic Transcoder
     * supports only one embedded caption per language, to a maximum of 300 embedded captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     * <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     * </p>
     * <p>
     * Valid outputs include: <code>mov-text</code>
     * </p>
     * <p>
     * Elastic Transcoder supports a maximum of one embedded format per output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar
     * captions require a player that is capable of understanding the relationship between the video file and the
     * sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar
     * captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>, <code>scc</code>,
     * <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and <code>webvtt</code>
     * </p>
     * <p>
     * Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>, and
     * <code>webvtt</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <p>
     * Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid
     * input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text
     * formatting (for example, italics) during the transcoding process.
     * </p>
     * <p>
     * To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through existing
     * captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a null
     * <code>CaptionSources</code> array.
     * </p>
     * <p>
     * For more information on embedded files, see the Subtitles Wikipedia page.
     * </p>
     * <p>
     * For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
     * </p>
     * 
     * @param inputCaptions
     *        You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     *        captions must be in UTF-8. Elastic Transcoder supports two types of captions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic
     *        Transcoder supports only one embedded caption per language, to a maximum of 300 embedded captions per
     *        file.
     *        </p>
     *        <p>
     *        Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     *        <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     *        </p>
     *        <p>
     *        Valid outputs include: <code>mov-text</code>
     *        </p>
     *        <p>
     *        Elastic Transcoder supports a maximum of one embedded format per output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data.
     *        Sidecar captions require a player that is capable of understanding the relationship between the video file
     *        and the sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of
     *        20 sidecar captions per file.
     *        </p>
     *        <p>
     *        Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>,
     *        <code>scc</code>, <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and
     *        <code>webvtt</code>
     *        </p>
     *        <p>
     *        Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>, and
     *        <code>webvtt</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     *        </p>
     *        <p>
     *        Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a
     *        valid input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not
     *        preserve text formatting (for example, italics) during the transcoding process.
     *        </p>
     *        <p>
     *        To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through
     *        existing captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a
     *        null <code>CaptionSources</code> array.
     *        </p>
     *        <p>
     *        For more information on embedded files, see the Subtitles Wikipedia page.
     *        </p>
     *        <p>
     *        For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia
     *        pages.
     */

    public void setInputCaptions(InputCaptions inputCaptions) {
        this.inputCaptions = inputCaptions;
    }

    /**
     * <p>
     * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     * captions must be in UTF-8. Elastic Transcoder supports two types of captions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic Transcoder
     * supports only one embedded caption per language, to a maximum of 300 embedded captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     * <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     * </p>
     * <p>
     * Valid outputs include: <code>mov-text</code>
     * </p>
     * <p>
     * Elastic Transcoder supports a maximum of one embedded format per output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar
     * captions require a player that is capable of understanding the relationship between the video file and the
     * sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar
     * captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>, <code>scc</code>,
     * <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and <code>webvtt</code>
     * </p>
     * <p>
     * Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>, and
     * <code>webvtt</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <p>
     * Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid
     * input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text
     * formatting (for example, italics) during the transcoding process.
     * </p>
     * <p>
     * To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through existing
     * captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a null
     * <code>CaptionSources</code> array.
     * </p>
     * <p>
     * For more information on embedded files, see the Subtitles Wikipedia page.
     * </p>
     * <p>
     * For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
     * </p>
     * 
     * @return You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     *         captions must be in UTF-8. Elastic Transcoder supports two types of captions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic
     *         Transcoder supports only one embedded caption per language, to a maximum of 300 embedded captions per
     *         file.
     *         </p>
     *         <p>
     *         Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     *         <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     *         </p>
     *         <p>
     *         Valid outputs include: <code>mov-text</code>
     *         </p>
     *         <p>
     *         Elastic Transcoder supports a maximum of one embedded format per output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data.
     *         Sidecar captions require a player that is capable of understanding the relationship between the video
     *         file and the sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a
     *         maximum of 20 sidecar captions per file.
     *         </p>
     *         <p>
     *         Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>,
     *         <code>scc</code>, <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and
     *         <code>webvtt</code>
     *         </p>
     *         <p>
     *         Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>,
     *         and <code>webvtt</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     *         </p>
     *         <p>
     *         Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a
     *         valid input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not
     *         preserve text formatting (for example, italics) during the transcoding process.
     *         </p>
     *         <p>
     *         To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through
     *         existing captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a
     *         null <code>CaptionSources</code> array.
     *         </p>
     *         <p>
     *         For more information on embedded files, see the Subtitles Wikipedia page.
     *         </p>
     *         <p>
     *         For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia
     *         pages.
     */

    public InputCaptions getInputCaptions() {
        return this.inputCaptions;
    }

    /**
     * <p>
     * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     * captions must be in UTF-8. Elastic Transcoder supports two types of captions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic Transcoder
     * supports only one embedded caption per language, to a maximum of 300 embedded captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     * <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     * </p>
     * <p>
     * Valid outputs include: <code>mov-text</code>
     * </p>
     * <p>
     * Elastic Transcoder supports a maximum of one embedded format per output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar
     * captions require a player that is capable of understanding the relationship between the video file and the
     * sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar
     * captions per file.
     * </p>
     * <p>
     * Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>, <code>scc</code>,
     * <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and <code>webvtt</code>
     * </p>
     * <p>
     * Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>, and
     * <code>webvtt</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <p>
     * Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid
     * input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text
     * formatting (for example, italics) during the transcoding process.
     * </p>
     * <p>
     * To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through existing
     * captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a null
     * <code>CaptionSources</code> array.
     * </p>
     * <p>
     * For more information on embedded files, see the Subtitles Wikipedia page.
     * </p>
     * <p>
     * For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
     * </p>
     * 
     * @param inputCaptions
     *        You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All
     *        captions must be in UTF-8. Elastic Transcoder supports two types of captions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Embedded:</b> Embedded captions are included in the same file as the audio and video. Elastic
     *        Transcoder supports only one embedded caption per language, to a maximum of 300 embedded captions per
     *        file.
     *        </p>
     *        <p>
     *        Valid input values include: <code>CEA-608 (EIA-608</code>, first non-empty channel only),
     *        <code>CEA-708 (EIA-708</code>, first non-empty channel only), and <code>mov-text</code>
     *        </p>
     *        <p>
     *        Valid outputs include: <code>mov-text</code>
     *        </p>
     *        <p>
     *        Elastic Transcoder supports a maximum of one embedded format per output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Sidecar:</b> Sidecar captions are kept in a separate metadata file from the audio and video data.
     *        Sidecar captions require a player that is capable of understanding the relationship between the video file
     *        and the sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of
     *        20 sidecar captions per file.
     *        </p>
     *        <p>
     *        Valid input values include: <code>dfxp</code> (first div element only), <code>ebu-tt</code>,
     *        <code>scc</code>, <code>smpt</code>, <code>srt</code>, <code>ttml</code> (first div element only), and
     *        <code>webvtt</code>
     *        </p>
     *        <p>
     *        Valid outputs include: <code>dfxp</code> (first div element only), <code>scc</code>, <code>srt</code>, and
     *        <code>webvtt</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     *        </p>
     *        <p>
     *        Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a
     *        valid input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not
     *        preserve text formatting (for example, italics) during the transcoding process.
     *        </p>
     *        <p>
     *        To remove captions or leave the captions empty, set <code>Captions</code> to null. To pass through
     *        existing captions unchanged, set the <code>MergePolicy</code> to <code>MergeRetain</code>, and pass in a
     *        null <code>CaptionSources</code> array.
     *        </p>
     *        <p>
     *        For more information on embedded files, see the Subtitles Wikipedia page.
     *        </p>
     *        <p>
     *        For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia
     *        pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobInput withInputCaptions(InputCaptions inputCaptions) {
        setInputCaptions(inputCaptions);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getFrameRate() != null)
            sb.append("FrameRate: ").append(getFrameRate()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getAspectRatio() != null)
            sb.append("AspectRatio: ").append(getAspectRatio()).append(",");
        if (getInterlaced() != null)
            sb.append("Interlaced: ").append(getInterlaced()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getTimeSpan() != null)
            sb.append("TimeSpan: ").append(getTimeSpan()).append(",");
        if (getInputCaptions() != null)
            sb.append("InputCaptions: ").append(getInputCaptions()).append(",");
        if (getDetectedProperties() != null)
            sb.append("DetectedProperties: ").append(getDetectedProperties());
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
        if (other.getTimeSpan() == null ^ this.getTimeSpan() == null)
            return false;
        if (other.getTimeSpan() != null && other.getTimeSpan().equals(this.getTimeSpan()) == false)
            return false;
        if (other.getInputCaptions() == null ^ this.getInputCaptions() == null)
            return false;
        if (other.getInputCaptions() != null && other.getInputCaptions().equals(this.getInputCaptions()) == false)
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
        hashCode = prime * hashCode + ((getTimeSpan() == null) ? 0 : getTimeSpan().hashCode());
        hashCode = prime * hashCode + ((getInputCaptions() == null) ? 0 : getInputCaptions().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.JobInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
