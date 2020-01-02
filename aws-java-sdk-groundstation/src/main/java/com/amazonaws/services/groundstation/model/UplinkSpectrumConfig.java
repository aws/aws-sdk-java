/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the uplink spectral <code>Config</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UplinkSpectrumConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UplinkSpectrumConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Center frequency of an uplink spectral <code>Config</code>.
     * </p>
     */
    private Frequency centerFrequency;
    /**
     * <p>
     * Polarization of an uplink spectral <code>Config</code>.
     * </p>
     */
    private String polarization;

    /**
     * <p>
     * Center frequency of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param centerFrequency
     *        Center frequency of an uplink spectral <code>Config</code>.
     */

    public void setCenterFrequency(Frequency centerFrequency) {
        this.centerFrequency = centerFrequency;
    }

    /**
     * <p>
     * Center frequency of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @return Center frequency of an uplink spectral <code>Config</code>.
     */

    public Frequency getCenterFrequency() {
        return this.centerFrequency;
    }

    /**
     * <p>
     * Center frequency of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param centerFrequency
     *        Center frequency of an uplink spectral <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UplinkSpectrumConfig withCenterFrequency(Frequency centerFrequency) {
        setCenterFrequency(centerFrequency);
        return this;
    }

    /**
     * <p>
     * Polarization of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param polarization
     *        Polarization of an uplink spectral <code>Config</code>.
     * @see Polarization
     */

    public void setPolarization(String polarization) {
        this.polarization = polarization;
    }

    /**
     * <p>
     * Polarization of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @return Polarization of an uplink spectral <code>Config</code>.
     * @see Polarization
     */

    public String getPolarization() {
        return this.polarization;
    }

    /**
     * <p>
     * Polarization of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param polarization
     *        Polarization of an uplink spectral <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Polarization
     */

    public UplinkSpectrumConfig withPolarization(String polarization) {
        setPolarization(polarization);
        return this;
    }

    /**
     * <p>
     * Polarization of an uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param polarization
     *        Polarization of an uplink spectral <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Polarization
     */

    public UplinkSpectrumConfig withPolarization(Polarization polarization) {
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

        if (obj instanceof UplinkSpectrumConfig == false)
            return false;
        UplinkSpectrumConfig other = (UplinkSpectrumConfig) obj;
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

        hashCode = prime * hashCode + ((getCenterFrequency() == null) ? 0 : getCenterFrequency().hashCode());
        hashCode = prime * hashCode + ((getPolarization() == null) ? 0 : getPolarization().hashCode());
        return hashCode;
    }

    @Override
    public UplinkSpectrumConfig clone() {
        try {
            return (UplinkSpectrumConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.UplinkSpectrumConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
