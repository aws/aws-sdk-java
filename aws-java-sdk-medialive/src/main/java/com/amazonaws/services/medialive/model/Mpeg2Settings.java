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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Mpeg2 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Mpeg2Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mpeg2Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     * strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     * intra-frame quantizers to vary, which might improve visual quality.
     */
    private String adaptiveQuantization;
    /**
     * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling
     * is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will try to preserve
     * the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will use the value you
     * specify in fixedAFD.
     */
    private String afdSignaling;
    /**
     * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the
     * video (the colorSpace field). We recommend that you insert the metadata.
     */
    private String colorMetadata;
    /**
     * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the
     * input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features -
     * Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color space of the input content - do not
     * convert it. AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
     */
    private String colorSpace;
    /** Sets the pixel aspect ratio for the encode. */
    private String displayAspectRatio;
    /**
     * Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do not
     * choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content that is noisy
     * (when it has excessive digital artifacts) and source content that is clean. When the content is noisy, the filter
     * cleans up the source content before the encoding phase, with these two effects: First, it improves the output
     * video quality because the content has been cleaned up. Secondly, it decreases the bandwidth because MediaLive
     * does not waste bits on encoding noise. When the content is reasonably clean, the filter tends to decrease the
     * bitrate.
     */
    private Mpeg2FilterSettings filterSettings;
    /**
     * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames
     * of the video encode.
     */
    private String fixedAfd;
    /**
     * description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the
     * denominator. For example, 24000 / 1001 = 23.976 FPS.
     */
    private Integer framerateDenominator;
    /**
     * The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator. For
     * example, 24000 / 1001 = 23.976 FPS.
     */
    private Integer framerateNumerator;
    /** MPEG2: default is open GOP. */
    private Integer gopClosedCadence;
    /**
     * Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a B-frame
     * is, use the default.
     */
    private Integer gopNumBFrames;
    /**
     * Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do
     * not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an integer and must be
     * greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to
     * be an integer.
     */
    private Double gopSize;
    /**
     * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan
     * to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the
     * gop size to a frame count.
     */
    private String gopSizeUnits;
    /** Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first). */
    private String scanType;
    /**
     * Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of B-frames
     * in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of B-frames in each
     * sub-GOP, to improve visual quality.
     */
    private String subgopLength;
    /**
     * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the
     * input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the
     * MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include timecode metadata in the GOP
     * header.
     */
    private String timecodeInsertion;

    /**
     * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     * strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     * intra-frame quantizers to vary, which might improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     *        strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     *        intra-frame quantizers to vary, which might improve visual quality.
     * @see Mpeg2AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     * strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     * intra-frame quantizers to vary, which might improve visual quality.
     * 
     * @return Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     *         strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     *         intra-frame quantizers to vary, which might improve visual quality.
     * @see Mpeg2AdaptiveQuantization
     */

    public String getAdaptiveQuantization() {
        return this.adaptiveQuantization;
    }

    /**
     * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     * strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     * intra-frame quantizers to vary, which might improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     *        strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     *        intra-frame quantizers to vary, which might improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2AdaptiveQuantization
     */

    public Mpeg2Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     * strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     * intra-frame quantizers to vary, which might improve visual quality.
     * 
     * @param adaptiveQuantization
     *        Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its
     *        strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows
     *        intra-frame quantizers to vary, which might improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2AdaptiveQuantization
     */

    public Mpeg2Settings withAdaptiveQuantization(Mpeg2AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling
     * is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will try to preserve
     * the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will use the value you
     * specify in fixedAFD.
     * 
     * @param afdSignaling
     *        Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD
     *        signaling is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will
     *        try to preserve the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will
     *        use the value you specify in fixedAFD.
     * @see AfdSignaling
     */

    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling
     * is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will try to preserve
     * the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will use the value you
     * specify in fixedAFD.
     * 
     * @return Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD
     *         signaling is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will
     *         try to preserve the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will
     *         use the value you specify in fixedAFD.
     * @see AfdSignaling
     */

    public String getAfdSignaling() {
        return this.afdSignaling;
    }

    /**
     * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling
     * is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will try to preserve
     * the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will use the value you
     * specify in fixedAFD.
     * 
     * @param afdSignaling
     *        Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD
     *        signaling is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will
     *        try to preserve the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will
     *        use the value you specify in fixedAFD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AfdSignaling
     */

    public Mpeg2Settings withAfdSignaling(String afdSignaling) {
        setAfdSignaling(afdSignaling);
        return this;
    }

    /**
     * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling
     * is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will try to preserve
     * the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will use the value you
     * specify in fixedAFD.
     * 
     * @param afdSignaling
     *        Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD
     *        signaling is, or if your downstream system has not given you guidance, choose AUTO. AUTO: MediaLive will
     *        try to preserve the input AFD value (in cases where multiple AFD values are valid). FIXED: MediaLive will
     *        use the value you specify in fixedAFD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AfdSignaling
     */

    public Mpeg2Settings withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the
     * video (the colorSpace field). We recommend that you insert the metadata.
     * 
     * @param colorMetadata
     *        Specifies whether to include the color space metadata. The metadata describes the color space that applies
     *        to the video (the colorSpace field). We recommend that you insert the metadata.
     * @see Mpeg2ColorMetadata
     */

    public void setColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
    }

    /**
     * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the
     * video (the colorSpace field). We recommend that you insert the metadata.
     * 
     * @return Specifies whether to include the color space metadata. The metadata describes the color space that
     *         applies to the video (the colorSpace field). We recommend that you insert the metadata.
     * @see Mpeg2ColorMetadata
     */

    public String getColorMetadata() {
        return this.colorMetadata;
    }

    /**
     * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the
     * video (the colorSpace field). We recommend that you insert the metadata.
     * 
     * @param colorMetadata
     *        Specifies whether to include the color space metadata. The metadata describes the color space that applies
     *        to the video (the colorSpace field). We recommend that you insert the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ColorMetadata
     */

    public Mpeg2Settings withColorMetadata(String colorMetadata) {
        setColorMetadata(colorMetadata);
        return this;
    }

    /**
     * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the
     * video (the colorSpace field). We recommend that you insert the metadata.
     * 
     * @param colorMetadata
     *        Specifies whether to include the color space metadata. The metadata describes the color space that applies
     *        to the video (the colorSpace field). We recommend that you insert the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ColorMetadata
     */

    public Mpeg2Settings withColorMetadata(Mpeg2ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the
     * input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features -
     * Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color space of the input content - do not
     * convert it. AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
     * 
     * @param colorSpace
     *        Choose the type of color space conversion to apply to the output. For detailed information on setting up
     *        both the input and the output to obtain the desired color space in the output, see the section on
     *        \"MediaLive Features - Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color
     *        space of the input content - do not convert it. AUTO:Convert all content that is SD to rec 601, and
     *        convert all content that is HD to rec 709.
     * @see Mpeg2ColorSpace
     */

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    /**
     * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the
     * input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features -
     * Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color space of the input content - do not
     * convert it. AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
     * 
     * @return Choose the type of color space conversion to apply to the output. For detailed information on setting up
     *         both the input and the output to obtain the desired color space in the output, see the section on
     *         \"MediaLive Features - Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color
     *         space of the input content - do not convert it. AUTO:Convert all content that is SD to rec 601, and
     *         convert all content that is HD to rec 709.
     * @see Mpeg2ColorSpace
     */

    public String getColorSpace() {
        return this.colorSpace;
    }

    /**
     * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the
     * input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features -
     * Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color space of the input content - do not
     * convert it. AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
     * 
     * @param colorSpace
     *        Choose the type of color space conversion to apply to the output. For detailed information on setting up
     *        both the input and the output to obtain the desired color space in the output, see the section on
     *        \"MediaLive Features - Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color
     *        space of the input content - do not convert it. AUTO:Convert all content that is SD to rec 601, and
     *        convert all content that is HD to rec 709.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ColorSpace
     */

    public Mpeg2Settings withColorSpace(String colorSpace) {
        setColorSpace(colorSpace);
        return this;
    }

    /**
     * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the
     * input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features -
     * Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color space of the input content - do not
     * convert it. AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
     * 
     * @param colorSpace
     *        Choose the type of color space conversion to apply to the output. For detailed information on setting up
     *        both the input and the output to obtain the desired color space in the output, see the section on
     *        \"MediaLive Features - Video - color space\" in the MediaLive User Guide. PASSTHROUGH: Keep the color
     *        space of the input content - do not convert it. AUTO:Convert all content that is SD to rec 601, and
     *        convert all content that is HD to rec 709.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ColorSpace
     */

    public Mpeg2Settings withColorSpace(Mpeg2ColorSpace colorSpace) {
        this.colorSpace = colorSpace.toString();
        return this;
    }

    /**
     * Sets the pixel aspect ratio for the encode.
     * 
     * @param displayAspectRatio
     *        Sets the pixel aspect ratio for the encode.
     * @see Mpeg2DisplayRatio
     */

    public void setDisplayAspectRatio(String displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
    }

    /**
     * Sets the pixel aspect ratio for the encode.
     * 
     * @return Sets the pixel aspect ratio for the encode.
     * @see Mpeg2DisplayRatio
     */

    public String getDisplayAspectRatio() {
        return this.displayAspectRatio;
    }

    /**
     * Sets the pixel aspect ratio for the encode.
     * 
     * @param displayAspectRatio
     *        Sets the pixel aspect ratio for the encode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2DisplayRatio
     */

    public Mpeg2Settings withDisplayAspectRatio(String displayAspectRatio) {
        setDisplayAspectRatio(displayAspectRatio);
        return this;
    }

    /**
     * Sets the pixel aspect ratio for the encode.
     * 
     * @param displayAspectRatio
     *        Sets the pixel aspect ratio for the encode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2DisplayRatio
     */

    public Mpeg2Settings withDisplayAspectRatio(Mpeg2DisplayRatio displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio.toString();
        return this;
    }

    /**
     * Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do not
     * choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content that is noisy
     * (when it has excessive digital artifacts) and source content that is clean. When the content is noisy, the filter
     * cleans up the source content before the encoding phase, with these two effects: First, it improves the output
     * video quality because the content has been cleaned up. Secondly, it decreases the bandwidth because MediaLive
     * does not waste bits on encoding noise. When the content is reasonably clean, the filter tends to decrease the
     * bitrate.
     * 
     * @param filterSettings
     *        Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do
     *        not choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content
     *        that is noisy (when it has excessive digital artifacts) and source content that is clean. When the content
     *        is noisy, the filter cleans up the source content before the encoding phase, with these two effects:
     *        First, it improves the output video quality because the content has been cleaned up. Secondly, it
     *        decreases the bandwidth because MediaLive does not waste bits on encoding noise. When the content is
     *        reasonably clean, the filter tends to decrease the bitrate.
     */

    public void setFilterSettings(Mpeg2FilterSettings filterSettings) {
        this.filterSettings = filterSettings;
    }

    /**
     * Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do not
     * choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content that is noisy
     * (when it has excessive digital artifacts) and source content that is clean. When the content is noisy, the filter
     * cleans up the source content before the encoding phase, with these two effects: First, it improves the output
     * video quality because the content has been cleaned up. Secondly, it decreases the bandwidth because MediaLive
     * does not waste bits on encoding noise. When the content is reasonably clean, the filter tends to decrease the
     * bitrate.
     * 
     * @return Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do
     *         not choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content
     *         that is noisy (when it has excessive digital artifacts) and source content that is clean. When the
     *         content is noisy, the filter cleans up the source content before the encoding phase, with these two
     *         effects: First, it improves the output video quality because the content has been cleaned up. Secondly,
     *         it decreases the bandwidth because MediaLive does not waste bits on encoding noise. When the content is
     *         reasonably clean, the filter tends to decrease the bitrate.
     */

    public Mpeg2FilterSettings getFilterSettings() {
        return this.filterSettings;
    }

    /**
     * Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do not
     * choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content that is noisy
     * (when it has excessive digital artifacts) and source content that is clean. When the content is noisy, the filter
     * cleans up the source content before the encoding phase, with these two effects: First, it improves the output
     * video quality because the content has been cleaned up. Secondly, it decreases the bandwidth because MediaLive
     * does not waste bits on encoding noise. When the content is reasonably clean, the filter tends to decrease the
     * bitrate.
     * 
     * @param filterSettings
     *        Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do
     *        not choose a filter, no filter will be applied. TEMPORAL: This filter is useful for both source content
     *        that is noisy (when it has excessive digital artifacts) and source content that is clean. When the content
     *        is noisy, the filter cleans up the source content before the encoding phase, with these two effects:
     *        First, it improves the output video quality because the content has been cleaned up. Secondly, it
     *        decreases the bandwidth because MediaLive does not waste bits on encoding noise. When the content is
     *        reasonably clean, the filter tends to decrease the bitrate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFilterSettings(Mpeg2FilterSettings filterSettings) {
        setFilterSettings(filterSettings);
        return this;
    }

    /**
     * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames
     * of the video encode.
     * 
     * @param fixedAfd
     *        Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all
     *        frames of the video encode.
     * @see FixedAfd
     */

    public void setFixedAfd(String fixedAfd) {
        this.fixedAfd = fixedAfd;
    }

    /**
     * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames
     * of the video encode.
     * 
     * @return Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all
     *         frames of the video encode.
     * @see FixedAfd
     */

    public String getFixedAfd() {
        return this.fixedAfd;
    }

    /**
     * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames
     * of the video encode.
     * 
     * @param fixedAfd
     *        Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all
     *        frames of the video encode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixedAfd
     */

    public Mpeg2Settings withFixedAfd(String fixedAfd) {
        setFixedAfd(fixedAfd);
        return this;
    }

    /**
     * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames
     * of the video encode.
     * 
     * @param fixedAfd
     *        Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all
     *        frames of the video encode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixedAfd
     */

    public Mpeg2Settings withFixedAfd(FixedAfd fixedAfd) {
        this.fixedAfd = fixedAfd.toString();
        return this;
    }

    /**
     * description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the
     * denominator. For example, 24000 / 1001 = 23.976 FPS.
     * 
     * @param framerateDenominator
     *        description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the
     *        denominator. For example, 24000 / 1001 = 23.976 FPS.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the
     * denominator. For example, 24000 / 1001 = 23.976 FPS.
     * 
     * @return description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by
     *         the denominator. For example, 24000 / 1001 = 23.976 FPS.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the
     * denominator. For example, 24000 / 1001 = 23.976 FPS.
     * 
     * @param framerateDenominator
     *        description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the
     *        denominator. For example, 24000 / 1001 = 23.976 FPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator. For
     * example, 24000 / 1001 = 23.976 FPS.
     * 
     * @param framerateNumerator
     *        The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator.
     *        For example, 24000 / 1001 = 23.976 FPS.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator. For
     * example, 24000 / 1001 = 23.976 FPS.
     * 
     * @return The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator.
     *         For example, 24000 / 1001 = 23.976 FPS.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator. For
     * example, 24000 / 1001 = 23.976 FPS.
     * 
     * @param framerateNumerator
     *        The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator.
     *        For example, 24000 / 1001 = 23.976 FPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * MPEG2: default is open GOP.
     * 
     * @param gopClosedCadence
     *        MPEG2: default is open GOP.
     */

    public void setGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
    }

    /**
     * MPEG2: default is open GOP.
     * 
     * @return MPEG2: default is open GOP.
     */

    public Integer getGopClosedCadence() {
        return this.gopClosedCadence;
    }

    /**
     * MPEG2: default is open GOP.
     * 
     * @param gopClosedCadence
     *        MPEG2: default is open GOP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a B-frame
     * is, use the default.
     * 
     * @param gopNumBFrames
     *        Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a
     *        B-frame is, use the default.
     */

    public void setGopNumBFrames(Integer gopNumBFrames) {
        this.gopNumBFrames = gopNumBFrames;
    }

    /**
     * Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a B-frame
     * is, use the default.
     * 
     * @return Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a
     *         B-frame is, use the default.
     */

    public Integer getGopNumBFrames() {
        return this.gopNumBFrames;
    }

    /**
     * Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a B-frame
     * is, use the default.
     * 
     * @param gopNumBFrames
     *        Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a
     *        B-frame is, use the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withGopNumBFrames(Integer gopNumBFrames) {
        setGopNumBFrames(gopNumBFrames);
        return this;
    }

    /**
     * Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do
     * not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an integer and must be
     * greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to
     * be an integer.
     * 
     * @param gopSize
     *        Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If
     *        you do not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an
     *        integer and must be greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater
     *        than 0, but does not need to be an integer.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do
     * not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an integer and must be
     * greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to
     * be an integer.
     * 
     * @return Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If
     *         you do not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an
     *         integer and must be greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater
     *         than 0, but does not need to be an integer.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do
     * not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an integer and must be
     * greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to
     * be an integer.
     * 
     * @param gopSize
     *        Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If
     *        you do not know what GOP is, use the default. If gopSizeUnits is frames, then the gopSize must be an
     *        integer and must be greater than or equal to 1. If gopSizeUnits is seconds, the gopSize must be greater
     *        than 0, but does not need to be an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mpeg2Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan
     * to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the
     * gop size to a frame count.
     * 
     * @param gopSizeUnits
     *        Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do
     *        not plan to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will
     *        internally convert the gop size to a frame count.
     * @see Mpeg2GopSizeUnits
     */

    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan
     * to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the
     * gop size to a frame count.
     * 
     * @return Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do
     *         not plan to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will
     *         internally convert the gop size to a frame count.
     * @see Mpeg2GopSizeUnits
     */

    public String getGopSizeUnits() {
        return this.gopSizeUnits;
    }

    /**
     * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan
     * to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the
     * gop size to a frame count.
     * 
     * @param gopSizeUnits
     *        Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do
     *        not plan to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will
     *        internally convert the gop size to a frame count.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2GopSizeUnits
     */

    public Mpeg2Settings withGopSizeUnits(String gopSizeUnits) {
        setGopSizeUnits(gopSizeUnits);
        return this;
    }

    /**
     * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan
     * to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the
     * gop size to a frame count.
     * 
     * @param gopSizeUnits
     *        Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do
     *        not plan to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will
     *        internally convert the gop size to a frame count.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2GopSizeUnits
     */

    public Mpeg2Settings withGopSizeUnits(Mpeg2GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * 
     * @param scanType
     *        Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * @see Mpeg2ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * 
     * @return Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * @see Mpeg2ScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * 
     * @param scanType
     *        Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ScanType
     */

    public Mpeg2Settings withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * 
     * @param scanType
     *        Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2ScanType
     */

    public Mpeg2Settings withScanType(Mpeg2ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of B-frames
     * in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of B-frames in each
     * sub-GOP, to improve visual quality.
     * 
     * @param subgopLength
     *        Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of
     *        B-frames in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of
     *        B-frames in each sub-GOP, to improve visual quality.
     * @see Mpeg2SubGopLength
     */

    public void setSubgopLength(String subgopLength) {
        this.subgopLength = subgopLength;
    }

    /**
     * Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of B-frames
     * in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of B-frames in each
     * sub-GOP, to improve visual quality.
     * 
     * @return Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of
     *         B-frames in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of
     *         B-frames in each sub-GOP, to improve visual quality.
     * @see Mpeg2SubGopLength
     */

    public String getSubgopLength() {
        return this.subgopLength;
    }

    /**
     * Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of B-frames
     * in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of B-frames in each
     * sub-GOP, to improve visual quality.
     * 
     * @param subgopLength
     *        Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of
     *        B-frames in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of
     *        B-frames in each sub-GOP, to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SubGopLength
     */

    public Mpeg2Settings withSubgopLength(String subgopLength) {
        setSubgopLength(subgopLength);
        return this;
    }

    /**
     * Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of B-frames
     * in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of B-frames in each
     * sub-GOP, to improve visual quality.
     * 
     * @param subgopLength
     *        Relates to the GOP structure. If you do not know what GOP is, use the default. FIXED: Set the number of
     *        B-frames in each sub-GOP to the value in gopNumBFrames. DYNAMIC: Let MediaLive optimize the number of
     *        B-frames in each sub-GOP, to improve visual quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2SubGopLength
     */

    public Mpeg2Settings withSubgopLength(Mpeg2SubGopLength subgopLength) {
        this.subgopLength = subgopLength.toString();
        return this;
    }

    /**
     * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the
     * input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the
     * MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include timecode metadata in the GOP
     * header.
     * 
     * @param timecodeInsertion
     *        Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up
     *        the input and the output for a timecode, see the section on \"MediaLive Features - Timecode
     *        configuration\" in the MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include
     *        timecode metadata in the GOP header.
     * @see Mpeg2TimecodeInsertionBehavior
     */

    public void setTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
    }

    /**
     * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the
     * input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the
     * MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include timecode metadata in the GOP
     * header.
     * 
     * @return Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up
     *         the input and the output for a timecode, see the section on \"MediaLive Features - Timecode
     *         configuration\" in the MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include
     *         timecode metadata in the GOP header.
     * @see Mpeg2TimecodeInsertionBehavior
     */

    public String getTimecodeInsertion() {
        return this.timecodeInsertion;
    }

    /**
     * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the
     * input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the
     * MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include timecode metadata in the GOP
     * header.
     * 
     * @param timecodeInsertion
     *        Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up
     *        the input and the output for a timecode, see the section on \"MediaLive Features - Timecode
     *        configuration\" in the MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include
     *        timecode metadata in the GOP header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2TimecodeInsertionBehavior
     */

    public Mpeg2Settings withTimecodeInsertion(String timecodeInsertion) {
        setTimecodeInsertion(timecodeInsertion);
        return this;
    }

    /**
     * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the
     * input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the
     * MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include timecode metadata in the GOP
     * header.
     * 
     * @param timecodeInsertion
     *        Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up
     *        the input and the output for a timecode, see the section on \"MediaLive Features - Timecode
     *        configuration\" in the MediaLive User Guide. DISABLED: do not include timecodes. GOP_TIMECODE: Include
     *        timecode metadata in the GOP header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mpeg2TimecodeInsertionBehavior
     */

    public Mpeg2Settings withTimecodeInsertion(Mpeg2TimecodeInsertionBehavior timecodeInsertion) {
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
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: ").append(getColorMetadata()).append(",");
        if (getColorSpace() != null)
            sb.append("ColorSpace: ").append(getColorSpace()).append(",");
        if (getDisplayAspectRatio() != null)
            sb.append("DisplayAspectRatio: ").append(getDisplayAspectRatio()).append(",");
        if (getFilterSettings() != null)
            sb.append("FilterSettings: ").append(getFilterSettings()).append(",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: ").append(getFixedAfd()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getGopNumBFrames() != null)
            sb.append("GopNumBFrames: ").append(getGopNumBFrames()).append(",");
        if (getGopSize() != null)
            sb.append("GopSize: ").append(getGopSize()).append(",");
        if (getGopSizeUnits() != null)
            sb.append("GopSizeUnits: ").append(getGopSizeUnits()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType()).append(",");
        if (getSubgopLength() != null)
            sb.append("SubgopLength: ").append(getSubgopLength()).append(",");
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

        if (obj instanceof Mpeg2Settings == false)
            return false;
        Mpeg2Settings other = (Mpeg2Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getColorMetadata() == null ^ this.getColorMetadata() == null)
            return false;
        if (other.getColorMetadata() != null && other.getColorMetadata().equals(this.getColorMetadata()) == false)
            return false;
        if (other.getColorSpace() == null ^ this.getColorSpace() == null)
            return false;
        if (other.getColorSpace() != null && other.getColorSpace().equals(this.getColorSpace()) == false)
            return false;
        if (other.getDisplayAspectRatio() == null ^ this.getDisplayAspectRatio() == null)
            return false;
        if (other.getDisplayAspectRatio() != null && other.getDisplayAspectRatio().equals(this.getDisplayAspectRatio()) == false)
            return false;
        if (other.getFilterSettings() == null ^ this.getFilterSettings() == null)
            return false;
        if (other.getFilterSettings() != null && other.getFilterSettings().equals(this.getFilterSettings()) == false)
            return false;
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
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
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getSubgopLength() == null ^ this.getSubgopLength() == null)
            return false;
        if (other.getSubgopLength() != null && other.getSubgopLength().equals(this.getSubgopLength()) == false)
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
        hashCode = prime * hashCode + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode + ((getColorSpace() == null) ? 0 : getColorSpace().hashCode());
        hashCode = prime * hashCode + ((getDisplayAspectRatio() == null) ? 0 : getDisplayAspectRatio().hashCode());
        hashCode = prime * hashCode + ((getFilterSettings() == null) ? 0 : getFilterSettings().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopNumBFrames() == null) ? 0 : getGopNumBFrames().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getSubgopLength() == null) ? 0 : getSubgopLength().hashCode());
        hashCode = prime * hashCode + ((getTimecodeInsertion() == null) ? 0 : getTimecodeInsertion().hashCode());
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
        com.amazonaws.services.medialive.model.transform.Mpeg2SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
