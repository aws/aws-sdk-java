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
 * The customized parameter values.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomParameterValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomParameterValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of string-type parameter values.
     * </p>
     */
    private java.util.List<String> stringValues;
    /**
     * <p>
     * A list of integer-type parameter values.
     * </p>
     */
    private java.util.List<Long> integerValues;
    /**
     * <p>
     * A list of decimal-type parameter values.
     * </p>
     */
    private java.util.List<Double> decimalValues;
    /**
     * <p>
     * A list of datetime-type parameter values.
     * </p>
     */
    private java.util.List<java.util.Date> dateTimeValues;

    /**
     * <p>
     * A list of string-type parameter values.
     * </p>
     * 
     * @return A list of string-type parameter values.
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * A list of string-type parameter values.
     * </p>
     * 
     * @param stringValues
     *        A list of string-type parameter values.
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * A list of string-type parameter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        A list of string-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of string-type parameter values.
     * </p>
     * 
     * @param stringValues
     *        A list of string-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
        return this;
    }

    /**
     * <p>
     * A list of integer-type parameter values.
     * </p>
     * 
     * @return A list of integer-type parameter values.
     */

    public java.util.List<Long> getIntegerValues() {
        return integerValues;
    }

    /**
     * <p>
     * A list of integer-type parameter values.
     * </p>
     * 
     * @param integerValues
     *        A list of integer-type parameter values.
     */

    public void setIntegerValues(java.util.Collection<Long> integerValues) {
        if (integerValues == null) {
            this.integerValues = null;
            return;
        }

        this.integerValues = new java.util.ArrayList<Long>(integerValues);
    }

    /**
     * <p>
     * A list of integer-type parameter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerValues(java.util.Collection)} or {@link #withIntegerValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param integerValues
     *        A list of integer-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withIntegerValues(Long... integerValues) {
        if (this.integerValues == null) {
            setIntegerValues(new java.util.ArrayList<Long>(integerValues.length));
        }
        for (Long ele : integerValues) {
            this.integerValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of integer-type parameter values.
     * </p>
     * 
     * @param integerValues
     *        A list of integer-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withIntegerValues(java.util.Collection<Long> integerValues) {
        setIntegerValues(integerValues);
        return this;
    }

    /**
     * <p>
     * A list of decimal-type parameter values.
     * </p>
     * 
     * @return A list of decimal-type parameter values.
     */

    public java.util.List<Double> getDecimalValues() {
        return decimalValues;
    }

    /**
     * <p>
     * A list of decimal-type parameter values.
     * </p>
     * 
     * @param decimalValues
     *        A list of decimal-type parameter values.
     */

    public void setDecimalValues(java.util.Collection<Double> decimalValues) {
        if (decimalValues == null) {
            this.decimalValues = null;
            return;
        }

        this.decimalValues = new java.util.ArrayList<Double>(decimalValues);
    }

    /**
     * <p>
     * A list of decimal-type parameter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDecimalValues(java.util.Collection)} or {@link #withDecimalValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param decimalValues
     *        A list of decimal-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withDecimalValues(Double... decimalValues) {
        if (this.decimalValues == null) {
            setDecimalValues(new java.util.ArrayList<Double>(decimalValues.length));
        }
        for (Double ele : decimalValues) {
            this.decimalValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of decimal-type parameter values.
     * </p>
     * 
     * @param decimalValues
     *        A list of decimal-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withDecimalValues(java.util.Collection<Double> decimalValues) {
        setDecimalValues(decimalValues);
        return this;
    }

    /**
     * <p>
     * A list of datetime-type parameter values.
     * </p>
     * 
     * @return A list of datetime-type parameter values.
     */

    public java.util.List<java.util.Date> getDateTimeValues() {
        return dateTimeValues;
    }

    /**
     * <p>
     * A list of datetime-type parameter values.
     * </p>
     * 
     * @param dateTimeValues
     *        A list of datetime-type parameter values.
     */

    public void setDateTimeValues(java.util.Collection<java.util.Date> dateTimeValues) {
        if (dateTimeValues == null) {
            this.dateTimeValues = null;
            return;
        }

        this.dateTimeValues = new java.util.ArrayList<java.util.Date>(dateTimeValues);
    }

    /**
     * <p>
     * A list of datetime-type parameter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDateTimeValues(java.util.Collection)} or {@link #withDateTimeValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dateTimeValues
     *        A list of datetime-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withDateTimeValues(java.util.Date... dateTimeValues) {
        if (this.dateTimeValues == null) {
            setDateTimeValues(new java.util.ArrayList<java.util.Date>(dateTimeValues.length));
        }
        for (java.util.Date ele : dateTimeValues) {
            this.dateTimeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of datetime-type parameter values.
     * </p>
     * 
     * @param dateTimeValues
     *        A list of datetime-type parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameterValues withDateTimeValues(java.util.Collection<java.util.Date> dateTimeValues) {
        setDateTimeValues(dateTimeValues);
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
        if (getStringValues() != null)
            sb.append("StringValues: ").append("***Sensitive Data Redacted***").append(",");
        if (getIntegerValues() != null)
            sb.append("IntegerValues: ").append("***Sensitive Data Redacted***").append(",");
        if (getDecimalValues() != null)
            sb.append("DecimalValues: ").append("***Sensitive Data Redacted***").append(",");
        if (getDateTimeValues() != null)
            sb.append("DateTimeValues: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomParameterValues == false)
            return false;
        CustomParameterValues other = (CustomParameterValues) obj;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        if (other.getIntegerValues() == null ^ this.getIntegerValues() == null)
            return false;
        if (other.getIntegerValues() != null && other.getIntegerValues().equals(this.getIntegerValues()) == false)
            return false;
        if (other.getDecimalValues() == null ^ this.getDecimalValues() == null)
            return false;
        if (other.getDecimalValues() != null && other.getDecimalValues().equals(this.getDecimalValues()) == false)
            return false;
        if (other.getDateTimeValues() == null ^ this.getDateTimeValues() == null)
            return false;
        if (other.getDateTimeValues() != null && other.getDateTimeValues().equals(this.getDateTimeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        hashCode = prime * hashCode + ((getIntegerValues() == null) ? 0 : getIntegerValues().hashCode());
        hashCode = prime * hashCode + ((getDecimalValues() == null) ? 0 : getDecimalValues().hashCode());
        hashCode = prime * hashCode + ((getDateTimeValues() == null) ? 0 : getDateTimeValues().hashCode());
        return hashCode;
    }

    @Override
    public CustomParameterValues clone() {
        try {
            return (CustomParameterValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomParameterValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
