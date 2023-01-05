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
 * A parameter declaration for the <code>Integer</code> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/IntegerParameterDeclaration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegerParameterDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value type determines whether the parameter is a single-value or multi-value parameter.
     * </p>
     */
    private String parameterValueType;
    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     */
    private IntegerDefaultValues defaultValues;
    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     */
    private IntegerValueWhenUnsetConfiguration valueWhenUnset;

    /**
     * <p>
     * The value type determines whether the parameter is a single-value or multi-value parameter.
     * </p>
     * 
     * @param parameterValueType
     *        The value type determines whether the parameter is a single-value or multi-value parameter.
     * @see ParameterValueType
     */

    public void setParameterValueType(String parameterValueType) {
        this.parameterValueType = parameterValueType;
    }

    /**
     * <p>
     * The value type determines whether the parameter is a single-value or multi-value parameter.
     * </p>
     * 
     * @return The value type determines whether the parameter is a single-value or multi-value parameter.
     * @see ParameterValueType
     */

    public String getParameterValueType() {
        return this.parameterValueType;
    }

    /**
     * <p>
     * The value type determines whether the parameter is a single-value or multi-value parameter.
     * </p>
     * 
     * @param parameterValueType
     *        The value type determines whether the parameter is a single-value or multi-value parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterValueType
     */

    public IntegerParameterDeclaration withParameterValueType(String parameterValueType) {
        setParameterValueType(parameterValueType);
        return this;
    }

    /**
     * <p>
     * The value type determines whether the parameter is a single-value or multi-value parameter.
     * </p>
     * 
     * @param parameterValueType
     *        The value type determines whether the parameter is a single-value or multi-value parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterValueType
     */

    public IntegerParameterDeclaration withParameterValueType(ParameterValueType parameterValueType) {
        this.parameterValueType = parameterValueType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     * 
     * @param name
     *        The name of the parameter that is being declared.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     * 
     * @return The name of the parameter that is being declared.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter that is being declared.
     * </p>
     * 
     * @param name
     *        The name of the parameter that is being declared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     * 
     * @param defaultValues
     *        The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default
     *        value can be provided.
     */

    public void setDefaultValues(IntegerDefaultValues defaultValues) {
        this.defaultValues = defaultValues;
    }

    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     * 
     * @return The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default
     *         value can be provided.
     */

    public IntegerDefaultValues getDefaultValues() {
        return this.defaultValues;
    }

    /**
     * <p>
     * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value
     * can be provided.
     * </p>
     * 
     * @param defaultValues
     *        The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default
     *        value can be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterDeclaration withDefaultValues(IntegerDefaultValues defaultValues) {
        setDefaultValues(defaultValues);
        return this;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     * 
     * @param valueWhenUnset
     *        A parameter declaration for the <code>Integer</code> data type.
     */

    public void setValueWhenUnset(IntegerValueWhenUnsetConfiguration valueWhenUnset) {
        this.valueWhenUnset = valueWhenUnset;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     * 
     * @return A parameter declaration for the <code>Integer</code> data type.
     */

    public IntegerValueWhenUnsetConfiguration getValueWhenUnset() {
        return this.valueWhenUnset;
    }

    /**
     * <p>
     * A parameter declaration for the <code>Integer</code> data type.
     * </p>
     * 
     * @param valueWhenUnset
     *        A parameter declaration for the <code>Integer</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterDeclaration withValueWhenUnset(IntegerValueWhenUnsetConfiguration valueWhenUnset) {
        setValueWhenUnset(valueWhenUnset);
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
        if (getParameterValueType() != null)
            sb.append("ParameterValueType: ").append(getParameterValueType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultValues() != null)
            sb.append("DefaultValues: ").append(getDefaultValues()).append(",");
        if (getValueWhenUnset() != null)
            sb.append("ValueWhenUnset: ").append(getValueWhenUnset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegerParameterDeclaration == false)
            return false;
        IntegerParameterDeclaration other = (IntegerParameterDeclaration) obj;
        if (other.getParameterValueType() == null ^ this.getParameterValueType() == null)
            return false;
        if (other.getParameterValueType() != null && other.getParameterValueType().equals(this.getParameterValueType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultValues() == null ^ this.getDefaultValues() == null)
            return false;
        if (other.getDefaultValues() != null && other.getDefaultValues().equals(this.getDefaultValues()) == false)
            return false;
        if (other.getValueWhenUnset() == null ^ this.getValueWhenUnset() == null)
            return false;
        if (other.getValueWhenUnset() != null && other.getValueWhenUnset().equals(this.getValueWhenUnset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterValueType() == null) ? 0 : getParameterValueType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultValues() == null) ? 0 : getDefaultValues().hashCode());
        hashCode = prime * hashCode + ((getValueWhenUnset() == null) ? 0 : getValueWhenUnset().hashCode());
        return hashCode;
    }

    @Override
    public IntegerParameterDeclaration clone() {
        try {
            return (IntegerParameterDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.IntegerParameterDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
