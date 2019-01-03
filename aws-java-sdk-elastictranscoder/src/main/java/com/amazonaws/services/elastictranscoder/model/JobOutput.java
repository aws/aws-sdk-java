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
 * <important>
 * <p>
 * Outputs recommended instead.
 * </p>
 * </important>
 * <p>
 * If you specified one output for a job, information about that output. If you specified multiple outputs for a job,
 * the <code>Output</code> object lists information about the first output. This duplicates the information that is
 * listed for the first output in the <code>Outputs</code> object.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A sequential counter, starting with 1, that identifies an output among the outputs from the current job. In the
     * Output syntax, this value is always 1.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket specified by
     * the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     * Transcoder to name the files.
     * </p>
     * <p>
     * If you don't want Elastic Transcoder to create thumbnails, specify "".
     * </p>
     * <p>
     * If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include in the
     * file name for each thumbnail. You can specify the following values in any sequence:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include <code>{count}</code>
     * in the <code>ThumbnailPattern</code> object. Wherever you specify <code>{count}</code>, Elastic Transcoder adds a
     * five-digit sequence number (beginning with <b>00001</b>) to thumbnail file names. The number indicates where a
     * given thumbnail appears in the sequence of thumbnails for a transcoded file.
     * </p>
     * <important>
     * <p>
     * If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>, Elastic
     * Transcoder returns a validation error and does not create the job.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Literal values (Optional)</b>: You can specify literal values anywhere in the <code>ThumbnailPattern</code>
     * object. For example, you can include them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in the
     * file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code> value of <code>CreateJobOutput</code>.
     * Elastic Transcoder also appends the applicable file name extension.
     * </p>
     */
    private String thumbnailPattern;
    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     * </p>
     */
    private Encryption thumbnailEncryption;
    /**
     * <p>
     * The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the input.
     * Enter one of the following values:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     * </p>
     * <p>
     * The value <code>auto</code> generally works only if the file that you're transcoding contains rotation metadata.
     * </p>
     */
    private String rotate;
    /**
     * <p>
     * The value of the <code>Id</code> object for the preset that you want to use for this job. The preset determines
     * the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a preset that you
     * created, specify the preset ID that Elastic Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get with <code>ListPresets</code>.
     * </p>
     */
    private String presetId;
    /**
     * <important>
     * <p>
     * (Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     * <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the target
     * maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media segment is
     * stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>, and
     * <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each segment is
     * approximately the length of the <code>SegmentDuration</code>, though individual segments might be shorter or
     * longer.
     * </p>
     * <p>
     * The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the remainder of total length/SegmentDuration.
     * </p>
     * <p>
     * Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you specify
     * in OutputKeys. To add an output to the master playlist for this job, include it in the <code>OutputKeys</code> of
     * the associated playlist.
     * </p>
     */
    private String segmentDuration;
    /**
     * <p>
     * The status of one output in a job. If you specified only one output for the job, <code>Outputs:Status</code> is
     * always the same as <code>Job:Status</code>. If you specified more than one output:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     * Transcoder starts to process the first output.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output, the value of <code>Outputs:Status</code>
     * remains Submitted until Elastic Transcoder starts to process the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If <code>Outputs:Status</code> for
     * one or more outputs is <code>Error</code>, the terminal status for <code>Job:Status</code> is also
     * <code>Error</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of <code>Status</code> is one of the following: <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information that further explains <code>Status</code>.
     * </p>
     */
    private String statusDetail;
    /**
     * <p>
     * Duration of the output file, in seconds.
     * </p>
     */
    private Long duration;
    /**
     * <p>
     * Specifies the width of the output file in pixels.
     * </p>
     */
    private Integer width;
    /**
     * <p>
     * Height of the output file, in pixels.
     * </p>
     */
    private Integer height;
    /**
     * <p>
     * Frame rate of the output file, in frames per second.
     * </p>
     */
    private String frameRate;
    /**
     * <p>
     * File size of the output file, in bytes.
     * </p>
     */
    private Long fileSize;
    /**
     * <p>
     * Duration of the output file, in milliseconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can
     * specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you
     * specify in <code>Preset</code> for the current output.
     * </p>
     * <p>
     * Watermarks are added to the output video in the sequence in which you list them in the job output—the first
     * watermark in the list is added to the output video first, the second watermark in the list is added next, and so
     * on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same
     * location, the second watermark that you add covers the first one, the third one covers the second, and the fourth
     * one covers the third.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<JobWatermark> watermarks;
    /**
     * <p>
     * The album art to be associated with the output file, if any.
     * </p>
     */
    private JobAlbumArt albumArt;
    /**
     * <p>
     * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come
     * from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make
     * up an output file. For the current release, you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * </p>
     */
    @Deprecated
    private com.amazonaws.internal.SdkInternalList<Clip> composition;
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
    private Captions captions;
    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you choose to
     * use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic Transcoder writes an
     * unencrypted file to your Amazon S3 bucket.
     * </p>
     */
    private Encryption encryption;
    /**
     * <p>
     * If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output file,
     * the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     * <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the job
     * response.
     * </p>
     */
    private String appliedColorSpaceConversion;

    /**
     * <p>
     * A sequential counter, starting with 1, that identifies an output among the outputs from the current job. In the
     * Output syntax, this value is always 1.
     * </p>
     * 
     * @param id
     *        A sequential counter, starting with 1, that identifies an output among the outputs from the current job.
     *        In the Output syntax, this value is always 1.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A sequential counter, starting with 1, that identifies an output among the outputs from the current job. In the
     * Output syntax, this value is always 1.
     * </p>
     * 
     * @return A sequential counter, starting with 1, that identifies an output among the outputs from the current job.
     *         In the Output syntax, this value is always 1.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A sequential counter, starting with 1, that identifies an output among the outputs from the current job. In the
     * Output syntax, this value is always 1.
     * </p>
     * 
     * @param id
     *        A sequential counter, starting with 1, that identifies an output among the outputs from the current job.
     *        In the Output syntax, this value is always 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket specified by
     * the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     * </p>
     * 
     * @param key
     *        The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket
     *        specified by the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket specified by
     * the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     * </p>
     * 
     * @return The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket
     *         specified by the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket specified by
     * the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     * </p>
     * 
     * @param key
     *        The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket
     *        specified by the <code>OutputBucket</code> object in the pipeline that is specified by the pipeline ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     * Transcoder to name the files.
     * </p>
     * <p>
     * If you don't want Elastic Transcoder to create thumbnails, specify "".
     * </p>
     * <p>
     * If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include in the
     * file name for each thumbnail. You can specify the following values in any sequence:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include <code>{count}</code>
     * in the <code>ThumbnailPattern</code> object. Wherever you specify <code>{count}</code>, Elastic Transcoder adds a
     * five-digit sequence number (beginning with <b>00001</b>) to thumbnail file names. The number indicates where a
     * given thumbnail appears in the sequence of thumbnails for a transcoded file.
     * </p>
     * <important>
     * <p>
     * If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>, Elastic
     * Transcoder returns a validation error and does not create the job.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Literal values (Optional)</b>: You can specify literal values anywhere in the <code>ThumbnailPattern</code>
     * object. For example, you can include them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in the
     * file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code> value of <code>CreateJobOutput</code>.
     * Elastic Transcoder also appends the applicable file name extension.
     * </p>
     * 
     * @param thumbnailPattern
     *        Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     *        Transcoder to name the files.</p>
     *        <p>
     *        If you don't want Elastic Transcoder to create thumbnails, specify "".
     *        </p>
     *        <p>
     *        If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include
     *        in the file name for each thumbnail. You can specify the following values in any sequence:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include
     *        <code>{count}</code> in the <code>ThumbnailPattern</code> object. Wherever you specify
     *        <code>{count}</code>, Elastic Transcoder adds a five-digit sequence number (beginning with <b>00001</b>)
     *        to thumbnail file names. The number indicates where a given thumbnail appears in the sequence of
     *        thumbnails for a transcoded file.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>, Elastic
     *        Transcoder returns a validation error and does not create the job.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>Literal values (Optional)</b>: You can specify literal values anywhere in the
     *        <code>ThumbnailPattern</code> object. For example, you can include them as a file name prefix or as a
     *        delimiter between <code>{resolution}</code> and <code>{count}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in
     *        the file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png)
     *        that appears in the preset that you specified in the <code>PresetID</code> value of
     *        <code>CreateJobOutput</code>. Elastic Transcoder also appends the applicable file name extension.
     */

    public void setThumbnailPattern(String thumbnailPattern) {
        this.thumbnailPattern = thumbnailPattern;
    }

    /**
     * <p>
     * Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     * Transcoder to name the files.
     * </p>
     * <p>
     * If you don't want Elastic Transcoder to create thumbnails, specify "".
     * </p>
     * <p>
     * If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include in the
     * file name for each thumbnail. You can specify the following values in any sequence:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include <code>{count}</code>
     * in the <code>ThumbnailPattern</code> object. Wherever you specify <code>{count}</code>, Elastic Transcoder adds a
     * five-digit sequence number (beginning with <b>00001</b>) to thumbnail file names. The number indicates where a
     * given thumbnail appears in the sequence of thumbnails for a transcoded file.
     * </p>
     * <important>
     * <p>
     * If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>, Elastic
     * Transcoder returns a validation error and does not create the job.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Literal values (Optional)</b>: You can specify literal values anywhere in the <code>ThumbnailPattern</code>
     * object. For example, you can include them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in the
     * file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code> value of <code>CreateJobOutput</code>.
     * Elastic Transcoder also appends the applicable file name extension.
     * </p>
     * 
     * @return Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     *         Transcoder to name the files.</p>
     *         <p>
     *         If you don't want Elastic Transcoder to create thumbnails, specify "".
     *         </p>
     *         <p>
     *         If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include
     *         in the file name for each thumbnail. You can specify the following values in any sequence:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include
     *         <code>{count}</code> in the <code>ThumbnailPattern</code> object. Wherever you specify
     *         <code>{count}</code>, Elastic Transcoder adds a five-digit sequence number (beginning with <b>00001</b>)
     *         to thumbnail file names. The number indicates where a given thumbnail appears in the sequence of
     *         thumbnails for a transcoded file.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>,
     *         Elastic Transcoder returns a validation error and does not create the job.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <b>Literal values (Optional)</b>: You can specify literal values anywhere in the
     *         <code>ThumbnailPattern</code> object. For example, you can include them as a file name prefix or as a
     *         delimiter between <code>{resolution}</code> and <code>{count}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in
     *         the file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png)
     *         that appears in the preset that you specified in the <code>PresetID</code> value of
     *         <code>CreateJobOutput</code>. Elastic Transcoder also appends the applicable file name extension.
     */

    public String getThumbnailPattern() {
        return this.thumbnailPattern;
    }

    /**
     * <p>
     * Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     * Transcoder to name the files.
     * </p>
     * <p>
     * If you don't want Elastic Transcoder to create thumbnails, specify "".
     * </p>
     * <p>
     * If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include in the
     * file name for each thumbnail. You can specify the following values in any sequence:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include <code>{count}</code>
     * in the <code>ThumbnailPattern</code> object. Wherever you specify <code>{count}</code>, Elastic Transcoder adds a
     * five-digit sequence number (beginning with <b>00001</b>) to thumbnail file names. The number indicates where a
     * given thumbnail appears in the sequence of thumbnails for a transcoded file.
     * </p>
     * <important>
     * <p>
     * If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>, Elastic
     * Transcoder returns a validation error and does not create the job.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Literal values (Optional)</b>: You can specify literal values anywhere in the <code>ThumbnailPattern</code>
     * object. For example, you can include them as a file name prefix or as a delimiter between
     * <code>{resolution}</code> and <code>{count}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in the
     * file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png) that
     * appears in the preset that you specified in the <code>PresetID</code> value of <code>CreateJobOutput</code>.
     * Elastic Transcoder also appends the applicable file name extension.
     * </p>
     * 
     * @param thumbnailPattern
     *        Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic
     *        Transcoder to name the files.</p>
     *        <p>
     *        If you don't want Elastic Transcoder to create thumbnails, specify "".
     *        </p>
     *        <p>
     *        If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include
     *        in the file name for each thumbnail. You can specify the following values in any sequence:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>{count}</code> (Required)</b>: If you want to create thumbnails, you must include
     *        <code>{count}</code> in the <code>ThumbnailPattern</code> object. Wherever you specify
     *        <code>{count}</code>, Elastic Transcoder adds a five-digit sequence number (beginning with <b>00001</b>)
     *        to thumbnail file names. The number indicates where a given thumbnail appears in the sequence of
     *        thumbnails for a transcoded file.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify a literal value and/or <code>{resolution}</code> but you omit <code>{count}</code>, Elastic
     *        Transcoder returns a validation error and does not create the job.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>Literal values (Optional)</b>: You can specify literal values anywhere in the
     *        <code>ThumbnailPattern</code> object. For example, you can include them as a file name prefix or as a
     *        delimiter between <code>{resolution}</code> and <code>{count}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>{resolution}</code> (Optional)</b>: If you want Elastic Transcoder to include the resolution in
     *        the file name, include <code>{resolution}</code> in the <code>ThumbnailPattern</code> object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png)
     *        that appears in the preset that you specified in the <code>PresetID</code> value of
     *        <code>CreateJobOutput</code>. Elastic Transcoder also appends the applicable file name extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withThumbnailPattern(String thumbnailPattern) {
        setThumbnailPattern(thumbnailPattern);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     * </p>
     * 
     * @param thumbnailEncryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     */

    public void setThumbnailEncryption(Encryption thumbnailEncryption) {
        this.thumbnailEncryption = thumbnailEncryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     * </p>
     * 
     * @return The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     */

    public Encryption getThumbnailEncryption() {
        return this.thumbnailEncryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     * </p>
     * 
     * @param thumbnailEncryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withThumbnailEncryption(Encryption thumbnailEncryption) {
        setThumbnailEncryption(thumbnailEncryption);
        return this;
    }

    /**
     * <p>
     * The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the input.
     * Enter one of the following values:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     * </p>
     * <p>
     * The value <code>auto</code> generally works only if the file that you're transcoding contains rotation metadata.
     * </p>
     * 
     * @param rotate
     *        The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the
     *        input. Enter one of the following values:</p>
     *        <p>
     *        <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     *        </p>
     *        <p>
     *        The value <code>auto</code> generally works only if the file that you're transcoding contains rotation
     *        metadata.
     */

    public void setRotate(String rotate) {
        this.rotate = rotate;
    }

    /**
     * <p>
     * The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the input.
     * Enter one of the following values:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     * </p>
     * <p>
     * The value <code>auto</code> generally works only if the file that you're transcoding contains rotation metadata.
     * </p>
     * 
     * @return The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the
     *         input. Enter one of the following values:</p>
     *         <p>
     *         <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     *         </p>
     *         <p>
     *         The value <code>auto</code> generally works only if the file that you're transcoding contains rotation
     *         metadata.
     */

    public String getRotate() {
        return this.rotate;
    }

    /**
     * <p>
     * The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the input.
     * Enter one of the following values:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     * </p>
     * <p>
     * The value <code>auto</code> generally works only if the file that you're transcoding contains rotation metadata.
     * </p>
     * 
     * @param rotate
     *        The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the
     *        input. Enter one of the following values:</p>
     *        <p>
     *        <code>auto</code>, <code>0</code>, <code>90</code>, <code>180</code>, <code>270</code>
     *        </p>
     *        <p>
     *        The value <code>auto</code> generally works only if the file that you're transcoding contains rotation
     *        metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withRotate(String rotate) {
        setRotate(rotate);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Id</code> object for the preset that you want to use for this job. The preset determines
     * the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a preset that you
     * created, specify the preset ID that Elastic Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get with <code>ListPresets</code>.
     * </p>
     * 
     * @param presetId
     *        The value of the <code>Id</code> object for the preset that you want to use for this job. The preset
     *        determines the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a
     *        preset that you created, specify the preset ID that Elastic Transcoder returned in the response when you
     *        created the preset. You can also use the Elastic Transcoder system presets, which you can get with
     *        <code>ListPresets</code>.
     */

    public void setPresetId(String presetId) {
        this.presetId = presetId;
    }

    /**
     * <p>
     * The value of the <code>Id</code> object for the preset that you want to use for this job. The preset determines
     * the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a preset that you
     * created, specify the preset ID that Elastic Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get with <code>ListPresets</code>.
     * </p>
     * 
     * @return The value of the <code>Id</code> object for the preset that you want to use for this job. The preset
     *         determines the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use
     *         a preset that you created, specify the preset ID that Elastic Transcoder returned in the response when
     *         you created the preset. You can also use the Elastic Transcoder system presets, which you can get with
     *         <code>ListPresets</code>.
     */

    public String getPresetId() {
        return this.presetId;
    }

    /**
     * <p>
     * The value of the <code>Id</code> object for the preset that you want to use for this job. The preset determines
     * the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a preset that you
     * created, specify the preset ID that Elastic Transcoder returned in the response when you created the preset. You
     * can also use the Elastic Transcoder system presets, which you can get with <code>ListPresets</code>.
     * </p>
     * 
     * @param presetId
     *        The value of the <code>Id</code> object for the preset that you want to use for this job. The preset
     *        determines the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a
     *        preset that you created, specify the preset ID that Elastic Transcoder returned in the response when you
     *        created the preset. You can also use the Elastic Transcoder system presets, which you can get with
     *        <code>ListPresets</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withPresetId(String presetId) {
        setPresetId(presetId);
        return this;
    }

    /**
     * <important>
     * <p>
     * (Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     * <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the target
     * maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media segment is
     * stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>, and
     * <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each segment is
     * approximately the length of the <code>SegmentDuration</code>, though individual segments might be shorter or
     * longer.
     * </p>
     * <p>
     * The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the remainder of total length/SegmentDuration.
     * </p>
     * <p>
     * Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you specify
     * in OutputKeys. To add an output to the master playlist for this job, include it in the <code>OutputKeys</code> of
     * the associated playlist.
     * </p>
     * 
     * @param segmentDuration
     *        <p>
     *        (Outputs in Fragmented MP4 or MPEG-TS format only.
     *        </p>
     *        </important>
     *        <p>
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     *        <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the
     *        target maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media
     *        segment is stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>, and
     *        <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each segment
     *        is approximately the length of the <code>SegmentDuration</code>, though individual segments might be
     *        shorter or longer.
     *        </p>
     *        <p>
     *        The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     *        <code>SegmentDuration</code>, the duration of the last segment is the remainder of total
     *        length/SegmentDuration.
     *        </p>
     *        <p>
     *        Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you
     *        specify in OutputKeys. To add an output to the master playlist for this job, include it in the
     *        <code>OutputKeys</code> of the associated playlist.
     */

    public void setSegmentDuration(String segmentDuration) {
        this.segmentDuration = segmentDuration;
    }

    /**
     * <important>
     * <p>
     * (Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     * <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the target
     * maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media segment is
     * stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>, and
     * <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each segment is
     * approximately the length of the <code>SegmentDuration</code>, though individual segments might be shorter or
     * longer.
     * </p>
     * <p>
     * The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the remainder of total length/SegmentDuration.
     * </p>
     * <p>
     * Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you specify
     * in OutputKeys. To add an output to the master playlist for this job, include it in the <code>OutputKeys</code> of
     * the associated playlist.
     * </p>
     * 
     * @return <p>
     *         (Outputs in Fragmented MP4 or MPEG-TS format only.
     *         </p>
     *         </important>
     *         <p>
     *         If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     *         <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the
     *         target maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media
     *         segment is stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>,
     *         and <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each
     *         segment is approximately the length of the <code>SegmentDuration</code>, though individual segments might
     *         be shorter or longer.
     *         </p>
     *         <p>
     *         The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     *         <code>SegmentDuration</code>, the duration of the last segment is the remainder of total
     *         length/SegmentDuration.
     *         </p>
     *         <p>
     *         Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you
     *         specify in OutputKeys. To add an output to the master playlist for this job, include it in the
     *         <code>OutputKeys</code> of the associated playlist.
     */

    public String getSegmentDuration() {
        return this.segmentDuration;
    }

    /**
     * <important>
     * <p>
     * (Outputs in Fragmented MP4 or MPEG-TS format only.
     * </p>
     * </important>
     * <p>
     * If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     * <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the target
     * maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media segment is
     * stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>, and
     * <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each segment is
     * approximately the length of the <code>SegmentDuration</code>, though individual segments might be shorter or
     * longer.
     * </p>
     * <p>
     * The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     * <code>SegmentDuration</code>, the duration of the last segment is the remainder of total length/SegmentDuration.
     * </p>
     * <p>
     * Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you specify
     * in OutputKeys. To add an output to the master playlist for this job, include it in the <code>OutputKeys</code> of
     * the associated playlist.
     * </p>
     * 
     * @param segmentDuration
     *        <p>
     *        (Outputs in Fragmented MP4 or MPEG-TS format only.
     *        </p>
     *        </important>
     *        <p>
     *        If you specify a preset in <code>PresetId</code> for which the value of <code>Container</code> is
     *        <code>fmp4</code> (Fragmented MP4) or <code>ts</code> (MPEG-TS), <code>SegmentDuration</code> is the
     *        target maximum duration of each segment in seconds. For <code>HLSv3</code> format playlists, each media
     *        segment is stored in a separate <code>.ts</code> file. For <code>HLSv4</code>, <code>MPEG-DASH</code>, and
     *        <code>Smooth</code> playlists, all media segments for an output are stored in a single file. Each segment
     *        is approximately the length of the <code>SegmentDuration</code>, though individual segments might be
     *        shorter or longer.
     *        </p>
     *        <p>
     *        The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by
     *        <code>SegmentDuration</code>, the duration of the last segment is the remainder of total
     *        length/SegmentDuration.
     *        </p>
     *        <p>
     *        Elastic Transcoder creates an output-specific playlist for each output <code>HLS</code> output that you
     *        specify in OutputKeys. To add an output to the master playlist for this job, include it in the
     *        <code>OutputKeys</code> of the associated playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withSegmentDuration(String segmentDuration) {
        setSegmentDuration(segmentDuration);
        return this;
    }

    /**
     * <p>
     * The status of one output in a job. If you specified only one output for the job, <code>Outputs:Status</code> is
     * always the same as <code>Job:Status</code>. If you specified more than one output:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     * Transcoder starts to process the first output.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output, the value of <code>Outputs:Status</code>
     * remains Submitted until Elastic Transcoder starts to process the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If <code>Outputs:Status</code> for
     * one or more outputs is <code>Error</code>, the terminal status for <code>Job:Status</code> is also
     * <code>Error</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of <code>Status</code> is one of the following: <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * </p>
     * 
     * @param status
     *        The status of one output in a job. If you specified only one output for the job,
     *        <code>Outputs:Status</code> is always the same as <code>Job:Status</code>. If you specified more than one
     *        output: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     *        Transcoder starts to process the first output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output
     *        and <code>Job:Status</code> both change to Progressing. For each output, the value of
     *        <code>Outputs:Status</code> remains Submitted until Elastic Transcoder starts to process the output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     *        <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If
     *        <code>Outputs:Status</code> for one or more outputs is <code>Error</code>, the terminal status for
     *        <code>Job:Status</code> is also <code>Error</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of <code>Status</code> is one of the following: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of one output in a job. If you specified only one output for the job, <code>Outputs:Status</code> is
     * always the same as <code>Job:Status</code>. If you specified more than one output:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     * Transcoder starts to process the first output.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output, the value of <code>Outputs:Status</code>
     * remains Submitted until Elastic Transcoder starts to process the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If <code>Outputs:Status</code> for
     * one or more outputs is <code>Error</code>, the terminal status for <code>Job:Status</code> is also
     * <code>Error</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of <code>Status</code> is one of the following: <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * </p>
     * 
     * @return The status of one output in a job. If you specified only one output for the job,
     *         <code>Outputs:Status</code> is always the same as <code>Job:Status</code>. If you specified more than one
     *         output: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     *         Transcoder starts to process the first output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output
     *         and <code>Job:Status</code> both change to Progressing. For each output, the value of
     *         <code>Outputs:Status</code> remains Submitted until Elastic Transcoder starts to process the output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or
     *         Error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     *         <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If
     *         <code>Outputs:Status</code> for one or more outputs is <code>Error</code>, the terminal status for
     *         <code>Job:Status</code> is also <code>Error</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The value of <code>Status</code> is one of the following: <code>Submitted</code>,
     *         <code>Progressing</code>, <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of one output in a job. If you specified only one output for the job, <code>Outputs:Status</code> is
     * always the same as <code>Job:Status</code>. If you specified more than one output:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     * Transcoder starts to process the first output.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output and
     * <code>Job:Status</code> both change to Progressing. For each output, the value of <code>Outputs:Status</code>
     * remains Submitted until Elastic Transcoder starts to process the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     * <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If <code>Outputs:Status</code> for
     * one or more outputs is <code>Error</code>, the terminal status for <code>Job:Status</code> is also
     * <code>Error</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of <code>Status</code> is one of the following: <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * </p>
     * 
     * @param status
     *        The status of one output in a job. If you specified only one output for the job,
     *        <code>Outputs:Status</code> is always the same as <code>Job:Status</code>. If you specified more than one
     *        output: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Job:Status</code> and <code>Outputs:Status</code> for all of the outputs is Submitted until Elastic
     *        Transcoder starts to process the first output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When Elastic Transcoder starts to process the first output, <code>Outputs:Status</code> for that output
     *        and <code>Job:Status</code> both change to Progressing. For each output, the value of
     *        <code>Outputs:Status</code> remains Submitted until Elastic Transcoder starts to process the output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When all of the outputs reach a terminal status, <code>Job:Status</code> changes to Complete only if
     *        <code>Outputs:Status</code> for all of the outputs is <code>Complete</code>. If
     *        <code>Outputs:Status</code> for one or more outputs is <code>Error</code>, the terminal status for
     *        <code>Job:Status</code> is also <code>Error</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of <code>Status</code> is one of the following: <code>Submitted</code>, <code>Progressing</code>, <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Information that further explains <code>Status</code>.
     * </p>
     * 
     * @param statusDetail
     *        Information that further explains <code>Status</code>.
     */

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * Information that further explains <code>Status</code>.
     * </p>
     * 
     * @return Information that further explains <code>Status</code>.
     */

    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * <p>
     * Information that further explains <code>Status</code>.
     * </p>
     * 
     * @param statusDetail
     *        Information that further explains <code>Status</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withStatusDetail(String statusDetail) {
        setStatusDetail(statusDetail);
        return this;
    }

    /**
     * <p>
     * Duration of the output file, in seconds.
     * </p>
     * 
     * @param duration
     *        Duration of the output file, in seconds.
     */

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Duration of the output file, in seconds.
     * </p>
     * 
     * @return Duration of the output file, in seconds.
     */

    public Long getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Duration of the output file, in seconds.
     * </p>
     * 
     * @param duration
     *        Duration of the output file, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withDuration(Long duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * Specifies the width of the output file in pixels.
     * </p>
     * 
     * @param width
     *        Specifies the width of the output file in pixels.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * <p>
     * Specifies the width of the output file in pixels.
     * </p>
     * 
     * @return Specifies the width of the output file in pixels.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * <p>
     * Specifies the width of the output file in pixels.
     * </p>
     * 
     * @param width
     *        Specifies the width of the output file in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * Height of the output file, in pixels.
     * </p>
     * 
     * @param height
     *        Height of the output file, in pixels.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * <p>
     * Height of the output file, in pixels.
     * </p>
     * 
     * @return Height of the output file, in pixels.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * <p>
     * Height of the output file, in pixels.
     * </p>
     * 
     * @param height
     *        Height of the output file, in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * Frame rate of the output file, in frames per second.
     * </p>
     * 
     * @param frameRate
     *        Frame rate of the output file, in frames per second.
     */

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * <p>
     * Frame rate of the output file, in frames per second.
     * </p>
     * 
     * @return Frame rate of the output file, in frames per second.
     */

    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * <p>
     * Frame rate of the output file, in frames per second.
     * </p>
     * 
     * @param frameRate
     *        Frame rate of the output file, in frames per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withFrameRate(String frameRate) {
        setFrameRate(frameRate);
        return this;
    }

    /**
     * <p>
     * File size of the output file, in bytes.
     * </p>
     * 
     * @param fileSize
     *        File size of the output file, in bytes.
     */

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * File size of the output file, in bytes.
     * </p>
     * 
     * @return File size of the output file, in bytes.
     */

    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * <p>
     * File size of the output file, in bytes.
     * </p>
     * 
     * @param fileSize
     *        File size of the output file, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withFileSize(Long fileSize) {
        setFileSize(fileSize);
        return this;
    }

    /**
     * <p>
     * Duration of the output file, in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        Duration of the output file, in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * Duration of the output file, in milliseconds.
     * </p>
     * 
     * @return Duration of the output file, in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * Duration of the output file, in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        Duration of the output file, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can
     * specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you
     * specify in <code>Preset</code> for the current output.
     * </p>
     * <p>
     * Watermarks are added to the output video in the sequence in which you list them in the job output—the first
     * watermark in the list is added to the output video first, the second watermark in the list is added next, and so
     * on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same
     * location, the second watermark that you add covers the first one, the third one covers the second, and the fourth
     * one covers the third.
     * </p>
     * 
     * @return Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding.
     *         You can specify up to four watermarks for each output. Settings for each watermark must be defined in the
     *         preset that you specify in <code>Preset</code> for the current output.</p>
     *         <p>
     *         Watermarks are added to the output video in the sequence in which you list them in the job output—the
     *         first watermark in the list is added to the output video first, the second watermark in the list is added
     *         next, and so on. As a result, if the settings in a preset cause Elastic Transcoder to place all
     *         watermarks in the same location, the second watermark that you add covers the first one, the third one
     *         covers the second, and the fourth one covers the third.
     */

    public java.util.List<JobWatermark> getWatermarks() {
        if (watermarks == null) {
            watermarks = new com.amazonaws.internal.SdkInternalList<JobWatermark>();
        }
        return watermarks;
    }

    /**
     * <p>
     * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can
     * specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you
     * specify in <code>Preset</code> for the current output.
     * </p>
     * <p>
     * Watermarks are added to the output video in the sequence in which you list them in the job output—the first
     * watermark in the list is added to the output video first, the second watermark in the list is added next, and so
     * on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same
     * location, the second watermark that you add covers the first one, the third one covers the second, and the fourth
     * one covers the third.
     * </p>
     * 
     * @param watermarks
     *        Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding.
     *        You can specify up to four watermarks for each output. Settings for each watermark must be defined in the
     *        preset that you specify in <code>Preset</code> for the current output.</p>
     *        <p>
     *        Watermarks are added to the output video in the sequence in which you list them in the job output—the
     *        first watermark in the list is added to the output video first, the second watermark in the list is added
     *        next, and so on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks
     *        in the same location, the second watermark that you add covers the first one, the third one covers the
     *        second, and the fourth one covers the third.
     */

    public void setWatermarks(java.util.Collection<JobWatermark> watermarks) {
        if (watermarks == null) {
            this.watermarks = null;
            return;
        }

        this.watermarks = new com.amazonaws.internal.SdkInternalList<JobWatermark>(watermarks);
    }

    /**
     * <p>
     * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can
     * specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you
     * specify in <code>Preset</code> for the current output.
     * </p>
     * <p>
     * Watermarks are added to the output video in the sequence in which you list them in the job output—the first
     * watermark in the list is added to the output video first, the second watermark in the list is added next, and so
     * on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same
     * location, the second watermark that you add covers the first one, the third one covers the second, and the fourth
     * one covers the third.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWatermarks(java.util.Collection)} or {@link #withWatermarks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param watermarks
     *        Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding.
     *        You can specify up to four watermarks for each output. Settings for each watermark must be defined in the
     *        preset that you specify in <code>Preset</code> for the current output.</p>
     *        <p>
     *        Watermarks are added to the output video in the sequence in which you list them in the job output—the
     *        first watermark in the list is added to the output video first, the second watermark in the list is added
     *        next, and so on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks
     *        in the same location, the second watermark that you add covers the first one, the third one covers the
     *        second, and the fourth one covers the third.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withWatermarks(JobWatermark... watermarks) {
        if (this.watermarks == null) {
            setWatermarks(new com.amazonaws.internal.SdkInternalList<JobWatermark>(watermarks.length));
        }
        for (JobWatermark ele : watermarks) {
            this.watermarks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can
     * specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you
     * specify in <code>Preset</code> for the current output.
     * </p>
     * <p>
     * Watermarks are added to the output video in the sequence in which you list them in the job output—the first
     * watermark in the list is added to the output video first, the second watermark in the list is added next, and so
     * on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same
     * location, the second watermark that you add covers the first one, the third one covers the second, and the fourth
     * one covers the third.
     * </p>
     * 
     * @param watermarks
     *        Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding.
     *        You can specify up to four watermarks for each output. Settings for each watermark must be defined in the
     *        preset that you specify in <code>Preset</code> for the current output.</p>
     *        <p>
     *        Watermarks are added to the output video in the sequence in which you list them in the job output—the
     *        first watermark in the list is added to the output video first, the second watermark in the list is added
     *        next, and so on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks
     *        in the same location, the second watermark that you add covers the first one, the third one covers the
     *        second, and the fourth one covers the third.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withWatermarks(java.util.Collection<JobWatermark> watermarks) {
        setWatermarks(watermarks);
        return this;
    }

    /**
     * <p>
     * The album art to be associated with the output file, if any.
     * </p>
     * 
     * @param albumArt
     *        The album art to be associated with the output file, if any.
     */

    public void setAlbumArt(JobAlbumArt albumArt) {
        this.albumArt = albumArt;
    }

    /**
     * <p>
     * The album art to be associated with the output file, if any.
     * </p>
     * 
     * @return The album art to be associated with the output file, if any.
     */

    public JobAlbumArt getAlbumArt() {
        return this.albumArt;
    }

    /**
     * <p>
     * The album art to be associated with the output file, if any.
     * </p>
     * 
     * @param albumArt
     *        The album art to be associated with the output file, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withAlbumArt(JobAlbumArt albumArt) {
        setAlbumArt(albumArt);
        return this;
    }

    /**
     * <p>
     * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come
     * from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make
     * up an output file. For the current release, you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * </p>
     * 
     * @return You can create an output file that contains an excerpt from the input file. This excerpt, called a clip,
     *         can come from the beginning, middle, or end of the file. The Composition object contains settings for the
     *         clips that make up an output file. For the current release, you can only specify settings for a single
     *         clip per output file. The Composition object cannot be null.
     */
    @Deprecated
    public java.util.List<Clip> getComposition() {
        if (composition == null) {
            composition = new com.amazonaws.internal.SdkInternalList<Clip>();
        }
        return composition;
    }

    /**
     * <p>
     * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come
     * from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make
     * up an output file. For the current release, you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * </p>
     * 
     * @param composition
     *        You can create an output file that contains an excerpt from the input file. This excerpt, called a clip,
     *        can come from the beginning, middle, or end of the file. The Composition object contains settings for the
     *        clips that make up an output file. For the current release, you can only specify settings for a single
     *        clip per output file. The Composition object cannot be null.
     */
    @Deprecated
    public void setComposition(java.util.Collection<Clip> composition) {
        if (composition == null) {
            this.composition = null;
            return;
        }

        this.composition = new com.amazonaws.internal.SdkInternalList<Clip>(composition);
    }

    /**
     * <p>
     * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come
     * from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make
     * up an output file. For the current release, you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComposition(java.util.Collection)} or {@link #withComposition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param composition
     *        You can create an output file that contains an excerpt from the input file. This excerpt, called a clip,
     *        can come from the beginning, middle, or end of the file. The Composition object contains settings for the
     *        clips that make up an output file. For the current release, you can only specify settings for a single
     *        clip per output file. The Composition object cannot be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public JobOutput withComposition(Clip... composition) {
        if (this.composition == null) {
            setComposition(new com.amazonaws.internal.SdkInternalList<Clip>(composition.length));
        }
        for (Clip ele : composition) {
            this.composition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come
     * from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make
     * up an output file. For the current release, you can only specify settings for a single clip per output file. The
     * Composition object cannot be null.
     * </p>
     * 
     * @param composition
     *        You can create an output file that contains an excerpt from the input file. This excerpt, called a clip,
     *        can come from the beginning, middle, or end of the file. The Composition object contains settings for the
     *        clips that make up an output file. For the current release, you can only specify settings for a single
     *        clip per output file. The Composition object cannot be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public JobOutput withComposition(java.util.Collection<Clip> composition) {
        setComposition(composition);
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
     * @param captions
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

    public void setCaptions(Captions captions) {
        this.captions = captions;
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

    public Captions getCaptions() {
        return this.captions;
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
     * @param captions
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

    public JobOutput withCaptions(Captions captions) {
        setCaptions(captions);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you choose to
     * use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic Transcoder writes an
     * unencrypted file to your Amazon S3 bucket.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you
     *        choose to use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic
     *        Transcoder writes an unencrypted file to your Amazon S3 bucket.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you choose to
     * use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic Transcoder writes an
     * unencrypted file to your Amazon S3 bucket.
     * </p>
     * 
     * @return The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you
     *         choose to use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic
     *         Transcoder writes an unencrypted file to your Amazon S3 bucket.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you choose to
     * use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic Transcoder writes an
     * unencrypted file to your Amazon S3 bucket.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you
     *        choose to use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic
     *        Transcoder writes an unencrypted file to your Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * <p>
     * If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output file,
     * the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     * <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the job
     * response.
     * </p>
     * 
     * @param appliedColorSpaceConversion
     *        If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output
     *        file, the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     *        <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the
     *        job response.
     */

    public void setAppliedColorSpaceConversion(String appliedColorSpaceConversion) {
        this.appliedColorSpaceConversion = appliedColorSpaceConversion;
    }

    /**
     * <p>
     * If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output file,
     * the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     * <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the job
     * response.
     * </p>
     * 
     * @return If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output
     *         file, the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     *         <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the
     *         job response.
     */

    public String getAppliedColorSpaceConversion() {
        return this.appliedColorSpaceConversion;
    }

    /**
     * <p>
     * If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output file,
     * the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     * <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the job
     * response.
     * </p>
     * 
     * @param appliedColorSpaceConversion
     *        If Elastic Transcoder used a preset with a <code>ColorSpaceConversionMode</code> to transcode the output
     *        file, the <code>AppliedColorSpaceConversion</code> parameter shows the conversion used. If no
     *        <code>ColorSpaceConversionMode</code> was defined in the preset, this parameter is not be included in the
     *        job response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobOutput withAppliedColorSpaceConversion(String appliedColorSpaceConversion) {
        setAppliedColorSpaceConversion(appliedColorSpaceConversion);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getThumbnailPattern() != null)
            sb.append("ThumbnailPattern: ").append(getThumbnailPattern()).append(",");
        if (getThumbnailEncryption() != null)
            sb.append("ThumbnailEncryption: ").append(getThumbnailEncryption()).append(",");
        if (getRotate() != null)
            sb.append("Rotate: ").append(getRotate()).append(",");
        if (getPresetId() != null)
            sb.append("PresetId: ").append(getPresetId()).append(",");
        if (getSegmentDuration() != null)
            sb.append("SegmentDuration: ").append(getSegmentDuration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: ").append(getStatusDetail()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getFrameRate() != null)
            sb.append("FrameRate: ").append(getFrameRate()).append(",");
        if (getFileSize() != null)
            sb.append("FileSize: ").append(getFileSize()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getWatermarks() != null)
            sb.append("Watermarks: ").append(getWatermarks()).append(",");
        if (getAlbumArt() != null)
            sb.append("AlbumArt: ").append(getAlbumArt()).append(",");
        if (getComposition() != null)
            sb.append("Composition: ").append(getComposition()).append(",");
        if (getCaptions() != null)
            sb.append("Captions: ").append(getCaptions()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getAppliedColorSpaceConversion() != null)
            sb.append("AppliedColorSpaceConversion: ").append(getAppliedColorSpaceConversion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobOutput == false)
            return false;
        JobOutput other = (JobOutput) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getThumbnailPattern() == null ^ this.getThumbnailPattern() == null)
            return false;
        if (other.getThumbnailPattern() != null && other.getThumbnailPattern().equals(this.getThumbnailPattern()) == false)
            return false;
        if (other.getThumbnailEncryption() == null ^ this.getThumbnailEncryption() == null)
            return false;
        if (other.getThumbnailEncryption() != null && other.getThumbnailEncryption().equals(this.getThumbnailEncryption()) == false)
            return false;
        if (other.getRotate() == null ^ this.getRotate() == null)
            return false;
        if (other.getRotate() != null && other.getRotate().equals(this.getRotate()) == false)
            return false;
        if (other.getPresetId() == null ^ this.getPresetId() == null)
            return false;
        if (other.getPresetId() != null && other.getPresetId().equals(this.getPresetId()) == false)
            return false;
        if (other.getSegmentDuration() == null ^ this.getSegmentDuration() == null)
            return false;
        if (other.getSegmentDuration() != null && other.getSegmentDuration().equals(this.getSegmentDuration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getWatermarks() == null ^ this.getWatermarks() == null)
            return false;
        if (other.getWatermarks() != null && other.getWatermarks().equals(this.getWatermarks()) == false)
            return false;
        if (other.getAlbumArt() == null ^ this.getAlbumArt() == null)
            return false;
        if (other.getAlbumArt() != null && other.getAlbumArt().equals(this.getAlbumArt()) == false)
            return false;
        if (other.getComposition() == null ^ this.getComposition() == null)
            return false;
        if (other.getComposition() != null && other.getComposition().equals(this.getComposition()) == false)
            return false;
        if (other.getCaptions() == null ^ this.getCaptions() == null)
            return false;
        if (other.getCaptions() != null && other.getCaptions().equals(this.getCaptions()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getAppliedColorSpaceConversion() == null ^ this.getAppliedColorSpaceConversion() == null)
            return false;
        if (other.getAppliedColorSpaceConversion() != null && other.getAppliedColorSpaceConversion().equals(this.getAppliedColorSpaceConversion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getThumbnailPattern() == null) ? 0 : getThumbnailPattern().hashCode());
        hashCode = prime * hashCode + ((getThumbnailEncryption() == null) ? 0 : getThumbnailEncryption().hashCode());
        hashCode = prime * hashCode + ((getRotate() == null) ? 0 : getRotate().hashCode());
        hashCode = prime * hashCode + ((getPresetId() == null) ? 0 : getPresetId().hashCode());
        hashCode = prime * hashCode + ((getSegmentDuration() == null) ? 0 : getSegmentDuration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getWatermarks() == null) ? 0 : getWatermarks().hashCode());
        hashCode = prime * hashCode + ((getAlbumArt() == null) ? 0 : getAlbumArt().hashCode());
        hashCode = prime * hashCode + ((getComposition() == null) ? 0 : getComposition().hashCode());
        hashCode = prime * hashCode + ((getCaptions() == null) ? 0 : getCaptions().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getAppliedColorSpaceConversion() == null) ? 0 : getAppliedColorSpaceConversion().hashCode());
        return hashCode;
    }

    @Override
    public JobOutput clone() {
        try {
            return (JobOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.JobOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
