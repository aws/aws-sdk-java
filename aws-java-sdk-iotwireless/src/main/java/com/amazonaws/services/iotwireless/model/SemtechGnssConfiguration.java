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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Semtech GNSS solver configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SemtechGnssConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SemtechGnssConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status indicating whether the solver is enabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Whether forward error correction is enabled.
     * </p>
     */
    private String fec;

    /**
     * <p>
     * The status indicating whether the solver is enabled.
     * </p>
     * 
     * @param status
     *        The status indicating whether the solver is enabled.
     * @see PositionConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status indicating whether the solver is enabled.
     * </p>
     * 
     * @return The status indicating whether the solver is enabled.
     * @see PositionConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status indicating whether the solver is enabled.
     * </p>
     * 
     * @param status
     *        The status indicating whether the solver is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionConfigurationStatus
     */

    public SemtechGnssConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status indicating whether the solver is enabled.
     * </p>
     * 
     * @param status
     *        The status indicating whether the solver is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionConfigurationStatus
     */

    public SemtechGnssConfiguration withStatus(PositionConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Whether forward error correction is enabled.
     * </p>
     * 
     * @param fec
     *        Whether forward error correction is enabled.
     * @see PositionConfigurationFec
     */

    public void setFec(String fec) {
        this.fec = fec;
    }

    /**
     * <p>
     * Whether forward error correction is enabled.
     * </p>
     * 
     * @return Whether forward error correction is enabled.
     * @see PositionConfigurationFec
     */

    public String getFec() {
        return this.fec;
    }

    /**
     * <p>
     * Whether forward error correction is enabled.
     * </p>
     * 
     * @param fec
     *        Whether forward error correction is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionConfigurationFec
     */

    public SemtechGnssConfiguration withFec(String fec) {
        setFec(fec);
        return this;
    }

    /**
     * <p>
     * Whether forward error correction is enabled.
     * </p>
     * 
     * @param fec
     *        Whether forward error correction is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionConfigurationFec
     */

    public SemtechGnssConfiguration withFec(PositionConfigurationFec fec) {
        this.fec = fec.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFec() != null)
            sb.append("Fec: ").append(getFec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SemtechGnssConfiguration == false)
            return false;
        SemtechGnssConfiguration other = (SemtechGnssConfiguration) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFec() == null ^ this.getFec() == null)
            return false;
        if (other.getFec() != null && other.getFec().equals(this.getFec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFec() == null) ? 0 : getFec().hashCode());
        return hashCode;
    }

    @Override
    public SemtechGnssConfiguration clone() {
        try {
            return (SemtechGnssConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SemtechGnssConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
