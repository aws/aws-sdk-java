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
 * Information about the uplink <code>Config</code> of an antenna.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AntennaUplinkConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AntennaUplinkConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the uplink spectral <code>Config</code>.
     * </p>
     */
    private UplinkSpectrumConfig spectrumConfig;
    /**
     * <p>
     * EIRP of the target.
     * </p>
     */
    private Eirp targetEirp;

    /**
     * <p>
     * Information about the uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param spectrumConfig
     *        Information about the uplink spectral <code>Config</code>.
     */

    public void setSpectrumConfig(UplinkSpectrumConfig spectrumConfig) {
        this.spectrumConfig = spectrumConfig;
    }

    /**
     * <p>
     * Information about the uplink spectral <code>Config</code>.
     * </p>
     * 
     * @return Information about the uplink spectral <code>Config</code>.
     */

    public UplinkSpectrumConfig getSpectrumConfig() {
        return this.spectrumConfig;
    }

    /**
     * <p>
     * Information about the uplink spectral <code>Config</code>.
     * </p>
     * 
     * @param spectrumConfig
     *        Information about the uplink spectral <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaUplinkConfig withSpectrumConfig(UplinkSpectrumConfig spectrumConfig) {
        setSpectrumConfig(spectrumConfig);
        return this;
    }

    /**
     * <p>
     * EIRP of the target.
     * </p>
     * 
     * @param targetEirp
     *        EIRP of the target.
     */

    public void setTargetEirp(Eirp targetEirp) {
        this.targetEirp = targetEirp;
    }

    /**
     * <p>
     * EIRP of the target.
     * </p>
     * 
     * @return EIRP of the target.
     */

    public Eirp getTargetEirp() {
        return this.targetEirp;
    }

    /**
     * <p>
     * EIRP of the target.
     * </p>
     * 
     * @param targetEirp
     *        EIRP of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaUplinkConfig withTargetEirp(Eirp targetEirp) {
        setTargetEirp(targetEirp);
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
        if (getSpectrumConfig() != null)
            sb.append("SpectrumConfig: ").append(getSpectrumConfig()).append(",");
        if (getTargetEirp() != null)
            sb.append("TargetEirp: ").append(getTargetEirp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AntennaUplinkConfig == false)
            return false;
        AntennaUplinkConfig other = (AntennaUplinkConfig) obj;
        if (other.getSpectrumConfig() == null ^ this.getSpectrumConfig() == null)
            return false;
        if (other.getSpectrumConfig() != null && other.getSpectrumConfig().equals(this.getSpectrumConfig()) == false)
            return false;
        if (other.getTargetEirp() == null ^ this.getTargetEirp() == null)
            return false;
        if (other.getTargetEirp() != null && other.getTargetEirp().equals(this.getTargetEirp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpectrumConfig() == null) ? 0 : getSpectrumConfig().hashCode());
        hashCode = prime * hashCode + ((getTargetEirp() == null) ? 0 : getTargetEirp().hashCode());
        return hashCode;
    }

    @Override
    public AntennaUplinkConfig clone() {
        try {
            return (AntennaUplinkConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AntennaUplinkConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
