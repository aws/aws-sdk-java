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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * H264 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/H264Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H264Settings implements Serializable, Cloneable, StructuredPojo {

    /** Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality. */
    private String adaptiveQuantization;
    /**
     * Indicates that AFD values will be written into the output stream. If afdSignaling is "auto", the system will try
     * to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value
     * will be the value configured in the fixedAfd parameter.
     */
    private String afdSignaling;
    /**
     * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS
     * Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     */
    private Integer bitrate;
    /** Percentage of the buffer that should initially be filled (HRD buffer model). */
    private Integer bufFillPct;
    /** Size of buffer (HRD buffer model) in bits/second. */
    private Integer bufSize;
    /** Includes colorspace metadata in the output. */
    private String colorMetadata;
    /** Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc. */
    private String entropyEncoding;
    /**
     * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to
     * 'Fixed'.
     */
    private String fixedAfd;
    /** If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames. */
    private String flickerAq;
    /**
     * This field indicates how the output video frame rate is specified. If "specified" is selected then the output
     * video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is
     * selected then the output video frame rate will be set equal to the input video frame rate of the first input.
     */
    private String framerateControl;
    /** Framerate denominator. */
    private Integer framerateDenominator;
    /** Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps. */
    private Integer framerateNumerator;
    /** Documentation update needed */
    private String gopBReference;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /** Number of B-frames between reference frames. */
    private Integer gopNumBFrames;
    /** GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero. */
    private Double gopSize;
    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a
     * frame count at run time.
     */
    private String gopSizeUnits;
    /** H.264 Level. */
    private String level;
    /**
     * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality
     * for certain content.
     */
    private String lookAheadRateControl;
    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     */
    private Integer maxBitrate;
    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence) I-frames
     * and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a
     * cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch =
     * GOP size + Min-I-interval - 1
     */
    private Integer minIInterval;
    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     */
    private Integer numRefFrames;
    /**
     * This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the output
     * video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is
     * selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first
     * input.
     */
    private String parControl;
    /** Pixel Aspect Ratio denominator. */
    private Integer parDenominator;
    /** Pixel Aspect Ratio numerator. */
    private Integer parNumerator;
    /** H.264 Profile. */
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
     * VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want to
     * maintain a specific average bitrate over the duration of the channel.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     */
    private String rateControlMode;
    /** Sets the scan type of the output to progressive or top-field-first interlaced. */
    private String scanType;
    /**
     * Scene change detection.
     * 
     * - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change is
     * detected.
     */
    private String sceneChangeDetect;
    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
     */
    private Integer slices;
    /** Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image. */
    private Integer softness;
    /** If set to enabled, adjust quantization within each frame based on spatial variation of content complexity. */
    private String spatialAq;
    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used
     * for each sub-GOP to improve visual quality.
     */
    private String subgopLength;
    /** Produces a bitstream compliant with SMPTE RP-2027. */
    private String syntax;
    /** If set to enabled, adjust quantization within each frame based on temporal variation of content complexity. */
    private String temporalAq;
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
     * @see H264AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @return Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @see H264AdaptiveQuantization
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
     * @see H264AdaptiveQuantization
     */

    public H264Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264AdaptiveQuantization
     */

    public H264Settings withAdaptiveQuantization(H264AdaptiveQuantization adaptiveQuantization) {
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

    public H264Settings withAfdSignaling(String afdSignaling) {
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

    public H264Settings withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
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

    public H264Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param bufFillPct
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public void setBufFillPct(Integer bufFillPct) {
        this.bufFillPct = bufFillPct;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @return Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public Integer getBufFillPct() {
        return this.bufFillPct;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param bufFillPct
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withBufFillPct(Integer bufFillPct) {
        setBufFillPct(bufFillPct);
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits/second.
     * 
     * @param bufSize
     *        Size of buffer (HRD buffer model) in bits/second.
     */

    public void setBufSize(Integer bufSize) {
        this.bufSize = bufSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits/second.
     * 
     * @return Size of buffer (HRD buffer model) in bits/second.
     */

    public Integer getBufSize() {
        return this.bufSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits/second.
     * 
     * @param bufSize
     *        Size of buffer (HRD buffer model) in bits/second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withBufSize(Integer bufSize) {
        setBufSize(bufSize);
        return this;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @param colorMetadata
     *        Includes colorspace metadata in the output.
     * @see H264ColorMetadata
     */

    public void setColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @return Includes colorspace metadata in the output.
     * @see H264ColorMetadata
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
     * @see H264ColorMetadata
     */

    public H264Settings withColorMetadata(String colorMetadata) {
        setColorMetadata(colorMetadata);
        return this;
    }

    /**
     * Includes colorspace metadata in the output.
     * 
     * @param colorMetadata
     *        Includes colorspace metadata in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264ColorMetadata
     */

    public H264Settings withColorMetadata(H264ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * 
     * @param entropyEncoding
     *        Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * @see H264EntropyEncoding
     */

    public void setEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * 
     * @return Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * @see H264EntropyEncoding
     */

    public String getEntropyEncoding() {
        return this.entropyEncoding;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * 
     * @param entropyEncoding
     *        Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264EntropyEncoding
     */

    public H264Settings withEntropyEncoding(String entropyEncoding) {
        setEntropyEncoding(entropyEncoding);
        return this;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * 
     * @param entropyEncoding
     *        Entropy encoding mode. Use cabac (must be in Main or High profile) or cavlc.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264EntropyEncoding
     */

    public H264Settings withEntropyEncoding(H264EntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
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

    public H264Settings withFixedAfd(String fixedAfd) {
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

    public H264Settings withFixedAfd(FixedAfd fixedAfd) {
        this.fixedAfd = fixedAfd.toString();
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAq
     *        If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAq
     */

    public void setFlickerAq(String flickerAq) {
        this.flickerAq = flickerAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @return If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAq
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
     * @see H264FlickerAq
     */

    public H264Settings withFlickerAq(String flickerAq) {
        setFlickerAq(flickerAq);
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * 
     * @param flickerAq
     *        If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FlickerAq
     */

    public H264Settings withFlickerAq(H264FlickerAq flickerAq) {
        this.flickerAq = flickerAq.toString();
        return this;
    }

    /**
     * This field indicates how the output video frame rate is specified. If "specified" is selected then the output
     * video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is
     * selected then the output video frame rate will be set equal to the input video frame rate of the first input.
     * 
     * @param framerateControl
     *        This field indicates how the output video frame rate is specified. If "specified" is selected then the
     *        output video frame rate is determined by framerateNumerator and framerateDenominator, else if
     *        "initializeFromSource" is selected then the output video frame rate will be set equal to the input video
     *        frame rate of the first input.
     * @see H264FramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * This field indicates how the output video frame rate is specified. If "specified" is selected then the output
     * video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is
     * selected then the output video frame rate will be set equal to the input video frame rate of the first input.
     * 
     * @return This field indicates how the output video frame rate is specified. If "specified" is selected then the
     *         output video frame rate is determined by framerateNumerator and framerateDenominator, else if
     *         "initializeFromSource" is selected then the output video frame rate will be set equal to the input video
     *         frame rate of the first input.
     * @see H264FramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * This field indicates how the output video frame rate is specified. If "specified" is selected then the output
     * video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is
     * selected then the output video frame rate will be set equal to the input video frame rate of the first input.
     * 
     * @param framerateControl
     *        This field indicates how the output video frame rate is specified. If "specified" is selected then the
     *        output video frame rate is determined by framerateNumerator and framerateDenominator, else if
     *        "initializeFromSource" is selected then the output video frame rate will be set equal to the input video
     *        frame rate of the first input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FramerateControl
     */

    public H264Settings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * This field indicates how the output video frame rate is specified. If "specified" is selected then the output
     * video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is
     * selected then the output video frame rate will be set equal to the input video frame rate of the first input.
     * 
     * @param framerateControl
     *        This field indicates how the output video frame rate is specified. If "specified" is selected then the
     *        output video frame rate is determined by framerateNumerator and framerateDenominator, else if
     *        "initializeFromSource" is selected then the output video frame rate will be set equal to the input video
     *        frame rate of the first input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FramerateControl
     */

    public H264Settings withFramerateControl(H264FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
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

    public H264Settings withFramerateDenominator(Integer framerateDenominator) {
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

    public H264Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param gopBReference
     *        Documentation update needed
     * @see H264GopBReference
     */

    public void setGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     * @see H264GopBReference
     */

    public String getGopBReference() {
        return this.gopBReference;
    }

    /**
     * Documentation update needed
     * 
     * @param gopBReference
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264GopBReference
     */

    public H264Settings withGopBReference(String gopBReference) {
        setGopBReference(gopBReference);
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param gopBReference
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264GopBReference
     */

    public H264Settings withGopBReference(H264GopBReference gopBReference) {
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

    public H264Settings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param gopNumBFrames
     *        Number of B-frames between reference frames.
     */

    public void setGopNumBFrames(Integer gopNumBFrames) {
        this.gopNumBFrames = gopNumBFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @return Number of B-frames between reference frames.
     */

    public Integer getGopNumBFrames() {
        return this.gopNumBFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param gopNumBFrames
     *        Number of B-frames between reference frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withGopNumBFrames(Integer gopNumBFrames) {
        setGopNumBFrames(gopNumBFrames);
        return this;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than
     *        zero.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero.
     * 
     * @return GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than
     *         zero.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than
     *        zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withGopSize(Double gopSize) {
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
     * @see H264GopSizeUnits
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
     * @see H264GopSizeUnits
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
     * @see H264GopSizeUnits
     */

    public H264Settings withGopSizeUnits(String gopSizeUnits) {
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
     * @see H264GopSizeUnits
     */

    public H264Settings withGopSizeUnits(H264GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * H.264 Level.
     * 
     * @param level
     *        H.264 Level.
     * @see H264Level
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * H.264 Level.
     * 
     * @return H.264 Level.
     * @see H264Level
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * H.264 Level.
     * 
     * @param level
     *        H.264 Level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Level
     */

    public H264Settings withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * H.264 Level.
     * 
     * @param level
     *        H.264 Level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Level
     */

    public H264Settings withLevel(H264Level level) {
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
     * @see H264LookAheadRateControl
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
     * @see H264LookAheadRateControl
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
     * @see H264LookAheadRateControl
     */

    public H264Settings withLookAheadRateControl(String lookAheadRateControl) {
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
     * @see H264LookAheadRateControl
     */

    public H264Settings withLookAheadRateControl(H264LookAheadRateControl lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl.toString();
        return this;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     * 
     * @param maxBitrate
     *        For QVBR: See the tooltip for Quality level
     * 
     *        For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     * 
     * @return For QVBR: See the tooltip for Quality level
     * 
     *         For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * 
     * For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     * 
     * @param maxBitrate
     *        For QVBR: See the tooltip for Quality level
     * 
     *        For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence) I-frames
     * and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a
     * cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch =
     * GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence)
     *        I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval
     *        frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch
     *        requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP.
     *        Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence) I-frames
     * and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a
     * cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch =
     * GOP size + Min-I-interval - 1
     * 
     * @return Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence)
     *         I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval
     *         frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch
     *         requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP.
     *         Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public Integer getMinIInterval() {
        return this.minIInterval;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence) I-frames
     * and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a
     * cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch =
     * GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Only meaningful if sceneChangeDetect is set to enabled. Enforces separation between repeated (cadence)
     *        I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval
     *        frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch
     *        requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP.
     *        Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withMinIInterval(Integer minIInterval) {
        setMinIInterval(minIInterval);
        return this;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @param numRefFrames
     *        Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *        interlaced encoding.
     */

    public void setNumRefFrames(Integer numRefFrames) {
        this.numRefFrames = numRefFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @return Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *         interlaced encoding.
     */

    public Integer getNumRefFrames() {
        return this.numRefFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @param numRefFrames
     *        Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *        interlaced encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withNumRefFrames(Integer numRefFrames) {
        setNumRefFrames(numRefFrames);
        return this;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the output
     * video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is
     * selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first
     * input.
     * 
     * @param parControl
     *        This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the
     *        output video pixel aspect ratio is determined by parNumerator and parDenominator, else if
     *        "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input
     *        video pixel aspect ratio of the first input.
     * @see H264ParControl
     */

    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the output
     * video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is
     * selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first
     * input.
     * 
     * @return This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the
     *         output video pixel aspect ratio is determined by parNumerator and parDenominator, else if
     *         "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input
     *         video pixel aspect ratio of the first input.
     * @see H264ParControl
     */

    public String getParControl() {
        return this.parControl;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the output
     * video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is
     * selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first
     * input.
     * 
     * @param parControl
     *        This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the
     *        output video pixel aspect ratio is determined by parNumerator and parDenominator, else if
     *        "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input
     *        video pixel aspect ratio of the first input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264ParControl
     */

    public H264Settings withParControl(String parControl) {
        setParControl(parControl);
        return this;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the output
     * video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is
     * selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first
     * input.
     * 
     * @param parControl
     *        This field indicates how the output pixel aspect ratio is specified. If "specified" is selected then the
     *        output video pixel aspect ratio is determined by parNumerator and parDenominator, else if
     *        "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input
     *        video pixel aspect ratio of the first input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264ParControl
     */

    public H264Settings withParControl(H264ParControl parControl) {
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

    public H264Settings withParDenominator(Integer parDenominator) {
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

    public H264Settings withParNumerator(Integer parNumerator) {
        setParNumerator(parNumerator);
        return this;
    }

    /**
     * H.264 Profile.
     * 
     * @param profile
     *        H.264 Profile.
     * @see H264Profile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * H.264 Profile.
     * 
     * @return H.264 Profile.
     * @see H264Profile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * H.264 Profile.
     * 
     * @param profile
     *        H.264 Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Profile
     */

    public H264Settings withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * H.264 Profile.
     * 
     * @param profile
     *        H.264 Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Profile
     */

    public H264Settings withProfile(H264Profile profile) {
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

    public H264Settings withQvbrQualityLevel(Integer qvbrQualityLevel) {
        setQvbrQualityLevel(qvbrQualityLevel);
        return this;
    }

    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want to
     * maintain a specific average bitrate over the duration of the channel.
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
     *        VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want
     *        to maintain a specific average bitrate over the duration of the channel.
     * 
     *        CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *        devices that cannot handle variable bitrates.
     * @see H264RateControlMode
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
     * VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want to
     * maintain a specific average bitrate over the duration of the channel.
     * 
     * CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to devices
     * that cannot handle variable bitrates.
     * 
     * @return Rate control mode.
     * 
     *         QVBR: Quality will match the specified quality level except when it is constrained by the maximum
     *         bitrate. Recommended if you or your viewers pay for bandwidth.
     * 
     *         VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want
     *         to maintain a specific average bitrate over the duration of the channel.
     * 
     *         CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *         devices that cannot handle variable bitrates.
     * @see H264RateControlMode
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
     * VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want to
     * maintain a specific average bitrate over the duration of the channel.
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
     *        VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want
     *        to maintain a specific average bitrate over the duration of the channel.
     * 
     *        CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *        devices that cannot handle variable bitrates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264RateControlMode
     */

    public H264Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Rate control mode.
     * 
     * QVBR: Quality will match the specified quality level except when it is constrained by the maximum bitrate.
     * Recommended if you or your viewers pay for bandwidth.
     * 
     * VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want to
     * maintain a specific average bitrate over the duration of the channel.
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
     *        VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR if you want
     *        to maintain a specific average bitrate over the duration of the channel.
     * 
     *        CBR: Quality varies, depending on the video complexity. Recommended only if you distribute your assets to
     *        devices that cannot handle variable bitrates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264RateControlMode
     */

    public H264Settings withRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @param scanType
     *        Sets the scan type of the output to progressive or top-field-first interlaced.
     * @see H264ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @return Sets the scan type of the output to progressive or top-field-first interlaced.
     * @see H264ScanType
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
     * @see H264ScanType
     */

    public H264Settings withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first interlaced.
     * 
     * @param scanType
     *        Sets the scan type of the output to progressive or top-field-first interlaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264ScanType
     */

    public H264Settings withScanType(H264ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * Scene change detection.
     * 
     * - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change is
     * detected.
     * 
     * @param sceneChangeDetect
     *        Scene change detection.
     * 
     *        - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change
     *        is detected.
     * @see H264SceneChangeDetect
     */

    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Scene change detection.
     * 
     * - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change is
     * detected.
     * 
     * @return Scene change detection.
     * 
     *         - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change
     *         is detected.
     * @see H264SceneChangeDetect
     */

    public String getSceneChangeDetect() {
        return this.sceneChangeDetect;
    }

    /**
     * Scene change detection.
     * 
     * - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change is
     * detected.
     * 
     * @param sceneChangeDetect
     *        Scene change detection.
     * 
     *        - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change
     *        is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SceneChangeDetect
     */

    public H264Settings withSceneChangeDetect(String sceneChangeDetect) {
        setSceneChangeDetect(sceneChangeDetect);
        return this;
    }

    /**
     * Scene change detection.
     * 
     * - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change is
     * detected.
     * 
     * @param sceneChangeDetect
     *        Scene change detection.
     * 
     *        - On: inserts I-frames when scene change is detected. - Off: does not force an I-frame when scene change
     *        is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SceneChangeDetect
     */

    public H264Settings withSceneChangeDetect(H264SceneChangeDetect sceneChangeDetect) {
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

    public H264Settings withSlices(Integer slices) {
        setSlices(slices);
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

    public H264Settings withSoftness(Integer softness) {
        setSoftness(softness);
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAq
     *        If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * @see H264SpatialAq
     */

    public void setSpatialAq(String spatialAq) {
        this.spatialAq = spatialAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @return If set to enabled, adjust quantization within each frame based on spatial variation of content
     *         complexity.
     * @see H264SpatialAq
     */

    public String getSpatialAq() {
        return this.spatialAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAq
     *        If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SpatialAq
     */

    public H264Settings withSpatialAq(String spatialAq) {
        setSpatialAq(spatialAq);
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * 
     * @param spatialAq
     *        If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SpatialAq
     */

    public H264Settings withSpatialAq(H264SpatialAq spatialAq) {
        this.spatialAq = spatialAq.toString();
        return this;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used
     * for each sub-GOP to improve visual quality.
     * 
     * @param subgopLength
     *        If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of
     *        B-frames used for each sub-GOP to improve visual quality.
     * @see H264SubGopLength
     */

    public void setSubgopLength(String subgopLength) {
        this.subgopLength = subgopLength;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used
     * for each sub-GOP to improve visual quality.
     * 
     * @return If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of
     *         B-frames used for each sub-GOP to improve visual quality.
     * @see H264SubGopLength
     */

    public String getSubgopLength() {
        return this.subgopLength;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used
     * for each sub-GOP to improve visual quality.
     * 
     * @param subgopLength
     *        If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of
     *        B-frames used for each sub-GOP to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SubGopLength
     */

    public H264Settings withSubgopLength(String subgopLength) {
        setSubgopLength(subgopLength);
        return this;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used
     * for each sub-GOP to improve visual quality.
     * 
     * @param subgopLength
     *        If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of
     *        B-frames used for each sub-GOP to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SubGopLength
     */

    public H264Settings withSubgopLength(H264SubGopLength subgopLength) {
        this.subgopLength = subgopLength.toString();
        return this;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * 
     * @param syntax
     *        Produces a bitstream compliant with SMPTE RP-2027.
     * @see H264Syntax
     */

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * 
     * @return Produces a bitstream compliant with SMPTE RP-2027.
     * @see H264Syntax
     */

    public String getSyntax() {
        return this.syntax;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * 
     * @param syntax
     *        Produces a bitstream compliant with SMPTE RP-2027.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Syntax
     */

    public H264Settings withSyntax(String syntax) {
        setSyntax(syntax);
        return this;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * 
     * @param syntax
     *        Produces a bitstream compliant with SMPTE RP-2027.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Syntax
     */

    public H264Settings withSyntax(H264Syntax syntax) {
        this.syntax = syntax.toString();
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @param temporalAq
     *        If set to enabled, adjust quantization within each frame based on temporal variation of content
     *        complexity.
     * @see H264TemporalAq
     */

    public void setTemporalAq(String temporalAq) {
        this.temporalAq = temporalAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @return If set to enabled, adjust quantization within each frame based on temporal variation of content
     *         complexity.
     * @see H264TemporalAq
     */

    public String getTemporalAq() {
        return this.temporalAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @param temporalAq
     *        If set to enabled, adjust quantization within each frame based on temporal variation of content
     *        complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264TemporalAq
     */

    public H264Settings withTemporalAq(String temporalAq) {
        setTemporalAq(temporalAq);
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
     * 
     * @param temporalAq
     *        If set to enabled, adjust quantization within each frame based on temporal variation of content
     *        complexity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264TemporalAq
     */

    public H264Settings withTemporalAq(H264TemporalAq temporalAq) {
        this.temporalAq = temporalAq.toString();
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
     * @see H264TimecodeInsertionBehavior
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
     * @see H264TimecodeInsertionBehavior
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
     * @see H264TimecodeInsertionBehavior
     */

    public H264Settings withTimecodeInsertion(String timecodeInsertion) {
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
     * @see H264TimecodeInsertionBehavior
     */

    public H264Settings withTimecodeInsertion(H264TimecodeInsertionBehavior timecodeInsertion) {
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
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBufFillPct() != null)
            sb.append("BufFillPct: ").append(getBufFillPct()).append(",");
        if (getBufSize() != null)
            sb.append("BufSize: ").append(getBufSize()).append(",");
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: ").append(getColorMetadata()).append(",");
        if (getEntropyEncoding() != null)
            sb.append("EntropyEncoding: ").append(getEntropyEncoding()).append(",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: ").append(getFixedAfd()).append(",");
        if (getFlickerAq() != null)
            sb.append("FlickerAq: ").append(getFlickerAq()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopBReference() != null)
            sb.append("GopBReference: ").append(getGopBReference()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getGopNumBFrames() != null)
            sb.append("GopNumBFrames: ").append(getGopNumBFrames()).append(",");
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
        if (getNumRefFrames() != null)
            sb.append("NumRefFrames: ").append(getNumRefFrames()).append(",");
        if (getParControl() != null)
            sb.append("ParControl: ").append(getParControl()).append(",");
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
        if (getSoftness() != null)
            sb.append("Softness: ").append(getSoftness()).append(",");
        if (getSpatialAq() != null)
            sb.append("SpatialAq: ").append(getSpatialAq()).append(",");
        if (getSubgopLength() != null)
            sb.append("SubgopLength: ").append(getSubgopLength()).append(",");
        if (getSyntax() != null)
            sb.append("Syntax: ").append(getSyntax()).append(",");
        if (getTemporalAq() != null)
            sb.append("TemporalAq: ").append(getTemporalAq()).append(",");
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

        if (obj instanceof H264Settings == false)
            return false;
        H264Settings other = (H264Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBufFillPct() == null ^ this.getBufFillPct() == null)
            return false;
        if (other.getBufFillPct() != null && other.getBufFillPct().equals(this.getBufFillPct()) == false)
            return false;
        if (other.getBufSize() == null ^ this.getBufSize() == null)
            return false;
        if (other.getBufSize() != null && other.getBufSize().equals(this.getBufSize()) == false)
            return false;
        if (other.getColorMetadata() == null ^ this.getColorMetadata() == null)
            return false;
        if (other.getColorMetadata() != null && other.getColorMetadata().equals(this.getColorMetadata()) == false)
            return false;
        if (other.getEntropyEncoding() == null ^ this.getEntropyEncoding() == null)
            return false;
        if (other.getEntropyEncoding() != null && other.getEntropyEncoding().equals(this.getEntropyEncoding()) == false)
            return false;
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
            return false;
        if (other.getFlickerAq() == null ^ this.getFlickerAq() == null)
            return false;
        if (other.getFlickerAq() != null && other.getFlickerAq().equals(this.getFlickerAq()) == false)
            return false;
        if (other.getFramerateControl() == null ^ this.getFramerateControl() == null)
            return false;
        if (other.getFramerateControl() != null && other.getFramerateControl().equals(this.getFramerateControl()) == false)
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
        if (other.getGopNumBFrames() == null ^ this.getGopNumBFrames() == null)
            return false;
        if (other.getGopNumBFrames() != null && other.getGopNumBFrames().equals(this.getGopNumBFrames()) == false)
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
        if (other.getNumRefFrames() == null ^ this.getNumRefFrames() == null)
            return false;
        if (other.getNumRefFrames() != null && other.getNumRefFrames().equals(this.getNumRefFrames()) == false)
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
        if (other.getSoftness() == null ^ this.getSoftness() == null)
            return false;
        if (other.getSoftness() != null && other.getSoftness().equals(this.getSoftness()) == false)
            return false;
        if (other.getSpatialAq() == null ^ this.getSpatialAq() == null)
            return false;
        if (other.getSpatialAq() != null && other.getSpatialAq().equals(this.getSpatialAq()) == false)
            return false;
        if (other.getSubgopLength() == null ^ this.getSubgopLength() == null)
            return false;
        if (other.getSubgopLength() != null && other.getSubgopLength().equals(this.getSubgopLength()) == false)
            return false;
        if (other.getSyntax() == null ^ this.getSyntax() == null)
            return false;
        if (other.getSyntax() != null && other.getSyntax().equals(this.getSyntax()) == false)
            return false;
        if (other.getTemporalAq() == null ^ this.getTemporalAq() == null)
            return false;
        if (other.getTemporalAq() != null && other.getTemporalAq().equals(this.getTemporalAq()) == false)
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
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBufFillPct() == null) ? 0 : getBufFillPct().hashCode());
        hashCode = prime * hashCode + ((getBufSize() == null) ? 0 : getBufSize().hashCode());
        hashCode = prime * hashCode + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode + ((getEntropyEncoding() == null) ? 0 : getEntropyEncoding().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getFlickerAq() == null) ? 0 : getFlickerAq().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopNumBFrames() == null) ? 0 : getGopNumBFrames().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getLookAheadRateControl() == null) ? 0 : getLookAheadRateControl().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode + ((getNumRefFrames() == null) ? 0 : getNumRefFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getQvbrQualityLevel() == null) ? 0 : getQvbrQualityLevel().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime * hashCode + ((getSpatialAq() == null) ? 0 : getSpatialAq().hashCode());
        hashCode = prime * hashCode + ((getSubgopLength() == null) ? 0 : getSubgopLength().hashCode());
        hashCode = prime * hashCode + ((getSyntax() == null) ? 0 : getSyntax().hashCode());
        hashCode = prime * hashCode + ((getTemporalAq() == null) ? 0 : getTemporalAq().hashCode());
        hashCode = prime * hashCode + ((getTimecodeInsertion() == null) ? 0 : getTimecodeInsertion().hashCode());
        return hashCode;
    }

    @Override
    public H264Settings clone() {
        try {
            return (H264Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.H264SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
