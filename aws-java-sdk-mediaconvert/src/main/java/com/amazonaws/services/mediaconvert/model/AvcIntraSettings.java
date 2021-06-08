/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra settings,
 * see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
 * https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
 * https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AvcIntraSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvcIntraSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate
     * depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved
     * image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     */
    private String avcIntraClass;
    /**
     * Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class
     * to a different value, this object isn't allowed.
     */
    private AvcIntraUhdSettings avcIntraUhdSettings;
    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     */
    private String framerateControl;
    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
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
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     */
    private String interlaceMode;
    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     */
    private String scanTypeConversionMode;
    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     */
    private String slowPal;
    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the
     * default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     * with the field polarity to create a smoother picture.
     */
    private String telecine;

    /**
     * Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate
     * depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved
     * image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * 
     * @param avcIntraClass
     *        Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit
     *        rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and
     *        improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * @see AvcIntraClass
     */

    public void setAvcIntraClass(String avcIntraClass) {
        this.avcIntraClass = avcIntraClass;
    }

    /**
     * Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate
     * depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved
     * image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * 
     * @return Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit
     *         rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and
     *         improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * @see AvcIntraClass
     */

    public String getAvcIntraClass() {
        return this.avcIntraClass;
    }

    /**
     * Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate
     * depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved
     * image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * 
     * @param avcIntraClass
     *        Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit
     *        rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and
     *        improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraClass
     */

    public AvcIntraSettings withAvcIntraClass(String avcIntraClass) {
        setAvcIntraClass(avcIntraClass);
        return this;
    }

    /**
     * Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate
     * depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved
     * image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * 
     * @param avcIntraClass
     *        Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit
     *        rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and
     *        improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraClass
     */

    public AvcIntraSettings withAvcIntraClass(AvcIntraClass avcIntraClass) {
        this.avcIntraClass = avcIntraClass.toString();
        return this;
    }

    /**
     * Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class
     * to a different value, this object isn't allowed.
     * 
     * @param avcIntraUhdSettings
     *        Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra
     *        class to a different value, this object isn't allowed.
     */

    public void setAvcIntraUhdSettings(AvcIntraUhdSettings avcIntraUhdSettings) {
        this.avcIntraUhdSettings = avcIntraUhdSettings;
    }

    /**
     * Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class
     * to a different value, this object isn't allowed.
     * 
     * @return Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set
     *         AVC-Intra class to a different value, this object isn't allowed.
     */

    public AvcIntraUhdSettings getAvcIntraUhdSettings() {
        return this.avcIntraUhdSettings;
    }

    /**
     * Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class
     * to a different value, this object isn't allowed.
     * 
     * @param avcIntraUhdSettings
     *        Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra
     *        class to a different value, this object isn't allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvcIntraSettings withAvcIntraUhdSettings(AvcIntraUhdSettings avcIntraUhdSettings) {
        setAvcIntraUhdSettings(avcIntraUhdSettings);
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @see AvcIntraFramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @return If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *         want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *         conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *         dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *         fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *         FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *         INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *         you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *         FramerateDenominator.
     * @see AvcIntraFramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraFramerateControl
     */

    public AvcIntraSettings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job specification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraFramerateControl
     */

    public AvcIntraSettings withFramerateControl(AvcIntraFramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *        recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *        fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *        results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *        conversions, especially if your source video has already been converted from its original cadence, use
     *        FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *        method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant
     *        add-on cost.
     * @see AvcIntraFramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @return Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *         recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *         fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *         results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *         conversions, especially if your source video has already been converted from its original cadence, use
     *         FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *         method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a
     *         significant add-on cost.
     * @see AvcIntraFramerateConversionAlgorithm
     */

    public String getFramerateConversionAlgorithm() {
        return this.framerateConversionAlgorithm;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *        recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *        fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *        results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *        conversions, especially if your source video has already been converted from its original cadence, use
     *        FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *        method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant
     *        add-on cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraFramerateConversionAlgorithm
     */

    public AvcIntraSettings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend
     * using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For
     * numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth
     * picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your
     * source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do
     * motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using
     * FrameFormer increases the transcoding time and incurs a significant add-on cost.
     * 
     * @param framerateConversionAlgorithm
     *        Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We
     *        recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30
     *        fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This
     *        results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate
     *        conversions, especially if your source video has already been converted from its original cadence, use
     *        FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion
     *        method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant
     *        add-on cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraFramerateConversionAlgorithm
     */

    public AvcIntraSettings withFramerateConversionAlgorithm(AvcIntraFramerateConversionAlgorithm framerateConversionAlgorithm) {
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

    public AvcIntraSettings withFramerateDenominator(Integer framerateDenominator) {
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

    public AvcIntraSettings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @param interlaceMode
     *        Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *        progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *        field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *        Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *        outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *        polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *        the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *        source is progressive, the output will be interlaced with top field bottom field first, depending on which
     *        of the Follow options you choose.
     * @see AvcIntraInterlaceMode
     */

    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @return Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *         progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *         field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *         Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *         outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *         polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *         the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *         source is progressive, the output will be interlaced with top field bottom field first, depending on
     *         which of the Follow options you choose.
     * @see AvcIntraInterlaceMode
     */

    public String getInterlaceMode() {
        return this.interlaceMode;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @param interlaceMode
     *        Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *        progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *        field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *        Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *        outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *        polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *        the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *        source is progressive, the output will be interlaced with top field bottom field first, depending on which
     *        of the Follow options you choose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraInterlaceMode
     */

    public AvcIntraSettings withInterlaceMode(String interlaceMode) {
        setInterlaceMode(interlaceMode);
        return this;
    }

    /**
     * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     * progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field
     * first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow,
     * default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same
     * field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the
     * course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will
     * be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced
     * with top field bottom field first, depending on which of the Follow options you choose.
     * 
     * @param interlaceMode
     *        Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a
     *        progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom
     *        field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout.
     *        Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce
     *        outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field
     *        polarity might change over the course of the output. Follow behavior depends on the input scan type. If
     *        the source is interlaced, the output will be interlaced with the same polarity as the source. If the
     *        source is progressive, the output will be interlaced with top field bottom field first, depending on which
     *        of the Follow options you choose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraInterlaceMode
     */

    public AvcIntraSettings withInterlaceMode(AvcIntraInterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *        output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *        output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *        basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *        When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *        for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *        To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *        use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a
     *        value other than Progressive (PROGRESSIVE).
     * @see AvcIntraScanTypeConversionMode
     */

    public void setScanTypeConversionMode(String scanTypeConversionMode) {
        this.scanTypeConversionMode = scanTypeConversionMode;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @return Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *         this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *         output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *         output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *         basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *         When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *         for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *         To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *         use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to
     *         a value other than Progressive (PROGRESSIVE).
     * @see AvcIntraScanTypeConversionMode
     */

    public String getScanTypeConversionMode() {
        return this.scanTypeConversionMode;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *        output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *        output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *        basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *        When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *        for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *        To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *        use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a
     *        value other than Progressive (PROGRESSIVE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraScanTypeConversionMode
     */

    public AvcIntraSettings withScanTypeConversionMode(String scanTypeConversionMode) {
        setScanTypeConversionMode(scanTypeConversionMode);
        return this;
    }

    /**
     * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
     * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In
     * this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the
     * default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing,
     * MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized
     * interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing,
     * MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you
     * must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine
     * outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
     * 
     * @param scanTypeConversionMode
     *        Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In
     *        this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced
     *        output. In this case, each progressive frame from the input corresponds to an interlaced field in the
     *        output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With
     *        basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames.
     *        When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable
     *        for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings:
     *        To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't
     *        use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a
     *        value other than Progressive (PROGRESSIVE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraScanTypeConversionMode
     */

    public AvcIntraSettings withScanTypeConversionMode(AvcIntraScanTypeConversionMode scanTypeConversionMode) {
        this.scanTypeConversionMode = scanTypeConversionMode.toString();
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *        resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly
     *        reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job
     *        specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *        (framerateDenominator) to 1.
     * @see AvcIntraSlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @return Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *         to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *         resamples your audio to keep it synchronized with the video. Note that enabling this setting will
     *         slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your
     *         JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *         (framerateDenominator) to 1.
     * @see AvcIntraSlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *        resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly
     *        reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job
     *        specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *        (framerateDenominator) to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraSlowPal
     */

    public AvcIntraSettings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples
     * your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the
     * duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set
     * (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and
     *        resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly
     *        reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job
     *        specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     *        (framerateDenominator) to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraSlowPal
     */

    public AvcIntraSettings withSlowPal(AvcIntraSlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the
     * default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     * with the field polarity to create a smoother picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you
     *        keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without
     *        doing anything with the field polarity to create a smoother picture.
     * @see AvcIntraTelecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the
     * default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     * with the field polarity to create a smoother picture.
     * 
     * @return When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *         type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you
     *         keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without
     *         doing anything with the field polarity to create a smoother picture.
     * @see AvcIntraTelecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the
     * default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     * with the field polarity to create a smoother picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you
     *        keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without
     *        doing anything with the field polarity to create a smoother picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraTelecine
     */

    public AvcIntraSettings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
     * interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the
     * default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything
     * with the field polarity to create a smoother picture.
     * 
     * @param telecine
     *        When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan
     *        type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you
     *        keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without
     *        doing anything with the field polarity to create a smoother picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraTelecine
     */

    public AvcIntraSettings withTelecine(AvcIntraTelecine telecine) {
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
        if (getAvcIntraClass() != null)
            sb.append("AvcIntraClass: ").append(getAvcIntraClass()).append(",");
        if (getAvcIntraUhdSettings() != null)
            sb.append("AvcIntraUhdSettings: ").append(getAvcIntraUhdSettings()).append(",");
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

        if (obj instanceof AvcIntraSettings == false)
            return false;
        AvcIntraSettings other = (AvcIntraSettings) obj;
        if (other.getAvcIntraClass() == null ^ this.getAvcIntraClass() == null)
            return false;
        if (other.getAvcIntraClass() != null && other.getAvcIntraClass().equals(this.getAvcIntraClass()) == false)
            return false;
        if (other.getAvcIntraUhdSettings() == null ^ this.getAvcIntraUhdSettings() == null)
            return false;
        if (other.getAvcIntraUhdSettings() != null && other.getAvcIntraUhdSettings().equals(this.getAvcIntraUhdSettings()) == false)
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

        hashCode = prime * hashCode + ((getAvcIntraClass() == null) ? 0 : getAvcIntraClass().hashCode());
        hashCode = prime * hashCode + ((getAvcIntraUhdSettings() == null) ? 0 : getAvcIntraUhdSettings().hashCode());
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
    public AvcIntraSettings clone() {
        try {
            return (AvcIntraSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AvcIntraSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
