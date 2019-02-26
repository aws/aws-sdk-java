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
 * The <code>VideoParameters</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     * <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     * <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type is
     * <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     * </p>
     */
    private String codec;
    /**
     * <p>
     * <b>Profile (H.264/VP8/VP9 Only)</b>
     * </p>
     * <p>
     * The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following profiles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Level (H.264 Only)</b>
     * </p>
     * <p>
     * The H.264 level that you want to use for the output file. Elastic Transcoder supports the following levels:
     * </p>
     * <p>
     * <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     * <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     * <code>4.1</code>
     * </p>
     * <p>
     * <b>MaxReferenceFrames (H.264 Only)</b>
     * </p>
     * <p>
     * Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to use as
     * a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend that you not use
     * a value greater than the following:
     * </p>
     * <p>
     * <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     * </p>
     * <p>
     * where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or Resolution.
     * <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the <code>Level</code> object. See
     * the list below. (A macroblock is a block of pixels measuring 16x16.)
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 900
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 4752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 18000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20480
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 32768
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 32768
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     * <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to stream a
     * video by reducing the maximum bit rate, but this also reduces the quality of the video.
     * </p>
     * <p>
     * <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the standard
     * segment duration when you're using FMP4 or MPEG-TS for the container type of the output video. Specify an integer
     * greater than 0. If you specify <code>MaxBitRate</code> and omit <code>BufferSize</code>, Elastic Transcoder sets
     * <code>BufferSize</code> to 10 times the value of <code>MaxBitRate</code>.
     * </p>
     * <p>
     * <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The interlace mode for the output video.
     * </p>
     * <p>
     * Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one field on
     * every other line, the other field on the other lines) so that the human eye registers multiple pictures per
     * frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in blurred images and
     * flickering.
     * </p>
     * <p>
     * Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top field
     * first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     * </p>
     * <p>
     * If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the output.
     * If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     * </p>
     * <p>
     * <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms used
     * by the computer to store information about how to render color. <code>Bt.601</code> is the standard for standard
     * definition video, while <code>Bt.709</code> is the standard for high definition video.
     * </p>
     * <p>
     * Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     * <code>Auto</code>.
     * </p>
     * <p>
     * If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced, your
     * frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>50</code>,
     * or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of the resolution changes
     * from the list below, Elastic Transcoder applies the following color space conversions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code> mode in
     * the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     * </p>
     * </note>
     * <p>
     * If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the color space
     * of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your output file, you can
     * check the <code>AppliedColorSpaceConversion</code> parameter included in your job response. If your job does not
     * have an <code>AppliedColorSpaceConversion</code> in its response, no <code>ColorSpaceConversionMode</code> was
     * applied.
     * </p>
     * <p>
     * <b>ChromaSubsampling</b>
     * </p>
     * <p>
     * The sampling pattern for the chroma (color) channels of the output video. Valid values include
     * <code>yuv420p</code> and <code>yuv422p</code>.
     * </p>
     * <p>
     * <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical line,
     * <code>yuv422p</code> samples the color information of every horizontal line and every other vertical line.
     * </p>
     * <p>
     * <b>LoopCount (Gif Only)</b>
     * </p>
     * <p>
     * The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and integers
     * between <code>0</code> and <code>100</code>, inclusive.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> codecOptions;
    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between key
     * frames are encoded based, in part, on the content of the key frames. The value is an integer formatted as a
     * string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value results in
     * higher compression but may also discernibly decrease video quality.
     * </p>
     * <p>
     * For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     * <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different quality
     * levels while the file is being played.
     * </p>
     * <p>
     * For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code> of 90.
     * The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code> of 30, 25, and
     * 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     * </p>
     * <p>
     * Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values for
     * <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     * </p>
     */
    private String keyframesMaxDist;
    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and <code>false</code>
     * :
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance between
     * key frames (the number of frames in a group of pictures, or GOP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The distance between key frames can vary.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     * </p>
     * </important>
     */
    private String fixedGOP;
    /**
     * <p>
     * The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic Transcoder uses the
     * detected bit rate of the input source. If you specify a value other than <code>auto</code>, we recommend that you
     * specify a value less than or equal to the maximum H.264-compliant value listed for your level and profile:
     * </p>
     * <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate in
     * kilobits/second (high Profile)</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 64 : 80
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 128 : 160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 192 : 240
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 384 : 480
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 768 : 960
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2000 : 2500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10000 : 12500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 14000 : 17500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 50000 : 62500
     * </p>
     * </li>
     * </ul>
     */
    private String bitRate;
    /**
     * <p>
     * The frames per second for the video stream in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If you
     * specify a frame rate, we recommend that you perform the following calculation:
     * </p>
     * <p>
     * <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     * </p>
     * <p>
     * where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum value
     * listed in the following table, based on the value that you specified for Level.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum recommended decoding speed in Luma samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 76800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 1536000
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 5068800
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 5184000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10368000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 27648000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 55296000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 62914560
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 62914560
     * </p>
     * </li>
     * </ul>
     */
    private String frameRate;
    /**
     * <p>
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of the input
     * video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic Transcoder to
     * use when the frame rate of the input video is greater than the desired maximum frame rate of the output video.
     * Valid values include: <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>.
     * </p>
     */
    private String maxFrameRate;
    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file, subject to the
     * following rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following about specifying the width and height:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The width must be an even integer between 128 and 4096, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * The height must be an even integer between 96 and 3072, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder rescales the
     * output file to the lower resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder rescales
     * the output to the higher resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you specify a resolution for which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height value</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 202752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 921600
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 1310720
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 2097152
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 2097152
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String resolution;
    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The display aspect ratio of the video in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input file.
     * </p>
     * <p>
     * If you specify an aspect ratio for the output file that differs from aspect ratio of the input file, Elastic
     * Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and bottom) to
     * maintain the aspect ratio of the active region of the video.
     * </p>
     */
    private String aspectRatio;
    /**
     * <p>
     * The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1920
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096.
     * </p>
     */
    private String maxWidth;
    /**
     * <p>
     * The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1080
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072.
     * </p>
     */
    private String maxHeight;
    /**
     * <p>
     * The value that Elastic Transcoder adds to the metadata in the output file.
     * </p>
     */
    private String displayAspectRatio;
    /**
     * <p>
     * Specify one of the following values to control scaling of the output video:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified in
     * either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output video and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input video and the output
     * video are different, the output video will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input video
     * exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * </ul>
     */
    private String sizingPolicy;
    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of the output video to make the total size of the output video match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     */
    private String paddingPolicy;
    /**
     * <p>
     * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos
     * that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in
     * the specified size and location, and with the specified opacity for the duration of the transcoded video.
     * </p>
     * <p>
     * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the
     * .png format, which supports transparency.
     * </p>
     * <p>
     * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     * Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     * watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PresetWatermark> watermarks;

    /**
     * <p>
     * The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     * <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     * <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type is
     * <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     * </p>
     * 
     * @param codec
     *        The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     *        <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     *        <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type is
     *        <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     * <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     * <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type is
     * <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     * </p>
     * 
     * @return The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     *         <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     *         <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type
     *         is <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * <p>
     * The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     * <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     * <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type is
     * <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     * </p>
     * 
     * @param codec
     *        The video codec for the output file. Valid values include <code>gif</code>, <code>H.264</code>,
     *        <code>mpeg2</code>, <code>vp8</code>, and <code>vp9</code>. You can only specify <code>vp8</code> and
     *        <code>vp9</code> when the container type is <code>webm</code>, <code>gif</code> when the container type is
     *        <code>gif</code>, and <code>mpeg2</code> when the container type is <code>mpg</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * <p>
     * <b>Profile (H.264/VP8/VP9 Only)</b>
     * </p>
     * <p>
     * The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following profiles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Level (H.264 Only)</b>
     * </p>
     * <p>
     * The H.264 level that you want to use for the output file. Elastic Transcoder supports the following levels:
     * </p>
     * <p>
     * <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     * <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     * <code>4.1</code>
     * </p>
     * <p>
     * <b>MaxReferenceFrames (H.264 Only)</b>
     * </p>
     * <p>
     * Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to use as
     * a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend that you not use
     * a value greater than the following:
     * </p>
     * <p>
     * <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     * </p>
     * <p>
     * where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or Resolution.
     * <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the <code>Level</code> object. See
     * the list below. (A macroblock is a block of pixels measuring 16x16.)
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 900
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 4752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 18000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20480
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 32768
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 32768
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     * <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to stream a
     * video by reducing the maximum bit rate, but this also reduces the quality of the video.
     * </p>
     * <p>
     * <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the standard
     * segment duration when you're using FMP4 or MPEG-TS for the container type of the output video. Specify an integer
     * greater than 0. If you specify <code>MaxBitRate</code> and omit <code>BufferSize</code>, Elastic Transcoder sets
     * <code>BufferSize</code> to 10 times the value of <code>MaxBitRate</code>.
     * </p>
     * <p>
     * <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The interlace mode for the output video.
     * </p>
     * <p>
     * Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one field on
     * every other line, the other field on the other lines) so that the human eye registers multiple pictures per
     * frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in blurred images and
     * flickering.
     * </p>
     * <p>
     * Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top field
     * first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     * </p>
     * <p>
     * If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the output.
     * If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     * </p>
     * <p>
     * <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms used
     * by the computer to store information about how to render color. <code>Bt.601</code> is the standard for standard
     * definition video, while <code>Bt.709</code> is the standard for high definition video.
     * </p>
     * <p>
     * Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     * <code>Auto</code>.
     * </p>
     * <p>
     * If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced, your
     * frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>50</code>,
     * or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of the resolution changes
     * from the list below, Elastic Transcoder applies the following color space conversions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code> mode in
     * the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     * </p>
     * </note>
     * <p>
     * If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the color space
     * of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your output file, you can
     * check the <code>AppliedColorSpaceConversion</code> parameter included in your job response. If your job does not
     * have an <code>AppliedColorSpaceConversion</code> in its response, no <code>ColorSpaceConversionMode</code> was
     * applied.
     * </p>
     * <p>
     * <b>ChromaSubsampling</b>
     * </p>
     * <p>
     * The sampling pattern for the chroma (color) channels of the output video. Valid values include
     * <code>yuv420p</code> and <code>yuv422p</code>.
     * </p>
     * <p>
     * <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical line,
     * <code>yuv422p</code> samples the color information of every horizontal line and every other vertical line.
     * </p>
     * <p>
     * <b>LoopCount (Gif Only)</b>
     * </p>
     * <p>
     * The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and integers
     * between <code>0</code> and <code>100</code>, inclusive.
     * </p>
     * 
     * @return <b>Profile (H.264/VP8/VP9 Only)</b> </p>
     *         <p>
     *         The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following
     *         profiles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Level (H.264 Only)</b>
     *         </p>
     *         <p>
     *         The H.264 level that you want to use for the output file. Elastic Transcoder supports the following
     *         levels:
     *         </p>
     *         <p>
     *         <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     *         <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     *         <code>4.1</code>
     *         </p>
     *         <p>
     *         <b>MaxReferenceFrames (H.264 Only)</b>
     *         </p>
     *         <p>
     *         Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames
     *         to use as a reference for decoding future frames. Valid values are integers 0 through 16, but we
     *         recommend that you not use a value greater than the following:
     *         </p>
     *         <p>
     *         <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     *         </p>
     *         <p>
     *         where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or
     *         Resolution. <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the
     *         <code>Level</code> object. See the list below. (A macroblock is a block of pixels measuring 16x16.)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1 - 396
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1b - 396
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.1 - 900
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.2 - 2376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.3 - 2376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2 - 2376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.1 - 4752
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.2 - 8100
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3 - 8100
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.1 - 18000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.2 - 20480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4 - 32768
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4.1 - 32768
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     *         </p>
     *         <p>
     *         The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     *         <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to
     *         stream a video by reducing the maximum bit rate, but this also reduces the quality of the video.
     *         </p>
     *         <p>
     *         <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     *         </p>
     *         <p>
     *         The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the
     *         standard segment duration when you're using FMP4 or MPEG-TS for the container type of the output video.
     *         Specify an integer greater than 0. If you specify <code>MaxBitRate</code> and omit
     *         <code>BufferSize</code>, Elastic Transcoder sets <code>BufferSize</code> to 10 times the value of
     *         <code>MaxBitRate</code>.
     *         </p>
     *         <p>
     *         <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     *         </p>
     *         <p>
     *         The interlace mode for the output video.
     *         </p>
     *         <p>
     *         Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one
     *         field on every other line, the other field on the other lines) so that the human eye registers multiple
     *         pictures per frame. Interlacing reduces the bandwidth required for transmitting a video, but can result
     *         in blurred images and flickering.
     *         </p>
     *         <p>
     *         Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top
     *         field first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     *         </p>
     *         <p>
     *         If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the
     *         output. If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     *         </p>
     *         <p>
     *         <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     *         </p>
     *         <p>
     *         The color space conversion Elastic Transcoder applies to the output video. Color spaces are the
     *         algorithms used by the computer to store information about how to render color. <code>Bt.601</code> is
     *         the standard for standard definition video, while <code>Bt.709</code> is the standard for high definition
     *         video.
     *         </p>
     *         <p>
     *         Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     *         <code>Auto</code>.
     *         </p>
     *         <p>
     *         If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced,
     *         your frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     *         <code>50</code>, or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of
     *         the resolution changes from the list below, Elastic Transcoder applies the following color space
     *         conversions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code>
     *         mode in the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     *         </p>
     *         </note>
     *         <p>
     *         If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the
     *         color space of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your
     *         output file, you can check the <code>AppliedColorSpaceConversion</code> parameter included in your job
     *         response. If your job does not have an <code>AppliedColorSpaceConversion</code> in its response, no
     *         <code>ColorSpaceConversionMode</code> was applied.
     *         </p>
     *         <p>
     *         <b>ChromaSubsampling</b>
     *         </p>
     *         <p>
     *         The sampling pattern for the chroma (color) channels of the output video. Valid values include
     *         <code>yuv420p</code> and <code>yuv422p</code>.
     *         </p>
     *         <p>
     *         <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical
     *         line, <code>yuv422p</code> samples the color information of every horizontal line and every other
     *         vertical line.
     *         </p>
     *         <p>
     *         <b>LoopCount (Gif Only)</b>
     *         </p>
     *         <p>
     *         The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and
     *         integers between <code>0</code> and <code>100</code>, inclusive.
     */

    public java.util.Map<String, String> getCodecOptions() {
        if (codecOptions == null) {
            codecOptions = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return codecOptions;
    }

    /**
     * <p>
     * <b>Profile (H.264/VP8/VP9 Only)</b>
     * </p>
     * <p>
     * The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following profiles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Level (H.264 Only)</b>
     * </p>
     * <p>
     * The H.264 level that you want to use for the output file. Elastic Transcoder supports the following levels:
     * </p>
     * <p>
     * <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     * <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     * <code>4.1</code>
     * </p>
     * <p>
     * <b>MaxReferenceFrames (H.264 Only)</b>
     * </p>
     * <p>
     * Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to use as
     * a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend that you not use
     * a value greater than the following:
     * </p>
     * <p>
     * <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     * </p>
     * <p>
     * where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or Resolution.
     * <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the <code>Level</code> object. See
     * the list below. (A macroblock is a block of pixels measuring 16x16.)
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 900
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 4752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 18000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20480
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 32768
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 32768
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     * <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to stream a
     * video by reducing the maximum bit rate, but this also reduces the quality of the video.
     * </p>
     * <p>
     * <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the standard
     * segment duration when you're using FMP4 or MPEG-TS for the container type of the output video. Specify an integer
     * greater than 0. If you specify <code>MaxBitRate</code> and omit <code>BufferSize</code>, Elastic Transcoder sets
     * <code>BufferSize</code> to 10 times the value of <code>MaxBitRate</code>.
     * </p>
     * <p>
     * <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The interlace mode for the output video.
     * </p>
     * <p>
     * Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one field on
     * every other line, the other field on the other lines) so that the human eye registers multiple pictures per
     * frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in blurred images and
     * flickering.
     * </p>
     * <p>
     * Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top field
     * first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     * </p>
     * <p>
     * If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the output.
     * If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     * </p>
     * <p>
     * <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms used
     * by the computer to store information about how to render color. <code>Bt.601</code> is the standard for standard
     * definition video, while <code>Bt.709</code> is the standard for high definition video.
     * </p>
     * <p>
     * Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     * <code>Auto</code>.
     * </p>
     * <p>
     * If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced, your
     * frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>50</code>,
     * or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of the resolution changes
     * from the list below, Elastic Transcoder applies the following color space conversions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code> mode in
     * the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     * </p>
     * </note>
     * <p>
     * If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the color space
     * of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your output file, you can
     * check the <code>AppliedColorSpaceConversion</code> parameter included in your job response. If your job does not
     * have an <code>AppliedColorSpaceConversion</code> in its response, no <code>ColorSpaceConversionMode</code> was
     * applied.
     * </p>
     * <p>
     * <b>ChromaSubsampling</b>
     * </p>
     * <p>
     * The sampling pattern for the chroma (color) channels of the output video. Valid values include
     * <code>yuv420p</code> and <code>yuv422p</code>.
     * </p>
     * <p>
     * <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical line,
     * <code>yuv422p</code> samples the color information of every horizontal line and every other vertical line.
     * </p>
     * <p>
     * <b>LoopCount (Gif Only)</b>
     * </p>
     * <p>
     * The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and integers
     * between <code>0</code> and <code>100</code>, inclusive.
     * </p>
     * 
     * @param codecOptions
     *        <b>Profile (H.264/VP8/VP9 Only)</b> </p>
     *        <p>
     *        The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following
     *        profiles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Level (H.264 Only)</b>
     *        </p>
     *        <p>
     *        The H.264 level that you want to use for the output file. Elastic Transcoder supports the following
     *        levels:
     *        </p>
     *        <p>
     *        <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     *        <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     *        <code>4.1</code>
     *        </p>
     *        <p>
     *        <b>MaxReferenceFrames (H.264 Only)</b>
     *        </p>
     *        <p>
     *        Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to
     *        use as a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend
     *        that you not use a value greater than the following:
     *        </p>
     *        <p>
     *        <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     *        </p>
     *        <p>
     *        where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or
     *        Resolution. <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the
     *        <code>Level</code> object. See the list below. (A macroblock is a block of pixels measuring 16x16.)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 396
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 396
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 900
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 2376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 2376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 2376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.1 - 4752
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.2 - 8100
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 8100
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 18000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 20480
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 32768
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 32768
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     *        </p>
     *        <p>
     *        The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     *        <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to
     *        stream a video by reducing the maximum bit rate, but this also reduces the quality of the video.
     *        </p>
     *        <p>
     *        <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     *        </p>
     *        <p>
     *        The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the
     *        standard segment duration when you're using FMP4 or MPEG-TS for the container type of the output video.
     *        Specify an integer greater than 0. If you specify <code>MaxBitRate</code> and omit <code>BufferSize</code>
     *        , Elastic Transcoder sets <code>BufferSize</code> to 10 times the value of <code>MaxBitRate</code>.
     *        </p>
     *        <p>
     *        <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     *        </p>
     *        <p>
     *        The interlace mode for the output video.
     *        </p>
     *        <p>
     *        Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one
     *        field on every other line, the other field on the other lines) so that the human eye registers multiple
     *        pictures per frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in
     *        blurred images and flickering.
     *        </p>
     *        <p>
     *        Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top
     *        field first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     *        </p>
     *        <p>
     *        If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the
     *        output. If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     *        </p>
     *        <p>
     *        <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     *        </p>
     *        <p>
     *        The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms
     *        used by the computer to store information about how to render color. <code>Bt.601</code> is the standard
     *        for standard definition video, while <code>Bt.709</code> is the standard for high definition video.
     *        </p>
     *        <p>
     *        Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     *        <code>Auto</code>.
     *        </p>
     *        <p>
     *        If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced,
     *        your frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     *        <code>50</code>, or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of
     *        the resolution changes from the list below, Elastic Transcoder applies the following color space
     *        conversions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code>
     *        mode in the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     *        </p>
     *        </note>
     *        <p>
     *        If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the
     *        color space of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your
     *        output file, you can check the <code>AppliedColorSpaceConversion</code> parameter included in your job
     *        response. If your job does not have an <code>AppliedColorSpaceConversion</code> in its response, no
     *        <code>ColorSpaceConversionMode</code> was applied.
     *        </p>
     *        <p>
     *        <b>ChromaSubsampling</b>
     *        </p>
     *        <p>
     *        The sampling pattern for the chroma (color) channels of the output video. Valid values include
     *        <code>yuv420p</code> and <code>yuv422p</code>.
     *        </p>
     *        <p>
     *        <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical
     *        line, <code>yuv422p</code> samples the color information of every horizontal line and every other vertical
     *        line.
     *        </p>
     *        <p>
     *        <b>LoopCount (Gif Only)</b>
     *        </p>
     *        <p>
     *        The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and
     *        integers between <code>0</code> and <code>100</code>, inclusive.
     */

    public void setCodecOptions(java.util.Map<String, String> codecOptions) {
        this.codecOptions = codecOptions == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(codecOptions);
    }

    /**
     * <p>
     * <b>Profile (H.264/VP8/VP9 Only)</b>
     * </p>
     * <p>
     * The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following profiles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Level (H.264 Only)</b>
     * </p>
     * <p>
     * The H.264 level that you want to use for the output file. Elastic Transcoder supports the following levels:
     * </p>
     * <p>
     * <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     * <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     * <code>4.1</code>
     * </p>
     * <p>
     * <b>MaxReferenceFrames (H.264 Only)</b>
     * </p>
     * <p>
     * Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to use as
     * a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend that you not use
     * a value greater than the following:
     * </p>
     * <p>
     * <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     * </p>
     * <p>
     * where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or Resolution.
     * <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the <code>Level</code> object. See
     * the list below. (A macroblock is a block of pixels measuring 16x16.)
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 396
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 900
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 4752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 8100
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 18000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20480
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 32768
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 32768
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     * <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to stream a
     * video by reducing the maximum bit rate, but this also reduces the quality of the video.
     * </p>
     * <p>
     * <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     * </p>
     * <p>
     * The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the standard
     * segment duration when you're using FMP4 or MPEG-TS for the container type of the output video. Specify an integer
     * greater than 0. If you specify <code>MaxBitRate</code> and omit <code>BufferSize</code>, Elastic Transcoder sets
     * <code>BufferSize</code> to 10 times the value of <code>MaxBitRate</code>.
     * </p>
     * <p>
     * <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The interlace mode for the output video.
     * </p>
     * <p>
     * Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one field on
     * every other line, the other field on the other lines) so that the human eye registers multiple pictures per
     * frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in blurred images and
     * flickering.
     * </p>
     * <p>
     * Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top field
     * first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     * </p>
     * <p>
     * If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the output.
     * If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     * </p>
     * <p>
     * <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     * </p>
     * <p>
     * The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms used
     * by the computer to store information about how to render color. <code>Bt.601</code> is the standard for standard
     * definition video, while <code>Bt.709</code> is the standard for high definition video.
     * </p>
     * <p>
     * Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     * <code>Auto</code>.
     * </p>
     * <p>
     * If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced, your
     * frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>50</code>,
     * or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of the resolution changes
     * from the list below, Elastic Transcoder applies the following color space conversions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code> mode in
     * the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     * </p>
     * </note>
     * <p>
     * If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the color space
     * of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your output file, you can
     * check the <code>AppliedColorSpaceConversion</code> parameter included in your job response. If your job does not
     * have an <code>AppliedColorSpaceConversion</code> in its response, no <code>ColorSpaceConversionMode</code> was
     * applied.
     * </p>
     * <p>
     * <b>ChromaSubsampling</b>
     * </p>
     * <p>
     * The sampling pattern for the chroma (color) channels of the output video. Valid values include
     * <code>yuv420p</code> and <code>yuv422p</code>.
     * </p>
     * <p>
     * <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical line,
     * <code>yuv422p</code> samples the color information of every horizontal line and every other vertical line.
     * </p>
     * <p>
     * <b>LoopCount (Gif Only)</b>
     * </p>
     * <p>
     * The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and integers
     * between <code>0</code> and <code>100</code>, inclusive.
     * </p>
     * 
     * @param codecOptions
     *        <b>Profile (H.264/VP8/VP9 Only)</b> </p>
     *        <p>
     *        The H.264 profile that you want to use for the output file. Elastic Transcoder supports the following
     *        profiles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>baseline</code>: The profile most commonly used for videoconferencing and for mobile applications.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>main</code>: The profile used for standard-definition digital TV broadcasts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>high</code>: The profile used for high-definition digital TV broadcasts and for Blu-ray discs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Level (H.264 Only)</b>
     *        </p>
     *        <p>
     *        The H.264 level that you want to use for the output file. Elastic Transcoder supports the following
     *        levels:
     *        </p>
     *        <p>
     *        <code>1</code>, <code>1b</code>, <code>1.1</code>, <code>1.2</code>, <code>1.3</code>, <code>2</code>,
     *        <code>2.1</code>, <code>2.2</code>, <code>3</code>, <code>3.1</code>, <code>3.2</code>, <code>4</code>,
     *        <code>4.1</code>
     *        </p>
     *        <p>
     *        <b>MaxReferenceFrames (H.264 Only)</b>
     *        </p>
     *        <p>
     *        Applicable only when the value of Video:Codec is H.264. The maximum number of previously decoded frames to
     *        use as a reference for decoding future frames. Valid values are integers 0 through 16, but we recommend
     *        that you not use a value greater than the following:
     *        </p>
     *        <p>
     *        <code>Min(Floor(Maximum decoded picture buffer in macroblocks * 256 / (Width in pixels * Height in pixels)), 16)</code>
     *        </p>
     *        <p>
     *        where <i>Width in pixels</i> and <i>Height in pixels</i> represent either MaxWidth and MaxHeight, or
     *        Resolution. <i>Maximum decoded picture buffer in macroblocks</i> depends on the value of the
     *        <code>Level</code> object. See the list below. (A macroblock is a block of pixels measuring 16x16.)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 396
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 396
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 900
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 2376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 2376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 2376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.1 - 4752
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.2 - 8100
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 8100
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 18000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 20480
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 32768
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 32768
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MaxBitRate (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     *        </p>
     *        <p>
     *        The maximum number of bits per second in a video buffer; the size of the buffer is specified by
     *        <code>BufferSize</code>. Specify a value between 16 and 62,500. You can reduce the bandwidth required to
     *        stream a video by reducing the maximum bit rate, but this also reduces the quality of the video.
     *        </p>
     *        <p>
     *        <b>BufferSize (Optional, H.264/MPEG2/VP8/VP9 only)</b>
     *        </p>
     *        <p>
     *        The maximum number of bits in any x seconds of the output video. This window is commonly 10 seconds, the
     *        standard segment duration when you're using FMP4 or MPEG-TS for the container type of the output video.
     *        Specify an integer greater than 0. If you specify <code>MaxBitRate</code> and omit <code>BufferSize</code>
     *        , Elastic Transcoder sets <code>BufferSize</code> to 10 times the value of <code>MaxBitRate</code>.
     *        </p>
     *        <p>
     *        <b>InterlacedMode (Optional, H.264/MPEG2 Only)</b>
     *        </p>
     *        <p>
     *        The interlace mode for the output video.
     *        </p>
     *        <p>
     *        Interlaced video is used to double the perceived frame rate for a video by interlacing two fields (one
     *        field on every other line, the other field on the other lines) so that the human eye registers multiple
     *        pictures per frame. Interlacing reduces the bandwidth required for transmitting a video, but can result in
     *        blurred images and flickering.
     *        </p>
     *        <p>
     *        Valid values include <code>Progressive</code> (no interlacing, top to bottom), <code>TopFirst</code> (top
     *        field first), <code>BottomFirst</code> (bottom field first), and <code>Auto</code>.
     *        </p>
     *        <p>
     *        If <code>InterlaceMode</code> is not specified, Elastic Transcoder uses <code>Progressive</code> for the
     *        output. If <code>Auto</code> is specified, Elastic Transcoder interlaces the output.
     *        </p>
     *        <p>
     *        <b>ColorSpaceConversionMode (Optional, H.264/MPEG2 Only)</b>
     *        </p>
     *        <p>
     *        The color space conversion Elastic Transcoder applies to the output video. Color spaces are the algorithms
     *        used by the computer to store information about how to render color. <code>Bt.601</code> is the standard
     *        for standard definition video, while <code>Bt.709</code> is the standard for high definition video.
     *        </p>
     *        <p>
     *        Valid values include <code>None</code>, <code>Bt709toBt601</code>, <code>Bt601toBt709</code>, and
     *        <code>Auto</code>.
     *        </p>
     *        <p>
     *        If you chose <code>Auto</code> for <code>ColorSpaceConversionMode</code> and your output is interlaced,
     *        your frame rate is one of <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>,
     *        <code>50</code>, or <code>60</code>, your <code>SegmentDuration</code> is null, and you are using one of
     *        the resolution changes from the list below, Elastic Transcoder applies the following color space
     *        conversions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Standard to HD, 720x480 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Standard to HD, 720x576 to 1920x1080</i> - Elastic Transcoder applies <code>Bt601ToBt709</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>HD to Standard, 1920x1080 to 720x480</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>HD to Standard, 1920x1080 to 720x576</i> - Elastic Transcoder applies <code>Bt709ToBt601</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Elastic Transcoder may change the behavior of the <code>ColorspaceConversionMode</code> <code>Auto</code>
     *        mode in the future. All outputs in a playlist must use the same <code>ColorSpaceConversionMode</code>.
     *        </p>
     *        </note>
     *        <p>
     *        If you do not specify a <code>ColorSpaceConversionMode</code>, Elastic Transcoder does not change the
     *        color space of a file. If you are unsure what <code>ColorSpaceConversionMode</code> was applied to your
     *        output file, you can check the <code>AppliedColorSpaceConversion</code> parameter included in your job
     *        response. If your job does not have an <code>AppliedColorSpaceConversion</code> in its response, no
     *        <code>ColorSpaceConversionMode</code> was applied.
     *        </p>
     *        <p>
     *        <b>ChromaSubsampling</b>
     *        </p>
     *        <p>
     *        The sampling pattern for the chroma (color) channels of the output video. Valid values include
     *        <code>yuv420p</code> and <code>yuv422p</code>.
     *        </p>
     *        <p>
     *        <code>yuv420p</code> samples the chroma information of every other horizontal and every other vertical
     *        line, <code>yuv422p</code> samples the color information of every horizontal line and every other vertical
     *        line.
     *        </p>
     *        <p>
     *        <b>LoopCount (Gif Only)</b>
     *        </p>
     *        <p>
     *        The number of times you want the output gif to loop. Valid values include <code>Infinite</code> and
     *        integers between <code>0</code> and <code>100</code>, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withCodecOptions(java.util.Map<String, String> codecOptions) {
        setCodecOptions(codecOptions);
        return this;
    }

    public VideoParameters addCodecOptionsEntry(String key, String value) {
        if (null == this.codecOptions) {
            this.codecOptions = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.codecOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.codecOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CodecOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters clearCodecOptionsEntries() {
        this.codecOptions = null;
        return this;
    }

    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between key
     * frames are encoded based, in part, on the content of the key frames. The value is an integer formatted as a
     * string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value results in
     * higher compression but may also discernibly decrease video quality.
     * </p>
     * <p>
     * For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     * <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different quality
     * levels while the file is being played.
     * </p>
     * <p>
     * For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code> of 90.
     * The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code> of 30, 25, and
     * 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     * </p>
     * <p>
     * Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values for
     * <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     * </p>
     * 
     * @param keyframesMaxDist
     *        Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     *        <code>VP8</code>.</p>
     *        <p>
     *        The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between
     *        key frames are encoded based, in part, on the content of the key frames. The value is an integer formatted
     *        as a string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value
     *        results in higher compression but may also discernibly decrease video quality.
     *        </p>
     *        <p>
     *        For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     *        <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different
     *        quality levels while the file is being played.
     *        </p>
     *        <p>
     *        For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code> of
     *        90. The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code> of
     *        30, 25, and 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     *        </p>
     *        <p>
     *        Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values for
     *        <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     */

    public void setKeyframesMaxDist(String keyframesMaxDist) {
        this.keyframesMaxDist = keyframesMaxDist;
    }

    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between key
     * frames are encoded based, in part, on the content of the key frames. The value is an integer formatted as a
     * string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value results in
     * higher compression but may also discernibly decrease video quality.
     * </p>
     * <p>
     * For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     * <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different quality
     * levels while the file is being played.
     * </p>
     * <p>
     * For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code> of 90.
     * The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code> of 30, 25, and
     * 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     * </p>
     * <p>
     * Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values for
     * <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     * </p>
     * 
     * @return Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     *         <code>VP8</code>.</p>
     *         <p>
     *         The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between
     *         key frames are encoded based, in part, on the content of the key frames. The value is an integer
     *         formatted as a string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A
     *         higher value results in higher compression but may also discernibly decrease video quality.
     *         </p>
     *         <p>
     *         For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     *         <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different
     *         quality levels while the file is being played.
     *         </p>
     *         <p>
     *         For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code>
     *         of 90. The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code>
     *         of 30, 25, and 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     *         </p>
     *         <p>
     *         Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values
     *         for <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     */

    public String getKeyframesMaxDist() {
        return this.keyframesMaxDist;
    }

    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between key
     * frames are encoded based, in part, on the content of the key frames. The value is an integer formatted as a
     * string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value results in
     * higher compression but may also discernibly decrease video quality.
     * </p>
     * <p>
     * For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     * <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different quality
     * levels while the file is being played.
     * </p>
     * <p>
     * For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code> of 90.
     * The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code> of 30, 25, and
     * 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     * </p>
     * <p>
     * Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values for
     * <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     * </p>
     * 
     * @param keyframesMaxDist
     *        Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     *        <code>VP8</code>.</p>
     *        <p>
     *        The maximum number of frames between key frames. Key frames are fully encoded frames; the frames between
     *        key frames are encoded based, in part, on the content of the key frames. The value is an integer formatted
     *        as a string; valid values are between 1 (every frame is a key frame) and 100000, inclusive. A higher value
     *        results in higher compression but may also discernibly decrease video quality.
     *        </p>
     *        <p>
     *        For <code>Smooth</code> outputs, the <code>FrameRate</code> must have a constant ratio to the
     *        <code>KeyframesMaxDist</code>. This allows <code>Smooth</code> playlists to switch between different
     *        quality levels while the file is being played.
     *        </p>
     *        <p>
     *        For example, an input file can have a <code>FrameRate</code> of 30 with a <code>KeyframesMaxDist</code> of
     *        90. The output file then needs to have a ratio of 1:3. Valid outputs would have <code>FrameRate</code> of
     *        30, 25, and 10, and <code>KeyframesMaxDist</code> of 90, 75, and 30, respectively.
     *        </p>
     *        <p>
     *        Alternately, this can be achieved by setting <code>FrameRate</code> to auto and having the same values for
     *        <code>MaxFrameRate</code> and <code>KeyframesMaxDist</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withKeyframesMaxDist(String keyframesMaxDist) {
        setKeyframesMaxDist(keyframesMaxDist);
        return this;
    }

    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and <code>false</code>
     * :
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance between
     * key frames (the number of frames in a group of pictures, or GOP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The distance between key frames can vary.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     * </p>
     * </important>
     * 
     * @param fixedGOP
     *        Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     *        <code>VP8</code>.</p>
     *        <p>
     *        Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and
     *        <code>false</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance
     *        between key frames (the number of frames in a group of pictures, or GOP).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: The distance between key frames can vary.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     *        </p>
     */

    public void setFixedGOP(String fixedGOP) {
        this.fixedGOP = fixedGOP;
    }

    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and <code>false</code>
     * :
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance between
     * key frames (the number of frames in a group of pictures, or GOP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The distance between key frames can vary.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     * </p>
     * </important>
     * 
     * @return Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     *         <code>VP8</code>.</p>
     *         <p>
     *         Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and
     *         <code>false</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance
     *         between key frames (the number of frames in a group of pictures, or GOP).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: The distance between key frames can vary.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     *         </p>
     */

    public String getFixedGOP() {
        return this.fixedGOP;
    }

    /**
     * <p>
     * Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     * <code>VP8</code>.
     * </p>
     * <p>
     * Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and <code>false</code>
     * :
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance between
     * key frames (the number of frames in a group of pictures, or GOP).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: The distance between key frames can vary.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     * </p>
     * </important>
     * 
     * @param fixedGOP
     *        Applicable only when the value of Video:Codec is one of <code>H.264</code>, <code>MPEG2</code>, or
     *        <code>VP8</code>.</p>
     *        <p>
     *        Whether to use a fixed value for <code>FixedGOP</code>. Valid values are <code>true</code> and
     *        <code>false</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: Elastic Transcoder uses the value of <code>KeyframesMaxDist</code> for the distance
     *        between key frames (the number of frames in a group of pictures, or GOP).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: The distance between key frames can vary.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        <code>FixedGOP</code> must be set to <code>true</code> for <code>fmp4</code> containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withFixedGOP(String fixedGOP) {
        setFixedGOP(fixedGOP);
        return this;
    }

    /**
     * <p>
     * The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic Transcoder uses the
     * detected bit rate of the input source. If you specify a value other than <code>auto</code>, we recommend that you
     * specify a value less than or equal to the maximum H.264-compliant value listed for your level and profile:
     * </p>
     * <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate in
     * kilobits/second (high Profile)</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 64 : 80
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 128 : 160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 192 : 240
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 384 : 480
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 768 : 960
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2000 : 2500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10000 : 12500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 14000 : 17500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 50000 : 62500
     * </p>
     * </li>
     * </ul>
     * 
     * @param bitRate
     *        The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values
     *        of <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic Transcoder uses
     *        the detected bit rate of the input source. If you specify a value other than <code>auto</code>, we
     *        recommend that you specify a value less than or equal to the maximum H.264-compliant value listed for your
     *        level and profile:</p>
     *        <p>
     *        <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate
     *        in kilobits/second (high Profile)</i>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 64 : 80
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 128 : 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 192 : 240
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 384 : 480
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 768 : 960
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 2000 : 2500
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 10000 : 12500
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 14000 : 17500
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 20000 : 25000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 20000 : 25000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 50000 : 62500
     *        </p>
     *        </li>
     */

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    /**
     * <p>
     * The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic Transcoder uses the
     * detected bit rate of the input source. If you specify a value other than <code>auto</code>, we recommend that you
     * specify a value less than or equal to the maximum H.264-compliant value listed for your level and profile:
     * </p>
     * <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate in
     * kilobits/second (high Profile)</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 64 : 80
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 128 : 160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 192 : 240
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 384 : 480
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 768 : 960
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2000 : 2500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10000 : 12500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 14000 : 17500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 50000 : 62500
     * </p>
     * </li>
     * </ul>
     * 
     * @return The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the
     *         values of <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic
     *         Transcoder uses the detected bit rate of the input source. If you specify a value other than
     *         <code>auto</code>, we recommend that you specify a value less than or equal to the maximum
     *         H.264-compliant value listed for your level and profile:</p>
     *         <p>
     *         <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate
     *         in kilobits/second (high Profile)</i>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1 - 64 : 80
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1b - 128 : 160
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.1 - 192 : 240
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.2 - 384 : 480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.3 - 768 : 960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2 - 2000 : 2500
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3 - 10000 : 12500
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.1 - 14000 : 17500
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.2 - 20000 : 25000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4 - 20000 : 25000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4.1 - 50000 : 62500
     *         </p>
     *         </li>
     */

    public String getBitRate() {
        return this.bitRate;
    }

    /**
     * <p>
     * The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values of
     * <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic Transcoder uses the
     * detected bit rate of the input source. If you specify a value other than <code>auto</code>, we recommend that you
     * specify a value less than or equal to the maximum H.264-compliant value listed for your level and profile:
     * </p>
     * <p>
     * <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate in
     * kilobits/second (high Profile)</i>
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 64 : 80
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 128 : 160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 192 : 240
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 384 : 480
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 768 : 960
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 2000 : 2500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10000 : 12500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 14000 : 17500
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 20000 : 25000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 50000 : 62500
     * </p>
     * </li>
     * </ul>
     * 
     * @param bitRate
     *        The bit rate of the video stream in the output file, in kilobits/second. Valid values depend on the values
     *        of <code>Level</code> and <code>Profile</code>. If you specify <code>auto</code>, Elastic Transcoder uses
     *        the detected bit rate of the input source. If you specify a value other than <code>auto</code>, we
     *        recommend that you specify a value less than or equal to the maximum H.264-compliant value listed for your
     *        level and profile:</p>
     *        <p>
     *        <i>Level - Maximum video bit rate in kilobits/second (baseline and main Profile) : maximum video bit rate
     *        in kilobits/second (high Profile)</i>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 64 : 80
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 128 : 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 192 : 240
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 384 : 480
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 768 : 960
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 2000 : 2500
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 10000 : 12500
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 14000 : 17500
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 20000 : 25000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 20000 : 25000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 50000 : 62500
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withBitRate(String bitRate) {
        setBitRate(bitRate);
        return this;
    }

    /**
     * <p>
     * The frames per second for the video stream in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If you
     * specify a frame rate, we recommend that you perform the following calculation:
     * </p>
     * <p>
     * <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     * </p>
     * <p>
     * where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum value
     * listed in the following table, based on the value that you specified for Level.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum recommended decoding speed in Luma samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 76800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 1536000
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 5068800
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 5184000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10368000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 27648000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 55296000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 62914560
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 62914560
     * </p>
     * </li>
     * </ul>
     * 
     * @param frameRate
     *        The frames per second for the video stream in the output file. Valid values include:</p>
     *        <p>
     *        <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *        <code>29.97</code>, <code>30</code>, <code>60</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If
     *        you specify a frame rate, we recommend that you perform the following calculation:
     *        </p>
     *        <p>
     *        <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     *        </p>
     *        <p>
     *        where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum
     *        value listed in the following table, based on the value that you specified for Level.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The maximum recommended decoding speed in Luma samples/second for each level is described in the following
     *        list (<i>Level - Decoding speed</i>):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 380160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 380160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 76800
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 1536000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 3041280
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 3041280
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.1 - 5068800
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.2 - 5184000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 10368000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 27648000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 55296000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 62914560
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 62914560
     *        </p>
     *        </li>
     */

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * <p>
     * The frames per second for the video stream in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If you
     * specify a frame rate, we recommend that you perform the following calculation:
     * </p>
     * <p>
     * <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     * </p>
     * <p>
     * where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum value
     * listed in the following table, based on the value that you specified for Level.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum recommended decoding speed in Luma samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 76800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 1536000
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 5068800
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 5184000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10368000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 27648000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 55296000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 62914560
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 62914560
     * </p>
     * </li>
     * </ul>
     * 
     * @return The frames per second for the video stream in the output file. Valid values include:</p>
     *         <p>
     *         <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>, <code>60</code>
     *         </p>
     *         <p>
     *         If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If
     *         you specify a frame rate, we recommend that you perform the following calculation:
     *         </p>
     *         <p>
     *         <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     *         </p>
     *         <p>
     *         where:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum
     *         value listed in the following table, based on the value that you specified for Level.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The maximum recommended decoding speed in Luma samples/second for each level is described in the
     *         following list (<i>Level - Decoding speed</i>):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1 - 380160
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1b - 380160
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.1 - 76800
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.2 - 1536000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.3 - 3041280
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2 - 3041280
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.1 - 5068800
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.2 - 5184000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3 - 10368000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.1 - 27648000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.2 - 55296000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4 - 62914560
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4.1 - 62914560
     *         </p>
     *         </li>
     */

    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * <p>
     * The frames per second for the video stream in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If you
     * specify a frame rate, we recommend that you perform the following calculation:
     * </p>
     * <p>
     * <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     * </p>
     * <p>
     * where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum value
     * listed in the following table, based on the value that you specified for Level.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum recommended decoding speed in Luma samples/second for each level is described in the following list
     * (<i>Level - Decoding speed</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 380160
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 76800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 1536000
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 3041280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 5068800
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 5184000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 10368000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 27648000
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 55296000
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 62914560
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 62914560
     * </p>
     * </li>
     * </ul>
     * 
     * @param frameRate
     *        The frames per second for the video stream in the output file. Valid values include:</p>
     *        <p>
     *        <code>auto</code>, <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     *        <code>29.97</code>, <code>30</code>, <code>60</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder uses the detected frame rate of the input source. If
     *        you specify a frame rate, we recommend that you perform the following calculation:
     *        </p>
     *        <p>
     *        <code>Frame rate = maximum recommended decoding speed in luma samples/second / (width in pixels * height in pixels)</code>
     *        </p>
     *        <p>
     *        where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>width in pixels</i> and <i>height in pixels</i> represent the Resolution of the output video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>maximum recommended decoding speed in Luma samples/second</i> is less than or equal to the maximum
     *        value listed in the following table, based on the value that you specified for Level.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The maximum recommended decoding speed in Luma samples/second for each level is described in the following
     *        list (<i>Level - Decoding speed</i>):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 380160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 380160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 76800
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 1536000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 3041280
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 3041280
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.1 - 5068800
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.2 - 5184000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 10368000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 27648000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 55296000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 62914560
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 62914560
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withFrameRate(String frameRate) {
        setFrameRate(frameRate);
        return this;
    }

    /**
     * <p>
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of the input
     * video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic Transcoder to
     * use when the frame rate of the input video is greater than the desired maximum frame rate of the output video.
     * Valid values include: <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>.
     * </p>
     * 
     * @param maxFrameRate
     *        If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of the
     *        input video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic
     *        Transcoder to use when the frame rate of the input video is greater than the desired maximum frame rate of
     *        the output video. Valid values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     *        <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>, <code>60</code>.
     */

    public void setMaxFrameRate(String maxFrameRate) {
        this.maxFrameRate = maxFrameRate;
    }

    /**
     * <p>
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of the input
     * video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic Transcoder to
     * use when the frame rate of the input video is greater than the desired maximum frame rate of the output video.
     * Valid values include: <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>.
     * </p>
     * 
     * @return If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of
     *         the input video for the frame rate of the output video. Specify the maximum frame rate that you want
     *         Elastic Transcoder to use when the frame rate of the input video is greater than the desired maximum
     *         frame rate of the output video. Valid values include: <code>10</code>, <code>15</code>,
     *         <code>23.97</code>, <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>,
     *         <code>60</code>.
     */

    public String getMaxFrameRate() {
        return this.maxFrameRate;
    }

    /**
     * <p>
     * If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of the input
     * video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic Transcoder to
     * use when the frame rate of the input video is greater than the desired maximum frame rate of the output video.
     * Valid values include: <code>10</code>, <code>15</code>, <code>23.97</code>, <code>24</code>, <code>25</code>,
     * <code>29.97</code>, <code>30</code>, <code>60</code>.
     * </p>
     * 
     * @param maxFrameRate
     *        If you specify <code>auto</code> for <code>FrameRate</code>, Elastic Transcoder uses the frame rate of the
     *        input video for the frame rate of the output video. Specify the maximum frame rate that you want Elastic
     *        Transcoder to use when the frame rate of the input video is greater than the desired maximum frame rate of
     *        the output video. Valid values include: <code>10</code>, <code>15</code>, <code>23.97</code>,
     *        <code>24</code>, <code>25</code>, <code>29.97</code>, <code>30</code>, <code>60</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withMaxFrameRate(String maxFrameRate) {
        setMaxFrameRate(maxFrameRate);
        return this;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file, subject to the
     * following rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following about specifying the width and height:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The width must be an even integer between 128 and 4096, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * The height must be an even integer between 96 and 3072, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder rescales the
     * output file to the lower resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder rescales
     * the output to the higher resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you specify a resolution for which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height value</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 202752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 921600
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 1310720
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 2097152
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 2097152
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param resolution
     *        <p>
     *        To better control resolution and aspect ratio of output videos, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     *        <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two
     *        groups of settings are mutually exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     *        <i>width</i> x <i>height</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file, subject
     *        to the following rules.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note the following about specifying the width and height:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The width must be an even integer between 128 and 4096, inclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The height must be an even integer between 96 and 3072, inclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder
     *        rescales the output file to the lower resolution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder
     *        rescales the output to the higher resolution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        We recommend that you specify a resolution for which the product of width and height is less than or equal
     *        to the applicable value in the following list (<i>List - Max width x height value</i>):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 25344
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 25344
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.1 - 202752
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.2 - 404720
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 404720
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 921600
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 1310720
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 2097152
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 2097152
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file, subject to the
     * following rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following about specifying the width and height:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The width must be an even integer between 128 and 4096, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * The height must be an even integer between 96 and 3072, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder rescales the
     * output file to the lower resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder rescales
     * the output to the higher resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you specify a resolution for which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height value</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 202752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 921600
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 1310720
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 2097152
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 2097152
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         To better control resolution and aspect ratio of output videos, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     *         <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two
     *         groups of settings are mutually exclusive. Do not use them together.
     *         </p>
     *         </important>
     *         <p>
     *         The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     *         <i>width</i> x <i>height</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file,
     *         subject to the following rules.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note the following about specifying the width and height:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The width must be an even integer between 128 and 4096, inclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The height must be an even integer between 96 and 3072, inclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder
     *         rescales the output file to the lower resolution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder
     *         rescales the output to the higher resolution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         We recommend that you specify a resolution for which the product of width and height is less than or
     *         equal to the applicable value in the following list (<i>List - Max width x height value</i>):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1 - 25344
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1b - 25344
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.1 - 101376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.2 - 101376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.3 - 101376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2 - 101376
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.1 - 202752
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.2 - 404720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3 - 404720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.1 - 921600
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3.2 - 1310720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4 - 2097152
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4.1 - 2097152
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     * <i>width</i> x <i>height</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file, subject to the
     * following rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following about specifying the width and height:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The width must be an even integer between 128 and 4096, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * The height must be an even integer between 96 and 3072, inclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder rescales the
     * output file to the lower resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder rescales
     * the output to the higher resolution.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you specify a resolution for which the product of width and height is less than or equal to the
     * applicable value in the following list (<i>List - Max width x height value</i>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1b - 25344
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.1 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.3 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - 101376
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.1 - 202752
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.2 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3 - 404720
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.1 - 921600
     * </p>
     * </li>
     * <li>
     * <p>
     * 3.2 - 1310720
     * </p>
     * </li>
     * <li>
     * <p>
     * 4 - 2097152
     * </p>
     * </li>
     * <li>
     * <p>
     * 4.1 - 2097152
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param resolution
     *        <p>
     *        To better control resolution and aspect ratio of output videos, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     *        <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two
     *        groups of settings are mutually exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The width and height of the video in the output file, in pixels. Valid values are <code>auto</code> and
     *        <i>width</i> x <i>height</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto</code>: Elastic Transcoder attempts to preserve the width and height of the input file, subject
     *        to the following rules.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>width</i> x <i>height</i> </code>: The width and height of the output video in pixels.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note the following about specifying the width and height:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The width must be an even integer between 128 and 4096, inclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The height must be an even integer between 96 and 3072, inclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a resolution that is less than the resolution of the input file, Elastic Transcoder
     *        rescales the output file to the lower resolution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a resolution that is greater than the resolution of the input file, Elastic Transcoder
     *        rescales the output to the higher resolution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        We recommend that you specify a resolution for which the product of width and height is less than or equal
     *        to the applicable value in the following list (<i>List - Max width x height value</i>):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1 - 25344
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1b - 25344
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.1 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.2 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1.3 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - 101376
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.1 - 202752
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2.2 - 404720
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3 - 404720
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.1 - 921600
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3.2 - 1310720
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4 - 2097152
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4.1 - 2097152
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The display aspect ratio of the video in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input file.
     * </p>
     * <p>
     * If you specify an aspect ratio for the output file that differs from aspect ratio of the input file, Elastic
     * Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and bottom) to
     * maintain the aspect ratio of the active region of the video.
     * </p>
     * 
     * @param aspectRatio
     *        <p>
     *        To better control resolution and aspect ratio of output videos, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     *        <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two
     *        groups of settings are mutually exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The display aspect ratio of the video in the output file. Valid values include:
     *        </p>
     *        <p>
     *        <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input file.
     *        </p>
     *        <p>
     *        If you specify an aspect ratio for the output file that differs from aspect ratio of the input file,
     *        Elastic Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and
     *        bottom) to maintain the aspect ratio of the active region of the video.
     */

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The display aspect ratio of the video in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input file.
     * </p>
     * <p>
     * If you specify an aspect ratio for the output file that differs from aspect ratio of the input file, Elastic
     * Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and bottom) to
     * maintain the aspect ratio of the active region of the video.
     * </p>
     * 
     * @return <p>
     *         To better control resolution and aspect ratio of output videos, we recommend that you use the values
     *         <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     *         <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two
     *         groups of settings are mutually exclusive. Do not use them together.
     *         </p>
     *         </important>
     *         <p>
     *         The display aspect ratio of the video in the output file. Valid values include:
     *         </p>
     *         <p>
     *         <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *         </p>
     *         <p>
     *         If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input
     *         file.
     *         </p>
     *         <p>
     *         If you specify an aspect ratio for the output file that differs from aspect ratio of the input file,
     *         Elastic Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and
     *         bottom) to maintain the aspect ratio of the active region of the video.
     */

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * <important>
     * <p>
     * To better control resolution and aspect ratio of output videos, we recommend that you use the values
     * <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     * <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two groups
     * of settings are mutually exclusive. Do not use them together.
     * </p>
     * </important>
     * <p>
     * The display aspect ratio of the video in the output file. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input file.
     * </p>
     * <p>
     * If you specify an aspect ratio for the output file that differs from aspect ratio of the input file, Elastic
     * Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and bottom) to
     * maintain the aspect ratio of the active region of the video.
     * </p>
     * 
     * @param aspectRatio
     *        <p>
     *        To better control resolution and aspect ratio of output videos, we recommend that you use the values
     *        <code>MaxWidth</code>, <code>MaxHeight</code>, <code>SizingPolicy</code>, <code>PaddingPolicy</code>, and
     *        <code>DisplayAspectRatio</code> instead of <code>Resolution</code> and <code>AspectRatio</code>. The two
     *        groups of settings are mutually exclusive. Do not use them together.
     *        </p>
     *        </important>
     *        <p>
     *        The display aspect ratio of the video in the output file. Valid values include:
     *        </p>
     *        <p>
     *        <code>auto</code>, <code>1:1</code>, <code>4:3</code>, <code>3:2</code>, <code>16:9</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder tries to preserve the aspect ratio of the input file.
     *        </p>
     *        <p>
     *        If you specify an aspect ratio for the output file that differs from aspect ratio of the input file,
     *        Elastic Transcoder adds pillarboxing (black bars on the sides) or letterboxing (black bars on the top and
     *        bottom) to maintain the aspect ratio of the active region of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withAspectRatio(String aspectRatio) {
        setAspectRatio(aspectRatio);
        return this;
    }

    /**
     * <p>
     * The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1920
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096.
     * </p>
     * 
     * @param maxWidth
     *        The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     *        1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and
     *        4096.
     */

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * <p>
     * The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1920
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096.
     * </p>
     * 
     * @return The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *         uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between
     *         128 and 4096.
     */

    public String getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * <p>
     * The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1920
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096.
     * </p>
     * 
     * @param maxWidth
     *        The maximum width of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses
     *        1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and
     *        4096.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withMaxWidth(String maxWidth) {
        setMaxWidth(maxWidth);
        return this;
    }

    /**
     * <p>
     * The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1080
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *        uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96
     *        and 3072.
     */

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
     * <p>
     * The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1080
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072.
     * </p>
     * 
     * @return The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *         uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between
     *         96 and 3072.
     */

    public String getMaxHeight() {
        return this.maxHeight;
    }

    /**
     * <p>
     * The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder uses 1080
     * (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072.
     * </p>
     * 
     * @param maxHeight
     *        The maximum height of the output video in pixels. If you specify <code>auto</code>, Elastic Transcoder
     *        uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96
     *        and 3072.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withMaxHeight(String maxHeight) {
        setMaxHeight(maxHeight);
        return this;
    }

    /**
     * <p>
     * The value that Elastic Transcoder adds to the metadata in the output file.
     * </p>
     * 
     * @param displayAspectRatio
     *        The value that Elastic Transcoder adds to the metadata in the output file.
     */

    public void setDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
    }

    /**
     * <p>
     * The value that Elastic Transcoder adds to the metadata in the output file.
     * </p>
     * 
     * @return The value that Elastic Transcoder adds to the metadata in the output file.
     */

    public String getDisplayAspectRatio() {
        return this.displayAspectRatio;
    }

    /**
     * <p>
     * The value that Elastic Transcoder adds to the metadata in the output file.
     * </p>
     * 
     * @param displayAspectRatio
     *        The value that Elastic Transcoder adds to the metadata in the output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withDisplayAspectRatio(String displayAspectRatio) {
        setDisplayAspectRatio(displayAspectRatio);
        return this;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of the output video:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified in
     * either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output video and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input video and the output
     * video are different, the output video will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input video
     * exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        Specify one of the following values to control scaling of the output video:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified in
     *        either <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified
     *        in either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic
     *        Transcoder centers the output video and then crops it in the dimension (if any) that exceeds the maximum
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you specified
     *        for <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input video and
     *        the output video are different, the output video will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input
     *        video exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic
     *        Transcoder crops the output video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        exceeding either value. If you specify this option, Elastic Transcoder does not scale the video up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match
     *        the values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        dropping below either value. If you specify this option, Elastic Transcoder does not scale the video up.
     *        </p>
     *        </li>
     */

    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of the output video:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified in
     * either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output video and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input video and the output
     * video are different, the output video will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input video
     * exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify one of the following values to control scaling of the output video:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified
     *         in either <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified
     *         in either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic
     *         Transcoder centers the output video and then crops it in the dimension (if any) that exceeds the maximum
     *         value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you
     *         specified for <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input
     *         video and the output video are different, the output video will be distorted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input
     *         video exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic
     *         Transcoder crops the output video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code>
     *         without exceeding either value. If you specify this option, Elastic Transcoder does not scale the video
     *         up.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match
     *         the values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code>
     *         without dropping below either value. If you specify this option, Elastic Transcoder does not scale the
     *         video up.
     *         </p>
     *         </li>
     */

    public String getSizingPolicy() {
        return this.sizingPolicy;
    }

    /**
     * <p>
     * Specify one of the following values to control scaling of the output video:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified in either
     * <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified in
     * either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic Transcoder
     * centers the output video and then crops it in the dimension (if any) that exceeds the maximum value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you specified for
     * <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input video and the output
     * video are different, the output video will be distorted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input video
     * exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic Transcoder
     * crops the output video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match the values
     * that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without exceeding either
     * value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match the
     * values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without dropping
     * below either value. If you specify this option, Elastic Transcoder does not scale the video up.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizingPolicy
     *        Specify one of the following values to control scaling of the output video:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fit</code>: Elastic Transcoder scales the output video so it matches the value that you specified in
     *        either <code>MaxWidth</code> or <code>MaxHeight</code> without exceeding the other value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fill</code>: Elastic Transcoder scales the output video so it matches the value that you specified
     *        in either <code>MaxWidth</code> or <code>MaxHeight</code> and matches or exceeds the other value. Elastic
     *        Transcoder centers the output video and then crops it in the dimension (if any) that exceeds the maximum
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stretch</code>: Elastic Transcoder stretches the output video to match the values that you specified
     *        for <code>MaxWidth</code> and <code>MaxHeight</code>. If the relative proportions of the input video and
     *        the output video are different, the output video will be distorted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Keep</code>: Elastic Transcoder does not scale the output video. If either dimension of the input
     *        video exceeds the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>, Elastic
     *        Transcoder crops the output video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFit</code>: Elastic Transcoder scales the output video down so that its dimensions match the
     *        values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        exceeding either value. If you specify this option, Elastic Transcoder does not scale the video up.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShrinkToFill</code>: Elastic Transcoder scales the output video down so that its dimensions match
     *        the values that you specified for at least one of <code>MaxWidth</code> and <code>MaxHeight</code> without
     *        dropping below either value. If you specify this option, Elastic Transcoder does not scale the video up.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withSizingPolicy(String sizingPolicy) {
        setSizingPolicy(sizingPolicy);
        return this;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of the output video to make the total size of the output video match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     * 
     * @param paddingPolicy
     *        When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the
     *        top and bottom and/or left and right sides of the output video to make the total size of the output video
     *        match the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     */

    public void setPaddingPolicy(String paddingPolicy) {
        this.paddingPolicy = paddingPolicy;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of the output video to make the total size of the output video match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     * 
     * @return When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the
     *         top and bottom and/or left and right sides of the output video to make the total size of the output video
     *         match the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     */

    public String getPaddingPolicy() {
        return this.paddingPolicy;
    }

    /**
     * <p>
     * When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the top and
     * bottom and/or left and right sides of the output video to make the total size of the output video match the
     * values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * </p>
     * 
     * @param paddingPolicy
     *        When you set <code>PaddingPolicy</code> to <code>Pad</code>, Elastic Transcoder may add black bars to the
     *        top and bottom and/or left and right sides of the output video to make the total size of the output video
     *        match the values that you specified for <code>MaxWidth</code> and <code>MaxHeight</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withPaddingPolicy(String paddingPolicy) {
        setPaddingPolicy(paddingPolicy);
        return this;
    }

    /**
     * <p>
     * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos
     * that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in
     * the specified size and location, and with the specified opacity for the duration of the transcoded video.
     * </p>
     * <p>
     * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the
     * .png format, which supports transparency.
     * </p>
     * <p>
     * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     * Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     * watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * </p>
     * 
     * @return Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over
     *         videos that are transcoded using this preset. You can specify settings for up to four watermarks.
     *         Watermarks appear in the specified size and location, and with the specified opacity for the duration of
     *         the transcoded video.</p>
     *         <p>
     *         Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use
     *         the .png format, which supports transparency.
     *         </p>
     *         <p>
     *         When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     *         Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you
     *         specify watermark settings in the preset, which allows you to use the same preset for up to four
     *         watermarks that have different dimensions.
     */

    public java.util.List<PresetWatermark> getWatermarks() {
        if (watermarks == null) {
            watermarks = new com.amazonaws.internal.SdkInternalList<PresetWatermark>();
        }
        return watermarks;
    }

    /**
     * <p>
     * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos
     * that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in
     * the specified size and location, and with the specified opacity for the duration of the transcoded video.
     * </p>
     * <p>
     * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the
     * .png format, which supports transparency.
     * </p>
     * <p>
     * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     * Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     * watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * </p>
     * 
     * @param watermarks
     *        Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over
     *        videos that are transcoded using this preset. You can specify settings for up to four watermarks.
     *        Watermarks appear in the specified size and location, and with the specified opacity for the duration of
     *        the transcoded video.</p>
     *        <p>
     *        Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use
     *        the .png format, which supports transparency.
     *        </p>
     *        <p>
     *        When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     *        Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     *        watermark settings in the preset, which allows you to use the same preset for up to four watermarks that
     *        have different dimensions.
     */

    public void setWatermarks(java.util.Collection<PresetWatermark> watermarks) {
        if (watermarks == null) {
            this.watermarks = null;
            return;
        }

        this.watermarks = new com.amazonaws.internal.SdkInternalList<PresetWatermark>(watermarks);
    }

    /**
     * <p>
     * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos
     * that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in
     * the specified size and location, and with the specified opacity for the duration of the transcoded video.
     * </p>
     * <p>
     * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the
     * .png format, which supports transparency.
     * </p>
     * <p>
     * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     * Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     * watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWatermarks(java.util.Collection)} or {@link #withWatermarks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param watermarks
     *        Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over
     *        videos that are transcoded using this preset. You can specify settings for up to four watermarks.
     *        Watermarks appear in the specified size and location, and with the specified opacity for the duration of
     *        the transcoded video.</p>
     *        <p>
     *        Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use
     *        the .png format, which supports transparency.
     *        </p>
     *        <p>
     *        When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     *        Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     *        watermark settings in the preset, which allows you to use the same preset for up to four watermarks that
     *        have different dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withWatermarks(PresetWatermark... watermarks) {
        if (this.watermarks == null) {
            setWatermarks(new com.amazonaws.internal.SdkInternalList<PresetWatermark>(watermarks.length));
        }
        for (PresetWatermark ele : watermarks) {
            this.watermarks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over videos
     * that are transcoded using this preset. You can specify settings for up to four watermarks. Watermarks appear in
     * the specified size and location, and with the specified opacity for the duration of the transcoded video.
     * </p>
     * <p>
     * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the
     * .png format, which supports transparency.
     * </p>
     * <p>
     * When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     * Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     * watermark settings in the preset, which allows you to use the same preset for up to four watermarks that have
     * different dimensions.
     * </p>
     * 
     * @param watermarks
     *        Settings for the size, location, and opacity of graphics that you want Elastic Transcoder to overlay over
     *        videos that are transcoded using this preset. You can specify settings for up to four watermarks.
     *        Watermarks appear in the specified size and location, and with the specified opacity for the duration of
     *        the transcoded video.</p>
     *        <p>
     *        Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use
     *        the .png format, which supports transparency.
     *        </p>
     *        <p>
     *        When you create a job that uses this preset, you specify the .png or .jpg graphics that you want Elastic
     *        Transcoder to include in the transcoded videos. You can specify fewer graphics in the job than you specify
     *        watermark settings in the preset, which allows you to use the same preset for up to four watermarks that
     *        have different dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoParameters withWatermarks(java.util.Collection<PresetWatermark> watermarks) {
        setWatermarks(watermarks);
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
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getCodecOptions() != null)
            sb.append("CodecOptions: ").append(getCodecOptions()).append(",");
        if (getKeyframesMaxDist() != null)
            sb.append("KeyframesMaxDist: ").append(getKeyframesMaxDist()).append(",");
        if (getFixedGOP() != null)
            sb.append("FixedGOP: ").append(getFixedGOP()).append(",");
        if (getBitRate() != null)
            sb.append("BitRate: ").append(getBitRate()).append(",");
        if (getFrameRate() != null)
            sb.append("FrameRate: ").append(getFrameRate()).append(",");
        if (getMaxFrameRate() != null)
            sb.append("MaxFrameRate: ").append(getMaxFrameRate()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getAspectRatio() != null)
            sb.append("AspectRatio: ").append(getAspectRatio()).append(",");
        if (getMaxWidth() != null)
            sb.append("MaxWidth: ").append(getMaxWidth()).append(",");
        if (getMaxHeight() != null)
            sb.append("MaxHeight: ").append(getMaxHeight()).append(",");
        if (getDisplayAspectRatio() != null)
            sb.append("DisplayAspectRatio: ").append(getDisplayAspectRatio()).append(",");
        if (getSizingPolicy() != null)
            sb.append("SizingPolicy: ").append(getSizingPolicy()).append(",");
        if (getPaddingPolicy() != null)
            sb.append("PaddingPolicy: ").append(getPaddingPolicy()).append(",");
        if (getWatermarks() != null)
            sb.append("Watermarks: ").append(getWatermarks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoParameters == false)
            return false;
        VideoParameters other = (VideoParameters) obj;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getCodecOptions() == null ^ this.getCodecOptions() == null)
            return false;
        if (other.getCodecOptions() != null && other.getCodecOptions().equals(this.getCodecOptions()) == false)
            return false;
        if (other.getKeyframesMaxDist() == null ^ this.getKeyframesMaxDist() == null)
            return false;
        if (other.getKeyframesMaxDist() != null && other.getKeyframesMaxDist().equals(this.getKeyframesMaxDist()) == false)
            return false;
        if (other.getFixedGOP() == null ^ this.getFixedGOP() == null)
            return false;
        if (other.getFixedGOP() != null && other.getFixedGOP().equals(this.getFixedGOP()) == false)
            return false;
        if (other.getBitRate() == null ^ this.getBitRate() == null)
            return false;
        if (other.getBitRate() != null && other.getBitRate().equals(this.getBitRate()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getMaxFrameRate() == null ^ this.getMaxFrameRate() == null)
            return false;
        if (other.getMaxFrameRate() != null && other.getMaxFrameRate().equals(this.getMaxFrameRate()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null)
            return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false)
            return false;
        if (other.getMaxWidth() == null ^ this.getMaxWidth() == null)
            return false;
        if (other.getMaxWidth() != null && other.getMaxWidth().equals(this.getMaxWidth()) == false)
            return false;
        if (other.getMaxHeight() == null ^ this.getMaxHeight() == null)
            return false;
        if (other.getMaxHeight() != null && other.getMaxHeight().equals(this.getMaxHeight()) == false)
            return false;
        if (other.getDisplayAspectRatio() == null ^ this.getDisplayAspectRatio() == null)
            return false;
        if (other.getDisplayAspectRatio() != null && other.getDisplayAspectRatio().equals(this.getDisplayAspectRatio()) == false)
            return false;
        if (other.getSizingPolicy() == null ^ this.getSizingPolicy() == null)
            return false;
        if (other.getSizingPolicy() != null && other.getSizingPolicy().equals(this.getSizingPolicy()) == false)
            return false;
        if (other.getPaddingPolicy() == null ^ this.getPaddingPolicy() == null)
            return false;
        if (other.getPaddingPolicy() != null && other.getPaddingPolicy().equals(this.getPaddingPolicy()) == false)
            return false;
        if (other.getWatermarks() == null ^ this.getWatermarks() == null)
            return false;
        if (other.getWatermarks() != null && other.getWatermarks().equals(this.getWatermarks()) == false)
            return false;
        return true;
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
    public VideoParameters clone() {
        try {
            return (VideoParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.VideoParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
