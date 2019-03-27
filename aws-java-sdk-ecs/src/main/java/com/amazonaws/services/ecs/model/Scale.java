/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Scale" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scale implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set. Accepted
     * values are numbers between 0 and 100.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set. Accepted
     * values are numbers between 0 and 100.
     * </p>
     * 
     * @param value
     *        The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set.
     *        Accepted values are numbers between 0 and 100.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set. Accepted
     * values are numbers between 0 and 100.
     * </p>
     * 
     * @return The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set.
     *         Accepted values are numbers between 0 and 100.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set. Accepted
     * values are numbers between 0 and 100.
     * </p>
     * 
     * @param value
     *        The value, specified as a percent total of a service's <code>desiredCount</code>, to scale the task set.
     *        Accepted values are numbers between 0 and 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scale withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the scale value.
     * @see ScaleUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * 
     * @return The unit of measure for the scale value.
     * @see ScaleUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the scale value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleUnit
     */

    public Scale withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the scale value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleUnit
     */

    public Scale withUnit(ScaleUnit unit) {
        this.unit = unit.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scale == false)
            return false;
        Scale other = (Scale) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public Scale clone() {
        try {
            return (Scale) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ScaleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
