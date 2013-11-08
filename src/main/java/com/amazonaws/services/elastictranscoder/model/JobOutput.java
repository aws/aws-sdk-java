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
 * <p>
 * <b>IMPORTANT:</b>Outputs recommended instead.
 * </p>
 * If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the <code>Output</code> object
 * lists information about the first output. This duplicates the information that is listed for the first output in the <code>Outputs</code> object.
 * </p>
 */
public class JobOutput implements Serializable {

    /**
     * A sequential counter, starting with 1, that identifies an output among
     * the outputs from the current job. In the Output syntax, this value is
     * always 1.
     */
    private String id;

    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID.
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
     * values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code> <p> The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     */
    private String rotate;

    /**
     * The value of the <code>Id</code> object for the preset that you want
     * to use for this job. The preset determines the audio, video, and
     * thumbnail settings that Elastic Transcoder uses for transcoding. To
     * use a preset that you created, specify the preset ID that Elastic
     * Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get
     * with <code>ListPresets</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String presetId;

    /**
     * <important>(Outputs in MPEG-TS format only.</important>If you specify
     * a preset in <code>PresetId</code> for which the value of
     * <code>Container</code>is <code>ts</code> (MPEG-TS),
     * <code>SegmentDuration</code> is the maximum duration of each .ts file
     * in seconds. The range of valid values is 1 to 60 seconds. If the
     * duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the
     * remainder of total length/SegmentDuration. Elastic Transcoder creates
     * an output-specific playlist for each output that you specify in
     * OutputKeys. To add an output to the master playlist for this job,
     * include it in <code>OutputKeys</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     */
    private String segmentDuration;

    /**
     * The status of one output in a job. If you specified only one output
     * for the job, <code>Outputs:Status</code> is always the same as
     * <code>Job:Status</code>. If you specified more than one output: <ul>
     * <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     * the outputs is Submitted until Elastic Transcoder starts to process
     * the first output.</li> <li>When Elastic Transcoder starts to process
     * the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output,
     * the value of <code>Outputs:Status</code> remains Submitted until
     * Elastic Transcoder starts to process the output.</li> <li>Job:Status
     * remains Progressing until all of the outputs reach a terminal status,
     * either Complete or Error.</li> <li>When all of the outputs reach a
     * terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is
     * <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     * outputs is <code>Error</code>, the terminal status for
     * <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     * value of <code>Status</code> is one of the following:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     */
    private String status;

    /**
     * Information that further explains <code>Status</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String statusDetail;

    /**
     * Duration of the output file, in seconds.
     */
    private Long duration;

    /**
     * Specifies the width of the output file in pixels.
     */
    private Integer width;

    /**
     * Height of the output file, in pixels.
     */
    private Integer height;

    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset that you specify in <code>Preset</code> for the
     * current output. <p>Watermarks are added to the output video in the
     * sequence in which you list them in the job output���the first
     * watermark in the list is added to the output video first, the second
     * watermark in the list is added next, and so on. As a result, if the
     * settings in a preset cause Elastic Transcoder to place all watermarks
     * in the same location, the second watermark that you add will cover the
     * first one, the third one will cover the second, and the fourth one
     * will cover the third.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark> watermarks;

    /**
     * The album art to be associated with the output file, if any.
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
     * A sequential counter, starting with 1, that identifies an output among
     * the outputs from the current job. In the Output syntax, this value is
     * always 1.
     *
     * @return A sequential counter, starting with 1, that identifies an output among
     *         the outputs from the current job. In the Output syntax, this value is
     *         always 1.
     */
    public String getId() {
        return id;
    }
    
    /**
     * A sequential counter, starting with 1, that identifies an output among
     * the outputs from the current job. In the Output syntax, this value is
     * always 1.
     *
     * @param id A sequential counter, starting with 1, that identifies an output among
     *         the outputs from the current job. In the Output syntax, this value is
     *         always 1.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * A sequential counter, starting with 1, that identifies an output among
     * the outputs from the current job. In the Output syntax, this value is
     * always 1.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id A sequential counter, starting with 1, that identifies an output among
     *         the outputs from the current job. In the Output syntax, this value is
     *         always 1.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name to assign to the transcoded file. Elastic Transcoder saves
     *         the file in the Amazon S3 bucket specified by the
     *         <code>OutputBucket</code> object in the pipeline that is specified by
     *         the pipeline ID.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name to assign to the transcoded file. Elastic Transcoder saves
     *         the file in the Amazon S3 bucket specified by the
     *         <code>OutputBucket</code> object in the pipeline that is specified by
     *         the pipeline ID.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The name to assign to the transcoded file. Elastic Transcoder saves
     * the file in the Amazon S3 bucket specified by the
     * <code>OutputBucket</code> object in the pipeline that is specified by
     * the pipeline ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name to assign to the transcoded file. Elastic Transcoder saves
     *         the file in the Amazon S3 bucket specified by the
     *         <code>OutputBucket</code> object in the pipeline that is specified by
     *         the pipeline ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withKey(String key) {
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
    public JobOutput withThumbnailPattern(String thumbnailPattern) {
        this.thumbnailPattern = thumbnailPattern;
        return this;
    }

    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code> <p> The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     *
     * @return The number of degrees clockwise by which you want Elastic Transcoder
     *         to rotate the output relative to the input. Enter one of the following
     *         values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     *         <code>180</code>, <code>270</code> <p> The value <code>auto</code>
     *         generally works only if the file that you're transcoding contains
     *         rotation metadata.
     */
    public String getRotate() {
        return rotate;
    }
    
    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code> <p> The value <code>auto</code>
     * generally works only if the file that you're transcoding contains
     * rotation metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)<br/>
     *
     * @param rotate The number of degrees clockwise by which you want Elastic Transcoder
     *         to rotate the output relative to the input. Enter one of the following
     *         values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     *         <code>180</code>, <code>270</code> <p> The value <code>auto</code>
     *         generally works only if the file that you're transcoding contains
     *         rotation metadata.
     */
    public void setRotate(String rotate) {
        this.rotate = rotate;
    }
    
    /**
     * The number of degrees clockwise by which you want Elastic Transcoder
     * to rotate the output relative to the input. Enter one of the following
     * values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     * <code>180</code>, <code>270</code> <p> The value <code>auto</code>
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
     *         values: <p><code>auto</code>, <code>0</code>, <code>90</code>,
     *         <code>180</code>, <code>270</code> <p> The value <code>auto</code>
     *         generally works only if the file that you're transcoding contains
     *         rotation metadata.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withRotate(String rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * The value of the <code>Id</code> object for the preset that you want
     * to use for this job. The preset determines the audio, video, and
     * thumbnail settings that Elastic Transcoder uses for transcoding. To
     * use a preset that you created, specify the preset ID that Elastic
     * Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get
     * with <code>ListPresets</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The value of the <code>Id</code> object for the preset that you want
     *         to use for this job. The preset determines the audio, video, and
     *         thumbnail settings that Elastic Transcoder uses for transcoding. To
     *         use a preset that you created, specify the preset ID that Elastic
     *         Transcoder returned in the response when you created the preset. You
     *         can also use the Elastic Transcoder system presets, which you can get
     *         with <code>ListPresets</code>.
     */
    public String getPresetId() {
        return presetId;
    }
    
    /**
     * The value of the <code>Id</code> object for the preset that you want
     * to use for this job. The preset determines the audio, video, and
     * thumbnail settings that Elastic Transcoder uses for transcoding. To
     * use a preset that you created, specify the preset ID that Elastic
     * Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get
     * with <code>ListPresets</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param presetId The value of the <code>Id</code> object for the preset that you want
     *         to use for this job. The preset determines the audio, video, and
     *         thumbnail settings that Elastic Transcoder uses for transcoding. To
     *         use a preset that you created, specify the preset ID that Elastic
     *         Transcoder returned in the response when you created the preset. You
     *         can also use the Elastic Transcoder system presets, which you can get
     *         with <code>ListPresets</code>.
     */
    public void setPresetId(String presetId) {
        this.presetId = presetId;
    }
    
    /**
     * The value of the <code>Id</code> object for the preset that you want
     * to use for this job. The preset determines the audio, video, and
     * thumbnail settings that Elastic Transcoder uses for transcoding. To
     * use a preset that you created, specify the preset ID that Elastic
     * Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get
     * with <code>ListPresets</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param presetId The value of the <code>Id</code> object for the preset that you want
     *         to use for this job. The preset determines the audio, video, and
     *         thumbnail settings that Elastic Transcoder uses for transcoding. To
     *         use a preset that you created, specify the preset ID that Elastic
     *         Transcoder returned in the response when you created the preset. You
     *         can also use the Elastic Transcoder system presets, which you can get
     *         with <code>ListPresets</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withPresetId(String presetId) {
        this.presetId = presetId;
        return this;
    }

    /**
     * <important>(Outputs in MPEG-TS format only.</important>If you specify
     * a preset in <code>PresetId</code> for which the value of
     * <code>Container</code>is <code>ts</code> (MPEG-TS),
     * <code>SegmentDuration</code> is the maximum duration of each .ts file
     * in seconds. The range of valid values is 1 to 60 seconds. If the
     * duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the
     * remainder of total length/SegmentDuration. Elastic Transcoder creates
     * an output-specific playlist for each output that you specify in
     * OutputKeys. To add an output to the master playlist for this job,
     * include it in <code>OutputKeys</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     *
     * @return <important>(Outputs in MPEG-TS format only.</important>If you specify
     *         a preset in <code>PresetId</code> for which the value of
     *         <code>Container</code>is <code>ts</code> (MPEG-TS),
     *         <code>SegmentDuration</code> is the maximum duration of each .ts file
     *         in seconds. The range of valid values is 1 to 60 seconds. If the
     *         duration of the video is not evenly divisible by
     *         <code>SegmentDuration</code>, the duration of the last segment is the
     *         remainder of total length/SegmentDuration. Elastic Transcoder creates
     *         an output-specific playlist for each output that you specify in
     *         OutputKeys. To add an output to the master playlist for this job,
     *         include it in <code>OutputKeys</code>.
     */
    public String getSegmentDuration() {
        return segmentDuration;
    }
    
    /**
     * <important>(Outputs in MPEG-TS format only.</important>If you specify
     * a preset in <code>PresetId</code> for which the value of
     * <code>Container</code>is <code>ts</code> (MPEG-TS),
     * <code>SegmentDuration</code> is the maximum duration of each .ts file
     * in seconds. The range of valid values is 1 to 60 seconds. If the
     * duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the
     * remainder of total length/SegmentDuration. Elastic Transcoder creates
     * an output-specific playlist for each output that you specify in
     * OutputKeys. To add an output to the master playlist for this job,
     * include it in <code>OutputKeys</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     *
     * @param segmentDuration <important>(Outputs in MPEG-TS format only.</important>If you specify
     *         a preset in <code>PresetId</code> for which the value of
     *         <code>Container</code>is <code>ts</code> (MPEG-TS),
     *         <code>SegmentDuration</code> is the maximum duration of each .ts file
     *         in seconds. The range of valid values is 1 to 60 seconds. If the
     *         duration of the video is not evenly divisible by
     *         <code>SegmentDuration</code>, the duration of the last segment is the
     *         remainder of total length/SegmentDuration. Elastic Transcoder creates
     *         an output-specific playlist for each output that you specify in
     *         OutputKeys. To add an output to the master playlist for this job,
     *         include it in <code>OutputKeys</code>.
     */
    public void setSegmentDuration(String segmentDuration) {
        this.segmentDuration = segmentDuration;
    }
    
    /**
     * <important>(Outputs in MPEG-TS format only.</important>If you specify
     * a preset in <code>PresetId</code> for which the value of
     * <code>Container</code>is <code>ts</code> (MPEG-TS),
     * <code>SegmentDuration</code> is the maximum duration of each .ts file
     * in seconds. The range of valid values is 1 to 60 seconds. If the
     * duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the
     * remainder of total length/SegmentDuration. Elastic Transcoder creates
     * an output-specific playlist for each output that you specify in
     * OutputKeys. To add an output to the master playlist for this job,
     * include it in <code>OutputKeys</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}([.]\d{0,5})?$<br/>
     *
     * @param segmentDuration <important>(Outputs in MPEG-TS format only.</important>If you specify
     *         a preset in <code>PresetId</code> for which the value of
     *         <code>Container</code>is <code>ts</code> (MPEG-TS),
     *         <code>SegmentDuration</code> is the maximum duration of each .ts file
     *         in seconds. The range of valid values is 1 to 60 seconds. If the
     *         duration of the video is not evenly divisible by
     *         <code>SegmentDuration</code>, the duration of the last segment is the
     *         remainder of total length/SegmentDuration. Elastic Transcoder creates
     *         an output-specific playlist for each output that you specify in
     *         OutputKeys. To add an output to the master playlist for this job,
     *         include it in <code>OutputKeys</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withSegmentDuration(String segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }

    /**
     * The status of one output in a job. If you specified only one output
     * for the job, <code>Outputs:Status</code> is always the same as
     * <code>Job:Status</code>. If you specified more than one output: <ul>
     * <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     * the outputs is Submitted until Elastic Transcoder starts to process
     * the first output.</li> <li>When Elastic Transcoder starts to process
     * the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output,
     * the value of <code>Outputs:Status</code> remains Submitted until
     * Elastic Transcoder starts to process the output.</li> <li>Job:Status
     * remains Progressing until all of the outputs reach a terminal status,
     * either Complete or Error.</li> <li>When all of the outputs reach a
     * terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is
     * <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     * outputs is <code>Error</code>, the terminal status for
     * <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     * value of <code>Status</code> is one of the following:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @return The status of one output in a job. If you specified only one output
     *         for the job, <code>Outputs:Status</code> is always the same as
     *         <code>Job:Status</code>. If you specified more than one output: <ul>
     *         <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     *         the outputs is Submitted until Elastic Transcoder starts to process
     *         the first output.</li> <li>When Elastic Transcoder starts to process
     *         the first output, <code>Outputs:Status</code> for that output and
     *         <code>Job:Status</code> both change to Progressing. For each output,
     *         the value of <code>Outputs:Status</code> remains Submitted until
     *         Elastic Transcoder starts to process the output.</li> <li>Job:Status
     *         remains Progressing until all of the outputs reach a terminal status,
     *         either Complete or Error.</li> <li>When all of the outputs reach a
     *         terminal status, <code>Job:Status</code> changes to Complete only if
     *         <code>Outputs:Status</code> for all of the outputs is
     *         <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     *         outputs is <code>Error</code>, the terminal status for
     *         <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     *         value of <code>Status</code> is one of the following:
     *         <code>Submitted</code>, <code>Progressing</code>,
     *         <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of one output in a job. If you specified only one output
     * for the job, <code>Outputs:Status</code> is always the same as
     * <code>Job:Status</code>. If you specified more than one output: <ul>
     * <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     * the outputs is Submitted until Elastic Transcoder starts to process
     * the first output.</li> <li>When Elastic Transcoder starts to process
     * the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output,
     * the value of <code>Outputs:Status</code> remains Submitted until
     * Elastic Transcoder starts to process the output.</li> <li>Job:Status
     * remains Progressing until all of the outputs reach a terminal status,
     * either Complete or Error.</li> <li>When all of the outputs reach a
     * terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is
     * <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     * outputs is <code>Error</code>, the terminal status for
     * <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     * value of <code>Status</code> is one of the following:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status The status of one output in a job. If you specified only one output
     *         for the job, <code>Outputs:Status</code> is always the same as
     *         <code>Job:Status</code>. If you specified more than one output: <ul>
     *         <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     *         the outputs is Submitted until Elastic Transcoder starts to process
     *         the first output.</li> <li>When Elastic Transcoder starts to process
     *         the first output, <code>Outputs:Status</code> for that output and
     *         <code>Job:Status</code> both change to Progressing. For each output,
     *         the value of <code>Outputs:Status</code> remains Submitted until
     *         Elastic Transcoder starts to process the output.</li> <li>Job:Status
     *         remains Progressing until all of the outputs reach a terminal status,
     *         either Complete or Error.</li> <li>When all of the outputs reach a
     *         terminal status, <code>Job:Status</code> changes to Complete only if
     *         <code>Outputs:Status</code> for all of the outputs is
     *         <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     *         outputs is <code>Error</code>, the terminal status for
     *         <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     *         value of <code>Status</code> is one of the following:
     *         <code>Submitted</code>, <code>Progressing</code>,
     *         <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of one output in a job. If you specified only one output
     * for the job, <code>Outputs:Status</code> is always the same as
     * <code>Job:Status</code>. If you specified more than one output: <ul>
     * <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     * the outputs is Submitted until Elastic Transcoder starts to process
     * the first output.</li> <li>When Elastic Transcoder starts to process
     * the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output,
     * the value of <code>Outputs:Status</code> remains Submitted until
     * Elastic Transcoder starts to process the output.</li> <li>Job:Status
     * remains Progressing until all of the outputs reach a terminal status,
     * either Complete or Error.</li> <li>When all of the outputs reach a
     * terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is
     * <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     * outputs is <code>Error</code>, the terminal status for
     * <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     * value of <code>Status</code> is one of the following:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status The status of one output in a job. If you specified only one output
     *         for the job, <code>Outputs:Status</code> is always the same as
     *         <code>Job:Status</code>. If you specified more than one output: <ul>
     *         <li><code>Job:Status</code> and <code>Outputs:Status</code> for all of
     *         the outputs is Submitted until Elastic Transcoder starts to process
     *         the first output.</li> <li>When Elastic Transcoder starts to process
     *         the first output, <code>Outputs:Status</code> for that output and
     *         <code>Job:Status</code> both change to Progressing. For each output,
     *         the value of <code>Outputs:Status</code> remains Submitted until
     *         Elastic Transcoder starts to process the output.</li> <li>Job:Status
     *         remains Progressing until all of the outputs reach a terminal status,
     *         either Complete or Error.</li> <li>When all of the outputs reach a
     *         terminal status, <code>Job:Status</code> changes to Complete only if
     *         <code>Outputs:Status</code> for all of the outputs is
     *         <code>Complete</code>. If <code>Outputs:Status</code> for one or more
     *         outputs is <code>Error</code>, the terminal status for
     *         <code>Job:Status</code> is also <code>Error</code>.</li> </ul> The
     *         value of <code>Status</code> is one of the following:
     *         <code>Submitted</code>, <code>Progressing</code>,
     *         <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Information that further explains <code>Status</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Information that further explains <code>Status</code>.
     */
    public String getStatusDetail() {
        return statusDetail;
    }
    
    /**
     * Information that further explains <code>Status</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param statusDetail Information that further explains <code>Status</code>.
     */
    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }
    
    /**
     * Information that further explains <code>Status</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param statusDetail Information that further explains <code>Status</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * Duration of the output file, in seconds.
     *
     * @return Duration of the output file, in seconds.
     */
    public Long getDuration() {
        return duration;
    }
    
    /**
     * Duration of the output file, in seconds.
     *
     * @param duration Duration of the output file, in seconds.
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    
    /**
     * Duration of the output file, in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration Duration of the output file, in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Specifies the width of the output file in pixels.
     *
     * @return Specifies the width of the output file in pixels.
     */
    public Integer getWidth() {
        return width;
    }
    
    /**
     * Specifies the width of the output file in pixels.
     *
     * @param width Specifies the width of the output file in pixels.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }
    
    /**
     * Specifies the width of the output file in pixels.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param width Specifies the width of the output file in pixels.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Height of the output file, in pixels.
     *
     * @return Height of the output file, in pixels.
     */
    public Integer getHeight() {
        return height;
    }
    
    /**
     * Height of the output file, in pixels.
     *
     * @param height Height of the output file, in pixels.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }
    
    /**
     * Height of the output file, in pixels.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param height Height of the output file, in pixels.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Information about the watermarks that you want Elastic Transcoder to
     * add to the video during transcoding. You can specify up to four
     * watermarks for each output. Settings for each watermark must be
     * defined in the preset that you specify in <code>Preset</code> for the
     * current output. <p>Watermarks are added to the output video in the
     * sequence in which you list them in the job output���the first
     * watermark in the list is added to the output video first, the second
     * watermark in the list is added next, and so on. As a result, if the
     * settings in a preset cause Elastic Transcoder to place all watermarks
     * in the same location, the second watermark that you add will cover the
     * first one, the third one will cover the second, and the fourth one
     * will cover the third.
     *
     * @return Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset that you specify in <code>Preset</code> for the
     *         current output. <p>Watermarks are added to the output video in the
     *         sequence in which you list them in the job output���the first
     *         watermark in the list is added to the output video first, the second
     *         watermark in the list is added next, and so on. As a result, if the
     *         settings in a preset cause Elastic Transcoder to place all watermarks
     *         in the same location, the second watermark that you add will cover the
     *         first one, the third one will cover the second, and the fourth one
     *         will cover the third.
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
     * defined in the preset that you specify in <code>Preset</code> for the
     * current output. <p>Watermarks are added to the output video in the
     * sequence in which you list them in the job output���the first
     * watermark in the list is added to the output video first, the second
     * watermark in the list is added next, and so on. As a result, if the
     * settings in a preset cause Elastic Transcoder to place all watermarks
     * in the same location, the second watermark that you add will cover the
     * first one, the third one will cover the second, and the fourth one
     * will cover the third.
     *
     * @param watermarks Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset that you specify in <code>Preset</code> for the
     *         current output. <p>Watermarks are added to the output video in the
     *         sequence in which you list them in the job output���the first
     *         watermark in the list is added to the output video first, the second
     *         watermark in the list is added next, and so on. As a result, if the
     *         settings in a preset cause Elastic Transcoder to place all watermarks
     *         in the same location, the second watermark that you add will cover the
     *         first one, the third one will cover the second, and the fourth one
     *         will cover the third.
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
     * defined in the preset that you specify in <code>Preset</code> for the
     * current output. <p>Watermarks are added to the output video in the
     * sequence in which you list them in the job output���the first
     * watermark in the list is added to the output video first, the second
     * watermark in the list is added next, and so on. As a result, if the
     * settings in a preset cause Elastic Transcoder to place all watermarks
     * in the same location, the second watermark that you add will cover the
     * first one, the third one will cover the second, and the fourth one
     * will cover the third.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param watermarks Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset that you specify in <code>Preset</code> for the
     *         current output. <p>Watermarks are added to the output video in the
     *         sequence in which you list them in the job output���the first
     *         watermark in the list is added to the output video first, the second
     *         watermark in the list is added next, and so on. As a result, if the
     *         settings in a preset cause Elastic Transcoder to place all watermarks
     *         in the same location, the second watermark that you add will cover the
     *         first one, the third one will cover the second, and the fourth one
     *         will cover the third.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withWatermarks(JobWatermark... watermarks) {
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
     * defined in the preset that you specify in <code>Preset</code> for the
     * current output. <p>Watermarks are added to the output video in the
     * sequence in which you list them in the job output���the first
     * watermark in the list is added to the output video first, the second
     * watermark in the list is added next, and so on. As a result, if the
     * settings in a preset cause Elastic Transcoder to place all watermarks
     * in the same location, the second watermark that you add will cover the
     * first one, the third one will cover the second, and the fourth one
     * will cover the third.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param watermarks Information about the watermarks that you want Elastic Transcoder to
     *         add to the video during transcoding. You can specify up to four
     *         watermarks for each output. Settings for each watermark must be
     *         defined in the preset that you specify in <code>Preset</code> for the
     *         current output. <p>Watermarks are added to the output video in the
     *         sequence in which you list them in the job output���the first
     *         watermark in the list is added to the output video first, the second
     *         watermark in the list is added next, and so on. As a result, if the
     *         settings in a preset cause Elastic Transcoder to place all watermarks
     *         in the same location, the second watermark that you add will cover the
     *         first one, the third one will cover the second, and the fourth one
     *         will cover the third.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withWatermarks(java.util.Collection<JobWatermark> watermarks) {
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
     * The album art to be associated with the output file, if any.
     *
     * @return The album art to be associated with the output file, if any.
     */
    public JobAlbumArt getAlbumArt() {
        return albumArt;
    }
    
    /**
     * The album art to be associated with the output file, if any.
     *
     * @param albumArt The album art to be associated with the output file, if any.
     */
    public void setAlbumArt(JobAlbumArt albumArt) {
        this.albumArt = albumArt;
    }
    
    /**
     * The album art to be associated with the output file, if any.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param albumArt The album art to be associated with the output file, if any.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobOutput withAlbumArt(JobAlbumArt albumArt) {
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
    public JobOutput withComposition(Clip... composition) {
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
    public JobOutput withComposition(java.util.Collection<Clip> composition) {
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getThumbnailPattern() != null) sb.append("ThumbnailPattern: " + getThumbnailPattern() + ",");
        if (getRotate() != null) sb.append("Rotate: " + getRotate() + ",");
        if (getPresetId() != null) sb.append("PresetId: " + getPresetId() + ",");
        if (getSegmentDuration() != null) sb.append("SegmentDuration: " + getSegmentDuration() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetail() != null) sb.append("StatusDetail: " + getStatusDetail() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getWidth() != null) sb.append("Width: " + getWidth() + ",");
        if (getHeight() != null) sb.append("Height: " + getHeight() + ",");
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
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getThumbnailPattern() == null) ? 0 : getThumbnailPattern().hashCode()); 
        hashCode = prime * hashCode + ((getRotate() == null) ? 0 : getRotate().hashCode()); 
        hashCode = prime * hashCode + ((getPresetId() == null) ? 0 : getPresetId().hashCode()); 
        hashCode = prime * hashCode + ((getSegmentDuration() == null) ? 0 : getSegmentDuration().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode()); 
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode()); 
        hashCode = prime * hashCode + ((getWatermarks() == null) ? 0 : getWatermarks().hashCode()); 
        hashCode = prime * hashCode + ((getAlbumArt() == null) ? 0 : getAlbumArt().hashCode()); 
        hashCode = prime * hashCode + ((getComposition() == null) ? 0 : getComposition().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobOutput == false) return false;
        JobOutput other = (JobOutput)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
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
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null) return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getWidth() == null ^ this.getWidth() == null) return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false) return false; 
        if (other.getHeight() == null ^ this.getHeight() == null) return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false) return false; 
        if (other.getWatermarks() == null ^ this.getWatermarks() == null) return false;
        if (other.getWatermarks() != null && other.getWatermarks().equals(this.getWatermarks()) == false) return false; 
        if (other.getAlbumArt() == null ^ this.getAlbumArt() == null) return false;
        if (other.getAlbumArt() != null && other.getAlbumArt().equals(this.getAlbumArt()) == false) return false; 
        if (other.getComposition() == null ^ this.getComposition() == null) return false;
        if (other.getComposition() != null && other.getComposition().equals(this.getComposition()) == false) return false; 
        return true;
    }
    
}
    