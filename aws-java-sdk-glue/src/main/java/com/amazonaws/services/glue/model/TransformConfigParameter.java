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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the parameters in the config file of the dynamic transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TransformConfigParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformConfigParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name of the parameter in the config file of the dynamic transform.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the parameter type in the config file of the dynamic transform.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the validation rule in the config file of the dynamic transform.
     * </p>
     */
    private String validationRule;
    /**
     * <p>
     * Specifies the validation message in the config file of the dynamic transform.
     * </p>
     */
    private String validationMessage;
    /**
     * <p>
     * Specifies the value of the parameter in the config file of the dynamic transform.
     * </p>
     */
    private java.util.List<String> value;
    /**
     * <p>
     * Specifies the list type of the parameter in the config file of the dynamic transform.
     * </p>
     */
    private String listType;
    /**
     * <p>
     * Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     * </p>
     */
    private Boolean isOptional;

    /**
     * <p>
     * Specifies the name of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param name
     *        Specifies the name of the parameter in the config file of the dynamic transform.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies the name of the parameter in the config file of the dynamic transform.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param name
     *        Specifies the name of the parameter in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformConfigParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the parameter type in the config file of the dynamic transform.
     * </p>
     * 
     * @param type
     *        Specifies the parameter type in the config file of the dynamic transform.
     * @see ParamType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the parameter type in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies the parameter type in the config file of the dynamic transform.
     * @see ParamType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the parameter type in the config file of the dynamic transform.
     * </p>
     * 
     * @param type
     *        Specifies the parameter type in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParamType
     */

    public TransformConfigParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the parameter type in the config file of the dynamic transform.
     * </p>
     * 
     * @param type
     *        Specifies the parameter type in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParamType
     */

    public TransformConfigParameter withType(ParamType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the validation rule in the config file of the dynamic transform.
     * </p>
     * 
     * @param validationRule
     *        Specifies the validation rule in the config file of the dynamic transform.
     */

    public void setValidationRule(String validationRule) {
        this.validationRule = validationRule;
    }

    /**
     * <p>
     * Specifies the validation rule in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies the validation rule in the config file of the dynamic transform.
     */

    public String getValidationRule() {
        return this.validationRule;
    }

    /**
     * <p>
     * Specifies the validation rule in the config file of the dynamic transform.
     * </p>
     * 
     * @param validationRule
     *        Specifies the validation rule in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformConfigParameter withValidationRule(String validationRule) {
        setValidationRule(validationRule);
        return this;
    }

    /**
     * <p>
     * Specifies the validation message in the config file of the dynamic transform.
     * </p>
     * 
     * @param validationMessage
     *        Specifies the validation message in the config file of the dynamic transform.
     */

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    /**
     * <p>
     * Specifies the validation message in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies the validation message in the config file of the dynamic transform.
     */

    public String getValidationMessage() {
        return this.validationMessage;
    }

    /**
     * <p>
     * Specifies the validation message in the config file of the dynamic transform.
     * </p>
     * 
     * @param validationMessage
     *        Specifies the validation message in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformConfigParameter withValidationMessage(String validationMessage) {
        setValidationMessage(validationMessage);
        return this;
    }

    /**
     * <p>
     * Specifies the value of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies the value of the parameter in the config file of the dynamic transform.
     */

    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * <p>
     * Specifies the value of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param value
     *        Specifies the value of the parameter in the config file of the dynamic transform.
     */

    public void setValue(java.util.Collection<String> value) {
        if (value == null) {
            this.value = null;
            return;
        }

        this.value = new java.util.ArrayList<String>(value);
    }

    /**
     * <p>
     * Specifies the value of the parameter in the config file of the dynamic transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValue(java.util.Collection)} or {@link #withValue(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param value
     *        Specifies the value of the parameter in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformConfigParameter withValue(String... value) {
        if (this.value == null) {
            setValue(new java.util.ArrayList<String>(value.length));
        }
        for (String ele : value) {
            this.value.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the value of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param value
     *        Specifies the value of the parameter in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformConfigParameter withValue(java.util.Collection<String> value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specifies the list type of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param listType
     *        Specifies the list type of the parameter in the config file of the dynamic transform.
     * @see ParamType
     */

    public void setListType(String listType) {
        this.listType = listType;
    }

    /**
     * <p>
     * Specifies the list type of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies the list type of the parameter in the config file of the dynamic transform.
     * @see ParamType
     */

    public String getListType() {
        return this.listType;
    }

    /**
     * <p>
     * Specifies the list type of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param listType
     *        Specifies the list type of the parameter in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParamType
     */

    public TransformConfigParameter withListType(String listType) {
        setListType(listType);
        return this;
    }

    /**
     * <p>
     * Specifies the list type of the parameter in the config file of the dynamic transform.
     * </p>
     * 
     * @param listType
     *        Specifies the list type of the parameter in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParamType
     */

    public TransformConfigParameter withListType(ParamType listType) {
        this.listType = listType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     * </p>
     * 
     * @param isOptional
     *        Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     */

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }

    /**
     * <p>
     * Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     */

    public Boolean getIsOptional() {
        return this.isOptional;
    }

    /**
     * <p>
     * Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     * </p>
     * 
     * @param isOptional
     *        Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformConfigParameter withIsOptional(Boolean isOptional) {
        setIsOptional(isOptional);
        return this;
    }

    /**
     * <p>
     * Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     * </p>
     * 
     * @return Specifies whether the parameter is optional or not in the config file of the dynamic transform.
     */

    public Boolean isOptional() {
        return this.isOptional;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValidationRule() != null)
            sb.append("ValidationRule: ").append(getValidationRule()).append(",");
        if (getValidationMessage() != null)
            sb.append("ValidationMessage: ").append(getValidationMessage()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getListType() != null)
            sb.append("ListType: ").append(getListType()).append(",");
        if (getIsOptional() != null)
            sb.append("IsOptional: ").append(getIsOptional());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformConfigParameter == false)
            return false;
        TransformConfigParameter other = (TransformConfigParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValidationRule() == null ^ this.getValidationRule() == null)
            return false;
        if (other.getValidationRule() != null && other.getValidationRule().equals(this.getValidationRule()) == false)
            return false;
        if (other.getValidationMessage() == null ^ this.getValidationMessage() == null)
            return false;
        if (other.getValidationMessage() != null && other.getValidationMessage().equals(this.getValidationMessage()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getListType() == null ^ this.getListType() == null)
            return false;
        if (other.getListType() != null && other.getListType().equals(this.getListType()) == false)
            return false;
        if (other.getIsOptional() == null ^ this.getIsOptional() == null)
            return false;
        if (other.getIsOptional() != null && other.getIsOptional().equals(this.getIsOptional()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidationRule() == null) ? 0 : getValidationRule().hashCode());
        hashCode = prime * hashCode + ((getValidationMessage() == null) ? 0 : getValidationMessage().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getListType() == null) ? 0 : getListType().hashCode());
        hashCode = prime * hashCode + ((getIsOptional() == null) ? 0 : getIsOptional().hashCode());
        return hashCode;
    }

    @Override
    public TransformConfigParameter clone() {
        try {
            return (TransformConfigParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TransformConfigParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
