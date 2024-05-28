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
 * A decimal parameter for a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DecimalDatasetParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecimalDatasetParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for the decimal parameter created in the dataset.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the decimal parameter that is created in the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value type of the dataset parameter. Valid values are <code>single value</code> or <code>multi value</code>.
     * </p>
     */
    private String valueType;
    /**
     * <p>
     * A list of default values for a given decimal parameter. This structure only accepts static values.
     * </p>
     */
    private DecimalDatasetParameterDefaultValues defaultValues;

    /**
     * <p>
     * An identifier for the decimal parameter created in the dataset.
     * </p>
     * 
     * @param id
     *        An identifier for the decimal parameter created in the dataset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for the decimal parameter created in the dataset.
     * </p>
     * 
     * @return An identifier for the decimal parameter created in the dataset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An identifier for the decimal parameter created in the dataset.
     * </p>
     * 
     * @param id
     *        An identifier for the decimal parameter created in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalDatasetParameter withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the decimal parameter that is created in the dataset.
     * </p>
     * 
     * @param name
     *        The name of the decimal parameter that is created in the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the decimal parameter that is created in the dataset.
     * </p>
     * 
     * @return The name of the decimal parameter that is created in the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the decimal parameter that is created in the dataset.
     * </p>
     * 
     * @param name
     *        The name of the decimal parameter that is created in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalDatasetParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value type of the dataset parameter. Valid values are <code>single value</code> or <code>multi value</code>.
     * </p>
     * 
     * @param valueType
     *        The value type of the dataset parameter. Valid values are <code>single value</code> or
     *        <code>multi value</code>.
     * @see DatasetParameterValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The value type of the dataset parameter. Valid values are <code>single value</code> or <code>multi value</code>.
     * </p>
     * 
     * @return The value type of the dataset parameter. Valid values are <code>single value</code> or
     *         <code>multi value</code>.
     * @see DatasetParameterValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * The value type of the dataset parameter. Valid values are <code>single value</code> or <code>multi value</code>.
     * </p>
     * 
     * @param valueType
     *        The value type of the dataset parameter. Valid values are <code>single value</code> or
     *        <code>multi value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetParameterValueType
     */

    public DecimalDatasetParameter withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * The value type of the dataset parameter. Valid values are <code>single value</code> or <code>multi value</code>.
     * </p>
     * 
     * @param valueType
     *        The value type of the dataset parameter. Valid values are <code>single value</code> or
     *        <code>multi value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetParameterValueType
     */

    public DecimalDatasetParameter withValueType(DatasetParameterValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * <p>
     * A list of default values for a given decimal parameter. This structure only accepts static values.
     * </p>
     * 
     * @param defaultValues
     *        A list of default values for a given decimal parameter. This structure only accepts static values.
     */

    public void setDefaultValues(DecimalDatasetParameterDefaultValues defaultValues) {
        this.defaultValues = defaultValues;
    }

    /**
     * <p>
     * A list of default values for a given decimal parameter. This structure only accepts static values.
     * </p>
     * 
     * @return A list of default values for a given decimal parameter. This structure only accepts static values.
     */

    public DecimalDatasetParameterDefaultValues getDefaultValues() {
        return this.defaultValues;
    }

    /**
     * <p>
     * A list of default values for a given decimal parameter. This structure only accepts static values.
     * </p>
     * 
     * @param defaultValues
     *        A list of default values for a given decimal parameter. This structure only accepts static values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalDatasetParameter withDefaultValues(DecimalDatasetParameterDefaultValues defaultValues) {
        setDefaultValues(defaultValues);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType()).append(",");
        if (getDefaultValues() != null)
            sb.append("DefaultValues: ").append(getDefaultValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecimalDatasetParameter == false)
            return false;
        DecimalDatasetParameter other = (DecimalDatasetParameter) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        if (other.getDefaultValues() == null ^ this.getDefaultValues() == null)
            return false;
        if (other.getDefaultValues() != null && other.getDefaultValues().equals(this.getDefaultValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getDefaultValues() == null) ? 0 : getDefaultValues().hashCode());
        return hashCode;
    }

    @Override
    public DecimalDatasetParameter clone() {
        try {
            return (DecimalDatasetParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DecimalDatasetParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
