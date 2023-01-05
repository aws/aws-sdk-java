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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value input pf the numeric range filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericRangeFilterValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericRangeFilterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The static value of the numeric range filter.
     * </p>
     */
    private Double staticValue;
    /**
     * <p>
     * The parameter that is used in the numeric range.
     * </p>
     */
    private String parameter;

    /**
     * <p>
     * The static value of the numeric range filter.
     * </p>
     * 
     * @param staticValue
     *        The static value of the numeric range filter.
     */

    public void setStaticValue(Double staticValue) {
        this.staticValue = staticValue;
    }

    /**
     * <p>
     * The static value of the numeric range filter.
     * </p>
     * 
     * @return The static value of the numeric range filter.
     */

    public Double getStaticValue() {
        return this.staticValue;
    }

    /**
     * <p>
     * The static value of the numeric range filter.
     * </p>
     * 
     * @param staticValue
     *        The static value of the numeric range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilterValue withStaticValue(Double staticValue) {
        setStaticValue(staticValue);
        return this;
    }

    /**
     * <p>
     * The parameter that is used in the numeric range.
     * </p>
     * 
     * @param parameter
     *        The parameter that is used in the numeric range.
     */

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * <p>
     * The parameter that is used in the numeric range.
     * </p>
     * 
     * @return The parameter that is used in the numeric range.
     */

    public String getParameter() {
        return this.parameter;
    }

    /**
     * <p>
     * The parameter that is used in the numeric range.
     * </p>
     * 
     * @param parameter
     *        The parameter that is used in the numeric range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilterValue withParameter(String parameter) {
        setParameter(parameter);
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
        if (getStaticValue() != null)
            sb.append("StaticValue: ").append(getStaticValue()).append(",");
        if (getParameter() != null)
            sb.append("Parameter: ").append(getParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericRangeFilterValue == false)
            return false;
        NumericRangeFilterValue other = (NumericRangeFilterValue) obj;
        if (other.getStaticValue() == null ^ this.getStaticValue() == null)
            return false;
        if (other.getStaticValue() != null && other.getStaticValue().equals(this.getStaticValue()) == false)
            return false;
        if (other.getParameter() == null ^ this.getParameter() == null)
            return false;
        if (other.getParameter() != null && other.getParameter().equals(this.getParameter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticValue() == null) ? 0 : getStaticValue().hashCode());
        hashCode = prime * hashCode + ((getParameter() == null) ? 0 : getParameter().hashCode());
        return hashCode;
    }

    @Override
    public NumericRangeFilterValue clone() {
        try {
            return (NumericRangeFilterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericRangeFilterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
