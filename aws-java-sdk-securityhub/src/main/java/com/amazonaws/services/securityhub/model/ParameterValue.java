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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that includes the data type of a security control parameter and its current value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ParameterValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A control parameter that is an integer.
     * </p>
     */
    private Integer integer;
    /**
     * <p>
     * A control parameter that is a list of integers.
     * </p>
     */
    private java.util.List<Integer> integerList;
    /**
     * <p>
     * A control parameter that is a double.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * A control parameter that is a string.
     * </p>
     */
    private String string;
    /**
     * <p>
     * A control parameter that is a list of strings.
     * </p>
     */
    private java.util.List<String> stringList;
    /**
     * <p>
     * A control parameter that is a boolean.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * A control parameter that is an enum.
     * </p>
     */
    private String enumValue;
    /**
     * <p>
     * A control parameter that is a list of enums.
     * </p>
     */
    private java.util.List<String> enumList;

    /**
     * <p>
     * A control parameter that is an integer.
     * </p>
     * 
     * @param integer
     *        A control parameter that is an integer.
     */

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    /**
     * <p>
     * A control parameter that is an integer.
     * </p>
     * 
     * @return A control parameter that is an integer.
     */

    public Integer getInteger() {
        return this.integer;
    }

    /**
     * <p>
     * A control parameter that is an integer.
     * </p>
     * 
     * @param integer
     *        A control parameter that is an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withInteger(Integer integer) {
        setInteger(integer);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a list of integers.
     * </p>
     * 
     * @return A control parameter that is a list of integers.
     */

    public java.util.List<Integer> getIntegerList() {
        return integerList;
    }

    /**
     * <p>
     * A control parameter that is a list of integers.
     * </p>
     * 
     * @param integerList
     *        A control parameter that is a list of integers.
     */

    public void setIntegerList(java.util.Collection<Integer> integerList) {
        if (integerList == null) {
            this.integerList = null;
            return;
        }

        this.integerList = new java.util.ArrayList<Integer>(integerList);
    }

    /**
     * <p>
     * A control parameter that is a list of integers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerList(java.util.Collection)} or {@link #withIntegerList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param integerList
     *        A control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withIntegerList(Integer... integerList) {
        if (this.integerList == null) {
            setIntegerList(new java.util.ArrayList<Integer>(integerList.length));
        }
        for (Integer ele : integerList) {
            this.integerList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A control parameter that is a list of integers.
     * </p>
     * 
     * @param integerList
     *        A control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withIntegerList(java.util.Collection<Integer> integerList) {
        setIntegerList(integerList);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a double.
     * </p>
     * 
     * @param doubleValue
     *        A control parameter that is a double.
     */

    public void setDouble(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * A control parameter that is a double.
     * </p>
     * 
     * @return A control parameter that is a double.
     */

    public Double getDouble() {
        return this.doubleValue;
    }

    /**
     * <p>
     * A control parameter that is a double.
     * </p>
     * 
     * @param doubleValue
     *        A control parameter that is a double.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withDouble(Double doubleValue) {
        setDouble(doubleValue);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a string.
     * </p>
     * 
     * @param string
     *        A control parameter that is a string.
     */

    public void setString(String string) {
        this.string = string;
    }

    /**
     * <p>
     * A control parameter that is a string.
     * </p>
     * 
     * @return A control parameter that is a string.
     */

    public String getString() {
        return this.string;
    }

    /**
     * <p>
     * A control parameter that is a string.
     * </p>
     * 
     * @param string
     *        A control parameter that is a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withString(String string) {
        setString(string);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a list of strings.
     * </p>
     * 
     * @return A control parameter that is a list of strings.
     */

    public java.util.List<String> getStringList() {
        return stringList;
    }

    /**
     * <p>
     * A control parameter that is a list of strings.
     * </p>
     * 
     * @param stringList
     *        A control parameter that is a list of strings.
     */

    public void setStringList(java.util.Collection<String> stringList) {
        if (stringList == null) {
            this.stringList = null;
            return;
        }

        this.stringList = new java.util.ArrayList<String>(stringList);
    }

    /**
     * <p>
     * A control parameter that is a list of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringList(java.util.Collection)} or {@link #withStringList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringList
     *        A control parameter that is a list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withStringList(String... stringList) {
        if (this.stringList == null) {
            setStringList(new java.util.ArrayList<String>(stringList.length));
        }
        for (String ele : stringList) {
            this.stringList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A control parameter that is a list of strings.
     * </p>
     * 
     * @param stringList
     *        A control parameter that is a list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withStringList(java.util.Collection<String> stringList) {
        setStringList(stringList);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a boolean.
     * </p>
     * 
     * @param booleanValue
     *        A control parameter that is a boolean.
     */

    public void setBoolean(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * A control parameter that is a boolean.
     * </p>
     * 
     * @return A control parameter that is a boolean.
     */

    public Boolean getBoolean() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A control parameter that is a boolean.
     * </p>
     * 
     * @param booleanValue
     *        A control parameter that is a boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withBoolean(Boolean booleanValue) {
        setBoolean(booleanValue);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a boolean.
     * </p>
     * 
     * @return A control parameter that is a boolean.
     */

    public Boolean isBoolean() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A control parameter that is an enum.
     * </p>
     * 
     * @param enumValue
     *        A control parameter that is an enum.
     */

    public void setEnum(String enumValue) {
        this.enumValue = enumValue;
    }

    /**
     * <p>
     * A control parameter that is an enum.
     * </p>
     * 
     * @return A control parameter that is an enum.
     */

    public String getEnum() {
        return this.enumValue;
    }

    /**
     * <p>
     * A control parameter that is an enum.
     * </p>
     * 
     * @param enumValue
     *        A control parameter that is an enum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withEnum(String enumValue) {
        setEnum(enumValue);
        return this;
    }

    /**
     * <p>
     * A control parameter that is a list of enums.
     * </p>
     * 
     * @return A control parameter that is a list of enums.
     */

    public java.util.List<String> getEnumList() {
        return enumList;
    }

    /**
     * <p>
     * A control parameter that is a list of enums.
     * </p>
     * 
     * @param enumList
     *        A control parameter that is a list of enums.
     */

    public void setEnumList(java.util.Collection<String> enumList) {
        if (enumList == null) {
            this.enumList = null;
            return;
        }

        this.enumList = new java.util.ArrayList<String>(enumList);
    }

    /**
     * <p>
     * A control parameter that is a list of enums.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnumList(java.util.Collection)} or {@link #withEnumList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param enumList
     *        A control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withEnumList(String... enumList) {
        if (this.enumList == null) {
            setEnumList(new java.util.ArrayList<String>(enumList.length));
        }
        for (String ele : enumList) {
            this.enumList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A control parameter that is a list of enums.
     * </p>
     * 
     * @param enumList
     *        A control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withEnumList(java.util.Collection<String> enumList) {
        setEnumList(enumList);
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
        if (getInteger() != null)
            sb.append("Integer: ").append(getInteger()).append(",");
        if (getIntegerList() != null)
            sb.append("IntegerList: ").append(getIntegerList()).append(",");
        if (getDouble() != null)
            sb.append("Double: ").append(getDouble()).append(",");
        if (getString() != null)
            sb.append("String: ").append(getString()).append(",");
        if (getStringList() != null)
            sb.append("StringList: ").append(getStringList()).append(",");
        if (getBoolean() != null)
            sb.append("Boolean: ").append(getBoolean()).append(",");
        if (getEnum() != null)
            sb.append("Enum: ").append(getEnum()).append(",");
        if (getEnumList() != null)
            sb.append("EnumList: ").append(getEnumList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterValue == false)
            return false;
        ParameterValue other = (ParameterValue) obj;
        if (other.getInteger() == null ^ this.getInteger() == null)
            return false;
        if (other.getInteger() != null && other.getInteger().equals(this.getInteger()) == false)
            return false;
        if (other.getIntegerList() == null ^ this.getIntegerList() == null)
            return false;
        if (other.getIntegerList() != null && other.getIntegerList().equals(this.getIntegerList()) == false)
            return false;
        if (other.getDouble() == null ^ this.getDouble() == null)
            return false;
        if (other.getDouble() != null && other.getDouble().equals(this.getDouble()) == false)
            return false;
        if (other.getString() == null ^ this.getString() == null)
            return false;
        if (other.getString() != null && other.getString().equals(this.getString()) == false)
            return false;
        if (other.getStringList() == null ^ this.getStringList() == null)
            return false;
        if (other.getStringList() != null && other.getStringList().equals(this.getStringList()) == false)
            return false;
        if (other.getBoolean() == null ^ this.getBoolean() == null)
            return false;
        if (other.getBoolean() != null && other.getBoolean().equals(this.getBoolean()) == false)
            return false;
        if (other.getEnum() == null ^ this.getEnum() == null)
            return false;
        if (other.getEnum() != null && other.getEnum().equals(this.getEnum()) == false)
            return false;
        if (other.getEnumList() == null ^ this.getEnumList() == null)
            return false;
        if (other.getEnumList() != null && other.getEnumList().equals(this.getEnumList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInteger() == null) ? 0 : getInteger().hashCode());
        hashCode = prime * hashCode + ((getIntegerList() == null) ? 0 : getIntegerList().hashCode());
        hashCode = prime * hashCode + ((getDouble() == null) ? 0 : getDouble().hashCode());
        hashCode = prime * hashCode + ((getString() == null) ? 0 : getString().hashCode());
        hashCode = prime * hashCode + ((getStringList() == null) ? 0 : getStringList().hashCode());
        hashCode = prime * hashCode + ((getBoolean() == null) ? 0 : getBoolean().hashCode());
        hashCode = prime * hashCode + ((getEnum() == null) ? 0 : getEnum().hashCode());
        hashCode = prime * hashCode + ((getEnumList() == null) ? 0 : getEnumList().hashCode());
        return hashCode;
    }

    @Override
    public ParameterValue clone() {
        try {
            return (ParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
