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
 * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Xavc4kProfileSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Xavc4kProfileSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     */
    private String bitrateClass;
    /**
     * Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2 (HIGH_422).
     * These profiles are specified in ITU-T H.264.
     */
    private String codecProfile;
    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop.
     * I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks
     * many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder
     * updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default.
     * Related setting: In addition to enabling this setting, you must also set Adaptive quantization
     * (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the
     * degree of smoothing that Flicker adaptive quantization provides.
     */
    private String flickerAdaptiveQuantization;
    /**
     * Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose Allow
     * (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to prevent the
     * encoder from using B-frames as reference frames.
     */
    private String gopBReference;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /**
     * Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify this value
     * in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set it to zero,
     * MediaConvert calculates the default by doubling the bitrate of this output point.
     */
    private Integer hrdBufferSize;
    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     */
    private String qualityTuningLevel;
    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */
    private Integer slices;

    /**
     * Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @param bitrateClass
     *        Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *        have similar image quality over the operating points that are valid for that class.
     * @see Xavc4kProfileBitrateClass
     */

    public void setBitrateClass(String bitrateClass) {
        this.bitrateClass = bitrateClass;
    }

    /**
     * Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @return Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *         have similar image quality over the operating points that are valid for that class.
     * @see Xavc4kProfileBitrateClass
     */

    public String getBitrateClass() {
        return this.bitrateClass;
    }

    /**
     * Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @param bitrateClass
     *        Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *        have similar image quality over the operating points that are valid for that class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kProfileBitrateClass
     */

    public Xavc4kProfileSettings withBitrateClass(String bitrateClass) {
        setBitrateClass(bitrateClass);
        return this;
    }

    /**
     * Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @param bitrateClass
     *        Specify the XAVC 4k (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *        have similar image quality over the operating points that are valid for that class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kProfileBitrateClass
     */

    public Xavc4kProfileSettings withBitrateClass(Xavc4kProfileBitrateClass bitrateClass) {
        this.bitrateClass = bitrateClass.toString();
        return this;
    }

    /**
     * Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2 (HIGH_422).
     * These profiles are specified in ITU-T H.264.
     * 
     * @param codecProfile
     *        Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2
     *        (HIGH_422). These profiles are specified in ITU-T H.264.
     * @see Xavc4kProfileCodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2 (HIGH_422).
     * These profiles are specified in ITU-T H.264.
     * 
     * @return Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2
     *         (HIGH_422). These profiles are specified in ITU-T H.264.
     * @see Xavc4kProfileCodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2 (HIGH_422).
     * These profiles are specified in ITU-T H.264.
     * 
     * @param codecProfile
     *        Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2
     *        (HIGH_422). These profiles are specified in ITU-T H.264.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kProfileCodecProfile
     */

    public Xavc4kProfileSettings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2 (HIGH_422).
     * These profiles are specified in ITU-T H.264.
     * 
     * @param codecProfile
     *        Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2
     *        (HIGH_422). These profiles are specified in ITU-T H.264.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kProfileCodecProfile
     */

    public Xavc4kProfileSettings withCodecProfile(Xavc4kProfileCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop.
     * I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks
     * many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder
     * updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default.
     * Related setting: In addition to enabling this setting, you must also set Adaptive quantization
     * (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the
     * degree of smoothing that Flicker adaptive quantization provides.
     * 
     * @param flickerAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the
     *        best types of quantization for your video content. Include this setting in your JSON job specification
     *        only when you choose to change the default value for Adaptive quantization. Enable this setting to have
     *        the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder
     *        saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the
     *        I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth
     *        out the flicker. This setting is disabled by default. Related setting: In addition to enabling this
     *        setting, you must also set Adaptive quantization (adaptiveQuantization) to a value other than Off (OFF) or
     *        Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker adaptive
     *        quantization provides.
     * @see XavcFlickerAdaptiveQuantization
     */

    public void setFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop.
     * I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks
     * many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder
     * updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default.
     * Related setting: In addition to enabling this setting, you must also set Adaptive quantization
     * (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the
     * degree of smoothing that Flicker adaptive quantization provides.
     * 
     * @return The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *         Adaptive quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the
     *         best types of quantization for your video content. Include this setting in your JSON job specification
     *         only when you choose to change the default value for Adaptive quantization. Enable this setting to have
     *         the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder
     *         saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the
     *         I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to
     *         smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling
     *         this setting, you must also set Adaptive quantization (adaptiveQuantization) to a value other than Off
     *         (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker adaptive
     *         quantization provides.
     * @see XavcFlickerAdaptiveQuantization
     */

    public String getFlickerAdaptiveQuantization() {
        return this.flickerAdaptiveQuantization;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop.
     * I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks
     * many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder
     * updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default.
     * Related setting: In addition to enabling this setting, you must also set Adaptive quantization
     * (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the
     * degree of smoothing that Flicker adaptive quantization provides.
     * 
     * @param flickerAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the
     *        best types of quantization for your video content. Include this setting in your JSON job specification
     *        only when you choose to change the default value for Adaptive quantization. Enable this setting to have
     *        the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder
     *        saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the
     *        I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth
     *        out the flicker. This setting is disabled by default. Related setting: In addition to enabling this
     *        setting, you must also set Adaptive quantization (adaptiveQuantization) to a value other than Off (OFF) or
     *        Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker adaptive
     *        quantization provides.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcFlickerAdaptiveQuantization
     */

    public Xavc4kProfileSettings withFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        setFlickerAdaptiveQuantization(flickerAdaptiveQuantization);
        return this;
    }

    /**
     * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
     * quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
     * quantization for your video content. Include this setting in your JSON job specification only when you choose to
     * change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop.
     * I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks
     * many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder
     * updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default.
     * Related setting: In addition to enabling this setting, you must also set Adaptive quantization
     * (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the
     * degree of smoothing that Flicker adaptive quantization provides.
     * 
     * @param flickerAdaptiveQuantization
     *        The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting
     *        Adaptive quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the
     *        best types of quantization for your video content. Include this setting in your JSON job specification
     *        only when you choose to change the default value for Adaptive quantization. Enable this setting to have
     *        the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder
     *        saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the
     *        I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth
     *        out the flicker. This setting is disabled by default. Related setting: In addition to enabling this
     *        setting, you must also set Adaptive quantization (adaptiveQuantization) to a value other than Off (OFF) or
     *        Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker adaptive
     *        quantization provides.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcFlickerAdaptiveQuantization
     */

    public Xavc4kProfileSettings withFlickerAdaptiveQuantization(XavcFlickerAdaptiveQuantization flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization.toString();
        return this;
    }

    /**
     * Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose Allow
     * (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to prevent the
     * encoder from using B-frames as reference frames.
     * 
     * @param gopBReference
     *        Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose
     *        Allow (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to
     *        prevent the encoder from using B-frames as reference frames.
     * @see XavcGopBReference
     */

    public void setGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
    }

    /**
     * Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose Allow
     * (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to prevent the
     * encoder from using B-frames as reference frames.
     * 
     * @return Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose
     *         Allow (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED)
     *         to prevent the encoder from using B-frames as reference frames.
     * @see XavcGopBReference
     */

    public String getGopBReference() {
        return this.gopBReference;
    }

    /**
     * Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose Allow
     * (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to prevent the
     * encoder from using B-frames as reference frames.
     * 
     * @param gopBReference
     *        Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose
     *        Allow (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to
     *        prevent the encoder from using B-frames as reference frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcGopBReference
     */

    public Xavc4kProfileSettings withGopBReference(String gopBReference) {
        setGopBReference(gopBReference);
        return this;
    }

    /**
     * Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose Allow
     * (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to prevent the
     * encoder from using B-frames as reference frames.
     * 
     * @param gopBReference
     *        Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose
     *        Allow (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to
     *        prevent the encoder from using B-frames as reference frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcGopBReference
     */

    public Xavc4kProfileSettings withGopBReference(XavcGopBReference gopBReference) {
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

    public Xavc4kProfileSettings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify this value
     * in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set it to zero,
     * MediaConvert calculates the default by doubling the bitrate of this output point.
     * 
     * @param hrdBufferSize
     *        Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify
     *        this value in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set
     *        it to zero, MediaConvert calculates the default by doubling the bitrate of this output point.
     */

    public void setHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
    }

    /**
     * Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify this value
     * in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set it to zero,
     * MediaConvert calculates the default by doubling the bitrate of this output point.
     * 
     * @return Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify
     *         this value in bits; for example, enter five megabits as 5000000. When you don't set this value, or you
     *         set it to zero, MediaConvert calculates the default by doubling the bitrate of this output point.
     */

    public Integer getHrdBufferSize() {
        return this.hrdBufferSize;
    }

    /**
     * Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify this value
     * in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set it to zero,
     * MediaConvert calculates the default by doubling the bitrate of this output point.
     * 
     * @param hrdBufferSize
     *        Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify
     *        this value in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set
     *        it to zero, MediaConvert calculates the default by doubling the bitrate of this output point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Xavc4kProfileSettings withHrdBufferSize(Integer hrdBufferSize) {
        setHrdBufferSize(hrdBufferSize);
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @see Xavc4kProfileQualityTuningLevel
     */

    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @return Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding
     *         speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @see Xavc4kProfileQualityTuningLevel
     */

    public String getQualityTuningLevel() {
        return this.qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kProfileQualityTuningLevel
     */

    public Xavc4kProfileSettings withQualityTuningLevel(String qualityTuningLevel) {
        setQualityTuningLevel(qualityTuningLevel);
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kProfileQualityTuningLevel
     */

    public Xavc4kProfileSettings withQualityTuningLevel(Xavc4kProfileQualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
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

    public Xavc4kProfileSettings withSlices(Integer slices) {
        setSlices(slices);
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
        if (getBitrateClass() != null)
            sb.append("BitrateClass: ").append(getBitrateClass()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getFlickerAdaptiveQuantization() != null)
            sb.append("FlickerAdaptiveQuantization: ").append(getFlickerAdaptiveQuantization()).append(",");
        if (getGopBReference() != null)
            sb.append("GopBReference: ").append(getGopBReference()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: ").append(getHrdBufferSize()).append(",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel()).append(",");
        if (getSlices() != null)
            sb.append("Slices: ").append(getSlices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Xavc4kProfileSettings == false)
            return false;
        Xavc4kProfileSettings other = (Xavc4kProfileSettings) obj;
        if (other.getBitrateClass() == null ^ this.getBitrateClass() == null)
            return false;
        if (other.getBitrateClass() != null && other.getBitrateClass().equals(this.getBitrateClass()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getFlickerAdaptiveQuantization() == null ^ this.getFlickerAdaptiveQuantization() == null)
            return false;
        if (other.getFlickerAdaptiveQuantization() != null && other.getFlickerAdaptiveQuantization().equals(this.getFlickerAdaptiveQuantization()) == false)
            return false;
        if (other.getGopBReference() == null ^ this.getGopBReference() == null)
            return false;
        if (other.getGopBReference() != null && other.getGopBReference().equals(this.getGopBReference()) == false)
            return false;
        if (other.getGopClosedCadence() == null ^ this.getGopClosedCadence() == null)
            return false;
        if (other.getGopClosedCadence() != null && other.getGopClosedCadence().equals(this.getGopClosedCadence()) == false)
            return false;
        if (other.getHrdBufferSize() == null ^ this.getHrdBufferSize() == null)
            return false;
        if (other.getHrdBufferSize() != null && other.getHrdBufferSize().equals(this.getHrdBufferSize()) == false)
            return false;
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrateClass() == null) ? 0 : getBitrateClass().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getFlickerAdaptiveQuantization() == null) ? 0 : getFlickerAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        return hashCode;
    }

    @Override
    public Xavc4kProfileSettings clone() {
        try {
            return (Xavc4kProfileSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Xavc4kProfileSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
