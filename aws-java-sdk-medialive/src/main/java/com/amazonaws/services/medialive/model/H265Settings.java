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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * H265 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/H265Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H265Settings implements Serializable, Cloneable, StructuredPojo {

    /** Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality. */
    private String adaptiveQuantization;
    /**
     * Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system will try
     * to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value
     * will be the value configured in the fixedAfd parameter.
     */
    private String afdSignaling;
    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility
     * with non-HDR decoders and displays.
     */
    private String alternativeTransferFunction;
    /**
     * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS
     * Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     */
    private Integer bitrate;
    /** Size of buffer (HRD buffer model) in bits. */
    private Integer bufSize;
    /** Includes colorspace metadata in the output. */
    private String colorMetadata;
    /** Color Space settings */
    private H265ColorSpaceSettings colorSpaceSettings;
    /**
     * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to
     * 'Fixed'.
     */
    private String fixedAfd;
    /** If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames. */
    private String flickerAq;
    /** Framerate denominator. */
    private Integer framerateDenominator;
    /** Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps. */
    private Integer framerateNumerator;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is frames,
     * gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize must be
     * greater than 0, but need not be an integer.
     */
    private Double gopSize;
    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a
     * frame count at run time.
     */
    private String gopSizeUnits;
    /** H.265 Level. */
    private String level;
    /**
     * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality
     * for certain content.
     */
    private String lookAheadRateControl;
    /** For QVBR: See the tooltip for Quality level */
    private Integer maxBitrate;
    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used. Enforces
     * separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change
     * I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change
     * I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the
     * next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */
    private Integer minIInterval;
    /** Pixel Aspect Ratio denominator. */
    private Integer parDenominator;
    /** Pixel Aspect Ratio numerator. */
    private Integer parNumerator;
    /** H.265 Profile. */
    private String profile;
    /**
     * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for
     * the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended
     * values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet: Quality level: 7. Max
     * bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     */
    private Integer qvbrQualityLevel;
    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     */
    private String rateControlMode;
    /** Sets the scan type of the output to progressive or top-field-first interlaced. */
    private String scanType;
    /** Scene change detection. */
    private String sceneChangeDetect;
    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
     */
    private Integer slices;
    /** H.265 Tier. */
    private String tier;
    /**
     * Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     * timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
     */
    private String timecodeInsertion;

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @see H265AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @return Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @see H265AdaptiveQuantization
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
     * @see H265AdaptiveQuantization
     */

    public H265Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265AdaptiveQuantization
     */

    public H265Settings withAdaptiveQuantization(H265AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system will try
     * to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value
     * will be the value configured in the fixedAfd parameter.
     * 
     * @param afdSignaling
     *        Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system
     *        will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to
     *        "fixed", the AFD value will be the value configured in the fixedAfd parameter.
     * @see AfdSignaling
     */

    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system will try
     * to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value
     * will be the value configured in the fixedAfd parameter.
     * 
     * @return Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system
     *         will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to
     *         "fixed", the AFD value will be the value configured in the fixedAfd parameter.
     * @see AfdSignaling
     */

    public String getAfdSignaling() {
        return this.afdSignaling;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system will try
     * to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value
     * will be the value configured in the fixedAfd parameter.
     * 
     * @param afdSignaling
     *        Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system
     *        will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to
     *        "fixed", the AFD value will be the value configured in the fixedAfd parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AfdSignaling
     */

    public H265Settings withAfdSignaling(String afdSignaling) {
        setAfdSignaling(afdSignaling);
        return this;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system will try
     * to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value
     * will be the value configured in the fixedAfd parameter.
     * 
     * @param afdSignaling
     *        Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system
     *        will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to
     *        "fixed", the AFD value will be the value configured in the fixedAfd parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AfdSignaling
     */

    public H265Settings withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility
     * with non-HDR decoders and displays.
     * 
     * @param alternativeTransferFunction
     *        Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards
     *        compatibility with non-HDR decoders and displays.
     * @see H265AlternativeTransferFunction
     */

    public void setAlternativeTransferFunction(String alternativeTransferFunction) {
        this.alternativeTransferFunction = alternativeTransferFunction;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility
     * with non-HDR decoders and displays.
     * 
     * @return Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards
     *         compatibility with non-HDR decoders and displays.
     * @see H265AlternativeTransferFunction
     */

    public String getAlternativeTransferFunction() {
        return this.alternativeTransferFunction;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility
     * with non-HDR decoders and displays.
     * 
     * @param alternativeTransferFunction
     *        Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards
     *        compatibility with non-HDR decoders and displays.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265AlternativeTransferFunction
     */

    public H265Settings withAlternativeTransferFunction(String alternativeTransferFunction) {
        setAlternativeTransferFunction(alternativeTransferFunction);
        return this;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility
     * with non-HDR decoders and displays.
     * 
     * @param alternativeTransferFunction
     *        Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards
     *        compatibility with non-HDR decoders and displays.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265AlternativeTransferFunction
     */

    public H265Settings withAlternativeTransferFunction(H265AlternativeTransferFunction alternativeTransferFunction) {
        this.alternativeTransferFunction = alternativeTransferFunction.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS
     * Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In
     *        an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the
     *        nearest multiple of 1000.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS
     * Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * 
     * @return Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In
     *         an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the
     *         nearest multiple of 1000.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS
     * Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In
     *        an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the
     *        nearest multiple of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * 
     * @param bufSize
     *        Size of buffer (HRD buffer model) in bits.
     */

    public void setBufSize(Integer bufSize) {
        this.bufSize = bufSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * 
     * @return Size of buffer (HRD buffer model) in bits.
     */

    public Integer getBufSize() {
        return this.bufSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * 
     * @param bufSize
     *        Size of buffer (HRD buffer model) in bits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withBufSize(Integer bufSize) {
        setBufSize(bufSize);
        return this;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @param colorMetadata
     *        Includes colorspace metadata in the output.
     * @see H265ColorMetadata
     */

    public void setColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @return Includes colorspace metadata in the output.
     * @see H265ColorMetadata
     */

    public String getColorMetadata() {
        return this.colorMetadata;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @param colorMetadata
     *        Includes colorspace metadata in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265ColorMetadata
     */

    public H265Settings withColorMetadata(String colorMetadata) {
        setColorMetadata(colorMetadata);
        return this;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @param colorMetadata
     *        Includes colorspace metadata in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265ColorMetadata
     */

    public H265Settings withColorMetadata(H265ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Color Space settings
     * 
     * @param colorSpaceSettings
     *        Color Space settings
     */

    public void setColorSpaceSettings(H265ColorSpaceSettings colorSpaceSettings) {
        this.colorSpaceSettings = colorSpaceSettings;
    }

    /**
     * Color Space settings
     * 
     * @return Color Space settings
     */

    public H265ColorSpaceSettings getColorSpaceSettings() {
        return this.colorSpaceSettings;
    }

    /**
     * Color Space settings
     * 
     * @param colorSpaceSettings
     *        Color Space settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withColorSpaceSettings(H265ColorSpaceSettings colorSpaceSettings) {
        setColorSpaceSettings(colorSpaceSettings);
        return this;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to
     * 'Fixed'.
     * 
     * @param fixedAfd
     *        Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is
     *        set to 'Fixed'.
     * @see FixedAfd
     */

    public void setFixedAfd(String fixedAfd) {
        this.fixedAfd = fixedAfd;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to
     * 'Fixed'.
     * 
     * @return Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is
     *         set to 'Fixed'.
     * @see FixedAfd
     */

    public String getFixedAfd() {
        return this.fixedAfd;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to
     * 'Fixed'.
     * 
     * @param fixedAfd
     *        Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is
     *        set to 'Fixed'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixedAfd
     */

    public H265Settings withFixedAfd(String fixedAfd) {
        setFixedAfd(fixedAfd);
        return this;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to
     * 'Fixed'.
     * 
     * @param fixedAfd
     *        Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is
     *        set to 'Fixed'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixedAfd
     */

    public H265Settings withFixedAfd(FixedAfd fixedAfd) {
        this.fixedAfd = fixedAfd.toString();
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAq
     *        If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @see H265FlickerAq
     */

    public void setFlickerAq(String flickerAq) {
        this.flickerAq = flickerAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @return If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @see H265FlickerAq
     */

    public String getFlickerAq() {
        return this.flickerAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAq
     *        If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FlickerAq
     */

    public H265Settings withFlickerAq(String flickerAq) {
        setFlickerAq(flickerAq);
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAq
     *        If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FlickerAq
     */

    public H265Settings withFlickerAq(H265FlickerAq flickerAq) {
        this.flickerAq = flickerAq.toString();
        return this;
    }

    /**
     * Framerate denominator.
     * 
     * @param framerateDenominator
     *        Framerate denominator.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Framerate denominator.
     * 
     * @return Framerate denominator.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * Framerate denominator.
     * 
     * @param framerateDenominator
     *        Framerate denominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @param framerateNumerator
     *        Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @return Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @param framerateNumerator
     *        Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @param gopClosedCadence
     *        Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *        joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *        output segmenting.
     */

    public void setGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @return Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *         joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *         output segmenting.
     */

    public Integer getGopClosedCadence() {
        return this.gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @param gopClosedCadence
     *        Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *        joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *        output segmenting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is frames,
     * gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize must be
     * greater than 0, but need not be an integer.
     * 
     * @param gopSize
     *        GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is
     *        frames, gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds,
     *        gopSize must be greater than 0, but need not be an integer.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is frames,
     * gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize must be
     * greater than 0, but need not be an integer.
     * 
     * @return GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is
     *         frames, gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds,
     *         gopSize must be greater than 0, but need not be an integer.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is frames,
     * gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize must be
     * greater than 0, but need not be an integer.
     * 
     * @param gopSize
     *        GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. If gopSizeUnits is
     *        frames, gopSize must be an integer and must be greater than or equal to 1. If gopSizeUnits is seconds,
     *        gopSize must be greater than 0, but need not be an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a
     * frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize
     *        into a frame count at run time.
     * @see H265GopSizeUnits
     */

    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a
     * frame count at run time.
     * 
     * @return Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the
     *         gopSize into a frame count at run time.
     * @see H265GopSizeUnits
     */

    public String getGopSizeUnits() {
        return this.gopSizeUnits;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a
     * frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize
     *        into a frame count at run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265GopSizeUnits
     */

    public H265Settings withGopSizeUnits(String gopSizeUnits) {
        setGopSizeUnits(gopSizeUnits);
        return this;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a
     * frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize
     *        into a frame count at run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265GopSizeUnits
     */

    public H265Settings withGopSizeUnits(H265GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * H.265 Level.
     * 
     * @param level
     *        H.265 Level.
     * @see H265Level
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * H.265 Level.
     * 
     * @return H.265 Level.
     * @see H265Level
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * H.265 Level.
     * 
     * @param level
     *        H.265 Level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Level
     */

    public H265Settings withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * H.265 Level.
     * 
     * @param level
     *        H.265 Level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Level
     */

    public H265Settings withLevel(H265Level level) {
        this.level = level.toString();
        return this;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality
     * for certain content.
     * 
     * @param lookAheadRateControl
     *        Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better
     *        quality for certain content.
     * @see H265LookAheadRateControl
     */

    public void setLookAheadRateControl(String lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality
     * for certain content.
     * 
     * @return Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better
     *         quality for certain content.
     * @see H265LookAheadRateControl
     */

    public String getLookAheadRateControl() {
        return this.lookAheadRateControl;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality
     * for certain content.
     * 
     * @param lookAheadRateControl
     *        Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better
     *        quality for certain content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265LookAheadRateControl
     */

    public H265Settings withLookAheadRateControl(String lookAheadRateControl) {
        setLookAheadRateControl(lookAheadRateControl);
        return this;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality
     * for certain content.
     * 
     * @param lookAheadRateControl
     *        Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better
     *        quality for certain content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265LookAheadRateControl
     */

    public H265Settings withLookAheadRateControl(H265LookAheadRateControl lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl.toString();
        return this;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * @param maxBitrate
     *        For QVBR: See the tooltip for Quality level
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * @return For QVBR: See the tooltip for Quality level
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * @param maxBitrate
     *        For QVBR: See the tooltip for Quality level
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used. Enforces
     * separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change
     * I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change
     * I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the
     * next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used.
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size +
     *        Min-I-interval - 1
     */

    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used. Enforces
     * separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change
     * I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change
     * I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the
     * next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * 
     * @return Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used.
     *         Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *         If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *         stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *         I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size +
     *         Min-I-interval - 1
     */

    public Integer getMinIInterval() {
        return this.minIInterval;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used. Enforces
     * separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change
     * I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change
     * I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the
     * next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if multiplex rate control is used.
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size +
     *        Min-I-interval - 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withMinIInterval(Integer minIInterval) {
        setMinIInterval(minIInterval);
        return this;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * 
     * @param parDenominator
     *        Pixel Aspect Ratio denominator.
     */

    public void setParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * 
     * @return Pixel Aspect Ratio denominator.
     */

    public Integer getParDenominator() {
        return this.parDenominator;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * 
     * @param parDenominator
     *        Pixel Aspect Ratio denominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withParDenominator(Integer parDenominator) {
        setParDenominator(parDenominator);
        return this;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * 
     * @param parNumerator
     *        Pixel Aspect Ratio numerator.
     */

    public void setParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * 
     * @return Pixel Aspect Ratio numerator.
     */

    public Integer getParNumerator() {
        return this.parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * 
     * @param parNumerator
     *        Pixel Aspect Ratio numerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withParNumerator(Integer parNumerator) {
        setParNumerator(parNumerator);
        return this;
    }

    /**
     * H.265 Profile.
     * 
     * @param profile
     *        H.265 Profile.
     * @see H265Profile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * H.265 Profile.
     * 
     * @return H.265 Profile.
     * @see H265Profile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * H.265 Profile.
     * 
     * @param profile
     *        H.265 Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Profile
     */

    public H265Settings withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * H.265 Profile.
     * 
     * @param profile
     *        H.265 Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Profile
     */

    public H265Settings withProfile(H265Profile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for
     * the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended
     * values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet: Quality level: 7. Max
     * bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * 
     * @param qvbrQualityLevel
     *        Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set
     *        values for the QVBR quality level field and Max bitrate field that suit your most important viewing
     *        devices. Recommended values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet:
     *        Quality level: 7. Max bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     */

    public void setQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
    }

    /**
     * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for
     * the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended
     * values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet: Quality level: 7. Max
     * bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * 
     * @return Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set
     *         values for the QVBR quality level field and Max bitrate field that suit your most important viewing
     *         devices. Recommended values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or
     *         tablet: Quality level: 7. Max bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     */

    public Integer getQvbrQualityLevel() {
        return this.qvbrQualityLevel;
    }

    /**
     * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for
     * the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended
     * values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet: Quality level: 7. Max
     * bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * 
     * @param qvbrQualityLevel
     *        Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set
     *        values for the QVBR quality level field and Max bitrate field that suit your most important viewing
     *        devices. Recommended values are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet:
     *        Quality level: 7. Max bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withQvbrQualityLevel(Integer qvbrQualityLevel) {
        setQvbrQualityLevel(qvbrQualityLevel);
        return this;
    }

    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     * 
     * @param rateControlMode
     *        Rate control mode.
     * 
     *        QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     *        Recommended if you or your viewers pay for bandwidth.
     * 
     *        CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *        devices that cannot handle variable bitrates.
     * @see H265RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     * 
     * @return Rate control mode.
     * 
     *         QVBR: Quality will match the specified quality level except when it is constrained by the maximum
     *         bitrate. Recommended if you or your viewers pay for bandwidth.
     * 
     *         CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *         devices that cannot handle variable bitrates.
     * @see H265RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     * 
     * @param rateControlMode
     *        Rate control mode.
     * 
     *        QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     *        Recommended if you or your viewers pay for bandwidth.
     * 
     *        CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *        devices that cannot handle variable bitrates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265RateControlMode
     */

    public H265Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     * 
     * @param rateControlMode
     *        Rate control mode.
     * 
     *        QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     *        Recommended if you or your viewers pay for bandwidth.
     * 
     *        CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *        devices that cannot handle variable bitrates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265RateControlMode
     */

    public H265Settings withRateControlMode(H265RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @param scanType
     *        Sets the scan type of the output to progressive or top-field-first interlaced.
     * @see H265ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @return Sets the scan type of the output to progressive or top-field-first interlaced.
     * @see H265ScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @param scanType
     *        Sets the scan type of the output to progressive or top-field-first interlaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265ScanType
     */

    public H265Settings withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @param scanType
     *        Sets the scan type of the output to progressive or top-field-first interlaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265ScanType
     */

    public H265Settings withScanType(H265ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * Scene change detection.
     * 
     * @param sceneChangeDetect
     *        Scene change detection.
     * @see H265SceneChangeDetect
     */

    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Scene change detection.
     * 
     * @return Scene change detection.
     * @see H265SceneChangeDetect
     */

    public String getSceneChangeDetect() {
        return this.sceneChangeDetect;
    }

    /**
     * Scene change detection.
     * 
     * @param sceneChangeDetect
     *        Scene change detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SceneChangeDetect
     */

    public H265Settings withSceneChangeDetect(String sceneChangeDetect) {
        setSceneChangeDetect(sceneChangeDetect);
        return this;
    }

    /**
     * Scene change detection.
     * 
     * @param sceneChangeDetect
     *        Scene change detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SceneChangeDetect
     */

    public H265Settings withSceneChangeDetect(H265SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
     * 
     * @param slices
     *        Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *        pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field
     *        is optional; when no value is specified the encoder will choose the number of slices based on encode
     *        resolution.
     */

    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
     * 
     * @return Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *         pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This
     *         field is optional; when no value is specified the encoder will choose the number of slices based on
     *         encode resolution.
     */

    public Integer getSlices() {
        return this.slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
     * 
     * @param slices
     *        Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *        pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field
     *        is optional; when no value is specified the encoder will choose the number of slices based on encode
     *        resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withSlices(Integer slices) {
        setSlices(slices);
        return this;
    }

    /**
     * H.265 Tier.
     * 
     * @param tier
     *        H.265 Tier.
     * @see H265Tier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * H.265 Tier.
     * 
     * @return H.265 Tier.
     * @see H265Tier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * H.265 Tier.
     * 
     * @param tier
     *        H.265 Tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Tier
     */

    public H265Settings withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * H.265 Tier.
     * 
     * @param tier
     *        H.265 Tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Tier
     */

    public H265Settings withTier(H265Tier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     * timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
     * 
     * @param timecodeInsertion
     *        Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     *        timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode
     *        Config
     * @see H265TimecodeInsertionBehavior
     */

    public void setTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     * timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
     * 
     * @return Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not
     *         include timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in
     *         Timecode Config
     * @see H265TimecodeInsertionBehavior
     */

    public String getTimecodeInsertion() {
        return this.timecodeInsertion;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     * timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
     * 
     * @param timecodeInsertion
     *        Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     *        timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode
     *        Config
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265TimecodeInsertionBehavior
     */

    public H265Settings withTimecodeInsertion(String timecodeInsertion) {
        setTimecodeInsertion(timecodeInsertion);
        return this;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     * timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
     * 
     * @param timecodeInsertion
     *        Determines how timecodes should be inserted into the video elementary stream. - 'disabled': Do not include
     *        timecodes - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode
     *        Config
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265TimecodeInsertionBehavior
     */

    public H265Settings withTimecodeInsertion(H265TimecodeInsertionBehavior timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion.toString();
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
        if (getAfdSignaling() != null)
            sb.append("AfdSignaling: ").append(getAfdSignaling()).append(",");
        if (getAlternativeTransferFunction() != null)
            sb.append("AlternativeTransferFunction: ").append(getAlternativeTransferFunction()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBufSize() != null)
            sb.append("BufSize: ").append(getBufSize()).append(",");
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: ").append(getColorMetadata()).append(",");
        if (getColorSpaceSettings() != null)
            sb.append("ColorSpaceSettings: ").append(getColorSpaceSettings()).append(",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: ").append(getFixedAfd()).append(",");
        if (getFlickerAq() != null)
            sb.append("FlickerAq: ").append(getFlickerAq()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getGopSize() != null)
            sb.append("GopSize: ").append(getGopSize()).append(",");
        if (getGopSizeUnits() != null)
            sb.append("GopSizeUnits: ").append(getGopSizeUnits()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getLookAheadRateControl() != null)
            sb.append("LookAheadRateControl: ").append(getLookAheadRateControl()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: ").append(getMinIInterval()).append(",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: ").append(getParDenominator()).append(",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: ").append(getParNumerator()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile()).append(",");
        if (getQvbrQualityLevel() != null)
            sb.append("QvbrQualityLevel: ").append(getQvbrQualityLevel()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType()).append(",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: ").append(getSceneChangeDetect()).append(",");
        if (getSlices() != null)
            sb.append("Slices: ").append(getSlices()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getTimecodeInsertion() != null)
            sb.append("TimecodeInsertion: ").append(getTimecodeInsertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H265Settings == false)
            return false;
        H265Settings other = (H265Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getAlternativeTransferFunction() == null ^ this.getAlternativeTransferFunction() == null)
            return false;
        if (other.getAlternativeTransferFunction() != null && other.getAlternativeTransferFunction().equals(this.getAlternativeTransferFunction()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBufSize() == null ^ this.getBufSize() == null)
            return false;
        if (other.getBufSize() != null && other.getBufSize().equals(this.getBufSize()) == false)
            return false;
        if (other.getColorMetadata() == null ^ this.getColorMetadata() == null)
            return false;
        if (other.getColorMetadata() != null && other.getColorMetadata().equals(this.getColorMetadata()) == false)
            return false;
        if (other.getColorSpaceSettings() == null ^ this.getColorSpaceSettings() == null)
            return false;
        if (other.getColorSpaceSettings() != null && other.getColorSpaceSettings().equals(this.getColorSpaceSettings()) == false)
            return false;
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
            return false;
        if (other.getFlickerAq() == null ^ this.getFlickerAq() == null)
            return false;
        if (other.getFlickerAq() != null && other.getFlickerAq().equals(this.getFlickerAq()) == false)
            return false;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        if (other.getGopClosedCadence() == null ^ this.getGopClosedCadence() == null)
            return false;
        if (other.getGopClosedCadence() != null && other.getGopClosedCadence().equals(this.getGopClosedCadence()) == false)
            return false;
        if (other.getGopSize() == null ^ this.getGopSize() == null)
            return false;
        if (other.getGopSize() != null && other.getGopSize().equals(this.getGopSize()) == false)
            return false;
        if (other.getGopSizeUnits() == null ^ this.getGopSizeUnits() == null)
            return false;
        if (other.getGopSizeUnits() != null && other.getGopSizeUnits().equals(this.getGopSizeUnits()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getLookAheadRateControl() == null ^ this.getLookAheadRateControl() == null)
            return false;
        if (other.getLookAheadRateControl() != null && other.getLookAheadRateControl().equals(this.getLookAheadRateControl()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getMinIInterval() == null ^ this.getMinIInterval() == null)
            return false;
        if (other.getMinIInterval() != null && other.getMinIInterval().equals(this.getMinIInterval()) == false)
            return false;
        if (other.getParDenominator() == null ^ this.getParDenominator() == null)
            return false;
        if (other.getParDenominator() != null && other.getParDenominator().equals(this.getParDenominator()) == false)
            return false;
        if (other.getParNumerator() == null ^ this.getParNumerator() == null)
            return false;
        if (other.getParNumerator() != null && other.getParNumerator().equals(this.getParNumerator()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getQvbrQualityLevel() == null ^ this.getQvbrQualityLevel() == null)
            return false;
        if (other.getQvbrQualityLevel() != null && other.getQvbrQualityLevel().equals(this.getQvbrQualityLevel()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getTimecodeInsertion() == null ^ this.getTimecodeInsertion() == null)
            return false;
        if (other.getTimecodeInsertion() != null && other.getTimecodeInsertion().equals(this.getTimecodeInsertion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getAfdSignaling() == null) ? 0 : getAfdSignaling().hashCode());
        hashCode = prime * hashCode + ((getAlternativeTransferFunction() == null) ? 0 : getAlternativeTransferFunction().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBufSize() == null) ? 0 : getBufSize().hashCode());
        hashCode = prime * hashCode + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode + ((getColorSpaceSettings() == null) ? 0 : getColorSpaceSettings().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getFlickerAq() == null) ? 0 : getFlickerAq().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getLookAheadRateControl() == null) ? 0 : getLookAheadRateControl().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getQvbrQualityLevel() == null) ? 0 : getQvbrQualityLevel().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getTimecodeInsertion() == null) ? 0 : getTimecodeInsertion().hashCode());
        return hashCode;
    }

    @Override
    public H265Settings clone() {
        try {
            return (H265Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.H265SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
