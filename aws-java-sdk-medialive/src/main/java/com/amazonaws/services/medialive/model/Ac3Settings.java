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
 * Ac3 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Ac3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ac3Settings implements Serializable, Cloneable, StructuredPojo {

    /** Average bitrate in bits/second. Valid bitrates depend on the coding mode. */
    private Double bitrate;
    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these
     * values.
     */
    private String bitstreamMode;
    /** Dolby Digital coding mode. Determines number of channels. */
    private String codingMode;
    /** Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through. */
    private Integer dialnorm;
    /**
     * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby
     * Digital specification.
     */
    private String drcProfile;
    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     * codingMode32Lfe mode.
     */
    private String lfeFilter;
    /**
     * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied
     * this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be
     * used.
     */
    private String metadataControl;

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

    public Ac3Settings withBitrate(Double bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these
     * values.
     * 
     * @param bitstreamMode
     *        Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on
     *        these values.
     * @see Ac3BitstreamMode
     */

    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these
     * values.
     * 
     * @return Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on
     *         these values.
     * @see Ac3BitstreamMode
     */

    public String getBitstreamMode() {
        return this.bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these
     * values.
     * 
     * @param bitstreamMode
     *        Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on
     *        these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3BitstreamMode
     */

    public Ac3Settings withBitstreamMode(String bitstreamMode) {
        setBitstreamMode(bitstreamMode);
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these
     * values.
     * 
     * @param bitstreamMode
     *        Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on
     *        these values.
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
     * Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed
     *        through.
     */

    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @return Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed
     *         through.
     */

    public Integer getDialnorm() {
        return this.dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed
     *        through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ac3Settings withDialnorm(Integer dialnorm) {
        setDialnorm(dialnorm);
        return this;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby
     * Digital specification.
     * 
     * @param drcProfile
     *        If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the
     *        Dolby Digital specification.
     * @see Ac3DrcProfile
     */

    public void setDrcProfile(String drcProfile) {
        this.drcProfile = drcProfile;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby
     * Digital specification.
     * 
     * @return If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in
     *         the Dolby Digital specification.
     * @see Ac3DrcProfile
     */

    public String getDrcProfile() {
        return this.drcProfile;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby
     * Digital specification.
     * 
     * @param drcProfile
     *        If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the
     *        Dolby Digital specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DrcProfile
     */

    public Ac3Settings withDrcProfile(String drcProfile) {
        setDrcProfile(drcProfile);
        return this;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby
     * Digital specification.
     * 
     * @param drcProfile
     *        If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the
     *        Dolby Digital specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3DrcProfile
     */

    public Ac3Settings withDrcProfile(Ac3DrcProfile drcProfile) {
        this.drcProfile = drcProfile.toString();
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     * codingMode32Lfe mode.
     * 
     * @param lfeFilter
     *        When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     *        codingMode32Lfe mode.
     * @see Ac3LfeFilter
     */

    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     * codingMode32Lfe mode.
     * 
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     *         codingMode32Lfe mode.
     * @see Ac3LfeFilter
     */

    public String getLfeFilter() {
        return this.lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     * codingMode32Lfe mode.
     * 
     * @param lfeFilter
     *        When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     *        codingMode32Lfe mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3LfeFilter
     */

    public Ac3Settings withLfeFilter(String lfeFilter) {
        setLfeFilter(lfeFilter);
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     * codingMode32Lfe mode.
     * 
     * @param lfeFilter
     *        When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in
     *        codingMode32Lfe mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ac3LfeFilter
     */

    public Ac3Settings withLfeFilter(Ac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied
     * this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be
     * used.
     * 
     * @param metadataControl
     *        When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *        supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *        settings will be used.
     * @see Ac3MetadataControl
     */

    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied
     * this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be
     * used.
     * 
     * @return When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
     *         supplied this audio data. If audio was not supplied from one of these streams, then the static metadata
     *         settings will be used.
     * @see Ac3MetadataControl
     */

    public String getMetadataControl() {
        return this.metadataControl;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied
     * this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be
     * used.
     * 
     * @param metadataControl
     *        When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
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
     * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied
     * this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be
     * used.
     * 
     * @param metadataControl
     *        When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that
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
        if (getDrcProfile() != null)
            sb.append("DrcProfile: ").append(getDrcProfile()).append(",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: ").append(getLfeFilter()).append(",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: ").append(getMetadataControl());
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
        if (other.getDrcProfile() == null ^ this.getDrcProfile() == null)
            return false;
        if (other.getDrcProfile() != null && other.getDrcProfile().equals(this.getDrcProfile()) == false)
            return false;
        if (other.getLfeFilter() == null ^ this.getLfeFilter() == null)
            return false;
        if (other.getLfeFilter() != null && other.getLfeFilter().equals(this.getLfeFilter()) == false)
            return false;
        if (other.getMetadataControl() == null ^ this.getMetadataControl() == null)
            return false;
        if (other.getMetadataControl() != null && other.getMetadataControl().equals(this.getMetadataControl()) == false)
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
        hashCode = prime * hashCode + ((getDrcProfile() == null) ? 0 : getDrcProfile().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
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
        com.amazonaws.services.medialive.model.transform.Ac3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
