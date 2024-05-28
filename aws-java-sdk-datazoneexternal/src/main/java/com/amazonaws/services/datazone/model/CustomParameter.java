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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of user parameters of an environment blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CustomParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The description of the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The filed type of the parameter.
     * </p>
     */
    private String fieldType;
    /**
     * <p>
     * Specifies whether the parameter is editable.
     * </p>
     */
    private Boolean isEditable;
    /**
     * <p>
     * Specifies whether the custom parameter is optional.
     * </p>
     */
    private Boolean isOptional;
    /**
     * <p>
     * The key name of the parameter.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the parameter.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * 
     * @return The default value of the parameter.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameter withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * 
     * @param description
     *        The description of the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * 
     * @return The description of the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * 
     * @param description
     *        The description of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The filed type of the parameter.
     * </p>
     * 
     * @param fieldType
     *        The filed type of the parameter.
     */

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * <p>
     * The filed type of the parameter.
     * </p>
     * 
     * @return The filed type of the parameter.
     */

    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * <p>
     * The filed type of the parameter.
     * </p>
     * 
     * @param fieldType
     *        The filed type of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameter withFieldType(String fieldType) {
        setFieldType(fieldType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the parameter is editable.
     * </p>
     * 
     * @param isEditable
     *        Specifies whether the parameter is editable.
     */

    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    /**
     * <p>
     * Specifies whether the parameter is editable.
     * </p>
     * 
     * @return Specifies whether the parameter is editable.
     */

    public Boolean getIsEditable() {
        return this.isEditable;
    }

    /**
     * <p>
     * Specifies whether the parameter is editable.
     * </p>
     * 
     * @param isEditable
     *        Specifies whether the parameter is editable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameter withIsEditable(Boolean isEditable) {
        setIsEditable(isEditable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the parameter is editable.
     * </p>
     * 
     * @return Specifies whether the parameter is editable.
     */

    public Boolean isEditable() {
        return this.isEditable;
    }

    /**
     * <p>
     * Specifies whether the custom parameter is optional.
     * </p>
     * 
     * @param isOptional
     *        Specifies whether the custom parameter is optional.
     */

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }

    /**
     * <p>
     * Specifies whether the custom parameter is optional.
     * </p>
     * 
     * @return Specifies whether the custom parameter is optional.
     */

    public Boolean getIsOptional() {
        return this.isOptional;
    }

    /**
     * <p>
     * Specifies whether the custom parameter is optional.
     * </p>
     * 
     * @param isOptional
     *        Specifies whether the custom parameter is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameter withIsOptional(Boolean isOptional) {
        setIsOptional(isOptional);
        return this;
    }

    /**
     * <p>
     * Specifies whether the custom parameter is optional.
     * </p>
     * 
     * @return Specifies whether the custom parameter is optional.
     */

    public Boolean isOptional() {
        return this.isOptional;
    }

    /**
     * <p>
     * The key name of the parameter.
     * </p>
     * 
     * @param keyName
     *        The key name of the parameter.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The key name of the parameter.
     * </p>
     * 
     * @return The key name of the parameter.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The key name of the parameter.
     * </p>
     * 
     * @param keyName
     *        The key name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomParameter withKeyName(String keyName) {
        setKeyName(keyName);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getFieldType() != null)
            sb.append("FieldType: ").append(getFieldType()).append(",");
        if (getIsEditable() != null)
            sb.append("IsEditable: ").append(getIsEditable()).append(",");
        if (getIsOptional() != null)
            sb.append("IsOptional: ").append(getIsOptional()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomParameter == false)
            return false;
        CustomParameter other = (CustomParameter) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFieldType() == null ^ this.getFieldType() == null)
            return false;
        if (other.getFieldType() != null && other.getFieldType().equals(this.getFieldType()) == false)
            return false;
        if (other.getIsEditable() == null ^ this.getIsEditable() == null)
            return false;
        if (other.getIsEditable() != null && other.getIsEditable().equals(this.getIsEditable()) == false)
            return false;
        if (other.getIsOptional() == null ^ this.getIsOptional() == null)
            return false;
        if (other.getIsOptional() != null && other.getIsOptional().equals(this.getIsOptional()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFieldType() == null) ? 0 : getFieldType().hashCode());
        hashCode = prime * hashCode + ((getIsEditable() == null) ? 0 : getIsEditable().hashCode());
        hashCode = prime * hashCode + ((getIsOptional() == null) ? 0 : getIsOptional().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        return hashCode;
    }

    @Override
    public CustomParameter clone() {
        try {
            return (CustomParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.CustomParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
