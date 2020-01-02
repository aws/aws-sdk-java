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
 * Object that describes the frequency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/Frequency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Frequency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Frequency units.
     * </p>
     */
    private String units;
    /**
     * <p>
     * Frequency value.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * Frequency units.
     * </p>
     * 
     * @param units
     *        Frequency units.
     * @see FrequencyUnits
     */

    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * <p>
     * Frequency units.
     * </p>
     * 
     * @return Frequency units.
     * @see FrequencyUnits
     */

    public String getUnits() {
        return this.units;
    }

    /**
     * <p>
     * Frequency units.
     * </p>
     * 
     * @param units
     *        Frequency units.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrequencyUnits
     */

    public Frequency withUnits(String units) {
        setUnits(units);
        return this;
    }

    /**
     * <p>
     * Frequency units.
     * </p>
     * 
     * @param units
     *        Frequency units.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrequencyUnits
     */

    public Frequency withUnits(FrequencyUnits units) {
        this.units = units.toString();
        return this;
    }

    /**
     * <p>
     * Frequency value.
     * </p>
     * 
     * @param value
     *        Frequency value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * Frequency value.
     * </p>
     * 
     * @return Frequency value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * Frequency value.
     * </p>
     * 
     * @param value
     *        Frequency value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Frequency withValue(Double value) {
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
        if (getUnits() != null)
            sb.append("Units: ").append(getUnits()).append(",");
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

        if (obj instanceof Frequency == false)
            return false;
        Frequency other = (Frequency) obj;
        if (other.getUnits() == null ^ this.getUnits() == null)
            return false;
        if (other.getUnits() != null && other.getUnits().equals(this.getUnits()) == false)
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

        hashCode = prime * hashCode + ((getUnits() == null) ? 0 : getUnits().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Frequency clone() {
        try {
            return (Frequency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.FrequencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
