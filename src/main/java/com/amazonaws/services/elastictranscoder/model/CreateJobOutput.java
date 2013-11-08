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
 * The <code>CreateJobOutput</code> structure.
 * </p>
 */
public class CreateJobOutput implements Serializable {

    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID. If a file with the specified name already exists in
     * the output bucket, the job fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String key;

    /**
     * Whether you want Elastic Transcoder to create thumbnails for your
     * videos and, if so, how you want Elastic Transcoder to name the files.
     * <p>If you don't want Elastic Transcoder to create thumbnails, specify
     * "". <p> If you do want Elastic Transcoder to create thumbnails,
     * specify the information that you want to include in the file name for
     * each thumbnail. You can specify the following values in any sequence:
     * <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     * create thumbnails, you must include <code>{count}</code> in the
     * <code>ThumbnailPattern</code> object. Wherever you specify
     * <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     * number (beginning with <b>00001</b>) to thumbnail file names. The
     * number indicates where a given thumbnail appears in the sequence of
     * thumbnails for a transcoded file. <important>If you specify a literal
     * value and/or <code>{resolution}</code> but you omit
     * <code>{count}</code>, Elastic Transcoder returns a validation error
     * and does not create the job.</important> </li> <li> <p> <b>Literal
     * values (Optional)</b>: You can specify literal values anywhere in the
     * <code>ThumbnailPattern</code> object. For example, you can include
     * them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     * <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     * Transcoder to include the resolution in the file name, include
     * <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     * automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code>
     * value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     * the applicable file name extension.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{count\}.*$)<br/>
     */
    private String thumbnailPattern;

    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code>. The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     */
    private String rotate;

    /**
     * The <code>Id</code> of the preset to use for this job. The preset
     * determines the audio, video, and thumbnail settings that Elastic
     * Transcoder uses for transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String presetId;

    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     * duration of each .ts file in seconds. The range of valid values is 1
     * to 60 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     */
    private String segmentDuration;

    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset for the current output.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark> watermarks;

    /**
     * Information about the album art that you want Elastic Transcoder to
     * add to the file during transcoding. You can specify up to twenty album
     * artworks for each output. Settings for each artwork must be defined in
     * the job for the current output.
     */
    private JobAlbumArt albumArt;

    /**
     * You can create an output file that contains an excerpt from the input
     * file. This excerpt, called a clip, can come from the beginning,
     * middle, or end of the file. The Composition object contains settings
     * for the clips that make up an output file. For the current release,
     * you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Clip> composition;

    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID. If a file with the specified name already exists in
     * the output bucket, the job fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name to assign to the transcoded file. Elastic Transcoder saves
     *         the file in the Amazon S3 bucket specified by the
     *         <code>OutputBucket</code> object in the pipeline that is specified by
     *         the pipeline ID. If a file with the specified name already exists in
     *         the output bucket, the job fails.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID. If a file with the specified name already exists in
     * the output bucket, the job fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name to assign to the transcoded file. Elastic Transcoder saves
     *         the file in the Amazon S3 bucket specified by the
     *         <code>OutputBucket</code> object in the pipeline that is specified by
     *         the pipeline ID. If a file with the specified name already exists in
     *         the output bucket, the job fails.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID. If a file with the specified name already exists in
     * the output bucket, the job fails.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name to assign to the transcoded file. Elastic Transcoder saves
     *         the file in the Amazon S3 bucket specified by the
     *         <code>OutputBucket</code> object in the pipeline that is specified by
     *         the pipeline ID. If a file with the specified name already exists in
     *         the output bucket, the job fails.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Whether you want Elastic Transcoder to create thumbnails for your
     * videos and, if so, how you want Elastic Transcoder to name the files.
     * <p>If you don't want Elastic Transcoder to create thumbnails, specify
     * "". <p> If you do want Elastic Transcoder to create thumbnails,
     * specify the information that you want to include in the file name for
     * each thumbnail. You can specify the following values in any sequence:
     * <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     * create thumbnails, you must include <code>{count}</code> in the
     * <code>ThumbnailPattern</code> object. Wherever you specify
     * <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     * number (beginning with <b>00001</b>) to thumbnail file names. The
     * number indicates where a given thumbnail appears in the sequence of
     * thumbnails for a transcoded file. <important>If you specify a literal
     * value and/or <code>{resolution}</code> but you omit
     * <code>{count}</code>, Elastic Transcoder returns a validation error
     * and does not create the job.</important> </li> <li> <p> <b>Literal
     * values (Optional)</b>: You can specify literal values anywhere in the
     * <code>ThumbnailPattern</code> object. For example, you can include
     * them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     * <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     * Transcoder to include the resolution in the file name, include
     * <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     * automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code>
     * value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     * the applicable file name extension.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{count\}.*$)<br/>
     *
     * @return Whether you want Elastic Transcoder to create thumbnails for your
     *         videos and, if so, how you want Elastic Transcoder to name the files.
     *         <p>If you don't want Elastic Transcoder to create thumbnails, specify
     *         "". <p> If you do want Elastic Transcoder to create thumbnails,
     *         specify the information that you want to include in the file name for
     *         each thumbnail. You can specify the following values in any sequence:
     *         <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     *         create thumbnails, you must include <code>{count}</code> in the
     *         <code>ThumbnailPattern</code> object. Wherever you specify
     *         <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     *         number (beginning with <b>00001</b>) to thumbnail file names. The
     *         number indicates where a given thumbnail appears in the sequence of
     *         thumbnails for a transcoded file. <important>If you specify a literal
     *         value and/or <code>{resolution}</code> but you omit
     *         <code>{count}</code>, Elastic Transcoder returns a validation error
     *         and does not create the job.</important> </li> <li> <p> <b>Literal
     *         values (Optional)</b>: You can specify literal values anywhere in the
     *         <code>ThumbnailPattern</code> object. For example, you can include
     *         them as a file name prefix or as a delimiter between
     *         <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     *         <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     *         Transcoder to include the resolution in the file name, include
     *         <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     *         </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     *         automatically saves the files in the format (.jpg or .png) that
     *         appears in the preset that you specified in the <code>PresetID</code>
     *         value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     *         the applicable file name extension.
     */
    public String getThumbnailPattern() {
        return thumbnailPattern;
    }
    
    /**
     * Whether you want Elastic Transcoder to create thumbnails for your
     * videos and, if so, how you want Elastic Transcoder to name the files.
     * <p>If you don't want Elastic Transcoder to create thumbnails, specify
     * "". <p> If you do want Elastic Transcoder to create thumbnails,
     * specify the information that you want to include in the file name for
     * each thumbnail. You can specify the following values in any sequence:
     * <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     * create thumbnails, you must include <code>{count}</code> in the
     * <code>ThumbnailPattern</code> object. Wherever you specify
     * <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     * number (beginning with <b>00001</b>) to thumbnail file names. The
     * number indicates where a given thumbnail appears in the sequence of
     * thumbnails for a transcoded file. <important>If you specify a literal
     * value and/or <code>{resolution}</code> but you omit
     * <code>{count}</code>, Elastic Transcoder returns a validation error
     * and does not create the job.</important> </li> <li> <p> <b>Literal
     * values (Optional)</b>: You can specify literal values anywhere in the
     * <code>ThumbnailPattern</code> object. For example, you can include
     * them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     * <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     * Transcoder to include the resolution in the file name, include
     * <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     * automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code>
     * value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     * the applicable file name extension.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{count\}.*$)<br/>
     *
     * @param thumbnailPattern Whether you want Elastic Transcoder to create thumbnails for your
     *         videos and, if so, how you want Elastic Transcoder to name the files.
     *         <p>If you don't want Elastic Transcoder to create thumbnails, specify
     *         "". <p> If you do want Elastic Transcoder to create thumbnails,
     *         specify the information that you want to include in the file name for
     *         each thumbnail. You can specify the following values in any sequence:
     *         <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     *         create thumbnails, you must include <code>{count}</code> in the
     *         <code>ThumbnailPattern</code> object. Wherever you specify
     *         <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     *         number (beginning with <b>00001</b>) to thumbnail file names. The
     *         number indicates where a given thumbnail appears in the sequence of
     *         thumbnails for a transcoded file. <important>If you specify a literal
     *         value and/or <code>{resolution}</code> but you omit
     *         <code>{count}</code>, Elastic Transcoder returns a validation error
     *         and does not create the job.</important> </li> <li> <p> <b>Literal
     *         values (Optional)</b>: You can specify literal values anywhere in the
     *         <code>ThumbnailPattern</code> object. For example, you can include
     *         them as a file name prefix or as a delimiter between
     *         <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     *         <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     *         Transcoder to include the resolution in the file name, include
     *         <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     *         </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     *         automatically saves the files in the format (.jpg or .png) that
     *         appears in the preset that you specified in the <code>PresetID</code>
     *         value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     *         the applicable file name extension.
     */
    public void setThumbnailPattern(String thumbnailPattern) {
        this.thumbnailPattern = thumbnailPattern;
    }
    
    /**
     * Whether you want Elastic Transcoder to create thumbnails for your
     * videos and, if so, how you want Elastic Transcoder to name the files.
     * <p>If you don't want Elastic Transcoder to create thumbnails, specify
     * "". <p> If you do want Elastic Transcoder to create thumbnails,
     * specify the information that you want to include in the file name for
     * each thumbnail. You can specify the following values in any sequence:
     * <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     * create thumbnails, you must include <code>{count}</code> in the
     * <code>ThumbnailPattern</code> object. Wherever you specify
     * <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     * number (beginning with <b>00001</b>) to thumbnail file names. The
     * number indicates where a given thumbnail appears in the sequence of
     * thumbnails for a transcoded file. <important>If you specify a literal
     * value and/or <code>{resolution}</code> but you omit
     * <code>{count}</code>, Elastic Transcoder returns a validation error
     * and does not create the job.</important> </li> <li> <p> <b>Literal
     * values (Optional)</b>: You can specify literal values anywhere in the
     * <code>ThumbnailPattern</code> object. For example, you can include
     * them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     * <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     * Transcoder to include the resolution in the file name, include
     * <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     * automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code>
     * value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     * the applicable file name extension.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{count\}.*$)<br/>
     *
     * @param thumbnailPattern Whether you want Elastic Transcoder to create thumbnails for your
     *         videos and, if so, how you want Elastic Transcoder to name the files.
     *         <p>If you don't want Elastic Transcoder to create thumbnails, specify
     *         "". <p> If you do want Elastic Transcoder to create thumbnails,
     *         specify the information that you want to include in the file name for
     *         each thumbnail. You can specify the following values in any sequence:
     *         <ul> <li> <p> <b><code>{count}</code> (Required)</b>: If you want to
     *         create thumbnails, you must include <code>{count}</code> in the
     *         <code>ThumbnailPattern</code> object. Wherever you specify
     *         <code>{count}</code>, Elastic Transcoder adds a five-digit sequence
     *         number (beginning with <b>00001</b>) to thumbnail file names. The
     *         number indicates where a given thumbnail appears in the sequence of
     *         thumbnails for a transcoded file. <important>If you specify a literal
     *         value and/or <code>{resolution}</code> but you omit
     *         <code>{count}</code>, Elastic Transcoder returns a validation error
     *         and does not create the job.</important> </li> <li> <p> <b>Literal
     *         values (Optional)</b>: You can specify literal values anywhere in the
     *         <code>ThumbnailPattern</code> object. For example, you can include
     *         them as a file name prefix or as a delimiter between
     *         <code>{resolution}</code> and <code>{count}</code>. </li> <li> <p>
     *         <b><code>{resolution}</code> (Optional)</b>: If you want Elastic
     *         Transcoder to include the resolution in the file name, include
     *         <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     *         </li> </ul> <p>When creating thumbnails, Elastic Transcoder
     *         automatically saves the files in the format (.jpg or .png) that
     *         appears in the preset that you specified in the <code>PresetID</code>
     *         value of <code>CreateJobOutput</code>. Elastic Transcoder also appends
     *         the applicable file name extension.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withThumbnailPattern(String thumbnailPattern) {
        this.thumbnailPattern = thumbnailPattern;
        return this;
    }

    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code>. The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     *
     * @return The number of degrees clockwise by which you want Elastic Transcoder
     *         to rotate the output relative to the input. Enter one of the following
     *         values: <code>auto</code>, <code>0</code>, <code>90</code>,
     *         <code>180</code>, <code>270</code>. The value <code>auto</code>
     *         generally works only if the file that you're transcoding contains
     *         rotation metadata.
     */
    public String getRotate() {
        return rotate;
    }
    
    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code>. The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     *
     * @param rotate The number of degrees clockwise by which you want Elastic Transcoder
     *         to rotate the output relative to the input. Enter one of the following
     *         values: <code>auto</code>, <code>0</code>, <code>90</code>,
     *         <code>180</code>, <code>270</code>. The value <code>auto</code>
     *         generally works only if the file that you're transcoding contains
     *         rotation metadata.
     */
    public void setRotate(String rotate) {
        this.rotate = rotate;
    }
    
    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code>. The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     *
     * @param rotate The number of degrees clockwise by which you want Elastic Transcoder
     *         to rotate the output relative to the input. Enter one of the following
     *         values: <code>auto</code>, <code>0</code>, <code>90</code>,
     *         <code>180</code>, <code>270</code>. The value <code>auto</code>
     *         generally works only if the file that you're transcoding contains
     *         rotation metadata.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withRotate(String rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * The <code>Id</code> of the preset to use for this job. The preset
     * determines the audio, video, and thumbnail settings that Elastic
     * Transcoder uses for transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The <code>Id</code> of the preset to use for this job. The preset
     *         determines the audio, video, and thumbnail settings that Elastic
     *         Transcoder uses for transcoding.
     */
    public String getPresetId() {
        return presetId;
    }
    
    /**
     * The <code>Id</code> of the preset to use for this job. The preset
     * determines the audio, video, and thumbnail settings that Elastic
     * Transcoder uses for transcoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param presetId The <code>Id</code> of the preset to use for this job. The preset
     *         determines the audio, video, and thumbnail settings that Elastic
     *         Transcoder uses for transcoding.
     */
    public void setPresetId(String presetId) {
        this.presetId = presetId;
    }
    
    /**
     * The <code>Id</code> of the preset to use for this job. The preset
     * determines the audio, video, and thumbnail settings that Elastic
     * Transcoder uses for transcoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param presetId The <code>Id</code> of the preset to use for this job. The preset
     *         determines the audio, video, and thumbnail settings that Elastic
     *         Transcoder uses for transcoding.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withPresetId(String presetId) {
        this.presetId = presetId;
        return this;
    }

    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     * duration of each .ts file in seconds. The range of valid values is 1
     * to 60 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     *
     * @return If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     *         duration of each .ts file in seconds. The range of valid values is 1
     *         to 60 seconds.
     */
    public String getSegmentDuration() {
        return segmentDuration;
    }
    
    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     * duration of each .ts file in seconds. The range of valid values is 1
     * to 60 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     *
     * @param segmentDuration If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     *         duration of each .ts file in seconds. The range of valid values is 1
     *         to 60 seconds.
     */
    public void setSegmentDuration(String segmentDuration) {
        this.segmentDuration = segmentDuration;
    }
    
    /**
     * If you specify a preset in <code>PresetId</code> for which the value
     * of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     * duration of each .ts file in seconds. The range of valid values is 1
     * to 60 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     *
     * @param segmentDuration If you specify a preset in <code>PresetId</code> for which the value
     *         of <code>Container</code> is ts (MPEG-TS), SegmentDuration is the
     *         duration of each .ts file in seconds. The range of valid values is 1
     *         to 60 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withSegmentDuration(String segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }

    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset for the current output.
     *
     * @return Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset for the current output.
     */
    public java.util.List<JobWatermark> getWatermarks() {
        if (watermarks == null) {
              watermarks = new com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark>();
              watermarks.setAutoConstruct(true);
        }
        return watermarks;
    }
    
    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset for the current output.
     *
     * @param watermarks Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset for the current output.
     */
    public void setWatermarks(java.util.Collection<JobWatermark> watermarks) {
        if (watermarks == null) {
            this.watermarks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark> watermarksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark>(watermarks.size());
        watermarksCopy.addAll(watermarks);
        this.watermarks = watermarksCopy;
    }
    
    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset for the current output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param watermarks Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset for the current output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withWatermarks(JobWatermark... watermarks) {
        if (getWatermarks() == null) setWatermarks(new java.util.ArrayList<JobWatermark>(watermarks.length));
        for (JobWatermark value : watermarks) {
            getWatermarks().add(value);
        }
        return this;
    }
    
    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset for the current output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param watermarks Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset for the current output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withWatermarks(java.util.Collection<JobWatermark> watermarks) {
        if (watermarks == null) {
            this.watermarks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark> watermarksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark>(watermarks.size());
            watermarksCopy.addAll(watermarks);
            this.watermarks = watermarksCopy;
        }

        return this;
    }

    /**
     * Information about the album art that you want Elastic Transcoder to
     * add to the file during transcoding. You can specify up to twenty album
     * artworks for each output. Settings for each artwork must be defined in
     * the job for the current output.
     *
     * @return Information about the album art that you want Elastic Transcoder to
     *         add to the file during transcoding. You can specify up to twenty album
     *         artworks for each output. Settings for each artwork must be defined in
     *         the job for the current output.
     */
    public JobAlbumArt getAlbumArt() {
        return albumArt;
    }
    
    /**
     * Information about the album art that you want Elastic Transcoder to
     * add to the file during transcoding. You can specify up to twenty album
     * artworks for each output. Settings for each artwork must be defined in
     * the job for the current output.
     *
     * @param albumArt Information about the album art that you want Elastic Transcoder to
     *         add to the file during transcoding. You can specify up to twenty album
     *         artworks for each output. Settings for each artwork must be defined in
     *         the job for the current output.
     */
    public void setAlbumArt(JobAlbumArt albumArt) {
        this.albumArt = albumArt;
    }
    
    /**
     * Information about the album art that you want Elastic Transcoder to
     * add to the file during transcoding. You can specify up to twenty album
     * artworks for each output. Settings for each artwork must be defined in
     * the job for the current output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param albumArt Information about the album art that you want Elastic Transcoder to
     *         add to the file during transcoding. You can specify up to twenty album
     *         artworks for each output. Settings for each artwork must be defined in
     *         the job for the current output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withAlbumArt(JobAlbumArt albumArt) {
        this.albumArt = albumArt;
        return this;
    }

    /**
     * You can create an output file that contains an excerpt from the input
     * file. This excerpt, called a clip, can come from the beginning,
     * middle, or end of the file. The Composition object contains settings
     * for the clips that make up an output file. For the current release,
     * you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     *
     * @return You can create an output file that contains an excerpt from the input
     *         file. This excerpt, called a clip, can come from the beginning,
     *         middle, or end of the file. The Composition object contains settings
     *         for the clips that make up an output file. For the current release,
     *         you can only specify settings for a single clip per output file. The
     *         Composition object cannot be null.
     */
    public java.util.List<Clip> getComposition() {
        if (composition == null) {
              composition = new com.amazonaws.internal.ListWithAutoConstructFlag<Clip>();
              composition.setAutoConstruct(true);
        }
        return composition;
    }
    
    /**
     * You can create an output file that contains an excerpt from the input
     * file. This excerpt, called a clip, can come from the beginning,
     * middle, or end of the file. The Composition object contains settings
     * for the clips that make up an output file. For the current release,
     * you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     *
     * @param composition You can create an output file that contains an excerpt from the input
     *         file. This excerpt, called a clip, can come from the beginning,
     *         middle, or end of the file. The Composition object contains settings
     *         for the clips that make up an output file. For the current release,
     *         you can only specify settings for a single clip per output file. The
     *         Composition object cannot be null.
     */
    public void setComposition(java.util.Collection<Clip> composition) {
        if (composition == null) {
            this.composition = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Clip> compositionCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Clip>(composition.size());
        compositionCopy.addAll(composition);
        this.composition = compositionCopy;
    }
    
    /**
     * You can create an output file that contains an excerpt from the input
     * file. This excerpt, called a clip, can come from the beginning,
     * middle, or end of the file. The Composition object contains settings
     * for the clips that make up an output file. For the current release,
     * you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param composition You can create an output file that contains an excerpt from the input
     *         file. This excerpt, called a clip, can come from the beginning,
     *         middle, or end of the file. The Composition object contains settings
     *         for the clips that make up an output file. For the current release,
     *         you can only specify settings for a single clip per output file. The
     *         Composition object cannot be null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withComposition(Clip... composition) {
        if (getComposition() == null) setComposition(new java.util.ArrayList<Clip>(composition.length));
        for (Clip value : composition) {
            getComposition().add(value);
        }
        return this;
    }
    
    /**
     * You can create an output file that contains an excerpt from the input
     * file. This excerpt, called a clip, can come from the beginning,
     * middle, or end of the file. The Composition object contains settings
     * for the clips that make up an output file. For the current release,
     * you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param composition You can create an output file that contains an excerpt from the input
     *         file. This excerpt, called a clip, can come from the beginning,
     *         middle, or end of the file. The Composition object contains settings
     *         for the clips that make up an output file. For the current release,
     *         you can only specify settings for a single clip per output file. The
     *         Composition object cannot be null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobOutput withComposition(java.util.Collection<Clip> composition) {
        if (composition == null) {
            this.composition = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Clip> compositionCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Clip>(composition.size());
            compositionCopy.addAll(composition);
            this.composition = compositionCopy;
        }

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
        if (getThumbnailPattern() != null) sb.append("ThumbnailPattern: " + getThumbnailPattern() + ",");
        if (getRotate() != null) sb.append("Rotate: " + getRotate() + ",");
        if (getPresetId() != null) sb.append("PresetId: " + getPresetId() + ",");
        if (getSegmentDuration() != null) sb.append("SegmentDuration: " + getSegmentDuration() + ",");
        if (getWatermarks() != null) sb.append("Watermarks: " + getWatermarks() + ",");
        if (getAlbumArt() != null) sb.append("AlbumArt: " + getAlbumArt() + ",");
        if (getComposition() != null) sb.append("Composition: " + getComposition() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getThumbnailPattern() == null) ? 0 : getThumbnailPattern().hashCode()); 
        hashCode = prime * hashCode + ((getRotate() == null) ? 0 : getRotate().hashCode()); 
        hashCode = prime * hashCode + ((getPresetId() == null) ? 0 : getPresetId().hashCode()); 
        hashCode = prime * hashCode + ((getSegmentDuration() == null) ? 0 : getSegmentDuration().hashCode()); 
        hashCode = prime * hashCode + ((getWatermarks() == null) ? 0 : getWatermarks().hashCode()); 
        hashCode = prime * hashCode + ((getAlbumArt() == null) ? 0 : getAlbumArt().hashCode()); 
        hashCode = prime * hashCode + ((getComposition() == null) ? 0 : getComposition().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateJobOutput == false) return false;
        CreateJobOutput other = (CreateJobOutput)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getThumbnailPattern() == null ^ this.getThumbnailPattern() == null) return false;
        if (other.getThumbnailPattern() != null && other.getThumbnailPattern().equals(this.getThumbnailPattern()) == false) return false; 
        if (other.getRotate() == null ^ this.getRotate() == null) return false;
        if (other.getRotate() != null && other.getRotate().equals(this.getRotate()) == false) return false; 
        if (other.getPresetId() == null ^ this.getPresetId() == null) return false;
        if (other.getPresetId() != null && other.getPresetId().equals(this.getPresetId()) == false) return false; 
        if (other.getSegmentDuration() == null ^ this.getSegmentDuration() == null) return false;
        if (other.getSegmentDuration() != null && other.getSegmentDuration().equals(this.getSegmentDuration()) == false) return false; 
        if (other.getWatermarks() == null ^ this.getWatermarks() == null) return false;
        if (other.getWatermarks() != null && other.getWatermarks().equals(this.getWatermarks()) == false) return false; 
        if (other.getAlbumArt() == null ^ this.getAlbumArt() == null) return false;
        if (other.getAlbumArt() != null && other.getAlbumArt().equals(this.getAlbumArt()) == false) return false; 
        if (other.getComposition() == null ^ this.getComposition() == null) return false;
        if (other.getComposition() != null && other.getComposition().equals(this.getComposition()) == false) return false; 
        return true;
    }
    
}
    