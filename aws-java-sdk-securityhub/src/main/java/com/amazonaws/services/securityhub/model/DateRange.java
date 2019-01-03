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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A date range for the date filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DateRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     */
    private Integer value;
    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     * 
     * @param value
     *        A date range value for the date filter.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     * 
     * @return A date range value for the date filter.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     * 
     * @param value
     *        A date range value for the date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRange withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * 
     * @param unit
     *        A date range unit for the date filter.
     * @see DateRangeUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * 
     * @return A date range unit for the date filter.
     * @see DateRangeUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * 
     * @param unit
     *        A date range unit for the date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DateRangeUnit
     */

    public DateRange withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * 
     * @param unit
     *        A date range unit for the date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DateRangeUnit
     */

    public DateRange withUnit(DateRangeUnit unit) {
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

        if (obj instanceof DateRange == false)
            return false;
        DateRange other = (DateRange) obj;
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
    public DateRange clone() {
        try {
            return (DateRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.DateRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
