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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dimension represents the meta data attributes of the time series. For example, the name and availability zone of an
 * EC2 instance or the name of the manufacturer of a wind turbine are dimensions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/Dimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dimension represents the meta data attributes of the time series. For example, the name and availability zone of
     * an EC2 instance or the name of the manufacturer of a wind turbine are dimensions.
     * </p>
     * <p>
     * For constraints on Dimension names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     * Constraints</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the dimension.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The data type of the dimension for the time series data point.
     * </p>
     */
    private String dimensionValueType;

    /**
     * <p>
     * Dimension represents the meta data attributes of the time series. For example, the name and availability zone of
     * an EC2 instance or the name of the manufacturer of a wind turbine are dimensions.
     * </p>
     * <p>
     * For constraints on Dimension names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     * Constraints</a>.
     * </p>
     * 
     * @param name
     *        Dimension represents the meta data attributes of the time series. For example, the name and availability
     *        zone of an EC2 instance or the name of the manufacturer of a wind turbine are dimensions. </p>
     *        <p>
     *        For constraints on Dimension names, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     *        Constraints</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Dimension represents the meta data attributes of the time series. For example, the name and availability zone of
     * an EC2 instance or the name of the manufacturer of a wind turbine are dimensions.
     * </p>
     * <p>
     * For constraints on Dimension names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     * Constraints</a>.
     * </p>
     * 
     * @return Dimension represents the meta data attributes of the time series. For example, the name and availability
     *         zone of an EC2 instance or the name of the manufacturer of a wind turbine are dimensions. </p>
     *         <p>
     *         For constraints on Dimension names, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     *         Constraints</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Dimension represents the meta data attributes of the time series. For example, the name and availability zone of
     * an EC2 instance or the name of the manufacturer of a wind turbine are dimensions.
     * </p>
     * <p>
     * For constraints on Dimension names, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     * Constraints</a>.
     * </p>
     * 
     * @param name
     *        Dimension represents the meta data attributes of the time series. For example, the name and availability
     *        zone of an EC2 instance or the name of the manufacturer of a wind turbine are dimensions. </p>
     *        <p>
     *        For constraints on Dimension names, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.naming">Naming
     *        Constraints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the dimension.
     * </p>
     * 
     * @param value
     *        The value of the dimension.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the dimension.
     * </p>
     * 
     * @return The value of the dimension.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the dimension.
     * </p>
     * 
     * @param value
     *        The value of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The data type of the dimension for the time series data point.
     * </p>
     * 
     * @param dimensionValueType
     *        The data type of the dimension for the time series data point.
     * @see DimensionValueType
     */

    public void setDimensionValueType(String dimensionValueType) {
        this.dimensionValueType = dimensionValueType;
    }

    /**
     * <p>
     * The data type of the dimension for the time series data point.
     * </p>
     * 
     * @return The data type of the dimension for the time series data point.
     * @see DimensionValueType
     */

    public String getDimensionValueType() {
        return this.dimensionValueType;
    }

    /**
     * <p>
     * The data type of the dimension for the time series data point.
     * </p>
     * 
     * @param dimensionValueType
     *        The data type of the dimension for the time series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueType
     */

    public Dimension withDimensionValueType(String dimensionValueType) {
        setDimensionValueType(dimensionValueType);
        return this;
    }

    /**
     * <p>
     * The data type of the dimension for the time series data point.
     * </p>
     * 
     * @param dimensionValueType
     *        The data type of the dimension for the time series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueType
     */

    public Dimension withDimensionValueType(DimensionValueType dimensionValueType) {
        this.dimensionValueType = dimensionValueType.toString();
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
        if (getDimensionValueType() != null)
            sb.append("DimensionValueType: ").append(getDimensionValueType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dimension == false)
            return false;
        Dimension other = (Dimension) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDimensionValueType() == null ^ this.getDimensionValueType() == null)
            return false;
        if (other.getDimensionValueType() != null && other.getDimensionValueType().equals(this.getDimensionValueType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDimensionValueType() == null) ? 0 : getDimensionValueType().hashCode());
        return hashCode;
    }

    @Override
    public Dimension clone() {
        try {
            return (Dimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
