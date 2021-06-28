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
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/XavcSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XavcSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of
     * quantization for your video content. When you want to apply your quantization settings manually, you must set
     * Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this setting to specify the
     * strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive
     * quantization in this transcode, set Adaptive quantization to Off (OFF). Related settings: The value that you
     * choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization),
     * Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization
     * (temporalAdaptiveQuantization).
     */
    private String adaptiveQuantization;
    /**
     * Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If you
     * choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this output's
     * operating point.
     */
    private String entropyEncoding;
    /**
     * If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you want
     * to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list. The framerates shown in the dropdown list are decimal approximations
     * of fractions. If you are creating your transcoding job specification as a JSON file without the console, use
     * FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want
     * the service to use the frame rate that you specify in the settings FramerateNumerator and FramerateDenominator.
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
     * frame rate conversion, provide the value as a decimal number for Frame rate. In this example, specify 23.976.
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
     * Specify the XAVC profile for this output. For more information, see the Sony documentation at
     * https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for
     * XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     */
    private String profile;
    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Frame rate to 25. In your
     * JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     * (framerateDenominator) to 1.
     */
    private String slowPal;
    /**
     * Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we
     * recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     * (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies
     * the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the
     * value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value
     * from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     * high-frequency data. The value 128 results in the softest video.
     */
    private Integer softness;
    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on spatial variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual
     * degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex
     * textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this
     * feature will almost always improve your video quality. Note, though, that this feature doesn't take into account
     * where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of
     * the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you
     * enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on
     * your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider
     * variety of textures, set it to High or Higher.
     */
    private String spatialAdaptiveQuantization;
    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on temporal variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex
     * objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on
     * newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality.
     * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers
     * are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp
     * edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     * temporal adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization
     * (adaptiveQuantization).
     */
    private String temporalAdaptiveQuantization;
    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_CBG.
     */
    private Xavc4kIntraCbgProfileSettings xavc4kIntraCbgProfileSettings;
    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_VBR.
     */
    private Xavc4kIntraVbrProfileSettings xavc4kIntraVbrProfileSettings;
    /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K. */
    private Xavc4kProfileSettings xavc4kProfileSettings;
    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_HD_INTRA_CBG.
     */
    private XavcHdIntraCbgProfileSettings xavcHdIntraCbgProfileSettings;
    /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD. */
    private XavcHdProfileSettings xavcHdProfileSettings;

    /**
     * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of
     * quantization for your video content. When you want to apply your quantization settings manually, you must set
     * Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this setting to specify the
     * strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive
     * quantization in this transcode, set Adaptive quantization to Off (OFF). Related settings: The value that you
     * choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization),
     * Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization
     * (temporalAdaptiveQuantization).
     * 
     * @param adaptiveQuantization
     *        Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best
     *        types of quantization for your video content. When you want to apply your quantization settings manually,
     *        you must set Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this
     *        setting to specify the strength of any adaptive quantization filters that you enable. If you don't want
     *        MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization to Off (OFF).
     *        Related settings: The value that you choose here applies to the following settings: Flicker adaptive
     *        quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization),
     *        and Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @see XavcAdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of
     * quantization for your video content. When you want to apply your quantization settings manually, you must set
     * Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this setting to specify the
     * strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive
     * quantization in this transcode, set Adaptive quantization to Off (OFF). Related settings: The value that you
     * choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization),
     * Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization
     * (temporalAdaptiveQuantization).
     * 
     * @return Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best
     *         types of quantization for your video content. When you want to apply your quantization settings manually,
     *         you must set Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this
     *         setting to specify the strength of any adaptive quantization filters that you enable. If you don't want
     *         MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization to Off (OFF).
     *         Related settings: The value that you choose here applies to the following settings: Flicker adaptive
     *         quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization),
     *         and Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @see XavcAdaptiveQuantization
     */

    public String getAdaptiveQuantization() {
        return this.adaptiveQuantization;
    }

    /**
     * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of
     * quantization for your video content. When you want to apply your quantization settings manually, you must set
     * Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this setting to specify the
     * strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive
     * quantization in this transcode, set Adaptive quantization to Off (OFF). Related settings: The value that you
     * choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization),
     * Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization
     * (temporalAdaptiveQuantization).
     * 
     * @param adaptiveQuantization
     *        Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best
     *        types of quantization for your video content. When you want to apply your quantization settings manually,
     *        you must set Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this
     *        setting to specify the strength of any adaptive quantization filters that you enable. If you don't want
     *        MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization to Off (OFF).
     *        Related settings: The value that you choose here applies to the following settings: Flicker adaptive
     *        quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization),
     *        and Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcAdaptiveQuantization
     */

    public XavcSettings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of
     * quantization for your video content. When you want to apply your quantization settings manually, you must set
     * Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this setting to specify the
     * strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive
     * quantization in this transcode, set Adaptive quantization to Off (OFF). Related settings: The value that you
     * choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization),
     * Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization
     * (temporalAdaptiveQuantization).
     * 
     * @param adaptiveQuantization
     *        Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best
     *        types of quantization for your video content. When you want to apply your quantization settings manually,
     *        you must set Adaptive quantization (adaptiveQuantization) to a value other than Auto (AUTO). Use this
     *        setting to specify the strength of any adaptive quantization filters that you enable. If you don't want
     *        MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization to Off (OFF).
     *        Related settings: The value that you choose here applies to the following settings: Flicker adaptive
     *        quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization),
     *        and Temporal adaptive quantization (temporalAdaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcAdaptiveQuantization
     */

    public XavcSettings withAdaptiveQuantization(XavcAdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If you
     * choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this output's
     * operating point.
     * 
     * @param entropyEncoding
     *        Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If
     *        you choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this
     *        output's operating point.
     * @see XavcEntropyEncoding
     */

    public void setEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
    }

    /**
     * Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If you
     * choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this output's
     * operating point.
     * 
     * @return Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If
     *         you choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this
     *         output's operating point.
     * @see XavcEntropyEncoding
     */

    public String getEntropyEncoding() {
        return this.entropyEncoding;
    }

    /**
     * Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If you
     * choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this output's
     * operating point.
     * 
     * @param entropyEncoding
     *        Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If
     *        you choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this
     *        output's operating point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcEntropyEncoding
     */

    public XavcSettings withEntropyEncoding(String entropyEncoding) {
        setEntropyEncoding(entropyEncoding);
        return this;
    }

    /**
     * Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If you
     * choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this output's
     * operating point.
     * 
     * @param entropyEncoding
     *        Optional. Choose a specific entropy encoding mode only when you want to override XAVC recommendations. If
     *        you choose the value auto, MediaConvert uses the mode that the XAVC file format specifies given this
     *        output's operating point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcEntropyEncoding
     */

    public XavcSettings withEntropyEncoding(XavcEntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
        return this;
    }

    /**
     * If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you want
     * to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list. The framerates shown in the dropdown list are decimal approximations
     * of fractions. If you are creating your transcoding job specification as a JSON file without the console, use
     * FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want
     * the service to use the frame rate that you specify in the settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list. The framerates shown in the dropdown list are
     *        decimal approximations of fractions. If you are creating your transcoding job specification as a JSON file
     *        without the console, use FramerateControl to specify which value the service uses for the frame rate for
     *        this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input.
     *        Choose SPECIFIED if you want the service to use the frame rate that you specify in the settings
     *        FramerateNumerator and FramerateDenominator.
     * @see XavcFramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you want
     * to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list. The framerates shown in the dropdown list are decimal approximations
     * of fractions. If you are creating your transcoding job specification as a JSON file without the console, use
     * FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want
     * the service to use the frame rate that you specify in the settings FramerateNumerator and FramerateDenominator.
     * 
     * @return If you are using the console, use the Frame rate setting to specify the frame rate for this output. If
     *         you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame
     *         rate conversion, choose a frame rate from the dropdown list. The framerates shown in the dropdown list
     *         are decimal approximations of fractions. If you are creating your transcoding job specification as a JSON
     *         file without the console, use FramerateControl to specify which value the service uses for the frame rate
     *         for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the
     *         input. Choose SPECIFIED if you want the service to use the frame rate that you specify in the settings
     *         FramerateNumerator and FramerateDenominator.
     * @see XavcFramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you want
     * to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list. The framerates shown in the dropdown list are decimal approximations
     * of fractions. If you are creating your transcoding job specification as a JSON file without the console, use
     * FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want
     * the service to use the frame rate that you specify in the settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list. The framerates shown in the dropdown list are
     *        decimal approximations of fractions. If you are creating your transcoding job specification as a JSON file
     *        without the console, use FramerateControl to specify which value the service uses for the frame rate for
     *        this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input.
     *        Choose SPECIFIED if you want the service to use the frame rate that you specify in the settings
     *        FramerateNumerator and FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcFramerateControl
     */

    public XavcSettings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you want
     * to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list. The framerates shown in the dropdown list are decimal approximations
     * of fractions. If you are creating your transcoding job specification as a JSON file without the console, use
     * FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want
     * the service to use the frame rate that you specify in the settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Frame rate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list. The framerates shown in the dropdown list are
     *        decimal approximations of fractions. If you are creating your transcoding job specification as a JSON file
     *        without the console, use FramerateControl to specify which value the service uses for the frame rate for
     *        this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input.
     *        Choose SPECIFIED if you want the service to use the frame rate that you specify in the settings
     *        FramerateNumerator and FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcFramerateControl
     */

    public XavcSettings withFramerateControl(XavcFramerateControl framerateControl) {
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
     * @see XavcFramerateConversionAlgorithm
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
     * @see XavcFramerateConversionAlgorithm
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
     * @see XavcFramerateConversionAlgorithm
     */

    public XavcSettings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
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
     * @see XavcFramerateConversionAlgorithm
     */

    public XavcSettings withFramerateConversionAlgorithm(XavcFramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Frame rate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use frame rate conversion, provide the value as a decimal number for Frame rate.
     *        In this example, specify 23.976.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Frame rate. In this example, specify 23.976.
     * 
     * @return When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *         fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *         this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *         for transcode jobs that use frame rate conversion, provide the value as a decimal number for Frame rate.
     *         In this example, specify 23.976.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * frame rate conversion, provide the value as a decimal number for Frame rate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use frame rate conversion, provide the value as a decimal number for Frame rate.
     *        In this example, specify 23.976.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withFramerateDenominator(Integer framerateDenominator) {
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

    public XavcSettings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Specify the XAVC profile for this output. For more information, see the Sony documentation at
     * https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for
     * XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * 
     * @param profile
     *        Specify the XAVC profile for this output. For more information, see the Sony documentation at
     *        https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating
     *        points for XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * @see XavcProfile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * Specify the XAVC profile for this output. For more information, see the Sony documentation at
     * https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for
     * XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * 
     * @return Specify the XAVC profile for this output. For more information, see the Sony documentation at
     *         https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating
     *         points for XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * @see XavcProfile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * Specify the XAVC profile for this output. For more information, see the Sony documentation at
     * https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for
     * XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * 
     * @param profile
     *        Specify the XAVC profile for this output. For more information, see the Sony documentation at
     *        https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating
     *        points for XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcProfile
     */

    public XavcSettings withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * Specify the XAVC profile for this output. For more information, see the Sony documentation at
     * https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating points for
     * XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * 
     * @param profile
     *        Specify the XAVC profile for this output. For more information, see the Sony documentation at
     *        https://www.xavc-info.org/. Note that MediaConvert doesn't support the interlaced video XAVC operating
     *        points for XAVC_HD_INTRA_CBG. To create an interlaced XAVC output, choose the profile XAVC_HD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcProfile
     */

    public XavcSettings withProfile(XavcProfile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Frame rate to 25. In your
     * JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     * (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *        this setting will slightly reduce the duration of your video. Related settings: You must also set Frame
     *        rate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to
     *        25 and (framerateDenominator) to 1.
     * @see XavcSlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Frame rate to 25. In your
     * JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     * (framerateDenominator) to 1.
     * 
     * @return Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *         to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *         this setting will slightly reduce the duration of your video. Related settings: You must also set Frame
     *         rate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator)
     *         to 25 and (framerateDenominator) to 1.
     * @see XavcSlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Frame rate to 25. In your
     * JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     * (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *        this setting will slightly reduce the duration of your video. Related settings: You must also set Frame
     *        rate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to
     *        25 and (framerateDenominator) to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcSlowPal
     */

    public XavcSettings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to
     * create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting
     * will slightly reduce the duration of your video. Related settings: You must also set Frame rate to 25. In your
     * JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and
     * (framerateDenominator) to 1.
     * 
     * @param slowPal
     *        Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL
     *        to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling
     *        this setting will slightly reduce the duration of your video. Related settings: You must also set Frame
     *        rate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to
     *        25 and (framerateDenominator) to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcSlowPal
     */

    public XavcSettings withSlowPal(XavcSlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we
     * recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     * (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies
     * the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the
     * value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value
     * from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     * high-frequency data. The value 128 results in the softest video.
     * 
     * @param softness
     *        Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we
     *        recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     *        (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting
     *        specifies the quantization matrices that the encoder uses. Keep the default value, 0, for flat
     *        quantization. Choose the value 1 or 16 to use the default JVT softening quantization matricies from the
     *        H.264 specification. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17
     *        to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     */

    public void setSoftness(Integer softness) {
        this.softness = softness;
    }

    /**
     * Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we
     * recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     * (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies
     * the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the
     * value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value
     * from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     * high-frequency data. The value 128 results in the softest video.
     * 
     * @return Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise,
     *         we recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     *         (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting
     *         specifies the quantization matrices that the encoder uses. Keep the default value, 0, for flat
     *         quantization. Choose the value 1 or 16 to use the default JVT softening quantization matricies from the
     *         H.264 specification. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17
     *         to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     */

    public Integer getSoftness() {
        return this.softness;
    }

    /**
     * Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we
     * recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     * (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies
     * the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the
     * value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value
     * from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of
     * high-frequency data. The value 128 results in the softest video.
     * 
     * @param softness
     *        Ignore this setting unless your downstream workflow requires that you specify it explicitly. Otherwise, we
     *        recommend that you adjust the softness of your output by using a lower value for the setting Sharpness
     *        (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting
     *        specifies the quantization matrices that the encoder uses. Keep the default value, 0, for flat
     *        quantization. Choose the value 1 or 16 to use the default JVT softening quantization matricies from the
     *        H.264 specification. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17
     *        to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withSoftness(Integer softness) {
        setSoftness(softness);
        return this;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on spatial variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual
     * degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex
     * textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this
     * feature will almost always improve your video quality. Note, though, that this feature doesn't take into account
     * where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of
     * the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you
     * enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on
     * your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider
     * variety of textures, set it to High or Higher.
     * 
     * @param spatialAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *        types of quantization for your video content. Include this setting in your JSON job specification only
     *        when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *        value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content
     *        complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     *        distortion with no noticeable visual degradation and uses more bits on areas where any small distortion
     *        will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured
     *        blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
     *        Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If
     *        viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture,
     *        you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization,
     *        set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous
     *        content, such as cartoons and video games, set it to Low. For content with a wider variety of textures,
     *        set it to High or Higher.
     * @see XavcSpatialAdaptiveQuantization
     */

    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on spatial variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual
     * degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex
     * textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this
     * feature will almost always improve your video quality. Note, though, that this feature doesn't take into account
     * where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of
     * the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you
     * enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on
     * your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider
     * variety of textures, set it to High or Higher.
     * 
     * @return The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *         Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *         types of quantization for your video content. Include this setting in your JSON job specification only
     *         when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *         value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content
     *         complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     *         distortion with no noticeable visual degradation and uses more bits on areas where any small distortion
     *         will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured
     *         blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
     *         Note, though, that this feature doesn't take into account where the viewer's attention is likely to be.
     *         If viewers are likely to be focusing their attention on a part of the screen with a lot of complex
     *         texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive
     *         quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content.
     *         For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider
     *         variety of textures, set it to High or Higher.
     * @see XavcSpatialAdaptiveQuantization
     */

    public String getSpatialAdaptiveQuantization() {
        return this.spatialAdaptiveQuantization;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on spatial variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual
     * degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex
     * textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this
     * feature will almost always improve your video quality. Note, though, that this feature doesn't take into account
     * where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of
     * the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you
     * enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on
     * your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider
     * variety of textures, set it to High or Higher.
     * 
     * @param spatialAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *        types of quantization for your video content. Include this setting in your JSON job specification only
     *        when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *        value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content
     *        complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     *        distortion with no noticeable visual degradation and uses more bits on areas where any small distortion
     *        will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured
     *        blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
     *        Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If
     *        viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture,
     *        you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization,
     *        set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous
     *        content, such as cartoons and video games, set it to Low. For content with a wider variety of textures,
     *        set it to High or Higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcSpatialAdaptiveQuantization
     */

    public XavcSettings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        setSpatialAdaptiveQuantization(spatialAdaptiveQuantization);
        return this;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on spatial variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual
     * degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex
     * textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this
     * feature will almost always improve your video quality. Note, though, that this feature doesn't take into account
     * where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of
     * the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you
     * enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on
     * your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider
     * variety of textures, set it to High or Higher.
     * 
     * @param spatialAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *        types of quantization for your video content. Include this setting in your JSON job specification only
     *        when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *        value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content
     *        complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
     *        distortion with no noticeable visual degradation and uses more bits on areas where any small distortion
     *        will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured
     *        blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
     *        Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If
     *        viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture,
     *        you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization,
     *        set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous
     *        content, such as cartoons and video games, set it to Low. For content with a wider variety of textures,
     *        set it to High or Higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcSpatialAdaptiveQuantization
     */

    public XavcSettings withSpatialAdaptiveQuantization(XavcSpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
        return this;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on temporal variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex
     * objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on
     * newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality.
     * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers
     * are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp
     * edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     * temporal adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization
     * (adaptiveQuantization).
     * 
     * @param temporalAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *        types of quantization for your video content. Include this setting in your JSON job specification only
     *        when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *        value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content
     *        complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't
     *        moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     *        improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this
     *        feature will almost always improve your video quality. Note, though, that this feature doesn't take into
     *        account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention
     *        on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces,
     *        you might choose to disable this feature. Related setting: When you enable temporal adaptive quantization,
     *        adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
     * @see XavcTemporalAdaptiveQuantization
     */

    public void setTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on temporal variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex
     * objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on
     * newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality.
     * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers
     * are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp
     * edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     * temporal adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization
     * (adaptiveQuantization).
     * 
     * @return The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *         Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *         types of quantization for your video content. Include this setting in your JSON job specification only
     *         when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *         value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content
     *         complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't
     *         moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     *         improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this
     *         feature will almost always improve your video quality. Note, though, that this feature doesn't take into
     *         account where the viewer's attention is likely to be. If viewers are likely to be focusing their
     *         attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports
     *         athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal
     *         adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization
     *         (adaptiveQuantization).
     * @see XavcTemporalAdaptiveQuantization
     */

    public String getTemporalAdaptiveQuantization() {
        return this.temporalAdaptiveQuantization;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on temporal variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex
     * objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on
     * newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality.
     * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers
     * are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp
     * edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     * temporal adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization
     * (adaptiveQuantization).
     * 
     * @param temporalAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *        types of quantization for your video content. Include this setting in your JSON job specification only
     *        when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *        value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content
     *        complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't
     *        moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     *        improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this
     *        feature will almost always improve your video quality. Note, though, that this feature doesn't take into
     *        account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention
     *        on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces,
     *        you might choose to disable this feature. Related setting: When you enable temporal adaptive quantization,
     *        adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcTemporalAdaptiveQuantization
     */

    public XavcSettings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        setTemporalAdaptiveQuantization(temporalAdaptiveQuantization);
        return this;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED),
     * to adjust quantization within each frame based on temporal variation of content complexity. When you enable this
     * feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex
     * objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on
     * newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality.
     * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers
     * are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp
     * edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable
     * temporal adaptive quantization, adjust the strength of the filter with the setting Adaptive quantization
     * (adaptiveQuantization).
     * 
     * @param temporalAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best
     *        types of quantization for your video content. Include this setting in your JSON job specification only
     *        when you choose to change the default value for Adaptive quantization. For this setting, keep the default
     *        value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content
     *        complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't
     *        moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature
     *        improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this
     *        feature will almost always improve your video quality. Note, though, that this feature doesn't take into
     *        account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention
     *        on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces,
     *        you might choose to disable this feature. Related setting: When you enable temporal adaptive quantization,
     *        adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcTemporalAdaptiveQuantization
     */

    public XavcSettings withTemporalAdaptiveQuantization(XavcTemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
        return this;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_CBG.
     * 
     * @param xavc4kIntraCbgProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_4K_INTRA_CBG.
     */

    public void setXavc4kIntraCbgProfileSettings(Xavc4kIntraCbgProfileSettings xavc4kIntraCbgProfileSettings) {
        this.xavc4kIntraCbgProfileSettings = xavc4kIntraCbgProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_CBG.
     * 
     * @return Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *         XAVC_4K_INTRA_CBG.
     */

    public Xavc4kIntraCbgProfileSettings getXavc4kIntraCbgProfileSettings() {
        return this.xavc4kIntraCbgProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_CBG.
     * 
     * @param xavc4kIntraCbgProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_4K_INTRA_CBG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withXavc4kIntraCbgProfileSettings(Xavc4kIntraCbgProfileSettings xavc4kIntraCbgProfileSettings) {
        setXavc4kIntraCbgProfileSettings(xavc4kIntraCbgProfileSettings);
        return this;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_VBR.
     * 
     * @param xavc4kIntraVbrProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_4K_INTRA_VBR.
     */

    public void setXavc4kIntraVbrProfileSettings(Xavc4kIntraVbrProfileSettings xavc4kIntraVbrProfileSettings) {
        this.xavc4kIntraVbrProfileSettings = xavc4kIntraVbrProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_VBR.
     * 
     * @return Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *         XAVC_4K_INTRA_VBR.
     */

    public Xavc4kIntraVbrProfileSettings getXavc4kIntraVbrProfileSettings() {
        return this.xavc4kIntraVbrProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_4K_INTRA_VBR.
     * 
     * @param xavc4kIntraVbrProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_4K_INTRA_VBR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withXavc4kIntraVbrProfileSettings(Xavc4kIntraVbrProfileSettings xavc4kIntraVbrProfileSettings) {
        setXavc4kIntraVbrProfileSettings(xavc4kIntraVbrProfileSettings);
        return this;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K.
     * 
     * @param xavc4kProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_4K.
     */

    public void setXavc4kProfileSettings(Xavc4kProfileSettings xavc4kProfileSettings) {
        this.xavc4kProfileSettings = xavc4kProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K.
     * 
     * @return Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *         XAVC_4K.
     */

    public Xavc4kProfileSettings getXavc4kProfileSettings() {
        return this.xavc4kProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K.
     * 
     * @param xavc4kProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_4K.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withXavc4kProfileSettings(Xavc4kProfileSettings xavc4kProfileSettings) {
        setXavc4kProfileSettings(xavc4kProfileSettings);
        return this;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_HD_INTRA_CBG.
     * 
     * @param xavcHdIntraCbgProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_HD_INTRA_CBG.
     */

    public void setXavcHdIntraCbgProfileSettings(XavcHdIntraCbgProfileSettings xavcHdIntraCbgProfileSettings) {
        this.xavcHdIntraCbgProfileSettings = xavcHdIntraCbgProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_HD_INTRA_CBG.
     * 
     * @return Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *         XAVC_HD_INTRA_CBG.
     */

    public XavcHdIntraCbgProfileSettings getXavcHdIntraCbgProfileSettings() {
        return this.xavcHdIntraCbgProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     * XAVC_HD_INTRA_CBG.
     * 
     * @param xavcHdIntraCbgProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_HD_INTRA_CBG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withXavcHdIntraCbgProfileSettings(XavcHdIntraCbgProfileSettings xavcHdIntraCbgProfileSettings) {
        setXavcHdIntraCbgProfileSettings(xavcHdIntraCbgProfileSettings);
        return this;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
     * 
     * @param xavcHdProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_HD.
     */

    public void setXavcHdProfileSettings(XavcHdProfileSettings xavcHdProfileSettings) {
        this.xavcHdProfileSettings = xavcHdProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
     * 
     * @return Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *         XAVC_HD.
     */

    public XavcHdProfileSettings getXavcHdProfileSettings() {
        return this.xavcHdProfileSettings;
    }

    /**
     * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
     * 
     * @param xavcHdProfileSettings
     *        Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
     *        XAVC_HD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XavcSettings withXavcHdProfileSettings(XavcHdProfileSettings xavcHdProfileSettings) {
        setXavcHdProfileSettings(xavcHdProfileSettings);
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
        if (getAdaptiveQuantization() != null)
            sb.append("AdaptiveQuantization: ").append(getAdaptiveQuantization()).append(",");
        if (getEntropyEncoding() != null)
            sb.append("EntropyEncoding: ").append(getEntropyEncoding()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile()).append(",");
        if (getSlowPal() != null)
            sb.append("SlowPal: ").append(getSlowPal()).append(",");
        if (getSoftness() != null)
            sb.append("Softness: ").append(getSoftness()).append(",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: ").append(getSpatialAdaptiveQuantization()).append(",");
        if (getTemporalAdaptiveQuantization() != null)
            sb.append("TemporalAdaptiveQuantization: ").append(getTemporalAdaptiveQuantization()).append(",");
        if (getXavc4kIntraCbgProfileSettings() != null)
            sb.append("Xavc4kIntraCbgProfileSettings: ").append(getXavc4kIntraCbgProfileSettings()).append(",");
        if (getXavc4kIntraVbrProfileSettings() != null)
            sb.append("Xavc4kIntraVbrProfileSettings: ").append(getXavc4kIntraVbrProfileSettings()).append(",");
        if (getXavc4kProfileSettings() != null)
            sb.append("Xavc4kProfileSettings: ").append(getXavc4kProfileSettings()).append(",");
        if (getXavcHdIntraCbgProfileSettings() != null)
            sb.append("XavcHdIntraCbgProfileSettings: ").append(getXavcHdIntraCbgProfileSettings()).append(",");
        if (getXavcHdProfileSettings() != null)
            sb.append("XavcHdProfileSettings: ").append(getXavcHdProfileSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XavcSettings == false)
            return false;
        XavcSettings other = (XavcSettings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getEntropyEncoding() == null ^ this.getEntropyEncoding() == null)
            return false;
        if (other.getEntropyEncoding() != null && other.getEntropyEncoding().equals(this.getEntropyEncoding()) == false)
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
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getSoftness() == null ^ this.getSoftness() == null)
            return false;
        if (other.getSoftness() != null && other.getSoftness().equals(this.getSoftness()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null && other.getSpatialAdaptiveQuantization().equals(this.getSpatialAdaptiveQuantization()) == false)
            return false;
        if (other.getTemporalAdaptiveQuantization() == null ^ this.getTemporalAdaptiveQuantization() == null)
            return false;
        if (other.getTemporalAdaptiveQuantization() != null && other.getTemporalAdaptiveQuantization().equals(this.getTemporalAdaptiveQuantization()) == false)
            return false;
        if (other.getXavc4kIntraCbgProfileSettings() == null ^ this.getXavc4kIntraCbgProfileSettings() == null)
            return false;
        if (other.getXavc4kIntraCbgProfileSettings() != null
                && other.getXavc4kIntraCbgProfileSettings().equals(this.getXavc4kIntraCbgProfileSettings()) == false)
            return false;
        if (other.getXavc4kIntraVbrProfileSettings() == null ^ this.getXavc4kIntraVbrProfileSettings() == null)
            return false;
        if (other.getXavc4kIntraVbrProfileSettings() != null
                && other.getXavc4kIntraVbrProfileSettings().equals(this.getXavc4kIntraVbrProfileSettings()) == false)
            return false;
        if (other.getXavc4kProfileSettings() == null ^ this.getXavc4kProfileSettings() == null)
            return false;
        if (other.getXavc4kProfileSettings() != null && other.getXavc4kProfileSettings().equals(this.getXavc4kProfileSettings()) == false)
            return false;
        if (other.getXavcHdIntraCbgProfileSettings() == null ^ this.getXavcHdIntraCbgProfileSettings() == null)
            return false;
        if (other.getXavcHdIntraCbgProfileSettings() != null
                && other.getXavcHdIntraCbgProfileSettings().equals(this.getXavcHdIntraCbgProfileSettings()) == false)
            return false;
        if (other.getXavcHdProfileSettings() == null ^ this.getXavcHdProfileSettings() == null)
            return false;
        if (other.getXavcHdProfileSettings() != null && other.getXavcHdProfileSettings().equals(this.getXavcHdProfileSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getEntropyEncoding() == null) ? 0 : getEntropyEncoding().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime * hashCode + ((getSpatialAdaptiveQuantization() == null) ? 0 : getSpatialAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getTemporalAdaptiveQuantization() == null) ? 0 : getTemporalAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getXavc4kIntraCbgProfileSettings() == null) ? 0 : getXavc4kIntraCbgProfileSettings().hashCode());
        hashCode = prime * hashCode + ((getXavc4kIntraVbrProfileSettings() == null) ? 0 : getXavc4kIntraVbrProfileSettings().hashCode());
        hashCode = prime * hashCode + ((getXavc4kProfileSettings() == null) ? 0 : getXavc4kProfileSettings().hashCode());
        hashCode = prime * hashCode + ((getXavcHdIntraCbgProfileSettings() == null) ? 0 : getXavcHdIntraCbgProfileSettings().hashCode());
        hashCode = prime * hashCode + ((getXavcHdProfileSettings() == null) ? 0 : getXavcHdProfileSettings().hashCode());
        return hashCode;
    }

    @Override
    public XavcSettings clone() {
        try {
            return (XavcSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.XavcSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
