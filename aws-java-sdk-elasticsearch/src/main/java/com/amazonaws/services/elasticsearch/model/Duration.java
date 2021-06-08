/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies maintenance schedule duration: duration value and duration unit. See the <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
 * target="_blank">Developer Guide</a> for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Duration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     */
    private Long value;
    /**
     * <p>
     * Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param value
     *        Integer to specify the value of a maintenance schedule duration. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @return Integer to specify the value of a maintenance schedule duration. See the <a
     *         href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *         target="_blank">Developer Guide</a> for more information.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * Integer to specify the value of a maintenance schedule duration. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param value
     *        Integer to specify the value of a maintenance schedule duration. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Duration withValue(Long value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param unit
     *        Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     * @see TimeUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @return Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     *         href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *         target="_blank">Developer Guide</a> for more information.
     * @see TimeUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param unit
     *        Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Duration withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param unit
     *        Specifies the unit of a maintenance schedule duration. Valid value is HOURS. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
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
        com.amazonaws.services.elasticsearch.model.transform.DurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
