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
 * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/XavcHdProfileSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XavcHdProfileSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     */
    private String bitrateClass;
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
     * Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to 29.970. If
     * your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None (NONE). For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     */
    private String telecine;

    /**
     * Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @param bitrateClass
     *        Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *        have similar image quality over the operating points that are valid for that class.
     * @see XavcHdProfileBitrateClass
     */

    public void setBitrateClass(String bitrateClass) {
        this.bitrateClass = bitrateClass;
    }

    /**
     * Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @return Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *         have similar image quality over the operating points that are valid for that class.
     * @see XavcHdProfileBitrateClass
     */

    public String getBitrateClass() {
        return this.bitrateClass;
    }

    /**
     * Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @param bitrateClass
     *        Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *        have similar image quality over the operating points that are valid for that class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcHdProfileBitrateClass
     */

    public XavcHdProfileSettings withBitrateClass(String bitrateClass) {
        setBitrateClass(bitrateClass);
        return this;
    }

    /**
     * Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have
     * similar image quality over the operating points that are valid for that class.
     * 
     * @param bitrateClass
     *        Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class
     *        have similar image quality over the operating points that are valid for that class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcHdProfileBitrateClass
     */

    public XavcHdProfileSettings withBitrateClass(XavcHdProfileBitrateClass bitrateClass) {
        this.bitrateClass = bitrateClass.toString();
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

    public XavcHdProfileSettings withFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
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

    public XavcHdProfileSettings withFlickerAdaptiveQuantization(XavcFlickerAdaptiveQuantization flickerAdaptiveQuantization) {
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

    public XavcHdProfileSettings withGopBReference(String gopBReference) {
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

    public XavcHdProfileSettings withGopBReference(XavcGopBReference gopBReference) {
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

    public XavcHdProfileSettings withGopClosedCadence(Integer gopClosedCadence) {
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

    public XavcHdProfileSettings withHrdBufferSize(Integer hrdBufferSize) {
        setHrdBufferSize(hrdBufferSize);
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
     * @see XavcInterlaceMode
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
     * @see XavcInterlaceMode
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
     * @see XavcInterlaceMode
     */

    public XavcHdProfileSettings withInterlaceMode(String interlaceMode) {
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
     * @see XavcInterlaceMode
     */

    public XavcHdProfileSettings withInterlaceMode(XavcInterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for
     * output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed
     *        for output video quality. The default behavior is faster, lower quality, single-pass encoding.
     * @see XavcHdProfileQualityTuningLevel
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
     * @see XavcHdProfileQualityTuningLevel
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
     * @see XavcHdProfileQualityTuningLevel
     */

    public XavcHdProfileSettings withQualityTuningLevel(String qualityTuningLevel) {
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
     * @see XavcHdProfileQualityTuningLevel
     */

    public XavcHdProfileSettings withQualityTuningLevel(XavcHdProfileQualityTuningLevel qualityTuningLevel) {
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

    public XavcHdProfileSettings withSlices(Integer slices) {
        setSlices(slices);
        return this;
    }

    /**
     * Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to 29.970. If
     * your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None (NONE). For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * 
     * @param telecine
     *        Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to
     *        29.970. If your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None
     *        (NONE). For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * @see XavcHdProfileTelecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to 29.970. If
     * your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None (NONE). For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * 
     * @return Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to
     *         29.970. If your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None
     *         (NONE). For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * @see XavcHdProfileTelecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to 29.970. If
     * your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None (NONE). For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * 
     * @param telecine
     *        Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to
     *        29.970. If your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None
     *        (NONE). For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcHdProfileTelecine
     */

    public XavcHdProfileSettings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to 29.970. If
     * your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None (NONE). For more
     * information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * 
     * @param telecine
     *        Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to
     *        29.970. If your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None
     *        (NONE). For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XavcHdProfileTelecine
     */

    public XavcHdProfileSettings withTelecine(XavcHdProfileTelecine telecine) {
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
        if (getBitrateClass() != null)
            sb.append("BitrateClass: ").append(getBitrateClass()).append(",");
        if (getFlickerAdaptiveQuantization() != null)
            sb.append("FlickerAdaptiveQuantization: ").append(getFlickerAdaptiveQuantization()).append(",");
        if (getGopBReference() != null)
            sb.append("GopBReference: ").append(getGopBReference()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: ").append(getHrdBufferSize()).append(",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: ").append(getInterlaceMode()).append(",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel()).append(",");
        if (getSlices() != null)
            sb.append("Slices: ").append(getSlices()).append(",");
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

        if (obj instanceof XavcHdProfileSettings == false)
            return false;
        XavcHdProfileSettings other = (XavcHdProfileSettings) obj;
        if (other.getBitrateClass() == null ^ this.getBitrateClass() == null)
            return false;
        if (other.getBitrateClass() != null && other.getBitrateClass().equals(this.getBitrateClass()) == false)
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
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
            return false;
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
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

        hashCode = prime * hashCode + ((getBitrateClass() == null) ? 0 : getBitrateClass().hashCode());
        hashCode = prime * hashCode + ((getFlickerAdaptiveQuantization() == null) ? 0 : getFlickerAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        return hashCode;
    }

    @Override
    public XavcHdProfileSettings clone() {
        try {
            return (XavcHdProfileSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.XavcHdProfileSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
