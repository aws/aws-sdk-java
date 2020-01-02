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
 * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AntennaDownlinkDemodDecodeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AntennaDownlinkDemodDecodeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the decode <code>Config</code>.
     * </p>
     */
    private DecodeConfig decodeConfig;
    /**
     * <p>
     * Information about the demodulation <code>Config</code>.
     * </p>
     */
    private DemodulationConfig demodulationConfig;
    /**
     * <p>
     * Information about the spectral <code>Config</code>.
     * </p>
     */
    private SpectrumConfig spectrumConfig;

    /**
     * <p>
     * Information about the decode <code>Config</code>.
     * </p>
     * 
     * @param decodeConfig
     *        Information about the decode <code>Config</code>.
     */

    public void setDecodeConfig(DecodeConfig decodeConfig) {
        this.decodeConfig = decodeConfig;
    }

    /**
     * <p>
     * Information about the decode <code>Config</code>.
     * </p>
     * 
     * @return Information about the decode <code>Config</code>.
     */

    public DecodeConfig getDecodeConfig() {
        return this.decodeConfig;
    }

    /**
     * <p>
     * Information about the decode <code>Config</code>.
     * </p>
     * 
     * @param decodeConfig
     *        Information about the decode <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaDownlinkDemodDecodeConfig withDecodeConfig(DecodeConfig decodeConfig) {
        setDecodeConfig(decodeConfig);
        return this;
    }

    /**
     * <p>
     * Information about the demodulation <code>Config</code>.
     * </p>
     * 
     * @param demodulationConfig
     *        Information about the demodulation <code>Config</code>.
     */

    public void setDemodulationConfig(DemodulationConfig demodulationConfig) {
        this.demodulationConfig = demodulationConfig;
    }

    /**
     * <p>
     * Information about the demodulation <code>Config</code>.
     * </p>
     * 
     * @return Information about the demodulation <code>Config</code>.
     */

    public DemodulationConfig getDemodulationConfig() {
        return this.demodulationConfig;
    }

    /**
     * <p>
     * Information about the demodulation <code>Config</code>.
     * </p>
     * 
     * @param demodulationConfig
     *        Information about the demodulation <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaDownlinkDemodDecodeConfig withDemodulationConfig(DemodulationConfig demodulationConfig) {
        setDemodulationConfig(demodulationConfig);
        return this;
    }

    /**
     * <p>
     * Information about the spectral <code>Config</code>.
     * </p>
     * 
     * @param spectrumConfig
     *        Information about the spectral <code>Config</code>.
     */

    public void setSpectrumConfig(SpectrumConfig spectrumConfig) {
        this.spectrumConfig = spectrumConfig;
    }

    /**
     * <p>
     * Information about the spectral <code>Config</code>.
     * </p>
     * 
     * @return Information about the spectral <code>Config</code>.
     */

    public SpectrumConfig getSpectrumConfig() {
        return this.spectrumConfig;
    }

    /**
     * <p>
     * Information about the spectral <code>Config</code>.
     * </p>
     * 
     * @param spectrumConfig
     *        Information about the spectral <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaDownlinkDemodDecodeConfig withSpectrumConfig(SpectrumConfig spectrumConfig) {
        setSpectrumConfig(spectrumConfig);
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
        if (getDecodeConfig() != null)
            sb.append("DecodeConfig: ").append(getDecodeConfig()).append(",");
        if (getDemodulationConfig() != null)
            sb.append("DemodulationConfig: ").append(getDemodulationConfig()).append(",");
        if (getSpectrumConfig() != null)
            sb.append("SpectrumConfig: ").append(getSpectrumConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AntennaDownlinkDemodDecodeConfig == false)
            return false;
        AntennaDownlinkDemodDecodeConfig other = (AntennaDownlinkDemodDecodeConfig) obj;
        if (other.getDecodeConfig() == null ^ this.getDecodeConfig() == null)
            return false;
        if (other.getDecodeConfig() != null && other.getDecodeConfig().equals(this.getDecodeConfig()) == false)
            return false;
        if (other.getDemodulationConfig() == null ^ this.getDemodulationConfig() == null)
            return false;
        if (other.getDemodulationConfig() != null && other.getDemodulationConfig().equals(this.getDemodulationConfig()) == false)
            return false;
        if (other.getSpectrumConfig() == null ^ this.getSpectrumConfig() == null)
            return false;
        if (other.getSpectrumConfig() != null && other.getSpectrumConfig().equals(this.getSpectrumConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecodeConfig() == null) ? 0 : getDecodeConfig().hashCode());
        hashCode = prime * hashCode + ((getDemodulationConfig() == null) ? 0 : getDemodulationConfig().hashCode());
        hashCode = prime * hashCode + ((getSpectrumConfig() == null) ? 0 : getSpectrumConfig().hashCode());
        return hashCode;
    }

    @Override
    public AntennaDownlinkDemodDecodeConfig clone() {
        try {
            return (AntennaDownlinkDemodDecodeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AntennaDownlinkDemodDecodeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
