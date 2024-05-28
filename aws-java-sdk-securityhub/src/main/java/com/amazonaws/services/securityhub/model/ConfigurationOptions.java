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
 * The options for customizing a security control parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ConfigurationOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options for customizing a security control parameter that is an integer.
     * </p>
     */
    private IntegerConfigurationOptions integer;
    /**
     * <p>
     * The options for customizing a security control parameter that is a list of integers.
     * </p>
     */
    private IntegerListConfigurationOptions integerList;
    /**
     * <p>
     * The options for customizing a security control parameter that is a double.
     * </p>
     */
    private DoubleConfigurationOptions doubleValue;
    /**
     * <p>
     * The options for customizing a security control parameter that is a string data type.
     * </p>
     */
    private StringConfigurationOptions string;
    /**
     * <p>
     * The options for customizing a security control parameter that is a list of strings.
     * </p>
     */
    private StringListConfigurationOptions stringList;
    /**
     * <p>
     * The options for customizing a security control parameter that is a boolean. For a boolean parameter, the options
     * are <code>true</code> and <code>false</code>.
     * </p>
     */
    private BooleanConfigurationOptions booleanValue;
    /**
     * <p>
     * The options for customizing a security control parameter that is an enum.
     * </p>
     */
    private EnumConfigurationOptions enumValue;
    /**
     * <p>
     * The options for customizing a security control parameter that is a list of enums.
     * </p>
     */
    private EnumListConfigurationOptions enumList;

    /**
     * <p>
     * The options for customizing a security control parameter that is an integer.
     * </p>
     * 
     * @param integer
     *        The options for customizing a security control parameter that is an integer.
     */

    public void setInteger(IntegerConfigurationOptions integer) {
        this.integer = integer;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is an integer.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is an integer.
     */

    public IntegerConfigurationOptions getInteger() {
        return this.integer;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is an integer.
     * </p>
     * 
     * @param integer
     *        The options for customizing a security control parameter that is an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withInteger(IntegerConfigurationOptions integer) {
        setInteger(integer);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of integers.
     * </p>
     * 
     * @param integerList
     *        The options for customizing a security control parameter that is a list of integers.
     */

    public void setIntegerList(IntegerListConfigurationOptions integerList) {
        this.integerList = integerList;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of integers.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is a list of integers.
     */

    public IntegerListConfigurationOptions getIntegerList() {
        return this.integerList;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of integers.
     * </p>
     * 
     * @param integerList
     *        The options for customizing a security control parameter that is a list of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withIntegerList(IntegerListConfigurationOptions integerList) {
        setIntegerList(integerList);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a double.
     * </p>
     * 
     * @param doubleValue
     *        The options for customizing a security control parameter that is a double.
     */

    public void setDouble(DoubleConfigurationOptions doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a double.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is a double.
     */

    public DoubleConfigurationOptions getDouble() {
        return this.doubleValue;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a double.
     * </p>
     * 
     * @param doubleValue
     *        The options for customizing a security control parameter that is a double.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withDouble(DoubleConfigurationOptions doubleValue) {
        setDouble(doubleValue);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a string data type.
     * </p>
     * 
     * @param string
     *        The options for customizing a security control parameter that is a string data type.
     */

    public void setString(StringConfigurationOptions string) {
        this.string = string;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a string data type.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is a string data type.
     */

    public StringConfigurationOptions getString() {
        return this.string;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a string data type.
     * </p>
     * 
     * @param string
     *        The options for customizing a security control parameter that is a string data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withString(StringConfigurationOptions string) {
        setString(string);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of strings.
     * </p>
     * 
     * @param stringList
     *        The options for customizing a security control parameter that is a list of strings.
     */

    public void setStringList(StringListConfigurationOptions stringList) {
        this.stringList = stringList;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of strings.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is a list of strings.
     */

    public StringListConfigurationOptions getStringList() {
        return this.stringList;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of strings.
     * </p>
     * 
     * @param stringList
     *        The options for customizing a security control parameter that is a list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withStringList(StringListConfigurationOptions stringList) {
        setStringList(stringList);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a boolean. For a boolean parameter, the options
     * are <code>true</code> and <code>false</code>.
     * </p>
     * 
     * @param booleanValue
     *        The options for customizing a security control parameter that is a boolean. For a boolean parameter, the
     *        options are <code>true</code> and <code>false</code>.
     */

    public void setBoolean(BooleanConfigurationOptions booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a boolean. For a boolean parameter, the options
     * are <code>true</code> and <code>false</code>.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is a boolean. For a boolean parameter, the
     *         options are <code>true</code> and <code>false</code>.
     */

    public BooleanConfigurationOptions getBoolean() {
        return this.booleanValue;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a boolean. For a boolean parameter, the options
     * are <code>true</code> and <code>false</code>.
     * </p>
     * 
     * @param booleanValue
     *        The options for customizing a security control parameter that is a boolean. For a boolean parameter, the
     *        options are <code>true</code> and <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withBoolean(BooleanConfigurationOptions booleanValue) {
        setBoolean(booleanValue);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is an enum.
     * </p>
     * 
     * @param enumValue
     *        The options for customizing a security control parameter that is an enum.
     */

    public void setEnum(EnumConfigurationOptions enumValue) {
        this.enumValue = enumValue;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is an enum.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is an enum.
     */

    public EnumConfigurationOptions getEnum() {
        return this.enumValue;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is an enum.
     * </p>
     * 
     * @param enumValue
     *        The options for customizing a security control parameter that is an enum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withEnum(EnumConfigurationOptions enumValue) {
        setEnum(enumValue);
        return this;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of enums.
     * </p>
     * 
     * @param enumList
     *        The options for customizing a security control parameter that is a list of enums.
     */

    public void setEnumList(EnumListConfigurationOptions enumList) {
        this.enumList = enumList;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of enums.
     * </p>
     * 
     * @return The options for customizing a security control parameter that is a list of enums.
     */

    public EnumListConfigurationOptions getEnumList() {
        return this.enumList;
    }

    /**
     * <p>
     * The options for customizing a security control parameter that is a list of enums.
     * </p>
     * 
     * @param enumList
     *        The options for customizing a security control parameter that is a list of enums.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOptions withEnumList(EnumListConfigurationOptions enumList) {
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

        if (obj instanceof ConfigurationOptions == false)
            return false;
        ConfigurationOptions other = (ConfigurationOptions) obj;
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
    public ConfigurationOptions clone() {
        try {
            return (ConfigurationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ConfigurationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
