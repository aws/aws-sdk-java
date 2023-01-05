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
 * The wrapper for position solver configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PositionSolverConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PositionSolverConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Semtech GNSS solver configuration object.
     * </p>
     */
    private SemtechGnssConfiguration semtechGnss;

    /**
     * <p>
     * The Semtech GNSS solver configuration object.
     * </p>
     * 
     * @param semtechGnss
     *        The Semtech GNSS solver configuration object.
     */

    public void setSemtechGnss(SemtechGnssConfiguration semtechGnss) {
        this.semtechGnss = semtechGnss;
    }

    /**
     * <p>
     * The Semtech GNSS solver configuration object.
     * </p>
     * 
     * @return The Semtech GNSS solver configuration object.
     */

    public SemtechGnssConfiguration getSemtechGnss() {
        return this.semtechGnss;
    }

    /**
     * <p>
     * The Semtech GNSS solver configuration object.
     * </p>
     * 
     * @param semtechGnss
     *        The Semtech GNSS solver configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PositionSolverConfigurations withSemtechGnss(SemtechGnssConfiguration semtechGnss) {
        setSemtechGnss(semtechGnss);
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
        if (getSemtechGnss() != null)
            sb.append("SemtechGnss: ").append(getSemtechGnss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PositionSolverConfigurations == false)
            return false;
        PositionSolverConfigurations other = (PositionSolverConfigurations) obj;
        if (other.getSemtechGnss() == null ^ this.getSemtechGnss() == null)
            return false;
        if (other.getSemtechGnss() != null && other.getSemtechGnss().equals(this.getSemtechGnss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSemtechGnss() == null) ? 0 : getSemtechGnss().hashCode());
        return hashCode;
    }

    @Override
    public PositionSolverConfigurations clone() {
        try {
            return (PositionSolverConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.PositionSolverConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
