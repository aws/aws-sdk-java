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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Worker orientation measured in units clockwise from north.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/Orientation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Orientation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Degrees, limited on [0, 360)
     * </p>
     */
    private Double degrees;

    /**
     * <p>
     * Degrees, limited on [0, 360)
     * </p>
     * 
     * @param degrees
     *        Degrees, limited on [0, 360)
     */

    public void setDegrees(Double degrees) {
        this.degrees = degrees;
    }

    /**
     * <p>
     * Degrees, limited on [0, 360)
     * </p>
     * 
     * @return Degrees, limited on [0, 360)
     */

    public Double getDegrees() {
        return this.degrees;
    }

    /**
     * <p>
     * Degrees, limited on [0, 360)
     * </p>
     * 
     * @param degrees
     *        Degrees, limited on [0, 360)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Orientation withDegrees(Double degrees) {
        setDegrees(degrees);
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
        if (getDegrees() != null)
            sb.append("Degrees: ").append(getDegrees());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Orientation == false)
            return false;
        Orientation other = (Orientation) obj;
        if (other.getDegrees() == null ^ this.getDegrees() == null)
            return false;
        if (other.getDegrees() != null && other.getDegrees().equals(this.getDegrees()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDegrees() == null) ? 0 : getDegrees().hashCode());
        return hashCode;
    }

    @Override
    public Orientation clone() {
        try {
            return (Orientation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotroborunner.model.transform.OrientationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
