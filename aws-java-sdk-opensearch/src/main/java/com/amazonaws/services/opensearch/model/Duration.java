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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The duration of a maintenance schedule. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
 * OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Duration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration.
     * </p>
     */
    private Long value;
    /**
     * <p>
     * The unit of measurement for the duration of a maintenance schedule.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration.
     * </p>
     * 
     * @param value
     *        Integer to specify the value of a maintenance schedule duration.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration.
     * </p>
     * 
     * @return Integer to specify the value of a maintenance schedule duration.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration.
     * </p>
     * 
     * @param value
     *        Integer to specify the value of a maintenance schedule duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Duration withValue(Long value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the duration of a maintenance schedule.
     * </p>
     * 
     * @param unit
     *        The unit of measurement for the duration of a maintenance schedule.
     * @see TimeUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement for the duration of a maintenance schedule.
     * </p>
     * 
     * @return The unit of measurement for the duration of a maintenance schedule.
     * @see TimeUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measurement for the duration of a maintenance schedule.
     * </p>
     * 
     * @param unit
     *        The unit of measurement for the duration of a maintenance schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Duration withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the duration of a maintenance schedule.
     * </p>
     * 
     * @param unit
     *        The unit of measurement for the duration of a maintenance schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Duration withUnit(TimeUnit unit) {
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

        if (obj instanceof Duration == false)
            return false;
        Duration other = (Duration) obj;
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
        com.amazonaws.services.opensearch.model.transform.DurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
