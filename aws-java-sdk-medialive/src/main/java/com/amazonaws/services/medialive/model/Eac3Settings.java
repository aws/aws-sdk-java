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
 * Eac3 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Eac3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Eac3Settings implements Serializable, Cloneable, StructuredPojo {

    /** When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode. */
    private String attenuationControl;
    /** Average bitrate in bits/second. Valid bitrates depend on the coding mode. */
    private Double bitrate;
    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background
     * on these values.
     */
    private String bitstreamMode;
    /** Dolby Digital Plus coding mode. Determines number of channels. */
    private String codingMode;
    /** When set to enabled, activates a DC highpass filter for all input channels. */
    private String dcFilter;
    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     * through.
     */
    private Integer dialnorm;
    /** Sets the Dolby dynamic range compression profile. */
    private String drcLine;
    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not
     * exceed specified levels.
     */
    private String drcRf;
    /** When encoding 3/2 audio, setting to lfe enables the LFE channel */
    private String lfeControl;
    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     * codingMode32 coding mode.
     */
    private String lfeFilter;
    /** Left only/Right only center mix level. Only used for 3/2 coding mode. */
    private Double loRoCenterMixLevel;
    /** Left only/Right only surround mix level. Only used for 3/2 coding mode. */
    private Double loRoSurroundMixLevel;
    /** Left total/Right total center mix level. Only used for 3/2 coding mode. */
    private Double ltRtCenterMixLevel;
    /** Left total/Right total surround mix level. Only used for 3/2 coding mode. */
    private Double ltRtSurroundMixLevel;
    /**
     * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     */
    private String metadataControl;
    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is
     * dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a
     * consistent DD+ output as the system alternates between passthrough and encoding.
     */
    private String passthroughControl;
    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding
     * mode.
     */
    private String phaseControl;
    /** Stereo downmix preference. Only used for 3/2 coding mode. */
    private String stereoDownmix;
    /**
     * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and
     * right surround channels.
     */
    private String surroundExMode;
    /** When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels. */
    private String surroundMode;

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
     * 
     * @param attenuationControl
     *        When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding
     *        mode.
     * @see Eac3AttenuationControl
     */

    public void setAttenuationControl(String attenuationControl) {
        this.attenuationControl = attenuationControl;
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
     * 
     * @return When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding
     *         mode.
     * @see Eac3AttenuationControl
     */

    public String getAttenuationControl() {
        return this.attenuationControl;
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
     * 
     * @param attenuationControl
     *        When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AttenuationControl
     */

    public Eac3Settings withAttenuationControl(String attenuationControl) {
        setAttenuationControl(attenuationControl);
        return this;
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
     * 
     * @param attenuationControl
     *        When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AttenuationControl
     */

    public Eac3Settings withAttenuationControl(Eac3AttenuationControl attenuationControl) {
        this.attenuationControl = attenuationControl.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */

    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * 
     * @return Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */

    public Double getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3Settings withBitrate(Double bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background
     * on these values.
     * 
     * @param bitstreamMode
     *        Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for
     *        background on these values.
     * @see Eac3BitstreamMode
     */

    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background
     * on these values.
     * 
     * @return Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for
     *         background on these values.
     * @see Eac3BitstreamMode
     */

    public String getBitstreamMode() {
        return this.bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background
     * on these values.
     * 
     * @param bitstreamMode
     *        Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for
     *        background on these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3BitstreamMode
     */

    public Eac3Settings withBitstreamMode(String bitstreamMode) {
        setBitstreamMode(bitstreamMode);
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background
     * on these values.
     * 
     * @param bitstreamMode
     *        Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for
     *        background on these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3BitstreamMode
     */

    public Eac3Settings withBitstreamMode(Eac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital Plus coding mode. Determines number of channels.
     * @see Eac3CodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * 
     * @return Dolby Digital Plus coding mode. Determines number of channels.
     * @see Eac3CodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital Plus coding mode. Determines number of channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3CodingMode
     */

    public Eac3Settings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital Plus coding mode. Determines number of channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3CodingMode
     */

    public Eac3Settings withCodingMode(Eac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input channels.
     * 
     * @param dcFilter
     *        When set to enabled, activates a DC highpass filter for all input channels.
     * @see Eac3DcFilter
     */

    public void setDcFilter(String dcFilter) {
        this.dcFilter = dcFilter;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input channels.
     * 
     * @return When set to enabled, activates a DC highpass filter for all input channels.
     * @see Eac3DcFilter
     */

    public String getDcFilter() {
        return this.dcFilter;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input channels.
     * 
     * @param dcFilter
     *        When set to enabled, activates a DC highpass filter for all input channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3DcFilter
     */

    public Eac3Settings withDcFilter(String dcFilter) {
        setDcFilter(dcFilter);
        return this;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input channels.
     * 
     * @param dcFilter
     *        When set to enabled, activates a DC highpass filter for all input channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3DcFilter
     */

    public Eac3Settings withDcFilter(Eac3DcFilter dcFilter) {
        this.dcFilter = dcFilter.toString();
        return this;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     * through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     *        through.
     */

    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     * through.
     * 
     * @return Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     *         through.
     */

    public Integer getDialnorm() {
        return this.dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     * through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed
     *        through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3Settings withDialnorm(Integer dialnorm) {
        setDialnorm(dialnorm);
        return this;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @param drcLine
     *        Sets the Dolby dynamic range compression profile.
     * @see Eac3DrcLine
     */

    public void setDrcLine(String drcLine) {
        this.drcLine = drcLine;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @return Sets the Dolby dynamic range compression profile.
     * @see Eac3DrcLine
     */

    public String getDrcLine() {
        return this.drcLine;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @param drcLine
     *        Sets the Dolby dynamic range compression profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3DrcLine
     */

    public Eac3Settings withDrcLine(String drcLine) {
        setDrcLine(drcLine);
        return this;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @param drcLine
     *        Sets the Dolby dynamic range compression profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3DrcLine
     */

    public Eac3Settings withDrcLine(Eac3DrcLine drcLine) {
        this.drcLine = drcLine.toString();
        return this;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not
     * exceed specified levels.
     * 
     * @param drcRf
     *        Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do
     *        not exceed specified levels.
     * @see Eac3DrcRf
     */

    public void setDrcRf(String drcRf) {
        this.drcRf = drcRf;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not
     * exceed specified levels.
     * 
     * @return Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks
     *         do not exceed specified levels.
     * @see Eac3DrcRf
     */

    public String getDrcRf() {
        return this.drcRf;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not
     * exceed specified levels.
     * 
     * @param drcRf
     *        Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do
     *        not exceed specified levels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3DrcRf
     */

    public Eac3Settings withDrcRf(String drcRf) {
        setDrcRf(drcRf);
        return this;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not
     * exceed specified levels.
     * 
     * @param drcRf
     *        Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do
     *        not exceed specified levels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3DrcRf
     */

    public Eac3Settings withDrcRf(Eac3DrcRf drcRf) {
        this.drcRf = drcRf.toString();
        return this;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * 
     * @param lfeControl
     *        When encoding 3/2 audio, setting to lfe enables the LFE channel
     * @see Eac3LfeControl
     */

    public void setLfeControl(String lfeControl) {
        this.lfeControl = lfeControl;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * 
     * @return When encoding 3/2 audio, setting to lfe enables the LFE channel
     * @see Eac3LfeControl
     */

    public String getLfeControl() {
        return this.lfeControl;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * 
     * @param lfeControl
     *        When encoding 3/2 audio, setting to lfe enables the LFE channel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3LfeControl
     */

    public Eac3Settings withLfeControl(String lfeControl) {
        setLfeControl(lfeControl);
        return this;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * 
     * @param lfeControl
     *        When encoding 3/2 audio, setting to lfe enables the LFE channel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3LfeControl
     */

    public Eac3Settings withLfeControl(Eac3LfeControl lfeControl) {
        this.lfeControl = lfeControl.toString();
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     * codingMode32 coding mode.
     * 
     * @param lfeFilter
     *        When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     *        codingMode32 coding mode.
     * @see Eac3LfeFilter
     */

    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     * codingMode32 coding mode.
     * 
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     *         codingMode32 coding mode.
     * @see Eac3LfeFilter
     */

    public String getLfeFilter() {
        return this.lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     * codingMode32 coding mode.
     * 
     * @param lfeFilter
     *        When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     *        codingMode32 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3LfeFilter
     */

    public Eac3Settings withLfeFilter(String lfeFilter) {
        setLfeFilter(lfeFilter);
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     * codingMode32 coding mode.
     * 
     * @param lfeFilter
     *        When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with
     *        codingMode32 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3LfeFilter
     */

    public Eac3Settings withLfeFilter(Eac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     * 
     * @param loRoCenterMixLevel
     *        Left only/Right only center mix level. Only used for 3/2 coding mode.
     */

    public void setLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
    }

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     * 
     * @return Left only/Right only center mix level. Only used for 3/2 coding mode.
     */

    public Double getLoRoCenterMixLevel() {
        return this.loRoCenterMixLevel;
    }

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     * 
     * @param loRoCenterMixLevel
     *        Left only/Right only center mix level. Only used for 3/2 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3Settings withLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        setLoRoCenterMixLevel(loRoCenterMixLevel);
        return this;
    }

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     * 
     * @param loRoSurroundMixLevel
     *        Left only/Right only surround mix level. Only used for 3/2 coding mode.
     */

    public void setLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
    }

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     * 
     * @return Left only/Right only surround mix level. Only used for 3/2 coding mode.
     */

    public Double getLoRoSurroundMixLevel() {
        return this.loRoSurroundMixLevel;
    }

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     * 
     * @param loRoSurroundMixLevel
     *        Left only/Right only surround mix level. Only used for 3/2 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3Settings withLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        setLoRoSurroundMixLevel(loRoSurroundMixLevel);
        return this;
    }

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     * 
     * @param ltRtCenterMixLevel
     *        Left total/Right total center mix level. Only used for 3/2 coding mode.
     */

    public void setLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
    }

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     * 
     * @return Left total/Right total center mix level. Only used for 3/2 coding mode.
     */

    public Double getLtRtCenterMixLevel() {
        return this.ltRtCenterMixLevel;
    }

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     * 
     * @param ltRtCenterMixLevel
     *        Left total/Right total center mix level. Only used for 3/2 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3Settings withLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        setLtRtCenterMixLevel(ltRtCenterMixLevel);
        return this;
    }

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     * 
     * @param ltRtSurroundMixLevel
     *        Left total/Right total surround mix level. Only used for 3/2 coding mode.
     */

    public void setLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
    }

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     * 
     * @return Left total/Right total surround mix level. Only used for 3/2 coding mode.
     */

    public Double getLtRtSurroundMixLevel() {
        return this.ltRtSurroundMixLevel;
    }

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     * 
     * @param ltRtSurroundMixLevel
     *        Left total/Right total surround mix level. Only used for 3/2 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3Settings withLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        setLtRtSurroundMixLevel(ltRtSurroundMixLevel);
        return this;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @param metadataControl
     *        When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @see Eac3MetadataControl
     */

    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @return When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *         supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *         settings will be used.
     * @see Eac3MetadataControl
     */

    public String getMetadataControl() {
        return this.metadataControl;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @param metadataControl
     *        When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3MetadataControl
     */

    public Eac3Settings withMetadataControl(String metadataControl) {
        setMetadataControl(metadataControl);
        return this;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this
     * audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
     * 
     * @param metadataControl
     *        When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3MetadataControl
     */

    public Eac3Settings withMetadataControl(Eac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
        return this;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is
     * dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a
     * consistent DD+ output as the system alternates between passthrough and encoding.
     * 
     * @param passthroughControl
     *        When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This
     *        detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content
     *        will have a consistent DD+ output as the system alternates between passthrough and encoding.
     * @see Eac3PassthroughControl
     */

    public void setPassthroughControl(String passthroughControl) {
        this.passthroughControl = passthroughControl;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is
     * dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a
     * consistent DD+ output as the system alternates between passthrough and encoding.
     * 
     * @return When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This
     *         detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+
     *         content will have a consistent DD+ output as the system alternates between passthrough and encoding.
     * @see Eac3PassthroughControl
     */

    public String getPassthroughControl() {
        return this.passthroughControl;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is
     * dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a
     * consistent DD+ output as the system alternates between passthrough and encoding.
     * 
     * @param passthroughControl
     *        When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This
     *        detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content
     *        will have a consistent DD+ output as the system alternates between passthrough and encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3PassthroughControl
     */

    public Eac3Settings withPassthroughControl(String passthroughControl) {
        setPassthroughControl(passthroughControl);
        return this;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is
     * dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a
     * consistent DD+ output as the system alternates between passthrough and encoding.
     * 
     * @param passthroughControl
     *        When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This
     *        detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content
     *        will have a consistent DD+ output as the system alternates between passthrough and encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3PassthroughControl
     */

    public Eac3Settings withPassthroughControl(Eac3PassthroughControl passthroughControl) {
        this.passthroughControl = passthroughControl.toString();
        return this;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding
     * mode.
     * 
     * @param phaseControl
     *        When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2
     *        coding mode.
     * @see Eac3PhaseControl
     */

    public void setPhaseControl(String phaseControl) {
        this.phaseControl = phaseControl;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding
     * mode.
     * 
     * @return When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2
     *         coding mode.
     * @see Eac3PhaseControl
     */

    public String getPhaseControl() {
        return this.phaseControl;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding
     * mode.
     * 
     * @param phaseControl
     *        When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2
     *        coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3PhaseControl
     */

    public Eac3Settings withPhaseControl(String phaseControl) {
        setPhaseControl(phaseControl);
        return this;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding
     * mode.
     * 
     * @param phaseControl
     *        When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2
     *        coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3PhaseControl
     */

    public Eac3Settings withPhaseControl(Eac3PhaseControl phaseControl) {
        this.phaseControl = phaseControl.toString();
        return this;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * 
     * @param stereoDownmix
     *        Stereo downmix preference. Only used for 3/2 coding mode.
     * @see Eac3StereoDownmix
     */

    public void setStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * 
     * @return Stereo downmix preference. Only used for 3/2 coding mode.
     * @see Eac3StereoDownmix
     */

    public String getStereoDownmix() {
        return this.stereoDownmix;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * 
     * @param stereoDownmix
     *        Stereo downmix preference. Only used for 3/2 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3StereoDownmix
     */

    public Eac3Settings withStereoDownmix(String stereoDownmix) {
        setStereoDownmix(stereoDownmix);
        return this;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * 
     * @param stereoDownmix
     *        Stereo downmix preference. Only used for 3/2 coding mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3StereoDownmix
     */

    public Eac3Settings withStereoDownmix(Eac3StereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
        return this;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and
     * right surround channels.
     * 
     * @param surroundExMode
     *        When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the
     *        left and right surround channels.
     * @see Eac3SurroundExMode
     */

    public void setSurroundExMode(String surroundExMode) {
        this.surroundExMode = surroundExMode;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and
     * right surround channels.
     * 
     * @return When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the
     *         left and right surround channels.
     * @see Eac3SurroundExMode
     */

    public String getSurroundExMode() {
        return this.surroundExMode;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and
     * right surround channels.
     * 
     * @param surroundExMode
     *        When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the
     *        left and right surround channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3SurroundExMode
     */

    public Eac3Settings withSurroundExMode(String surroundExMode) {
        setSurroundExMode(surroundExMode);
        return this;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and
     * right surround channels.
     * 
     * @param surroundExMode
     *        When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the
     *        left and right surround channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3SurroundExMode
     */

    public Eac3Settings withSurroundExMode(Eac3SurroundExMode surroundExMode) {
        this.surroundExMode = surroundExMode.toString();
        return this;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * 
     * @param surroundMode
     *        When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * @see Eac3SurroundMode
     */

    public void setSurroundMode(String surroundMode) {
        this.surroundMode = surroundMode;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * 
     * @return When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * @see Eac3SurroundMode
     */

    public String getSurroundMode() {
        return this.surroundMode;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * 
     * @param surroundMode
     *        When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3SurroundMode
     */

    public Eac3Settings withSurroundMode(String surroundMode) {
        setSurroundMode(surroundMode);
        return this;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * 
     * @param surroundMode
     *        When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3SurroundMode
     */

    public Eac3Settings withSurroundMode(Eac3SurroundMode surroundMode) {
        this.surroundMode = surroundMode.toString();
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
        if (getAttenuationControl() != null)
            sb.append("AttenuationControl: ").append(getAttenuationControl()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBitstreamMode() != null)
            sb.append("BitstreamMode: ").append(getBitstreamMode()).append(",");
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
        if (getDcFilter() != null)
            sb.append("DcFilter: ").append(getDcFilter()).append(",");
        if (getDialnorm() != null)
            sb.append("Dialnorm: ").append(getDialnorm()).append(",");
        if (getDrcLine() != null)
            sb.append("DrcLine: ").append(getDrcLine()).append(",");
        if (getDrcRf() != null)
            sb.append("DrcRf: ").append(getDrcRf()).append(",");
        if (getLfeControl() != null)
            sb.append("LfeControl: ").append(getLfeControl()).append(",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: ").append(getLfeFilter()).append(",");
        if (getLoRoCenterMixLevel() != null)
            sb.append("LoRoCenterMixLevel: ").append(getLoRoCenterMixLevel()).append(",");
        if (getLoRoSurroundMixLevel() != null)
            sb.append("LoRoSurroundMixLevel: ").append(getLoRoSurroundMixLevel()).append(",");
        if (getLtRtCenterMixLevel() != null)
            sb.append("LtRtCenterMixLevel: ").append(getLtRtCenterMixLevel()).append(",");
        if (getLtRtSurroundMixLevel() != null)
            sb.append("LtRtSurroundMixLevel: ").append(getLtRtSurroundMixLevel()).append(",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: ").append(getMetadataControl()).append(",");
        if (getPassthroughControl() != null)
            sb.append("PassthroughControl: ").append(getPassthroughControl()).append(",");
        if (getPhaseControl() != null)
            sb.append("PhaseControl: ").append(getPhaseControl()).append(",");
        if (getStereoDownmix() != null)
            sb.append("StereoDownmix: ").append(getStereoDownmix()).append(",");
        if (getSurroundExMode() != null)
            sb.append("SurroundExMode: ").append(getSurroundExMode()).append(",");
        if (getSurroundMode() != null)
            sb.append("SurroundMode: ").append(getSurroundMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Eac3Settings == false)
            return false;
        Eac3Settings other = (Eac3Settings) obj;
        if (other.getAttenuationControl() == null ^ this.getAttenuationControl() == null)
            return false;
        if (other.getAttenuationControl() != null && other.getAttenuationControl().equals(this.getAttenuationControl()) == false)
            return false;
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
        if (other.getDcFilter() == null ^ this.getDcFilter() == null)
            return false;
        if (other.getDcFilter() != null && other.getDcFilter().equals(this.getDcFilter()) == false)
            return false;
        if (other.getDialnorm() == null ^ this.getDialnorm() == null)
            return false;
        if (other.getDialnorm() != null && other.getDialnorm().equals(this.getDialnorm()) == false)
            return false;
        if (other.getDrcLine() == null ^ this.getDrcLine() == null)
            return false;
        if (other.getDrcLine() != null && other.getDrcLine().equals(this.getDrcLine()) == false)
            return false;
        if (other.getDrcRf() == null ^ this.getDrcRf() == null)
            return false;
        if (other.getDrcRf() != null && other.getDrcRf().equals(this.getDrcRf()) == false)
            return false;
        if (other.getLfeControl() == null ^ this.getLfeControl() == null)
            return false;
        if (other.getLfeControl() != null && other.getLfeControl().equals(this.getLfeControl()) == false)
            return false;
        if (other.getLfeFilter() == null ^ this.getLfeFilter() == null)
            return false;
        if (other.getLfeFilter() != null && other.getLfeFilter().equals(this.getLfeFilter()) == false)
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
        if (other.getMetadataControl() == null ^ this.getMetadataControl() == null)
            return false;
        if (other.getMetadataControl() != null && other.getMetadataControl().equals(this.getMetadataControl()) == false)
            return false;
        if (other.getPassthroughControl() == null ^ this.getPassthroughControl() == null)
            return false;
        if (other.getPassthroughControl() != null && other.getPassthroughControl().equals(this.getPassthroughControl()) == false)
            return false;
        if (other.getPhaseControl() == null ^ this.getPhaseControl() == null)
            return false;
        if (other.getPhaseControl() != null && other.getPhaseControl().equals(this.getPhaseControl()) == false)
            return false;
        if (other.getStereoDownmix() == null ^ this.getStereoDownmix() == null)
            return false;
        if (other.getStereoDownmix() != null && other.getStereoDownmix().equals(this.getStereoDownmix()) == false)
            return false;
        if (other.getSurroundExMode() == null ^ this.getSurroundExMode() == null)
            return false;
        if (other.getSurroundExMode() != null && other.getSurroundExMode().equals(this.getSurroundExMode()) == false)
            return false;
        if (other.getSurroundMode() == null ^ this.getSurroundMode() == null)
            return false;
        if (other.getSurroundMode() != null && other.getSurroundMode().equals(this.getSurroundMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttenuationControl() == null) ? 0 : getAttenuationControl().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBitstreamMode() == null) ? 0 : getBitstreamMode().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getDcFilter() == null) ? 0 : getDcFilter().hashCode());
        hashCode = prime * hashCode + ((getDialnorm() == null) ? 0 : getDialnorm().hashCode());
        hashCode = prime * hashCode + ((getDrcLine() == null) ? 0 : getDrcLine().hashCode());
        hashCode = prime * hashCode + ((getDrcRf() == null) ? 0 : getDrcRf().hashCode());
        hashCode = prime * hashCode + ((getLfeControl() == null) ? 0 : getLfeControl().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode + ((getLoRoCenterMixLevel() == null) ? 0 : getLoRoCenterMixLevel().hashCode());
        hashCode = prime * hashCode + ((getLoRoSurroundMixLevel() == null) ? 0 : getLoRoSurroundMixLevel().hashCode());
        hashCode = prime * hashCode + ((getLtRtCenterMixLevel() == null) ? 0 : getLtRtCenterMixLevel().hashCode());
        hashCode = prime * hashCode + ((getLtRtSurroundMixLevel() == null) ? 0 : getLtRtSurroundMixLevel().hashCode());
        hashCode = prime * hashCode + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
        hashCode = prime * hashCode + ((getPassthroughControl() == null) ? 0 : getPassthroughControl().hashCode());
        hashCode = prime * hashCode + ((getPhaseControl() == null) ? 0 : getPhaseControl().hashCode());
        hashCode = prime * hashCode + ((getStereoDownmix() == null) ? 0 : getStereoDownmix().hashCode());
        hashCode = prime * hashCode + ((getSurroundExMode() == null) ? 0 : getSurroundExMode().hashCode());
        hashCode = prime * hashCode + ((getSurroundMode() == null) ? 0 : getSurroundMode().hashCode());
        return hashCode;
    }

    @Override
    public Eac3Settings clone() {
        try {
            return (Eac3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Eac3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
