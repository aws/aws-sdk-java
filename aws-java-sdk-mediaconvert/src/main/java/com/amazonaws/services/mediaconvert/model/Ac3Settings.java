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
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Ac3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ac3Settings implements Serializable, Cloneable, StructuredPojo {

    /** Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode. */
    private Integer bitrate;
    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     */
    private String bitstreamMode;
    /** Dolby Digital coding mode. Determines number of channels. */
    private String codingMode;
    /** Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through. */
    private Integer dialnorm;
    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     */
    private String dynamicRangeCompressionLine;
    /**
     * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you
     * use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The
     * mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic
     * range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three
     * settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use
     * this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the
     * default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     */
    private String dynamicRangeCompressionProfile;
    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     */
    private String dynamicRangeCompressionRf;
    /** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode. */
    private String lfeFilter;
    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     */
    private String metadataControl;
    /** This value is always 48000. It represents the sample rate in Hz. */
    private Integer sampleRate;

    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
     * 
     * @param bitrate
     *        Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
     * 
     * @return Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
     * 
     * @param bitrate
     *        Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @param bitstreamMode
     *        Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     *        bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Ac3BitstreamMode
     */

    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @return Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     *         bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Ac3BitstreamMode
     */

    public String getBitstreamMode() {
        return this.bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @param bitstreamMode
     *        Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     *        bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3BitstreamMode
     */

    public Ac3Settings withBitstreamMode(String bitstreamMode) {
        setBitstreamMode(bitstreamMode);
        return this;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @param bitstreamMode
     *        Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3
     *        bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3BitstreamMode
     */

    public Ac3Settings withBitstreamMode(Ac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital coding mode. Determines number of channels.
     * @see Ac3CodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * 
     * @return Dolby Digital coding mode. Determines number of channels.
     * @see Ac3CodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital coding mode. Determines number of channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3CodingMode
     */

    public Ac3Settings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital coding mode. Determines number of channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3CodingMode
     */

    public Ac3Settings withCodingMode(Ac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed
     *        through.
     */

    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @return Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed
     *         through.
     */

    public Integer getDialnorm() {
        return this.dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed
     *        through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withDialnorm(Integer dialnorm) {
        setDialnorm(dialnorm);
        return this;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionLine
     *        Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *        metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this
     *        setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *        profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Ac3DynamicRangeCompressionLine
     */

    public void setDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @return Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *         metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this
     *         setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *         (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *         profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *         https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Ac3DynamicRangeCompressionLine
     */

    public String getDynamicRangeCompressionLine() {
        return this.dynamicRangeCompressionLine;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionLine
     *        Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *        metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this
     *        setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *        profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionLine
     */

    public Ac3Settings withDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
        setDynamicRangeCompressionLine(dynamicRangeCompressionLine);
        return this;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionLine
     *        Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *        metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this
     *        setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *        profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionLine
     */

    public Ac3Settings withDynamicRangeCompressionLine(Ac3DynamicRangeCompressionLine dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine.toString();
        return this;
    }

    /**
     * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you
     * use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The
     * mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic
     * range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three
     * settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use
     * this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the
     * default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * 
     * @param dynamicRangeCompressionProfile
     *        When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend
     *        that you use the mode-specific settings instead of Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line
     *        mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode
     *        (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert
     *        ignores the value of this setting in favor of the mode-specific settings. If you do use this setting
     *        instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default
     *        Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * @see Ac3DynamicRangeCompressionProfile
     */

    public void setDynamicRangeCompressionProfile(String dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile;
    }

    /**
     * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you
     * use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The
     * mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic
     * range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three
     * settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use
     * this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the
     * default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * 
     * @return When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend
     *         that you use the mode-specific settings instead of Dynamic range compression profile
     *         (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line
     *         mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode
     *         (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert
     *         ignores the value of this setting in favor of the mode-specific settings. If you do use this setting
     *         instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default
     *         Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating
     *         modes.
     * @see Ac3DynamicRangeCompressionProfile
     */

    public String getDynamicRangeCompressionProfile() {
        return this.dynamicRangeCompressionProfile;
    }

    /**
     * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you
     * use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The
     * mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic
     * range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three
     * settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use
     * this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the
     * default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * 
     * @param dynamicRangeCompressionProfile
     *        When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend
     *        that you use the mode-specific settings instead of Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line
     *        mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode
     *        (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert
     *        ignores the value of this setting in favor of the mode-specific settings. If you do use this setting
     *        instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default
     *        Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionProfile
     */

    public Ac3Settings withDynamicRangeCompressionProfile(String dynamicRangeCompressionProfile) {
        setDynamicRangeCompressionProfile(dynamicRangeCompressionProfile);
        return this;
    }

    /**
     * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you
     * use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The
     * mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic
     * range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three
     * settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use
     * this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the
     * default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * 
     * @param dynamicRangeCompressionProfile
     *        When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend
     *        that you use the mode-specific settings instead of Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line
     *        mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode
     *        (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert
     *        ignores the value of this setting in favor of the mode-specific settings. If you do use this setting
     *        instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default
     *        Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionProfile
     */

    public Ac3Settings withDynamicRangeCompressionProfile(Ac3DynamicRangeCompressionProfile dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile.toString();
        return this;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionRf
     *        Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *        metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this
     *        setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *        profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Ac3DynamicRangeCompressionRf
     */

    public void setDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @return Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *         metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this
     *         setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *         (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *         profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *         https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Ac3DynamicRangeCompressionRf
     */

    public String getDynamicRangeCompressionRf() {
        return this.dynamicRangeCompressionRf;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionRf
     *        Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *        metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this
     *        setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *        profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionRf
     */

    public Ac3Settings withDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
        setDynamicRangeCompressionRf(dynamicRangeCompressionRf);
        return this;
    }

    /**
     * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     * the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert
     * ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For
     * information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     * Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionRf
     *        Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the
     *        metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this
     *        setting, MediaConvert ignores any value you provide for Dynamic range compression profile
     *        (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and
     *        profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DynamicRangeCompressionRf
     */

    public Ac3Settings withDynamicRangeCompressionRf(Ac3DynamicRangeCompressionRf dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf.toString();
        return this;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * 
     * @param lfeFilter
     *        Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * @see Ac3LfeFilter
     */

    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * 
     * @return Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * @see Ac3LfeFilter
     */

    public String getLfeFilter() {
        return this.lfeFilter;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * 
     * @param lfeFilter
     *        Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3LfeFilter
     */

    public Ac3Settings withLfeFilter(String lfeFilter) {
        setLfeFilter(lfeFilter);
        return this;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * 
     * @param lfeFilter
     *        Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3LfeFilter
     */

    public Ac3Settings withLfeFilter(Ac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @param metadataControl
     *        When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @see Ac3MetadataControl
     */

    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @return When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *         supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *         settings will be used.
     * @see Ac3MetadataControl
     */

    public String getMetadataControl() {
        return this.metadataControl;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @param metadataControl
     *        When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3MetadataControl
     */

    public Ac3Settings withMetadataControl(String metadataControl) {
        setMetadataControl(metadataControl);
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @param metadataControl
     *        When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3MetadataControl
     */

    public Ac3Settings withMetadataControl(Ac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
        return this;
    }

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * 
     * @param sampleRate
     *        This value is always 48000. It represents the sample rate in Hz.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * 
     * @return This value is always 48000. It represents the sample rate in Hz.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * 
     * @param sampleRate
     *        This value is always 48000. It represents the sample rate in Hz.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
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
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBitstreamMode() != null)
            sb.append("BitstreamMode: ").append(getBitstreamMode()).append(",");
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
        if (getDialnorm() != null)
            sb.append("Dialnorm: ").append(getDialnorm()).append(",");
        if (getDynamicRangeCompressionLine() != null)
            sb.append("DynamicRangeCompressionLine: ").append(getDynamicRangeCompressionLine()).append(",");
        if (getDynamicRangeCompressionProfile() != null)
            sb.append("DynamicRangeCompressionProfile: ").append(getDynamicRangeCompressionProfile()).append(",");
        if (getDynamicRangeCompressionRf() != null)
            sb.append("DynamicRangeCompressionRf: ").append(getDynamicRangeCompressionRf()).append(",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: ").append(getLfeFilter()).append(",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: ").append(getMetadataControl()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ac3Settings == false)
            return false;
        Ac3Settings other = (Ac3Settings) obj;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBitstreamMode() == null ^ this.getBitstreamMode() == null)
            return false;
        if (other.getBitstreamMode() != null && other.getBitstreamMode().equals(this.getBitstreamMode()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getDialnorm() == null ^ this.getDialnorm() == null)
            return false;
        if (other.getDialnorm() != null && other.getDialnorm().equals(this.getDialnorm()) == false)
            return false;
        if (other.getDynamicRangeCompressionLine() == null ^ this.getDynamicRangeCompressionLine() == null)
            return false;
        if (other.getDynamicRangeCompressionLine() != null && other.getDynamicRangeCompressionLine().equals(this.getDynamicRangeCompressionLine()) == false)
            return false;
        if (other.getDynamicRangeCompressionProfile() == null ^ this.getDynamicRangeCompressionProfile() == null)
            return false;
        if (other.getDynamicRangeCompressionProfile() != null
                && other.getDynamicRangeCompressionProfile().equals(this.getDynamicRangeCompressionProfile()) == false)
            return false;
        if (other.getDynamicRangeCompressionRf() == null ^ this.getDynamicRangeCompressionRf() == null)
            return false;
        if (other.getDynamicRangeCompressionRf() != null && other.getDynamicRangeCompressionRf().equals(this.getDynamicRangeCompressionRf()) == false)
            return false;
        if (other.getLfeFilter() == null ^ this.getLfeFilter() == null)
            return false;
        if (other.getLfeFilter() != null && other.getLfeFilter().equals(this.getLfeFilter()) == false)
            return false;
        if (other.getMetadataControl() == null ^ this.getMetadataControl() == null)
            return false;
        if (other.getMetadataControl() != null && other.getMetadataControl().equals(this.getMetadataControl()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBitstreamMode() == null) ? 0 : getBitstreamMode().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getDialnorm() == null) ? 0 : getDialnorm().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeCompressionLine() == null) ? 0 : getDynamicRangeCompressionLine().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeCompressionProfile() == null) ? 0 : getDynamicRangeCompressionProfile().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeCompressionRf() == null) ? 0 : getDynamicRangeCompressionRf().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public Ac3Settings clone() {
        try {
            return (Ac3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Ac3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
