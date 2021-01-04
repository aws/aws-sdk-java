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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute returned from an index query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AdditionalResultAttribute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalResultAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     */
    private String valueType;
    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     */
    private AdditionalResultAttributeValue value;

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * 
     * @param key
     *        The key that identifies the attribute.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * 
     * @return The key that identifies the attribute.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * 
     * @param key
     *        The key that identifies the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalResultAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * 
     * @param valueType
     *        The data type of the <code>Value</code> property.
     * @see AdditionalResultAttributeValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * 
     * @return The data type of the <code>Value</code> property.
     * @see AdditionalResultAttributeValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * 
     * @param valueType
     *        The data type of the <code>Value</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResultAttributeValueType
     */

    public AdditionalResultAttribute withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * 
     * @param valueType
     *        The data type of the <code>Value</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResultAttributeValueType
     */

    public AdditionalResultAttribute withValueType(AdditionalResultAttributeValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     * 
     * @param value
     *        An object that contains the attribute value.
     */

    public void setValue(AdditionalResultAttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     * 
     * @return An object that contains the attribute value.
     */

    public AdditionalResultAttributeValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     * 
     * @param value
     *        An object that contains the attribute value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalResultAttribute withValue(AdditionalResultAttributeValue value) {
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType()).append(",");
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

        if (obj instanceof AdditionalResultAttribute == false)
            return false;
        AdditionalResultAttribute other = (AdditionalResultAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalResultAttribute clone() {
        try {
            return (AdditionalResultAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AdditionalResultAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
