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
 * Settings for H265 codec
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/H265Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H265Settings implements Serializable, Cloneable, StructuredPojo {

    /** Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality. */
    private String adaptiveQuantization;
    /**
     * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer
     * Function (EOTF).
     */
    private String alternateTransferFunctionSei;
    /**
     * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     */
    private Integer bitrate;
    /** H.265 Level. */
    private String codecLevel;
    /**
     * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     * [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC
     * 4:2:2 License.
     */
    private String codecProfile;
    /**
     * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use
     * fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more
     * B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the
     * setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
     */
    private String dynamicSubGop;
    /** Adjust quantization within each frame to reduce flicker or 'pop' on I-frames. */
    private String flickerAdaptiveQuantization;
    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     */
    private String framerateControl;
    /** When set to INTERPOLATE, produces smoother motion during frame rate conversion. */
    private String framerateConversionAlgorithm;
    /** Frame rate denominator. */
    private Integer framerateDenominator;
    /** Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps. */
    private Integer framerateNumerator;
    /** If enable, use reference B frames for GOP structures that have B frames > 1. */
    private String gopBReference;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /** GOP Length (keyframe interval) in frames or seconds. Must be greater than zero. */
    private Double gopSize;
    /**
     * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     */
    private String gopSizeUnits;
    /** Percentage of the buffer that should initially be filled (HRD buffer model). */
    private Integer hrdBufferInitialFillPercentage;
    /** Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000. */
    private Integer hrdBufferSize;
    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and
     * Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity
     * (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD)
     * use the same field polarity as the source. Therefore, behavior depends on the input scan type. - If the source is
     * interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The
     * output could therefore be a mix of "top field first" and "bottom field first". - If the source is progressive,
     * the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the
     * Follow options you chose.
     */
    private String interlaceMode;
    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate
     * control mode is QVBR.
     */
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
    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     */
    private Integer numberReferenceFrames;
    /**
     * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using
     * the console, do this by choosing Follow source for Pixel aspect ratio.
     */
    private String parControl;
    /** Pixel Aspect Ratio denominator. */
    private Integer parDenominator;
    /** Pixel Aspect Ratio numerator. */
    private Integer parNumerator;
    /**
     * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality
     * singlepass, or high-quality multipass video encoding.
     */
    private String qualityTuningLevel;
    /**
     * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     */
    private H265QvbrSettings qvbrSettings;
    /**
     * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     * quality-defined variable bitrate (QVBR).
     */
    private String rateControlMode;
    /**
     * Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on
     * content
     */
    private String sampleAdaptiveOffsetFilterMode;
    /** Scene change detection (inserts I-frames on scene changes). */
    private String sceneChangeDetect;
    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */
    private Integer slices;
    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     * correspondingly.
     */
    private String slowPal;
    /** Adjust quantization within each frame based on spatial variation of content complexity. */
    private String spatialAdaptiveQuantization;
    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field
     * works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive,
     * Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces
     * 23.976; the player converts this output to 29.97i.
     */
    private String telecine;
    /** Adjust quantization within each frame based on temporal variation of content complexity. */
    private String temporalAdaptiveQuantization;
    /**
     * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     * structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames
     * can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame
     * rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a
     * decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer)
     * for a half frame rate output.
     */
    private String temporalIds;
    /** Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures. */
    private String tiles;
    /** Inserts timecode for each frame as 4 bytes of an unregistered SEI message. */
    private String unregisteredSeiTimecode;
    /**
     * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include
     * writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with
     * downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow,
     * ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1.
     * This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd
     * Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the
     * samples directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes
     * parameter set NAL units directly into the samples.
     */
    private String writeMp4PackagingType;

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
     * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer
     * Function (EOTF).
     * 
     * @param alternateTransferFunctionSei
     *        Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical
     *        Transfer Function (EOTF).
     * @see H265AlternateTransferFunctionSei
     */

    public void setAlternateTransferFunctionSei(String alternateTransferFunctionSei) {
        this.alternateTransferFunctionSei = alternateTransferFunctionSei;
    }

    /**
     * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer
     * Function (EOTF).
     * 
     * @return Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical
     *         Transfer Function (EOTF).
     * @see H265AlternateTransferFunctionSei
     */

    public String getAlternateTransferFunctionSei() {
        return this.alternateTransferFunctionSei;
    }

    /**
     * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer
     * Function (EOTF).
     * 
     * @param alternateTransferFunctionSei
     *        Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical
     *        Transfer Function (EOTF).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265AlternateTransferFunctionSei
     */

    public H265Settings withAlternateTransferFunctionSei(String alternateTransferFunctionSei) {
        setAlternateTransferFunctionSei(alternateTransferFunctionSei);
        return this;
    }

    /**
     * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer
     * Function (EOTF).
     * 
     * @param alternateTransferFunctionSei
     *        Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical
     *        Transfer Function (EOTF).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265AlternateTransferFunctionSei
     */

    public H265Settings withAlternateTransferFunctionSei(H265AlternateTransferFunctionSei alternateTransferFunctionSei) {
        this.alternateTransferFunctionSei = alternateTransferFunctionSei.toString();
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

    public H265Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * H.265 Level.
     * 
     * @param codecLevel
     *        H.265 Level.
     * @see H265CodecLevel
     */

    public void setCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
    }

    /**
     * H.265 Level.
     * 
     * @return H.265 Level.
     * @see H265CodecLevel
     */

    public String getCodecLevel() {
        return this.codecLevel;
    }

    /**
     * H.265 Level.
     * 
     * @param codecLevel
     *        H.265 Level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265CodecLevel
     */

    public H265Settings withCodecLevel(String codecLevel) {
        setCodecLevel(codecLevel);
        return this;
    }

    /**
     * H.265 Level.
     * 
     * @param codecLevel
     *        H.265 Level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265CodecLevel
     */

    public H265Settings withCodecLevel(H265CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
        return this;
    }

    /**
     * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     * [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC
     * 4:2:2 License.
     * 
     * @param codecProfile
     *        Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     *        [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the
     *        HEVC 4:2:2 License.
     * @see H265CodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     * [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC
     * 4:2:2 License.
     * 
     * @return Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile]
     *         / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with
     *         the HEVC 4:2:2 License.
     * @see H265CodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     * [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC
     * 4:2:2 License.
     * 
     * @param codecProfile
     *        Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     *        [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the
     *        HEVC 4:2:2 License.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265CodecProfile
     */

    public H265Settings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     * [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC
     * 4:2:2 License.
     * 
     * @param codecProfile
     *        Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] /
     *        [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the
     *        HEVC 4:2:2 License.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265CodecProfile
     */

    public H265Settings withCodecProfile(H265CodecProfile codecProfile) {
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
     * @see H265DynamicSubGop
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
     * @see H265DynamicSubGop
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
     * @see H265DynamicSubGop
     */

    public H265Settings withDynamicSubGop(String dynamicSubGop) {
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
     * @see H265DynamicSubGop
     */

    public H265Settings withDynamicSubGop(H265DynamicSubGop dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop.toString();
        return this;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAdaptiveQuantization
     *        Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @see H265FlickerAdaptiveQuantization
     */

    public void setFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @return Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @see H265FlickerAdaptiveQuantization
     */

    public String getFlickerAdaptiveQuantization() {
        return this.flickerAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAdaptiveQuantization
     *        Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FlickerAdaptiveQuantization
     */

    public H265Settings withFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        setFlickerAdaptiveQuantization(flickerAdaptiveQuantization);
        return this;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAdaptiveQuantization
     *        Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FlickerAdaptiveQuantization
     */

    public H265Settings withFlickerAdaptiveQuantization(H265FlickerAdaptiveQuantization flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization.toString();
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @see H265FramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @return If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *         want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *         conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *         dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *         fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use
     *         FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *         INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *         you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *         FramerateDenominator.
     * @see H265FramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FramerateControl
     */

    public H265Settings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to
     * keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion,
     * choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal
     * approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your
     * transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the
     * frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the
     * settings FramerateNumerator and FramerateDenominator.
     * 
     * @param framerateControl
     *        If you are using the console, use the Framerate setting to specify the frame rate for this output. If you
     *        want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate
     *        conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the
     *        dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a
     *        fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use
     *        FramerateControl to specify which value the service uses for the frame rate for this output. Choose
     *        INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if
     *        you want the service to use the frame rate you specify in the settings FramerateNumerator and
     *        FramerateDenominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FramerateControl
     */

    public H265Settings withFramerateControl(H265FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @param framerateConversionAlgorithm
     *        When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @see H265FramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @return When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @see H265FramerateConversionAlgorithm
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
     * @see H265FramerateConversionAlgorithm
     */

    public H265Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * 
     * @param framerateConversionAlgorithm
     *        When set to INTERPOLATE, produces smoother motion during frame rate conversion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265FramerateConversionAlgorithm
     */

    public H265Settings withFramerateConversionAlgorithm(H265FramerateConversionAlgorithm framerateConversionAlgorithm) {
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

    public H265Settings withFramerateDenominator(Integer framerateDenominator) {
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

    public H265Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames > 1.
     * 
     * @param gopBReference
     *        If enable, use reference B frames for GOP structures that have B frames > 1.
     * @see H265GopBReference
     */

    public void setGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames > 1.
     * 
     * @return If enable, use reference B frames for GOP structures that have B frames > 1.
     * @see H265GopBReference
     */

    public String getGopBReference() {
        return this.gopBReference;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames > 1.
     * 
     * @param gopBReference
     *        If enable, use reference B frames for GOP structures that have B frames > 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265GopBReference
     */

    public H265Settings withGopBReference(String gopBReference) {
        setGopBReference(gopBReference);
        return this;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames > 1.
     * 
     * @param gopBReference
     *        If enable, use reference B frames for GOP structures that have B frames > 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265GopBReference
     */

    public H265Settings withGopBReference(H265GopBReference gopBReference) {
        this.gopBReference = gopBReference.toString();
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

    public H265Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert
     *        the GOP Size into a frame count at run time.
     * @see H265GopSizeUnits
     */

    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @return Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert
     *         the GOP Size into a frame count at run time.
     * @see H265GopSizeUnits
     */

    public String getGopSizeUnits() {
        return this.gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert
     *        the GOP Size into a frame count at run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265GopSizeUnits
     */

    public H265Settings withGopSizeUnits(String gopSizeUnits) {
        setGopSizeUnits(gopSizeUnits);
        return this;
    }

    /**
     * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP
     * Size into a frame count at run time.
     * 
     * @param gopSizeUnits
     *        Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert
     *        the GOP Size into a frame count at run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265GopSizeUnits
     */

    public H265Settings withGopSizeUnits(H265GopSizeUnits gopSizeUnits) {
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

    public H265Settings withHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
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

    public H265Settings withHrdBufferSize(Integer hrdBufferSize) {
        setHrdBufferSize(hrdBufferSize);
        return this;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and
     * Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity
     * (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD)
     * use the same field polarity as the source. Therefore, behavior depends on the input scan type. - If the source is
     * interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The
     * output could therefore be a mix of "top field first" and "bottom field first". - If the source is progressive,
     * the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the
     * Follow options you chose.
     * 
     * @param interlaceMode
     *        Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First
     *        (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having
     *        the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow,
     *        Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior
     *        depends on the input scan type. - If the source is interlaced, the output will be interlaced with the same
     *        polarity as the source (it will follow the source). The output could therefore be a mix of
     *        "top field first" and "bottom field first". - If the source is progressive, the output will be interlaced
     *        with "top field first" or "bottom field first" polarity, depending on which of the Follow options you
     *        chose.
     * @see H265InterlaceMode
     */

    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and
     * Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity
     * (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD)
     * use the same field polarity as the source. Therefore, behavior depends on the input scan type. - If the source is
     * interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The
     * output could therefore be a mix of "top field first" and "bottom field first". - If the source is progressive,
     * the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the
     * Follow options you chose.
     * 
     * @return Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First
     *         (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having
     *         the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow,
     *         Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior
     *         depends on the input scan type. - If the source is interlaced, the output will be interlaced with the
     *         same polarity as the source (it will follow the source). The output could therefore be a mix of
     *         "top field first" and "bottom field first". - If the source is progressive, the output will be interlaced
     *         with "top field first" or "bottom field first" polarity, depending on which of the Follow options you
     *         chose.
     * @see H265InterlaceMode
     */

    public String getInterlaceMode() {
        return this.interlaceMode;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and
     * Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity
     * (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD)
     * use the same field polarity as the source. Therefore, behavior depends on the input scan type. - If the source is
     * interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The
     * output could therefore be a mix of "top field first" and "bottom field first". - If the source is progressive,
     * the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the
     * Follow options you chose.
     * 
     * @param interlaceMode
     *        Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First
     *        (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having
     *        the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow,
     *        Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior
     *        depends on the input scan type. - If the source is interlaced, the output will be interlaced with the same
     *        polarity as the source (it will follow the source). The output could therefore be a mix of
     *        "top field first" and "bottom field first". - If the source is progressive, the output will be interlaced
     *        with "top field first" or "bottom field first" polarity, depending on which of the Follow options you
     *        chose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265InterlaceMode
     */

    public H265Settings withInterlaceMode(String interlaceMode) {
        setInterlaceMode(interlaceMode);
        return this;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and
     * Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity
     * (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD)
     * use the same field polarity as the source. Therefore, behavior depends on the input scan type. - If the source is
     * interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The
     * output could therefore be a mix of "top field first" and "bottom field first". - If the source is progressive,
     * the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the
     * Follow options you chose.
     * 
     * @param interlaceMode
     *        Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First
     *        (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having
     *        the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow,
     *        Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior
     *        depends on the input scan type. - If the source is interlaced, the output will be interlaced with the same
     *        polarity as the source (it will follow the source). The output could therefore be a mix of
     *        "top field first" and "bottom field first". - If the source is progressive, the output will be interlaced
     *        with "top field first" or "bottom field first" polarity, depending on which of the Follow options you
     *        chose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265InterlaceMode
     */

    public H265Settings withInterlaceMode(H265InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
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

    public H265Settings withMaxBitrate(Integer maxBitrate) {
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

    public H265Settings withMinIInterval(Integer minIInterval) {
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

    public H265Settings withNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        setNumberBFramesBetweenReferenceFrames(numberBFramesBetweenReferenceFrames);
        return this;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @param numberReferenceFrames
     *        Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *        interlaced encoding.
     */

    public void setNumberReferenceFrames(Integer numberReferenceFrames) {
        this.numberReferenceFrames = numberReferenceFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @return Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *         interlaced encoding.
     */

    public Integer getNumberReferenceFrames() {
        return this.numberReferenceFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @param numberReferenceFrames
     *        Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *        interlaced encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withNumberReferenceFrames(Integer numberReferenceFrames) {
        setNumberReferenceFrames(numberReferenceFrames);
        return this;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using
     * the console, do this by choosing Follow source for Pixel aspect ratio.
     * 
     * @param parControl
     *        Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the
     *        input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
     * @see H265ParControl
     */

    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using
     * the console, do this by choosing Follow source for Pixel aspect ratio.
     * 
     * @return Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the
     *         input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
     * @see H265ParControl
     */

    public String getParControl() {
        return this.parControl;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using
     * the console, do this by choosing Follow source for Pixel aspect ratio.
     * 
     * @param parControl
     *        Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the
     *        input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265ParControl
     */

    public H265Settings withParControl(String parControl) {
        setParControl(parControl);
        return this;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using
     * the console, do this by choosing Follow source for Pixel aspect ratio.
     * 
     * @param parControl
     *        Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the
     *        input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265ParControl
     */

    public H265Settings withParControl(H265ParControl parControl) {
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
     * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality
     * singlepass, or high-quality multipass video encoding.
     * 
     * @param qualityTuningLevel
     *        Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass,
     *        high-quality singlepass, or high-quality multipass video encoding.
     * @see H265QualityTuningLevel
     */

    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality
     * singlepass, or high-quality multipass video encoding.
     * 
     * @return Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass,
     *         high-quality singlepass, or high-quality multipass video encoding.
     * @see H265QualityTuningLevel
     */

    public String getQualityTuningLevel() {
        return this.qualityTuningLevel;
    }

    /**
     * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality
     * singlepass, or high-quality multipass video encoding.
     * 
     * @param qualityTuningLevel
     *        Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass,
     *        high-quality singlepass, or high-quality multipass video encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265QualityTuningLevel
     */

    public H265Settings withQualityTuningLevel(String qualityTuningLevel) {
        setQualityTuningLevel(qualityTuningLevel);
        return this;
    }

    /**
     * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality
     * singlepass, or high-quality multipass video encoding.
     * 
     * @param qualityTuningLevel
     *        Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass,
     *        high-quality singlepass, or high-quality multipass video encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265QualityTuningLevel
     */

    public H265Settings withQualityTuningLevel(H265QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     * 
     * @param qvbrSettings
     *        Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate
     *        control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you
     *        don't define Rate control mode.
     */

    public void setQvbrSettings(H265QvbrSettings qvbrSettings) {
        this.qvbrSettings = qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     * 
     * @return Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate
     *         control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you
     *         don't define Rate control mode.
     */

    public H265QvbrSettings getQvbrSettings() {
        return this.qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control
     * mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate
     * control mode.
     * 
     * @param qvbrSettings
     *        Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate
     *        control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you
     *        don't define Rate control mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withQvbrSettings(H265QvbrSettings qvbrSettings) {
        setQvbrSettings(qvbrSettings);
        return this;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     * quality-defined variable bitrate (QVBR).
     * 
     * @param rateControlMode
     *        Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     *        quality-defined variable bitrate (QVBR).
     * @see H265RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     * quality-defined variable bitrate (QVBR).
     * 
     * @return Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     *         quality-defined variable bitrate (QVBR).
     * @see H265RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     * quality-defined variable bitrate (QVBR).
     * 
     * @param rateControlMode
     *        Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     *        quality-defined variable bitrate (QVBR).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265RateControlMode
     */

    public H265Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     * quality-defined variable bitrate (QVBR).
     * 
     * @param rateControlMode
     *        Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or
     *        quality-defined variable bitrate (QVBR).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265RateControlMode
     */

    public H265Settings withRateControlMode(H265RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on
     * content
     * 
     * @param sampleAdaptiveOffsetFilterMode
     *        Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength
     *        based on content
     * @see H265SampleAdaptiveOffsetFilterMode
     */

    public void setSampleAdaptiveOffsetFilterMode(String sampleAdaptiveOffsetFilterMode) {
        this.sampleAdaptiveOffsetFilterMode = sampleAdaptiveOffsetFilterMode;
    }

    /**
     * Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on
     * content
     * 
     * @return Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength
     *         based on content
     * @see H265SampleAdaptiveOffsetFilterMode
     */

    public String getSampleAdaptiveOffsetFilterMode() {
        return this.sampleAdaptiveOffsetFilterMode;
    }

    /**
     * Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on
     * content
     * 
     * @param sampleAdaptiveOffsetFilterMode
     *        Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength
     *        based on content
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SampleAdaptiveOffsetFilterMode
     */

    public H265Settings withSampleAdaptiveOffsetFilterMode(String sampleAdaptiveOffsetFilterMode) {
        setSampleAdaptiveOffsetFilterMode(sampleAdaptiveOffsetFilterMode);
        return this;
    }

    /**
     * Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on
     * content
     * 
     * @param sampleAdaptiveOffsetFilterMode
     *        Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength
     *        based on content
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SampleAdaptiveOffsetFilterMode
     */

    public H265Settings withSampleAdaptiveOffsetFilterMode(H265SampleAdaptiveOffsetFilterMode sampleAdaptiveOffsetFilterMode) {
        this.sampleAdaptiveOffsetFilterMode = sampleAdaptiveOffsetFilterMode.toString();
        return this;
    }

    /**
     * Scene change detection (inserts I-frames on scene changes).
     * 
     * @param sceneChangeDetect
     *        Scene change detection (inserts I-frames on scene changes).
     * @see H265SceneChangeDetect
     */

    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Scene change detection (inserts I-frames on scene changes).
     * 
     * @return Scene change detection (inserts I-frames on scene changes).
     * @see H265SceneChangeDetect
     */

    public String getSceneChangeDetect() {
        return this.sceneChangeDetect;
    }

    /**
     * Scene change detection (inserts I-frames on scene changes).
     * 
     * @param sceneChangeDetect
     *        Scene change detection (inserts I-frames on scene changes).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SceneChangeDetect
     */

    public H265Settings withSceneChangeDetect(String sceneChangeDetect) {
        setSceneChangeDetect(sceneChangeDetect);
        return this;
    }

    /**
     * Scene change detection (inserts I-frames on scene changes).
     * 
     * @param sceneChangeDetect
     *        Scene change detection (inserts I-frames on scene changes).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SceneChangeDetect
     */

    public H265Settings withSceneChangeDetect(H265SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * 
     * @param slices
     *        Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *        pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */

    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * 
     * @return Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *         pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */

    public Integer getSlices() {
        return this.slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * 
     * @param slices
     *        Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *        pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265Settings withSlices(Integer slices) {
        setSlices(slices);
        return this;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     * correspondingly.
     * 
     * @param slowPal
     *        Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     *        correspondingly.
     * @see H265SlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     * correspondingly.
     * 
     * @return Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     *         correspondingly.
     * @see H265SlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     * correspondingly.
     * 
     * @param slowPal
     *        Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     *        correspondingly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SlowPal
     */

    public H265Settings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     * correspondingly.
     * 
     * @param slowPal
     *        Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up
     *        correspondingly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SlowPal
     */

    public H265Settings withSlowPal(H265SlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAdaptiveQuantization
     *        Adjust quantization within each frame based on spatial variation of content complexity.
     * @see H265SpatialAdaptiveQuantization
     */

    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @return Adjust quantization within each frame based on spatial variation of content complexity.
     * @see H265SpatialAdaptiveQuantization
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
     * @see H265SpatialAdaptiveQuantization
     */

    public H265Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        setSpatialAdaptiveQuantization(spatialAdaptiveQuantization);
        return this;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAdaptiveQuantization
     *        Adjust quantization within each frame based on spatial variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265SpatialAdaptiveQuantization
     */

    public H265Settings withSpatialAdaptiveQuantization(H265SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
        return this;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field
     * works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive,
     * Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces
     * 23.976; the player converts this output to 29.97i.
     * 
     * @param telecine
     *        This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This
     *        field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the
     *        Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output:
     *        Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input.
     *        - Soft: produces 23.976; the player converts this output to 29.97i.
     * @see H265Telecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field
     * works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive,
     * Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces
     * 23.976; the player converts this output to 29.97i.
     * 
     * @return This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This
     *         field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the
     *         Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output:
     *         Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976
     *         input. - Soft: produces 23.976; the player converts this output to 29.97i.
     * @see H265Telecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field
     * works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive,
     * Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces
     * 23.976; the player converts this output to 29.97i.
     * 
     * @param telecine
     *        This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This
     *        field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the
     *        Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output:
     *        Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input.
     *        - Soft: produces 23.976; the player converts this output to 29.97i.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Telecine
     */

    public H265Settings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field
     * works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive,
     * Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces
     * 23.976; the player converts this output to 29.97i.
     * 
     * @param telecine
     *        This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This
     *        field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the
     *        Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output:
     *        Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input.
     *        - Soft: produces 23.976; the player converts this output to 29.97i.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Telecine
     */

    public H265Settings withTelecine(H265Telecine telecine) {
        this.telecine = telecine.toString();
        return this;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @param temporalAdaptiveQuantization
     *        Adjust quantization within each frame based on temporal variation of content complexity.
     * @see H265TemporalAdaptiveQuantization
     */

    public void setTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @return Adjust quantization within each frame based on temporal variation of content complexity.
     * @see H265TemporalAdaptiveQuantization
     */

    public String getTemporalAdaptiveQuantization() {
        return this.temporalAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @param temporalAdaptiveQuantization
     *        Adjust quantization within each frame based on temporal variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265TemporalAdaptiveQuantization
     */

    public H265Settings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        setTemporalAdaptiveQuantization(temporalAdaptiveQuantization);
        return this;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @param temporalAdaptiveQuantization
     *        Adjust quantization within each frame based on temporal variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265TemporalAdaptiveQuantization
     */

    public H265Settings withTemporalAdaptiveQuantization(H265TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
        return this;
    }

    /**
     * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     * structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames
     * can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame
     * rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a
     * decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer)
     * for a half frame rate output.
     * 
     * @param temporalIds
     *        Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     *        structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference
     *        b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate
     *        a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e.
     *        IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and
     *        P frames (lowest temporal layer) for a half frame rate output.
     * @see H265TemporalIds
     */

    public void setTemporalIds(String temporalIds) {
        this.temporalIds = temporalIds;
    }

    /**
     * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     * structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames
     * can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame
     * rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a
     * decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer)
     * for a half frame rate output.
     * 
     * @return Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on
     *         GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and
     *         non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal
     *         layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with
     *         b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate
     *         output or only the I and P frames (lowest temporal layer) for a half frame rate output.
     * @see H265TemporalIds
     */

    public String getTemporalIds() {
        return this.temporalIds;
    }

    /**
     * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     * structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames
     * can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame
     * rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a
     * decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer)
     * for a half frame rate output.
     * 
     * @param temporalIds
     *        Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     *        structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference
     *        b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate
     *        a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e.
     *        IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and
     *        P frames (lowest temporal layer) for a half frame rate output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265TemporalIds
     */

    public H265Settings withTemporalIds(String temporalIds) {
        setTemporalIds(temporalIds);
        return this;
    }

    /**
     * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     * structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames
     * can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame
     * rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a
     * decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer)
     * for a half frame rate output.
     * 
     * @param temporalIds
     *        Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP
     *        structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference
     *        b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate
     *        a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e.
     *        IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and
     *        P frames (lowest temporal layer) for a half frame rate output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265TemporalIds
     */

    public H265Settings withTemporalIds(H265TemporalIds temporalIds) {
        this.temporalIds = temporalIds.toString();
        return this;
    }

    /**
     * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * 
     * @param tiles
     *        Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * @see H265Tiles
     */

    public void setTiles(String tiles) {
        this.tiles = tiles;
    }

    /**
     * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * 
     * @return Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * @see H265Tiles
     */

    public String getTiles() {
        return this.tiles;
    }

    /**
     * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * 
     * @param tiles
     *        Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Tiles
     */

    public H265Settings withTiles(String tiles) {
        setTiles(tiles);
        return this;
    }

    /**
     * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * 
     * @param tiles
     *        Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265Tiles
     */

    public H265Settings withTiles(H265Tiles tiles) {
        this.tiles = tiles.toString();
        return this;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * 
     * @param unregisteredSeiTimecode
     *        Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * @see H265UnregisteredSeiTimecode
     */

    public void setUnregisteredSeiTimecode(String unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * 
     * @return Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * @see H265UnregisteredSeiTimecode
     */

    public String getUnregisteredSeiTimecode() {
        return this.unregisteredSeiTimecode;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * 
     * @param unregisteredSeiTimecode
     *        Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265UnregisteredSeiTimecode
     */

    public H265Settings withUnregisteredSeiTimecode(String unregisteredSeiTimecode) {
        setUnregisteredSeiTimecode(unregisteredSeiTimecode);
        return this;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * 
     * @param unregisteredSeiTimecode
     *        Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265UnregisteredSeiTimecode
     */

    public H265Settings withUnregisteredSeiTimecode(H265UnregisteredSeiTimecode unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode.toString();
        return this;
    }

    /**
     * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include
     * writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with
     * downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow,
     * ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1.
     * This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd
     * Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the
     * samples directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes
     * parameter set NAL units directly into the samples.
     * 
     * @param writeMp4PackagingType
     *        Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you
     *        include writeMp4PackagingType in your JSON job specification for other outputs, your video might not work
     *        properly with downstream systems and video players. If the location of parameter set NAL units don't
     *        matter in your workflow, ignore this setting. The service defaults to marking your output as HEV1. Choose
     *        HVC1 to mark your output as HVC1. This makes your output compliant with this specification: ISO IECJTC1
     *        SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set
     *        NAL units in the sample headers but not in the samples directly. Keep the default HEV1 to mark your output
     *        as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
     * @see H265WriteMp4PackagingType
     */

    public void setWriteMp4PackagingType(String writeMp4PackagingType) {
        this.writeMp4PackagingType = writeMp4PackagingType;
    }

    /**
     * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include
     * writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with
     * downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow,
     * ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1.
     * This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd
     * Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the
     * samples directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes
     * parameter set NAL units directly into the samples.
     * 
     * @return Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you
     *         include writeMp4PackagingType in your JSON job specification for other outputs, your video might not work
     *         properly with downstream systems and video players. If the location of parameter set NAL units don't
     *         matter in your workflow, ignore this setting. The service defaults to marking your output as HEV1. Choose
     *         HVC1 to mark your output as HVC1. This makes your output compliant with this specification: ISO IECJTC1
     *         SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set
     *         NAL units in the sample headers but not in the samples directly. Keep the default HEV1 to mark your
     *         output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
     * @see H265WriteMp4PackagingType
     */

    public String getWriteMp4PackagingType() {
        return this.writeMp4PackagingType;
    }

    /**
     * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include
     * writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with
     * downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow,
     * ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1.
     * This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd
     * Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the
     * samples directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes
     * parameter set NAL units directly into the samples.
     * 
     * @param writeMp4PackagingType
     *        Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you
     *        include writeMp4PackagingType in your JSON job specification for other outputs, your video might not work
     *        properly with downstream systems and video players. If the location of parameter set NAL units don't
     *        matter in your workflow, ignore this setting. The service defaults to marking your output as HEV1. Choose
     *        HVC1 to mark your output as HVC1. This makes your output compliant with this specification: ISO IECJTC1
     *        SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set
     *        NAL units in the sample headers but not in the samples directly. Keep the default HEV1 to mark your output
     *        as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265WriteMp4PackagingType
     */

    public H265Settings withWriteMp4PackagingType(String writeMp4PackagingType) {
        setWriteMp4PackagingType(writeMp4PackagingType);
        return this;
    }

    /**
     * Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you include
     * writeMp4PackagingType in your JSON job specification for other outputs, your video might not work properly with
     * downstream systems and video players. If the location of parameter set NAL units don't matter in your workflow,
     * ignore this setting. The service defaults to marking your output as HEV1. Choose HVC1 to mark your output as HVC1.
     * This makes your output compliant with this specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd
     * Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the
     * samples directly. Keep the default HEV1 to mark your output as HEV1. For these outputs, the service writes
     * parameter set NAL units directly into the samples.
     * 
     * @param writeMp4PackagingType
     *        Use this setting only for outputs encoded with H.265 that are in CMAF or DASH output groups. If you
     *        include writeMp4PackagingType in your JSON job specification for other outputs, your video might not work
     *        properly with downstream systems and video players. If the location of parameter set NAL units don't
     *        matter in your workflow, ignore this setting. The service defaults to marking your output as HEV1. Choose
     *        HVC1 to mark your output as HVC1. This makes your output compliant with this specification: ISO IECJTC1
     *        SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set
     *        NAL units in the sample headers but not in the samples directly. Keep the default HEV1 to mark your output
     *        as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H265WriteMp4PackagingType
     */

    public H265Settings withWriteMp4PackagingType(H265WriteMp4PackagingType writeMp4PackagingType) {
        this.writeMp4PackagingType = writeMp4PackagingType.toString();
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
        if (getAlternateTransferFunctionSei() != null)
            sb.append("AlternateTransferFunctionSei: ").append(getAlternateTransferFunctionSei()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getCodecLevel() != null)
            sb.append("CodecLevel: ").append(getCodecLevel()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getDynamicSubGop() != null)
            sb.append("DynamicSubGop: ").append(getDynamicSubGop()).append(",");
        if (getFlickerAdaptiveQuantization() != null)
            sb.append("FlickerAdaptiveQuantization: ").append(getFlickerAdaptiveQuantization()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopBReference() != null)
            sb.append("GopBReference: ").append(getGopBReference()).append(",");
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
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: ").append(getMinIInterval()).append(",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: ").append(getNumberBFramesBetweenReferenceFrames()).append(",");
        if (getNumberReferenceFrames() != null)
            sb.append("NumberReferenceFrames: ").append(getNumberReferenceFrames()).append(",");
        if (getParControl() != null)
            sb.append("ParControl: ").append(getParControl()).append(",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: ").append(getParDenominator()).append(",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: ").append(getParNumerator()).append(",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel()).append(",");
        if (getQvbrSettings() != null)
            sb.append("QvbrSettings: ").append(getQvbrSettings()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getSampleAdaptiveOffsetFilterMode() != null)
            sb.append("SampleAdaptiveOffsetFilterMode: ").append(getSampleAdaptiveOffsetFilterMode()).append(",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: ").append(getSceneChangeDetect()).append(",");
        if (getSlices() != null)
            sb.append("Slices: ").append(getSlices()).append(",");
        if (getSlowPal() != null)
            sb.append("SlowPal: ").append(getSlowPal()).append(",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: ").append(getSpatialAdaptiveQuantization()).append(",");
        if (getTelecine() != null)
            sb.append("Telecine: ").append(getTelecine()).append(",");
        if (getTemporalAdaptiveQuantization() != null)
            sb.append("TemporalAdaptiveQuantization: ").append(getTemporalAdaptiveQuantization()).append(",");
        if (getTemporalIds() != null)
            sb.append("TemporalIds: ").append(getTemporalIds()).append(",");
        if (getTiles() != null)
            sb.append("Tiles: ").append(getTiles()).append(",");
        if (getUnregisteredSeiTimecode() != null)
            sb.append("UnregisteredSeiTimecode: ").append(getUnregisteredSeiTimecode()).append(",");
        if (getWriteMp4PackagingType() != null)
            sb.append("WriteMp4PackagingType: ").append(getWriteMp4PackagingType());
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
        if (other.getAlternateTransferFunctionSei() == null ^ this.getAlternateTransferFunctionSei() == null)
            return false;
        if (other.getAlternateTransferFunctionSei() != null && other.getAlternateTransferFunctionSei().equals(this.getAlternateTransferFunctionSei()) == false)
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
        if (other.getFlickerAdaptiveQuantization() == null ^ this.getFlickerAdaptiveQuantization() == null)
            return false;
        if (other.getFlickerAdaptiveQuantization() != null && other.getFlickerAdaptiveQuantization().equals(this.getFlickerAdaptiveQuantization()) == false)
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
        if (other.getGopBReference() == null ^ this.getGopBReference() == null)
            return false;
        if (other.getGopBReference() != null && other.getGopBReference().equals(this.getGopBReference()) == false)
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
        if (other.getNumberReferenceFrames() == null ^ this.getNumberReferenceFrames() == null)
            return false;
        if (other.getNumberReferenceFrames() != null && other.getNumberReferenceFrames().equals(this.getNumberReferenceFrames()) == false)
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
        if (other.getQvbrSettings() == null ^ this.getQvbrSettings() == null)
            return false;
        if (other.getQvbrSettings() != null && other.getQvbrSettings().equals(this.getQvbrSettings()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getSampleAdaptiveOffsetFilterMode() == null ^ this.getSampleAdaptiveOffsetFilterMode() == null)
            return false;
        if (other.getSampleAdaptiveOffsetFilterMode() != null
                && other.getSampleAdaptiveOffsetFilterMode().equals(this.getSampleAdaptiveOffsetFilterMode()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null && other.getSpatialAdaptiveQuantization().equals(this.getSpatialAdaptiveQuantization()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        if (other.getTemporalAdaptiveQuantization() == null ^ this.getTemporalAdaptiveQuantization() == null)
            return false;
        if (other.getTemporalAdaptiveQuantization() != null && other.getTemporalAdaptiveQuantization().equals(this.getTemporalAdaptiveQuantization()) == false)
            return false;
        if (other.getTemporalIds() == null ^ this.getTemporalIds() == null)
            return false;
        if (other.getTemporalIds() != null && other.getTemporalIds().equals(this.getTemporalIds()) == false)
            return false;
        if (other.getTiles() == null ^ this.getTiles() == null)
            return false;
        if (other.getTiles() != null && other.getTiles().equals(this.getTiles()) == false)
            return false;
        if (other.getUnregisteredSeiTimecode() == null ^ this.getUnregisteredSeiTimecode() == null)
            return false;
        if (other.getUnregisteredSeiTimecode() != null && other.getUnregisteredSeiTimecode().equals(this.getUnregisteredSeiTimecode()) == false)
            return false;
        if (other.getWriteMp4PackagingType() == null ^ this.getWriteMp4PackagingType() == null)
            return false;
        if (other.getWriteMp4PackagingType() != null && other.getWriteMp4PackagingType().equals(this.getWriteMp4PackagingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getAlternateTransferFunctionSei() == null) ? 0 : getAlternateTransferFunctionSei().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecLevel() == null) ? 0 : getCodecLevel().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getDynamicSubGop() == null) ? 0 : getDynamicSubGop().hashCode());
        hashCode = prime * hashCode + ((getFlickerAdaptiveQuantization() == null) ? 0 : getFlickerAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferInitialFillPercentage() == null) ? 0 : getHrdBufferInitialFillPercentage().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0 : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getNumberReferenceFrames() == null) ? 0 : getNumberReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode + ((getQvbrSettings() == null) ? 0 : getQvbrSettings().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getSampleAdaptiveOffsetFilterMode() == null) ? 0 : getSampleAdaptiveOffsetFilterMode().hashCode());
        hashCode = prime * hashCode + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getSpatialAdaptiveQuantization() == null) ? 0 : getSpatialAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        hashCode = prime * hashCode + ((getTemporalAdaptiveQuantization() == null) ? 0 : getTemporalAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getTemporalIds() == null) ? 0 : getTemporalIds().hashCode());
        hashCode = prime * hashCode + ((getTiles() == null) ? 0 : getTiles().hashCode());
        hashCode = prime * hashCode + ((getUnregisteredSeiTimecode() == null) ? 0 : getUnregisteredSeiTimecode().hashCode());
        hashCode = prime * hashCode + ((getWriteMp4PackagingType() == null) ? 0 : getWriteMp4PackagingType().hashCode());
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
        com.amazonaws.services.mediaconvert.model.transform.H265SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
