/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set Codec, under VideoDescription>CodecSettings to the value UNCOMPRESSED.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UncompressedSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UncompressedSettings implements Serializable, Cloneable, StructuredPojo {

    /** The four character code for the uncompressed video. */
    private String fourcc;
    /**
     * Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the
     * dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions.
     * If you choose Custom, specify your frame rate as a fraction.
     */
    private String framerateControl;
    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For numerically
     * simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value, Drop duplicate. For
     * numerically complex conversions, to avoid stutter: Choose Interpolate. This results in a smooth picture, but might
     * introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has
     * already been converted from its original cadence: Choose FrameFormer to do motion-compensated interpolation.
     * FrameFormer uses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding
     * time and incurs a significant add-on cost. When you choose FrameFormer, your input video resolution must be at
     * least 128x96.
     */
    private String framerateConversionAlgorithm;
    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     */
    private Integer framerateDenominator;
    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     */
    private Integer framerateNumerator;
    /**
     * Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a
     * progressive output.
     */
    private String interlaceMode;
    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing to create a better quality interlaced output. In this case, each
     * progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic
     * interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate
     * conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output
     * frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to
     * basic interlacing. Required settings: To use optimized interlacing, you must set Telecine to None or Soft. You
     * can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode to a value other than
     * Progressive.
     */
    private String scanTypeConversionMode;
    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25.
     */
    private String slowPal;
    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep the default
     * value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field
     * polarity to create a smoother picture.
     */
    private String telecine;

    /**
     * The four character code for the uncompressed video.
     * 
     * @param fourcc
     *        The four character code for the uncompressed video.
     * @see UncompressedFourcc
     */

    public void setFourcc(String fourcc) {
        this.fourcc = fourcc;
    }

    /**
     * The four character code for the uncompressed video.
     * 
     * @return The four character code for the uncompressed video.
     * @see UncompressedFourcc
     */

    public String getFourcc() {
        return this.fourcc;
    }

    /**
     * The four character code for the uncompressed video.
     * 
     * @param fourcc
     *        The four character code for the uncompressed video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedFourcc
     */

    public UncompressedSettings withFourcc(String fourcc) {
        setFourcc(fourcc);
        return this;
    }

    /**
     * The four character code for the uncompressed video.
     * 
     * @param fourcc
     *        The four character code for the uncompressed video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedFourcc
     */

    public UncompressedSettings withFourcc(UncompressedFourcc fourcc) {
        this.fourcc = fourcc.toString();
        return this;
    }

    /**
     * Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the
     * dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions.
     * If you choose Custom, specify your frame rate as a fraction.
     * 
     * @param framerateControl
     *        Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame
     *        rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame
     *        rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     *        approximations of fractions. If you choose Custom, specify your frame rate as a fraction.
     * @see UncompressedFramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the
     * dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions.
     * If you choose Custom, specify your frame rate as a fraction.
     * 
     * @return Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame
     *         rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame
     *         rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     *         approximations of fractions. If you choose Custom, specify your frame rate as a fraction.
     * @see UncompressedFramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the
     * dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions.
     * If you choose Custom, specify your frame rate as a fraction.
     * 
     * @param framerateControl
     *        Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame
     *        rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame
     *        rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     *        approximations of fractions. If you choose Custom, specify your frame rate as a fraction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedFramerateControl
     */

    public UncompressedSettings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the
     * dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions.
     * If you choose Custom, specify your frame rate as a fraction.
     * 
     * @param framerateControl
     *        Use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame
     *        rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame
     *        rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     *        approximations of fractions. If you choose Custom, specify your frame rate as a fraction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedFramerateControl
     */

    public UncompressedSettings withFramerateControl(UncompressedFramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For numerically
     * simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value, Drop duplicate. For
     * numerically complex conversions, to avoid stutter: Choose Interpolate. This results in a smooth picture, but might
     * introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has
     * already been converted from its original cadence: Choose FrameFormer to do motion-compensated interpolation.
     * FrameFormer uses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding
     * time and incurs a significant add-on cost. When you choose FrameFormer, your input video resolution must be at
     * least 128x96.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For
     *        numerically simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value,
     *        Drop duplicate. For numerically complex conversions, to avoid stutter: Choose Interpolate. This results in
     *        a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions,
     *        especially if your source video has already been converted from its original cadence: Choose FrameFormer
     *        to do motion-compensated interpolation. FrameFormer uses the best conversion method frame by frame. Note
     *        that using FrameFormer increases the transcoding time and incurs a significant add-on cost. When you
     *        choose FrameFormer, your input video resolution must be at least 128x96.
     * @see UncompressedFramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For numerically
     * simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value, Drop duplicate. For
     * numerically complex conversions, to avoid stutter: Choose Interpolate. This results in a smooth picture, but might
     * introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has
     * already been converted from its original cadence: Choose FrameFormer to do motion-compensated interpolation.
     * FrameFormer uses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding
     * time and incurs a significant add-on cost. When you choose FrameFormer, your input video resolution must be at
     * least 128x96.
     * 
     * @return Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For
     *         numerically simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value,
     *         Drop duplicate. For numerically complex conversions, to avoid stutter: Choose Interpolate. This results
     *         in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions,
     *         especially if your source video has already been converted from its original cadence: Choose FrameFormer
     *         to do motion-compensated interpolation. FrameFormer uses the best conversion method frame by frame. Note
     *         that using FrameFormer increases the transcoding time and incurs a significant add-on cost. When you
     *         choose FrameFormer, your input video resolution must be at least 128x96.
     * @see UncompressedFramerateConversionAlgorithm
     */

    public String getFramerateConversionAlgorithm() {
        return this.framerateConversionAlgorithm;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For numerically
     * simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value, Drop duplicate. For
     * numerically complex conversions, to avoid stutter: Choose Interpolate. This results in a smooth picture, but might
     * introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has
     * already been converted from its original cadence: Choose FrameFormer to do motion-compensated interpolation.
     * FrameFormer uses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding
     * time and incurs a significant add-on cost. When you choose FrameFormer, your input video resolution must be at
     * least 128x96.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For
     *        numerically simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value,
     *        Drop duplicate. For numerically complex conversions, to avoid stutter: Choose Interpolate. This results in
     *        a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions,
     *        especially if your source video has already been converted from its original cadence: Choose FrameFormer
     *        to do motion-compensated interpolation. FrameFormer uses the best conversion method frame by frame. Note
     *        that using FrameFormer increases the transcoding time and incurs a significant add-on cost. When you
     *        choose FrameFormer, your input video resolution must be at least 128x96.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedFramerateConversionAlgorithm
     */

    public UncompressedSettings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For numerically
     * simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value, Drop duplicate. For
     * numerically complex conversions, to avoid stutter: Choose Interpolate. This results in a smooth picture, but might
     * introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has
     * already been converted from its original cadence: Choose FrameFormer to do motion-compensated interpolation.
     * FrameFormer uses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding
     * time and incurs a significant add-on cost. When you choose FrameFormer, your input video resolution must be at
     * least 128x96.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. For
     *        numerically simple conversions, such as 60 fps to 30 fps: We recommend that you keep the default value,
     *        Drop duplicate. For numerically complex conversions, to avoid stutter: Choose Interpolate. This results in
     *        a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions,
     *        especially if your source video has already been converted from its original cadence: Choose FrameFormer
     *        to do motion-compensated interpolation. FrameFormer uses the best conversion method frame by frame. Note
     *        that using FrameFormer increases the transcoding time and incurs a significant add-on cost. When you
     *        choose FrameFormer, your input video resolution must be at least 128x96.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedFramerateConversionAlgorithm
     */

    public UncompressedSettings withFramerateConversionAlgorithm(UncompressedFramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @return When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *         fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *         this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *         for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate.
     *         In this example, specify 23.976.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UncompressedSettings withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateNumerator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this
     *        fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for
     *        transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @return When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *         fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this
     *         fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for
     *         transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *         this example, specify 23.976.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this
     * example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame
     * rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateNumerator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this
     *        fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for
     *        transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UncompressedSettings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a
     * progressive output.
     * 
     * @param interlaceMode
     *        Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will
     *        create a progressive output.
     * @see UncompressedInterlaceMode
     */

    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a
     * progressive output.
     * 
     * @return Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will
     *         create a progressive output.
     * @see UncompressedInterlaceMode
     */

    public String getInterlaceMode() {
        return this.interlaceMode;
    }

    /**
     * Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a
     * progressive output.
     * 
     * @param interlaceMode
     *        Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will
     *        create a progressive output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedInterlaceMode
     */

    public UncompressedSettings withInterlaceMode(String interlaceMode) {
        setInterlaceMode(interlaceMode);
        return this;
    }

    /**
     * Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a
     * progressive output.
     * 
     * @param interlaceMode
     *        Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will
     *        create a progressive output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedInterlaceMode
     */

    public UncompressedSettings withInterlaceMode(UncompressedInterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing to create a better quality interlaced output. In this case, each
     * progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic
     * interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate
     * conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output
     * frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to
     * basic interlacing. Required settings: To use optimized interlacing, you must set Telecine to None or Soft. You
     * can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode to a value other than
     * Progressive.
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing to create a better quality interlaced output. In this case,
     *        each progressive frame from the input corresponds to an interlaced field in the output. Keep the default
     *        value, Basic interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs
     *        any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and
     *        you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert
     *        automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must
     *        set Telecine to None or Soft. You can't use optimized interlacing for hard telecine outputs. You must also
     *        set Interlace mode to a value other than Progressive.
     * @see UncompressedScanTypeConversionMode
     */

    public void setScanTypeConversionMode(String scanTypeConversionMode) {
        this.scanTypeConversionMode = scanTypeConversionMode;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing to create a better quality interlaced output. In this case, each
     * progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic
     * interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate
     * conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output
     * frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to
     * basic interlacing. Required settings: To use optimized interlacing, you must set Telecine to None or Soft. You
     * can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode to a value other than
     * Progressive.
     * 
     * @return Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *         this situation, choose Optimized interlacing to create a better quality interlaced output. In this case,
     *         each progressive frame from the input corresponds to an interlaced field in the output. Keep the default
     *         value, Basic interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs
     *         any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and
     *         you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert
     *         automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must
     *         set Telecine to None or Soft. You can't use optimized interlacing for hard telecine outputs. You must
     *         also set Interlace mode to a value other than Progressive.
     * @see UncompressedScanTypeConversionMode
     */

    public String getScanTypeConversionMode() {
        return this.scanTypeConversionMode;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing to create a better quality interlaced output. In this case, each
     * progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic
     * interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate
     * conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output
     * frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to
     * basic interlacing. Required settings: To use optimized interlacing, you must set Telecine to None or Soft. You
     * can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode to a value other than
     * Progressive.
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing to create a better quality interlaced output. In this case,
     *        each progressive frame from the input corresponds to an interlaced field in the output. Keep the default
     *        value, Basic interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs
     *        any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and
     *        you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert
     *        automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must
     *        set Telecine to None or Soft. You can't use optimized interlacing for hard telecine outputs. You must also
     *        set Interlace mode to a value other than Progressive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedScanTypeConversionMode
     */

    public UncompressedSettings withScanTypeConversionMode(String scanTypeConversionMode) {
        setScanTypeConversionMode(scanTypeConversionMode);
        return this;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing to create a better quality interlaced output. In this case, each
     * progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic
     * interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate
     * conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output
     * frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to
     * basic interlacing. Required settings: To use optimized interlacing, you must set Telecine to None or Soft. You
     * can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode to a value other than
     * Progressive.
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing to create a better quality interlaced output. In this case,
     *        each progressive frame from the input corresponds to an interlaced field in the output. Keep the default
     *        value, Basic interlacing, for all other output frame rates. With basic interlacing, MediaConvert performs
     *        any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and
     *        you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert
     *        automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must
     *        set Telecine to None or Soft. You can't use optimized interlacing for hard telecine outputs. You must also
     *        set Interlace mode to a value other than Progressive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedScanTypeConversionMode
     */

    public UncompressedSettings withScanTypeConversionMode(UncompressedScanTypeConversionMode scanTypeConversionMode) {
        this.scanTypeConversionMode = scanTypeConversionMode.toString();
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *        this setting will slightly reduce the duration of your video. Related settings: You must also set
     *        Framerate to 25.
     * @see UncompressedSlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25.
     * 
     * @return Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *         to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *         this setting will slightly reduce the duration of your video. Related settings: You must also set
     *         Framerate to 25.
     * @see UncompressedSlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *        this setting will slightly reduce the duration of your video. Related settings: You must also set
     *        Framerate to 25.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedSlowPal
     */

    public UncompressedSettings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *        this setting will slightly reduce the duration of your video. Related settings: You must also set
     *        Framerate to 25.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedSlowPal
     */

    public UncompressedSettings withSlowPal(UncompressedSlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep the default
     * value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field
     * polarity to create a smoother picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep
     *        the default value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing
     *        anything with the field polarity to create a smoother picture.
     * @see UncompressedTelecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep the default
     * value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field
     * polarity to create a smoother picture.
     * 
     * @return When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *         type is interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep
     *         the default value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing
     *         anything with the field polarity to create a smoother picture.
     * @see UncompressedTelecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep the default
     * value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field
     * polarity to create a smoother picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep
     *        the default value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing
     *        anything with the field polarity to create a smoother picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedTelecine
     */

    public UncompressedSettings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep the default
     * value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field
     * polarity to create a smoother picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard telecine to create a smoother picture. When you keep
     *        the default value, None, MediaConvert does a standard frame rate conversion to 29.97 without doing
     *        anything with the field polarity to create a smoother picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UncompressedTelecine
     */

    public UncompressedSettings withTelecine(UncompressedTelecine telecine) {
        this.telecine = telecine.toString();
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
        if (getFourcc() != null)
            sb.append("Fourcc: ").append(getFourcc()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: ").append(getInterlaceMode()).append(",");
        if (getScanTypeConversionMode() != null)
            sb.append("ScanTypeConversionMode: ").append(getScanTypeConversionMode()).append(",");
        if (getSlowPal() != null)
            sb.append("SlowPal: ").append(getSlowPal()).append(",");
        if (getTelecine() != null)
            sb.append("Telecine: ").append(getTelecine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UncompressedSettings == false)
            return false;
        UncompressedSettings other = (UncompressedSettings) obj;
        if (other.getFourcc() == null ^ this.getFourcc() == null)
            return false;
        if (other.getFourcc() != null && other.getFourcc().equals(this.getFourcc()) == false)
            return false;
        if (other.getFramerateControl() == null ^ this.getFramerateControl() == null)
            return false;
        if (other.getFramerateControl() != null && other.getFramerateControl().equals(this.getFramerateControl()) == false)
            return false;
        if (other.getFramerateConversionAlgorithm() == null ^ this.getFramerateConversionAlgorithm() == null)
            return false;
        if (other.getFramerateConversionAlgorithm() != null && other.getFramerateConversionAlgorithm().equals(this.getFramerateConversionAlgorithm()) == false)
            return false;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
            return false;
        if (other.getScanTypeConversionMode() == null ^ this.getScanTypeConversionMode() == null)
            return false;
        if (other.getScanTypeConversionMode() != null && other.getScanTypeConversionMode().equals(this.getScanTypeConversionMode()) == false)
            return false;
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFourcc() == null) ? 0 : getFourcc().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getScanTypeConversionMode() == null) ? 0 : getScanTypeConversionMode().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        return hashCode;
    }

    @Override
    public UncompressedSettings clone() {
        try {
            return (UncompressedSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.UncompressedSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
