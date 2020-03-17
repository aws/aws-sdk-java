/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Av1Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Av1Settings implements Serializable, Cloneable, StructuredPojo {

    /** Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality. */
    private String adaptiveQuantization;
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
    /** When set to INTERPOLATE, produces smoother motion during frame rate conversion. */
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
     * Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in
     * seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where x is
     * an integer value.
     */
    private Double gopSize;
    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     * control mode is QVBR.
     */
    private Integer maxBitrate;
    /** Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15. */
    private Integer numberBFramesBetweenReferenceFrames;
    /**
     * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     */
    private Av1QvbrSettings qvbrSettings;
    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You
     * can''t use CBR or VBR.'
     */
    private String rateControlMode;
    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive pictures,
     * this value must be less than or equal to the number of macroblock rows. For interlaced pictures, this value must
     * be less than or equal to half the number of macroblock rows.
     */
    private Integer slices;
    /** Adjust quantization within each frame based on spatial variation of content complexity. */
    private String spatialAdaptiveQuantization;

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @see Av1AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @return Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @see Av1AdaptiveQuantization
     */

    public String getAdaptiveQuantization() {
        return this.adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1AdaptiveQuantization
     */

    public Av1Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1AdaptiveQuantization
     */

    public Av1Settings withAdaptiveQuantization(Av1AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
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
     * @see Av1FramerateControl
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
     * @see Av1FramerateControl
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
     * @see Av1FramerateControl
     */

    public Av1Settings withFramerateControl(String framerateControl) {
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
     * @see Av1FramerateControl
     */

    public Av1Settings withFramerateControl(Av1FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @param framerateConversionAlgorithm
     *        When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @see Av1FramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @return When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @see Av1FramerateConversionAlgorithm
     */

    public String getFramerateConversionAlgorithm() {
        return this.framerateConversionAlgorithm;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @param framerateConversionAlgorithm
     *        When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1FramerateConversionAlgorithm
     */

    public Av1Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @param framerateConversionAlgorithm
     *        When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1FramerateConversionAlgorithm
     */

    public Av1Settings withFramerateConversionAlgorithm(Av1FramerateConversionAlgorithm framerateConversionAlgorithm) {
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

    public Av1Settings withFramerateDenominator(Integer framerateDenominator) {
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

    public Av1Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in
     * seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where x is
     * an integer value.
     * 
     * @param gopSize
     *        Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in
     *        seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where
     *        x is an integer value.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in
     * seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where x is
     * an integer value.
     * 
     * @return Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length
     *         in seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x),
     *         where x is an integer value.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in
     * seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where x is
     * an integer value.
     * 
     * @param gopSize
     *        Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in
     *        seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where
     *        x is an integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     * control mode is QVBR.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     *        control mode is QVBR.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     * control mode is QVBR.
     * 
     * @return Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when
     *         Rate control mode is QVBR.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     * control mode is QVBR.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     *        control mode is QVBR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1Settings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
     */

    public void setNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
    }

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
     * 
     * @return Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
     */

    public Integer getNumberBFramesBetweenReferenceFrames() {
        return this.numberBFramesBetweenReferenceFrames;
    }

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1Settings withNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        setNumberBFramesBetweenReferenceFrames(numberBFramesBetweenReferenceFrames);
        return this;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     * 
     * @param qvbrSettings
     *        Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate
     *        control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you
     *        don't define Rate control mode.
     */

    public void setQvbrSettings(Av1QvbrSettings qvbrSettings) {
        this.qvbrSettings = qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     * 
     * @return Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate
     *         control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you
     *         don't define Rate control mode.
     */

    public Av1QvbrSettings getQvbrSettings() {
        return this.qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     * 
     * @param qvbrSettings
     *        Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate
     *        control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you
     *        don't define Rate control mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1Settings withQvbrSettings(Av1QvbrSettings qvbrSettings) {
        setQvbrSettings(qvbrSettings);
        return this;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You
     * can''t use CBR or VBR.'
     * 
     * @param rateControlMode
     *        'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate
     *        (QVBR). You can''t use CBR or VBR.'
     * @see Av1RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You
     * can''t use CBR or VBR.'
     * 
     * @return 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate
     *         (QVBR). You can''t use CBR or VBR.'
     * @see Av1RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You
     * can''t use CBR or VBR.'
     * 
     * @param rateControlMode
     *        'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate
     *        (QVBR). You can''t use CBR or VBR.'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1RateControlMode
     */

    public Av1Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You
     * can''t use CBR or VBR.'
     * 
     * @param rateControlMode
     *        'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate
     *        (QVBR). You can''t use CBR or VBR.'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1RateControlMode
     */

    public Av1Settings withRateControlMode(Av1RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive pictures,
     * this value must be less than or equal to the number of macroblock rows. For interlaced pictures, this value must
     * be less than or equal to half the number of macroblock rows.
     * 
     * @param slices
     *        Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive
     *        pictures, this value must be less than or equal to the number of macroblock rows. For interlaced pictures,
     *        this value must be less than or equal to half the number of macroblock rows.
     */

    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive pictures,
     * this value must be less than or equal to the number of macroblock rows. For interlaced pictures, this value must
     * be less than or equal to half the number of macroblock rows.
     * 
     * @return Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive
     *         pictures, this value must be less than or equal to the number of macroblock rows. For interlaced
     *         pictures, this value must be less than or equal to half the number of macroblock rows.
     */

    public Integer getSlices() {
        return this.slices;
    }

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive pictures,
     * this value must be less than or equal to the number of macroblock rows. For interlaced pictures, this value must
     * be less than or equal to half the number of macroblock rows.
     * 
     * @param slices
     *        Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive
     *        pictures, this value must be less than or equal to the number of macroblock rows. For interlaced pictures,
     *        this value must be less than or equal to half the number of macroblock rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Av1Settings withSlices(Integer slices) {
        setSlices(slices);
        return this;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAdaptiveQuantization
     *        Adjust quantization within each frame based on spatial variation of content complexity.
     * @see Av1SpatialAdaptiveQuantization
     */

    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @return Adjust quantization within each frame based on spatial variation of content complexity.
     * @see Av1SpatialAdaptiveQuantization
     */

    public String getSpatialAdaptiveQuantization() {
        return this.spatialAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAdaptiveQuantization
     *        Adjust quantization within each frame based on spatial variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1SpatialAdaptiveQuantization
     */

    public Av1Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        setSpatialAdaptiveQuantization(spatialAdaptiveQuantization);
        return this;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAdaptiveQuantization
     *        Adjust quantization within each frame based on spatial variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Av1SpatialAdaptiveQuantization
     */

    public Av1Settings withSpatialAdaptiveQuantization(Av1SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
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
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopSize() != null)
            sb.append("GopSize: ").append(getGopSize()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: ").append(getNumberBFramesBetweenReferenceFrames()).append(",");
        if (getQvbrSettings() != null)
            sb.append("QvbrSettings: ").append(getQvbrSettings()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getSlices() != null)
            sb.append("Slices: ").append(getSlices()).append(",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: ").append(getSpatialAdaptiveQuantization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Av1Settings == false)
            return false;
        Av1Settings other = (Av1Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
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
        if (other.getGopSize() == null ^ this.getGopSize() == null)
            return false;
        if (other.getGopSize() != null && other.getGopSize().equals(this.getGopSize()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() == null ^ this.getNumberBFramesBetweenReferenceFrames() == null)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() != null
                && other.getNumberBFramesBetweenReferenceFrames().equals(this.getNumberBFramesBetweenReferenceFrames()) == false)
            return false;
        if (other.getQvbrSettings() == null ^ this.getQvbrSettings() == null)
            return false;
        if (other.getQvbrSettings() != null && other.getQvbrSettings().equals(this.getQvbrSettings()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null && other.getSpatialAdaptiveQuantization().equals(this.getSpatialAdaptiveQuantization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0 : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getQvbrSettings() == null) ? 0 : getQvbrSettings().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getSpatialAdaptiveQuantization() == null) ? 0 : getSpatialAdaptiveQuantization().hashCode());
        return hashCode;
    }

    @Override
    public Av1Settings clone() {
        try {
            return (Av1Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Av1SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
