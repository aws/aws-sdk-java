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
 * Details of the Semtech GNSS solver object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SemtechGnssDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SemtechGnssDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The vendor of the solver object.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The type of positioning solver used.
     * </p>
     */
    private String type;
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
     * The vendor of the solver object.
     * </p>
     * 
     * @param provider
     *        The vendor of the solver object.
     * @see PositionSolverProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The vendor of the solver object.
     * </p>
     * 
     * @return The vendor of the solver object.
     * @see PositionSolverProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The vendor of the solver object.
     * </p>
     * 
     * @param provider
     *        The vendor of the solver object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverProvider
     */

    public SemtechGnssDetail withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The vendor of the solver object.
     * </p>
     * 
     * @param provider
     *        The vendor of the solver object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverProvider
     */

    public SemtechGnssDetail withProvider(PositionSolverProvider provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * The type of positioning solver used.
     * </p>
     * 
     * @param type
     *        The type of positioning solver used.
     * @see PositionSolverType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of positioning solver used.
     * </p>
     * 
     * @return The type of positioning solver used.
     * @see PositionSolverType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of positioning solver used.
     * </p>
     * 
     * @param type
     *        The type of positioning solver used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverType
     */

    public SemtechGnssDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of positioning solver used.
     * </p>
     * 
     * @param type
     *        The type of positioning solver used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverType
     */

    public SemtechGnssDetail withType(PositionSolverType type) {
        this.type = type.toString();
        return this;
    }

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

    public SemtechGnssDetail withStatus(String status) {
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

    public SemtechGnssDetail withStatus(PositionConfigurationStatus status) {
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

    public SemtechGnssDetail withFec(String fec) {
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

    public SemtechGnssDetail withFec(PositionConfigurationFec fec) {
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
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof SemtechGnssDetail == false)
            return false;
        SemtechGnssDetail other = (SemtechGnssDetail) obj;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFec() == null) ? 0 : getFec().hashCode());
        return hashCode;
    }

    @Override
    public SemtechGnssDetail clone() {
        try {
            return (SemtechGnssDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SemtechGnssDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
