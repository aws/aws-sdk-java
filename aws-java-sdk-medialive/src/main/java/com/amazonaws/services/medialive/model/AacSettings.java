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
 * Aac Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AacSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AacSettings implements Serializable, Cloneable, StructuredPojo {

    /** Average bitrate in bits/second. Valid values depend on rate control mode and profile. */
    private Double bitrate;
    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix
     * setting receives a stereo description plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     */
    private String codingMode;
    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair. The Audio
     * Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to
     * broadcasterMixedAd.
     * 
     * Leave set to "normal" when input does not contain pre-mixed audio + AD.
     */
    private String inputType;
    /** AAC Profile. */
    private String profile;
    /** Rate Control Mode. */
    private String rateControlMode;
    /** Sets LATM / LOAS AAC output for raw containers. */
    private String rawFormat;
    /** Sample rate in Hz. Valid values depend on rate control mode and profile. */
    private Double sampleRate;
    /** Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers. */
    private String spec;
    /** VBR Quality Level - Only used if rateControlMode is VBR. */
    private String vbrQuality;

    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid values depend on rate control mode and profile.
     */

    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
     * 
     * @return Average bitrate in bits/second. Valid values depend on rate control mode and profile.
     */

    public Double getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid values depend on rate control mode and profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AacSettings withBitrate(Double bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix
     * setting receives a stereo description plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * 
     * @param codingMode
     *        Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The
     *        adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the
     *        description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix
     * setting receives a stereo description plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * 
     * @return Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The
     *         adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the
     *         description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix
     * setting receives a stereo description plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * 
     * @param codingMode
     *        Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The
     *        adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the
     *        description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodingMode
     */

    public AacSettings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix
     * setting receives a stereo description plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * 
     * @param codingMode
     *        Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The
     *        adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the
     *        description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodingMode
     */

    public AacSettings withCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair. The Audio
     * Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to
     * broadcasterMixedAd.
     * 
     * Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * 
     * @param inputType
     *        Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.
     *        The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream
     *        contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio;
     *        the encoder does not perform the mixing. The values in audioTypeControl and audioType (in
     *        AudioDescription) are ignored when set to broadcasterMixedAd.
     * 
     *        Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * @see AacInputType
     */

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair. The Audio
     * Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to
     * broadcasterMixedAd.
     * 
     * Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * 
     * @return Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.
     *         The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream
     *         contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed
     *         audio; the encoder does not perform the mixing. The values in audioTypeControl and audioType (in
     *         AudioDescription) are ignored when set to broadcasterMixedAd.
     * 
     *         Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * @see AacInputType
     */

    public String getInputType() {
        return this.inputType;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair. The Audio
     * Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to
     * broadcasterMixedAd.
     * 
     * Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * 
     * @param inputType
     *        Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.
     *        The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream
     *        contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio;
     *        the encoder does not perform the mixing. The values in audioTypeControl and audioType (in
     *        AudioDescription) are ignored when set to broadcasterMixedAd.
     * 
     *        Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacInputType
     */

    public AacSettings withInputType(String inputType) {
        setInputType(inputType);
        return this;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair. The Audio
     * Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to
     * broadcasterMixedAd.
     * 
     * Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * 
     * @param inputType
     *        Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.
     *        The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream
     *        contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio;
     *        the encoder does not perform the mixing. The values in audioTypeControl and audioType (in
     *        AudioDescription) are ignored when set to broadcasterMixedAd.
     * 
     *        Leave set to "normal" when input does not contain pre-mixed audio + AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacInputType
     */

    public AacSettings withInputType(AacInputType inputType) {
        this.inputType = inputType.toString();
        return this;
    }

    /**
     * AAC Profile.
     * 
     * @param profile
     *        AAC Profile.
     * @see AacProfile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * AAC Profile.
     * 
     * @return AAC Profile.
     * @see AacProfile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * AAC Profile.
     * 
     * @param profile
     *        AAC Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacProfile
     */

    public AacSettings withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * AAC Profile.
     * 
     * @param profile
     *        AAC Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacProfile
     */

    public AacSettings withProfile(AacProfile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * Rate Control Mode.
     * 
     * @param rateControlMode
     *        Rate Control Mode.
     * @see AacRateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Rate Control Mode.
     * 
     * @return Rate Control Mode.
     * @see AacRateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Rate Control Mode.
     * 
     * @param rateControlMode
     *        Rate Control Mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRateControlMode
     */

    public AacSettings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Rate Control Mode.
     * 
     * @param rateControlMode
     *        Rate Control Mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRateControlMode
     */

    public AacSettings withRateControlMode(AacRateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * 
     * @param rawFormat
     *        Sets LATM / LOAS AAC output for raw containers.
     * @see AacRawFormat
     */

    public void setRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * 
     * @return Sets LATM / LOAS AAC output for raw containers.
     * @see AacRawFormat
     */

    public String getRawFormat() {
        return this.rawFormat;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * 
     * @param rawFormat
     *        Sets LATM / LOAS AAC output for raw containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRawFormat
     */

    public AacSettings withRawFormat(String rawFormat) {
        setRawFormat(rawFormat);
        return this;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * 
     * @param rawFormat
     *        Sets LATM / LOAS AAC output for raw containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRawFormat
     */

    public AacSettings withRawFormat(AacRawFormat rawFormat) {
        this.rawFormat = rawFormat.toString();
        return this;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @param sampleRate
     *        Sample rate in Hz. Valid values depend on rate control mode and profile.
     */

    public void setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @return Sample rate in Hz. Valid values depend on rate control mode and profile.
     */

    public Double getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @param sampleRate
     *        Sample rate in Hz. Valid values depend on rate control mode and profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AacSettings withSampleRate(Double sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @param spec
     *        Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @see AacSpec
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @return Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @see AacSpec
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @param spec
     *        Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacSpec
     */

    public AacSettings withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @param spec
     *        Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacSpec
     */

    public AacSettings withSpec(AacSpec spec) {
        this.spec = spec.toString();
        return this;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * 
     * @param vbrQuality
     *        VBR Quality Level - Only used if rateControlMode is VBR.
     * @see AacVbrQuality
     */

    public void setVbrQuality(String vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * 
     * @return VBR Quality Level - Only used if rateControlMode is VBR.
     * @see AacVbrQuality
     */

    public String getVbrQuality() {
        return this.vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * 
     * @param vbrQuality
     *        VBR Quality Level - Only used if rateControlMode is VBR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacVbrQuality
     */

    public AacSettings withVbrQuality(String vbrQuality) {
        setVbrQuality(vbrQuality);
        return this;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * 
     * @param vbrQuality
     *        VBR Quality Level - Only used if rateControlMode is VBR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacVbrQuality
     */

    public AacSettings withVbrQuality(AacVbrQuality vbrQuality) {
        this.vbrQuality = vbrQuality.toString();
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
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
        if (getInputType() != null)
            sb.append("InputType: ").append(getInputType()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getRawFormat() != null)
            sb.append("RawFormat: ").append(getRawFormat()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append(getSpec()).append(",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: ").append(getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AacSettings == false)
            return false;
        AacSettings other = (AacSettings) obj;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null && other.getInputType().equals(this.getInputType()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getRawFormat() == null ^ this.getRawFormat() == null)
            return false;
        if (other.getRawFormat() != null && other.getRawFormat().equals(this.getRawFormat()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRawFormat() == null) ? 0 : getRawFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public AacSettings clone() {
        try {
            return (AacSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AacSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
