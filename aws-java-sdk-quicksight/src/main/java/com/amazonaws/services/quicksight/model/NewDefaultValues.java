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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that overrides the existing default values for a dataset parameter that is inherited from another
 * dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NewDefaultValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewDefaultValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of static default values for a given string parameter.
     * </p>
     */
    private java.util.List<String> stringStaticValues;
    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     */
    private java.util.List<Double> decimalStaticValues;
    /**
     * <p>
     * A list of static default values for a given date time parameter.
     * </p>
     */
    private java.util.List<java.util.Date> dateTimeStaticValues;
    /**
     * <p>
     * A list of static default values for a given integer parameter.
     * </p>
     */
    private java.util.List<Long> integerStaticValues;

    /**
     * <p>
     * A list of static default values for a given string parameter.
     * </p>
     * 
     * @return A list of static default values for a given string parameter.
     */

    public java.util.List<String> getStringStaticValues() {
        return stringStaticValues;
    }

    /**
     * <p>
     * A list of static default values for a given string parameter.
     * </p>
     * 
     * @param stringStaticValues
     *        A list of static default values for a given string parameter.
     */

    public void setStringStaticValues(java.util.Collection<String> stringStaticValues) {
        if (stringStaticValues == null) {
            this.stringStaticValues = null;
            return;
        }

        this.stringStaticValues = new java.util.ArrayList<String>(stringStaticValues);
    }

    /**
     * <p>
     * A list of static default values for a given string parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringStaticValues(java.util.Collection)} or {@link #withStringStaticValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param stringStaticValues
     *        A list of static default values for a given string parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withStringStaticValues(String... stringStaticValues) {
        if (this.stringStaticValues == null) {
            setStringStaticValues(new java.util.ArrayList<String>(stringStaticValues.length));
        }
        for (String ele : stringStaticValues) {
            this.stringStaticValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given string parameter.
     * </p>
     * 
     * @param stringStaticValues
     *        A list of static default values for a given string parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withStringStaticValues(java.util.Collection<String> stringStaticValues) {
        setStringStaticValues(stringStaticValues);
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * 
     * @return A list of static default values for a given decimal parameter.
     */

    public java.util.List<Double> getDecimalStaticValues() {
        return decimalStaticValues;
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * 
     * @param decimalStaticValues
     *        A list of static default values for a given decimal parameter.
     */

    public void setDecimalStaticValues(java.util.Collection<Double> decimalStaticValues) {
        if (decimalStaticValues == null) {
            this.decimalStaticValues = null;
            return;
        }

        this.decimalStaticValues = new java.util.ArrayList<Double>(decimalStaticValues);
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDecimalStaticValues(java.util.Collection)} or {@link #withDecimalStaticValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param decimalStaticValues
     *        A list of static default values for a given decimal parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withDecimalStaticValues(Double... decimalStaticValues) {
        if (this.decimalStaticValues == null) {
            setDecimalStaticValues(new java.util.ArrayList<Double>(decimalStaticValues.length));
        }
        for (Double ele : decimalStaticValues) {
            this.decimalStaticValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * 
     * @param decimalStaticValues
     *        A list of static default values for a given decimal parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withDecimalStaticValues(java.util.Collection<Double> decimalStaticValues) {
        setDecimalStaticValues(decimalStaticValues);
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given date time parameter.
     * </p>
     * 
     * @return A list of static default values for a given date time parameter.
     */

    public java.util.List<java.util.Date> getDateTimeStaticValues() {
        return dateTimeStaticValues;
    }

    /**
     * <p>
     * A list of static default values for a given date time parameter.
     * </p>
     * 
     * @param dateTimeStaticValues
     *        A list of static default values for a given date time parameter.
     */

    public void setDateTimeStaticValues(java.util.Collection<java.util.Date> dateTimeStaticValues) {
        if (dateTimeStaticValues == null) {
            this.dateTimeStaticValues = null;
            return;
        }

        this.dateTimeStaticValues = new java.util.ArrayList<java.util.Date>(dateTimeStaticValues);
    }

    /**
     * <p>
     * A list of static default values for a given date time parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDateTimeStaticValues(java.util.Collection)} or {@link #withDateTimeStaticValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dateTimeStaticValues
     *        A list of static default values for a given date time parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withDateTimeStaticValues(java.util.Date... dateTimeStaticValues) {
        if (this.dateTimeStaticValues == null) {
            setDateTimeStaticValues(new java.util.ArrayList<java.util.Date>(dateTimeStaticValues.length));
        }
        for (java.util.Date ele : dateTimeStaticValues) {
            this.dateTimeStaticValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given date time parameter.
     * </p>
     * 
     * @param dateTimeStaticValues
     *        A list of static default values for a given date time parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withDateTimeStaticValues(java.util.Collection<java.util.Date> dateTimeStaticValues) {
        setDateTimeStaticValues(dateTimeStaticValues);
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given integer parameter.
     * </p>
     * 
     * @return A list of static default values for a given integer parameter.
     */

    public java.util.List<Long> getIntegerStaticValues() {
        return integerStaticValues;
    }

    /**
     * <p>
     * A list of static default values for a given integer parameter.
     * </p>
     * 
     * @param integerStaticValues
     *        A list of static default values for a given integer parameter.
     */

    public void setIntegerStaticValues(java.util.Collection<Long> integerStaticValues) {
        if (integerStaticValues == null) {
            this.integerStaticValues = null;
            return;
        }

        this.integerStaticValues = new java.util.ArrayList<Long>(integerStaticValues);
    }

    /**
     * <p>
     * A list of static default values for a given integer parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerStaticValues(java.util.Collection)} or {@link #withIntegerStaticValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param integerStaticValues
     *        A list of static default values for a given integer parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withIntegerStaticValues(Long... integerStaticValues) {
        if (this.integerStaticValues == null) {
            setIntegerStaticValues(new java.util.ArrayList<Long>(integerStaticValues.length));
        }
        for (Long ele : integerStaticValues) {
            this.integerStaticValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given integer parameter.
     * </p>
     * 
     * @param integerStaticValues
     *        A list of static default values for a given integer parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewDefaultValues withIntegerStaticValues(java.util.Collection<Long> integerStaticValues) {
        setIntegerStaticValues(integerStaticValues);
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
        if (getStringStaticValues() != null)
            sb.append("StringStaticValues: ").append(getStringStaticValues()).append(",");
        if (getDecimalStaticValues() != null)
            sb.append("DecimalStaticValues: ").append(getDecimalStaticValues()).append(",");
        if (getDateTimeStaticValues() != null)
            sb.append("DateTimeStaticValues: ").append(getDateTimeStaticValues()).append(",");
        if (getIntegerStaticValues() != null)
            sb.append("IntegerStaticValues: ").append(getIntegerStaticValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewDefaultValues == false)
            return false;
        NewDefaultValues other = (NewDefaultValues) obj;
        if (other.getStringStaticValues() == null ^ this.getStringStaticValues() == null)
            return false;
        if (other.getStringStaticValues() != null && other.getStringStaticValues().equals(this.getStringStaticValues()) == false)
            return false;
        if (other.getDecimalStaticValues() == null ^ this.getDecimalStaticValues() == null)
            return false;
        if (other.getDecimalStaticValues() != null && other.getDecimalStaticValues().equals(this.getDecimalStaticValues()) == false)
            return false;
        if (other.getDateTimeStaticValues() == null ^ this.getDateTimeStaticValues() == null)
            return false;
        if (other.getDateTimeStaticValues() != null && other.getDateTimeStaticValues().equals(this.getDateTimeStaticValues()) == false)
            return false;
        if (other.getIntegerStaticValues() == null ^ this.getIntegerStaticValues() == null)
            return false;
        if (other.getIntegerStaticValues() != null && other.getIntegerStaticValues().equals(this.getIntegerStaticValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringStaticValues() == null) ? 0 : getStringStaticValues().hashCode());
        hashCode = prime * hashCode + ((getDecimalStaticValues() == null) ? 0 : getDecimalStaticValues().hashCode());
        hashCode = prime * hashCode + ((getDateTimeStaticValues() == null) ? 0 : getDateTimeStaticValues().hashCode());
        hashCode = prime * hashCode + ((getIntegerStaticValues() == null) ? 0 : getIntegerStaticValues().hashCode());
        return hashCode;
    }

    @Override
    public NewDefaultValues clone() {
        try {
            return (NewDefaultValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NewDefaultValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
