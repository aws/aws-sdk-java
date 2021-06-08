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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object that describes a spectral <code>Config</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/SpectrumConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpectrumConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     * limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * </ul>
     */
    private FrequencyBandwidth bandwidth;
    /**
     * <p>
     * Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to 8400
     * MHz for downlink and 2025 to 2120 MHz for uplink.
     * </p>
     */
    private Frequency centerFrequency;
    /**
     * <p>
     * Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     * <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * </p>
     */
    private String polarization;

    /**
     * <p>
     * Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     * limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bandwidth
     *        Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     *        limitations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     *        </p>
     *        </li>
     */

    public void setBandwidth(FrequencyBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     * limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     *         limitations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     *         </p>
     *         </li>
     */

    public FrequencyBandwidth getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     * limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bandwidth
     *        Bandwidth of a spectral <code>Config</code>. AWS Ground Station currently has the following bandwidth
     *        limitations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>AntennaDownlinkDemodDecodeconfig</code>, valid values are between 125 kHz to 650 MHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>AntennaDownlinkconfig</code> valid values are between 10 kHz to 54 MHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>AntennaUplinkConfig</code>, valid values are between 10 kHz to 54 MHz.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpectrumConfig withBandwidth(FrequencyBandwidth bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to 8400
     * MHz for downlink and 2025 to 2120 MHz for uplink.
     * </p>
     * 
     * @param centerFrequency
     *        Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to
     *        8400 MHz for downlink and 2025 to 2120 MHz for uplink.
     */

    public void setCenterFrequency(Frequency centerFrequency) {
        this.centerFrequency = centerFrequency;
    }

    /**
     * <p>
     * Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to 8400
     * MHz for downlink and 2025 to 2120 MHz for uplink.
     * </p>
     * 
     * @return Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to
     *         8400 MHz for downlink and 2025 to 2120 MHz for uplink.
     */

    public Frequency getCenterFrequency() {
        return this.centerFrequency;
    }

    /**
     * <p>
     * Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to 8400
     * MHz for downlink and 2025 to 2120 MHz for uplink.
     * </p>
     * 
     * @param centerFrequency
     *        Center frequency of a spectral <code>Config</code>. Valid values are between 2200 to 2300 MHz and 7750 to
     *        8400 MHz for downlink and 2025 to 2120 MHz for uplink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpectrumConfig withCenterFrequency(Frequency centerFrequency) {
        setCenterFrequency(centerFrequency);
        return this;
    }

    /**
     * <p>
     * Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     * <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * </p>
     * 
     * @param polarization
     *        Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     *        <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * @see Polarization
     */

    public void setPolarization(String polarization) {
        this.polarization = polarization;
    }

    /**
     * <p>
     * Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     * <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * </p>
     * 
     * @return Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     *         <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * @see Polarization
     */

    public String getPolarization() {
        return this.polarization;
    }

    /**
     * <p>
     * Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     * <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * </p>
     * 
     * @param polarization
     *        Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     *        <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Polarization
     */

    public SpectrumConfig withPolarization(String polarization) {
        setPolarization(polarization);
        return this;
    }

    /**
     * <p>
     * Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     * <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * </p>
     * 
     * @param polarization
     *        Polarization of a spectral <code>Config</code>. Capturing both <code>"RIGHT_HAND"</code> and
     *        <code>"LEFT_HAND"</code> polarization requires two separate configs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Polarization
     */

    public SpectrumConfig withPolarization(Polarization polarization) {
        this.polarization = polarization.toString();
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
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getCenterFrequency() != null)
            sb.append("CenterFrequency: ").append(getCenterFrequency()).append(",");
        if (getPolarization() != null)
            sb.append("Polarization: ").append(getPolarization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpectrumConfig == false)
            return false;
        SpectrumConfig other = (SpectrumConfig) obj;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getCenterFrequency() == null ^ this.getCenterFrequency() == null)
            return false;
        if (other.getCenterFrequency() != null && other.getCenterFrequency().equals(this.getCenterFrequency()) == false)
            return false;
        if (other.getPolarization() == null ^ this.getPolarization() == null)
            return false;
        if (other.getPolarization() != null && other.getPolarization().equals(this.getPolarization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getCenterFrequency() == null) ? 0 : getCenterFrequency().hashCode());
        hashCode = prime * hashCode + ((getPolarization() == null) ? 0 : getPolarization().hashCode());
        return hashCode;
    }

    @Override
    public SpectrumConfig clone() {
        try {
            return (SpectrumConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.SpectrumConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
