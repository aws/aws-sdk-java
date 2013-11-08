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
 * The <code>VideoParameters</code> structure.
 * </p>
 */
public class VideoParameters implements Serializable {

    /**
     * The video codec for the output file. Valid values include
     * <code>H.264</code> and <code>vp8</code>. You can only specify
     * <code>vp8</code> when the container type is <code>webm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^H\.264$)|(^vp8$)<br/>
     */
    private String codec;

    /**
     * <b>Profile</b> <p>The H.264 profile that you want to use for the
     * output file. Elastic Transcoder supports the following profiles: <ul>
     * <li><code>baseline</code>: The profile most commonly used for
     * videoconferencing and for mobile applications.</li>
     * <li><code>main</code>: The profile used for standard-definition
     * digital TV broadcasts.</li> <li><code>high</code>: The profile used
     * for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     * </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     * to use for the output file. Elastic Transcoder supports the following
     * levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     * <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     * <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     * <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     * Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     * The maximum number of previously decoded frames to use as a reference
     * for decoding future frames. Valid values are integers 0 through 16,
     * but we recommend that you not use a value greater than the following:
     * <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     * 256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     * <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     * MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     * buffer in macroblocks</i> depends on the value of the
     * <code>Level</code> object. See the list below. (A macroblock is a
     * block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     * 396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     * <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     * 8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     * <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     * of bits per second in a video buffer; the size of the buffer is
     * specified by <code>BufferSize</code>. Specify a value between 16 and
     * 62,500. You can reduce the bandwidth required to stream a video by
     * reducing the maximum bit rate, but this also reduces the quality of
     * the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     * x seconds of the output video. This window is commonly 10 seconds, the
     * standard segment duration when you're using MPEG-TS for the container
     * type of the output video. Specify an integer greater than 0. If you
     * specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     * Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     * of <code>MaxBitRate</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private java.util.Map<String,String> codecOptions;

    /**
     * The maximum number of frames between key frames. Key frames are fully
     * encoded frames; the frames between key frames are encoded based, in
     * part, on the content of the key frames. The value is an integer
     * formatted as a string; valid values are between 1 (every frame is a
     * key frame) and 100000, inclusive. A higher value results in higher
     * compression but may also discernibly decrease video quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,6}$<br/>
     */
    private String keyframesMaxDist;

    /**
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     * are <code>true</code> and <code>false</code>: <ul>
     * <li><code>true</code>: Elastic Transcoder uses the value of
     * <code>KeyframesMaxDist</code> for the distance between key frames (the
     * number of frames in a group of pictures, or GOP).</li>
     * <li><code>false</code>: The distance between key frames can vary.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     */
    private String fixedGOP;

    /**
     * The bit rate of the video stream in the output file, in
     * kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     * the input source. If you specify a value other than <code>auto</code>,
     * we recommend that you specify a value less than or equal to the
     * maximum H.264-compliant value listed for your level and profile: <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and
     * main Profile) : maximum video bit rate in kilobits/second (high
     * Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     * - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     * <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     * 17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     * <li>4.1 - 50000 : 62500</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{2,5}$)|(^auto$)<br/>
     */
    private String bitRate;

    /**
     * The frames per second for the video stream in the output file. Valid
     * values include: <p><code>auto</code>, <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     * the input source. If you specify a frame rate, we recommend that you
     * perform the following calculation: <p> <code>Frame rate = maximum
     * recommended decoding speed in luma samples/second / (width in pixels *
     * height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     * <i>height in pixels</i> represent the Resolution of the output
     * video.</li> <li><i>maximum recommended decoding speed in Luma
     * samples/second</i> is less than or equal to the maximum value listed
     * in the following table, based on the value that you specified for
     * Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     * samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     * 380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     * 3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     * 5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     * 55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     */
    private String frameRate;

    /**
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     * Transcoder uses the frame rate of the input video for the frame rate
     * of the output video. Specify the maximum frame rate that you want
     * Elastic Transcoder to use when the frame rate of the input video is
     * greater than the desired maximum frame rate of the output video. Valid
     * values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     * <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     * <code>60</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     */
    private String maxFrameRate;

    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The width and height of the video in the
     * output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     * Transcoder attempts to preserve the width and height of the input
     * file, subject to the following rules.</li> <li><code><i>width</i> x
     * <i>height</i></code>: The width and height of the output video in
     * pixels.</li> </ul> <p>Note the following about specifying the width
     * and height: <ul> <li>The width must be an even integer between 128 and
     * 4096, inclusive.</li> <li>The height must be an even integer between
     * 96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     * less than the resolution of the input file, Elastic Transcoder
     * rescales the output file to the lower resolution.</li> <li>If you
     * specify a resolution that is greater than the resolution of the input
     * file, Elastic Transcoder rescales the output to the higher
     * resolution.</li> <li>We recommend that you specify a resolution for
     * which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height
     * value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     * 101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     * 101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     * 404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     * 2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     */
    private String resolution;

    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The display aspect ratio of the video in the
     * output file. Valid values include: <p><code>auto</code>,
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     * <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder tries to preserve the aspect ratio of the input file. <p>If
     * you specify an aspect ratio for the output file that differs from
     * aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     * (black bars on the sides) or letterboxing (black bars on the top and
     * bottom) to maintain the aspect ratio of the active region of the
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     */
    private String aspectRatio;

    /**
     * The maximum width of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 128 and 4096.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     */
    private String maxWidth;

    /**
     * The maximum height of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 96 and 3072.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     */
    private String maxHeight;

    /**
     * The value that Elastic Transcoder adds to the metadata in the output
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     */
    private String displayAspectRatio;

    /**
     * Specify one of the following values to control scaling of the output
     * video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output video and then
     * crops it in the dimension (if any) that exceeds the maximum
     * value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     * output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input video and the output video are different, the
     * output video will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale the output video. If either dimension of the
     * input video exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder
     * does not scale the video up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     */
    private String sizingPolicy;

    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of the output video to make the total size of the output
     * video match the values that you specified for <code>MaxWidth</code>
     * and <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     */
    private String paddingPolicy;

    /**
     * Settings for the size, location, and opacity of graphics that you want
     * Elastic Transcoder to overlay over videos that are transcoded using
     * this preset. You can specify settings for up to four watermarks.
     * Watermarks appear in the specified size and location, and with the
     * specified opacity for the duration of the transcoded video.
     * <p>Watermarks can be in .png or .jpg format. If you want to display a
     * watermark that is not rectangular, use the .png format, which supports
     * transparency. <p>When you create a job that uses this preset, you
     * specify the .png or .jpg graphics that you want Elastic Transcoder to
     * include in the transcoded videos. You can specify fewer graphics in
     * the job than you specify watermark settings in the preset, which
     * allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark> watermarks;

    /**
     * The video codec for the output file. Valid values include
     * <code>H.264</code> and <code>vp8</code>. You can only specify
     * <code>vp8</code> when the container type is <code>webm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^H\.264$)|(^vp8$)<br/>
     *
     * @return The video codec for the output file. Valid values include
     *         <code>H.264</code> and <code>vp8</code>. You can only specify
     *         <code>vp8</code> when the container type is <code>webm</code>.
     */
    public String getCodec() {
        return codec;
    }
    
    /**
     * The video codec for the output file. Valid values include
     * <code>H.264</code> and <code>vp8</code>. You can only specify
     * <code>vp8</code> when the container type is <code>webm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^H\.264$)|(^vp8$)<br/>
     *
     * @param codec The video codec for the output file. Valid values include
     *         <code>H.264</code> and <code>vp8</code>. You can only specify
     *         <code>vp8</code> when the container type is <code>webm</code>.
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }
    
    /**
     * The video codec for the output file. Valid values include
     * <code>H.264</code> and <code>vp8</code>. You can only specify
     * <code>vp8</code> when the container type is <code>webm</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^H\.264$)|(^vp8$)<br/>
     *
     * @param codec The video codec for the output file. Valid values include
     *         <code>H.264</code> and <code>vp8</code>. You can only specify
     *         <code>vp8</code> when the container type is <code>webm</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * <b>Profile</b> <p>The H.264 profile that you want to use for the
     * output file. Elastic Transcoder supports the following profiles: <ul>
     * <li><code>baseline</code>: The profile most commonly used for
     * videoconferencing and for mobile applications.</li>
     * <li><code>main</code>: The profile used for standard-definition
     * digital TV broadcasts.</li> <li><code>high</code>: The profile used
     * for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     * </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     * to use for the output file. Elastic Transcoder supports the following
     * levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     * <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     * <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     * <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     * Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     * The maximum number of previously decoded frames to use as a reference
     * for decoding future frames. Valid values are integers 0 through 16,
     * but we recommend that you not use a value greater than the following:
     * <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     * 256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     * <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     * MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     * buffer in macroblocks</i> depends on the value of the
     * <code>Level</code> object. See the list below. (A macroblock is a
     * block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     * 396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     * <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     * 8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     * <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     * of bits per second in a video buffer; the size of the buffer is
     * specified by <code>BufferSize</code>. Specify a value between 16 and
     * 62,500. You can reduce the bandwidth required to stream a video by
     * reducing the maximum bit rate, but this also reduces the quality of
     * the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     * x seconds of the output video. This window is commonly 10 seconds, the
     * standard segment duration when you're using MPEG-TS for the container
     * type of the output video. Specify an integer greater than 0. If you
     * specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     * Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     * of <code>MaxBitRate</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return <b>Profile</b> <p>The H.264 profile that you want to use for the
     *         output file. Elastic Transcoder supports the following profiles: <ul>
     *         <li><code>baseline</code>: The profile most commonly used for
     *         videoconferencing and for mobile applications.</li>
     *         <li><code>main</code>: The profile used for standard-definition
     *         digital TV broadcasts.</li> <li><code>high</code>: The profile used
     *         for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     *         </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     *         to use for the output file. Elastic Transcoder supports the following
     *         levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     *         <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     *         <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     *         <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     *         Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     *         The maximum number of previously decoded frames to use as a reference
     *         for decoding future frames. Valid values are integers 0 through 16,
     *         but we recommend that you not use a value greater than the following:
     *         <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     *         256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     *         <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     *         MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     *         buffer in macroblocks</i> depends on the value of the
     *         <code>Level</code> object. See the list below. (A macroblock is a
     *         block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     *         396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     *         <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     *         8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     *         <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     *         of bits per second in a video buffer; the size of the buffer is
     *         specified by <code>BufferSize</code>. Specify a value between 16 and
     *         62,500. You can reduce the bandwidth required to stream a video by
     *         reducing the maximum bit rate, but this also reduces the quality of
     *         the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     *         x seconds of the output video. This window is commonly 10 seconds, the
     *         standard segment duration when you're using MPEG-TS for the container
     *         type of the output video. Specify an integer greater than 0. If you
     *         specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     *         Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     *         of <code>MaxBitRate</code>.
     */
    public java.util.Map<String,String> getCodecOptions() {
        
        if (codecOptions == null) {
            codecOptions = new java.util.HashMap<String,String>();
        }
        return codecOptions;
    }
    
    /**
     * <b>Profile</b> <p>The H.264 profile that you want to use for the
     * output file. Elastic Transcoder supports the following profiles: <ul>
     * <li><code>baseline</code>: The profile most commonly used for
     * videoconferencing and for mobile applications.</li>
     * <li><code>main</code>: The profile used for standard-definition
     * digital TV broadcasts.</li> <li><code>high</code>: The profile used
     * for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     * </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     * to use for the output file. Elastic Transcoder supports the following
     * levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     * <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     * <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     * <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     * Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     * The maximum number of previously decoded frames to use as a reference
     * for decoding future frames. Valid values are integers 0 through 16,
     * but we recommend that you not use a value greater than the following:
     * <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     * 256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     * <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     * MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     * buffer in macroblocks</i> depends on the value of the
     * <code>Level</code> object. See the list below. (A macroblock is a
     * block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     * 396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     * <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     * 8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     * <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     * of bits per second in a video buffer; the size of the buffer is
     * specified by <code>BufferSize</code>. Specify a value between 16 and
     * 62,500. You can reduce the bandwidth required to stream a video by
     * reducing the maximum bit rate, but this also reduces the quality of
     * the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     * x seconds of the output video. This window is commonly 10 seconds, the
     * standard segment duration when you're using MPEG-TS for the container
     * type of the output video. Specify an integer greater than 0. If you
     * specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     * Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     * of <code>MaxBitRate</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param codecOptions <b>Profile</b> <p>The H.264 profile that you want to use for the
     *         output file. Elastic Transcoder supports the following profiles: <ul>
     *         <li><code>baseline</code>: The profile most commonly used for
     *         videoconferencing and for mobile applications.</li>
     *         <li><code>main</code>: The profile used for standard-definition
     *         digital TV broadcasts.</li> <li><code>high</code>: The profile used
     *         for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     *         </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     *         to use for the output file. Elastic Transcoder supports the following
     *         levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     *         <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     *         <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     *         <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     *         Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     *         The maximum number of previously decoded frames to use as a reference
     *         for decoding future frames. Valid values are integers 0 through 16,
     *         but we recommend that you not use a value greater than the following:
     *         <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     *         256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     *         <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     *         MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     *         buffer in macroblocks</i> depends on the value of the
     *         <code>Level</code> object. See the list below. (A macroblock is a
     *         block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     *         396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     *         <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     *         8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     *         <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     *         of bits per second in a video buffer; the size of the buffer is
     *         specified by <code>BufferSize</code>. Specify a value between 16 and
     *         62,500. You can reduce the bandwidth required to stream a video by
     *         reducing the maximum bit rate, but this also reduces the quality of
     *         the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     *         x seconds of the output video. This window is commonly 10 seconds, the
     *         standard segment duration when you're using MPEG-TS for the container
     *         type of the output video. Specify an integer greater than 0. If you
     *         specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     *         Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     *         of <code>MaxBitRate</code>.
     */
    public void setCodecOptions(java.util.Map<String,String> codecOptions) {
        this.codecOptions = codecOptions;
    }
    
    /**
     * <b>Profile</b> <p>The H.264 profile that you want to use for the
     * output file. Elastic Transcoder supports the following profiles: <ul>
     * <li><code>baseline</code>: The profile most commonly used for
     * videoconferencing and for mobile applications.</li>
     * <li><code>main</code>: The profile used for standard-definition
     * digital TV broadcasts.</li> <li><code>high</code>: The profile used
     * for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     * </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     * to use for the output file. Elastic Transcoder supports the following
     * levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     * <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     * <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     * <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     * Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     * The maximum number of previously decoded frames to use as a reference
     * for decoding future frames. Valid values are integers 0 through 16,
     * but we recommend that you not use a value greater than the following:
     * <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     * 256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     * <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     * MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     * buffer in macroblocks</i> depends on the value of the
     * <code>Level</code> object. See the list below. (A macroblock is a
     * block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     * 396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     * <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     * 8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     * <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     * of bits per second in a video buffer; the size of the buffer is
     * specified by <code>BufferSize</code>. Specify a value between 16 and
     * 62,500. You can reduce the bandwidth required to stream a video by
     * reducing the maximum bit rate, but this also reduces the quality of
     * the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     * x seconds of the output video. This window is commonly 10 seconds, the
     * standard segment duration when you're using MPEG-TS for the container
     * type of the output video. Specify an integer greater than 0. If you
     * specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     * Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     * of <code>MaxBitRate</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param codecOptions <b>Profile</b> <p>The H.264 profile that you want to use for the
     *         output file. Elastic Transcoder supports the following profiles: <ul>
     *         <li><code>baseline</code>: The profile most commonly used for
     *         videoconferencing and for mobile applications.</li>
     *         <li><code>main</code>: The profile used for standard-definition
     *         digital TV broadcasts.</li> <li><code>high</code>: The profile used
     *         for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     *         </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     *         to use for the output file. Elastic Transcoder supports the following
     *         levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     *         <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     *         <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     *         <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     *         Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     *         The maximum number of previously decoded frames to use as a reference
     *         for decoding future frames. Valid values are integers 0 through 16,
     *         but we recommend that you not use a value greater than the following:
     *         <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     *         256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     *         <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     *         MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     *         buffer in macroblocks</i> depends on the value of the
     *         <code>Level</code> object. See the list below. (A macroblock is a
     *         block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     *         396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     *         <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     *         8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     *         <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     *         of bits per second in a video buffer; the size of the buffer is
     *         specified by <code>BufferSize</code>. Specify a value between 16 and
     *         62,500. You can reduce the bandwidth required to stream a video by
     *         reducing the maximum bit rate, but this also reduces the quality of
     *         the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     *         x seconds of the output video. This window is commonly 10 seconds, the
     *         standard segment duration when you're using MPEG-TS for the container
     *         type of the output video. Specify an integer greater than 0. If you
     *         specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     *         Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     *         of <code>MaxBitRate</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withCodecOptions(java.util.Map<String,String> codecOptions) {
        setCodecOptions(codecOptions);
        return this;
    }

    /**
     * <b>Profile</b> <p>The H.264 profile that you want to use for the
     * output file. Elastic Transcoder supports the following profiles: <ul>
     * <li><code>baseline</code>: The profile most commonly used for
     * videoconferencing and for mobile applications.</li>
     * <li><code>main</code>: The profile used for standard-definition
     * digital TV broadcasts.</li> <li><code>high</code>: The profile used
     * for high-definition digital TV broadcasts and for Blu-ray discs.</li>
     * </ul> <p> <b>Level (H.264 Only)</b> <p>The H.264 level that you want
     * to use for the output file. Elastic Transcoder supports the following
     * levels: <p><code>1</code>, <code>1b</code>, <code>1.1</code>,
     * <code>1.2</code>, <code>1.3</code>, <code>2</code>, <code>2.1</code>,
     * <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>,
     * <code>4</code>, <code>4.1</code> <p> <b>MaxReferenceFrames (H.264
     * Only)</b> <p>Applicable only when the value of Video:Codec is H.264.
     * The maximum number of previously decoded frames to use as a reference
     * for decoding future frames. Valid values are integers 0 through 16,
     * but we recommend that you not use a value greater than the following:
     * <p> <code>Min(Floor(Maximum decoded picture buffer in macroblocks *
     * 256 / (Width in pixels * Height in pixels)), 16)</code> <p>where
     * <i>Width in pixels</i> and <i>Height in pixels</i> represent either
     * MaxWidth and MaxHeight, or Resolution. <i>Maximum decoded picture
     * buffer in macroblocks</i> depends on the value of the
     * <code>Level</code> object. See the list below. (A macroblock is a
     * block of pixels measuring 16x16.) <ul> <li>1 - 396</li> <li>1b -
     * 396</li> <li>1.1 - 900</li> <li>1.2 - 2376</li> <li>1.3 - 2376</li>
     * <li>2 - 2376</li> <li>2.1 - 4752</li> <li>2.2 - 8100</li> <li>3 -
     * 8100</li> <li>3.1 - 18000</li> <li>3.2 - 20480</li> <li>4 - 32768</li>
     * <li>4.1 - 32768</li> </ul> <p> <b>MaxBitRate</b> <p>The maximum number
     * of bits per second in a video buffer; the size of the buffer is
     * specified by <code>BufferSize</code>. Specify a value between 16 and
     * 62,500. You can reduce the bandwidth required to stream a video by
     * reducing the maximum bit rate, but this also reduces the quality of
     * the video. <p> <b>BufferSize</b> <p>The maximum number of bits in any
     * x seconds of the output video. This window is commonly 10 seconds, the
     * standard segment duration when you're using MPEG-TS for the container
     * type of the output video. Specify an integer greater than 0. If you
     * specify <code>MaxBitRate</code> and omit <code>BufferSize</code>,
     * Elastic Transcoder sets <code>BufferSize</code> to 10 times the value
     * of <code>MaxBitRate</code>.
     * <p>
     * The method adds a new key-value pair into CodecOptions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param key The key of the entry to be added into CodecOptions.
     * @param value The corresponding value of the entry to be added into CodecOptions.
     */
	public VideoParameters addCodecOptionsEntry(String key, String value) {
		if (null == this.codecOptions) {
			this.codecOptions = new java.util.HashMap<String,String>();
		}
		if (this.codecOptions.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.codecOptions.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into CodecOptions.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public VideoParameters clearCodecOptionsEntries() {
		this.codecOptions = null;
		return this;
	}
	
    /**
     * The maximum number of frames between key frames. Key frames are fully
     * encoded frames; the frames between key frames are encoded based, in
     * part, on the content of the key frames. The value is an integer
     * formatted as a string; valid values are between 1 (every frame is a
     * key frame) and 100000, inclusive. A higher value results in higher
     * compression but may also discernibly decrease video quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,6}$<br/>
     *
     * @return The maximum number of frames between key frames. Key frames are fully
     *         encoded frames; the frames between key frames are encoded based, in
     *         part, on the content of the key frames. The value is an integer
     *         formatted as a string; valid values are between 1 (every frame is a
     *         key frame) and 100000, inclusive. A higher value results in higher
     *         compression but may also discernibly decrease video quality.
     */
    public String getKeyframesMaxDist() {
        return keyframesMaxDist;
    }
    
    /**
     * The maximum number of frames between key frames. Key frames are fully
     * encoded frames; the frames between key frames are encoded based, in
     * part, on the content of the key frames. The value is an integer
     * formatted as a string; valid values are between 1 (every frame is a
     * key frame) and 100000, inclusive. A higher value results in higher
     * compression but may also discernibly decrease video quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,6}$<br/>
     *
     * @param keyframesMaxDist The maximum number of frames between key frames. Key frames are fully
     *         encoded frames; the frames between key frames are encoded based, in
     *         part, on the content of the key frames. The value is an integer
     *         formatted as a string; valid values are between 1 (every frame is a
     *         key frame) and 100000, inclusive. A higher value results in higher
     *         compression but may also discernibly decrease video quality.
     */
    public void setKeyframesMaxDist(String keyframesMaxDist) {
        this.keyframesMaxDist = keyframesMaxDist;
    }
    
    /**
     * The maximum number of frames between key frames. Key frames are fully
     * encoded frames; the frames between key frames are encoded based, in
     * part, on the content of the key frames. The value is an integer
     * formatted as a string; valid values are between 1 (every frame is a
     * key frame) and 100000, inclusive. A higher value results in higher
     * compression but may also discernibly decrease video quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,6}$<br/>
     *
     * @param keyframesMaxDist The maximum number of frames between key frames. Key frames are fully
     *         encoded frames; the frames between key frames are encoded based, in
     *         part, on the content of the key frames. The value is an integer
     *         formatted as a string; valid values are between 1 (every frame is a
     *         key frame) and 100000, inclusive. A higher value results in higher
     *         compression but may also discernibly decrease video quality.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withKeyframesMaxDist(String keyframesMaxDist) {
        this.keyframesMaxDist = keyframesMaxDist;
        return this;
    }

    /**
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     * are <code>true</code> and <code>false</code>: <ul>
     * <li><code>true</code>: Elastic Transcoder uses the value of
     * <code>KeyframesMaxDist</code> for the distance between key frames (the
     * number of frames in a group of pictures, or GOP).</li>
     * <li><code>false</code>: The distance between key frames can vary.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @return Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     *         are <code>true</code> and <code>false</code>: <ul>
     *         <li><code>true</code>: Elastic Transcoder uses the value of
     *         <code>KeyframesMaxDist</code> for the distance between key frames (the
     *         number of frames in a group of pictures, or GOP).</li>
     *         <li><code>false</code>: The distance between key frames can vary.</li>
     *         </ul>
     */
    public String getFixedGOP() {
        return fixedGOP;
    }
    
    /**
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     * are <code>true</code> and <code>false</code>: <ul>
     * <li><code>true</code>: Elastic Transcoder uses the value of
     * <code>KeyframesMaxDist</code> for the distance between key frames (the
     * number of frames in a group of pictures, or GOP).</li>
     * <li><code>false</code>: The distance between key frames can vary.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param fixedGOP Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     *         are <code>true</code> and <code>false</code>: <ul>
     *         <li><code>true</code>: Elastic Transcoder uses the value of
     *         <code>KeyframesMaxDist</code> for the distance between key frames (the
     *         number of frames in a group of pictures, or GOP).</li>
     *         <li><code>false</code>: The distance between key frames can vary.</li>
     *         </ul>
     */
    public void setFixedGOP(String fixedGOP) {
        this.fixedGOP = fixedGOP;
    }
    
    /**
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     * are <code>true</code> and <code>false</code>: <ul>
     * <li><code>true</code>: Elastic Transcoder uses the value of
     * <code>KeyframesMaxDist</code> for the distance between key frames (the
     * number of frames in a group of pictures, or GOP).</li>
     * <li><code>false</code>: The distance between key frames can vary.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param fixedGOP Whether to use a fixed value for <code>FixedGOP</code>. Valid values
     *         are <code>true</code> and <code>false</code>: <ul>
     *         <li><code>true</code>: Elastic Transcoder uses the value of
     *         <code>KeyframesMaxDist</code> for the distance between key frames (the
     *         number of frames in a group of pictures, or GOP).</li>
     *         <li><code>false</code>: The distance between key frames can vary.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withFixedGOP(String fixedGOP) {
        this.fixedGOP = fixedGOP;
        return this;
    }

    /**
     * The bit rate of the video stream in the output file, in
     * kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     * the input source. If you specify a value other than <code>auto</code>,
     * we recommend that you specify a value less than or equal to the
     * maximum H.264-compliant value listed for your level and profile: <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and
     * main Profile) : maximum video bit rate in kilobits/second (high
     * Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     * - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     * <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     * 17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     * <li>4.1 - 50000 : 62500</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{2,5}$)|(^auto$)<br/>
     *
     * @return The bit rate of the video stream in the output file, in
     *         kilobits/second. Valid values depend on the values of
     *         <code>Level</code> and <code>Profile</code>. If you specify
     *         <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     *         the input source. If you specify a value other than <code>auto</code>,
     *         we recommend that you specify a value less than or equal to the
     *         maximum H.264-compliant value listed for your level and profile: <p>
     *         <i>Level - Maximum video bit rate in kilobits/second (baseline and
     *         main Profile) : maximum video bit rate in kilobits/second (high
     *         Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     *         - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     *         <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     *         17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     *         <li>4.1 - 50000 : 62500</li> </ul>
     */
    public String getBitRate() {
        return bitRate;
    }
    
    /**
     * The bit rate of the video stream in the output file, in
     * kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     * the input source. If you specify a value other than <code>auto</code>,
     * we recommend that you specify a value less than or equal to the
     * maximum H.264-compliant value listed for your level and profile: <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and
     * main Profile) : maximum video bit rate in kilobits/second (high
     * Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     * - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     * <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     * 17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     * <li>4.1 - 50000 : 62500</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{2,5}$)|(^auto$)<br/>
     *
     * @param bitRate The bit rate of the video stream in the output file, in
     *         kilobits/second. Valid values depend on the values of
     *         <code>Level</code> and <code>Profile</code>. If you specify
     *         <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     *         the input source. If you specify a value other than <code>auto</code>,
     *         we recommend that you specify a value less than or equal to the
     *         maximum H.264-compliant value listed for your level and profile: <p>
     *         <i>Level - Maximum video bit rate in kilobits/second (baseline and
     *         main Profile) : maximum video bit rate in kilobits/second (high
     *         Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     *         - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     *         <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     *         17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     *         <li>4.1 - 50000 : 62500</li> </ul>
     */
    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }
    
    /**
     * The bit rate of the video stream in the output file, in
     * kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     * the input source. If you specify a value other than <code>auto</code>,
     * we recommend that you specify a value less than or equal to the
     * maximum H.264-compliant value listed for your level and profile: <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and
     * main Profile) : maximum video bit rate in kilobits/second (high
     * Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     * - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     * <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     * 17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     * <li>4.1 - 50000 : 62500</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{2,5}$)|(^auto$)<br/>
     *
     * @param bitRate The bit rate of the video stream in the output file, in
     *         kilobits/second. Valid values depend on the values of
     *         <code>Level</code> and <code>Profile</code>. If you specify
     *         <code>auto</code>, Elastic Transcoder uses the detected bit rate of
     *         the input source. If you specify a value other than <code>auto</code>,
     *         we recommend that you specify a value less than or equal to the
     *         maximum H.264-compliant value listed for your level and profile: <p>
     *         <i>Level - Maximum video bit rate in kilobits/second (baseline and
     *         main Profile) : maximum video bit rate in kilobits/second (high
     *         Profile)</i> <ul> <li>1 - 64 : 80</li> <li>1b - 128 : 160</li> <li>1.1
     *         - 192 : 240</li> <li>1.2 - 384 : 480</li> <li>1.3 - 768 : 960</li>
     *         <li>2 - 2000 : 2500</li> <li>3 - 10000 : 12500</li> <li>3.1 - 14000 :
     *         17500</li> <li>3.2 - 20000 : 25000</li> <li>4 - 20000 : 25000</li>
     *         <li>4.1 - 50000 : 62500</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }

    /**
     * The frames per second for the video stream in the output file. Valid
     * values include: <p><code>auto</code>, <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     * the input source. If you specify a frame rate, we recommend that you
     * perform the following calculation: <p> <code>Frame rate = maximum
     * recommended decoding speed in luma samples/second / (width in pixels *
     * height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     * <i>height in pixels</i> represent the Resolution of the output
     * video.</li> <li><i>maximum recommended decoding speed in Luma
     * samples/second</i> is less than or equal to the maximum value listed
     * in the following table, based on the value that you specified for
     * Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     * samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     * 380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     * 3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     * 5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     * 55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @return The frames per second for the video stream in the output file. Valid
     *         values include: <p><code>auto</code>, <code>10</code>,
     *         <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     *         the input source. If you specify a frame rate, we recommend that you
     *         perform the following calculation: <p> <code>Frame rate = maximum
     *         recommended decoding speed in luma samples/second / (width in pixels *
     *         height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     *         <i>height in pixels</i> represent the Resolution of the output
     *         video.</li> <li><i>maximum recommended decoding speed in Luma
     *         samples/second</i> is less than or equal to the maximum value listed
     *         in the following table, based on the value that you specified for
     *         Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     *         samples/second for each level is described in the following list
     *         (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     *         380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     *         3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     *         5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     *         55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     */
    public String getFrameRate() {
        return frameRate;
    }
    
    /**
     * The frames per second for the video stream in the output file. Valid
     * values include: <p><code>auto</code>, <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     * the input source. If you specify a frame rate, we recommend that you
     * perform the following calculation: <p> <code>Frame rate = maximum
     * recommended decoding speed in luma samples/second / (width in pixels *
     * height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     * <i>height in pixels</i> represent the Resolution of the output
     * video.</li> <li><i>maximum recommended decoding speed in Luma
     * samples/second</i> is less than or equal to the maximum value listed
     * in the following table, based on the value that you specified for
     * Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     * samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     * 380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     * 3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     * 5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     * 55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @param frameRate The frames per second for the video stream in the output file. Valid
     *         values include: <p><code>auto</code>, <code>10</code>,
     *         <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     *         the input source. If you specify a frame rate, we recommend that you
     *         perform the following calculation: <p> <code>Frame rate = maximum
     *         recommended decoding speed in luma samples/second / (width in pixels *
     *         height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     *         <i>height in pixels</i> represent the Resolution of the output
     *         video.</li> <li><i>maximum recommended decoding speed in Luma
     *         samples/second</i> is less than or equal to the maximum value listed
     *         in the following table, based on the value that you specified for
     *         Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     *         samples/second for each level is described in the following list
     *         (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     *         380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     *         3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     *         5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     *         55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     */
    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }
    
    /**
     * The frames per second for the video stream in the output file. Valid
     * values include: <p><code>auto</code>, <code>10</code>,
     * <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     * the input source. If you specify a frame rate, we recommend that you
     * perform the following calculation: <p> <code>Frame rate = maximum
     * recommended decoding speed in luma samples/second / (width in pixels *
     * height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     * <i>height in pixels</i> represent the Resolution of the output
     * video.</li> <li><i>maximum recommended decoding speed in Luma
     * samples/second</i> is less than or equal to the maximum value listed
     * in the following table, based on the value that you specified for
     * Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     * samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     * 380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     * 3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     * 5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     * 55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @param frameRate The frames per second for the video stream in the output file. Valid
     *         values include: <p><code>auto</code>, <code>10</code>,
     *         <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *         <code>29.97</code>, <code>30</code>, <code>60</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder uses the detected frame rate of
     *         the input source. If you specify a frame rate, we recommend that you
     *         perform the following calculation: <p> <code>Frame rate = maximum
     *         recommended decoding speed in luma samples/second / (width in pixels *
     *         height in pixels)</code> <p>where: <ul> <li><i>width in pixels</i> and
     *         <i>height in pixels</i> represent the Resolution of the output
     *         video.</li> <li><i>maximum recommended decoding speed in Luma
     *         samples/second</i> is less than or equal to the maximum value listed
     *         in the following table, based on the value that you specified for
     *         Level.</li> </ul> <p>The maximum recommended decoding speed in Luma
     *         samples/second for each level is described in the following list
     *         (<i>Level - Decoding speed</i>): <ul> <li>1 - 380160</li> <li>1b -
     *         380160</li> <li>1.1 - 76800</li> <li>1.2 - 1536000</li> <li>1.3 -
     *         3041280</li> <li>2 - 3041280</li> <li>2.1 - 5068800</li> <li>2.2 -
     *         5184000</li> <li>3 - 10368000</li> <li>3.1 - 27648000</li> <li>3.2 -
     *         55296000</li> <li>4 - 62914560</li> <li>4.1 - 62914560</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     * Transcoder uses the frame rate of the input video for the frame rate
     * of the output video. Specify the maximum frame rate that you want
     * Elastic Transcoder to use when the frame rate of the input video is
     * greater than the desired maximum frame rate of the output video. Valid
     * values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     * <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     * <code>60</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @return If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     *         Transcoder uses the frame rate of the input video for the frame rate
     *         of the output video. Specify the maximum frame rate that you want
     *         Elastic Transcoder to use when the frame rate of the input video is
     *         greater than the desired maximum frame rate of the output video. Valid
     *         values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     *         <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     *         <code>60</code>.
     */
    public String getMaxFrameRate() {
        return maxFrameRate;
    }
    
    /**
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     * Transcoder uses the frame rate of the input video for the frame rate
     * of the output video. Specify the maximum frame rate that you want
     * Elastic Transcoder to use when the frame rate of the input video is
     * greater than the desired maximum frame rate of the output video. Valid
     * values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     * <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     * <code>60</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @param maxFrameRate If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     *         Transcoder uses the frame rate of the input video for the frame rate
     *         of the output video. Specify the maximum frame rate that you want
     *         Elastic Transcoder to use when the frame rate of the input video is
     *         greater than the desired maximum frame rate of the output video. Valid
     *         values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     *         <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     *         <code>60</code>.
     */
    public void setMaxFrameRate(String maxFrameRate) {
        this.maxFrameRate = maxFrameRate;
    }
    
    /**
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     * Transcoder uses the frame rate of the input video for the frame rate
     * of the output video. Specify the maximum frame rate that you want
     * Elastic Transcoder to use when the frame rate of the input video is
     * greater than the desired maximum frame rate of the output video. Valid
     * values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     * <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     * <code>60</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)<br/>
     *
     * @param maxFrameRate If you specify <code>auto</code> for <code>FrameRate</code>, Elastic
     *         Transcoder uses the frame rate of the input video for the frame rate
     *         of the output video. Specify the maximum frame rate that you want
     *         Elastic Transcoder to use when the frame rate of the input video is
     *         greater than the desired maximum frame rate of the output video. Valid
     *         values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     *         <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     *         <code>60</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withMaxFrameRate(String maxFrameRate) {
        this.maxFrameRate = maxFrameRate;
        return this;
    }

    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The width and height of the video in the
     * output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     * Transcoder attempts to preserve the width and height of the input
     * file, subject to the following rules.</li> <li><code><i>width</i> x
     * <i>height</i></code>: The width and height of the output video in
     * pixels.</li> </ul> <p>Note the following about specifying the width
     * and height: <ul> <li>The width must be an even integer between 128 and
     * 4096, inclusive.</li> <li>The height must be an even integer between
     * 96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     * less than the resolution of the input file, Elastic Transcoder
     * rescales the output file to the lower resolution.</li> <li>If you
     * specify a resolution that is greater than the resolution of the input
     * file, Elastic Transcoder rescales the output to the higher
     * resolution.</li> <li>We recommend that you specify a resolution for
     * which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height
     * value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     * 101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     * 101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     * 404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     * 2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     *
     * @return <important> <p>To better control resolution and aspect ratio of output
     *         videos, we recommend that you use the values <code>MaxWidth</code>,
     *         <code>MaxHeight</code>, <code>SizingPolicy</code>,
     *         <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     *         two groups of settings are mutually exclusive. Do not use them
     *         together. </important> <p>The width and height of the video in the
     *         output file, in pixels. Valid values are <code>auto</code> and
     *         <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     *         Transcoder attempts to preserve the width and height of the input
     *         file, subject to the following rules.</li> <li><code><i>width</i> x
     *         <i>height</i></code>: The width and height of the output video in
     *         pixels.</li> </ul> <p>Note the following about specifying the width
     *         and height: <ul> <li>The width must be an even integer between 128 and
     *         4096, inclusive.</li> <li>The height must be an even integer between
     *         96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     *         less than the resolution of the input file, Elastic Transcoder
     *         rescales the output file to the lower resolution.</li> <li>If you
     *         specify a resolution that is greater than the resolution of the input
     *         file, Elastic Transcoder rescales the output to the higher
     *         resolution.</li> <li>We recommend that you specify a resolution for
     *         which the product of width and height is less than or equal to the
     *         applicable value in the following list (<i>List - Max width x height
     *         value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     *         101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     *         101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     *         404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     *         2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     */
    public String getResolution() {
        return resolution;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The width and height of the video in the
     * output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     * Transcoder attempts to preserve the width and height of the input
     * file, subject to the following rules.</li> <li><code><i>width</i> x
     * <i>height</i></code>: The width and height of the output video in
     * pixels.</li> </ul> <p>Note the following about specifying the width
     * and height: <ul> <li>The width must be an even integer between 128 and
     * 4096, inclusive.</li> <li>The height must be an even integer between
     * 96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     * less than the resolution of the input file, Elastic Transcoder
     * rescales the output file to the lower resolution.</li> <li>If you
     * specify a resolution that is greater than the resolution of the input
     * file, Elastic Transcoder rescales the output to the higher
     * resolution.</li> <li>We recommend that you specify a resolution for
     * which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height
     * value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     * 101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     * 101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     * 404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     * 2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     *
     * @param resolution <important> <p>To better control resolution and aspect ratio of output
     *         videos, we recommend that you use the values <code>MaxWidth</code>,
     *         <code>MaxHeight</code>, <code>SizingPolicy</code>,
     *         <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     *         two groups of settings are mutually exclusive. Do not use them
     *         together. </important> <p>The width and height of the video in the
     *         output file, in pixels. Valid values are <code>auto</code> and
     *         <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     *         Transcoder attempts to preserve the width and height of the input
     *         file, subject to the following rules.</li> <li><code><i>width</i> x
     *         <i>height</i></code>: The width and height of the output video in
     *         pixels.</li> </ul> <p>Note the following about specifying the width
     *         and height: <ul> <li>The width must be an even integer between 128 and
     *         4096, inclusive.</li> <li>The height must be an even integer between
     *         96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     *         less than the resolution of the input file, Elastic Transcoder
     *         rescales the output file to the lower resolution.</li> <li>If you
     *         specify a resolution that is greater than the resolution of the input
     *         file, Elastic Transcoder rescales the output to the higher
     *         resolution.</li> <li>We recommend that you specify a resolution for
     *         which the product of width and height is less than or equal to the
     *         applicable value in the following list (<i>List - Max width x height
     *         value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     *         101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     *         101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     *         404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     *         2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The width and height of the video in the
     * output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     * Transcoder attempts to preserve the width and height of the input
     * file, subject to the following rules.</li> <li><code><i>width</i> x
     * <i>height</i></code>: The width and height of the output video in
     * pixels.</li> </ul> <p>Note the following about specifying the width
     * and height: <ul> <li>The width must be an even integer between 128 and
     * 4096, inclusive.</li> <li>The height must be an even integer between
     * 96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     * less than the resolution of the input file, Elastic Transcoder
     * rescales the output file to the lower resolution.</li> <li>If you
     * specify a resolution that is greater than the resolution of the input
     * file, Elastic Transcoder rescales the output to the higher
     * resolution.</li> <li>We recommend that you specify a resolution for
     * which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height
     * value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     * 101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     * 101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     * 404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     * 2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{1,5}x\d{1,5}$)<br/>
     *
     * @param resolution <important> <p>To better control resolution and aspect ratio of output
     *         videos, we recommend that you use the values <code>MaxWidth</code>,
     *         <code>MaxHeight</code>, <code>SizingPolicy</code>,
     *         <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     *         two groups of settings are mutually exclusive. Do not use them
     *         together. </important> <p>The width and height of the video in the
     *         output file, in pixels. Valid values are <code>auto</code> and
     *         <i>width</i> x <i>height</i>: <ul> <li><code>auto</code>: Elastic
     *         Transcoder attempts to preserve the width and height of the input
     *         file, subject to the following rules.</li> <li><code><i>width</i> x
     *         <i>height</i></code>: The width and height of the output video in
     *         pixels.</li> </ul> <p>Note the following about specifying the width
     *         and height: <ul> <li>The width must be an even integer between 128 and
     *         4096, inclusive.</li> <li>The height must be an even integer between
     *         96 and 3072, inclusive.</li> <li>If you specify a resolution that is
     *         less than the resolution of the input file, Elastic Transcoder
     *         rescales the output file to the lower resolution.</li> <li>If you
     *         specify a resolution that is greater than the resolution of the input
     *         file, Elastic Transcoder rescales the output to the higher
     *         resolution.</li> <li>We recommend that you specify a resolution for
     *         which the product of width and height is less than or equal to the
     *         applicable value in the following list (<i>List - Max width x height
     *         value</i>):</li> <ul> <li>1 - 25344</li> <li>1b - 25344</li> <li>1.1 -
     *         101376</li> <li>1.2 - 101376</li> <li>1.3 - 101376</li> <li>2 -
     *         101376</li> <li>2.1 - 202752</li> <li>2.2 - 404720</li> <li>3 -
     *         404720</li> <li>3.1 - 921600</li> <li>3.2 - 1310720</li> <li>4 -
     *         2097152</li> <li>4.1 - 2097152</li> </ul> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The display aspect ratio of the video in the
     * output file. Valid values include: <p><code>auto</code>,
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     * <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder tries to preserve the aspect ratio of the input file. <p>If
     * you specify an aspect ratio for the output file that differs from
     * aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     * (black bars on the sides) or letterboxing (black bars on the top and
     * bottom) to maintain the aspect ratio of the active region of the
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @return <important> <p>To better control resolution and aspect ratio of output
     *         videos, we recommend that you use the values <code>MaxWidth</code>,
     *         <code>MaxHeight</code>, <code>SizingPolicy</code>,
     *         <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     *         two groups of settings are mutually exclusive. Do not use them
     *         together. </important> <p>The display aspect ratio of the video in the
     *         output file. Valid values include: <p><code>auto</code>,
     *         <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     *         <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     *         Transcoder tries to preserve the aspect ratio of the input file. <p>If
     *         you specify an aspect ratio for the output file that differs from
     *         aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     *         (black bars on the sides) or letterboxing (black bars on the top and
     *         bottom) to maintain the aspect ratio of the active region of the
     *         video.
     */
    public String getAspectRatio() {
        return aspectRatio;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The display aspect ratio of the video in the
     * output file. Valid values include: <p><code>auto</code>,
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     * <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder tries to preserve the aspect ratio of the input file. <p>If
     * you specify an aspect ratio for the output file that differs from
     * aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     * (black bars on the sides) or letterboxing (black bars on the top and
     * bottom) to maintain the aspect ratio of the active region of the
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio <important> <p>To better control resolution and aspect ratio of output
     *         videos, we recommend that you use the values <code>MaxWidth</code>,
     *         <code>MaxHeight</code>, <code>SizingPolicy</code>,
     *         <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     *         two groups of settings are mutually exclusive. Do not use them
     *         together. </important> <p>The display aspect ratio of the video in the
     *         output file. Valid values include: <p><code>auto</code>,
     *         <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     *         <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     *         Transcoder tries to preserve the aspect ratio of the input file. <p>If
     *         you specify an aspect ratio for the output file that differs from
     *         aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     *         (black bars on the sides) or letterboxing (black bars on the top and
     *         bottom) to maintain the aspect ratio of the active region of the
     *         video.
     */
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
    
    /**
     * <important> <p>To better control resolution and aspect ratio of output
     * videos, we recommend that you use the values <code>MaxWidth</code>,
     * <code>MaxHeight</code>, <code>SizingPolicy</code>,
     * <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     * instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     * two groups of settings are mutually exclusive. Do not use them
     * together. </important> <p>The display aspect ratio of the video in the
     * output file. Valid values include: <p><code>auto</code>,
     * <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     * <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder tries to preserve the aspect ratio of the input file. <p>If
     * you specify an aspect ratio for the output file that differs from
     * aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     * (black bars on the sides) or letterboxing (black bars on the top and
     * bottom) to maintain the aspect ratio of the active region of the
     * video.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio <important> <p>To better control resolution and aspect ratio of output
     *         videos, we recommend that you use the values <code>MaxWidth</code>,
     *         <code>MaxHeight</code>, <code>SizingPolicy</code>,
     *         <code>PaddingPolicy</code>, and <code>DisplayAspectRatio</code>
     *         instead of <code>Resolution</code> and <code>AspectRatio</code>. The
     *         two groups of settings are mutually exclusive. Do not use them
     *         together. </important> <p>The display aspect ratio of the video in the
     *         output file. Valid values include: <p><code>auto</code>,
     *         <code>1:1</code>, <code>4:3</code>, <code>3:2</code>,
     *         <code>16:9</code> <p>If you specify <code>auto</code>, Elastic
     *         Transcoder tries to preserve the aspect ratio of the input file. <p>If
     *         you specify an aspect ratio for the output file that differs from
     *         aspect ratio of the input file, Elastic Transcoder adds pillarboxing
     *         (black bars on the sides) or letterboxing (black bars on the top and
     *         bottom) to maintain the aspect ratio of the active region of the
     *         video.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    /**
     * The maximum width of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 128 and 4096.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @return The maximum width of the output video in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     *         default value. If you specify a numeric value, enter an even integer
     *         between 128 and 4096.
     */
    public String getMaxWidth() {
        return maxWidth;
    }
    
    /**
     * The maximum width of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 128 and 4096.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxWidth The maximum width of the output video in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     *         default value. If you specify a numeric value, enter an even integer
     *         between 128 and 4096.
     */
    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }
    
    /**
     * The maximum width of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 128 and 4096.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxWidth The maximum width of the output video in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 1920 (Full HD) as the
     *         default value. If you specify a numeric value, enter an even integer
     *         between 128 and 4096.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    /**
     * The maximum height of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 96 and 3072.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @return The maximum height of the output video in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     *         default value. If you specify a numeric value, enter an even integer
     *         between 96 and 3072.
     */
    public String getMaxHeight() {
        return maxHeight;
    }
    
    /**
     * The maximum height of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 96 and 3072.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxHeight The maximum height of the output video in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     *         default value. If you specify a numeric value, enter an even integer
     *         between 96 and 3072.
     */
    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }
    
    /**
     * The maximum height of the output video in pixels. If you specify
     * <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     * default value. If you specify a numeric value, enter an even integer
     * between 96 and 3072.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^\d{2,4}$)<br/>
     *
     * @param maxHeight The maximum height of the output video in pixels. If you specify
     *         <code>auto</code>, Elastic Transcoder uses 1080 (Full HD) as the
     *         default value. If you specify a numeric value, enter an even integer
     *         between 96 and 3072.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    /**
     * The value that Elastic Transcoder adds to the metadata in the output
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @return The value that Elastic Transcoder adds to the metadata in the output
     *         file.
     */
    public String getDisplayAspectRatio() {
        return displayAspectRatio;
    }
    
    /**
     * The value that Elastic Transcoder adds to the metadata in the output
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param displayAspectRatio The value that Elastic Transcoder adds to the metadata in the output
     *         file.
     */
    public void setDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
    }
    
    /**
     * The value that Elastic Transcoder adds to the metadata in the output
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param displayAspectRatio The value that Elastic Transcoder adds to the metadata in the output
     *         file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
        return this;
    }

    /**
     * Specify one of the following values to control scaling of the output
     * video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output video and then
     * crops it in the dimension (if any) that exceeds the maximum
     * value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     * output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input video and the output video are different, the
     * output video will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale the output video. If either dimension of the
     * input video exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder
     * does not scale the video up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @return Specify one of the following values to control scaling of the output
     *         video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     *         output video so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     *         other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     *         output video so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     *         the other value. Elastic Transcoder centers the output video and then
     *         crops it in the dimension (if any) that exceeds the maximum
     *         value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     *         output video to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     *         proportions of the input video and the output video are different, the
     *         output video will be distorted.</li> <li><code>Keep</code>: Elastic
     *         Transcoder does not scale the output video. If either dimension of the
     *         input video exceeds the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     *         crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     *         Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not
     *         scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     *         Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     *         below either value. If you specify this option, Elastic Transcoder
     *         does not scale the video up.</li> </ul>
     */
    public String getSizingPolicy() {
        return sizingPolicy;
    }
    
    /**
     * Specify one of the following values to control scaling of the output
     * video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output video and then
     * crops it in the dimension (if any) that exceeds the maximum
     * value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     * output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input video and the output video are different, the
     * output video will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale the output video. If either dimension of the
     * input video exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder
     * does not scale the video up.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @param sizingPolicy Specify one of the following values to control scaling of the output
     *         video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     *         output video so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     *         other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     *         output video so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     *         the other value. Elastic Transcoder centers the output video and then
     *         crops it in the dimension (if any) that exceeds the maximum
     *         value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     *         output video to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     *         proportions of the input video and the output video are different, the
     *         output video will be distorted.</li> <li><code>Keep</code>: Elastic
     *         Transcoder does not scale the output video. If either dimension of the
     *         input video exceeds the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     *         crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     *         Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not
     *         scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     *         Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     *         below either value. If you specify this option, Elastic Transcoder
     *         does not scale the video up.</li> </ul>
     */
    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }
    
    /**
     * Specify one of the following values to control scaling of the output
     * video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     * other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     * output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     * the other value. Elastic Transcoder centers the output video and then
     * crops it in the dimension (if any) that exceeds the maximum
     * value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     * output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     * proportions of the input video and the output video are different, the
     * output video will be distorted.</li> <li><code>Keep</code>: Elastic
     * Transcoder does not scale the output video. If either dimension of the
     * input video exceeds the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     * either value. If you specify this option, Elastic Transcoder does not
     * scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     * Transcoder scales the output video down so that its dimensions match
     * the values that you specified for at least one of
     * <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder
     * does not scale the video up.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)<br/>
     *
     * @param sizingPolicy Specify one of the following values to control scaling of the output
     *         video: <p> <ul> <li><code>Fit</code>: Elastic Transcoder scales the
     *         output video so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the
     *         other value.</li> <li><code>Fill</code>: Elastic Transcoder scales the
     *         output video so it matches the value that you specified in either
     *         <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds
     *         the other value. Elastic Transcoder centers the output video and then
     *         crops it in the dimension (if any) that exceeds the maximum
     *         value.</li> <li><code>Stretch</code>: Elastic Transcoder stretches the
     *         output video to match the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative
     *         proportions of the input video and the output video are different, the
     *         output video will be distorted.</li> <li><code>Keep</code>: Elastic
     *         Transcoder does not scale the output video. If either dimension of the
     *         input video exceeds the values that you specified for
     *         <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     *         crops the output video.</li> <li><code>ShrinkToFit</code>: Elastic
     *         Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding
     *         either value. If you specify this option, Elastic Transcoder does not
     *         scale the video up.</li> <li><code>ShrinkToFill</code>: Elastic
     *         Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of
     *         <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     *         below either value. If you specify this option, Elastic Transcoder
     *         does not scale the video up.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
        return this;
    }

    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of the output video to make the total size of the output
     * video match the values that you specified for <code>MaxWidth</code>
     * and <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @return When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add black bars to the top and bottom and/or left and
     *         right sides of the output video to make the total size of the output
     *         video match the values that you specified for <code>MaxWidth</code>
     *         and <code>MaxHeight</code>.
     */
    public String getPaddingPolicy() {
        return paddingPolicy;
    }
    
    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of the output video to make the total size of the output
     * video match the values that you specified for <code>MaxWidth</code>
     * and <code>MaxHeight</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @param paddingPolicy When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add black bars to the top and bottom and/or left and
     *         right sides of the output video to make the total size of the output
     *         video match the values that you specified for <code>MaxWidth</code>
     *         and <code>MaxHeight</code>.
     */
    public void setPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
    }
    
    /**
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     * Transcoder may add black bars to the top and bottom and/or left and
     * right sides of the output video to make the total size of the output
     * video match the values that you specified for <code>MaxWidth</code>
     * and <code>MaxHeight</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Pad$)|(^NoPad$)<br/>
     *
     * @param paddingPolicy When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic
     *         Transcoder may add black bars to the top and bottom and/or left and
     *         right sides of the output video to make the total size of the output
     *         video match the values that you specified for <code>MaxWidth</code>
     *         and <code>MaxHeight</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
        return this;
    }

    /**
     * Settings for the size, location, and opacity of graphics that you want
     * Elastic Transcoder to overlay over videos that are transcoded using
     * this preset. You can specify settings for up to four watermarks.
     * Watermarks appear in the specified size and location, and with the
     * specified opacity for the duration of the transcoded video.
     * <p>Watermarks can be in .png or .jpg format. If you want to display a
     * watermark that is not rectangular, use the .png format, which supports
     * transparency. <p>When you create a job that uses this preset, you
     * specify the .png or .jpg graphics that you want Elastic Transcoder to
     * include in the transcoded videos. You can specify fewer graphics in
     * the job than you specify watermark settings in the preset, which
     * allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     *
     * @return Settings for the size, location, and opacity of graphics that you want
     *         Elastic Transcoder to overlay over videos that are transcoded using
     *         this preset. You can specify settings for up to four watermarks.
     *         Watermarks appear in the specified size and location, and with the
     *         specified opacity for the duration of the transcoded video.
     *         <p>Watermarks can be in .png or .jpg format. If you want to display a
     *         watermark that is not rectangular, use the .png format, which supports
     *         transparency. <p>When you create a job that uses this preset, you
     *         specify the .png or .jpg graphics that you want Elastic Transcoder to
     *         include in the transcoded videos. You can specify fewer graphics in
     *         the job than you specify watermark settings in the preset, which
     *         allows you to use the same preset for up to four watermarks that have
     *         different dimensions.
     */
    public java.util.List<PresetWatermark> getWatermarks() {
        if (watermarks == null) {
              watermarks = new com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark>();
              watermarks.setAutoConstruct(true);
        }
        return watermarks;
    }
    
    /**
     * Settings for the size, location, and opacity of graphics that you want
     * Elastic Transcoder to overlay over videos that are transcoded using
     * this preset. You can specify settings for up to four watermarks.
     * Watermarks appear in the specified size and location, and with the
     * specified opacity for the duration of the transcoded video.
     * <p>Watermarks can be in .png or .jpg format. If you want to display a
     * watermark that is not rectangular, use the .png format, which supports
     * transparency. <p>When you create a job that uses this preset, you
     * specify the .png or .jpg graphics that you want Elastic Transcoder to
     * include in the transcoded videos. You can specify fewer graphics in
     * the job than you specify watermark settings in the preset, which
     * allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     *
     * @param watermarks Settings for the size, location, and opacity of graphics that you want
     *         Elastic Transcoder to overlay over videos that are transcoded using
     *         this preset. You can specify settings for up to four watermarks.
     *         Watermarks appear in the specified size and location, and with the
     *         specified opacity for the duration of the transcoded video.
     *         <p>Watermarks can be in .png or .jpg format. If you want to display a
     *         watermark that is not rectangular, use the .png format, which supports
     *         transparency. <p>When you create a job that uses this preset, you
     *         specify the .png or .jpg graphics that you want Elastic Transcoder to
     *         include in the transcoded videos. You can specify fewer graphics in
     *         the job than you specify watermark settings in the preset, which
     *         allows you to use the same preset for up to four watermarks that have
     *         different dimensions.
     */
    public void setWatermarks(java.util.Collection<PresetWatermark> watermarks) {
        if (watermarks == null) {
            this.watermarks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark> watermarksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark>(watermarks.size());
        watermarksCopy.addAll(watermarks);
        this.watermarks = watermarksCopy;
    }
    
    /**
     * Settings for the size, location, and opacity of graphics that you want
     * Elastic Transcoder to overlay over videos that are transcoded using
     * this preset. You can specify settings for up to four watermarks.
     * Watermarks appear in the specified size and location, and with the
     * specified opacity for the duration of the transcoded video.
     * <p>Watermarks can be in .png or .jpg format. If you want to display a
     * watermark that is not rectangular, use the .png format, which supports
     * transparency. <p>When you create a job that uses this preset, you
     * specify the .png or .jpg graphics that you want Elastic Transcoder to
     * include in the transcoded videos. You can specify fewer graphics in
     * the job than you specify watermark settings in the preset, which
     * allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param watermarks Settings for the size, location, and opacity of graphics that you want
     *         Elastic Transcoder to overlay over videos that are transcoded using
     *         this preset. You can specify settings for up to four watermarks.
     *         Watermarks appear in the specified size and location, and with the
     *         specified opacity for the duration of the transcoded video.
     *         <p>Watermarks can be in .png or .jpg format. If you want to display a
     *         watermark that is not rectangular, use the .png format, which supports
     *         transparency. <p>When you create a job that uses this preset, you
     *         specify the .png or .jpg graphics that you want Elastic Transcoder to
     *         include in the transcoded videos. You can specify fewer graphics in
     *         the job than you specify watermark settings in the preset, which
     *         allows you to use the same preset for up to four watermarks that have
     *         different dimensions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withWatermarks(PresetWatermark... watermarks) {
        if (getWatermarks() == null) setWatermarks(new java.util.ArrayList<PresetWatermark>(watermarks.length));
        for (PresetWatermark value : watermarks) {
            getWatermarks().add(value);
        }
        return this;
    }
    
    /**
     * Settings for the size, location, and opacity of graphics that you want
     * Elastic Transcoder to overlay over videos that are transcoded using
     * this preset. You can specify settings for up to four watermarks.
     * Watermarks appear in the specified size and location, and with the
     * specified opacity for the duration of the transcoded video.
     * <p>Watermarks can be in .png or .jpg format. If you want to display a
     * watermark that is not rectangular, use the .png format, which supports
     * transparency. <p>When you create a job that uses this preset, you
     * specify the .png or .jpg graphics that you want Elastic Transcoder to
     * include in the transcoded videos. You can specify fewer graphics in
     * the job than you specify watermark settings in the preset, which
     * allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param watermarks Settings for the size, location, and opacity of graphics that you want
     *         Elastic Transcoder to overlay over videos that are transcoded using
     *         this preset. You can specify settings for up to four watermarks.
     *         Watermarks appear in the specified size and location, and with the
     *         specified opacity for the duration of the transcoded video.
     *         <p>Watermarks can be in .png or .jpg format. If you want to display a
     *         watermark that is not rectangular, use the .png format, which supports
     *         transparency. <p>When you create a job that uses this preset, you
     *         specify the .png or .jpg graphics that you want Elastic Transcoder to
     *         include in the transcoded videos. You can specify fewer graphics in
     *         the job than you specify watermark settings in the preset, which
     *         allows you to use the same preset for up to four watermarks that have
     *         different dimensions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VideoParameters withWatermarks(java.util.Collection<PresetWatermark> watermarks) {
        if (watermarks == null) {
            this.watermarks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark> watermarksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark>(watermarks.size());
            watermarksCopy.addAll(watermarks);
            this.watermarks = watermarksCopy;
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
        if (getCodec() != null) sb.append("Codec: " + getCodec() + ",");
        if (getCodecOptions() != null) sb.append("CodecOptions: " + getCodecOptions() + ",");
        if (getKeyframesMaxDist() != null) sb.append("KeyframesMaxDist: " + getKeyframesMaxDist() + ",");
        if (getFixedGOP() != null) sb.append("FixedGOP: " + getFixedGOP() + ",");
        if (getBitRate() != null) sb.append("BitRate: " + getBitRate() + ",");
        if (getFrameRate() != null) sb.append("FrameRate: " + getFrameRate() + ",");
        if (getMaxFrameRate() != null) sb.append("MaxFrameRate: " + getMaxFrameRate() + ",");
        if (getResolution() != null) sb.append("Resolution: " + getResolution() + ",");
        if (getAspectRatio() != null) sb.append("AspectRatio: " + getAspectRatio() + ",");
        if (getMaxWidth() != null) sb.append("MaxWidth: " + getMaxWidth() + ",");
        if (getMaxHeight() != null) sb.append("MaxHeight: " + getMaxHeight() + ",");
        if (getDisplayAspectRatio() != null) sb.append("DisplayAspectRatio: " + getDisplayAspectRatio() + ",");
        if (getSizingPolicy() != null) sb.append("SizingPolicy: " + getSizingPolicy() + ",");
        if (getPaddingPolicy() != null) sb.append("PaddingPolicy: " + getPaddingPolicy() + ",");
        if (getWatermarks() != null) sb.append("Watermarks: " + getWatermarks() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode()); 
        hashCode = prime * hashCode + ((getCodecOptions() == null) ? 0 : getCodecOptions().hashCode()); 
        hashCode = prime * hashCode + ((getKeyframesMaxDist() == null) ? 0 : getKeyframesMaxDist().hashCode()); 
        hashCode = prime * hashCode + ((getFixedGOP() == null) ? 0 : getFixedGOP().hashCode()); 
        hashCode = prime * hashCode + ((getBitRate() == null) ? 0 : getBitRate().hashCode()); 
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode()); 
        hashCode = prime * hashCode + ((getMaxFrameRate() == null) ? 0 : getMaxFrameRate().hashCode()); 
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode()); 
        hashCode = prime * hashCode + ((getAspectRatio() == null) ? 0 : getAspectRatio().hashCode()); 
        hashCode = prime * hashCode + ((getMaxWidth() == null) ? 0 : getMaxWidth().hashCode()); 
        hashCode = prime * hashCode + ((getMaxHeight() == null) ? 0 : getMaxHeight().hashCode()); 
        hashCode = prime * hashCode + ((getDisplayAspectRatio() == null) ? 0 : getDisplayAspectRatio().hashCode()); 
        hashCode = prime * hashCode + ((getSizingPolicy() == null) ? 0 : getSizingPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getPaddingPolicy() == null) ? 0 : getPaddingPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getWatermarks() == null) ? 0 : getWatermarks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VideoParameters == false) return false;
        VideoParameters other = (VideoParameters)obj;
        
        if (other.getCodec() == null ^ this.getCodec() == null) return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false) return false; 
        if (other.getCodecOptions() == null ^ this.getCodecOptions() == null) return false;
        if (other.getCodecOptions() != null && other.getCodecOptions().equals(this.getCodecOptions()) == false) return false; 
        if (other.getKeyframesMaxDist() == null ^ this.getKeyframesMaxDist() == null) return false;
        if (other.getKeyframesMaxDist() != null && other.getKeyframesMaxDist().equals(this.getKeyframesMaxDist()) == false) return false; 
        if (other.getFixedGOP() == null ^ this.getFixedGOP() == null) return false;
        if (other.getFixedGOP() != null && other.getFixedGOP().equals(this.getFixedGOP()) == false) return false; 
        if (other.getBitRate() == null ^ this.getBitRate() == null) return false;
        if (other.getBitRate() != null && other.getBitRate().equals(this.getBitRate()) == false) return false; 
        if (other.getFrameRate() == null ^ this.getFrameRate() == null) return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false) return false; 
        if (other.getMaxFrameRate() == null ^ this.getMaxFrameRate() == null) return false;
        if (other.getMaxFrameRate() != null && other.getMaxFrameRate().equals(this.getMaxFrameRate()) == false) return false; 
        if (other.getResolution() == null ^ this.getResolution() == null) return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false) return false; 
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null) return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false) return false; 
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null) return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false) return false; 
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null) return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false) return false; 
        if (other.getDisplayAspectRatio() == null ^ this.getDisplayAspectRatio() == null) return false;
        if (other.getDisplayAspectRatio() != null && other.getDisplayAspectRatio().equals(this.getDisplayAspectRatio()) == false) return false; 
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null) return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false) return false; 
        if (other.getPaddingPolicy() == null ^ this.getPaddingPolicy() == null) return false;
        if (other.getPaddingPolicy() != null && other.getPaddingPolicy().equals(this.getPaddingPolicy()) == false) return false; 
        if (other.getWatermarks() == null ^ this.getWatermarks() == null) return false;
        if (other.getWatermarks() != null && other.getWatermarks().equals(this.getWatermarks()) == false) return false; 
        return true;
    }
    
}
    