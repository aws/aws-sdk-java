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
 * Information about the file that you're transcoding.
 * </p>
 */
public class JobInput implements Serializable {

    /**
     * The name of the file to transcode. Elsewhere in the body of the JSON
     * block is the the ID of the pipeline to use for processing the job. The
     * <code>InputBucket</code> object in that pipeline tells Elastic
     * Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     * name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     * include the prefix in the key. If the file isn't in the specified
     * bucket, Elastic Transcoder returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String key;

    /**
     * The frame rate of the input file. If you want Elastic Transcoder to
     * automatically detect the frame rate of the input file, specify
     * <code>auto</code>. If you want to specify the frame rate for the input
     * file, enter one of the following values: <p> <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * a value other than <code>auto</code>, Elastic Transcoder disables
     * automatic detection of the frame rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     */
    private String frameRate;

    /**
     * This value must be <code>auto</code>, which causes Elastic Transcoder
     * to automatically detect the resolution of the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     */
    private String resolution;

    /**
     * The aspect ratio of the input file. If you want Elastic Transcoder to
     * automatically detect the aspect ratio of the input file, specify
     * <code>auto</code>. If you want to specify the aspect ratio for the
     * output file, enter one of the following values: <p> <code>1:1</code>,
     * <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     * specify a value other than <code>auto</code>, Elastic Transcoder
     * disables automatic detection of the aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     */
    private String aspectRatio;

    /**
     * Whether the input file is interlaced. If you want Elastic Transcoder
     * to automatically detect whether the input file is interlaced, specify
     * <code>auto</code>. If you want to specify whether the input file is
     * interlaced, enter one of the following values: <p><code>true</code>,
     * <code>false</code> <p>If you specify a value other than
     * <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^true$)|(^false$)<br/>
     */
    private String interlaced;

    /**
     * The container type for the input file. If you want Elastic Transcoder
     * to automatically detect the container type of the input file, specify
     * <code>auto</code>. If you want to specify the container type for the
     * input file, enter one of the following values: <p> <code>3gp</code>,
     * <code>aac</code>, <code>asf</code>, <code>avi</code>,
     * <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     * <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     * <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     * <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     * <code>vob</code>, <code>wav</code>, <code>webm</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)<br/>
     */
    private String container;

    /**
     * The name of the file to transcode. Elsewhere in the body of the JSON
     * block is the the ID of the pipeline to use for processing the job. The
     * <code>InputBucket</code> object in that pipeline tells Elastic
     * Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     * name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     * include the prefix in the key. If the file isn't in the specified
     * bucket, Elastic Transcoder returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name of the file to transcode. Elsewhere in the body of the JSON
     *         block is the the ID of the pipeline to use for processing the job. The
     *         <code>InputBucket</code> object in that pipeline tells Elastic
     *         Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     *         name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     *         include the prefix in the key. If the file isn't in the specified
     *         bucket, Elastic Transcoder returns an error.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The name of the file to transcode. Elsewhere in the body of the JSON
     * block is the the ID of the pipeline to use for processing the job. The
     * <code>InputBucket</code> object in that pipeline tells Elastic
     * Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     * name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     * include the prefix in the key. If the file isn't in the specified
     * bucket, Elastic Transcoder returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name of the file to transcode. Elsewhere in the body of the JSON
     *         block is the the ID of the pipeline to use for processing the job. The
     *         <code>InputBucket</code> object in that pipeline tells Elastic
     *         Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     *         name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     *         include the prefix in the key. If the file isn't in the specified
     *         bucket, Elastic Transcoder returns an error.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The name of the file to transcode. Elsewhere in the body of the JSON
     * block is the the ID of the pipeline to use for processing the job. The
     * <code>InputBucket</code> object in that pipeline tells Elastic
     * Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     * name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     * include the prefix in the key. If the file isn't in the specified
     * bucket, Elastic Transcoder returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name of the file to transcode. Elsewhere in the body of the JSON
     *         block is the the ID of the pipeline to use for processing the job. The
     *         <code>InputBucket</code> object in that pipeline tells Elastic
     *         Transcoder which Amazon S3 bucket to get the file from. <p>If the file
     *         name includes a prefix, such as <code>cooking/lasagna.mpg</code>,
     *         include the prefix in the key. If the file isn't in the specified
     *         bucket, Elastic Transcoder returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobInput withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The frame rate of the input file. If you want Elastic Transcoder to
     * automatically detect the frame rate of the input file, specify
     * <code>auto</code>. If you want to specify the frame rate for the input
     * file, enter one of the following values: <p> <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * a value other than <code>auto</code>, Elastic Transcoder disables
     * automatic detection of the frame rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @return The frame rate of the input file. If you want Elastic Transcoder to
     *         automatically detect the frame rate of the input file, specify
     *         <code>auto</code>. If you want to specify the frame rate for the input
     *         file, enter one of the following values: <p> <code>10</code>,
     *         <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     *         a value other than <code>auto</code>, Elastic Transcoder disables
     *         automatic detection of the frame rate.
     */
    public String getFrameRate() {
        return frameRate;
    }
    
    /**
     * The frame rate of the input file. If you want Elastic Transcoder to
     * automatically detect the frame rate of the input file, specify
     * <code>auto</code>. If you want to specify the frame rate for the input
     * file, enter one of the following values: <p> <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * a value other than <code>auto</code>, Elastic Transcoder disables
     * automatic detection of the frame rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @param frameRate The frame rate of the input file. If you want Elastic Transcoder to
     *         automatically detect the frame rate of the input file, specify
     *         <code>auto</code>. If you want to specify the frame rate for the input
     *         file, enter one of the following values: <p> <code>10</code>,
     *         <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     *         a value other than <code>auto</code>, Elastic Transcoder disables
     *         automatic detection of the frame rate.
     */
    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }
    
    /**
     * The frame rate of the input file. If you want Elastic Transcoder to
     * automatically detect the frame rate of the input file, specify
     * <code>auto</code>. If you want to specify the frame rate for the input
     * file, enter one of the following values: <p> <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * a value other than <code>auto</code>, Elastic Transcoder disables
     * automatic detection of the frame rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @param frameRate The frame rate of the input file. If you want Elastic Transcoder to
     *         automatically detect the frame rate of the input file, specify
     *         <code>auto</code>. If you want to specify the frame rate for the input
     *         file, enter one of the following values: <p> <code>10</code>,
     *         <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     *         a value other than <code>auto</code>, Elastic Transcoder disables
     *         automatic detection of the frame rate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobInput withFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * This value must be <code>auto</code>, which causes Elastic Transcoder
     * to automatically detect the resolution of the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     *
     * @return This value must be <code>auto</code>, which causes Elastic Transcoder
     *         to automatically detect the resolution of the input file.
     */
    public String getResolution() {
        return resolution;
    }
    
    /**
     * This value must be <code>auto</code>, which causes Elastic Transcoder
     * to automatically detect the resolution of the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     *
     * @param resolution This value must be <code>auto</code>, which causes Elastic Transcoder
     *         to automatically detect the resolution of the input file.
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    /**
     * This value must be <code>auto</code>, which causes Elastic Transcoder
     * to automatically detect the resolution of the input file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     *
     * @param resolution This value must be <code>auto</code>, which causes Elastic Transcoder
     *         to automatically detect the resolution of the input file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobInput withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * The aspect ratio of the input file. If you want Elastic Transcoder to
     * automatically detect the aspect ratio of the input file, specify
     * <code>auto</code>. If you want to specify the aspect ratio for the
     * output file, enter one of the following values: <p> <code>1:1</code>,
     * <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     * specify a value other than <code>auto</code>, Elastic Transcoder
     * disables automatic detection of the aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @return The aspect ratio of the input file. If you want Elastic Transcoder to
     *         automatically detect the aspect ratio of the input file, specify
     *         <code>auto</code>. If you want to specify the aspect ratio for the
     *         output file, enter one of the following values: <p> <code>1:1</code>,
     *         <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     *         specify a value other than <code>auto</code>, Elastic Transcoder
     *         disables automatic detection of the aspect ratio.
     */
    public String getAspectRatio() {
        return aspectRatio;
    }
    
    /**
     * The aspect ratio of the input file. If you want Elastic Transcoder to
     * automatically detect the aspect ratio of the input file, specify
     * <code>auto</code>. If you want to specify the aspect ratio for the
     * output file, enter one of the following values: <p> <code>1:1</code>,
     * <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     * specify a value other than <code>auto</code>, Elastic Transcoder
     * disables automatic detection of the aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio The aspect ratio of the input file. If you want Elastic Transcoder to
     *         automatically detect the aspect ratio of the input file, specify
     *         <code>auto</code>. If you want to specify the aspect ratio for the
     *         output file, enter one of the following values: <p> <code>1:1</code>,
     *         <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     *         specify a value other than <code>auto</code>, Elastic Transcoder
     *         disables automatic detection of the aspect ratio.
     */
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
    
    /**
     * The aspect ratio of the input file. If you want Elastic Transcoder to
     * automatically detect the aspect ratio of the input file, specify
     * <code>auto</code>. If you want to specify the aspect ratio for the
     * output file, enter one of the following values: <p> <code>1:1</code>,
     * <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     * specify a value other than <code>auto</code>, Elastic Transcoder
     * disables automatic detection of the aspect ratio.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio The aspect ratio of the input file. If you want Elastic Transcoder to
     *         automatically detect the aspect ratio of the input file, specify
     *         <code>auto</code>. If you want to specify the aspect ratio for the
     *         output file, enter one of the following values: <p> <code>1:1</code>,
     *         <code>4:3</code>, <code>3:2</code>, <code>16:9</code> <p> If you
     *         specify a value other than <code>auto</code>, Elastic Transcoder
     *         disables automatic detection of the aspect ratio.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobInput withAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    /**
     * Whether the input file is interlaced. If you want Elastic Transcoder
     * to automatically detect whether the input file is interlaced, specify
     * <code>auto</code>. If you want to specify whether the input file is
     * interlaced, enter one of the following values: <p><code>true</code>,
     * <code>false</code> <p>If you specify a value other than
     * <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^true$)|(^false$)<br/>
     *
     * @return Whether the input file is interlaced. If you want Elastic Transcoder
     *         to automatically detect whether the input file is interlaced, specify
     *         <code>auto</code>. If you want to specify whether the input file is
     *         interlaced, enter one of the following values: <p><code>true</code>,
     *         <code>false</code> <p>If you specify a value other than
     *         <code>auto</code>, Elastic Transcoder disables automatic detection of
     *         interlacing.
     */
    public String getInterlaced() {
        return interlaced;
    }
    
    /**
     * Whether the input file is interlaced. If you want Elastic Transcoder
     * to automatically detect whether the input file is interlaced, specify
     * <code>auto</code>. If you want to specify whether the input file is
     * interlaced, enter one of the following values: <p><code>true</code>,
     * <code>false</code> <p>If you specify a value other than
     * <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^true$)|(^false$)<br/>
     *
     * @param interlaced Whether the input file is interlaced. If you want Elastic Transcoder
     *         to automatically detect whether the input file is interlaced, specify
     *         <code>auto</code>. If you want to specify whether the input file is
     *         interlaced, enter one of the following values: <p><code>true</code>,
     *         <code>false</code> <p>If you specify a value other than
     *         <code>auto</code>, Elastic Transcoder disables automatic detection of
     *         interlacing.
     */
    public void setInterlaced(String interlaced) {
        this.interlaced = interlaced;
    }
    
    /**
     * Whether the input file is interlaced. If you want Elastic Transcoder
     * to automatically detect whether the input file is interlaced, specify
     * <code>auto</code>. If you want to specify whether the input file is
     * interlaced, enter one of the following values: <p><code>true</code>,
     * <code>false</code> <p>If you specify a value other than
     * <code>auto</code>, Elastic Transcoder disables automatic detection of
     * interlacing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^true$)|(^false$)<br/>
     *
     * @param interlaced Whether the input file is interlaced. If you want Elastic Transcoder
     *         to automatically detect whether the input file is interlaced, specify
     *         <code>auto</code>. If you want to specify whether the input file is
     *         interlaced, enter one of the following values: <p><code>true</code>,
     *         <code>false</code> <p>If you specify a value other than
     *         <code>auto</code>, Elastic Transcoder disables automatic detection of
     *         interlacing.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobInput withInterlaced(String interlaced) {
        this.interlaced = interlaced;
        return this;
    }

    /**
     * The container type for the input file. If you want Elastic Transcoder
     * to automatically detect the container type of the input file, specify
     * <code>auto</code>. If you want to specify the container type for the
     * input file, enter one of the following values: <p> <code>3gp</code>,
     * <code>aac</code>, <code>asf</code>, <code>avi</code>,
     * <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     * <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     * <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     * <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     * <code>vob</code>, <code>wav</code>, <code>webm</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)<br/>
     *
     * @return The container type for the input file. If you want Elastic Transcoder
     *         to automatically detect the container type of the input file, specify
     *         <code>auto</code>. If you want to specify the container type for the
     *         input file, enter one of the following values: <p> <code>3gp</code>,
     *         <code>aac</code>, <code>asf</code>, <code>avi</code>,
     *         <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     *         <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     *         <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     *         <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     *         <code>vob</code>, <code>wav</code>, <code>webm</code>
     */
    public String getContainer() {
        return container;
    }
    
    /**
     * The container type for the input file. If you want Elastic Transcoder
     * to automatically detect the container type of the input file, specify
     * <code>auto</code>. If you want to specify the container type for the
     * input file, enter one of the following values: <p> <code>3gp</code>,
     * <code>aac</code>, <code>asf</code>, <code>avi</code>,
     * <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     * <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     * <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     * <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     * <code>vob</code>, <code>wav</code>, <code>webm</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)<br/>
     *
     * @param container The container type for the input file. If you want Elastic Transcoder
     *         to automatically detect the container type of the input file, specify
     *         <code>auto</code>. If you want to specify the container type for the
     *         input file, enter one of the following values: <p> <code>3gp</code>,
     *         <code>aac</code>, <code>asf</code>, <code>avi</code>,
     *         <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     *         <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     *         <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     *         <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     *         <code>vob</code>, <code>wav</code>, <code>webm</code>
     */
    public void setContainer(String container) {
        this.container = container;
    }
    
    /**
     * The container type for the input file. If you want Elastic Transcoder
     * to automatically detect the container type of the input file, specify
     * <code>auto</code>. If you want to specify the container type for the
     * input file, enter one of the following values: <p> <code>3gp</code>,
     * <code>aac</code>, <code>asf</code>, <code>avi</code>,
     * <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     * <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     * <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     * <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     * <code>vob</code>, <code>wav</code>, <code>webm</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)<br/>
     *
     * @param container The container type for the input file. If you want Elastic Transcoder
     *         to automatically detect the container type of the input file, specify
     *         <code>auto</code>. If you want to specify the container type for the
     *         input file, enter one of the following values: <p> <code>3gp</code>,
     *         <code>aac</code>, <code>asf</code>, <code>avi</code>,
     *         <code>divx</code>, <code>flv</code>, <code>m4a</code>,
     *         <code>mkv</code>, <code>mov</code>, <code>mp3</code>,
     *         <code>mp4</code>, <code>mpeg</code>, <code>mpeg-ps</code>,
     *         <code>mpeg-ts</code>, <code>mxf</code>, <code>ogg</code>,
     *         <code>vob</code>, <code>wav</code>, <code>webm</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobInput withContainer(String container) {
        this.container = container;
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
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getFrameRate() != null) sb.append("FrameRate: " + getFrameRate() + ",");
        if (getResolution() != null) sb.append("Resolution: " + getResolution() + ",");
        if (getAspectRatio() != null) sb.append("AspectRatio: " + getAspectRatio() + ",");
        if (getInterlaced() != null) sb.append("Interlaced: " + getInterlaced() + ",");
        if (getContainer() != null) sb.append("Container: " + getContainer() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobInput == false) return false;
        JobInput other = (JobInput)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getFrameRate() == null ^ this.getFrameRate() == null) return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false) return false; 
        if (other.getResolution() == null ^ this.getResolution() == null) return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false) return false; 
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null) return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false) return false; 
        if (other.getInterlaced() == null ^ this.getInterlaced() == null) return false;
        if (other.getInterlaced() != null && other.getInterlaced().equals(this.getInterlaced()) == false) return false; 
        if (other.getContainer() == null ^ this.getContainer() == null) return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false) return false; 
        return true;
    }
    
}
    