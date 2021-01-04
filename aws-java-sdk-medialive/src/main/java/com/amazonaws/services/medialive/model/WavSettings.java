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
 * Wav Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/WavSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WavSettings implements Serializable, Cloneable, StructuredPojo {

    /** Bits per sample. */
    private Double bitDepth;
    /** The audio coding mode for the WAV audio. The mode determines the number of channels in the audio. */
    private String codingMode;
    /** Sample rate in Hz. */
    private Double sampleRate;

    /**
     * Bits per sample.
     * 
     * @param bitDepth
     *        Bits per sample.
     */

    public void setBitDepth(Double bitDepth) {
        this.bitDepth = bitDepth;
    }

    /**
     * Bits per sample.
     * 
     * @return Bits per sample.
     */

    public Double getBitDepth() {
        return this.bitDepth;
    }

    /**
     * Bits per sample.
     * 
     * @param bitDepth
     *        Bits per sample.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WavSettings withBitDepth(Double bitDepth) {
        setBitDepth(bitDepth);
        return this;
    }

    /**
     * The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * 
     * @param codingMode
     *        The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * @see WavCodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * 
     * @return The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * @see WavCodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * 
     * @param codingMode
     *        The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WavCodingMode
     */

    public WavSettings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * 
     * @param codingMode
     *        The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WavCodingMode
     */

    public WavSettings withCodingMode(WavCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Sample rate in Hz.
     * 
     * @param sampleRate
     *        Sample rate in Hz.
     */

    public void setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz.
     * 
     * @return Sample rate in Hz.
     */

    public Double getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Sample rate in Hz.
     * 
     * @param sampleRate
     *        Sample rate in Hz.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WavSettings withSampleRate(Double sampleRate) {
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
        if (getBitDepth() != null)
            sb.append("BitDepth: ").append(getBitDepth()).append(",");
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
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

        if (obj instanceof WavSettings == false)
            return false;
        WavSettings other = (WavSettings) obj;
        if (other.getBitDepth() == null ^ this.getBitDepth() == null)
            return false;
        if (other.getBitDepth() != null && other.getBitDepth().equals(this.getBitDepth()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
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

        hashCode = prime * hashCode + ((getBitDepth() == null) ? 0 : getBitDepth().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public WavSettings clone() {
        try {
            return (WavSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.WavSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
