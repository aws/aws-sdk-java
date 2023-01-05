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
 * The wrapper for position solver details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PositionSolverDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PositionSolverDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Semtech GNSS solver object details.
     * </p>
     */
    private SemtechGnssDetail semtechGnss;

    /**
     * <p>
     * The Semtech GNSS solver object details.
     * </p>
     * 
     * @param semtechGnss
     *        The Semtech GNSS solver object details.
     */

    public void setSemtechGnss(SemtechGnssDetail semtechGnss) {
        this.semtechGnss = semtechGnss;
    }

    /**
     * <p>
     * The Semtech GNSS solver object details.
     * </p>
     * 
     * @return The Semtech GNSS solver object details.
     */

    public SemtechGnssDetail getSemtechGnss() {
        return this.semtechGnss;
    }

    /**
     * <p>
     * The Semtech GNSS solver object details.
     * </p>
     * 
     * @param semtechGnss
     *        The Semtech GNSS solver object details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PositionSolverDetails withSemtechGnss(SemtechGnssDetail semtechGnss) {
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

        if (obj instanceof PositionSolverDetails == false)
            return false;
        PositionSolverDetails other = (PositionSolverDetails) obj;
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
    public PositionSolverDetails clone() {
        try {
            return (PositionSolverDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.PositionSolverDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
