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
 * Elevation angle of the satellite in the sky during a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/Elevation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Elevation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Elevation angle units.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Elevation angle value.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * Elevation angle units.
     * </p>
     * 
     * @param unit
     *        Elevation angle units.
     * @see AngleUnits
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Elevation angle units.
     * </p>
     * 
     * @return Elevation angle units.
     * @see AngleUnits
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Elevation angle units.
     * </p>
     * 
     * @param unit
     *        Elevation angle units.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AngleUnits
     */

    public Elevation withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Elevation angle units.
     * </p>
     * 
     * @param unit
     *        Elevation angle units.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AngleUnits
     */

    public Elevation withUnit(AngleUnits unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * Elevation angle value.
     * </p>
     * 
     * @param value
     *        Elevation angle value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * Elevation angle value.
     * </p>
     * 
     * @return Elevation angle value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * Elevation angle value.
     * </p>
     * 
     * @param value
     *        Elevation angle value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Elevation withValue(Double value) {
        setValue(value);
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
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Elevation == false)
            return false;
        Elevation other = (Elevation) obj;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Elevation clone() {
        try {
            return (Elevation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.ElevationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
