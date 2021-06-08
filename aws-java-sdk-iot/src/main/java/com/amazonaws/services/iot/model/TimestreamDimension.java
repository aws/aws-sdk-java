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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata attributes of the time series that are written in each measure record.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata dimension name. This is the name of the column in the Amazon Timestream database table record.
     * </p>
     * <p>
     * Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>. These
     * names are reserved. Dimension names cannot start with <code>ts_</code> or <code>measure_value</code> and they
     * cannot contain the colon (<code>:</code>) character.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value to write in this column of the database record.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The metadata dimension name. This is the name of the column in the Amazon Timestream database table record.
     * </p>
     * <p>
     * Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>. These
     * names are reserved. Dimension names cannot start with <code>ts_</code> or <code>measure_value</code> and they
     * cannot contain the colon (<code>:</code>) character.
     * </p>
     * 
     * @param name
     *        The metadata dimension name. This is the name of the column in the Amazon Timestream database table
     *        record.</p>
     *        <p>
     *        Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>.
     *        These names are reserved. Dimension names cannot start with <code>ts_</code> or <code>measure_value</code>
     *        and they cannot contain the colon (<code>:</code>) character.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The metadata dimension name. This is the name of the column in the Amazon Timestream database table record.
     * </p>
     * <p>
     * Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>. These
     * names are reserved. Dimension names cannot start with <code>ts_</code> or <code>measure_value</code> and they
     * cannot contain the colon (<code>:</code>) character.
     * </p>
     * 
     * @return The metadata dimension name. This is the name of the column in the Amazon Timestream database table
     *         record.</p>
     *         <p>
     *         Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>.
     *         These names are reserved. Dimension names cannot start with <code>ts_</code> or
     *         <code>measure_value</code> and they cannot contain the colon (<code>:</code>) character.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The metadata dimension name. This is the name of the column in the Amazon Timestream database table record.
     * </p>
     * <p>
     * Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>. These
     * names are reserved. Dimension names cannot start with <code>ts_</code> or <code>measure_value</code> and they
     * cannot contain the colon (<code>:</code>) character.
     * </p>
     * 
     * @param name
     *        The metadata dimension name. This is the name of the column in the Amazon Timestream database table
     *        record.</p>
     *        <p>
     *        Dimensions cannot be named: <code>measure_name</code>, <code>measure_value</code>, or <code>time</code>.
     *        These names are reserved. Dimension names cannot start with <code>ts_</code> or <code>measure_value</code>
     *        and they cannot contain the colon (<code>:</code>) character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamDimension withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value to write in this column of the database record.
     * </p>
     * 
     * @param value
     *        The value to write in this column of the database record.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to write in this column of the database record.
     * </p>
     * 
     * @return The value to write in this column of the database record.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to write in this column of the database record.
     * </p>
     * 
     * @param value
     *        The value to write in this column of the database record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamDimension withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof TimestreamDimension == false)
            return false;
        TimestreamDimension other = (TimestreamDimension) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamDimension clone() {
        try {
            return (TimestreamDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TimestreamDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
