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
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ProresSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProresSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4
     * chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma
     * sampling. You must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling.
     * Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose
     * an output codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4
     * chroma sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you
     * set Chroma sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file
     * marker (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     * conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     * (DUPLICATE_DROP).
     */
    private String chromaSampling;
    /** Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output. */
    private String codecProfile;
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
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     */
    private String parControl;
    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     */
    private Integer parDenominator;
    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     */
    private Integer parNumerator;
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
     * This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4
     * chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma
     * sampling. You must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling.
     * Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose
     * an output codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4
     * chroma sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you
     * set Chroma sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file
     * marker (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     * conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     * (DUPLICATE_DROP).
     * 
     * @param chromaSampling
     *        This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use
     *        4:4:4 chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use
     *        4:4:4 chroma sampling. You must specify a value for this setting when your output codec profile supports
     *        4:4:4 chroma sampling. Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling
     *        (PRESERVE_444_SAMPLING), you must choose an output codec profile that supports 4:4:4 chroma sampling.
     *        These values for Profile (CodecProfile) support 4:4:4 chroma sampling: Apple ProRes 4444
     *        (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you set Chroma sampling to
     *        Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file marker
     *        (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     *        conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     *        (DUPLICATE_DROP).
     * @see ProresChromaSampling
     */

    public void setChromaSampling(String chromaSampling) {
        this.chromaSampling = chromaSampling;
    }

    /**
     * This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4
     * chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma
     * sampling. You must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling.
     * Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose
     * an output codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4
     * chroma sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you
     * set Chroma sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file
     * marker (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     * conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     * (DUPLICATE_DROP).
     * 
     * @return This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use
     *         4:4:4 chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use
     *         4:4:4 chroma sampling. You must specify a value for this setting when your output codec profile supports
     *         4:4:4 chroma sampling. Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling
     *         (PRESERVE_444_SAMPLING), you must choose an output codec profile that supports 4:4:4 chroma sampling.
     *         These values for Profile (CodecProfile) support 4:4:4 chroma sampling: Apple ProRes 4444
     *         (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you set Chroma sampling to
     *         Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file marker
     *         (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     *         conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     *         (DUPLICATE_DROP).
     * @see ProresChromaSampling
     */

    public String getChromaSampling() {
        return this.chromaSampling;
    }

    /**
     * This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4
     * chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma
     * sampling. You must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling.
     * Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose
     * an output codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4
     * chroma sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you
     * set Chroma sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file
     * marker (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     * conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     * (DUPLICATE_DROP).
     * 
     * @param chromaSampling
     *        This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use
     *        4:4:4 chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use
     *        4:4:4 chroma sampling. You must specify a value for this setting when your output codec profile supports
     *        4:4:4 chroma sampling. Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling
     *        (PRESERVE_444_SAMPLING), you must choose an output codec profile that supports 4:4:4 chroma sampling.
     *        These values for Profile (CodecProfile) support 4:4:4 chroma sampling: Apple ProRes 4444
     *        (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you set Chroma sampling to
     *        Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file marker
     *        (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     *        conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     *        (DUPLICATE_DROP).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProresChromaSampling
     */

    public ProresSettings withChromaSampling(String chromaSampling) {
        setChromaSampling(chromaSampling);
        return this;
    }

    /**
     * This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4
     * chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma
     * sampling. You must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling.
     * Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose
     * an output codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4
     * chroma sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you
     * set Chroma sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file
     * marker (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     * conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     * (DUPLICATE_DROP).
     * 
     * @param chromaSampling
     *        This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use
     *        4:4:4 chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use
     *        4:4:4 chroma sampling. You must specify a value for this setting when your output codec profile supports
     *        4:4:4 chroma sampling. Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling
     *        (PRESERVE_444_SAMPLING), you must choose an output codec profile that supports 4:4:4 chroma sampling.
     *        These values for Profile (CodecProfile) support 4:4:4 chroma sampling: Apple ProRes 4444
     *        (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you set Chroma sampling to
     *        Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file marker
     *        (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate
     *        conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate
     *        (DUPLICATE_DROP).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProresChromaSampling
     */

    public ProresSettings withChromaSampling(ProresChromaSampling chromaSampling) {
        this.chromaSampling = chromaSampling.toString();
        return this;
    }

    /**
     * Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * 
     * @param codecProfile
     *        Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * @see ProresCodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * 
     * @return Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * @see ProresCodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * 
     * @param codecProfile
     *        Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProresCodecProfile
     */

    public ProresSettings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * 
     * @param codecProfile
     *        Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProresCodecProfile
     */

    public ProresSettings withCodecProfile(ProresCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
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
     * @see ProresFramerateControl
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
     * @see ProresFramerateControl
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
     * @see ProresFramerateControl
     */

    public ProresSettings withFramerateControl(String framerateControl) {
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
     * @see ProresFramerateControl
     */

    public ProresSettings withFramerateControl(ProresFramerateControl framerateControl) {
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
     * @see ProresFramerateConversionAlgorithm
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
     * @see ProresFramerateConversionAlgorithm
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
     * @see ProresFramerateConversionAlgorithm
     */

    public ProresSettings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
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
     * @see ProresFramerateConversionAlgorithm
     */

    public ProresSettings withFramerateConversionAlgorithm(ProresFramerateConversionAlgorithm framerateConversionAlgorithm) {
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

    public ProresSettings withFramerateDenominator(Integer framerateDenominator) {
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

    public ProresSettings withFramerateNumerator(Integer framerateNumerator) {
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
     * @see ProresInterlaceMode
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
     * @see ProresInterlaceMode
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
     * @see ProresInterlaceMode
     */

    public ProresSettings withInterlaceMode(String interlaceMode) {
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
     * @see ProresInterlaceMode
     */

    public ProresSettings withInterlaceMode(ProresInterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @param parControl
     *        Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *        behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *        specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *        PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *        you must also specify values for the parNumerator and parDenominator settings.
     * @see ProresParControl
     */

    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @return Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *         behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *         specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *         PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *         you must also specify values for the parNumerator and parDenominator settings.
     * @see ProresParControl
     */

    public String getParControl() {
        return this.parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @param parControl
     *        Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *        behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *        specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *        PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *        you must also specify values for the parNumerator and parDenominator settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProresParControl
     */

    public ProresSettings withParControl(String parControl) {
        setParControl(parControl);
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior,
     * Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a
     * different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the
     * JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values
     * for the parNumerator and parDenominator settings.
     * 
     * @param parControl
     *        Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default
     *        behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To
     *        specify a different PAR in the console, choose any value other than Follow source. To specify a different
     *        PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting,
     *        you must also specify values for the parNumerator and parDenominator settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProresParControl
     */

    public ProresSettings withParControl(ProresParControl parControl) {
        this.parControl = parControl.toString();
        return this;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     * 
     * @param parDenominator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parDenominator is 33.
     */

    public void setParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     * 
     * @return Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *         any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *         from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen,
     *         you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
     */

    public Integer getParDenominator() {
        return this.parDenominator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parDenominator is 33.
     * 
     * @param parDenominator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parDenominator is 33.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProresSettings withParDenominator(Integer parDenominator) {
        setParDenominator(parDenominator);
        return this;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     * 
     * @param parNumerator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parNumerator is 40.
     */

    public void setParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     * 
     * @return Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *         any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *         from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen,
     *         you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
     */

    public Integer getParNumerator() {
        return this.parNumerator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value
     * other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input
     * video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio
     * 40:33. In this example, the value for parNumerator is 40.
     * 
     * @param parNumerator
     *        Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to
     *        any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different
     *        from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you
     *        would specify the ratio 40:33. In this example, the value for parNumerator is 40.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProresSettings withParNumerator(Integer parNumerator) {
        setParNumerator(parNumerator);
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
     * @see ProresScanTypeConversionMode
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
     * @see ProresScanTypeConversionMode
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
     * @see ProresScanTypeConversionMode
     */

    public ProresSettings withScanTypeConversionMode(String scanTypeConversionMode) {
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
     * @see ProresScanTypeConversionMode
     */

    public ProresSettings withScanTypeConversionMode(ProresScanTypeConversionMode scanTypeConversionMode) {
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
     * @see ProresSlowPal
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
     * @see ProresSlowPal
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
     * @see ProresSlowPal
     */

    public ProresSettings withSlowPal(String slowPal) {
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
     * @see ProresSlowPal
     */

    public ProresSettings withSlowPal(ProresSlowPal slowPal) {
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
     * @see ProresTelecine
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
     * @see ProresTelecine
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
     * @see ProresTelecine
     */

    public ProresSettings withTelecine(String telecine) {
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
     * @see ProresTelecine
     */

    public ProresSettings withTelecine(ProresTelecine telecine) {
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
        if (getChromaSampling() != null)
            sb.append("ChromaSampling: ").append(getChromaSampling()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
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
        if (getParControl() != null)
            sb.append("ParControl: ").append(getParControl()).append(",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: ").append(getParDenominator()).append(",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: ").append(getParNumerator()).append(",");
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

        if (obj instanceof ProresSettings == false)
            return false;
        ProresSettings other = (ProresSettings) obj;
        if (other.getChromaSampling() == null ^ this.getChromaSampling() == null)
            return false;
        if (other.getChromaSampling() != null && other.getChromaSampling().equals(this.getChromaSampling()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
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
        if (other.getParControl() == null ^ this.getParControl() == null)
            return false;
        if (other.getParControl() != null && other.getParControl().equals(this.getParControl()) == false)
            return false;
        if (other.getParDenominator() == null ^ this.getParDenominator() == null)
            return false;
        if (other.getParDenominator() != null && other.getParDenominator().equals(this.getParDenominator()) == false)
            return false;
        if (other.getParNumerator() == null ^ this.getParNumerator() == null)
            return false;
        if (other.getParNumerator() != null && other.getParNumerator().equals(this.getParNumerator()) == false)
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

        hashCode = prime * hashCode + ((getChromaSampling() == null) ? 0 : getChromaSampling().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getScanTypeConversionMode() == null) ? 0 : getScanTypeConversionMode().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        return hashCode;
    }

    @Override
    public ProresSettings clone() {
        try {
            return (ProresSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ProresSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
