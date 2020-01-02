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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a duration of time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/Duration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Duration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unit of time.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * A number of time units.
     * </p>
     */
    private Long value;

    /**
     * <p>
     * A unit of time.
     * </p>
     * 
     * @param unit
     *        A unit of time.
     * @see DurationUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * 
     * @return A unit of time.
     * @see DurationUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * 
     * @param unit
     *        A unit of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnit
     */

    public Duration withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * 
     * @param unit
     *        A unit of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnit
     */

    public Duration withUnit(DurationUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * A number of time units.
     * </p>
     * 
     * @param value
     *        A number of time units.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * A number of time units.
     * </p>
     * 
     * @return A number of time units.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * A number of time units.
     * </p>
     * 
     * @param value
     *        A number of time units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Duration withValue(Long value) {
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

        if (obj instanceof Duration == false)
            return false;
        Duration other = (Duration) obj;
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
    public Duration clone() {
        try {
            return (Duration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.DurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
