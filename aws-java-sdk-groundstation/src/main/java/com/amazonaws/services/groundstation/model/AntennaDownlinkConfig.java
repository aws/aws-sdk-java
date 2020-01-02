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
 * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AntennaDownlinkConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AntennaDownlinkConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Object that describes a spectral <code>Config</code>.
     * </p>
     */
    private SpectrumConfig spectrumConfig;

    /**
     * <p>
     * Object that describes a spectral <code>Config</code>.
     * </p>
     * 
     * @param spectrumConfig
     *        Object that describes a spectral <code>Config</code>.
     */

    public void setSpectrumConfig(SpectrumConfig spectrumConfig) {
        this.spectrumConfig = spectrumConfig;
    }

    /**
     * <p>
     * Object that describes a spectral <code>Config</code>.
     * </p>
     * 
     * @return Object that describes a spectral <code>Config</code>.
     */

    public SpectrumConfig getSpectrumConfig() {
        return this.spectrumConfig;
    }

    /**
     * <p>
     * Object that describes a spectral <code>Config</code>.
     * </p>
     * 
     * @param spectrumConfig
     *        Object that describes a spectral <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaDownlinkConfig withSpectrumConfig(SpectrumConfig spectrumConfig) {
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

        if (obj instanceof AntennaDownlinkConfig == false)
            return false;
        AntennaDownlinkConfig other = (AntennaDownlinkConfig) obj;
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

        hashCode = prime * hashCode + ((getSpectrumConfig() == null) ? 0 : getSpectrumConfig().hashCode());
        return hashCode;
    }

    @Override
    public AntennaDownlinkConfig clone() {
        try {
            return (AntennaDownlinkConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AntennaDownlinkConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
