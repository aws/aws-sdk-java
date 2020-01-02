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
 * Object that represents EIRP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/Eirp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Eirp implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Units of an EIRP.
     * </p>
     */
    private String units;
    /**
     * <p>
     * Value of an EIRP.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * Units of an EIRP.
     * </p>
     * 
     * @param units
     *        Units of an EIRP.
     * @see EirpUnits
     */

    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * <p>
     * Units of an EIRP.
     * </p>
     * 
     * @return Units of an EIRP.
     * @see EirpUnits
     */

    public String getUnits() {
        return this.units;
    }

    /**
     * <p>
     * Units of an EIRP.
     * </p>
     * 
     * @param units
     *        Units of an EIRP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EirpUnits
     */

    public Eirp withUnits(String units) {
        setUnits(units);
        return this;
    }

    /**
     * <p>
     * Units of an EIRP.
     * </p>
     * 
     * @param units
     *        Units of an EIRP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EirpUnits
     */

    public Eirp withUnits(EirpUnits units) {
        this.units = units.toString();
        return this;
    }

    /**
     * <p>
     * Value of an EIRP.
     * </p>
     * 
     * @param value
     *        Value of an EIRP.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * Value of an EIRP.
     * </p>
     * 
     * @return Value of an EIRP.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * Value of an EIRP.
     * </p>
     * 
     * @param value
     *        Value of an EIRP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Eirp withValue(Double value) {
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

        if (obj instanceof Eirp == false)
            return false;
        Eirp other = (Eirp) obj;
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
    public Eirp clone() {
        try {
            return (Eirp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.EirpMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
