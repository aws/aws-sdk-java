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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Mpeg2Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mpeg2Settings implements Serializable, Cloneable, StructuredPojo {

    private String adaptiveQuantization;
    /**
     * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     */
    private Integer bitrate;

    private String codecLevel;

    private String codecProfile;
    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     */
    private String dynamicSubGop;

    private String framerateControl;

    private String framerateConversionAlgorithm;
    /** Frame rate denominator. */
    private Integer framerateDenominator;
    /** Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps. */
    private Integer framerateNumerator;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /** GOP Length (keyframe interval) in frames or seconds. Must be greater than zero. */
    private Double gopSize;

    private String gopSizeUnits;
    /** Percentage of the buffer that should initially be filled (HRD buffer model). */
    private Integer hrdBufferInitialFillPercentage;
    /** Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000. */
    private Integer hrdBufferSize;

    private String interlaceMode;

    private String intraDcPrecision;
    /** Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. */
    private Integer maxBitrate;
    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     */
    private Integer minIInterval;
    /** Number of B-frames between reference frames. */
    private Integer numberBFramesBetweenReferenceFrames;

    private String parControl;
    /** Pixel Aspect Ratio denominator. */
    private Integer parDenominator;
    /** Pixel Aspect Ratio numerator. */
    private Integer parNumerator;

    private String qualityTuningLevel;

    private String rateControlMode;

    private String sceneChangeDetect;

    private String slowPal;
    /** Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image. */
    private Integer softness;

    private String spatialAdaptiveQuantization;

    private String syntax;

    private String telecine;

    private String temporalAdaptiveQuantization;

    /**
     * @param adaptiveQuantization
     * @see Mpeg2AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * @return
     * @see Mpeg2AdaptiveQuantization
     */

    public String getAdaptiveQuantization() {
        return this.adaptiveQuantization;
    }

    /**
     * @param adaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2AdaptiveQuantization
     */

    public Mpeg2Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * @param adaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2AdaptiveQuantization
     */

    public Mpeg2Settings withAdaptiveQuantization(Mpeg2AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique
     *        when rounded down to the nearest multiple of 1000.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     * 
     * @return Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique
     *         when rounded down to the nearest multiple of 1000.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique
     *        when rounded down to the nearest multiple of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * @param codecLevel
     * @see Mpeg2CodecLevel
     */

    public void setCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
    }

    /**
     * @return
     * @see Mpeg2CodecLevel
     */

    public String getCodecLevel() {
        return this.codecLevel;
    }

    /**
     * @param codecLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecLevel
     */

    public Mpeg2Settings withCodecLevel(String codecLevel) {
        setCodecLevel(codecLevel);
        return this;
    }

    /**
     * @param codecLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecLevel
     */

    public Mpeg2Settings withCodecLevel(Mpeg2CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
        return this;
    }

    /**
     * @param codecProfile
     * @see Mpeg2CodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * @return
     * @see Mpeg2CodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * @param codecProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecProfile
     */

    public Mpeg2Settings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * @param codecProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2CodecProfile
     */

    public Mpeg2Settings withCodecProfile(Mpeg2CodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @param dynamicSubGop
     *        Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *        to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *        video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *        you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */

    public void setDynamicSubGop(String dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @return Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *         to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *         video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *         you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */

    public String getDynamicSubGop() {
        return this.dynamicSubGop;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @param dynamicSubGop
     *        Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *        to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *        video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *        you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2DynamicSubGop
     */

    public Mpeg2Settings withDynamicSubGop(String dynamicSubGop) {
        setDynamicSubGop(dynamicSubGop);
        return this;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * 
     * @param dynamicSubGop
     *        Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service
     *        to use fewer B-frames (which infer information based on other frames) for high-motion portions of the
     *        video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value
     *        you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2DynamicSubGop
     */

    public Mpeg2Settings withDynamicSubGop(Mpeg2DynamicSubGop dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop.toString();
        return this;
    }

    /**
     * @param framerateControl
     * @see Mpeg2FramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * @return
     * @see Mpeg2FramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * @param framerateControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateControl
     */

    public Mpeg2Settings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * @param framerateControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateControl
     */

    public Mpeg2Settings withFramerateControl(Mpeg2FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * @param framerateConversionAlgorithm
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * @return
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public String getFramerateConversionAlgorithm() {
        return this.framerateConversionAlgorithm;
    }

    /**
     * @param framerateConversionAlgorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public Mpeg2Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * @param framerateConversionAlgorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2FramerateConversionAlgorithm
     */

    public Mpeg2Settings withFramerateConversionAlgorithm(Mpeg2FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * Frame rate denominator.
     * 
     * @param framerateDenominator
     *        Frame rate denominator.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Frame rate denominator.
     * 
     * @return Frame rate denominator.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * Frame rate denominator.
     * 
     * @param framerateDenominator
     *        Frame rate denominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @param framerateNumerator
     *        Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @return Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @param framerateNumerator
     *        Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFramerateNumerator(Integer framerateNumerator) {
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

    public Mpeg2Settings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @return GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * @param gopSizeUnits
     * @see Mpeg2GopSizeUnits
     */

    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * @return
     * @see Mpeg2GopSizeUnits
     */

    public String getGopSizeUnits() {
        return this.gopSizeUnits;
    }

    /**
     * @param gopSizeUnits
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2GopSizeUnits
     */

    public Mpeg2Settings withGopSizeUnits(String gopSizeUnits) {
        setGopSizeUnits(gopSizeUnits);
        return this;
    }

    /**
     * @param gopSizeUnits
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2GopSizeUnits
     */

    public Mpeg2Settings withGopSizeUnits(Mpeg2GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param hrdBufferInitialFillPercentage
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public void setHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        this.hrdBufferInitialFillPercentage = hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @return Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public Integer getHrdBufferInitialFillPercentage() {
        return this.hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param hrdBufferInitialFillPercentage
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        setHrdBufferInitialFillPercentage(hrdBufferInitialFillPercentage);
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * 
     * @param hrdBufferSize
     *        Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     */

    public void setHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * 
     * @return Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     */

    public Integer getHrdBufferSize() {
        return this.hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * 
     * @param hrdBufferSize
     *        Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withHrdBufferSize(Integer hrdBufferSize) {
        setHrdBufferSize(hrdBufferSize);
        return this;
    }

    /**
     * @param interlaceMode
     * @see Mpeg2InterlaceMode
     */

    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * @return
     * @see Mpeg2InterlaceMode
     */

    public String getInterlaceMode() {
        return this.interlaceMode;
    }

    /**
     * @param interlaceMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2InterlaceMode
     */

    public Mpeg2Settings withInterlaceMode(String interlaceMode) {
        setInterlaceMode(interlaceMode);
        return this;
    }

    /**
     * @param interlaceMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2InterlaceMode
     */

    public Mpeg2Settings withInterlaceMode(Mpeg2InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * @param intraDcPrecision
     * @see Mpeg2IntraDcPrecision
     */

    public void setIntraDcPrecision(String intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision;
    }

    /**
     * @return
     * @see Mpeg2IntraDcPrecision
     */

    public String getIntraDcPrecision() {
        return this.intraDcPrecision;
    }

    /**
     * @param intraDcPrecision
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2IntraDcPrecision
     */

    public Mpeg2Settings withIntraDcPrecision(String intraDcPrecision) {
        setIntraDcPrecision(intraDcPrecision);
        return this;
    }

    /**
     * @param intraDcPrecision
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2IntraDcPrecision
     */

    public Mpeg2Settings withIntraDcPrecision(Mpeg2IntraDcPrecision intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision.toString();
        return this;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * 
     * @return Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *        Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @return Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *         If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *         stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *         I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *         Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public Integer getMinIInterval() {
        return this.minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *        Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withMinIInterval(Integer minIInterval) {
        setMinIInterval(minIInterval);
        return this;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Number of B-frames between reference frames.
     */

    public void setNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @return Number of B-frames between reference frames.
     */

    public Integer getNumberBFramesBetweenReferenceFrames() {
        return this.numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Number of B-frames between reference frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        setNumberBFramesBetweenReferenceFrames(numberBFramesBetweenReferenceFrames);
        return this;
    }

    /**
     * @param parControl
     * @see Mpeg2ParControl
     */

    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * @return
     * @see Mpeg2ParControl
     */

    public String getParControl() {
        return this.parControl;
    }

    /**
     * @param parControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ParControl
     */

    public Mpeg2Settings withParControl(String parControl) {
        setParControl(parControl);
        return this;
    }

    /**
     * @param parControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ParControl
     */

    public Mpeg2Settings withParControl(Mpeg2ParControl parControl) {
        this.parControl = parControl.toString();
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

    public Mpeg2Settings withParDenominator(Integer parDenominator) {
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

    public Mpeg2Settings withParNumerator(Integer parNumerator) {
        setParNumerator(parNumerator);
        return this;
    }

    /**
     * @param qualityTuningLevel
     * @see Mpeg2QualityTuningLevel
     */

    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * @return
     * @see Mpeg2QualityTuningLevel
     */

    public String getQualityTuningLevel() {
        return this.qualityTuningLevel;
    }

    /**
     * @param qualityTuningLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2QualityTuningLevel
     */

    public Mpeg2Settings withQualityTuningLevel(String qualityTuningLevel) {
        setQualityTuningLevel(qualityTuningLevel);
        return this;
    }

    /**
     * @param qualityTuningLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2QualityTuningLevel
     */

    public Mpeg2Settings withQualityTuningLevel(Mpeg2QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * @param rateControlMode
     * @see Mpeg2RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * @return
     * @see Mpeg2RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * @param rateControlMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2RateControlMode
     */

    public Mpeg2Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * @param rateControlMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2RateControlMode
     */

    public Mpeg2Settings withRateControlMode(Mpeg2RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * @param sceneChangeDetect
     * @see Mpeg2SceneChangeDetect
     */

    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * @return
     * @see Mpeg2SceneChangeDetect
     */

    public String getSceneChangeDetect() {
        return this.sceneChangeDetect;
    }

    /**
     * @param sceneChangeDetect
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SceneChangeDetect
     */

    public Mpeg2Settings withSceneChangeDetect(String sceneChangeDetect) {
        setSceneChangeDetect(sceneChangeDetect);
        return this;
    }

    /**
     * @param sceneChangeDetect
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SceneChangeDetect
     */

    public Mpeg2Settings withSceneChangeDetect(Mpeg2SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * @param slowPal
     * @see Mpeg2SlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * @return
     * @see Mpeg2SlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * @param slowPal
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SlowPal
     */

    public Mpeg2Settings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * @param slowPal
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SlowPal
     */

    public Mpeg2Settings withSlowPal(Mpeg2SlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * 
     * @param softness
     *        Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     */

    public void setSoftness(Integer softness) {
        this.softness = softness;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * 
     * @return Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     */

    public Integer getSoftness() {
        return this.softness;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * 
     * @param softness
     *        Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withSoftness(Integer softness) {
        setSoftness(softness);
        return this;
    }

    /**
     * @param spatialAdaptiveQuantization
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * @return
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public String getSpatialAdaptiveQuantization() {
        return this.spatialAdaptiveQuantization;
    }

    /**
     * @param spatialAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public Mpeg2Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        setSpatialAdaptiveQuantization(spatialAdaptiveQuantization);
        return this;
    }

    /**
     * @param spatialAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SpatialAdaptiveQuantization
     */

    public Mpeg2Settings withSpatialAdaptiveQuantization(Mpeg2SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
        return this;
    }

    /**
     * @param syntax
     * @see Mpeg2Syntax
     */

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    /**
     * @return
     * @see Mpeg2Syntax
     */

    public String getSyntax() {
        return this.syntax;
    }

    /**
     * @param syntax
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Syntax
     */

    public Mpeg2Settings withSyntax(String syntax) {
        setSyntax(syntax);
        return this;
    }

    /**
     * @param syntax
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Syntax
     */

    public Mpeg2Settings withSyntax(Mpeg2Syntax syntax) {
        this.syntax = syntax.toString();
        return this;
    }

    /**
     * @param telecine
     * @see Mpeg2Telecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * @return
     * @see Mpeg2Telecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * @param telecine
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Telecine
     */

    public Mpeg2Settings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * @param telecine
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2Telecine
     */

    public Mpeg2Settings withTelecine(Mpeg2Telecine telecine) {
        this.telecine = telecine.toString();
        return this;
    }

    /**
     * @param temporalAdaptiveQuantization
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public void setTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
    }

    /**
     * @return
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public String getTemporalAdaptiveQuantization() {
        return this.temporalAdaptiveQuantization;
    }

    /**
     * @param temporalAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public Mpeg2Settings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        setTemporalAdaptiveQuantization(temporalAdaptiveQuantization);
        return this;
    }

    /**
     * @param temporalAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2TemporalAdaptiveQuantization
     */

    public Mpeg2Settings withTemporalAdaptiveQuantization(Mpeg2TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
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
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getCodecLevel() != null)
            sb.append("CodecLevel: ").append(getCodecLevel()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getDynamicSubGop() != null)
            sb.append("DynamicSubGop: ").append(getDynamicSubGop()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
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
        if (getHrdBufferInitialFillPercentage() != null)
            sb.append("HrdBufferInitialFillPercentage: ").append(getHrdBufferInitialFillPercentage()).append(",");
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: ").append(getHrdBufferSize()).append(",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: ").append(getInterlaceMode()).append(",");
        if (getIntraDcPrecision() != null)
            sb.append("IntraDcPrecision: ").append(getIntraDcPrecision()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: ").append(getMinIInterval()).append(",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: ").append(getNumberBFramesBetweenReferenceFrames()).append(",");
        if (getParControl() != null)
            sb.append("ParControl: ").append(getParControl()).append(",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: ").append(getParDenominator()).append(",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: ").append(getParNumerator()).append(",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: ").append(getSceneChangeDetect()).append(",");
        if (getSlowPal() != null)
            sb.append("SlowPal: ").append(getSlowPal()).append(",");
        if (getSoftness() != null)
            sb.append("Softness: ").append(getSoftness()).append(",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: ").append(getSpatialAdaptiveQuantization()).append(",");
        if (getSyntax() != null)
            sb.append("Syntax: ").append(getSyntax()).append(",");
        if (getTelecine() != null)
            sb.append("Telecine: ").append(getTelecine()).append(",");
        if (getTemporalAdaptiveQuantization() != null)
            sb.append("TemporalAdaptiveQuantization: ").append(getTemporalAdaptiveQuantization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mpeg2Settings == false)
            return false;
        Mpeg2Settings other = (Mpeg2Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecLevel() == null ^ this.getCodecLevel() == null)
            return false;
        if (other.getCodecLevel() != null && other.getCodecLevel().equals(this.getCodecLevel()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getDynamicSubGop() == null ^ this.getDynamicSubGop() == null)
            return false;
        if (other.getDynamicSubGop() != null && other.getDynamicSubGop().equals(this.getDynamicSubGop()) == false)
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
        if (other.getHrdBufferInitialFillPercentage() == null ^ this.getHrdBufferInitialFillPercentage() == null)
            return false;
        if (other.getHrdBufferInitialFillPercentage() != null
                && other.getHrdBufferInitialFillPercentage().equals(this.getHrdBufferInitialFillPercentage()) == false)
            return false;
        if (other.getHrdBufferSize() == null ^ this.getHrdBufferSize() == null)
            return false;
        if (other.getHrdBufferSize() != null && other.getHrdBufferSize().equals(this.getHrdBufferSize()) == false)
            return false;
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
            return false;
        if (other.getIntraDcPrecision() == null ^ this.getIntraDcPrecision() == null)
            return false;
        if (other.getIntraDcPrecision() != null && other.getIntraDcPrecision().equals(this.getIntraDcPrecision()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getMinIInterval() == null ^ this.getMinIInterval() == null)
            return false;
        if (other.getMinIInterval() != null && other.getMinIInterval().equals(this.getMinIInterval()) == false)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() == null ^ this.getNumberBFramesBetweenReferenceFrames() == null)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() != null
                && other.getNumberBFramesBetweenReferenceFrames().equals(this.getNumberBFramesBetweenReferenceFrames()) == false)
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
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
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
        if (other.getSyntax() == null ^ this.getSyntax() == null)
            return false;
        if (other.getSyntax() != null && other.getSyntax().equals(this.getSyntax()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        if (other.getTemporalAdaptiveQuantization() == null ^ this.getTemporalAdaptiveQuantization() == null)
            return false;
        if (other.getTemporalAdaptiveQuantization() != null && other.getTemporalAdaptiveQuantization().equals(this.getTemporalAdaptiveQuantization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecLevel() == null) ? 0 : getCodecLevel().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getDynamicSubGop() == null) ? 0 : getDynamicSubGop().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferInitialFillPercentage() == null) ? 0 : getHrdBufferInitialFillPercentage().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getIntraDcPrecision() == null) ? 0 : getIntraDcPrecision().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0 : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime * hashCode + ((getSpatialAdaptiveQuantization() == null) ? 0 : getSpatialAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getSyntax() == null) ? 0 : getSyntax().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        hashCode = prime * hashCode + ((getTemporalAdaptiveQuantization() == null) ? 0 : getTemporalAdaptiveQuantization().hashCode());
        return hashCode;
    }

    @Override
    public Mpeg2Settings clone() {
        try {
            return (Mpeg2Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Mpeg2SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
