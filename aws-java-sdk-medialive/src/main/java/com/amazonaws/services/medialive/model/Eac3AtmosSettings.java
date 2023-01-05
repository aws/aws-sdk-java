/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Eac3 Atmos Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Eac3AtmosSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Eac3AtmosSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     */
    private Double bitrate;
    /** Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels. */
    private String codingMode;
    /** Sets the dialnorm for the output. Default 23. */
    private Integer dialnorm;
    /** Sets the Dolby dynamic range compression profile. */
    private String drcLine;
    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not
     * exceed specified levels.
     */
    private String drcRf;
    /**
     * Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream player
     * isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     */
    private Double heightTrim;
    /**
     * Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream player
     * isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     */
    private Double surroundTrim;

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     */

    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     * 
     * @return Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     */

    public Double getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Valid bitrates depend on the coding mode. // * @affectsRightSizing true
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withBitrate(Double bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * @see Eac3AtmosCodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * 
     * @return Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * @see Eac3AtmosCodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosCodingMode
     */

    public Eac3AtmosSettings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * 
     * @param codingMode
     *        Dolby Digital Plus with Dolby Atmos coding mode. Determines number of channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosCodingMode
     */

    public Eac3AtmosSettings withCodingMode(Eac3AtmosCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Sets the dialnorm for the output. Default 23.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. Default 23.
     */

    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. Default 23.
     * 
     * @return Sets the dialnorm for the output. Default 23.
     */

    public Integer getDialnorm() {
        return this.dialnorm;
    }

    /**
     * Sets the dialnorm for the output. Default 23.
     * 
     * @param dialnorm
     *        Sets the dialnorm for the output. Default 23.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withDialnorm(Integer dialnorm) {
        setDialnorm(dialnorm);
        return this;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @param drcLine
     *        Sets the Dolby dynamic range compression profile.
     * @see Eac3AtmosDrcLine
     */

    public void setDrcLine(String drcLine) {
        this.drcLine = drcLine;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @return Sets the Dolby dynamic range compression profile.
     * @see Eac3AtmosDrcLine
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
     * @see Eac3AtmosDrcLine
     */

    public Eac3AtmosSettings withDrcLine(String drcLine) {
        setDrcLine(drcLine);
        return this;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * 
     * @param drcLine
     *        Sets the Dolby dynamic range compression profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Eac3AtmosDrcLine
     */

    public Eac3AtmosSettings withDrcLine(Eac3AtmosDrcLine drcLine) {
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
     * @see Eac3AtmosDrcRf
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
     * @see Eac3AtmosDrcRf
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
     * @see Eac3AtmosDrcRf
     */

    public Eac3AtmosSettings withDrcRf(String drcRf) {
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
     * @see Eac3AtmosDrcRf
     */

    public Eac3AtmosSettings withDrcRf(Eac3AtmosDrcRf drcRf) {
        this.drcRf = drcRf.toString();
        return this;
    }

    /**
     * Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream player
     * isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * 
     * @param heightTrim
     *        Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream
     *        player isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     */

    public void setHeightTrim(Double heightTrim) {
        this.heightTrim = heightTrim;
    }

    /**
     * Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream player
     * isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * 
     * @return Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream
     *         player isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     */

    public Double getHeightTrim() {
        return this.heightTrim;
    }

    /**
     * Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream player
     * isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * 
     * @param heightTrim
     *        Height dimensional trim. Sets the maximum amount to attenuate the height channels when the downstream
     *        player isn??t configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withHeightTrim(Double heightTrim) {
        setHeightTrim(heightTrim);
        return this;
    }

    /**
     * Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream player
     * isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * 
     * @param surroundTrim
     *        Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream
     *        player isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     */

    public void setSurroundTrim(Double surroundTrim) {
        this.surroundTrim = surroundTrim;
    }

    /**
     * Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream player
     * isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * 
     * @return Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream
     *         player isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     */

    public Double getSurroundTrim() {
        return this.surroundTrim;
    }

    /**
     * Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream player
     * isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * 
     * @param surroundTrim
     *        Surround dimensional trim. Sets the maximum amount to attenuate the surround channels when the downstream
     *        player isn't configured to handle Dolby Digital Plus with Dolby Atmos and must remix the channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eac3AtmosSettings withSurroundTrim(Double surroundTrim) {
        setSurroundTrim(surroundTrim);
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
        if (getDialnorm() != null)
            sb.append("Dialnorm: ").append(getDialnorm()).append(",");
        if (getDrcLine() != null)
            sb.append("DrcLine: ").append(getDrcLine()).append(",");
        if (getDrcRf() != null)
            sb.append("DrcRf: ").append(getDrcRf()).append(",");
        if (getHeightTrim() != null)
            sb.append("HeightTrim: ").append(getHeightTrim()).append(",");
        if (getSurroundTrim() != null)
            sb.append("SurroundTrim: ").append(getSurroundTrim());
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
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
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
        if (other.getHeightTrim() == null ^ this.getHeightTrim() == null)
            return false;
        if (other.getHeightTrim() != null && other.getHeightTrim().equals(this.getHeightTrim()) == false)
            return false;
        if (other.getSurroundTrim() == null ^ this.getSurroundTrim() == null)
            return false;
        if (other.getSurroundTrim() != null && other.getSurroundTrim().equals(this.getSurroundTrim()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getDialnorm() == null) ? 0 : getDialnorm().hashCode());
        hashCode = prime * hashCode + ((getDrcLine() == null) ? 0 : getDrcLine().hashCode());
        hashCode = prime * hashCode + ((getDrcRf() == null) ? 0 : getDrcRf().hashCode());
        hashCode = prime * hashCode + ((getHeightTrim() == null) ? 0 : getHeightTrim().hashCode());
        hashCode = prime * hashCode + ((getSurroundTrim() == null) ? 0 : getSurroundTrim().hashCode());
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
        com.amazonaws.services.medialive.model.transform.Eac3AtmosSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
