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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Time to live duration, where the record is hard deleted after the expiration time is reached; <code>ExpiresAt</code>
 * = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete, see the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html">DeleteRecord</a>
 * API in the Amazon SageMaker API Reference guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TtlDuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TtlDuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>TtlDuration</code> time unit.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * <code>TtlDuration</code> time value.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * <code>TtlDuration</code> time unit.
     * </p>
     * 
     * @param unit
     *        <code>TtlDuration</code> time unit.
     * @see TtlDurationUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * <code>TtlDuration</code> time unit.
     * </p>
     * 
     * @return <code>TtlDuration</code> time unit.
     * @see TtlDurationUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * <code>TtlDuration</code> time unit.
     * </p>
     * 
     * @param unit
     *        <code>TtlDuration</code> time unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TtlDurationUnit
     */

    public TtlDuration withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * <code>TtlDuration</code> time unit.
     * </p>
     * 
     * @param unit
     *        <code>TtlDuration</code> time unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TtlDurationUnit
     */

    public TtlDuration withUnit(TtlDurationUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * <code>TtlDuration</code> time value.
     * </p>
     * 
     * @param value
     *        <code>TtlDuration</code> time value.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * <code>TtlDuration</code> time value.
     * </p>
     * 
     * @return <code>TtlDuration</code> time value.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * <code>TtlDuration</code> time value.
     * </p>
     * 
     * @param value
     *        <code>TtlDuration</code> time value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TtlDuration withValue(Integer value) {
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

        if (obj instanceof TtlDuration == false)
            return false;
        TtlDuration other = (TtlDuration) obj;
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
    public TtlDuration clone() {
        try {
            return (TtlDuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TtlDurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
