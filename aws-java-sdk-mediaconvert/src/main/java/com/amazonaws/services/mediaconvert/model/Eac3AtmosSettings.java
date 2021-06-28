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
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Eac3AtmosSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Eac3AtmosSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k, 768k, 1024k
     * Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive (CBI) 7.1.4 and 5.1.4
     * inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases your output bitrate to 448k.
     */
    private Integer bitrate;
    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     */
    private String bitstreamMode;
    /** The coding mode for Dolby Digital Plus JOC (Atmos). */
    private String codingMode;
    /** Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis. */
    private String dialogueIntelligence;
    /**
     * Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value, Custom
     * (SPECIFIED) to provide downmix values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use
     * the metadata from your input. Related settings--Use these settings to specify your downmix values: Left only/Right
     * only surround (LoRoSurroundMixLevel), Left total/Right total surround (LtRtSurroundMixLevel), Left total/Right
     * total center (LtRtCenterMixLevel), Left only/Right only center (LoRoCenterMixLevel), and Stereo downmix
     * (StereoDownmix). When you keep Custom (SPECIFIED) for Downmix control (DownmixControl) and you don't specify
     * values for the related settings, MediaConvert uses default values for those settings.
     */
    private String downmixControl;
    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression
     * line (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the
     * Dynamic Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     */
    private String dynamicRangeCompressionLine;
    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF
     * (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the Dynamic
     * Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     */
    private String dynamicRangeCompressionRf;
    /**
     * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default
     * value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source
     * (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your
     * dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range
     * compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control
     * (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for
     * those settings.
     */
    private String dynamicRangeControl;
    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
     */
    private Double loRoCenterMixLevel;
    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses
     * this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses this value depends on
     * the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use
     * this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl).
     * Otherwise, MediaConvert ignores Left only/Right only surround (LoRoSurroundMixLevel).
     */
    private Double loRoSurroundMixLevel;
    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
     */
    private Double ltRtCenterMixLevel;
    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses
     * this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To
     * have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     * (DownmixControl). Otherwise, the service ignores Left total/Right total surround (LtRtSurroundMixLevel).
     */
    private Double ltRtSurroundMixLevel;
    /** Choose how the service meters the loudness of your audio. */
    private String meteringMode;
    /** This value is always 48000. It represents the sample rate in Hz. */
    private Integer sampleRate;
    /**
     * Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to use the
     * measured speech loudness as the overall program loudness. Default value: 15%
     */
    private Integer speechThreshold;
    /**
     * Choose how the service does stereo downmixing. Default value: Not indicated
     * (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the default
     * value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Stereo
     * downmix (StereoDownmix).
     */
    private String stereoDownmix;
    /**
     * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and
     * right surround channels.
     */
    private String surroundExMode;

    /**
     * Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k, 768k, 1024k
     * Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive (CBI) 7.1.4 and 5.1.4
     * inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases your output bitrate to 448k.
     * 
     * @param bitrate
     *        Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k,
     *        768k, 1024k Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive
     *        (CBI) 7.1.4 and 5.1.4 inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases
     *        your output bitrate to 448k.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k, 768k, 1024k
     * Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive (CBI) 7.1.4 and 5.1.4
     * inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases your output bitrate to 448k.
     * 
     * @return Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k,
     *         768k, 1024k Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive
     *         (CBI) 7.1.4 and 5.1.4 inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases
     *         your output bitrate to 448k.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k, 768k, 1024k
     * Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive (CBI) 7.1.4 and 5.1.4
     * inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases your output bitrate to 448k.
     * 
     * @param bitrate
     *        Specify the average bitrate for this output in bits per second. Valid values: 384k, 448k, 576k, 640k,
     *        768k, 1024k Default value: 448k Note that MediaConvert supports 384k only with channel-based immersive
     *        (CBI) 7.1.4 and 5.1.4 inputs. For CBI 9.1.6 and other input types, MediaConvert automatically increases
     *        your output bitrate to 448k.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @param bitstreamMode
     *        Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the
     *        EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Eac3AtmosBitstreamMode
     */

    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @return Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the
     *         EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Eac3AtmosBitstreamMode
     */

    public String getBitstreamMode() {
        return this.bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @param bitstreamMode
     *        Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the
     *        EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosBitstreamMode
     */

    public Eac3AtmosSettings withBitstreamMode(String bitstreamMode) {
        setBitstreamMode(bitstreamMode);
        return this;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3
     * bitstream mode, see ATSC A/52-2012 (Annex E).
     * 
     * @param bitstreamMode
     *        Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the
     *        EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosBitstreamMode
     */

    public Eac3AtmosSettings withBitstreamMode(Eac3AtmosBitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos).
     * 
     * @param codingMode
     *        The coding mode for Dolby Digital Plus JOC (Atmos).
     * @see Eac3AtmosCodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos).
     * 
     * @return The coding mode for Dolby Digital Plus JOC (Atmos).
     * @see Eac3AtmosCodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos).
     * 
     * @param codingMode
     *        The coding mode for Dolby Digital Plus JOC (Atmos).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosCodingMode
     */

    public Eac3AtmosSettings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos).
     * 
     * @param codingMode
     *        The coding mode for Dolby Digital Plus JOC (Atmos).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosCodingMode
     */

    public Eac3AtmosSettings withCodingMode(Eac3AtmosCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * 
     * @param dialogueIntelligence
     *        Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * @see Eac3AtmosDialogueIntelligence
     */

    public void setDialogueIntelligence(String dialogueIntelligence) {
        this.dialogueIntelligence = dialogueIntelligence;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * 
     * @return Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * @see Eac3AtmosDialogueIntelligence
     */

    public String getDialogueIntelligence() {
        return this.dialogueIntelligence;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * 
     * @param dialogueIntelligence
     *        Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDialogueIntelligence
     */

    public Eac3AtmosSettings withDialogueIntelligence(String dialogueIntelligence) {
        setDialogueIntelligence(dialogueIntelligence);
        return this;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * 
     * @param dialogueIntelligence
     *        Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDialogueIntelligence
     */

    public Eac3AtmosSettings withDialogueIntelligence(Eac3AtmosDialogueIntelligence dialogueIntelligence) {
        this.dialogueIntelligence = dialogueIntelligence.toString();
        return this;
    }

    /**
     * Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value, Custom
     * (SPECIFIED) to provide downmix values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use
     * the metadata from your input. Related settings--Use these settings to specify your downmix values: Left only/Right
     * only surround (LoRoSurroundMixLevel), Left total/Right total surround (LtRtSurroundMixLevel), Left total/Right
     * total center (LtRtCenterMixLevel), Left only/Right only center (LoRoCenterMixLevel), and Stereo downmix
     * (StereoDownmix). When you keep Custom (SPECIFIED) for Downmix control (DownmixControl) and you don't specify
     * values for the related settings, MediaConvert uses default values for those settings.
     * 
     * @param downmixControl
     *        Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value,
     *        Custom (SPECIFIED) to provide downmix values in your job settings. Choose Follow source
     *        (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to
     *        specify your downmix values: Left only/Right only surround (LoRoSurroundMixLevel), Left total/Right total
     *        surround (LtRtSurroundMixLevel), Left total/Right total center (LtRtCenterMixLevel), Left only/Right only
     *        center (LoRoCenterMixLevel), and Stereo downmix (StereoDownmix). When you keep Custom (SPECIFIED) for
     *        Downmix control (DownmixControl) and you don't specify values for the related settings, MediaConvert uses
     *        default values for those settings.
     * @see Eac3AtmosDownmixControl
     */

    public void setDownmixControl(String downmixControl) {
        this.downmixControl = downmixControl;
    }

    /**
     * Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value, Custom
     * (SPECIFIED) to provide downmix values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use
     * the metadata from your input. Related settings--Use these settings to specify your downmix values: Left only/Right
     * only surround (LoRoSurroundMixLevel), Left total/Right total surround (LtRtSurroundMixLevel), Left total/Right
     * total center (LtRtCenterMixLevel), Left only/Right only center (LoRoCenterMixLevel), and Stereo downmix
     * (StereoDownmix). When you keep Custom (SPECIFIED) for Downmix control (DownmixControl) and you don't specify
     * values for the related settings, MediaConvert uses default values for those settings.
     * 
     * @return Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default
     *         value, Custom (SPECIFIED) to provide downmix values in your job settings. Choose Follow source
     *         (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to
     *         specify your downmix values: Left only/Right only surround (LoRoSurroundMixLevel), Left total/Right total
     *         surround (LtRtSurroundMixLevel), Left total/Right total center (LtRtCenterMixLevel), Left only/Right only
     *         center (LoRoCenterMixLevel), and Stereo downmix (StereoDownmix). When you keep Custom (SPECIFIED) for
     *         Downmix control (DownmixControl) and you don't specify values for the related settings, MediaConvert uses
     *         default values for those settings.
     * @see Eac3AtmosDownmixControl
     */

    public String getDownmixControl() {
        return this.downmixControl;
    }

    /**
     * Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value, Custom
     * (SPECIFIED) to provide downmix values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use
     * the metadata from your input. Related settings--Use these settings to specify your downmix values: Left only/Right
     * only surround (LoRoSurroundMixLevel), Left total/Right total surround (LtRtSurroundMixLevel), Left total/Right
     * total center (LtRtCenterMixLevel), Left only/Right only center (LoRoCenterMixLevel), and Stereo downmix
     * (StereoDownmix). When you keep Custom (SPECIFIED) for Downmix control (DownmixControl) and you don't specify
     * values for the related settings, MediaConvert uses default values for those settings.
     * 
     * @param downmixControl
     *        Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value,
     *        Custom (SPECIFIED) to provide downmix values in your job settings. Choose Follow source
     *        (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to
     *        specify your downmix values: Left only/Right only surround (LoRoSurroundMixLevel), Left total/Right total
     *        surround (LtRtSurroundMixLevel), Left total/Right total center (LtRtCenterMixLevel), Left only/Right only
     *        center (LoRoCenterMixLevel), and Stereo downmix (StereoDownmix). When you keep Custom (SPECIFIED) for
     *        Downmix control (DownmixControl) and you don't specify values for the related settings, MediaConvert uses
     *        default values for those settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDownmixControl
     */

    public Eac3AtmosSettings withDownmixControl(String downmixControl) {
        setDownmixControl(downmixControl);
        return this;
    }

    /**
     * Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value, Custom
     * (SPECIFIED) to provide downmix values in your job settings. Choose Follow source (INITIALIZE_FROM_SOURCE) to use
     * the metadata from your input. Related settings--Use these settings to specify your downmix values: Left only/Right
     * only surround (LoRoSurroundMixLevel), Left total/Right total surround (LtRtSurroundMixLevel), Left total/Right
     * total center (LtRtCenterMixLevel), Left only/Right only center (LoRoCenterMixLevel), and Stereo downmix
     * (StereoDownmix). When you keep Custom (SPECIFIED) for Downmix control (DownmixControl) and you don't specify
     * values for the related settings, MediaConvert uses default values for those settings.
     * 
     * @param downmixControl
     *        Specify whether MediaConvert should use any downmix metadata from your input file. Keep the default value,
     *        Custom (SPECIFIED) to provide downmix values in your job settings. Choose Follow source
     *        (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to
     *        specify your downmix values: Left only/Right only surround (LoRoSurroundMixLevel), Left total/Right total
     *        surround (LtRtSurroundMixLevel), Left total/Right total center (LtRtCenterMixLevel), Left only/Right only
     *        center (LoRoCenterMixLevel), and Stereo downmix (StereoDownmix). When you keep Custom (SPECIFIED) for
     *        Downmix control (DownmixControl) and you don't specify values for the related settings, MediaConvert uses
     *        default values for those settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDownmixControl
     */

    public Eac3AtmosSettings withDownmixControl(Eac3AtmosDownmixControl downmixControl) {
        this.downmixControl = downmixControl.toString();
        return this;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression
     * line (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the
     * Dynamic Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionLine
     *        Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *        the Dolby stream for the line operating mode. Default value: Film light
     *        (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify here,
     *        keep the default value, Custom (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl).
     *        Otherwise, MediaConvert ignores Dynamic range compression line (DynamicRangeCompressionLine). For
     *        information about the Dolby DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     *        Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Eac3AtmosDynamicRangeCompressionLine
     */

    public void setDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression
     * line (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the
     * Dynamic Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @return Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *         the Dolby stream for the line operating mode. Default value: Film light
     *         (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify
     *         here, keep the default value, Custom (SPECIFIED) for the setting Dynamic range control
     *         (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression line
     *         (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the
     *         Dynamic Range Control chapter of the Dolby Metadata Guide at
     *         https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Eac3AtmosDynamicRangeCompressionLine
     */

    public String getDynamicRangeCompressionLine() {
        return this.dynamicRangeCompressionLine;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression
     * line (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the
     * Dynamic Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionLine
     *        Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *        the Dolby stream for the line operating mode. Default value: Film light
     *        (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify here,
     *        keep the default value, Custom (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl).
     *        Otherwise, MediaConvert ignores Dynamic range compression line (DynamicRangeCompressionLine). For
     *        information about the Dolby DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     *        Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDynamicRangeCompressionLine
     */

    public Eac3AtmosSettings withDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
        setDynamicRangeCompressionLine(dynamicRangeCompressionLine);
        return this;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression
     * line (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the
     * Dynamic Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionLine
     *        Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *        the Dolby stream for the line operating mode. Default value: Film light
     *        (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify here,
     *        keep the default value, Custom (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl).
     *        Otherwise, MediaConvert ignores Dynamic range compression line (DynamicRangeCompressionLine). For
     *        information about the Dolby DRC operating modes and profiles, see the Dynamic Range Control chapter of the
     *        Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDynamicRangeCompressionLine
     */

    public Eac3AtmosSettings withDynamicRangeCompressionLine(Eac3AtmosDynamicRangeCompressionLine dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine.toString();
        return this;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF
     * (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the Dynamic
     * Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionRf
     *        Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *        the Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT)
     *        Related setting: To have MediaConvert use the value you specify here, keep the default value, Custom
     *        (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores
     *        Dynamic range compression RF (DynamicRangeCompressionRf). For information about the Dolby DRC operating
     *        modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Eac3AtmosDynamicRangeCompressionRf
     */

    public void setDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF
     * (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the Dynamic
     * Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @return Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *         the Dolby stream for the RF operating mode. Default value: Film light
     *         (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting: To have MediaConvert use the value you specify
     *         here, keep the default value, Custom (SPECIFIED) for the setting Dynamic range control
     *         (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF
     *         (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the
     *         Dynamic Range Control chapter of the Dolby Metadata Guide at
     *         https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @see Eac3AtmosDynamicRangeCompressionRf
     */

    public String getDynamicRangeCompressionRf() {
        return this.dynamicRangeCompressionRf;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF
     * (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the Dynamic
     * Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionRf
     *        Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *        the Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT)
     *        Related setting: To have MediaConvert use the value you specify here, keep the default value, Custom
     *        (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores
     *        Dynamic range compression RF (DynamicRangeCompressionRf). For information about the Dolby DRC operating
     *        modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDynamicRangeCompressionRf
     */

    public Eac3AtmosSettings withDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
        setDynamicRangeCompressionRf(dynamicRangeCompressionRf);
        return this;
    }

    /**
     * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the
     * Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related
     * setting: To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the
     * setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression RF
     * (DynamicRangeCompressionRf). For information about the Dolby DRC operating modes and profiles, see the Dynamic
     * Range Control chapter of the Dolby Metadata Guide at
     * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * 
     * @param dynamicRangeCompressionRf
     *        Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in
     *        the Dolby stream for the RF operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT)
     *        Related setting: To have MediaConvert use the value you specify here, keep the default value, Custom
     *        (SPECIFIED) for the setting Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores
     *        Dynamic range compression RF (DynamicRangeCompressionRf). For information about the Dolby DRC operating
     *        modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at
     *        https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDynamicRangeCompressionRf
     */

    public Eac3AtmosSettings withDynamicRangeCompressionRf(Eac3AtmosDynamicRangeCompressionRf dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf.toString();
        return this;
    }

    /**
     * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default
     * value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source
     * (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your
     * dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range
     * compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control
     * (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for
     * those settings.
     * 
     * @param dynamicRangeControl
     *        Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the
     *        default value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose
     *        Follow source (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these
     *        settings to specify your dynamic range control values: Dynamic range compression line
     *        (DynamicRangeCompressionLine) and Dynamic range compression RF (DynamicRangeCompressionRf). When you keep
     *        the value Custom (SPECIFIED) for Dynamic range control (DynamicRangeControl) and you don't specify values
     *        for the related settings, MediaConvert uses default values for those settings.
     * @see Eac3AtmosDynamicRangeControl
     */

    public void setDynamicRangeControl(String dynamicRangeControl) {
        this.dynamicRangeControl = dynamicRangeControl;
    }

    /**
     * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default
     * value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source
     * (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your
     * dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range
     * compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control
     * (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for
     * those settings.
     * 
     * @return Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the
     *         default value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose
     *         Follow source (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these
     *         settings to specify your dynamic range control values: Dynamic range compression line
     *         (DynamicRangeCompressionLine) and Dynamic range compression RF (DynamicRangeCompressionRf). When you keep
     *         the value Custom (SPECIFIED) for Dynamic range control (DynamicRangeControl) and you don't specify values
     *         for the related settings, MediaConvert uses default values for those settings.
     * @see Eac3AtmosDynamicRangeControl
     */

    public String getDynamicRangeControl() {
        return this.dynamicRangeControl;
    }

    /**
     * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default
     * value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source
     * (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your
     * dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range
     * compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control
     * (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for
     * those settings.
     * 
     * @param dynamicRangeControl
     *        Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the
     *        default value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose
     *        Follow source (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these
     *        settings to specify your dynamic range control values: Dynamic range compression line
     *        (DynamicRangeCompressionLine) and Dynamic range compression RF (DynamicRangeCompressionRf). When you keep
     *        the value Custom (SPECIFIED) for Dynamic range control (DynamicRangeControl) and you don't specify values
     *        for the related settings, MediaConvert uses default values for those settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDynamicRangeControl
     */

    public Eac3AtmosSettings withDynamicRangeControl(String dynamicRangeControl) {
        setDynamicRangeControl(dynamicRangeControl);
        return this;
    }

    /**
     * Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the default
     * value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose Follow source
     * (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these settings to specify your
     * dynamic range control values: Dynamic range compression line (DynamicRangeCompressionLine) and Dynamic range
     * compression RF (DynamicRangeCompressionRf). When you keep the value Custom (SPECIFIED) for Dynamic range control
     * (DynamicRangeControl) and you don't specify values for the related settings, MediaConvert uses default values for
     * those settings.
     * 
     * @param dynamicRangeControl
     *        Specify whether MediaConvert should use any dynamic range control metadata from your input file. Keep the
     *        default value, Custom (SPECIFIED), to provide dynamic range control values in your job settings. Choose
     *        Follow source (INITIALIZE_FROM_SOURCE) to use the metadata from your input. Related settings--Use these
     *        settings to specify your dynamic range control values: Dynamic range compression line
     *        (DynamicRangeCompressionLine) and Dynamic range compression RF (DynamicRangeCompressionRf). When you keep
     *        the value Custom (SPECIFIED) for Dynamic range control (DynamicRangeControl) and you don't specify values
     *        for the related settings, MediaConvert uses default values for those settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDynamicRangeControl
     */

    public Eac3AtmosSettings withDynamicRangeControl(Eac3AtmosDynamicRangeControl dynamicRangeControl) {
        this.dynamicRangeControl = dynamicRangeControl.toString();
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
     * 
     * @param loRoCenterMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     *        MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB).
     *        Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value
     *        depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have
     *        MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     *        (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
     */

    public void setLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
     * 
     * @return Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     *         MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB).
     *         Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value
     *         depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To
     *         have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix
     *         control (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only center
     *         (LoRoCenterMixLevel).
     */

    public Double getLoRoCenterMixLevel() {
        return this.loRoCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
     * 
     * @param loRoCenterMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left only/Right only center mix (Lo/Ro center).
     *        MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB).
     *        Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value
     *        depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have
     *        MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     *        (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only center (LoRoCenterMixLevel).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        setLoRoCenterMixLevel(loRoCenterMixLevel);
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses
     * this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses this value depends on
     * the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use
     * this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl).
     * Otherwise, MediaConvert ignores Left only/Right only surround (LoRoSurroundMixLevel).
     * 
     * @param loRoSurroundMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert
     *        uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values:
     *        -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses
     *        this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related
     *        setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting
     *        Downmix control (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only surround
     *        (LoRoSurroundMixLevel).
     */

    public void setLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses
     * this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses this value depends on
     * the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use
     * this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl).
     * Otherwise, MediaConvert ignores Left only/Right only surround (LoRoSurroundMixLevel).
     * 
     * @return Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround).
     *         MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB).
     *         Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the
     *         service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix).
     *         Related setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the
     *         setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only surround
     *         (LoRoSurroundMixLevel).
     */

    public Double getLoRoSurroundMixLevel() {
        return this.loRoSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses
     * this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses this value depends on
     * the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use
     * this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl).
     * Otherwise, MediaConvert ignores Left only/Right only surround (LoRoSurroundMixLevel).
     * 
     * @param loRoSurroundMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert
     *        uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB). Valid values:
     *        -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses
     *        this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related
     *        setting: To have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting
     *        Downmix control (DownmixControl). Otherwise, MediaConvert ignores Left only/Right only surround
     *        (LoRoSurroundMixLevel).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        setLoRoSurroundMixLevel(loRoSurroundMixLevel);
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
     * 
     * @param ltRtCenterMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     *        MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB)
     *        Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value
     *        depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have
     *        MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     *        (DownmixControl). Otherwise, MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
     */

    public void setLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
     * 
     * @return Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     *         MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB)
     *         Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value
     *         depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To
     *         have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix
     *         control (DownmixControl). Otherwise, MediaConvert ignores Left total/Right total center
     *         (LtRtCenterMixLevel).
     */

    public Double getLtRtCenterMixLevel() {
        return this.ltRtCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this
     * value, keep the default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     * MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
     * 
     * @param ltRtCenterMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center).
     *        MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB)
     *        Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0. Related setting: How the service uses this value
     *        depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have
     *        MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     *        (DownmixControl). Otherwise, MediaConvert ignores Left total/Right total center (LtRtCenterMixLevel).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        setLtRtCenterMixLevel(ltRtCenterMixLevel);
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses
     * this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To
     * have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     * (DownmixControl). Otherwise, the service ignores Left total/Right total surround (LtRtSurroundMixLevel).
     * 
     * @param ltRtSurroundMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt
     *        surround). MediaConvert uses this value for downmixing. Default value: -3 dB
     *        (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes
     *        the channel. Related setting: How the service uses this value depends on the value that you choose for
     *        Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the
     *        default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, the service
     *        ignores Left total/Right total surround (LtRtSurroundMixLevel).
     */

    public void setLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses
     * this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To
     * have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     * (DownmixControl). Otherwise, the service ignores Left total/Right total surround (LtRtSurroundMixLevel).
     * 
     * @return Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt
     *         surround). MediaConvert uses this value for downmixing. Default value: -3 dB
     *         (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes
     *         the channel. Related setting: How the service uses this value depends on the value that you choose for
     *         Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the
     *         default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, the
     *         service ignores Left total/Right total surround (LtRtSurroundMixLevel).
     */

    public Double getLtRtSurroundMixLevel() {
        return this.ltRtSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround).
     * MediaConvert uses this value for downmixing. Default value: -3 dB (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. Related setting: How the service uses
     * this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To
     * have MediaConvert use this value, keep the default value, Custom (SPECIFIED) for the setting Downmix control
     * (DownmixControl). Otherwise, the service ignores Left total/Right total surround (LtRtSurroundMixLevel).
     * 
     * @param ltRtSurroundMixLevel
     *        Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt
     *        surround). MediaConvert uses this value for downmixing. Default value: -3 dB
     *        (ATMOS_STORAGE_DDP_MIXLEV_MINUS_3_DB) Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes
     *        the channel. Related setting: How the service uses this value depends on the value that you choose for
     *        Stereo downmix (Eac3AtmosStereoDownmix). Related setting: To have MediaConvert use this value, keep the
     *        default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, the service
     *        ignores Left total/Right total surround (LtRtSurroundMixLevel).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        setLtRtSurroundMixLevel(ltRtSurroundMixLevel);
        return this;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * 
     * @param meteringMode
     *        Choose how the service meters the loudness of your audio.
     * @see Eac3AtmosMeteringMode
     */

    public void setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * 
     * @return Choose how the service meters the loudness of your audio.
     * @see Eac3AtmosMeteringMode
     */

    public String getMeteringMode() {
        return this.meteringMode;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * 
     * @param meteringMode
     *        Choose how the service meters the loudness of your audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosMeteringMode
     */

    public Eac3AtmosSettings withMeteringMode(String meteringMode) {
        setMeteringMode(meteringMode);
        return this;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * 
     * @param meteringMode
     *        Choose how the service meters the loudness of your audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosMeteringMode
     */

    public Eac3AtmosSettings withMeteringMode(Eac3AtmosMeteringMode meteringMode) {
        this.meteringMode = meteringMode.toString();
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

    public Eac3AtmosSettings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to use the
     * measured speech loudness as the overall program loudness. Default value: 15%
     * 
     * @param speechThreshold
     *        Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to
     *        use the measured speech loudness as the overall program loudness. Default value: 15%
     */

    public void setSpeechThreshold(Integer speechThreshold) {
        this.speechThreshold = speechThreshold;
    }

    /**
     * Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to use the
     * measured speech loudness as the overall program loudness. Default value: 15%
     * 
     * @return Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to
     *         use the measured speech loudness as the overall program loudness. Default value: 15%
     */

    public Integer getSpeechThreshold() {
        return this.speechThreshold;
    }

    /**
     * Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to use the
     * measured speech loudness as the overall program loudness. Default value: 15%
     * 
     * @param speechThreshold
     *        Specify the percentage of audio content, from 0% to 100%, that must be speech in order for the encoder to
     *        use the measured speech loudness as the overall program loudness. Default value: 15%
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withSpeechThreshold(Integer speechThreshold) {
        setSpeechThreshold(speechThreshold);
        return this;
    }

    /**
     * Choose how the service does stereo downmixing. Default value: Not indicated
     * (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the default
     * value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Stereo
     * downmix (StereoDownmix).
     * 
     * @param stereoDownmix
     *        Choose how the service does stereo downmixing. Default value: Not indicated
     *        (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the
     *        default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     *        MediaConvert ignores Stereo downmix (StereoDownmix).
     * @see Eac3AtmosStereoDownmix
     */

    public void setStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
    }

    /**
     * Choose how the service does stereo downmixing. Default value: Not indicated
     * (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the default
     * value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Stereo
     * downmix (StereoDownmix).
     * 
     * @return Choose how the service does stereo downmixing. Default value: Not indicated
     *         (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the
     *         default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     *         MediaConvert ignores Stereo downmix (StereoDownmix).
     * @see Eac3AtmosStereoDownmix
     */

    public String getStereoDownmix() {
        return this.stereoDownmix;
    }

    /**
     * Choose how the service does stereo downmixing. Default value: Not indicated
     * (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the default
     * value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Stereo
     * downmix (StereoDownmix).
     * 
     * @param stereoDownmix
     *        Choose how the service does stereo downmixing. Default value: Not indicated
     *        (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the
     *        default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     *        MediaConvert ignores Stereo downmix (StereoDownmix).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosStereoDownmix
     */

    public Eac3AtmosSettings withStereoDownmix(String stereoDownmix) {
        setStereoDownmix(stereoDownmix);
        return this;
    }

    /**
     * Choose how the service does stereo downmixing. Default value: Not indicated
     * (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the default
     * value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise, MediaConvert ignores Stereo
     * downmix (StereoDownmix).
     * 
     * @param stereoDownmix
     *        Choose how the service does stereo downmixing. Default value: Not indicated
     *        (ATMOS_STORAGE_DDP_DMIXMOD_NOT_INDICATED) Related setting: To have MediaConvert use this value, keep the
     *        default value, Custom (SPECIFIED) for the setting Downmix control (DownmixControl). Otherwise,
     *        MediaConvert ignores Stereo downmix (StereoDownmix).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosStereoDownmix
     */

    public Eac3AtmosSettings withStereoDownmix(Eac3AtmosStereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
        return this;
    }

    /**
     * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and
     * right surround channels.
     * 
     * @param surroundExMode
     *        Specify whether your input audio has an additional center rear surround channel matrix encoded into your
     *        left and right surround channels.
     * @see Eac3AtmosSurroundExMode
     */

    public void setSurroundExMode(String surroundExMode) {
        this.surroundExMode = surroundExMode;
    }

    /**
     * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and
     * right surround channels.
     * 
     * @return Specify whether your input audio has an additional center rear surround channel matrix encoded into your
     *         left and right surround channels.
     * @see Eac3AtmosSurroundExMode
     */

    public String getSurroundExMode() {
        return this.surroundExMode;
    }

    /**
     * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and
     * right surround channels.
     * 
     * @param surroundExMode
     *        Specify whether your input audio has an additional center rear surround channel matrix encoded into your
     *        left and right surround channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosSurroundExMode
     */

    public Eac3AtmosSettings withSurroundExMode(String surroundExMode) {
        setSurroundExMode(surroundExMode);
        return this;
    }

    /**
     * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and
     * right surround channels.
     * 
     * @param surroundExMode
     *        Specify whether your input audio has an additional center rear surround channel matrix encoded into your
     *        left and right surround channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosSurroundExMode
     */

    public Eac3AtmosSettings withSurroundExMode(Eac3AtmosSurroundExMode surroundExMode) {
        this.surroundExMode = surroundExMode.toString();
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
        if (getDialogueIntelligence() != null)
            sb.append("DialogueIntelligence: ").append(getDialogueIntelligence()).append(",");
        if (getDownmixControl() != null)
            sb.append("DownmixControl: ").append(getDownmixControl()).append(",");
        if (getDynamicRangeCompressionLine() != null)
            sb.append("DynamicRangeCompressionLine: ").append(getDynamicRangeCompressionLine()).append(",");
        if (getDynamicRangeCompressionRf() != null)
            sb.append("DynamicRangeCompressionRf: ").append(getDynamicRangeCompressionRf()).append(",");
        if (getDynamicRangeControl() != null)
            sb.append("DynamicRangeControl: ").append(getDynamicRangeControl()).append(",");
        if (getLoRoCenterMixLevel() != null)
            sb.append("LoRoCenterMixLevel: ").append(getLoRoCenterMixLevel()).append(",");
        if (getLoRoSurroundMixLevel() != null)
            sb.append("LoRoSurroundMixLevel: ").append(getLoRoSurroundMixLevel()).append(",");
        if (getLtRtCenterMixLevel() != null)
            sb.append("LtRtCenterMixLevel: ").append(getLtRtCenterMixLevel()).append(",");
        if (getLtRtSurroundMixLevel() != null)
            sb.append("LtRtSurroundMixLevel: ").append(getLtRtSurroundMixLevel()).append(",");
        if (getMeteringMode() != null)
            sb.append("MeteringMode: ").append(getMeteringMode()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSpeechThreshold() != null)
            sb.append("SpeechThreshold: ").append(getSpeechThreshold()).append(",");
        if (getStereoDownmix() != null)
            sb.append("StereoDownmix: ").append(getStereoDownmix()).append(",");
        if (getSurroundExMode() != null)
            sb.append("SurroundExMode: ").append(getSurroundExMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Eac3AtmosSettings == false)
            return false;
        Eac3AtmosSettings other = (Eac3AtmosSettings) obj;
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
        if (other.getDialogueIntelligence() == null ^ this.getDialogueIntelligence() == null)
            return false;
        if (other.getDialogueIntelligence() != null && other.getDialogueIntelligence().equals(this.getDialogueIntelligence()) == false)
            return false;
        if (other.getDownmixControl() == null ^ this.getDownmixControl() == null)
            return false;
        if (other.getDownmixControl() != null && other.getDownmixControl().equals(this.getDownmixControl()) == false)
            return false;
        if (other.getDynamicRangeCompressionLine() == null ^ this.getDynamicRangeCompressionLine() == null)
            return false;
        if (other.getDynamicRangeCompressionLine() != null && other.getDynamicRangeCompressionLine().equals(this.getDynamicRangeCompressionLine()) == false)
            return false;
        if (other.getDynamicRangeCompressionRf() == null ^ this.getDynamicRangeCompressionRf() == null)
            return false;
        if (other.getDynamicRangeCompressionRf() != null && other.getDynamicRangeCompressionRf().equals(this.getDynamicRangeCompressionRf()) == false)
            return false;
        if (other.getDynamicRangeControl() == null ^ this.getDynamicRangeControl() == null)
            return false;
        if (other.getDynamicRangeControl() != null && other.getDynamicRangeControl().equals(this.getDynamicRangeControl()) == false)
            return false;
        if (other.getLoRoCenterMixLevel() == null ^ this.getLoRoCenterMixLevel() == null)
            return false;
        if (other.getLoRoCenterMixLevel() != null && other.getLoRoCenterMixLevel().equals(this.getLoRoCenterMixLevel()) == false)
            return false;
        if (other.getLoRoSurroundMixLevel() == null ^ this.getLoRoSurroundMixLevel() == null)
            return false;
        if (other.getLoRoSurroundMixLevel() != null && other.getLoRoSurroundMixLevel().equals(this.getLoRoSurroundMixLevel()) == false)
            return false;
        if (other.getLtRtCenterMixLevel() == null ^ this.getLtRtCenterMixLevel() == null)
            return false;
        if (other.getLtRtCenterMixLevel() != null && other.getLtRtCenterMixLevel().equals(this.getLtRtCenterMixLevel()) == false)
            return false;
        if (other.getLtRtSurroundMixLevel() == null ^ this.getLtRtSurroundMixLevel() == null)
            return false;
        if (other.getLtRtSurroundMixLevel() != null && other.getLtRtSurroundMixLevel().equals(this.getLtRtSurroundMixLevel()) == false)
            return false;
        if (other.getMeteringMode() == null ^ this.getMeteringMode() == null)
            return false;
        if (other.getMeteringMode() != null && other.getMeteringMode().equals(this.getMeteringMode()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpeechThreshold() == null ^ this.getSpeechThreshold() == null)
            return false;
        if (other.getSpeechThreshold() != null && other.getSpeechThreshold().equals(this.getSpeechThreshold()) == false)
            return false;
        if (other.getStereoDownmix() == null ^ this.getStereoDownmix() == null)
            return false;
        if (other.getStereoDownmix() != null && other.getStereoDownmix().equals(this.getStereoDownmix()) == false)
            return false;
        if (other.getSurroundExMode() == null ^ this.getSurroundExMode() == null)
            return false;
        if (other.getSurroundExMode() != null && other.getSurroundExMode().equals(this.getSurroundExMode()) == false)
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
        hashCode = prime * hashCode + ((getDialogueIntelligence() == null) ? 0 : getDialogueIntelligence().hashCode());
        hashCode = prime * hashCode + ((getDownmixControl() == null) ? 0 : getDownmixControl().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeCompressionLine() == null) ? 0 : getDynamicRangeCompressionLine().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeCompressionRf() == null) ? 0 : getDynamicRangeCompressionRf().hashCode());
        hashCode = prime * hashCode + ((getDynamicRangeControl() == null) ? 0 : getDynamicRangeControl().hashCode());
        hashCode = prime * hashCode + ((getLoRoCenterMixLevel() == null) ? 0 : getLoRoCenterMixLevel().hashCode());
        hashCode = prime * hashCode + ((getLoRoSurroundMixLevel() == null) ? 0 : getLoRoSurroundMixLevel().hashCode());
        hashCode = prime * hashCode + ((getLtRtCenterMixLevel() == null) ? 0 : getLtRtCenterMixLevel().hashCode());
        hashCode = prime * hashCode + ((getLtRtSurroundMixLevel() == null) ? 0 : getLtRtSurroundMixLevel().hashCode());
        hashCode = prime * hashCode + ((getMeteringMode() == null) ? 0 : getMeteringMode().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpeechThreshold() == null) ? 0 : getSpeechThreshold().hashCode());
        hashCode = prime * hashCode + ((getStereoDownmix() == null) ? 0 : getStereoDownmix().hashCode());
        hashCode = prime * hashCode + ((getSurroundExMode() == null) ? 0 : getSurroundExMode().hashCode());
        return hashCode;
    }

    @Override
    public Eac3AtmosSettings clone() {
        try {
            return (Eac3AtmosSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Eac3AtmosSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
