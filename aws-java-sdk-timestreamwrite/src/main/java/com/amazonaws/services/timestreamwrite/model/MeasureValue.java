/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or the RPM of a
 * wind turbine are measures. MeasureValue has both name and value.
 * </p>
 * <p>
 * MeasureValue is only allowed for type <code>MULTI</code>. Using <code>MULTI</code> type, you can pass multiple data
 * attributes associated with the same time series in a single record
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/MeasureValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeasureValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the MeasureValue.
     * </p>
     * <p>
     * For constraints on MeasureValue names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     * Constraints</a> in the Amazon Timestream Developer Guide.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value for the MeasureValue. For information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data types</a>.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Contains the data type of the MeasureValue for the time-series data point.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the MeasureValue.
     * </p>
     * <p>
     * For constraints on MeasureValue names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     * Constraints</a> in the Amazon Timestream Developer Guide.
     * </p>
     * 
     * @param name
     *        The name of the MeasureValue. </p>
     *        <p>
     *        For constraints on MeasureValue names, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     *        Constraints</a> in the Amazon Timestream Developer Guide.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the MeasureValue.
     * </p>
     * <p>
     * For constraints on MeasureValue names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     * Constraints</a> in the Amazon Timestream Developer Guide.
     * </p>
     * 
     * @return The name of the MeasureValue. </p>
     *         <p>
     *         For constraints on MeasureValue names, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     *         Constraints</a> in the Amazon Timestream Developer Guide.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the MeasureValue.
     * </p>
     * <p>
     * For constraints on MeasureValue names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     * Constraints</a> in the Amazon Timestream Developer Guide.
     * </p>
     * 
     * @param name
     *        The name of the MeasureValue. </p>
     *        <p>
     *        For constraints on MeasureValue names, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming"> Naming
     *        Constraints</a> in the Amazon Timestream Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasureValue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value for the MeasureValue. For information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data types</a>.
     * </p>
     * 
     * @param value
     *        The value for the MeasureValue. For information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data
     *        types</a>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the MeasureValue. For information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data types</a>.
     * </p>
     * 
     * @return The value for the MeasureValue. For information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data
     *         types</a>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the MeasureValue. For information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data types</a>.
     * </p>
     * 
     * @param value
     *        The value for the MeasureValue. For information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/writes.html#writes.data-types">Data
     *        types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasureValue withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Contains the data type of the MeasureValue for the time-series data point.
     * </p>
     * 
     * @param type
     *        Contains the data type of the MeasureValue for the time-series data point.
     * @see MeasureValueType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Contains the data type of the MeasureValue for the time-series data point.
     * </p>
     * 
     * @return Contains the data type of the MeasureValue for the time-series data point.
     * @see MeasureValueType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Contains the data type of the MeasureValue for the time-series data point.
     * </p>
     * 
     * @param type
     *        Contains the data type of the MeasureValue for the time-series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeasureValueType
     */

    public MeasureValue withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Contains the data type of the MeasureValue for the time-series data point.
     * </p>
     * 
     * @param type
     *        Contains the data type of the MeasureValue for the time-series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeasureValueType
     */

    public MeasureValue withType(MeasureValueType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeasureValue == false)
            return false;
        MeasureValue other = (MeasureValue) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MeasureValue clone() {
        try {
            return (MeasureValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.MeasureValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
